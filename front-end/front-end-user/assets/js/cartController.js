
loadCartItems()

function loadCartItems() {
    $.ajax({
        url: baseURL + "reservation",
        dataType: "json",
        success: function (resp) {
            for (let reservation of resp.data) {
                updateSelectedCar(reservation.carId)
                setTimeout(() => {
                    let row = `<tr>
                                  <td class="text-secondary text-center opacity-9"> ${reservation.carId} </td>
                                  <td class="text-secondary text-center opacity-9"> ${reservation.driverId} </td>
                                  <td class="text-secondary text-center opacity-9"> ${selectedCar.brand} </td>
                                  <td class="text-secondary text-center opacity-9"> 2 </td>
                                  <td class="text-secondary text-center opacity-9"> 7500 </td>
                                  <td><button class="btn btn-danger py-0 my-0">Remove</button></td>
                                </tr>`;
                    $('#tblCart').append(row)
                }, 500);

            }
        },
        error: function () {
            alert('Something went wrong');
        }
    });
}