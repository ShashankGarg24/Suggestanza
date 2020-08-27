<%@ page import = "java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Suggestaza.com</title>
<style>

body {
background-color: rgba(113, 150, 201, 0.3);
}
h1 {
 background-color:rgba(125, 146, 246, 0.5);
 padding: 20px;
 }
 
 footer {
background-color: rgba(125, 146, 246, 0.6);
margin-top: 50px;
height: 100px;
}

footer div {
line-height: 0.2;
font-size: 80%;
padding: 0 .5%;
}


ul {
list-style-type: none;
}
.fa {

  padding: 20px;
  font-size: 20px;
  width: 20px;
  text-align: center;
  text-decoration: none;
  margin: 5px 2px;
 }
 
.fa:hover {
    opacity: 0.7;
}

.fa-facebook {
  background: #3B5998;
  color: white;
}
.fa-linkedin {
  background: #007bb5;
  color: white;
}
.fa-instagram {
  background: #125688;
  color: white;
}
.fa-twitter {
  background: #55ACEE;
  color: white;
}


#info li {
float: right;
}

img {
float: left;
width: 130px;
height: 100px;
padding: 10px;
margin: 5px;
}
</style>

</head>
<body>
<h1 align =center> Recommendation Page </h1>
<p>

<% 
	String fName = (String)request.getAttribute("fName");
	String lName = (String)request.getAttribute("lName");
	ArrayList<String> suggestionsForShoes = (ArrayList<String>)request.getAttribute("list1");
	ArrayList<String> suggestionsForWatches = (ArrayList<String>)request.getAttribute("list2");
	
	Iterator<String> it1 = suggestionsForShoes.iterator();
	Iterator<String> it2 = suggestionsForWatches.iterator();
	
	out.println("<em><strong>Welcome " + fName + " " + lName + "!" + "</strong></em><br><br><br>");
	
	if(!suggestionsForShoes.isEmpty() && suggestionsForWatches.isEmpty())
	{
		while(it1.hasNext())
		{
			out.println(it1.next() + "<br>");
		}
		
		out.println("<br><br><a href=https://amzn.to/30Rv8bv target=_blank>Click here for more options</a><br>");
		
	}
	else if(suggestionsForShoes.isEmpty()  && !suggestionsForWatches.isEmpty())
	{
		while(it2.hasNext())
		{
			out.println(it2.next() + "<br>");
		}
		
		out.println("<br><br><a href=https://amzn.to/3fZX1CU target=_blank>Click here for more options</a><br>");
	}
	else if(!suggestionsForShoes.isEmpty() && !suggestionsForWatches.isEmpty())
	{
		while(it1.hasNext())
		{
			out.println(it1.next() + "<br>");
		}
		
		out.println("<br><br><a href=https://amzn.to/30Rv8bv target=_blank>Click here for more options</a><br>");
				
		while(it2.hasNext())
		{
			out.println(it2.next() + "<br>");
		}
		
	
		out.println("<br><br><a href=https://amzn.to/3fZX1CU target=_blank>Click here for more options</a><br>");
	}
	
	out.println("<br><br><strong><em>Thank you for visiting!</strong></em>");
%>

<div id="info">
<ul>
<li><a href="https://www.instagram.com/shashank_garg_/?hl=en" class="fa fa-instagram" target="_blank"></a></li>
<li><a href="https://bit.ly/2CjPEYW" class="fa fa-linkedin" target="_blank"></a></li>
<li><a href="https://twitter.com/sg24101999" class="fa fa-twitter" target="_blank"></a></li>
<li><a href="https://www.facebook.com/shashank.garg.560" class="fa fa-facebook" target="_blank"></a>
</ul>
</div>
<footer>
<p style="padding: .5%">SUGGESTAZA</p>
<div info="ins">
<p>One stop for:</p>
<p>Shoes recommendations</p>
<p>Wrist-watch recommendations</p>
</div>
</footer>
</body>
	
</html>