
let baseURL = "http://localhost:8080/easy_car_rent/"

/*dashboard 1st row*/

$.ajax({
    url: baseURL+"payment",
    dataType:"json",
    success: function (resp) {
        let todayMoney = 0;
        let todayUsersCount = 0;
        for (let payment of resp.data){
            if (payment.date === new Date()){

            }
            console.log(payment.date)
            todayMoney += payment.value;
            todayUsersCount++;
        }
        $("#lblTodayMoneyOnDashboard").text(todayMoney+" LKR");
        $("#lblTodayUsersOnDashboard").text(todayUsersCount);
    },
    error:function (error){
        alert(JSON.parse(error.responseText).message);
    }
});

$.ajax({
    url: baseURL+"user",
    dataType:"json",
    success: function (resp) {
        let todayUsers = 0;
        for (let user of resp.data){
            todayMoney += payment.value;
            console.log(payment.value);
        }
        $("#lblTodayMoneyOnDashboard").text(todayMoney+" LKR");
        console.log(todayMoney);
    },
    error:function (error){
        alert(JSON.parse(error.responseText).message);
    }
});

/*dashboard 1st row*/