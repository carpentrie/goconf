
<%@ page import="goconf.InfoDesk" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'infoDesk.label', default: 'InfoDesk')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-infoDesk" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-infoDesk" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="title" title="${message(code: 'infoDesk.title.label', default: 'Title')}" />
					
						<g:sortableColumn property="info" title="${message(code: 'infoDesk.info.label', default: 'Info')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${infoDeskInstanceList}" status="i" var="infoDeskInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${infoDeskInstance.id}">${fieldValue(bean: infoDeskInstance, field: "title")}</g:link></td>
					
						<td>${fieldValue(bean: infoDeskInstance, field: "info")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${infoDeskInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
