<%@ page import="goconf.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'firstName', 'error')} ">
	<label for="firstName">
		<g:message code="user.firstName.label" default="First Name" />
		
	</label>
	<g:textField name="firstName" maxlength="63" value="${userInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'lastName', 'error')} ">
	<label for="lastName">
		<g:message code="user.lastName.label" default="Last Name" />
		
	</label>
	<g:textField name="lastName" maxlength="63" value="${userInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'nickName', 'error')} ">
	<label for="nickName">
		<g:message code="user.nickName.label" default="Nick Name" />
		
	</label>
	<g:textField name="nickName" maxlength="63" value="${userInstance?.nickName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'birthDate', 'error')} ">
	<label for="birthDate">
		<g:message code="user.birthDate.label" default="Birth Date" />
		
	</label>
	<g:datePicker name="birthDate" format="dd-MM-yyyy" precision="day"  value="${userInstance?.birthDate}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'organization', 'error')} ">
	<label for="organization">
		<g:message code="user.organization.label" default="Organization" />
		
	</label>
	<g:textField name="organization" maxlength="63" value="${userInstance?.organization}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'position', 'error')} ">
	<label for="position">
		<g:message code="user.position.label" default="Position" />
		
	</label>
	<g:textField name="position" maxlength="63" value="${userInstance?.position}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="user.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" required="" value="${userInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'skype', 'error')} ">
	<label for="skype">
		<g:message code="user.skype.label" default="Skype" />
		
	</label>
	<g:textField name="skype" maxlength="63" value="${userInstance?.skype}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'phone', 'error')} ">
	<label for="phone">
		<g:message code="user.phone.label" default="Phone" />
		
	</label>
	<g:textField name="phone" maxlength="63" value="${userInstance?.phone}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'about', 'error')} ">
	<label for="about">
		<g:message code="user.about.label" default="About" />
		
	</label>
	<g:textArea name="about" cols="40" rows="5" maxlength="1024" value="${userInstance?.about}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'vk', 'error')} ">
	<label for="vk">
		<g:message code="user.vk.label" default="Vk" />
		
	</label>
	<g:textField name="vk" maxlength="63" value="${userInstance?.vk}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'fb', 'error')} ">
	<label for="fb">
		<g:message code="user.fb.label" default="Fb" />
		
	</label>
	<g:textField name="fb" maxlength="63" value="${userInstance?.fb}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'ok', 'error')} ">
	<label for="ok">
		<g:message code="user.ok.label" default="Ok" />
		
	</label>
	<g:textField name="ok" maxlength="63" value="${userInstance?.ok}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'linkedIn', 'error')} ">
	<label for="linkedIn">
		<g:message code="user.linkedIn.label" default="Linked In" />
		
	</label>
	<g:textField name="linkedIn" maxlength="63" value="${userInstance?.linkedIn}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'card', 'error')} ">
	<label for="card">
		<g:message code="user.card.label" default="Card" />
		
	</label>
	<g:select id="card" name="card.id" from="${goconf.Card.list()}" optionKey="id" value="${userInstance?.card?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

