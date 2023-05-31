
$.ajax({
    url: baseURL + "reservation_details",
    dataType: "json",
    success: function (resp) {
        $("#tblBookedCars").empty();

        for (let rd of resp.data) {
            let row = '<tr><td><p class="text-sm text-center font-weight-bold mb-0">' + rd.finishDate + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + rd.finishLocation + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + rd.pickupDate + '</p></td> <td><p class="text-sm text-center font-weight-bold mb-0">' + rd.pickupLocation + '</p></td> <td><p class="text-sm text-center font-weight-bold mb-0">' + rd.carId + '</p></td> <td><p class="text-sm text-center font-weight-bold mb-0">' + rd.driverId + '</p></td> <td><p class="text-sm text-center font-weight-bold mb-0">' + rd.reservationId + '</p></td> </tr>';
            $("#tblBookedCars").append(row);
        }
    },
    error: function (error) {
        alert(JSON.parse(error.responseText).message);
    }
});