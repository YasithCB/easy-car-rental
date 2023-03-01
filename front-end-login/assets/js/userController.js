
$("#btnSaveUser").click(function () {
    saveUser()
})

function saveUser() {
    /*let data = new FormData();

    let nicImageFront = $("#nicImageFront")[0].files[0];
    let nicImageBack = $("#nicImageBack")[0].files[0];
    let drivingImageFront = $("#drivingImageFront")[0].files[0];
    let drivingImageBack = $("#drivingImageBack")[0].files[0];

    let user = {
        "userName": $("#userNameReg").val(),
        "password": $("#passwordReg").val(),
        "email": $("#email").val(),
        "contact": $("#contact").val(),
        "nicNo": $("#nic").val(),
        "nicImageFront": nicImageFront,
        "nicImageBack": nicImageBack,
        "drivingLicenseNo": $("#drivingLicense").val(),
        "drivingLicenseImageFront": drivingImageFront,
        "drivingLicenseImageBack": drivingImageBack,
        "date": "",
        "isApproved": "false"
    }

    data.append("files", nicImageFront);
    data.append("files", nicImageBack);
    data.append("files", drivingImageFront);
    data.append("files", nicImageBack);
    data.append("user", new Blob([JSON.stringify(user)], {type: "application/json"}))
*/
    let user = {
        userName: $("#userNameReg").val(),
        password: $("#passwordReg").val(),
        email: $("#email").val(),
        contact: $("#contact").val(),
        nicNo: $("#nic").val(),
        nicImageFront: $("#nicImageFront").val(),
        nicImageBack: $("#nicImageBack").val(),
        drivingLicenseNo: $("#drivingLicense").val(),
        drivingLicenseImageFront: $("#drivingImageFront").val(),
        drivingLicenseImageBack: $("#drivingImageBack").val(),
        date: "",
        isApproved: false
    }

    $.ajax({
        url: baseURL + "user",
        method: 'post',
        contentType: "application/json",
        data: JSON.stringify(user),
        dataType: "json",
        success() {
            alert("User Saved");
            location.reload();
        }
    });
}

$("#btnUserLogin").click(function () {

    let userName = $("#userName").val().toLowerCase();
    let password = $("#password").val();

    $.ajax({
        url: baseURL + "user",
        dataType: "json",
        success: function (resp) {
            let text;

            for (let user of resp.data) {
                if (/*user.isApproved === false &&*/ user.userName.toLowerCase() === userName) {
                    text = "nameOk"
                    if (user.password === password) {
                        text = "pwOk"
                        window.location = "../../../front-end-user/index.html"

                        fetch("../../../front-end-user/index.html")
                            .then(response => response.text())
                            .then(data => {
                                // Manipulate the DOM here
                                document.getElementById('myElement').innerHTML = data;
                            });

                    }
                }
            }

            if (text !== "pwOk") {
                alert("Incorrect password!")
            } else if (text === "nameOk") {
                alert("No such user found")
            }
        }
    });
})