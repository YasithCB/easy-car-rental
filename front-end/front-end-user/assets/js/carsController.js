let baseURL = "http://localhost:8080/easy_car_rent/"

$("#reserveCarMain").css("display","none")

$.ajax({
    url: baseURL + "car",
    dataType: "json",
    success: function (resp) {
        for (let car of resp.data) {
            if (car.isAvailable === true) {
                let listItem = "<li><div class=\"featured-car-card\"><figure class=\"card-banner\"><img src=\"./assets/images/car-1.jpg\" alt=\"car-image\" loading=\"lazy\" width=\"440\" height=\"300\"class=\"w-100\"></figure><div class=\"card-content\"><div class=\"card-title-wrapper\"><h3 class=\"h3 card-title\"><a href=\"#\">" + car.brand + "</a></h3><data class=\"year\" value=\"2021\">" + car.yom + "</data></div><ul class=\"card-list\"><li class=\"card-list-item\"><ion-icon name=\"color-palette-outline\"></ion-icon><span class=\"card-item-text\">" + car.color + "</span></li><li class=\"card-list-item\"><ion-icon name=\"flash-outline\"></ion-icon><span class=\"card-item-text\">" + car.fuelType + "</span></li><li class=\"card-list-item\"><ion-icon name=\"speedometer-outline\"></ion-icon><span class=\"card-item-text\"> " + car.kmPerLitre + "km / 1-litre</span></li><li class=\"card-list-item\"><ion-icon name=\"hardware-chip-outline\"></ion-icon><span class=\"card-item-text\">" + car.transmissionType + "</span> </li> <li class=\"card-list-item\"><ion-icon name=\"cash-outline\"></ion-icon><span class=\"card-item-text\">" + car.monthlyRate + "/month</span> <li class=\"card-list-item\"><ion-icon name=\"leaf-outline\"></ion-icon><span class=\"card-item-text\">" + car.freeMileage + "km/free</span> <li class=\"card-list-item\"><ion-icon name=\"card-outline\"></ion-icon><span class=\"card-item-text\">" + car.chargeForExtraKm + "/extra Km</span> </li></ul><div class=\"card-price-wrapper\"><p class=\"card-price\"><strong>" + car.dailyRate + " LKR" + "</strong> / day</p><button class=\"btn fav-btn\" aria-label=\"Add to favourite list\"><ion-icon name=\"heart-outline\"></ion-icon></button><button class=\"btn rentNowOnCard\">Rent now</button></div></div></div></li>"

                if (car.carType.toLowerCase() === "general") {
                    $("#generalCars").append(listItem);
                } else if (car.carType.toLowerCase() === "premium") {
                    $("#premiumCars").append(listItem);
                } else {
                    $("#luxuryCars").append(listItem);
                }
            }
        }
    },
    error: function (error) {
        alert(JSON.parse(error.responseText).message);
    }
});


$(".rentNowOnCard").click(function (){
    console.log("run")
})

