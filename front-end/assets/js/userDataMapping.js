let baseURL = "http://localhost:8080/easy_car_rent/"

$.ajax({
    url: baseURL + "user",
    dataType: "json",
    success: function (resp) {
        $("#tblPendingUsers").empty();
        $("#tblRegisteredUsers").empty();

        for (let user of resp.data) {
            if (user.approved === false) {
                let row = '<tr><td><p class="text-sm text-center font-weight-bold mb-0">' + user.userName + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + user.contact + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + user.nicNo + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + user.drivingLicenseNo + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + user.email + '</p></td><td><button type="button" class="btn btn-sm btn-success">Approve</button></td></tr>';
                $("#tblPendingUsers").append(row);
            } else {
                let row = '<tr><td><p class="text-sm text-center font-weight-bold mb-0">' + user.userName + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + user.contact + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + user.nicNo + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + user.drivingLicenseNo + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + user.email + '</p></td></tr>';
                $("#tblRegisteredUsers").append(row);
            }
        }
    },
    error: function (error) {
        alert(JSON.parse(error.responseText).message);
    }
});

function saveUser() {

    var data = new FormData;

    let nicFront = $("#nicImageFront")[0].files[0];
    let nicBack = $("#nicImageBack")[0].files[0].name;

    let dlFront = $("#drivingImageFront")[0].files[0].name;
    let dlBack = $("#drivingImageBack")[0].files[0].name;

    var user = {
        "userName": $("#userNameReg").val(),
        "password": $("#passwordReg").val(),
        "email": $("#email").val(),
        "contact": $("#contact").val(),
        "nicNo": $("#nic").val(),
        "nicImageFront": nicFront,
        "nicImageBack": nicBack,
        "drivingLicenseNo": $("#drivingLicense").val(),
        "drivingLicenseImageFront": dlFront,
        "drivingLicenseImageBack": dlBack
    }

    data.append("file", nicFront,nicBack,dlFront,dlBack);
    data.append("driver", new Blob([JSON.stringify(user)], {type: "application/json"}))

    $.ajax({
        url: baseURL + "user",
        method: "post",
        async: true,
        contentType: false,
        processData: false,
        data: data,
        success: function (resp) {
            // swal("Driver Saved", "Done", "success");
            alert("User Saved")
        }
    });
}


$("#btnSaveUser").click(function (){
    console.log("asdas")
    saveUser();
    console.log("asdas")

})
