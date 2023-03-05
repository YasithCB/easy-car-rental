let baseURL = "http://localhost:8080/easy_car_rent/"

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