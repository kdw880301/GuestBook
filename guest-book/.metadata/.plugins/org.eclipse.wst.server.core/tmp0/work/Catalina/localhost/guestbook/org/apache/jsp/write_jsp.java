package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction validateForm() {\r\n");
      out.write("\r\n");
      out.write("\t  if(!validateEmail(document.getElementById(\"email\").value))\r\n");
      out.write("\t  {\r\n");
      out.write("\t     alert('이메일을 확인하세요.');\r\n");
      out.write("\t     document.getElementById(\"email\").focus();\r\n");
      out.write("\t     return false;\r\n");
      out.write("\t  } else if(document.getElementById(\"pwd\").value == \"\") {\r\n");
      out.write("\t      alert('암호를 입력해주세요.');\r\n");
      out.write("\t     document.getElementById(\"pwd\").focus();\r\n");
      out.write("\t     return false;\r\n");
      out.write("\t  } else if(document.getElementById(\"content\").value == \"\") {\r\n");
      out.write("\t\t  alert('내용을 입력해주세요.');\r\n");
      out.write("\t     document.getElementById(\"content\").focus();\r\n");
      out.write("\t     return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  return true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction validateEmail(email)\r\n");
      out.write("\t {\r\n");
      out.write("\t  var reg_email = /^([0-9a-zA-Z_\\.-]+)@([0-9a-zA-Z_-]+)(\\.[0-9a-zA-Z_-]+){1,2}$/;\r\n");
      out.write("\r\n");
      out.write("\t  if(!reg_email.test(email))\r\n");
      out.write("\t  {\r\n");
      out.write("\t   return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  return true;\r\n");
      out.write("\t }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form method=\"post\" action=\"process\" onsubmit=\"return validateForm();\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Email</td>\r\n");
      out.write("<td><input name=\"email\" type=\"text\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Password</td>\r\n");
      out.write("<td><input name=\"pwd\" type=\"password\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td colspan=\"2\"><input name=\"content\" type=\"text\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td><input type=\"submit\" />\r\n");
      out.write("</td>\r\n");
      out.write("<td><input type=\"reset\" />\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
