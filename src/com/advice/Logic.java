package com.advice;

import java.io.*;
import java.util.*;

public class Logic {
	
	public ArrayList<String> suggestionsForShoes(String range)throws IOException
	{
		ArrayList<String> list = new ArrayList<String>();
		if(range.equals("num1"))
		{
			list.add("<img src=images/Shoe1.jpg alt=shoe>");
			list.add("Try out --> Puma Men's Magnum Idp Running Shoes<br>Starting Price: Rs. 954<br>");
			list.add("<a href=https://amzn.to/33SZRH7 target=_blank>Click here to buy.</a><br>");
			list.add("<img src=images/Shoe2.jpg alt=shoe>");
			list.add("Try out --> Lotto Men's Blue/White SCONTO Walking Shoes 10<br>Starting Price: Rs. 999<br>");
			list.add("<a href=https://amzn.to/3fT7xvm target=_blank>Click here to buy.</a><br>");
			list.add("<img src=images/Shoe3.jpg alt=shoe>");
			list.add("Try out --> Adidas Black Formal Shoes<br>Starting Price: Rs. 998<br>");
			list.add("<a href=https://amzn.to/3amhlwI target=_blank>Click here to buy.</a><br>");
		}
		else if(range.equals("num2"))
		{
			list.add("<img src=images/Shoe4.jpg alt=shoe>");
			list.add("Try out --> Puma Men's Styron Idp Running Shoes<br>Starting Price: Rs. 1303<br>");
			list.add("<a href=https://amzn.to/3anN29g target=_blank>Click here to buy.</a><br>");
			list.add("<img src=images/Shoe10.jpg alt=shoe>");
			list.add("Try out --> Campus Men's Running Shoes<br>Starting Price: Rs. 1259<br>");
			list.add("<a href=https://amzn.to/3fS9wjI target=_blank>Click here to buy.</a><br>");
			list.add("<img src=images/Shoe6.jpg alt=shoe>");
			list.add("Try out --> Adidas MEN'S SPORT INSPIRED GLENN M SHOES<br>Starting Price: Rs. 1499<br>");
			list.add("<a href=https://amzn.to/2CkY963 target=_blank>Click here to buy.</a><br>");

		}
		else
		{
			list.add("<img src=images/Shoe7.jpg alt=shoe>");
			list.add("Try out --> Puma Men's Limnos Cat 2 Dp Mesh Running Shoes<br>Starting Price: Rs. 1578<br>");
			list.add("<a href=https://amzn.to/2XTW2Of target=_blank>Click here to buy.</a><br>");
			list.add("<img src=images/Shoe8.jpg alt=shoe>");
			list.add("Try out --> Lotto Men Caine Slip-ON 30 Leisure Shoes-11<br>Starting Price: Rs. 1749<br>");
			list.add("<a href=https://amzn.to/3iEZNij target=_blank>Click here to buy.</a><br>");
			list.add("<img src=images/Shoe9.jpg alt=shoe>");
			list.add("Try out --> Adidas Men's Adi Pacer Elite 2.0 M Running Shoes<br>Starting Price: Rs. 1799<br>");
			list.add("<a href=https://amzn.to/3agk4Il target=_blank>Click here to buy.</a><br>");

		}
		
		return list;
		
	}
	
	public ArrayList<String> suggestionsForWatch(String range)throws IOException
	{
		ArrayList<String> list = new ArrayList<String>();
		if(range.equals("num1"))
		{
			list.add("<img src=images/watch1.jpg alt=shoe>");
			list.add("Try out --> SKMEI Analogue - Digital Black Dial Men's & Boys' Watch<br>Starting Price: Rs. 781<br>");
			list.add("<a href=https://amzn.to/3kD70Bx target=_blank>Click here to buy.</a><br>");
			list.add("<img src=images/watch2.jpg alt=shoe>");
			list.add("Try out --> Casio Youth Digital Black Small Dial Unisex Watch<br>Starting Price: Rs. 895<br>");
			list.add("<a href=https://amzn.to/3aix9AK target=_blank>Click here to buy.</a><br>");
			list.add("<img src=images/watch3.jpg alt=shoe>");
			list.add("Try out --> Sonata Analog Multicolor Small Dial Men's Watch<br>Starting Price: Rs. 599<br>");
			list.add("<a href=https://amzn.to/30O6HvE target=_blank>Click here to buy.</a><br>");
		}
		else if(range.equals("num2"))
		{
			list.add("<img src=images/watch4.jpg alt=shoe>");
			list.add("Try out --> Timex Analog Blue Dial Men's Watch<br>Starting Price: Rs. 1095<br>");
			list.add("<a href=https://amzn.to/2PLNnZV target=_blank>Click here to buy.</a><br>");
			list.add("<img src=images/watch5.jpg alt=shoe>");
			list.add("Try out --> Fastrack Trendies Analog Black Dial Men's Watch<br>Starting Price: Rs. 1495<br>");
			list.add("<a href=https://amzn.to/2FkJTLV target=_blank>Click here to buy.</a><br>");
			list.add("<img src=images/watch6.jpg alt=shoe>");
			list.add("Try out --> Fastrack Casual Analog White Dial Men's Watch<br>Starting Price: Rs. 1050<br>");
			list.add("<a href=https://amzn.to/2PLrAkK target=_blank>Click here to buy.</a><br>");
		}
		else
		{
			list.add("<img src=images/watch7.jpg alt=shoe>");
			list.add("Try out --> Titan Neo Analog Black Dial Men's Watch<br>Starting Price: Rs. 1995<br>");
			list.add("<a href=https://amzn.to/3iBXkFC target=_blank>Click here to buy.</a><br>");
			list.add("<img src=images/watch8.jpg alt=shoe>");
			list.add("Try out --> Fastrack Trendies Analog Black Dial Men's Watch<br>Starting Price: Rs. 1995<br>");
			list.add("<a href=https://amzn.to/3kIQjoq target=_blank>Click here to buy.</a><br>");
			list.add("<img src=images/watch9.jpg alt=shoe>");
			list.add("Try out --> Adidas Black Formal ShoesFastrack Casual Analog Black Dial Men's Watch<br>Starting Price: Rs. 1750<br>");
			list.add("<a href=https://amzn.to/2PLNZPd target=_blank>Click here to buy.</a><br>");
		}
		
		return list;
	}

}
