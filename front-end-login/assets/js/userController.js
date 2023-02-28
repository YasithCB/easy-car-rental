let baseURL = "http://localhost:8080/easy_car_rent/"

$("#btnSaveUser").click(function () {
    saveUser()
})

function saveUser() {
    let data = new FormData();

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

    $.ajax({
        url: baseURL + "customer",
        method: "post",
        async: true,
        contentType: false,
        processData: false,
        data: data,
        success() {
            // window.location = "LoginPage.html"
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
                console.log(user.password , " ", password)

                if (user.isApproved === false && user.userName.toLowerCase() === userName) {

                    if (user.password === password) {
                        window.location = "../../../front-end-user/index.html"
                    }else {
                        text = "pw0";
                    }
                }else {
                    text = "user0"
                }
            }

            if (text === "user0"){
                alert("No such user found")
            }else if (text === "pw0"){
                alert("Incorrect password!")
            }
        }
    });
})