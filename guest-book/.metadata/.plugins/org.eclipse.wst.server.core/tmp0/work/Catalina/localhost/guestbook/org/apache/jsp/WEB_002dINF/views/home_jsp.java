package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dhkim.guestbook.Board;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>GuestBook</title>\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction write() {\n");
      out.write("\t\t\twindow.open(\"write.jsp\");\n");
      out.write("\t\t}\t\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>\n");
      out.write("\tWelcome To Guest Book!! \n");
      out.write("</h1>\n");
      out.write("<input type=\"button\" onclick=\"location.href='javascript:write();'\"\" value=\"글 쓰기\" />\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<th>Index</th><th>Email</th><th>내용</th><th>작성날짜</th><th>수정날짜\n");
      out.write("</th>\n");
      out.write("</tr>\n");

int size = (Integer)request.getAttribute("data_size");
Board[] arr_Board = (Board[])request.getAttribute("arr_board");
for(int i=0; i<size; ++i)
{

      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>");
      out.print(arr_Board[i].getIdx() );
      out.write("</td>\n");
      out.write("<td>");
      out.print(arr_Board[i].getEmail() );
      out.write("</td>\n");
      out.write("<td>");
      out.print(arr_Board[i].getContent() );
      out.write("</td>\n");
      out.write("<td>");
      out.print(arr_Board[i].getRegister_Day() );
      out.write("</td>\n");
      out.write("<td>");
      out.print(arr_Board[i].getModify_Day() );
      out.write("</td>\n");
      out.write("</tr>\n");

}

      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("<P>  The time on the server is ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serverTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(". </P>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
