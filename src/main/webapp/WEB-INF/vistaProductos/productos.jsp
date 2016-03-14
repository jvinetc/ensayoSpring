<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Lista</title>
        <link href="<c:url value="/static/assets/css/bootstrap.min.css"/>" rel="stylesheet"/>
        <link href="<c:url value="/static/assets/css/bootstrap-responsive.min.css"/>" rel="stylesheet"/>
        <link href="<c:url value="/static/assets/css/font-awesome.min.css"/>" rel="stylesheet"/>
        <link href="<c:url value="/static/assets/css/ace.min.css"/>" rel="stylesheet"/>          
        <link href="<c:url value="/static/assets/css/ace-responsive.min.css"/>" rel="stylesheet"/>  
        <script src="<c:url value="/static/assets/js/jquery-1.10.2.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/static/assets/js/ace-extra.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/static/assets/js/jquery-ui-1.10.3.custom.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/static/assets/js/bootstrap.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/static/assets/js/ace-elements.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/static/assets/js/ace.min.js"/>" type="text/javascript"></script>
        <script src="<c:url value="/static/js/funcionesVenta.js"/>" type="text/javascript"></script>
    </head>
    <body> 
        <div class="navbar" id="navbar">
            <script type="text/javascript">
                try {
                    ace.settings.check('navbar', 'fixed');
                } catch (e) {
                }
            </script>

            <div class="navbar-inner">
                <div class="container-fluid">
                    <a href="#" class="brand">
                        <small>
                            <i class="icon-leaf"></i>
                            Prueba Spring
                        </small>
                    </a><!-- /.brand -->

                    <ul class="nav ace-nav pull-right">

                        <li class="light-blue">
                            <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                                <span class="user-info">
                                    <small>Bienvenido,</small>
                                    ${sesion.usuDisplay}
                                </span>

                                <i class="icon-caret-down"></i>
                            </a>

                            <ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-closer">
                                <li>
                                    <a href="#">
                                        <i class="icon-cog"></i>
                                        Settings
                                    </a>
                                </li>

                                <li>
                                    <a href="#">
                                        <i class="icon-user"></i>
                                        Profile
                                    </a>
                                </li>

                                <li class="divider"></li>

                                <li>
                                    <a href="login">
                                        <i class="icon-off"></i>
                                        Logout
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul><!-- /.ace-nav -->
                </div><!-- /.container-fluid -->
            </div><!-- /.navbar-inner -->
        </div>
        <div class="main-container container-fluid">
            <a class="menu-toggler" id="menu-toggler" href="#">
                <span class="menu-text"></span>
            </a>
            <div class="sidebar" id="sidebar">

                <script type="text/javascript">
                    try {
                        ace.settings.check('sidebar', 'fixed');
                    } catch (e) {
                    }
                </script>

                <div class="sidebar-shortcuts" id="sidebar-shortcuts">
                    <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
                        <button class="btn btn-small btn-success">
                            <i class="icon-signal"></i>
                        </button>

                        <button class="btn btn-small btn-info">
                            <i class="icon-pencil"></i>
                        </button>

                        <button class="btn btn-small btn-warning">
                            <i class="icon-group"></i>
                        </button>

                        <button class="btn btn-small btn-danger">
                            <i class="icon-cogs"></i>
                        </button>
                    </div>

                    <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
                        <span class="btn btn-success"></span>

                        <span class="btn btn-info"></span>

                        <span class="btn btn-warning"></span>

                        <span class="btn btn-danger"></span>
                    </div>
                </div>
                <ul class="nav nav-list">
                    <c:forEach items="${modulos}" var="modulo">
                        <li>
                            <a href="${modulo.rutaModulos}" class="dropdown-toggle">
                                <i class="icon-text-width"></i>
                                <span class="menu-text">
                                    <c:out value="${modulo.nombreModulos}"/>
                                </span>
                            </a>
                        </li>

                    </c:forEach>  
                </ul>
                <div class="sidebar-collapse" id="sidebar-collapse">
                    <i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
                </div>

                <script type="text/javascript">
                    try {
                        ace.settings.check('sidebar', 'collapsed');
                    } catch (e) {
                    }
                </script>
            </div>
            <div class="main-content">
                <div class="breadcrumbs" id="breadcrumbs">
                    <script type="text/javascript">
                        try {
                            ace.settings.check('breadcrumbs', 'fixed');
                        } catch (e) {
                        }
                    </script>

                    <ul class="breadcrumb">
                        <li>
                            <a href="volver">
                                <i class="icon-home home-icon"></i>
                                Inicio
                            </a>
                            <span class="divider">
                                <i class="icon-angle-right arrow-icon"></i>
                            </span>
                        </li>
                        <li class="active">
                            Ver Precio

                            <span class="divider">
                                <i class="icon-angle-right arrow-icon"></i>
                            </span>
                        </li>
                    </ul><!-- .breadcrumb -->

                    <div class="nav-search" id="nav-search">
                        <form class="form-search">
                            <span class="input-icon">
                                <input type="text" placeholder="Search ..." class="input-small nav-search-input" id="nav-search-input" autocomplete="off" />
                                <i class="icon-search nav-search-icon"></i>
                            </span>
                        </form>
                    </div><!-- #nav-search -->
                </div>
                <div class="page-content">
                    <div class="row-fluid">
                   <form:form method="POST" modelAttribute="producto" id="formVenta" cssClass="form-horizontal">
                        <div class="control-group">
                            <label for="prodCod">Codigo de Articulo</label>
                            <form:input path="prodCod" id="codigo_articulo"/>
                        </div>
                        <div id="venta"></div>
                    </form:form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
