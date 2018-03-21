<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>消费管理</title>
<meta name="decorator" content="default" />
<script type="text/javascript">
	$(document).ready(
			function() {
				$("#inputForm")
						.validate(
								{
									submitHandler : function(form) {
										loading('正在提交，请稍等...');
										form.submit();
									},
									errorContainer : "#messageBox",
									errorPlacement : function(error, element) {
										$("#messageBox").text("输入有误，请先更正。");
										if (element.is(":checkbox")
												|| element.is(":radio")
												|| element.parent().is(
														".input-append")) {
											error.appendTo(element.parent()
													.parent());
										} else {
											error.insertAfter(element);
										}
									}
								});
				bindKeyEvent($("#rmb"));  
			});

	function bindKeyEvent(obj) {
		obj.keyup(function() {
			var reg = $(this).val().match(/\d+\.?\d{0,2}/);
			var txt = '';
			if (reg != null) {
				txt = reg[0];
			}
			$(this).val(txt);
		}).change(function() {
			$(this).keypress();
			var v = $(this).val();
			if (/\.$/.test(v)) {
				$(this).val(v.substr(0, v.length - 1));
			}
		});
	}
</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/business/comsume/mx/list?category=${comsume.category}&code=${comsume.code}">消费列表</a></li>
		<shiro:hasPermission name="business:mx:edit">
			<li class="active"><a href="${ctx}/business/comsume/mx/add?category=${comsume.category}&code=${comsume.code}">添加消费</a></li>
		</shiro:hasPermission>
	</ul>
	<br />
	<form:form id="inputForm" modelAttribute="comsume"
		action="${ctx}/business/comsume/mx/save" method="post"
		class="form-horizontal">
		<form:hidden path="id" />
		<form:hidden path="code" />
		<input id="over" name="over" type="hidden" >
		<sys:message content="${message}" />
		<div class="control-group">
			<label class="control-label">消费类别:</label>
			<div class="controls">
				<sys:treeselect id="category" name="over"
					value="${comsume.code}" labelName="category"
					labelValue="${comsume.category}" title="消费类别" disabled="disabled"
					url="/business/comsume/treeData" cssClass="required" />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">标题:</label>
			<div class="controls">
				<form:input path="title" htmlEscape="false" maxlength="50"
					placeholder="标题" class="required input-xlarge" />
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">人民币:</label>
			<div class="controls">
				<form:input id="rmb" path="rmb" htmlEscape="false" maxlength="20"
					placeholder="人民币" class="required input-xlarge" />
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">地址:</label>
			<div class="controls">
				<form:input path="address" htmlEscape="false" maxlength="20"
					placeholder="地址" class="required input-xlarge" />
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">时间:</label>
			<div class="controls">
				<form:input id="time" path="time" htmlEscape="false" maxlength="20" readonly="readonly"
					placeholder="时间" class="required input-xlarge input-small Wdate"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});" />
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">备注:</label>
			<div class="controls">
				<form:textarea path="remarks" htmlEscape="false" rows="3"
					maxlength="200" />
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="business:mx:edit">
				<input id="btnSubmit" class="btn btn-primary" type="submit"
					value="保 存" />&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回"
				onclick="history.go(-1)" />
		</div>
	</form:form>
</body>
</html>