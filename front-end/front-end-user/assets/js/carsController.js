
let selectedCar

$("#reserveCarMain").css("display", "none")

loadCars();

function loadCars() {
    $.ajax({
        url: baseURL + "car",
        dataType: "json",
        success: function (resp) {
            let carId = 0;

            let generalCount = 0
            let premiumCount = 0
            let luxuryCount = 0
            for (let car of resp.data) {
                carId = car.id

                if (car.isAvailable === true) {
                    let listItem = `<li><div class=\"featured-car-card\"><figure class=\"card-banner\"><img src= \"${car.imageFront}\" alt=\"car-image\" loading=\"lazy\" width=\"440\" height=\"300\"class=\"w-100\"></figure><div class=\"card-content\"><div class=\"card-title-wrapper\"><h6 class=\"h6 card-title\"><a href=\"#\"> ${car.brand} </a></h6><data class=\"year\" value=\"2021\"> ${car.yom} </data></div><ul class=\"card-list\"><li class=\"card-list-item\"><ion-icon name=\"color-palette-outline\"></ion-icon><span class=\"card-item-text\"> ${car.color} </span></li><li class=\"card-list-item\"><ion-icon name=\"flash-outline\"></ion-icon><span class=\"card-item-text\"> ${car.fuelType} </span></li><li class=\"card-list-item\"><ion-icon name=\"speedometer-outline\"></ion-icon><span class=\"card-item-text\"> ${car.kmPerLitre} km / 1-litre</span></li><li class=\"card-list-item\"><ion-icon name=\"hardware-chip-outline\"></ion-icon><span class=\"card-item-text\"> ${car.transmissionType} </span> </li> <li class=\"card-list-item\"><ion-icon name=\"cash-outline\"></ion-icon><span class=\"card-item-text\"> ${car.monthlyRate}/month</span> <li class=\"card-list-item\"><ion-icon name=\"leaf-outline\"></ion-icon><span class=\"card-item-text\"> ${car.freeMileage}km/free </span> <li class=\"card-list-item\"><ion-icon name=\"card-outline\"></ion-icon><span class=\"card-item-text\"> ${car.chargeForExtraKm}/extra Km</span> </li></ul><div class=\"card-price-wrapper\"><p class=\"card-price\"><strong> ${car.dailyRate} LKR</strong> / Day</p><button class=\"btn fav-btn\" aria-label=\"Add to favourite list\"><ion-icon name=\"heart-outline\"></ion-icon></button><button id= \"${carId}\" class=\"btn btn-primary rentNowOnCard\" onClick=\"rentNowClick(this.id)\">Rent now</button></div></div></div></li>`

                    if (car.carType.toLowerCase() === "general" && generalCount < 3) {
                        generalCount++
                        $("#generalCars").append(listItem);
                    } else if (car.carType.toLowerCase() === "premium" && premiumCount < 3) {
                        premiumCount++
                        $("#premiumCars").append(listItem);
                    } else if (car.carType.toLowerCase() === "luxury" && luxuryCount < 3) {
                        luxuryCount++
                        $("#luxuryCars").append(listItem);
                    }
                }
            }
        },
        error: function (error) {
            alert(JSON.parse(error.responseText).message);
        }
    });
}

function updateSelectedCar(id){
    $.ajax({
        url: baseURL + "car/byId?id=" + id + "",
        dataType: "json",
        success: function (resp) {
            selectedCar = resp.data
        },
        error: function (error) {
            alert("Something went wrong");
        }
    });
}

function rentNowClick(carId) {
    /*if(!isUserLogged){
        alert('You Must Login First')
        window.location = "../front-end-login/login.html";
    }else {
        // if user logged
        updateSelectedCar(carId);

        setTimeout(()=> {
            let carCard = `<li><div class=\"featured-car-card\"><figure class=\"card-banner\"><img src= \"${selectedCar.imageFront}\" alt=\"car-image\" loading=\"lazy\" width=\"440\" height=\"300\"class=\"w-100\"></figure><div class=\"card-content\"><div class=\"card-title-wrapper\"><h3 class=\"h3 card-title\"><a href=\"#\"> ${selectedCar.brand} </a></h3><data class=\"year\" value=\"2021\"> ${selectedCar.yom} </data></div><ul class=\"card-list\"><li class=\"card-list-item\"><ion-icon name=\"color-palette-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.color} </span></span></li><li class=\"card-list-item\"><ion-icon name=\"flash-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.fuelType} </span></li><li class=\"card-list-item\"><ion-icon name=\"speedometer-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.kmPerLitre}km / 1-litre</span></li><li class=\"card-list-item\"><ion-icon name=\"hardware-chip-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.transmissionType} </span> </li> <li class=\"card-list-item\"><ion-icon name=\"cash-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.monthlyRate}/month</span> <li class=\"card-list-item\"><ion-icon name=\"leaf-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.freeMileage}km/free</span> <li class=\"card-list-item\"><ion-icon name=\"card-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.chargeForExtraKm}/extra Km</span> </li></ul><div class=\"card-price-wrapper\"><p class=\"card-price\"><strong> ${selectedCar.dailyRate}LKR</strong> / Day</p></div></div></div></li>`
            $("#reserveCarCard").append(carCard);

            setLossDamageValue()

            $("#reserveCarMain").css("display", "block")
            $("#indexMain").css("display", "none")
            window.scrollTo(0, 0)
        },200)
    }*/

    // if user logged
    updateSelectedCar(carId);

    setTimeout(()=> {
        let carCard = `<li><div class=\"featured-car-card\"><figure class=\"card-banner\"><img src= \"${selectedCar.imageFront}\" alt=\"car-image\" loading=\"lazy\" width=\"440\" height=\"300\"class=\"w-100\"></figure><div class=\"card-content\"><div class=\"card-title-wrapper\"><h3 class=\"h3 card-title\"><a href=\"#\"> ${selectedCar.brand} </a></h3><data class=\"year\" value=\"2021\"> ${selectedCar.yom} </data></div><ul class=\"card-list\"><li class=\"card-list-item\"><ion-icon name=\"color-palette-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.color} </span></span></li><li class=\"card-list-item\"><ion-icon name=\"flash-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.fuelType} </span></li><li class=\"card-list-item\"><ion-icon name=\"speedometer-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.kmPerLitre}km / 1-litre</span></li><li class=\"card-list-item\"><ion-icon name=\"hardware-chip-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.transmissionType} </span> </li> <li class=\"card-list-item\"><ion-icon name=\"cash-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.monthlyRate}/month</span> <li class=\"card-list-item\"><ion-icon name=\"leaf-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.freeMileage}km/free</span> <li class=\"card-list-item\"><ion-icon name=\"card-outline\"></ion-icon><span class=\"card-item-text\"> ${selectedCar.chargeForExtraKm}/extra Km</span> </li></ul><div class=\"card-price-wrapper\"><p class=\"card-price\"><strong> ${selectedCar.dailyRate}LKR</strong> / Day</p></div></div></div></li>`
        $("#reserveCarCard").append(carCard);

        setLossDamageValue()

        $("#reserveCarMain").css("display", "block")
        $("#indexMain").css("display", "none")
        window.scrollTo(0, 0)
    },500)
}

function setLossDamageValue() {
    let value = 0

    if (selectedCar.carType.toLowerCase() === 'general') {
        value = 10000
    } else if (selectedCar.carType.toLowerCase() === 'premium') {
        value = 15000
    } else {
        value = 20000
    }

    $('#lossDamagePaymentValue').text('Loss Damage Payment  :  ' + value);
}

