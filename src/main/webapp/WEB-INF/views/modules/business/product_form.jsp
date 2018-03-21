<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<meta name="decorator" content="default" />
<title>添加商品</title>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/business/product/index">商品列表</a></li>
		<shiro:hasPermission name="business:product:edit">
			<li class="active"><a href="${ctx}/business/product/add">添加商品</a></li>
		</shiro:hasPermission>
	</ul>
	<br />
	<form:form id="inputForm" modelAttribute="product"
		action="${ctx}/business/product/save" method="post"
		class="form-horizontal">
		<form:hidden path="id" />
		<sys:message content="${message}" />
		<div class="control-group">
			<label class="control-label">商品图片:</label>
			<div class="controls">
				<form:hidden id="nameImage" path="photo" htmlEscape="false"
					maxlength="255" class="input-xlarge" />
				<sys:ckfinder input="nameImage" type="images" uploadPath="/photo"
					selectMultiple="false" maxWidth="138" maxHeight="162" />
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">商品名称:</label>
			<div class="controls">
				<input id="oldName" name="oldName" type="hidden"
					value="${model.product_name}">
				<form:input path="product_name" htmlEscape="false" maxlength="50" placeholder="商品名称"
					class="required" />
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">商品价格:</label>
			<div class="controls">
				<input id="oldPrice" name="oldPrice" type="hidden"
					value="${model.price}">
				<form:input path="price" htmlEscape="false" maxlength="50" placeholder="商品价格"
					class="required" />
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
	</form:form>
</body>
</html>