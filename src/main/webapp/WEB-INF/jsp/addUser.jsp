<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add user</title>
    <link rel="stylesheet" href="<spring:theme code='css'/>" type="text/css" />
    <style>
        .error {
            color: #ff0000;
        }
        .errorblock {
            color:#000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
<h1><spring:message code="messages.user.title"/> </h1>
<spring:message code="messages.language"/>:
<a href="?language=en">English</a> |
<a href="?language=hu">Magyar</a>
<spring:message code="messages.theme.theme"/>:
<a href="?theme=black"><spring:message code="messages.color.BLACK"/></a> |
<a href="?theme=blue"><spring:message code="messages.color.BLUE"/></a> |
<a href="?theme=red"><spring:message code="messages.color.RED"/></a>

<form:form commandName="user">
    <form:errors path="*" cssClass="errorblock" element="div" />
    <table>
        <tr>
            <td><spring:message code="messages.user.name"/>: </td>
            <td><form:input path="name"/></td>
            <td><form:errors path="name" cssClass="error"/></td>
        </tr>
        <tr>
            <td><spring:message code="messages.user.gender"/>: </td>
            <td>
                <c:forEach items="${genders}" var="gender">
                    <spring:message code="${gender.label}" var="labelVal"/>
                    <form:radiobutton path="gender" value="${gender}" label="${labelVal}"/>
                </c:forEach>
            </td>
            <td><form:errors path="gender" cssClass="error"/></td>
        </tr>
        <tr>
            <td><spring:message code="messages.user.school"/>: </td>
            <td>
                <form:select path="school">
                    <form:option value=""><spring:message code="messages.school.select"/></form:option>
                    <c:forEach items="${schools}" var="school">
                        <form:option value="${school}"><spring:message code="${school.label}"/></form:option>
                    </c:forEach>
                </form:select>
            </td>
            <td><form:errors path="school" cssClass="error"/></td>
        </tr>
        <tr>
            <td><spring:message code="messages.user.color"/>: </td>
            <td>
                <c:forEach items="${colors}" var="color">
                    <spring:message code="${color.label}" var="labelVal"/>
                    <form:checkbox path="colors" value="${color}" label="${labelVal}"/>
                </c:forEach>
            </td>
            <td><form:errors path="colors" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="3">
                <spring:message code="messages.user.submit" var="submitLabel"/>
                <input type="submit" value="${submitLabel}"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>