let baseURL = "http://localhost:8080/easy_car_rent/"

$("#btnSaveUser").click(function (){
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

    data.append("files",nicImageFront);
    data.append("files",nicImageBack);
    data.append("files",drivingImageFront);
    data.append("files",nicImageBack);
    data.append("user",new Blob([JSON.stringify(user)],{type:"application/json"}))

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