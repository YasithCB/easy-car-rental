let baseURL = "http://localhost:8080/easy_car_rent/"

$.ajax({
    url: baseURL + "car",
    dataType: "json",
    success: function (resp) {
        $("#tblBookedCars").empty();
        $("#tblAvailableCars").empty();
        for (let car of resp.data) {
            if (car.isAvailable === false) {
                let row = '<tr><td><p class="text-sm text-center font-weight-bold mb-0">' + car.brand + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + car.regNo + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + car.carType + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + car.color + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + car.fuelType + '</p></td> <td><p class="text-sm text-center font-weight-bold mb-0">' + car.transmissionType + '</p></td> <td><p class="text-sm text-center font-weight-bold mb-0">' +  + '</p></td> </tr>';
                $("#tblBookedCars").append(row);
            }else {
                let row = '<tr><td><p class="text-sm text-center font-weight-bold mb-0">' + car.brand + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + car.regNo + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + car.carType + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + car.color + '</p></td><td><p class="text-sm text-center font-weight-bold mb-0">' + car.fuelType + '</p></td> <td><p class="text-sm text-center font-weight-bold mb-0">' + car.transmissionType + '</p></td> </tr>';
                $("#tblAvailableCars").append(row);
            }
        }
    },
    error: function (error) {
        alert(JSON.parse(error.responseText).message);
    }
});

function clearFields() {
    $("#regNo").val("")
    $("#brand").val("")
    $("#color").val("")
    $("#imageFront").val("")
    $("#imageBack").val("")
    $("#imageSide").val("")
    $("#imageInterior").val("")
    $("#transmissionType").val("")
    $("#fuelType").val("")
    $("#carType").val("")
    $("#freeMileage").val("")
    $("#chargeForExtraKm").val("")
    $("#dailyRate").val("")
    $("#monthlyRate").val("")
    $("#yom").val("")
    $("#kmPerLitre").val("")
}


$("#btnSaveCar").click(function () {

    let car = {
        regNo: $("#regNo").val(),
        brand: $("#brand").val(),
        color: $("#color").val(),
        imageFront: $("#imageFront").val(),
        imageBack: $("#imageBack").val(),
        imageSide: $("#imageSide").val(),
        imageInterior: $("#imageInterior").val(),
        isAvailable: true,
        availableDate: "",
        transmissionType: $("#transmissionType").val(),
        fuelType: $("#fuelType").val(),
        carType: $("#carType").val(),
        freeMileage: $("#freeMileage").val(),
        chargeForExtraKm: $("#chargeForExtraKm").val(),
        dailyRate: $("#dailyRate").val(),
        monthlyRate: $("#monthlyRate").val(),
        yom: $("#yom").val(),
        kmPerLitre: $("#kmPerLitre").val()
    }

    $.ajax({
        url: baseURL + "car",
        method: 'post',
        contentType: "application/json",
        data: JSON.stringify(car),
        dataType: "json",
        success() {
            alert("Car Saved");
        }
    });


    clearFields();

})
