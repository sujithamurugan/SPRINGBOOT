<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>password change</title>
</head>
<body>
<script language="javascript">
function fncSubmit()
{

if(document.ChangePasswordForm.OldPassword.value == "")
{
alert('Please input old password');
document.ChangePasswordForm.OldPassword.focus();
return false;
} 

if(document.ChangePasswordForm.newpassword.value == "")
{
alert('Please input Password');
document.ChangePasswordForm.newpassword.focus(); 
return false;
} 

if(document.ChangePasswordForm.conpassword.value == "")
{
alert('Please input Confirm Password');
document.ChangePasswordForm.conpassword.focus(); 
return false;
} 

if(document.ChangePasswordForm.newpassword.value != document.ChangePasswordForm.conpassword.value)
{
alert('Confirm Password Not Match');
document.ChangePasswordForm.conpassword.focus(); 
return false;
} 

document.ChangePasswordForm.submit();
}
</script>


<table border="1" align="center" bgcolor="#2B60DE">

<tr>
<td>OLD PASSWORD</td>
<TD><input name="OldPassword" type="password" id="OLDpwd" size="20"></td>
</tr>
<tr>
<td>NewPassword</td>
<td><input name="newpassword" type="password" id="newpassword">
</td>
</tr>
<tr>
<td>Confirm Password</td>
<td><input name="conpassword" type="password" id="conpassword">
</td>
</tr>
<tr>
<td>&nbsp;</td>
<td><button type="submit"><a href="process" >Save</a></button></td>
</tr>

</table>

</body>
</html>