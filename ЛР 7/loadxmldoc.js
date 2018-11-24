function loadXMLDoc(dname)
{
if (window.XMLHttpRequest)
 {
 var xhttp=new XMLHttpRequest();
 }
else
 {

 }


xhttp.send();
return xhttp.responseXML;
}