/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-20 04:57:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/index/aside.jsp", Long.valueOf(1539069913886L));
    _jspx_dependants.put("/index/../index/common.jsp", Long.valueOf(1536824037932L));
    _jspx_dependants.put("/index/header.jsp", Long.valueOf(1539054546891L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"description\" content=\"Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.\">\n");
      out.write("    <!-- Twitter meta-->\n");
      out.write("    <meta property=\"twitter:card\" content=\"summary_large_image\">\n");
      out.write("    <meta property=\"twitter:site\" content=\"@pratikborsadiya\">\n");
      out.write("    <meta property=\"twitter:creator\" content=\"@pratikborsadiya\">\n");
      out.write("    <!-- Open Graph Meta-->\n");
      out.write("    <meta property=\"og:type\" content=\"website\">\n");
      out.write("    <meta property=\"og:site_name\" content=\"Vali Admin\">\n");
      out.write("    <meta property=\"og:title\" content=\"Vali - Free Bootstrap 4 admin theme\">\n");
      out.write("    <meta property=\"og:url\" content=\"http://pratikborsadiya.in/blog/vali-admin\">\n");
      out.write("    <meta property=\"og:image\" content=\"http://pratikborsadiya.in/blog/vali-admin/hero-social.png\">\n");
      out.write("    <meta property=\"og:description\" content=\"Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.\">\n");
      out.write("    <title>高薪启蒙云平台</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("   \n");
      out.write("    <!-- Font-icon css-->\n");
      out.write("   \n");
      out.write("  </head>\n");
      out.write("  <body class=\"app sidebar-mini rtl\">\n");
      out.write("    <!-- Navbar-->\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');
      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!-- ");
      out.print(basePath);
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("/static/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("/static/main/js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("/static/main/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("/static/main/js/main.js\"></script>\r\n");
      out.write("    <!-- The javascript plugin to display page loading on top-->\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("/static/main/js/plugins/pace.min.js\"></script>\r\n");
      out.write("    <!-- Page specific javascripts-->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/static/main/js/plugins/chart.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("/static/main/css/main.css\">");
      out.write("\r\n");
      out.write(" <header class=\"app-header\"><a class=\"app-header__logo\" href=\"index.jsp\"></a>\r\n");
      out.write("      <!-- Sidebar toggle button--><a class=\"app-sidebar__toggle\" href=\"#\" data-toggle=\"sidebar\" aria-label=\"Hide Sidebar\"></a>\r\n");
      out.write("      <!-- Navbar Right Menu-->\r\n");
      out.write("      <ul class=\"app-nav\">\r\n");
      out.write("        <li class=\"app-search\">\r\n");
      out.write("          <input class=\"app-search__input\" type=\"search\" placeholder=\"Search\">\r\n");
      out.write("          <button class=\"app-search__button\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("        </li>\r\n");
      out.write("        <!--Notification Menu-->\r\n");
      out.write("        <li class=\"dropdown\"><a class=\"app-nav__item\" href=\"#\" data-toggle=\"dropdown\" aria-label=\"Show notifications\"><i class=\"fa fa-bell-o fa-lg\"></i></a>\r\n");
      out.write("          <ul class=\"app-notification dropdown-menu dropdown-menu-right\">\r\n");
      out.write("            <li class=\"app-notification__title\">You have 4 new notifications.</li>\r\n");
      out.write("            <div class=\"app-notification__content\">\r\n");
      out.write("              <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-primary\"></i><i class=\"fa fa-envelope fa-stack-1x fa-inverse\"></i></span></span>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <p class=\"app-notification__message\">Lisa sent you a mail</p>\r\n");
      out.write("                    <p class=\"app-notification__meta\">2 min ago</p>\r\n");
      out.write("                  </div></a></li>\r\n");
      out.write("              <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-danger\"></i><i class=\"fa fa-hdd-o fa-stack-1x fa-inverse\"></i></span></span>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <p class=\"app-notification__message\">Mail server not working</p>\r\n");
      out.write("                    <p class=\"app-notification__meta\">5 min ago</p>\r\n");
      out.write("                  </div></a></li>\r\n");
      out.write("              <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-success\"></i><i class=\"fa fa-money fa-stack-1x fa-inverse\"></i></span></span>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <p class=\"app-notification__message\">Transaction complete</p>\r\n");
      out.write("                    <p class=\"app-notification__meta\">2 days ago</p>\r\n");
      out.write("                  </div></a></li>\r\n");
      out.write("              <div class=\"app-notification__content\">\r\n");
      out.write("                <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-primary\"></i><i class=\"fa fa-envelope fa-stack-1x fa-inverse\"></i></span></span>\r\n");
      out.write("                    <div>\r\n");
      out.write("                      <p class=\"app-notification__message\">Lisa sent you a mail</p>\r\n");
      out.write("                      <p class=\"app-notification__meta\">2 min ago</p>\r\n");
      out.write("                    </div></a></li>\r\n");
      out.write("                <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-danger\"></i><i class=\"fa fa-hdd-o fa-stack-1x fa-inverse\"></i></span></span>\r\n");
      out.write("                    <div>\r\n");
      out.write("                      <p class=\"app-notification__message\">Mail server not working</p>\r\n");
      out.write("                      <p class=\"app-notification__meta\">5 min ago</p>\r\n");
      out.write("                    </div></a></li>\r\n");
      out.write("                <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-success\"></i><i class=\"fa fa-money fa-stack-1x fa-inverse\"></i></span></span>\r\n");
      out.write("                    <div>\r\n");
      out.write("                      <p class=\"app-notification__message\">Transaction complete</p>\r\n");
      out.write("                      <p class=\"app-notification__meta\">2 days ago</p>\r\n");
      out.write("                    </div></a></li>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <li class=\"app-notification__footer\"><a href=\"#\">See all notifications.</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <!-- User Menu-->\r\n");
      out.write("        <li class=\"dropdown\"><a class=\"app-nav__item\" href=\"#\" data-toggle=\"dropdown\" aria-label=\"Open Profile Menu\"><i class=\"fa fa-user fa-lg\"></i></a>\r\n");
      out.write("          <ul class=\"dropdown-menu settings-menu dropdown-menu-right\">\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"page-user.html\"><i class=\"fa fa-cog fa-lg\"></i> Settings</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"sys/personalData\"><i class=\"fa fa-user fa-lg\"></i> Profile</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"page-login.html\"><i class=\"fa fa-sign-out fa-lg\"></i> Logout</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      \r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
      out.write("\r\n");
      out.write(" <!-- Sidebar menu-->\r\n");
      out.write("    <div class=\"app-sidebar__overlay\" data-toggle=\"sidebar\"></div>\r\n");
      out.write("    <aside class=\"app-sidebar\">\r\n");
      out.write("      <div class=\"app-sidebar__user\">\r\n");
      out.write("        <div>\r\n");
      out.write("          <p class=\"app-sidebar__user-name\">John Doe</p>\r\n");
      out.write("          <p class=\"app-sidebar__user-designation\">Frontend Developer</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <ul class=\"app-menu\" id=\"show\">\r\n");
      out.write("        \r\n");
      out.write("      </ul>\r\n");
      out.write("       <script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("\t     $.ajax({\r\n");
      out.write("\t\t\turl: '");
      out.print(basePath);
      out.write("yun/left/getLeftMenus',\r\n");
      out.write("\t \t\tdata:{},\r\n");
      out.write("\t\t\ttype: 'get',\r\n");
      out.write("\t\t\tdataType: 'json',\r\n");
      out.write("\t\t\tsuccess: function(jsonDataResult) {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar curPathName = window.location.pathname;\r\n");
      out.write("\t\t\t\tvar item=\"\";\r\n");
      out.write("\t\t\t\tvar curIsExpandIdx = 0;\r\n");
      out.write("\t\t\t\tjsonDataResult.forEach(function(curObj,index){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\titem += \" <li class='treeview'><a class='app-menu__item' href='#' data-toggle='treeview'><i class='app-menu__icon fa \"+curObj.menuIcon+\"'></i><span class='app-menu__label'>\"+curObj.menuName+\"</span><i class='treeview-indicator fa fa-angle-right'></i></a>\";\r\n");
      out.write("\t\t\t\t\titem +=\"<ul class='treeview-menu' >\";\r\n");
      out.write("\t\t\t\t\tif(curObj.children&& curObj.children.length>0){\r\n");
      out.write("\t\t\t\t\t\t(function(argIdx){\r\n");
      out.write("\t\t\t\t\t\t\tcurObj.children.forEach(function(innerObj,innerIdx){\r\n");
      out.write("\t\t\t\t\t\t\t\tif(innerObj.menuUrl&&innerObj.menuUrl!=\"\" && (curPathName.toString().indexOf(innerObj.menuUrl.toString())!=-1)){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcurIsExpandIdx=argIdx;\r\n");
      out.write("\t\t\t\t\t\t\t\t\titem += \"<li><a class='treeview-item active' href='");
      out.print(basePath);
      out.write("\"+innerObj.menuUrl+\"'><i class='icon fa \"+innerObj.menuIcon+\"'></i> \"+innerObj.menuName+\"</a></li>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\titem += \"<li><a class='treeview-item' href='");
      out.print(basePath);
      out.write("\"+innerObj.menuUrl+\"'><i class='icon fa \"+innerObj.menuIcon+\"'></i> \"+innerObj.menuName+\"</a></li>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t})(index)\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\titem +=\" </ul>\";\r\n");
      out.write("\t\t\t\t\titem +=\"</li>\"\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$('#show').append(item);\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\tconsole.log(curIsExpandIdx);\r\n");
      out.write("\t\t\t\t$(\"#show >li\").eq(curIsExpandIdx).addClass(\"is-expanded\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(document).on('click', '#show>li', function(){\r\n");
      out.write("\t\t\t\t\tif($(this).hasClass('is-expanded')){\r\n");
      out.write("\t\t\t\t\t\t$(this).removeClass(\"is-expanded\");\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t$(this).addClass(\"is-expanded\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t   error: function(XMLHttpRequest, textStatus, errorThrown) {\r\n");
      out.write("\t\t\t\t   alert(XMLHttpRequest.status);\r\n");
      out.write("\t\t\t\t   alert(XMLHttpRequest.readyState);\r\n");
      out.write("\t\t\t\t   alert(textStatus);\r\n");
      out.write("\t\t\t\t     }\r\n");
      out.write("\t\t})\r\n");
      out.write("    \t\r\n");
      out.write("    })\r\n");
      out.write("</script> \r\n");
      out.write("    </aside>\r\n");
      out.write("   \r\n");
      out.write("   ");
      out.write(' ');
      out.write('\n');
      out.write(' ');
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"app-sidebar__overlay\" data-toggle=\"sidebar\"></div>\n");
      out.write("    \n");
      out.write("    <main class=\"app-content\">\n");
      out.write("      <div class=\"app-title\">\n");
      out.write("        <div>\n");
      out.write("         <!--  <h3>专业只为高薪</h3>\n");
      out.write("          <p>云平台（Array老师：仅供学习使用）</p> -->\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"app-breadcrumb breadcrumb\">\n");
      out.write("          <li class=\"breadcrumb-item\"><i class=\"fa fa-home fa-lg\"></i></li>\n");
      out.write("          <li class=\"breadcrumb-item\"><a href=\"#\">Dashboard</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("          <div class=\"widget-small primary coloured-icon\"><i class=\"icon fa fa-users fa-3x\"></i>\n");
      out.write("            <div class=\"info\">\n");
      out.write("              <h4>Users</h4>\n");
      out.write("              <p><b>5</b></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("          <div class=\"widget-small info coloured-icon\"><i class=\"icon fa fa-thumbs-o-up fa-3x\"></i>\n");
      out.write("            <div class=\"info\">\n");
      out.write("              <h4>Likes</h4>\n");
      out.write("              <p><b>25</b></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("          <div class=\"widget-small warning coloured-icon\"><i class=\"icon fa fa-files-o fa-3x\"></i>\n");
      out.write("            <div class=\"info\">\n");
      out.write("              <h4>Uploades</h4>\n");
      out.write("              <p><b>10</b></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("          <div class=\"widget-small danger coloured-icon\"><i class=\"icon fa fa-star fa-3x\"></i>\n");
      out.write("            <div class=\"info\">\n");
      out.write("              <h4>Stars</h4>\n");
      out.write("              <p><b>500</b></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("          <div class=\"tile\">\n");
      out.write("            <h3 class=\"tile-title\">Monthly Sales</h3>\n");
      out.write("            <div class=\"embed-responsive embed-responsive-16by9\">\n");
      out.write("              <canvas class=\"embed-responsive-item\" id=\"lineChartDemo\"></canvas>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("          <div class=\"tile\">\n");
      out.write("            <h3 class=\"tile-title\">Support Requests</h3>\n");
      out.write("            <div class=\"embed-responsive embed-responsive-16by9\">\n");
      out.write("              <canvas class=\"embed-responsive-item\" id=\"pieChartDemo\"></canvas>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("          <div class=\"tile\">\n");
      out.write("            <h3 class=\"tile-title\">Features</h3>\n");
      out.write("            <ul>\n");
      out.write("              <li>Built with Bootstrap 4, SASS and PUG.js</li>\n");
      out.write("              <li>Fully responsive and modular code</li>\n");
      out.write("              <li>Seven pages including login, user profile and print friendly invoice page</li>\n");
      out.write("              <li>Smart integration of forgot password on login page</li>\n");
      out.write("              <li>Chart.js integration to display responsive charts</li>\n");
      out.write("              <li>Widgets to effectively display statistics</li>\n");
      out.write("              <li>Data tables with sort, search and paginate functionality</li>\n");
      out.write("              <li>Custom form elements like toggle buttons, auto-complete, tags and date-picker</li>\n");
      out.write("              <li>A inbuilt toast library for providing meaningful response messages to user's actions</li>\n");
      out.write("            </ul>\n");
      out.write("            <p>Vali is a free and responsive admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.</p>\n");
      out.write("            <p>Vali is is light-weight, expendable and good looking theme. The theme has all the features required in a dashboard theme but this features are built like plug and play module. Take a look at the <a href=\"http://pratikborsadiya.in/blog/vali-admin\" target=\"_blank\">documentation</a> about customizing the theme colors and functionality.</p>\n");
      out.write("            <p class=\"mt-4 mb-4\"><a class=\"btn btn-primary mr-2 mb-2\" href=\"http://pratikborsadiya.in/blog/vali-admin\" target=\"_blank\"><i class=\"fa fa-file\"></i>Docs</a><a class=\"btn btn-info mr-2 mb-2\" href=\"https://github.com/pratikborsadiya/vali-admin\" target=\"_blank\"><i class=\"fa fa-github\"></i>GitHub</a><a class=\"btn btn-success mr-2 mb-2\" href=\"https://github.com/pratikborsadiya/vali-admin/archive/master.zip\" target=\"_blank\"><i class=\"fa fa-download\"></i>Download</a></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("          <div class=\"tile\">\n");
      out.write("            <h3 class=\"tile-title\">Compatibility with frameworks</h3>\n");
      out.write("            <p>This theme is not built for a specific framework or technology like Angular or React etc. But due to it's modular nature it's very easy to incorporate it into any front-end or back-end framework like Angular, React or Laravel.</p>\n");
      out.write("            <p>Go to <a href=\"http://pratikborsadiya.in/blog/vali-admin\" target=\"_blank\">documentation</a> for more details about integrating this theme with various frameworks.</p>\n");
      out.write("            <p>The source code is available on GitHub. If anything is missing or weird please report it as an issue on <a href=\"https://github.com/pratikborsadiya/vali-admin\" target=\"_blank\">GitHub</a>. If you want to contribute to this theme pull requests are always welcome.</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      var data = {\n");
      out.write("      \tlabels: [\"January\", \"February\", \"March\", \"April\", \"May\"],\n");
      out.write("      \tdatasets: [\n");
      out.write("      \t\t{\n");
      out.write("      \t\t\tlabel: \"My First dataset\",\n");
      out.write("      \t\t\tfillColor: \"rgba(220,220,220,0.2)\",\n");
      out.write("      \t\t\tstrokeColor: \"rgba(220,220,220,1)\",\n");
      out.write("      \t\t\tpointColor: \"rgba(220,220,220,1)\",\n");
      out.write("      \t\t\tpointStrokeColor: \"#fff\",\n");
      out.write("      \t\t\tpointHighlightFill: \"#fff\",\n");
      out.write("      \t\t\tpointHighlightStroke: \"rgba(220,220,220,1)\",\n");
      out.write("      \t\t\tdata: [65, 59, 80, 81, 56]\n");
      out.write("      \t\t},\n");
      out.write("      \t\t{\n");
      out.write("      \t\t\tlabel: \"My Second dataset\",\n");
      out.write("      \t\t\tfillColor: \"rgba(151,187,205,0.2)\",\n");
      out.write("      \t\t\tstrokeColor: \"rgba(151,187,205,1)\",\n");
      out.write("      \t\t\tpointColor: \"rgba(151,187,205,1)\",\n");
      out.write("      \t\t\tpointStrokeColor: \"#fff\",\n");
      out.write("      \t\t\tpointHighlightFill: \"#fff\",\n");
      out.write("      \t\t\tpointHighlightStroke: \"rgba(151,187,205,1)\",\n");
      out.write("      \t\t\tdata: [28, 48, 40, 19, 86]\n");
      out.write("      \t\t}\n");
      out.write("      \t]\n");
      out.write("      };\n");
      out.write("      var pdata = [\n");
      out.write("      \t{\n");
      out.write("      \t\tvalue: 300,\n");
      out.write("      \t\tcolor: \"#46BFBD\",\n");
      out.write("      \t\thighlight: \"#5AD3D1\",\n");
      out.write("      \t\tlabel: \"Complete\"\n");
      out.write("      \t},\n");
      out.write("      \t{\n");
      out.write("      \t\tvalue: 50,\n");
      out.write("      \t\tcolor:\"#F7464A\",\n");
      out.write("      \t\thighlight: \"#FF5A5E\",\n");
      out.write("      \t\tlabel: \"In-Progress\"\n");
      out.write("      \t}\n");
      out.write("      ]\n");
      out.write("      \n");
      out.write("      var ctxl = $(\"#lineChartDemo\").get(0).getContext(\"2d\");\n");
      out.write("      var lineChart = new Chart(ctxl).Line(data);\n");
      out.write("      \n");
      out.write("      var ctxp = $(\"#pieChartDemo\").get(0).getContext(\"2d\");\n");
      out.write("      var pieChart = new Chart(ctxp).Pie(pdata);\n");
      out.write("    </script>\n");
      out.write("    <!-- Google analytics script-->\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      if(document.location.hostname == 'pratikborsadiya.in') {\n");
      out.write("      \t(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n");
      out.write("      \t(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n");
      out.write("      \tm=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n");
      out.write("      \t})(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n");
      out.write("      \tga('create', 'UA-72504830-1', 'auto');\n");
      out.write("      \tga('send', 'pageview');\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
}
