$('#btnAddCarToCart').click(function () {
    reserveCar()
})

function reserveCar(){
    let reservation = {
        reserveId : "1",
        carId : selectedCar.id.toString(),
        driverId : "234",
        pickupDate: $("#pickupDate").val(),
        pickupLocation: $("#pickupLocation").val(),
        finishDate: $("#finishDate").val(),
        finishLocation: $("#finishLocation").val(),
        lossDamageSlip : $('#lossDamageSlip').val(),
        reserveDate : new Date(),
        userId : "1"
    }
    currentReservationId = reservation.reserveId;
    $.ajax({
        url: baseURL + "reservation",
        method: 'post',
        contentType: "application/json",
        data: JSON.stringify(reservation),
        dataType: "json",
        success() {
            alert("Car reservation request sent!")
            location.reload();
            window.scrollTo(0, 0)
        }
    });
}