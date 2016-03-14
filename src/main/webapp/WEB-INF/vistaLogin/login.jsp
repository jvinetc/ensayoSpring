<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Login</title>
         <link href="<c:url value="/static/assets/css/bootstrap.min.css"/>" rel="stylesheet"/>
        <link href="<c:url value="/static/assets/css/font-awesome.min.css"/>" rel="stylesheet"/>
        <link href="<c:url value="/static/assets/css/ace.min.css"/>" rel="stylesheet"/>
        <script src="<c:url value="/static/assets/js/jquery-1.10.2.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/static/assets/js/jquery-ui-1.10.3.custom.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/static/assets/js/ace-extra.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/static/assets/js/bootstrap.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/static/assets/js/jquery.validate.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/static/js/funcionesLogin.js"/>" type="text/javascript"></script>
    </head>
    <body>
        <div class="container">
            <div class="header">Login Usuario</div>
            <c:url value="/inicioSesion" var="destino"/>
            <form:form method="POST" modelAttribute="usuarios" id="formLogin" cssClass="form-horizontal" action="${destino}"
                       commandName="usuarios">
               <div class="control-group">
		    <label class="control-label" for="usuUsername">Nombre de Usuario</label>
                    <div class="controls">
                        <form:input path="usuUsername" name="usuUsername" id="usuUsername" cssClass="form-control"/>
                    </div>
                    <div class="error">
                        <form:errors path="usuUsername" cssClass="help-line"/>
                    </div>
		</div>
                <div class="control-group">
		    <label class="control-label" for="usuPass">Password</label>
                    <div class="controls">
                        <form:password path="usuPass" name="usuPass" id="usuPass" cssClass="form-control"/>
                    </div>
                    <div class="error">
                        <form:errors path="usuPass" cssClass="help-line"/>
                    </div>
		</div>
                    <input type="submit" value="Ingresar" class="btn btn-success btn-mini">
            </form:form>
        </div>
            <div class="error">
                ${mensaje}
            </div>
    </body>
</html>
