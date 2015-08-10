
<%@ page import="goconf.User" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-user" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-user" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list user">
			
				<g:if test="${userInstance?.firstName}">
				<li class="fieldcontain">
					<span id="firstName-label" class="property-label"><g:message code="user.firstName.label" default="First Name" /></span>
					
						<span class="property-value" aria-labelledby="firstName-label"><g:fieldValue bean="${userInstance}" field="firstName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.lastName}">
				<li class="fieldcontain">
					<span id="lastName-label" class="property-label"><g:message code="user.lastName.label" default="Last Name" /></span>
					
						<span class="property-value" aria-labelledby="lastName-label"><g:fieldValue bean="${userInstance}" field="lastName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.nickName}">
				<li class="fieldcontain">
					<span id="nickName-label" class="property-label"><g:message code="user.nickName.label" default="Nick Name" /></span>
					
						<span class="property-value" aria-labelledby="nickName-label"><g:fieldValue bean="${userInstance}" field="nickName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.birthDate}">
				<li class="fieldcontain">
					<span id="birthDate-label" class="property-label"><g:message code="user.birthDate.label" default="Birth Date" /></span>
					
						<span class="property-value" aria-labelledby="birthDate-label"><g:formatDate date="${userInstance?.birthDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.organization}">
				<li class="fieldcontain">
					<span id="organization-label" class="property-label"><g:message code="user.organization.label" default="Organization" /></span>
					
						<span class="property-value" aria-labelledby="organization-label"><g:fieldValue bean="${userInstance}" field="organization"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.position}">
				<li class="fieldcontain">
					<span id="position-label" class="property-label"><g:message code="user.position.label" default="Position" /></span>
					
						<span class="property-value" aria-labelledby="position-label"><g:fieldValue bean="${userInstance}" field="position"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="user.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${userInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.skype}">
				<li class="fieldcontain">
					<span id="skype-label" class="property-label"><g:message code="user.skype.label" default="Skype" /></span>
					
						<span class="property-value" aria-labelledby="skype-label"><g:fieldValue bean="${userInstance}" field="skype"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.phone}">
				<li class="fieldcontain">
					<span id="phone-label" class="property-label"><g:message code="user.phone.label" default="Phone" /></span>
					
						<span class="property-value" aria-labelledby="phone-label"><g:fieldValue bean="${userInstance}" field="phone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.about}">
				<li class="fieldcontain">
					<span id="about-label" class="property-label"><g:message code="user.about.label" default="About" /></span>
					
						<span class="property-value" aria-labelledby="about-label"><g:fieldValue bean="${userInstance}" field="about"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.vk}">
				<li class="fieldcontain">
					<span id="vk-label" class="property-label"><g:message code="user.vk.label" default="Vk" /></span>
					
						<span class="property-value" aria-labelledby="vk-label"><g:fieldValue bean="${userInstance}" field="vk"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.fb}">
				<li class="fieldcontain">
					<span id="fb-label" class="property-label"><g:message code="user.fb.label" default="Fb" /></span>
					
						<span class="property-value" aria-labelledby="fb-label"><g:fieldValue bean="${userInstance}" field="fb"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.ok}">
				<li class="fieldcontain">
					<span id="ok-label" class="property-label"><g:message code="user.ok.label" default="Ok" /></span>
					
						<span class="property-value" aria-labelledby="ok-label"><g:fieldValue bean="${userInstance}" field="ok"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.linkedIn}">
				<li class="fieldcontain">
					<span id="linkedIn-label" class="property-label"><g:message code="user.linkedIn.label" default="Linked In" /></span>
					
						<span class="property-value" aria-labelledby="linkedIn-label"><g:fieldValue bean="${userInstance}" field="linkedIn"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.card}">
				<li class="fieldcontain">
					<span id="card-label" class="property-label"><g:message code="user.card.label" default="Card" /></span>
					
						<span class="property-value" aria-labelledby="card-label"><g:link controller="card" action="show" id="${userInstance?.card?.id}">${userInstance?.card?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:userInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${userInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
