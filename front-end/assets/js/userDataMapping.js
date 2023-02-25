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
            }else {
                let row = '<tr><td><p class="text-sm text-center font-weight-bold mb-0">' + user.userName + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + user.contact + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + user.nicNo + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + user.drivingLicenseNo + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + user.email + '</p></td></tr>';
                $("#tblRegisteredUsers").append(row);
            }
        }
    },
    error: function (error) {
        alert(JSON.parse(error.responseText).message);
    }
});
