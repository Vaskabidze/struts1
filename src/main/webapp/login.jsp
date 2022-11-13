<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
<head>
    <title>Форма входа в систему</title>
</head>
<body>
    <h1>Form to login in system</h1>
    <html:form action="/login">
        <table border="0">
            <tbody>
            <tr>
                <td>Enter your name:</td>
                <td><html:text property="name" /></td>
            </tr>
            <tr>
                <td>Enter your email:</td>
                <td><html:text property="email" /></td>
            </tr>
            <tr>
                <td></td>
                <td><html:submit value="Login" /></td>
            </tr>
            </tbody>
        </table>
    </html:form>
</body>
</html>
