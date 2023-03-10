$("#btnAddCarToCart").click(function () {


    let reservationDetail = {
        pickupDate: $("#pickupDate").val(),
        pickupLocation: $("#pickupLocation").val(),
        finishDate: $("#finishDate").val(),
        finishLocation: $("#finishLocation").val()
    }

    let reservation = {
        date: "",
        reservationDetailsList: reservationDetail
    }

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


})