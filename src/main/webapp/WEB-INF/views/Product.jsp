<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validation1() 
{
	var pname=document.form1.pname.value;
	var pprice=document.from1.pprice.value;
	var ptype=document.from1.ptype.value;  
	
	 if (pname==null || pname==""){  
		  alert("Please enter the name");  
		  return false;  
		}
	  
	  if (pprice==null || pprice==""){  
	  alert("Please enter the price");  
	  return false;  
	}else if(ptype==null || ptype==""){  
	  alert("Please enter the type");  
	  return false;  
	  }  
	
	
}
</script>
</head>
<body>
<form name="from1" action="products.do" method="post" onsubmit="return validation1()">
<table align="center">
<tr>
<th colspan="2" align="center">Enter the product details</th>
</tr>


<tr>
<td>Product Name<sup><font color="red">*</font></sup>:</td>
<td><input type="text" name="pname" id="pname"></td>
</tr>
<tr>

<tr>

<td>Product Price<sup><font color="red">*</font></sup>:</td>
<td><input type="text" name="pprice" id="pprice"></td>
</tr>
<tr>
<tr>
</tr>
<tr>
<td>Product Type<sup><font color="red">*</font></sup>:</td>
<td><input type="text" name="ptype" id="ptype"></td>
</tr>
<tr>
<td align="center"><input type="submit" value="Submit"></td>
</tr>
</table>
</form>
</body>
</html>