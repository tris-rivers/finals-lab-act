package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_property_value_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Log In</title>\n");
      out.write("        <script src=\"Bootstrap/js/jquery.js\"></script>\n");
      out.write("\t<script src=\"Bootstrap/js/bootstrap.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"Bootstrap/css/bootstrap.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"Parallax/parallax.js\"></script>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            @font-face {\n");
      out.write("                font-family: Champagne;\n");
      out.write("                src: url(Fonts/Champagne.ttf);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            @font-face {\n");
      out.write("                font-family: CodeBold;\n");
      out.write("                src: url(Fonts/Code-Bold.otf);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            @font-face {\n");
      out.write("                font-family: ChampagneRegular;\n");
      out.write("                src: url(Fonts/Champagne-Regular.ttf);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            html,body{\n");
      out.write("                font-family: Champagne;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .navbar {\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #F2F2F2;\n");
      out.write("                position: fixed;\n");
      out.write("                width:100%;\n");
      out.write("                top: 0;\n");
      out.write("                z-index:5;\n");
      out.write("                padding-left: 50px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar a {\n");
      out.write("                float: left;\n");
      out.write("                display: block;\n");
      out.write("                color: #B97F6D;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 25px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 14px;\n");
      out.write("                letter-spacing: 3px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .navbar a:hover {  \n");
      out.write("                color: #093C33;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .company{\n");
      out.write("                font-family: CodeBold;\n");
      out.write("                font-size: 150px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            .title-category{\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: #B97F6D;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            p{\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-family: ChampagneRegular;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer{\n");
      out.write("                color: #B97F6D;\n");
      out.write("                background-color: #093C33;\n");
      out.write("                padding: 100px;\n");
      out.write("                padding-bottom: 80px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .panel-heading .accordion-toggle:after {\n");
      out.write("                /* symbol for \"opening\" panels */\n");
      out.write("                font-family: 'Glyphicons Halflings';\n");
      out.write("                content: \"\\e114\";    /* adjust as needed, taken from bootstrap.css */\n");
      out.write("                float: right;        /* adjust as needed */\n");
      out.write("                color: #B97F6D;         /* adjust as needed */\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .panel-heading .accordion-toggle.collapsed:after {\n");
      out.write("                /* symbol for \"collapsed\" panels */\n");
      out.write("                content: \"\\e080\";    /* adjust as needed, taken from bootstrap.css */\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .container-fluid{\n");
      out.write("                max-width: 100%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                background: #FAFAFA;\n");
      out.write("                padding: 50px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .panel{\n");
      out.write("                outline: none;\n");
      out.write("                border: 0;\n");
      out.write("                width: 60%;\n");
      out.write("                box-shadow: none;\n");
      out.write("                background-color: #FAFAFA;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .panel-title{\n");
      out.write("                font-family: Champagne;\n");
      out.write("                color: #B97F6D;\n");
      out.write("                border: 0;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .panel-body{\n");
      out.write("                font-family: ChampagneRegular;\n");
      out.write("                color: #B97F6D;\n");
      out.write("                border: 0;\n");
      out.write("                background-color: #FAFAFA;\n");
      out.write("                outline: 0;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                padding: 50px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .faq{\n");
      out.write("                margin: 20px 100px 100px 100px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            h1{\n");
      out.write("                font-family: CodeBold;\n");
      out.write("                letter-spacing: 2px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: #B97F6D;\n");
      out.write("                margin-top: 80px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .sidenav {\n");
      out.write("                height: 100%;\n");
      out.write("                width: 0;\n");
      out.write("                position: fixed;\n");
      out.write("                z-index: 1;\n");
      out.write("                top: 0;\n");
      out.write("                right: 0;\n");
      out.write("                background-color: #093C33;\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                transition: 0.5s;\n");
      out.write("                padding-top: 15px;\n");
      out.write("                z-index: 5;\n");
      out.write("                font-family: ChampagneRegular;\n");
      out.write("                font-size: 15px;\n");
      out.write("                color: #B97F6D;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidenav a {\n");
      out.write("                padding: 0px 5px 8px 32px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 20px;\n");
      out.write("                display: block;\n");
      out.write("                transition: 0.3s;\n");
      out.write("                color: #B97F6D;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .products{\n");
      out.write("                padding: 8px 5px 8px 32px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidenav a:hover {\n");
      out.write("                color: #F2F2F2;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidenav .closebtn {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                right: 25px;\n");
      out.write("                font-size: 36px;\n");
      out.write("                margin-left: 50px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #main {\n");
      out.write("                margin-right: 10px;\n");
      out.write("                padding-right: 10px;\n");
      out.write("                float: right;\n");
      out.write("                margin-top: -52px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-height: 450px) {\n");
      out.write("              .sidenav {padding-top: 15px;}\n");
      out.write("              .sidenav a {font-size: 18px;}\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .right-icon{\n");
      out.write("                height: 23px;\n");
      out.write("                weigh: 23px;\n");
      out.write("                padding-right: 10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input{\n");
      out.write("    \t\tbackground: transparent;\n");
      out.write("    \t\tborder: 0;\n");
      out.write("  \t\toutline: 0;\n");
      out.write("                border-bottom: 1px solid #B97F6D;\n");
      out.write("  \t\twidth: 400px;\n");
      out.write("  \t\tcolor: #B97F6D;\n");
      out.write("  \t\ttext-align: left;\n");
      out.write("  \t\tfont-size: 20px;\n");
      out.write("  \t\tfont-family: Champagne;\n");
      out.write("                height: 30px;\n");
      out.write("                margin-top: 40px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .radiobutton{\n");
      out.write("  \t\tbackground: transparent;\n");
      out.write("                width: 400px;\n");
      out.write("    \t\tborder: 0;\n");
      out.write("  \t\toutline: 0;\n");
      out.write("                border-bottom: 1px solid #B97F6D;\n");
      out.write("                color: #B97F6D;\n");
      out.write("  \t\tfont-size: 20px;\n");
      out.write("  \t\tfont-family: Champagne;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .radioelement{\n");
      out.write("                color: black;\n");
      out.write("  \t\tfont-size: 20px;\n");
      out.write("  \t\tfont-family: Champagne;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            ::-webkit-input-placeholder {\n");
      out.write("                color: #B97F6D;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input:focus::-webkit-input-placeholder { \n");
      out.write("                color:transparent; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .social-icon{\n");
      out.write("                height: 30px;\n");
      out.write("                weigh: 30px;\n");
      out.write("                padding-right: 10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            button{\n");
      out.write("                border: transparent;\n");
      out.write("                background-color: transparent;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            p a, p a:hover{\n");
      out.write("                color: #B97F6D;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script> \n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(\"#flip\").click(function(){\n");
      out.write("                    $(\"#panel\").slideToggle(\"slow\");\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            function openNav() {\n");
      out.write("                document.getElementById(\"mySidenav\").style.width = \"250px\";\n");
      out.write("                document.getElementById(\"main\").style.marginLeft = \"250px\";\n");
      out.write("                document.body.style.backgroundColor = \"rgba(0,0,0,0.4)\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function closeNav() {\n");
      out.write("                document.getElementById(\"mySidenav\").style.width = \"0\";\n");
      out.write("                document.getElementById(\"main\").style.marginLeft= \"0\";\n");
      out.write("                document.body.style.backgroundColor = \"white\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("        <body>\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <a href=\"index.jsp\">Home</a>\n");
      out.write("                <a href=\"index.jsp#about\">About</a>\n");
      out.write("                <a href=\"faq.jsp\">FAQ</a>\n");
      out.write("                <a href=\"index.jsp#contact\">Contact</a>\n");
      out.write("                <form action=\"InventoryUser\">\n");
      out.write("                    <button name=\"button\" value=\"shop\"><a>Shop</a></button>                     \n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                <div id=\"main\">\n");
      out.write("                    <a href=\"login.jsp\" style=\"padding-right: 5px\">Sign in</a>\n");
      out.write("                    <a href=\"register.jsp\">Register</a>\n");
      out.write("                    <span style=\"cursor:pointer\" onclick=\"openNav()\">\n");
      out.write("                        <img src=\"Images/index/basket.png\" class=\"right-icon\" style=\"margin-left: 15px; margin-top:12px; margin-right: 40px;\">\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("                <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("                <a href=\"#\">ITEMS</a>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"products\">\n");
      out.write("                    This is a product<br>\n");
      out.write("                    P20.00\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <h1>SIGN IN</h1>\n");
      out.write("                <br>\n");
      out.write("                <div style=\"margin-bottom: -15px; letter-spacing: 3px;\">\n");
      out.write("                    <center>\n");
      out.write("                        <h5><b>                        \n");
      out.write("                            ");
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write("                 \n");
      out.write("                        </b></h5>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"faq\">\n");
      out.write("                    <form name = \"form1\" action=\"Signin\">\n");
      out.write("                        <center>\n");
      out.write("                            <input type=\"text\" name=\"username\" required>\n");
      out.write("                                <h4>\n");
      out.write("                                    Username \t\t\t\t\n");
      out.write("                                </h4>\n");
      out.write("                            <input type=\"password\" name=\"password\" required>\n");
      out.write("                                <h4>\n");
      out.write("                                    Password\n");
      out.write("                                </h4>\n");
      out.write("                                <h4>\n");
      out.write("                                    <button type=\"submit\" name = \"button\" value=\"login\" class=\"btn btn-default btn-lg\" style=\"width: 100px; margin-top: 20px;\">\n");
      out.write("                                        Login\n");
      out.write("                                    </button>\n");
      out.write("                                </h4>\n");
      out.write("                        </center>\n");
      out.write("                    </form>                     \n");
      out.write("                </div>\n");
      out.write("                <footer>\n");
      out.write("                    <div class=\"col-lg-4 footer\">\n");
      out.write("                        <center>\n");
      out.write("                            <div class=\"title-category\" style=\"letter-spacing: 3px;\">\n");
      out.write("                                Our Store<br><br>\n");
      out.write("                                <p>\n");
      out.write("                                    Address: 10 N. Domingo Street Barangay Valencia Quezon City<br>\n");
      out.write("                                    Phone: 9450150<br>\n");
      out.write("                                    Email: greenery@domain.com\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 footer\">\n");
      out.write("                        <center>\n");
      out.write("                            <div class=\"title-category\" style=\"letter-spacing: 3px;\">\n");
      out.write("                                Opening Hours<br><br>\n");
      out.write("                                <p>\n");
      out.write("                                    Monday-Friday: 7:00-17:00<br>\n");
      out.write("                                    Saturday: 10:00-20:00<br>\n");
      out.write("                                    Sunday: 8:00-12:00<br><br>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 footer\">\n");
      out.write("                        <center>\n");
      out.write("                            <div class=\"title-category\" style=\"letter-spacing: 3px;\">\n");
      out.write("                                Help<br><br>\n");
      out.write("                                <p>\n");
      out.write("                                    <a href=\"shipping.jsp\">Shipping & Returns</a><br>\n");
      out.write("                                    <a href=\"privacy.jsp\">Privacy Policy</a><br>\n");
      out.write("                                    <a href=\"faq.jsp\">FAQ</a><br><br>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer\">\n");
      out.write("                        <center>\n");
      out.write("                            FOLLOW US AND GET THE LATEST UPDATE!<br><br>\n");
      out.write("                            <a href=\"http://www.facebook.com\" target=\"_blank\"><img src=\"Images/social_icons/facebook.png\" class=\"social-icon\"></a>\n");
      out.write("                            <a href=\"http://www.twitter.com\" target=\"_blank\"><img src=\"Images/social_icons/twitter.png\" class=\"social-icon\"></a>\n");
      out.write("                            <a href=\"http://www.instagram.com\" target=\"_blank\"><img src=\"Images/social_icons/instagram.png\" class=\"social-icon\"></a>\n");
      out.write("                        </center>\n");
      out.write("                    <div>\n");
      out.write("                </footer>\n");
      out.write("                <div style=\"color: #B97F6D; padding-top: 50px;\">\n");
      out.write("                    <center>The Greenery &#169; 2017 </center>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </body>\n");
      out.write("    ");
      out.write("       \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_property_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent(null);
    _jspx_th_s_property_0.setValue("message");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }
}
