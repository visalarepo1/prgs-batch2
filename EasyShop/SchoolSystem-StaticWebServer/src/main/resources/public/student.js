$(document).ready(function() {
    $.ajax({
        url:" http://localhost:9000/listAllStudents"
    }).then(function(data) {
    	var sa=data;
    	var content=document.getElementById("content");
    	for (var i=0;i<array.length;i++){
    		content.innerHTML+=i+ '--'+array[i]+'<br>'}
    		
       $('.p1.price').append(data.name);
       $('.p1.name').append(data.content);
   
    
});