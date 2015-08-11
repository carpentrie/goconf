<%@ page import="goconf.InfoDesk" %>



<div class="fieldcontain ${hasErrors(bean: infoDeskInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="infoDesk.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="title" cols="40" rows="5" maxlength="254" required="" value="${infoDeskInstance?.title}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: infoDeskInstance, field: 'info', 'error')} required">
	<label for="info">
		<g:message code="infoDesk.info.label" default="Info" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="info" cols="40" rows="5" maxlength="63000" required="" value="${infoDeskInstance?.info}"/>

</div>

