/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2017-06-05 03:14:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.rigatron.rigs4j.models.User;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/navbar.jsp", Long.valueOf(1496630680000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("           \r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("     <!-- <link rel='stylesheet' href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"> -->\r\n");
      out.write("     <title>One Page Resume</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link rel='stylesheet' href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("    <!--\r\n");
      out.write("     <style type=\"text/css\">\r\n");
      out.write("        * { margin: 0; padding: 0; }\r\n");
      out.write("        body { font: 16px Helvetica, Sans-Serif; line-height: 24px; background: url(images/noise.jpg); }\r\n");
      out.write("        .clear { clear: both; }\r\n");
      out.write("        #page-wrap { width: 800px; margin: 40px auto 60px; }\r\n");
      out.write("        #pic { float: right; margin: -30px 0 0 0; }\r\n");
      out.write("        h1 { margin: 0 0 16px 0; padding: 0 0 16px 0; font-size: 42px; font-weight: bold; letter-spacing: -2px; border-bottom: 1px solid #999; }\r\n");
      out.write("        h2 { font-size: 20px; margin: 0 0 6px 0; position: relative; }\r\n");
      out.write("        h2 span { position: absolute; bottom: 0; right: 0; font-style: italic; font-family: Georgia, Serif; font-size: 16px; color: #999; font-weight: normal; }\r\n");
      out.write("        p { margin: 0 0 16px 0; }\r\n");
      out.write("        a { color: #999; text-decoration: none; border-bottom: 1px dotted #999; }\r\n");
      out.write("        a:hover { border-bottom-style: solid; color: black; }\r\n");
      out.write("        ul { margin: 0 0 32px 17px; }\r\n");
      out.write("        #objective { width: 500px; float: left; }\r\n");
      out.write("        #objective p { font-family: Georgia, Serif; font-style: italic; color: #666; }\r\n");
      out.write("        dt { font-style: italic; font-weight: bold; font-size: 18px; text-align: right; padding: 0 26px 0 0; width: 150px; float: left; height: 100px; border-right: 1px solid #999;  }\r\n");
      out.write("        dd { width: 600px; float: right; }\r\n");
      out.write("        dd.clear { float: none; margin: 0; height: 15px; }\r\n");
      out.write("     </style>\r\n");
      out.write("     -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<link rel='stylesheet' href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"/\">Rigby4j</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("      <li class=\"active\"><a href=\"/\">Home</a></li>\r\n");
      out.write("      <li><a href=\"/aboutme/\">About Me</a></li>\r\n");
      out.write("      <li><a href=\"/interests/\">Interests</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <!-- <li><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li> -->\r\n");
      out.write("      <!-- <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li> -->\r\n");
      out.write("      <button type=\"button\" class=\"btn btn-default btn-lg\" data-toggle=\"modal\" data-target=\"#modalLogin\">Login</button>\r\n");
      out.write("      <button type=\"button\" class=\"btn btn-default btn-lg\" data-toggle=\"modal\" data-target=\"#modalRegister\">Register</button>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<div id=\"modalLogin\" class=\"modal fade\" role=\"dialog\">\r\n");
      out.write("  <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("    <!-- Modal content-->\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("        <h4 class=\"modal-title\">Login</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        <p>Login Credentials: </p>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"login_usr\">Name:</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"login_usr\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"login_pwd\">Password:</label>\r\n");
      out.write("          <input type=\"password\" class=\"form-control\" id=\"login_pwd\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button id='login_btnSubmit' type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Submit</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"modalRegister\" class=\"modal fade\" role=\"dialog\">\r\n");
      out.write("  <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("    <!-- Modal content-->\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("        <h4 class=\"modal-title\">Register</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        <p>Register New User</p>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"register_usr\">Name:</label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"register_usr\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"register_pwd\">Password:</label>\r\n");
      out.write("          <input type=\"password\" class=\"form-control\" id=\"register_pwd\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button id='register_btnSubmit' type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Submit</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        $(\"#register_btnSubmit\").click(function(){\r\n");
      out.write("\r\n");
      out.write("            var data = {}\r\n");
      out.write("            var username = $(\"#register_usr\").val();\r\n");
      out.write("            var password = $(\"#register_pwd\").val();\r\n");
      out.write("            data[\"username\"] = username;\r\n");
      out.write("            data[\"password\"] = password;\r\n");
      out.write("\r\n");
      out.write("            var json = JSON.stringify(data)\r\n");
      out.write("\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: \"POST\",\r\n");
      out.write("                contentType: \"application/json\",\r\n");
      out.write("                url: \"adduser/\",\r\n");
      out.write("                data: json,\r\n");
      out.write("                dataType: 'json',\r\n");
      out.write("                timeout: 600000,\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    alert(\"ajax success\")\r\n");
      out.write("                },\r\n");
      out.write("                error: function (e) {\r\n");
      out.write("                    alert(\"ajax error\")\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        $(\"#login_btnSubmit\").click(function(){\r\n");
      out.write("\r\n");
      out.write("            var data = {}\r\n");
      out.write("            var username = $(\"#login_usr\").val();\r\n");
      out.write("            var password = $(\"#login_pwd\").val();\r\n");
      out.write("            data[\"username\"] = username;\r\n");
      out.write("            data[\"password\"] = password;\r\n");
      out.write("\r\n");
      out.write("            var json = JSON.stringify(data)\r\n");
      out.write("\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: \"POST\",\r\n");
      out.write("                contentType: \"application/json\",\r\n");
      out.write("                url: \"login/\",\r\n");
      out.write("                data: json,\r\n");
      out.write("                dataType: 'json',\r\n");
      out.write("                timeout: 600000,\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("\r\n");
      out.write("                    var response = data[0][\"response\"];\r\n");
      out.write("\r\n");
      out.write("                    if(response.toString() == \"match\") {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        alert(\"You are now 'logged in'\")\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert(\"incorrect password or something\")\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                },\r\n");
      out.write("                error: function (e) {\r\n");
      out.write("                    alert(\"There was an error\")\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>");
      out.write("</div>\r\n");
      out.write("    <div id=\"page-wrap\">\r\n");
      out.write("    \r\n");
      out.write("        <img src=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\" alt=\"Photo of Youthful William\" id=\"pic\" />\r\n");
      out.write("    \r\n");
      out.write("        <div id=\"contact-info\" class=\"vcard\">\r\n");
      out.write("        \r\n");
      out.write("            <!-- Microformats! -->\r\n");
      out.write("        \r\n");
      out.write("            <h1 class=\"fn\">William Rigby</h1>\r\n");
      out.write("        \r\n");
      out.write("            <p>\r\n");
      out.write("                Cell: <span class=\"tel\">270-872-8109</span><br/>\r\n");
      out.write("                Email: <a class=\"email\" href=\"mailto:williamlouisrigby@gmail.com\">williamlouisrigby@gmail.com</a>\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("                \r\n");
      out.write("        <div id=\"objective\">\r\n");
      out.write("            <p>\r\n");
      out.write("               I'm a senior majoring in Computer Engineering & Computer Science (CECS) at University of Louisville.\r\n");
      out.write("\t\t\t   I have almost 2 years of work experience on a corporate development team, using a large variety of technologies.\r\n");
      out.write("\t\t\t   I'm looking for work and am open to both front end and back end development, but would like to work on products\r\n");
      out.write("\t\t\t   which have a well defined group of end users.\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("        \r\n");
      out.write("        <dl>\r\n");
      out.write("            <dd class=\"clear\"></dd>\r\n");
      out.write("            \r\n");
      out.write("            <dt>Education</dt>\r\n");
      out.write("            <dd>\r\n");
      out.write("                <h2>University of Louisville</h2>\r\n");
      out.write("                <p><strong>Major:</strong> Computer Engineering & Computer Science<br />\r\n");
      out.write("            </dd>\r\n");
      out.write("\t\t\t<dd>\r\n");
      out.write("                <h2>Bellarmine University</h2>\r\n");
      out.write("                <p><strong>Major:</strong> Business Administration<br />\r\n");
      out.write("                   <strong>Minor:</strong> Political Science</p>\r\n");
      out.write("            </dd>\r\n");
      out.write("            \r\n");
      out.write("            <dd class=\"clear\"></dd>\r\n");
      out.write("            \r\n");
      out.write("            <dt>Skills</dt>\r\n");
      out.write("            <dd>                            \r\n");
      out.write("                <h2>Technologies with Advanced Knowledge</h2>\r\n");
      out.write("                <p>Java (Camel, Spring, OSGi), C# (ASP .NET MVC)</p>\r\n");
      out.write("\t\t\t\t<h2>Technologies with Intermediate Knowledge</h2>\r\n");
      out.write("                <p>Javascript (JQuery), C</p>\r\n");
      out.write("\t\t\t\t<h2>Technologies with Working Knowledge</h2>\r\n");
      out.write("                <p>HTML, CSS</p>\r\n");
      out.write("            </dd>\r\n");
      out.write("            \r\n");
      out.write("            <dd class=\"clear\"></dd>\r\n");
      out.write("            \r\n");
      out.write("            <dt>Experience</dt>\r\n");
      out.write("            <dd>\r\n");
      out.write("                <h2>United Parcel Service</h2>\r\n");
      out.write("                <h4>Application Development Co-op - Louisville, KY - June 2015-December 2016</h4>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>Worked in a department which did middleware / application integration</li>\r\n");
      out.write("                    <li>Created Camel routes in Java</li>\r\n");
      out.write("                    <li>Worked on a integration testing tool with front end in ASP .NET MVC, backend in Java</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </dd>\r\n");
      out.write("            \r\n");
      out.write("            <dd class=\"clear\"></dd>\r\n");
      out.write("            \r\n");
      out.write("            <dt>Hobbies</dt>\r\n");
      out.write("            <dd>Beer brewing, concert going</dd>\r\n");
      out.write("            \r\n");
      out.write("            <dd class=\"clear\"></dd>\r\n");
      out.write("            \r\n");
      out.write("            <dt>References</dt>\r\n");
      out.write("            <dd>Available on request</dd>\r\n");
      out.write("            \r\n");
      out.write("            <dd class=\"clear\"></dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- <script type=\"text/javascript\" src=\"webjars/jquery/2.1.1/jquery.min.js\"></script> -->\r\n");
      out.write("\t<!-- <script type=\"text/javascript\" src=\"webjars/bootstrap/3.2.0/js/bootstrap.min.js\"></script> -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/home.jsp(7,39) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/bootstrap-3.3.7-dist/css/bootstrap.min.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/views/home.jsp(11,33) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/style.css");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/views/navbar.jsp(5,30) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/resources/bootstrap-3.3.7-dist/css/bootstrap.min.css");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/views/navbar.jsp(6,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/resources/jquery-3.2.1.min.js");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/views/navbar.jsp(7,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/resources/bootstrap-3.3.7-dist/js/bootstrap.js");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /WEB-INF/views/home.jsp(39,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/resources/old.jpeg");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }
}
