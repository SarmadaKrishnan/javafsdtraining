/**
 * 
 */
var txt="";
function message(){
	try{
		addalert("welcome guest!");
	}
	catch(err){
		txt="error";
		txt+="click on";
		txt+="or cancel";
		if(!confirm(txt)){
			document.location.href="https://www.w3schools.com/";
		}
	}
}