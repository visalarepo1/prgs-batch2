$(document).ready(function() {

	$.ajax({
        url: "https://api.openweathermap.org/data/2.5/weather?units=imperial&appid=f967d51335cda3d24ca7f37a82d36454&q=dallas,us"
    }).then(function(data) {
    	
    	
     $('.weatherapi-name').append(data.name);
      $('.weatherapi-temp').append(data.main.temp);
      $('.weatherapi-pressure').append(data.main.pressure);
    });
});
