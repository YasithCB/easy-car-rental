
$("#btnSaveDriver").click(function () {
    saveDriver();
})

function saveDriver() {
    let driver = {
        name: $("#driverNameReg").val(),
        password: $("#driverPasswordReg").val(),
        contact: $("#driverContact").val(),
        email: $("#driverEmail").val(),
        address: $("#driverAddress").val()
    }

    $.ajax({
        url: baseURL + "driver",
        method: 'post',
        contentType: "application/json",
        data: JSON.stringify(driver),
        dataType: "json",
        success() {
            alert("Driver Saved");
            location.reload();
        }
    });
}

$("#btnDriverLogin").click(function () {

    let driverName = $("#driverName").val().toLowerCase();
    let password = $("#driverPassword").val();

    $.ajax({
        url: baseURL + "driver",
        dataType: "json",
        success: function (resp) {
            let text = "";
            for (let driver of resp.data) {
                if (/*user.isApproved === true &&*/ driver.name.toLowerCase() === driverName) {
                    text = "nameOk"
                    if (driver.password === password) {
                        window.location = "../../../front-end-user/index.html"
                        return
                    }
                }
            }

            if (text === "nameOk") {
                alert("Incorrect password!")
                text = ""
            } else {
                alert("No such user found")
                text = ""
            }
        }
    });
})