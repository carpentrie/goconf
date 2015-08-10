<%@ page import="goconf.Card" %>



<div class="fieldcontain ${hasErrors(bean: cardInstance, field: 'code', 'error')} ">
	<label for="code">
		<g:message code="card.code.label" default="Code" />
		
	</label>
	<g:textField name="code" maxlength="63" value="${cardInstance?.code}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: cardInstance, field: 'cardType', 'error')} ">
	<label for="cardType">
		<g:message code="card.cardType.label" default="Card Type" />
		
	</label>
	<g:textField name="cardType" maxlength="63" value="${cardInstance?.cardType}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: cardInstance, field: 'user', 'error')} ">
	<label for="user">
		<g:message code="card.user.label" default="User" />
		
	</label>
	<g:select id="user" name="user.id" from="${goconf.User.list()}" optionKey="id" value="${cardInstance?.user?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

