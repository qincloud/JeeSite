<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
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
				 //bindKeyEvent($("#sort"));  
			});
	
	function bindKeyEvent(obj){  
	    obj.keyup(function () {  
	        var reg = $(this).val().match(/\d+\.?\d{0,2}/);  
	        var txt = '';  
	        if (reg != null) {  
	            txt = reg[0];  
	        }  
	        $(this).val(txt);  
	    }).change(function () {  
	        $(this).keypress();  
	        var v = $(this).val();  
	        if (/\.$/.test(v))  
	        {  
	            $(this).val(v.substr(0, v.length - 1));  
	        }  
	    });  
	}  
</script>
<title>添加消费分类</title>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/business/comsume/index">消费分类列表</a></li>
		<shiro:hasPermission name="business:comsume:edit">
			<li class="active"><a href="${ctx}/business/comsume/add">添加消费分类</a></li>
		</shiro:hasPermission>
	</ul>
	<br />
	<form:form id="inputForm" modelAttribute="category"
		action="${ctx}/business/comsume/save" method="post"
		class="form-horizontal">
		<form:hidden path="id" />
		<sys:message content="${message}" />
		<div class="control-group">
			<label class="control-label">上级菜单:</label>
			<div class="controls">
				<sys:treeselect id="category" name="parent.id"
					value="${category.parent.id}" labelName="parent.categoryName"
					labelValue="${category.parent.categoryName}" title="菜单" disabled="disabled"
					url="/business/comsume/treeData" extId="${category.id}"
					cssClass="required" />
			</div>
		</div>
		</div>
		<div class="control-group">
			<label class="control-label">分类名称:</label>
			<div class="controls">
				<form:input path="categoryName" htmlEscape="false" maxlength="70"
					placeholder="分类名称" class="required input-xlarge" />
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">分类代码:</label>
			<div class="controls">
				<form:input path="categoryCode" htmlEscape="false" maxlength="50"
					placeholder="分类代码" class="required input-xlarge" />
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">排序:</label>
			<div class="controls">
				<form:input id="sort" path="sort" htmlEscape="false" maxlength="50"
					placeholder="排序" class="required" />
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="sys:menu:edit">
				<input id="btnSubmit" class="btn btn-primary" type="submit"
					value="保 存" />&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回"
				onclick="history.go(-1)" />
		</div>
	</form:form>
</body>
<script type="text/javascript">
</script>
</html>