/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-15 03:13:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta lang=\"utf-8\">\r\n");
      out.write("    <title>主页</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/global.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/layout.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/image.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/card.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/menu.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/time.css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"Layout\">\r\n");
      out.write("        <div class=\"Layout_Logo\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/res/logo.png\" style=\"height: 100%;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"Layout_Head\">\r\n");
      out.write("            <div class=\"Menu\">\r\n");
      out.write("                <div class=\"MenuTitle\">\r\n");
      out.write("                    <div class=\"CenterText\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/profile\">学院概况</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"Menu\">\r\n");
      out.write("                <div class=\"MenuTitle\">\r\n");
      out.write("                    <div class=\"CenterText\">学院历史</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"Menu\" style=\"margin-left: auto;\">\r\n");
      out.write("                <div class=\"MenuTitle\">\r\n");
      out.write("                    <div class=\"CenterText\"><a href=\"/home\">主页</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"MenuList\">\r\n");
      out.write("                    <a href=\"/profile\">学院概况</a>\r\n");
      out.write("                    <a>开设专业</a>\r\n");
      out.write("                    <a>新闻</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"Layout_Body\">\r\n");
      out.write("            <section id=\"cd-timeline\" class=\"cd-container\">\r\n");
      out.write("                <div class=\"cd-timeline-block\">\r\n");
      out.write("                    <div class=\"cd-timeline-img cd-movie\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/res/cd-icon-picture.svg\" alt=\"Picture\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"cd-timeline-content\">\r\n");
      out.write("                        <h2>信息与计算机工程学院建立</h2>\r\n");
      out.write("                        <p>信息与计算机工程学院组建于1999年6月，学院以“创名牌学院、育一流人才”的办学目标，以“自强、务实、尚学、进取”为院训，坚持“以人为本、人才强院、提高质量、加速发展”的办学原则，确立了“突出创新教育，注重内涵建设”的办学理念和“知识、能力、素质”三位一体的现代人才培养模式，注重学生的创新思维、创新能力和创业精神的培养，重视工程能力的培训。\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <a href=\"https://baike.baidu.com/item/东北林业大学信息与计算机工程学院/785502?fr=aladdin#2\" class=\"cd-read-more\"\r\n");
      out.write("                            target=\"_blank\">阅读全文</a>\r\n");
      out.write("                        <span class=\"cd-date\">1999年6月</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cd-timeline-block\">\r\n");
      out.write("                    <div class=\"cd-timeline-img cd-movie\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/res/cd-icon-picture.svg\" alt=\"Picture\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"cd-timeline-content\">\r\n");
      out.write("                        <h2>软件工程专业设立</h2>\r\n");
      out.write("                        <p>软件工程专业设立软件工程专业设立软件工程专业设立软件工程专业设立软件工程专业设立软件工程专业设立软件工程专业设立软件工程专业设立软件工程专业设立软件工程专业设立\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <a href=\"https://baike.baidu.com/item/东北林业大学信息与计算机工程学院/785502?fr=aladdin#2\" class=\"cd-read-more\"\r\n");
      out.write("                            target=\"_blank\">阅读全文</a>\r\n");
      out.write("                        <span class=\"cd-date\">20**年*月</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cd-timeline-block\">\r\n");
      out.write("                    <div class=\"cd-timeline-img cd-movie\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/res/cd-icon-picture.svg\" alt=\"Picture\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"cd-timeline-content\">\r\n");
      out.write("                        <h2>信息系统与信息管理设立</h2>\r\n");
      out.write("                        <p>信息与计算机工程学院组建于1999年6月，学院以“创名牌学院、育一流人才”的办学目标，以“自强、务实、尚学、进取”为院训，坚持“以人为本、人才强院、提高质量、加速发展”的办学原则，确立了“突出创新教育，注重内涵建设”的办学理念和“知识、能力、素质”三位一体的现代人才培养模式，注重学生的创新思维、创新能力和创业精神的培养，重视工程能力的培训。\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <a href=\"https://baike.baidu.com/item/东北林业大学信息与计算机工程学院/785502?fr=aladdin#2\" class=\"cd-read-more\"\r\n");
      out.write("                            target=\"_blank\">阅读全文</a>\r\n");
      out.write("                        <span class=\"cd-date\">20**年*月</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cd-timeline-block\">\r\n");
      out.write("                    <div class=\"cd-timeline-img cd-movie\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/res/cd-icon-picture.svg\" alt=\"Picture\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"cd-timeline-content\">\r\n");
      out.write("                        <h2>电子信息移出</h2>\r\n");
      out.write("                        <p>信息与计算机工程学院组建于1999年6月，学院以“创名牌学院、育一流人才”的办学目标，以“自强、务实、尚学、进取”为院训，坚持“以人为本、人才强院、提高质量、加速发展”的办学原则，确立了“突出创新教育，注重内涵建设”的办学理念和“知识、能力、素质”三位一体的现代人才培养模式，注重学生的创新思维、创新能力和创业精神的培养，重视工程能力的培训。\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <a href=\"https://baike.baidu.com/item/东北林业大学信息与计算机工程学院/785502?fr=aladdin#2\" class=\"cd-read-more\"\r\n");
      out.write("                            target=\"_blank\">阅读全文</a>\r\n");
      out.write("                        <span class=\"cd-date\">2014-12-14</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cd-timeline-block\">\r\n");
      out.write("                    <div class=\"cd-timeline-img cd-picture\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/res/cd-icon-location.svg\" alt=\"Location\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"cd-timeline-content\">\r\n");
      out.write("                        <h2>电子信息类回归</h2>\r\n");
      out.write("                        <p>信息与计算机工程学院组建于1999年6月，学院以“创名牌学院、育一流人才”的办学目标，以“自强、务实、尚学、进取”为院训，坚持“以人为本、人才强院、提高质量、加速发展”的办学原则，确立了“突出创新教育，注重内涵建设”的办学理念和“知识、能力、素质”三位一体的现代人才培养模式，注重学生的创新思维、创新能力和创业精神的培养，重视工程能力的培训。\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <a href=\"https://baike.baidu.com/item/东北林业大学信息与计算机工程学院/785502?fr=aladdin#2\" class=\"cd-read-more\"\r\n");
      out.write("                            target=\"_blank\">阅读全文</a>\r\n");
      out.write("                        <span class=\"cd-date\">2014-12-05</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- 结束 -->\r\n");
      out.write("            <div class=\"Layout_Tail\">\r\n");
      out.write("                <div class=\"Block\" style=\"margin: 0 20px; font-size: large;\">\r\n");
      out.write("                    <div class=\"CenterText\"><a>love-pixel.github.io&copy;</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
