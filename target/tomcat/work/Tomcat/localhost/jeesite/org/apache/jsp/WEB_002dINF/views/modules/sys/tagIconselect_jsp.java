/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-05 01:38:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.modules.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tagIconselect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.thinkgem.jeesite.common.config.Global.class, "getAdminPath", new Class[] {});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/include/taglib.jsp", Long.valueOf(1502931158000L));
    _jspx_dependants.put("/WEB-INF/tlds/fns.tld", Long.valueOf(1501933842000L));
    _jspx_dependants.put("/WEB-INF/tlds/shiros.tld", Long.valueOf(1483186160000L));
    _jspx_dependants.put("/WEB-INF/tlds/fnc.tld", Long.valueOf(1483186160000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>图标选择</title>\n");
      out.write("\t<meta name=\"decorator\" content=\"blank\"/>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("    \t.page-header {clear:both;margin:0 20px;padding-top:20px;}\n");
      out.write("\t\t.the-icons {padding:25px 10px 15px;list-style:none;}\n");
      out.write("\t\t.the-icons li {float:left;width:22%;line-height:25px;margin:2px 5px;cursor:pointer;}\n");
      out.write("\t\t.the-icons i {margin:1px 5px;font-size:16px;} .the-icons li:hover {background-color:#efefef;}\n");
      out.write("        .the-icons li.active {background-color:#0088CC;color:#ffffff;}\n");
      out.write("        .the-icons li:hover i{font-size:20px;}\n");
      out.write("    </style>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\t    $(document).ready(function(){\n");
      out.write("\t    \t$(\"#icons li\").click(function(){\n");
      out.write("\t    \t\t$(\"#icons li\").removeClass(\"active\");\n");
      out.write("\t    \t\t$(\"#icons li i\").removeClass(\"icon-white\");\n");
      out.write("\t    \t\t$(this).addClass(\"active\");\n");
      out.write("\t    \t\t$(this).children(\"i\").addClass(\"icon-white\");\n");
      out.write("\t    \t\t$(\"#icon\").val($(this).text());\n");
      out.write("\t    \t});\n");
      out.write("\t    \t$(\"#icons li\").each(function(){\n");
      out.write("\t    \t\tif ($(this).text()==\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"){\n");
      out.write("\t    \t\t\t$(this).click();\n");
      out.write("\t    \t\t}\n");
      out.write("\t    \t});\n");
      out.write("\t    \t$(\"#icons li\").dblclick(function(){\n");
      out.write("\t    \t\ttop.$.jBox.getBox().find(\"button[value='ok']\").trigger(\"click\");\n");
      out.write("\t    \t});\n");
      out.write("\t    });\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<input type=\"hidden\" id=\"icon\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("<div id=\"icons\">\n");
      out.write("\t\t\n");
      out.write("\t    <h2 class=\"page-header\"> Web 应用的图标</h2>\n");
      out.write("\t    \n");
      out.write("\t    <ul class=\"the-icons\">\n");
      out.write("\t      <li><i class=\"icon-adjust\"></i> icon-adjust</li>\n");
      out.write("\t      <li><i class=\"icon-asterisk\"></i> icon-asterisk</li>\n");
      out.write("\t      <li><i class=\"icon-ban-circle\"></i> icon-ban-circle</li>\n");
      out.write("\t      <li><i class=\"icon-bar-chart\"></i> icon-bar-chart</li>\n");
      out.write("\t      <li><i class=\"icon-barcode\"></i> icon-barcode</li>\n");
      out.write("\t      <li><i class=\"icon-beaker\"></i> icon-beaker</li>\n");
      out.write("\t      <li><i class=\"icon-beer\"></i> icon-beer</li>\n");
      out.write("\t      <li><i class=\"icon-bell\"></i> icon-bell</li>\n");
      out.write("\t      <li><i class=\"icon-bell-alt\"></i> icon-bell-alt</li>\n");
      out.write("\t      <li><i class=\"icon-bolt\"></i> icon-bolt</li>\n");
      out.write("\t      <li><i class=\"icon-book\"></i> icon-book</li>\n");
      out.write("\t      <li><i class=\"icon-bookmark\"></i> icon-bookmark</li>\n");
      out.write("\t      <li><i class=\"icon-bookmark-empty\"></i> icon-bookmark-empty</li>\n");
      out.write("\t      <li><i class=\"icon-briefcase\"></i> icon-briefcase</li>\n");
      out.write("\t      <li><i class=\"icon-bullhorn\"></i> icon-bullhorn</li>\n");
      out.write("\t      <li><i class=\"icon-calendar\"></i> icon-calendar</li>\n");
      out.write("\t      <li><i class=\"icon-camera\"></i> icon-camera</li>\n");
      out.write("\t      <li><i class=\"icon-camera-retro\"></i> icon-camera-retro</li>\n");
      out.write("\t      <li><i class=\"icon-certificate\"></i> icon-certificate</li>\n");
      out.write("\t      <li><i class=\"icon-check\"></i> icon-check</li>\n");
      out.write("\t      <li><i class=\"icon-check-empty\"></i> icon-check-empty</li>\n");
      out.write("\t      <li><i class=\"icon-circle\"></i> icon-circle</li>\n");
      out.write("\t      <li><i class=\"icon-circle-blank\"></i> icon-circle-blank</li>\n");
      out.write("\t      <li><i class=\"icon-cloud\"></i> icon-cloud</li>\n");
      out.write("\t      <li><i class=\"icon-cloud-download\"></i> icon-cloud-download</li>\n");
      out.write("\t      <li><i class=\"icon-cloud-upload\"></i> icon-cloud-upload</li>\n");
      out.write("\t      <li><i class=\"icon-coffee\"></i> icon-coffee</li>\n");
      out.write("\t      <li><i class=\"icon-cog\"></i> icon-cog</li>\n");
      out.write("\t      <li><i class=\"icon-cogs\"></i> icon-cogs</li>\n");
      out.write("\t      <li><i class=\"icon-comment\"></i> icon-comment</li>\n");
      out.write("\t      <li><i class=\"icon-comment-alt\"></i> icon-comment-alt</li>\n");
      out.write("\t      <li><i class=\"icon-comments\"></i> icon-comments</li>\n");
      out.write("\t      <li><i class=\"icon-comments-alt\"></i> icon-comments-alt</li>\n");
      out.write("\t      <li><i class=\"icon-credit-card\"></i> icon-credit-card</li>\n");
      out.write("\t      <li><i class=\"icon-dashboard\"></i> icon-dashboard</li>\n");
      out.write("\t      <li><i class=\"icon-desktop\"></i> icon-desktop</li>\n");
      out.write("\t      <li><i class=\"icon-download\"></i> icon-download</li>\n");
      out.write("\t      <li><i class=\"icon-download-alt\"></i> icon-download-alt</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-edit\"></i> icon-edit</li>\n");
      out.write("\t      <li><i class=\"icon-envelope\"></i> icon-envelope</li>\n");
      out.write("\t      <li><i class=\"icon-envelope-alt\"></i> icon-envelope-alt</li>\n");
      out.write("\t      <li><i class=\"icon-exchange\"></i> icon-exchange</li>\n");
      out.write("\t      <li><i class=\"icon-exclamation-sign\"></i> icon-exclamation-sign</li>\n");
      out.write("\t      <li><i class=\"icon-external-link\"></i> icon-external-link</li>\n");
      out.write("\t      <li><i class=\"icon-eye-close\"></i> icon-eye-close</li>\n");
      out.write("\t      <li><i class=\"icon-eye-open\"></i> icon-eye-open</li>\n");
      out.write("\t      <li><i class=\"icon-facetime-video\"></i> icon-facetime-video</li>\n");
      out.write("\t      <li><i class=\"icon-fighter-jet\"></i> icon-fighter-jet</li>\n");
      out.write("\t      <li><i class=\"icon-film\"></i> icon-film</li>\n");
      out.write("\t      <li><i class=\"icon-filter\"></i> icon-filter</li>\n");
      out.write("\t      <li><i class=\"icon-fire\"></i> icon-fire</li>\n");
      out.write("\t      <li><i class=\"icon-flag\"></i> icon-flag</li>\n");
      out.write("\t      <li><i class=\"icon-folder-close\"></i> icon-folder-close</li>\n");
      out.write("\t      <li><i class=\"icon-folder-open\"></i> icon-folder-open</li>\n");
      out.write("\t      <li><i class=\"icon-folder-close-alt\"></i> icon-folder-close-alt</li>\n");
      out.write("\t      <li><i class=\"icon-folder-open-alt\"></i> icon-folder-open-alt</li>\n");
      out.write("\t      <li><i class=\"icon-food\"></i> icon-food</li>\n");
      out.write("\t      <li><i class=\"icon-gift\"></i> icon-gift</li>\n");
      out.write("\t      <li><i class=\"icon-glass\"></i> icon-glass</li>\n");
      out.write("\t      <li><i class=\"icon-globe\"></i> icon-globe</li>\n");
      out.write("\t      <li><i class=\"icon-group\"></i> icon-group</li>\n");
      out.write("\t      <li><i class=\"icon-hdd\"></i> icon-hdd</li>\n");
      out.write("\t      <li><i class=\"icon-headphones\"></i> icon-headphones</li>\n");
      out.write("\t      <li><i class=\"icon-heart\"></i> icon-heart</li>\n");
      out.write("\t      <li><i class=\"icon-heart-empty\"></i> icon-heart-empty</li>\n");
      out.write("\t      <li><i class=\"icon-home\"></i> icon-home</li>\n");
      out.write("\t      <li><i class=\"icon-inbox\"></i> icon-inbox</li>\n");
      out.write("\t      <li><i class=\"icon-info-sign\"></i> icon-info-sign</li>\n");
      out.write("\t      <li><i class=\"icon-key\"></i> icon-key</li>\n");
      out.write("\t      <li><i class=\"icon-leaf\"></i> icon-leaf</li>\n");
      out.write("\t      <li><i class=\"icon-laptop\"></i> icon-laptop</li>\n");
      out.write("\t      <li><i class=\"icon-legal\"></i> icon-legal</li>\n");
      out.write("\t      <li><i class=\"icon-lemon\"></i> icon-lemon</li>\n");
      out.write("\t      <li><i class=\"icon-lightbulb\"></i> icon-lightbulb</li>\n");
      out.write("\t      <li><i class=\"icon-lock\"></i> icon-lock</li>\n");
      out.write("\t      <li><i class=\"icon-unlock\"></i> icon-unlock</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-magic\"></i> icon-magic</li>\n");
      out.write("\t      <li><i class=\"icon-magnet\"></i> icon-magnet</li>\n");
      out.write("\t      <li><i class=\"icon-map-marker\"></i> icon-map-marker</li>\n");
      out.write("\t      <li><i class=\"icon-minus\"></i> icon-minus</li>\n");
      out.write("\t      <li><i class=\"icon-minus-sign\"></i> icon-minus-sign</li>\n");
      out.write("\t      <li><i class=\"icon-mobile-phone\"></i> icon-mobile-phone</li>\n");
      out.write("\t      <li><i class=\"icon-money\"></i> icon-money</li>\n");
      out.write("\t      <li><i class=\"icon-move\"></i> icon-move</li>\n");
      out.write("\t      <li><i class=\"icon-music\"></i> icon-music</li>\n");
      out.write("\t      <li><i class=\"icon-off\"></i> icon-off</li>\n");
      out.write("\t      <li><i class=\"icon-ok\"></i> icon-ok</li>\n");
      out.write("\t      <li><i class=\"icon-ok-circle\"></i> icon-ok-circle</li>\n");
      out.write("\t      <li><i class=\"icon-ok-sign\"></i> icon-ok-sign</li>\n");
      out.write("\t      <li><i class=\"icon-pencil\"></i> icon-pencil</li>\n");
      out.write("\t      <li><i class=\"icon-picture\"></i> icon-picture</li>\n");
      out.write("\t      <li><i class=\"icon-plane\"></i> icon-plane</li>\n");
      out.write("\t      <li><i class=\"icon-plus\"></i> icon-plus</li>\n");
      out.write("\t      <li><i class=\"icon-plus-sign\"></i> icon-plus-sign</li>\n");
      out.write("\t      <li><i class=\"icon-print\"></i> icon-print</li>\n");
      out.write("\t      <li><i class=\"icon-pushpin\"></i> icon-pushpin</li>\n");
      out.write("\t      <li><i class=\"icon-qrcode\"></i> icon-qrcode</li>\n");
      out.write("\t      <li><i class=\"icon-question-sign\"></i> icon-question-sign</li>\n");
      out.write("\t      <li><i class=\"icon-quote-left\"></i> icon-quote-left</li>\n");
      out.write("\t      <li><i class=\"icon-quote-right\"></i> icon-quote-right</li>\n");
      out.write("\t      <li><i class=\"icon-random\"></i> icon-random</li>\n");
      out.write("\t      <li><i class=\"icon-refresh\"></i> icon-refresh</li>\n");
      out.write("\t      <li><i class=\"icon-remove\"></i> icon-remove</li>\n");
      out.write("\t      <li><i class=\"icon-remove-circle\"></i> icon-remove-circle</li>\n");
      out.write("\t      <li><i class=\"icon-remove-sign\"></i> icon-remove-sign</li>\n");
      out.write("\t      <li><i class=\"icon-reorder\"></i> icon-reorder</li>\n");
      out.write("\t      <li><i class=\"icon-reply\"></i> icon-reply</li>\n");
      out.write("\t      <li><i class=\"icon-resize-horizontal\"></i> icon-resize-horizontal</li>\n");
      out.write("\t      <li><i class=\"icon-resize-vertical\"></i> icon-resize-vertical</li>\n");
      out.write("\t      <li><i class=\"icon-retweet\"></i> icon-retweet</li>\n");
      out.write("\t      <li><i class=\"icon-road\"></i> icon-road</li>\n");
      out.write("\t      <li><i class=\"icon-rss\"></i> icon-rss</li>\n");
      out.write("\t      <li><i class=\"icon-screenshot\"></i> icon-screenshot</li>\n");
      out.write("\t      <li><i class=\"icon-search\"></i> icon-search</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-share\"></i> icon-share</li>\n");
      out.write("\t      <li><i class=\"icon-share-alt\"></i> icon-share-alt</li>\n");
      out.write("\t      <li><i class=\"icon-shopping-cart\"></i> icon-shopping-cart</li>\n");
      out.write("\t      <li><i class=\"icon-signal\"></i> icon-signal</li>\n");
      out.write("\t      <li><i class=\"icon-signin\"></i> icon-signin</li>\n");
      out.write("\t      <li><i class=\"icon-signout\"></i> icon-signout</li>\n");
      out.write("\t      <li><i class=\"icon-sitemap\"></i> icon-sitemap</li>\n");
      out.write("\t      <li><i class=\"icon-sort\"></i> icon-sort</li>\n");
      out.write("\t      <li><i class=\"icon-sort-down\"></i> icon-sort-down</li>\n");
      out.write("\t      <li><i class=\"icon-sort-up\"></i> icon-sort-up</li>\n");
      out.write("\t      <li><i class=\"icon-spinner\"></i> icon-spinner</li>\n");
      out.write("\t      <li><i class=\"icon-star\"></i> icon-star</li>\n");
      out.write("\t      <li><i class=\"icon-star-empty\"></i> icon-star-empty</li>\n");
      out.write("\t      <li><i class=\"icon-star-half\"></i> icon-star-half</li>\n");
      out.write("\t      <li><i class=\"icon-tablet\"></i> icon-tablet</li>\n");
      out.write("\t      <li><i class=\"icon-tag\"></i> icon-tag</li>\n");
      out.write("\t      <li><i class=\"icon-tags\"></i> icon-tags</li>\n");
      out.write("\t      <li><i class=\"icon-tasks\"></i> icon-tasks</li>\n");
      out.write("\t      <li><i class=\"icon-thumbs-down\"></i> icon-thumbs-down</li>\n");
      out.write("\t      <li><i class=\"icon-thumbs-up\"></i> icon-thumbs-up</li>\n");
      out.write("\t      <li><i class=\"icon-time\"></i> icon-time</li>\n");
      out.write("\t      <li><i class=\"icon-tint\"></i> icon-tint</li>\n");
      out.write("\t      <li><i class=\"icon-trash\"></i> icon-trash</li>\n");
      out.write("\t      <li><i class=\"icon-trophy\"></i> icon-trophy</li>\n");
      out.write("\t      <li><i class=\"icon-truck\"></i> icon-truck</li>\n");
      out.write("\t      <li><i class=\"icon-umbrella\"></i> icon-umbrella</li>\n");
      out.write("\t      <li><i class=\"icon-upload\"></i> icon-upload</li>\n");
      out.write("\t      <li><i class=\"icon-upload-alt\"></i> icon-upload-alt</li>\n");
      out.write("\t      <li><i class=\"icon-user\"></i> icon-user</li>\n");
      out.write("\t      <li><i class=\"icon-user-md\"></i> icon-user-md</li>\n");
      out.write("\t      <li><i class=\"icon-volume-off\"></i> icon-volume-off</li>\n");
      out.write("\t      <li><i class=\"icon-volume-down\"></i> icon-volume-down</li>\n");
      out.write("\t      <li><i class=\"icon-volume-up\"></i> icon-volume-up</li>\n");
      out.write("\t      <li><i class=\"icon-warning-sign\"></i> icon-warning-sign</li>\n");
      out.write("\t      <li><i class=\"icon-wrench\"></i> icon-wrench</li>\n");
      out.write("\t      <li><i class=\"icon-zoom-in\"></i> icon-zoom-in</li>\n");
      out.write("\t      <li><i class=\"icon-zoom-out\"></i> icon-zoom-out</li>\n");
      out.write("\t    </ul>\n");
      out.write("\t\n");
      out.write("\t  \n");
      out.write("\t    <h2 class=\"page-header\">文本编辑器图标</h2>\n");
      out.write("\t  \n");
      out.write("\t    <ul class=\"the-icons\">\n");
      out.write("\t      <li><i class=\"icon-file\"></i> icon-file</li>\n");
      out.write("\t      <li><i class=\"icon-file-alt\"></i> icon-file-alt</li>\n");
      out.write("\t      <li><i class=\"icon-cut\"></i> icon-cut</li>\n");
      out.write("\t      <li><i class=\"icon-copy\"></i> icon-copy</li>\n");
      out.write("\t      <li><i class=\"icon-paste\"></i> icon-paste</li>\n");
      out.write("\t      <li><i class=\"icon-save\"></i> icon-save</li>\n");
      out.write("\t      <li><i class=\"icon-undo\"></i> icon-undo</li>\n");
      out.write("\t      <li><i class=\"icon-repeat\"></i> icon-repeat</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-text-height\"></i> icon-text-height</li>\n");
      out.write("\t      <li><i class=\"icon-text-width\"></i> icon-text-width</li>\n");
      out.write("\t      <li><i class=\"icon-align-left\"></i> icon-align-left</li>\n");
      out.write("\t      <li><i class=\"icon-align-center\"></i> icon-align-center</li>\n");
      out.write("\t      <li><i class=\"icon-align-right\"></i> icon-align-right</li>\n");
      out.write("\t      <li><i class=\"icon-align-justify\"></i> icon-align-justify</li>\n");
      out.write("\t      <li><i class=\"icon-indent-left\"></i> icon-indent-left</li>\n");
      out.write("\t      <li><i class=\"icon-indent-right\"></i> icon-indent-right</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-font\"></i> icon-font</li>\n");
      out.write("\t      <li><i class=\"icon-bold\"></i> icon-bold</li>\n");
      out.write("\t      <li><i class=\"icon-italic\"></i> icon-italic</li>\n");
      out.write("\t      <li><i class=\"icon-strikethrough\"></i> icon-strikethrough</li>\n");
      out.write("\t      <li><i class=\"icon-underline\"></i> icon-underline</li>\n");
      out.write("\t      <li><i class=\"icon-link\"></i> icon-link</li>\n");
      out.write("\t      <li><i class=\"icon-paper-clip\"></i> icon-paper-clip</li>\n");
      out.write("\t      <li><i class=\"icon-columns\"></i> icon-columns</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-table\"></i> icon-table</li>\n");
      out.write("\t      <li><i class=\"icon-th-large\"></i> icon-th-large</li>\n");
      out.write("\t      <li><i class=\"icon-th\"></i> icon-th</li>\n");
      out.write("\t      <li><i class=\"icon-th-list\"></i> icon-th-list</li>\n");
      out.write("\t      <li><i class=\"icon-list\"></i> icon-list</li>\n");
      out.write("\t      <li><i class=\"icon-list-ol\"></i> icon-list-ol</li>\n");
      out.write("\t      <li><i class=\"icon-list-ul\"></i> icon-list-ul</li>\n");
      out.write("\t      <li><i class=\"icon-list-alt\"></i> icon-list-alt</li>\n");
      out.write("\t    </ul>\n");
      out.write("\t\n");
      out.write("\t    <h2 class=\"page-header\">指示方向的图标</h2>\n");
      out.write("\t  \n");
      out.write("\t    <ul class=\"the-icons\">\n");
      out.write("\t      <li><i class=\"icon-angle-left\"></i> icon-angle-left</li>\n");
      out.write("\t      <li><i class=\"icon-angle-right\"></i> icon-angle-right</li>\n");
      out.write("\t      <li><i class=\"icon-angle-up\"></i> icon-angle-up</li>\n");
      out.write("\t      <li><i class=\"icon-angle-down\"></i> icon-angle-down</li>\n");
      out.write("\t      <li><i class=\"icon-arrow-down\"></i> icon-arrow-down</li>\n");
      out.write("\t      <li><i class=\"icon-arrow-left\"></i> icon-arrow-left</li>\n");
      out.write("\t      <li><i class=\"icon-arrow-right\"></i> icon-arrow-right</li>\n");
      out.write("\t      <li><i class=\"icon-arrow-up\"></i> icon-arrow-up</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-caret-down\"></i> icon-caret-down</li>\n");
      out.write("\t      <li><i class=\"icon-caret-left\"></i> icon-caret-left</li>\n");
      out.write("\t      <li><i class=\"icon-caret-right\"></i> icon-caret-right</li>\n");
      out.write("\t      <li><i class=\"icon-caret-up\"></i> icon-caret-up</li>\n");
      out.write("\t      <li><i class=\"icon-chevron-down\"></i> icon-chevron-down</li>\n");
      out.write("\t      <li><i class=\"icon-chevron-left\"></i> icon-chevron-left</li>\n");
      out.write("\t      <li><i class=\"icon-chevron-right\"></i> icon-chevron-right</li>\n");
      out.write("\t      <li><i class=\"icon-chevron-up\"></i> icon-chevron-up</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-circle-arrow-down\"></i> icon-circle-arrow-down</li>\n");
      out.write("\t      <li><i class=\"icon-circle-arrow-left\"></i> icon-circle-arrow-left</li>\n");
      out.write("\t      <li><i class=\"icon-circle-arrow-right\"></i> icon-circle-arrow-right</li>\n");
      out.write("\t      <li><i class=\"icon-circle-arrow-up\"></i> icon-circle-arrow-up</li>\n");
      out.write("\t      <li><i class=\"icon-double-angle-left\"></i> icon-double-angle-left</li>\n");
      out.write("\t      <li><i class=\"icon-double-angle-right\"></i> icon-double-angle-right</li>\n");
      out.write("\t      <li><i class=\"icon-double-angle-up\"></i> icon-double-angle-up</li>\n");
      out.write("\t      <li><i class=\"icon-double-angle-down\"></i> icon-double-angle-down</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-hand-down\"></i> icon-hand-down</li>\n");
      out.write("\t      <li><i class=\"icon-hand-left\"></i> icon-hand-left</li>\n");
      out.write("\t      <li><i class=\"icon-hand-right\"></i> icon-hand-right</li>\n");
      out.write("\t      <li><i class=\"icon-hand-up\"></i> icon-hand-up</li>\n");
      out.write("\t      <li><i class=\"icon-circle\"></i> icon-circle</li>\n");
      out.write("\t      <li><i class=\"icon-circle-blank\"></i> icon-circle-blank</li>\n");
      out.write("\t    </ul>\n");
      out.write("\t  \n");
      out.write("\t\n");
      out.write("\t    <h2 class=\"page-header\">视频播放器图标</h2>\n");
      out.write("\t  \n");
      out.write("\t    <ul class=\"the-icons\">\n");
      out.write("\t      <li><i class=\"icon-play-circle\"></i> icon-play-circle</li>\n");
      out.write("\t      <li><i class=\"icon-play\"></i> icon-play</li>\n");
      out.write("\t      <li><i class=\"icon-pause\"></i> icon-pause</li>\n");
      out.write("\t      <li><i class=\"icon-stop\"></i> icon-stop</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-step-backward\"></i> icon-step-backward</li>\n");
      out.write("\t      <li><i class=\"icon-fast-backward\"></i> icon-fast-backward</li>\n");
      out.write("\t      <li><i class=\"icon-backward\"></i> icon-backward</li>\n");
      out.write("\t      <li><i class=\"icon-forward\"></i> icon-forward</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-fast-forward\"></i> icon-fast-forward</li>\n");
      out.write("\t      <li><i class=\"icon-step-forward\"></i> icon-step-forward</li>\n");
      out.write("\t      <li><i class=\"icon-eject\"></i> icon-eject</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-fullscreen\"></i> icon-fullscreen</li>\n");
      out.write("\t      <li><i class=\"icon-resize-full\"></i> icon-resize-full</li>\n");
      out.write("\t      <li><i class=\"icon-resize-small\"></i> icon-resize-small</li>\n");
      out.write("\t    </ul>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t    <h2 class=\"page-header\">SNS图标</h2>\n");
      out.write("\t  \n");
      out.write("\t    <ul class=\"the-icons\">\n");
      out.write("\t      <li><i class=\"icon-phone\"></i> icon-phone</li>\n");
      out.write("\t      <li><i class=\"icon-phone-sign\"></i> icon-phone-sign</li>\n");
      out.write("\t      <li><i class=\"icon-facebook\"></i> icon-facebook</li>\n");
      out.write("\t      <li><i class=\"icon-facebook-sign\"></i> icon-facebook-sign</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-twitter\"></i> icon-twitter</li>\n");
      out.write("\t      <li><i class=\"icon-twitter-sign\"></i> icon-twitter-sign</li>\n");
      out.write("\t      <li><i class=\"icon-github\"></i> icon-github</li>\n");
      out.write("\t      <li><i class=\"icon-github-alt\"></i> icon-github-alt</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-github-sign\"></i> icon-github-sign</li>\n");
      out.write("\t      <li><i class=\"icon-linkedin\"></i> icon-linkedin</li>\n");
      out.write("\t      <li><i class=\"icon-linkedin-sign\"></i> icon-linkedin-sign</li>\n");
      out.write("\t      <li><i class=\"icon-pinterest\"></i> icon-pinterest</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-pinterest-sign\"></i> icon-pinterest-sign</li>\n");
      out.write("\t      <li><i class=\"icon-google-plus\"></i> icon-google-plus</li>\n");
      out.write("\t      <li><i class=\"icon-google-plus-sign\"></i> icon-google-plus-sign</li>\n");
      out.write("\t      <li><i class=\"icon-sign-blank\"></i> icon-sign-blank</li>\n");
      out.write("\t    </ul>\n");
      out.write("\t  \n");
      out.write("\t  \n");
      out.write("\t    <h2 class=\"page-header\">医疗图标</h2>\n");
      out.write("\t  \n");
      out.write("\t    <ul class=\"the-icons\">\n");
      out.write("\t      <li><i class=\"icon-ambulance\"></i> icon-ambulance</li>\n");
      out.write("\t      <li><i class=\"icon-beaker\"></i> icon-beaker</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-h-sign\"></i> icon-h-sign</li>\n");
      out.write("\t      <li><i class=\"icon-hospital\"></i> icon-hospital</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-medkit\"></i> icon-medkit</li>\n");
      out.write("\t      <li><i class=\"icon-plus-sign-alt\"></i> icon-plus-sign-alt</li>\n");
      out.write("\t    \n");
      out.write("\n");
      out.write("\t      <li><i class=\"icon-stethoscope\"></i> icon-stethoscope</li>\n");
      out.write("\t      <li><i class=\"icon-user-md\"></i> icon-user-md</li>\n");
      out.write("\t    </ul>\n");
      out.write("\t<br/><br/>\n");
      out.write("</div>\n");
      out.write("</body>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/include/taglib.jsp(11,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/views/include/taglib.jsp(11,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}${fns:getAdminPath()}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /WEB-INF/views/include/taglib.jsp(12,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("ctxStatic");
    // /WEB-INF/views/include/taglib.jsp(12,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/static", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }
}
