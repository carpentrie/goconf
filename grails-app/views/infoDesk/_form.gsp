<%@ page import="goconf.InfoDesk" %>



<div class="fieldcontain ${hasErrors(bean: infoDeskInstance, field: 'info', 'error')} ">
	<label for="info">
		<g:message code="infoDesk.info.label" default="Info" />
		
	</label>
	<g:textArea name="info" cols="40" rows="5" maxlength="2048" value="${infoDeskInstance?.info}"/>

</div>

