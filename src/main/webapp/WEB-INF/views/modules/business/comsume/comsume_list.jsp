<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>消费管理</title>
<meta name="decorator" content="default" />
<script type="text/javascript">
	function page(n, s) {
		$("#pageNo").val(n);
		$("#pageSize").val(s);
		$("#searchForm").submit();
		return false;
	}
</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/business/comsume/mx/list?category=${comsume.category}&code=${comsume.code}">消费列表</a></li>
		<shiro:hasPermission name="business:mx:edit">
			<li><a href="${ctx}/business/comsume/mx/add?category=${comsume.category}&code=${comsume.code}">添加消费</a></li>
		</shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="comsume"
		action="${ctx}/business/comsume/mx/list?category=${comsume.category}&code=${comsume.code}" method="post"
		class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}" />
		<input id="pageSize" name="pageSize" type="hidden"
			value="${page.pageSize}" />
		<label>费用类别：</label>
		<sys:treeselect id="category" name="category.id"
			value="${comsume.code}" labelName="${comsume.category}"
			labelValue="${comsume.category}" title="费用类别" disabled="disabled"
			url="/business/comsume/treeData" module="comsume"
			notAllowSelectRoot="false" cssClass="input-small" />
		<label>标题：</label>
		<form:input path="title" htmlEscape="false" maxlength="50"
			class="input-small" />&nbsp;
	   <label>地址：</label>
		<form:input path="address" htmlEscape="false" maxlength="50"
			class="input-small" />&nbsp;
		<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询" />&nbsp;&nbsp;
	</form:form>
	<sys:message content="${message}" />
	<table id="contentTable"
		class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th style="width:15%">标题</th>
				<th style="width:15%">人民币</th>
				<th style="width:20%">地址</th>
				<th style="width:15%">费用类别</th>
				<th style="width:15%">时间</th>
				<shiro:hasPermission name="business:mx:edit">
					<th style="width:20%">操作</th>
				</shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.list}" var="comsume">
				<tr id="${comsume.id}">
					<td title=""><i>${comsume.title}</i></td>
					<td title=""><i>${comsume.rmb}</i></td>
					<td title=""><i>${comsume.address}</i></td>
					<td title=""><i>${comsume.category}</i></td>
					<td title=""><i>${comsume.time}</i></td>
						<td nowrap> <a
							href="${ctx}/business/comsume/mx/add?id=${comsume.id}">修改</a>  
							<shiro:hasPermission name="sys:menu:edit">
							 <a
							href="${ctx}/business/comsume/mx/delete?id=${comsume.id}"
							onclick="return confirmx('要删除吗？', this.href)">删除</a>
							</shiro:hasPermission>
						</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>