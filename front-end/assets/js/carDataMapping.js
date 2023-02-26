let baseURL = "http://localhost:8080/easy_car_rent/"

$.ajax({
    url: baseURL + "car",
    dataType: "json",
    success: function (resp) {
        $("#tblBookedCars").empty();
        $("#tblAvailableCars").empty();
        console.log(resp)
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
