<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.cinemajapan.property.login" var="lang" />

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>lang.login.email</title>
</head>
<body>

<s:form action="LoginAction">
<s:textfield label="%{getText('lang.login.email')}" name="email"/>
<s:textfield label="%{getText('lang.login.password')}" name="password"/>
<s:submit value="check" />

</s:form>

</body>
</html>
