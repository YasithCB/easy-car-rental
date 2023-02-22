
/*dashboard 1st row*/

$("#lblTodayMoneyOnDashboard").text(0);

$.ajax({
    url: baseURL+"customer?id=" + id + "",
    method: "delete",
    dataType:"json",
    success: function (resp) {
        alert(resp.message);
        loadAllCustomers();
    },
    error:function (error){
        alert(JSON.parse(error.responseText).message);
    }
});

/*dashboard 1st row*/