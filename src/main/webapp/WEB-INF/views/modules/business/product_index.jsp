<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>商品管理</title>
<meta name="decorator" content="default" />
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/business/product/index">商品列表</a></li>
		<shiro:hasPermission name="business:product:edit">
			<li><a href="${ctx}/business/product/add">添加商品</a></li>
		</shiro:hasPermission>
	</ul>
</body>
</html>