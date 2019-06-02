$(document).ready(function() {
    $.ajax({
        url:" http://localhost:9000/Products"
    }).then(function(data) {
      // $('.products').append(data.name);
      // $('.productprice').append(data.content);
   console.log();
    });
});