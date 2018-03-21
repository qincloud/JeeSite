<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>消费种类管理</title>
<meta name="decorator" content="default" />
<%@include file="/WEB-INF/views/include/treetable.jsp"%>
<script type="text/javascript">
	$(document).ready(function() {
		$("#treeTable").treeTable({
			expandLevel : 2
		}).show();
	});
</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/business/comsume/index">消费分类列表</a></li>
		<shiro:hasPermission name="business:comsume:edit">
			<li><a href="${ctx}/business/comsume/add">添加消费分类</a></li>
		</shiro:hasPermission>
	</ul>
	<sys:message content="${message}" />
	<form id="listForm" method="post">
		<table id="treeTable"
			class="table table-striped table-bordered table-condensed hide">
			<thead>
				<tr>
					<th>种类名称</th>
					<th>种类代码</th>
					<th style="text-align: center;">排序</th>
					<shiro:hasPermission name="sys:menu:edit">
						<th>操作</th>
					</shiro:hasPermission>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="category">
					<tr id="${category.id}" pId="${category.parent.id}">
						<td nowrap><i>${category.categoryName}</i></td>
						<td title=""><i>${category.categoryCode}</i></td>
						<td title=""><i>${category.sort}</i></td>
						<shiro:hasPermission name="sys:menu:edit">
							<td nowrap><a
								href="${ctx}/business/comsume/add?id=${category.id}">修改</a> <a
								href="${ctx}/sys/menu/delete?id=${category.id}"
								onclick="return confirmx('要删除该菜单及所有子菜单项吗？', this.href)">删除</a> <a
								href="${ctx}/business/comsume/add?parent.id=${category.id}">添加下级菜单</a>
							</td>
						</shiro:hasPermission>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>