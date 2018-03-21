<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>消费明细</title>
<meta name="decorator" content="default" />
</head>
<body>
	<div id="content" class="row-fluid">
		<div id="left">
			<iframe id="comsumeMenuFrame" name="comsumeMenuFrame" src="${ctx}/business/comsume/mx/tree"
				style="overflow: visible;" scrolling="yes" frameborder="no"
				width="100%"></iframe>
		</div>
		<div id="openClose" class="close">&nbsp;</div>
		<div id="right">
			<iframe id="comsumeMainFrame" name="comsumeMainFrame" src="${ctx}/business/comsume/mx/echarts"
				style="overflow: visible;" scrolling="yes" frameborder="no"
				width="100%"></iframe>
		</div>
	</div>
	<script type="text/javascript">
		var leftWidth = "160"; // 左侧窗口大小
		function wSize() {
			var strs = getWindowSize().toString().split(",");
			$("#comsumeMenuFrame, #comsumeMainFrame, #openClose").height(strs[0] - 5);
			$("#right").width(
					$("body").width() - $("#left").width()
							- $("#openClose").width() - 20);
		}
		// 鼠标移动到边界自动弹出左侧菜单
		$("#openClose").mouseover(function() {
			if ($(this).hasClass("open")) {
				$(this).click();
			}
		});
	</script>
	<script src="${ctxStatic}/common/wsize.min.js" type="text/javascript"></script>
</body>
</html>