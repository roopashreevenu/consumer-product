<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validation() 
{
	var cname=document.form.cname.value;  
	var caddress=document.form.caddress.value;
	var ccontact=document.form.ccontact.value;
	  
	  if (cname==null || cname==""){  
	  alert("Please enter the name");  
	  return false;  
	}
	  
		  
	   if(caddress==null || caddress==""){  
	  alert("Please enter the address");  
	  return false;  
	  }  
	 if(ccontact==null || ccontact=="")
	{
		alert("Please enter the contact");  
		  return false;  
	}
	
}

</script>
</head>
<body>
<div>
<form name="form" action="consumers.do" method="post" onsubmit="return validation()">
<table align="center">
<tr>
<th align="center"><font color="red">Enter the Consumer details</font></th>
</tr>
<tr>
<td>Consumer Name<sup><font color="red">*</font></sup>:</td>
<td><input type="text" name="cname" id="cname"></td>
</tr>
<tr>

<tr>
<td>Consumer Address<sup><font color="red">*</font></sup>:</td>
<td><input type="text" name="caddress" id="caddress"></td>
</tr>
<tr>
<td>Consumer Contact<sup><font color="red">*</font></sup>:</td>
<td><input type="text" name="ccontact" id="ccontact"></td>
<tr>
<td align="center"><input type="submit" value="Submit"></td>
</tr>
<tr>

</tr>
</table>

</form>
</div>
</body>
</html>