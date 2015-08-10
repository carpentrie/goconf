<%@ page import="goconf.AppSetting" %>



<div class="fieldcontain ${hasErrors(bean: appSettingInstance, field: 'key', 'error')} required">
	<label for="key">
		<g:message code="appSetting.key.label" default="Key" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="key" maxlength="63" required="" value="${appSettingInstance?.key}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: appSettingInstance, field: 'value', 'error')} required">
	<label for="value">
		<g:message code="appSetting.value.label" default="Value" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="value" cols="40" rows="5" maxlength="254" required="" value="${appSettingInstance?.value}"/>

</div>

