package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <title>Art Bar</title>\n");
      out.write("        <script src=\"Bootstrap/js/jquery.js\"></script>\n");
      out.write("        <script src=\"Bootstrap/js/bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"Parallax/parallax.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootstrap/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </html>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.clock == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <body>\n");
        out.write("            <nav class=\"navbar animated slideInDown\">\n");
        out.write("                <a href=\"#home\">Home</a>\n");
        out.write("                <a href=\"#about\">About</a>\n");
        out.write("                <a href=\"faq.jsp\">FAQ</a>\n");
        out.write("                <a href=\"#contact\">Contact</a>\n");
        out.write("                <form action=\"InventoryUser\">\n");
        out.write("                    <button name=\"button\" value=\"shop\" class=\"nav-item dropdown\"><a>Shop</a></button>                     \n");
        out.write("                </form>\n");
        out.write("\n");
        out.write("                <div id=\"main\">\n");
        out.write("                    <a href=\"login.jsp\" style=\"padding-right: 5px\">Sign in</a>\n");
        out.write("                    <a href=\"register.jsp\">Register</a>\n");
        out.write("                    <span style=\"cursor:pointer\" onclick=\"openNav()\">\n");
        out.write("                        <img src=\"Images/index/basket.png\" class=\"right-icon\" style=\"margin-left: 15px; margin-top:12px; margin-right: 40px;\">\n");
        out.write("                    </span>\n");
        out.write("                </div>\n");
        out.write("\n");
        out.write("            </div>\n");
        out.write("\n");
        out.write("            <div id=\"mySidenav\" class=\"sidenav\">\n");
        out.write("                <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
        out.write("                <a href=\"#\">ITEMS</a>\n");
        out.write("                <hr>\n");
        out.write("                <div class=\"products\">\n");
        out.write("                    This is a product<br>\n");
        out.write("                    P20.00\n");
        out.write("                </div>\n");
        out.write("\n");
        out.write("            </nav>\n");
        out.write("\n");
        out.write("            <div class=\"container-fluid\">\n");
        out.write("\n");
        out.write("                <div id = \"home\" class=\"parallax overlay\" data-parallax=\"scroll\" data-z-index=\"1\" data-image-src=\"img/header.jpg\">\n");
        out.write("                    <div class=\"title\">\n");
        out.write("                        <center>\n");
        out.write("                            EST <img src=\"img/header-icon1.png\" style=\"height: 90px; width: 100px\"> 2017\n");
        out.write("                            <br>\n");
        out.write("                            <div class=\"company\">ART BAR</div>\n");
        out.write("                            SATISFY YOUR CREATIVE SIDE\n");
        out.write("                        </center>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("\n");
        out.write("                <div id=\"shop\" style=\"margin-top: 50px;\" class=\"row\">\n");
        out.write("                    <div class=\"title-category col-sm-4\">\n");
        out.write("                        <img class=\" wow fadeInUp\" src=\"img/coll/paintframe.jpg\" style=\"width: 400px; height: auto;\">\n");
        out.write("                        <div style=\"top: 45px; left:180px; position: absolute; letter-spacing: 3px;\">Paint</div><br>\n");
        out.write("                        <div style=\"top: 65px; left:196px; position: absolute;\">__</div>\n");
        out.write("                        <div style=\"top: 105px; left:120px; position: absolute; letter-spacing: 3px;\">Shop Collection</div>\n");
        out.write("                    </div>\n");
        out.write("                    <div class=\"title-category col-sm-4\">\n");
        out.write("                        <img src=\"img/coll/brushframe.jpg\" style=\"width: 400px; height: auto;\">\n");
        out.write("                        <div style=\"top: 45px; left:180px; position: absolute; letter-spacing: 3px;\">Brushes</div><br>\n");
        out.write("                        <div style=\"top: 65px; left:210px; position: absolute;\">__</div>\n");
        out.write("                        <div style=\"top: 105px; left:130px; position: absolute; letter-spacing: 3px;\">Shop Collection</div>\n");
        out.write("                    </div>\n");
        out.write("                    <div class=\"title-category col-sm-4\">\n");
        out.write("                        <img src=\"img/coll/canvasframe.jpg\" style=\"width: 400px; height: auto;\">\n");
        out.write("                        <div style=\"top: 45px; left:180px; position: absolute; letter-spacing: 3px;\">Canvas</div><br>\n");
        out.write("                        <div style=\"top: 65px; left:210px; position: absolute;\">__</div>\n");
        out.write("                        <div style=\"top: 105px; left:135px; position: absolute; letter-spacing: 3px;\">Shop Collection</div>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("\n");
        out.write("                <table id=\"about\" class=\"row\" style=\"margin: 50px 0px 0px 0px;\">\n");
        out.write("                    <tr>\n");
        out.write("                        <td class=\"about\">\n");
        out.write("                    <center>\n");
        out.write("                        About us\n");
        out.write("                        <br><br>\n");
        out.write("                        <p>\n");
        out.write("                            Lorem ipsum dolor sit amet, ius habeo prompta id. Pri id exerci nostrud fierent, ex quando commodo detraxit nam. \n");
        out.write("                            Duo suas novum ornatus an. At mea nobis congue debitis, affert complectitur at eos, et pro mollis vivendo omittam.\n");
        out.write("                            Virtute lobortis liberavisse vix an. In sale legere periculis per, quaeque constituto disputationi usu ei. At mel tale intellegam. \n");
        out.write("                            Ei deleniti lucilius his. Adhuc rationibus dissentias id sea, cu qui persius docendi, et ius nibh mucius tamquam.\n");
        out.write("                            Ad stet civibus mei. Qui vide tamquam explicari in. Lorem libris accusamus eum ea, appareat lobortis atomorum quo te. Vero elit invidunt per et, mea an ludus viderer, at quas delectus eos.\n");
        out.write("                            Sit cu sanctus repudiandae, sed corpora accusata necessitatibus ea. Sed ea wisi saperet verterem. Ne pri tale impetus reformidans. \n");
        out.write("\n");
        out.write("                        </p>\n");
        out.write("                    </center>\n");
        out.write("                    </td>\n");
        out.write("                    <td>\n");
        out.write("                        <img src=\"Images/index/index_bot4.jpg\" style=\"width: 350px; height: 500px;\">\n");
        out.write("                    </td>\n");
        out.write("                    <td>\n");
        out.write("                        <img src=\"Images/index/index_bot2.jpg\" style=\"width: 350px; height: 500px;\">\n");
        out.write("                    </td>\n");
        out.write("                    </tr>\n");
        out.write("                    <tr>\n");
        out.write("                        <td>\n");
        out.write("                            <img src=\"Images/index/index_bot3.jpg\" style=\"width: 720px; height: 500px\">\n");
        out.write("                        </td>\n");
        out.write("                        <td colspan=\"2\" class=\"buy-now\">\n");
        out.write("                    <center>BUY ONLINE NOW & GET 20% OFF!</center>\n");
        out.write("                    </td>\n");
        out.write("                    </tr>\n");
        out.write("                </table>\n");
        out.write("\n");
        out.write("                <div id = \"contact\" class=\"parallax\" data-parallax=\"scroll\" data-z-index=\"1\" data-image-src=\"Images/index/index_bot.png\">\n");
        out.write("                    <div class=\"contact\">\n");
        out.write("                        <center>\n");
        out.write("                            For Special Requests and Orders\n");
        out.write("                            <div style=\"margin-top:40px\">\n");
        out.write("                                <input type=\"text\" placeholder=\"Name\"><br>\n");
        out.write("                                <input type=\"text\" placeholder=\"Email\"><br>\n");
        out.write("                                <input type=\"text\" placeholder=\"Subject\"><br>\n");
        out.write("                                <textarea  type=\"text\" placeholder=\"Message\"></textarea>\n");
        out.write("                            </div>\n");
        out.write("                            <button class=\"submit-contact\">Submit</button>\n");
        out.write("                        </center>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("\n");
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
        out.write("                        <div>\n");
        out.write("                            </footer>\n");
        out.write("\n");
        out.write("                            <div style=\"color: #B97F6D; padding-top: 50px;\">\n");
        out.write("                                <center>Art Bar &#169; 2017 </center>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        </body>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.clock != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <body>\n");
        out.write("\n");
        out.write("                            <div class=\"navbar\">\n");
        out.write("                                <table>\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td><a href=\"#home\">Home</a></td>\n");
        out.write("                                        <td><a href=\"#about\">About</a></td>\n");
        out.write("                                        <td>\n");
        out.write("                                            <form action=\"ReturnServlet\" method=\"post\">\n");
        out.write("                                                <input type=\"hidden\" name=\"loginId\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                <button name=\"button\" value=\"faq\"><a>FAQ</a></button>                     \n");
        out.write("                                            </form>\n");
        out.write("                                        </td>\n");
        out.write("                                        <td><a href=\"#contact\">Contact</a></td>\n");
        out.write("                                        <td>\n");
        out.write("                                            <form action=\"InventoryUser\">\n");
        out.write("                                                ");
        out.write("\n");
        out.write("                                                <button name=\"button\" value=\"shop\"><a>Shop</a></button>                     \n");
        out.write("                                            </form>\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>\n");
        out.write("                                </table>\n");
        out.write("\n");
        out.write("                                <div id=\"main\">\n");
        out.write("                                    <table>\n");
        out.write("                                        <tr>\n");
        out.write("                                            <td>\n");
        out.write("                                                <form action=\"Signout\">\n");
        out.write("                                                    <button name=\"button\" value=\"logout\"><a>Logout</a></button>\n");
        out.write("                                                </form>\n");
        out.write("                                            </td>\n");
        out.write("                                            <td>\n");
        out.write("                                                <form action=\"ViewAccount\" method=\"post\">\n");
        out.write("                                                    <div>\n");
        out.write("                                                        <button name=\"button\" value=\"viewAccount\"><a>Manage Account</a></button>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </form>\n");
        out.write("                                            </td>\n");
        out.write("                                            <td>\n");
        out.write("                                                <span style=\"cursor:pointer\" onclick=\"openNav()\">\n");
        out.write("                                                    <img src=\"Images/index/basket.png\" class=\"right-icon\" style=\"margin-left: 15px; margin-top:0px; margin-right: 60px;\">\n");
        out.write("                                                </span>\n");
        out.write("                                            </td>\n");
        out.write("                                        </tr>\n");
        out.write("                                    </table>\n");
        out.write("                                </div>\n");
        out.write("\n");
        out.write("                            </div>\n");
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            <div id=\"mySidenav\" class=\"sidenav\">\n");
        out.write("                                <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
        out.write("                                <a href=\"#\">ITEMS</a>\n");
        out.write("                                <hr>\n");
        out.write("                                <div class=\"products\">\n");
        out.write("                                    This is a product<br>\n");
        out.write("                                    P20.00\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("\n");
        out.write("                            <div class=\"container-fluid\">\n");
        out.write("\n");
        out.write("                                <div id = \"home\" class=\"parallax\" data-parallax=\"scroll\" data-z-index=\"1\" data-image-src=\"Images/index/header.png\">\n");
        out.write("                                    <div class=\"title\">\n");
        out.write("                                        <center>\n");
        out.write("                                            ESTB <img src=\"Images/index/header-icon.png\" style=\"height: 100px; width: 80px\"> 2017\n");
        out.write("                                            <br>\n");
        out.write("                                            <div class=\"company\">THE GREENERY</div>\n");
        out.write("                                            THE BOUTIQUE STORE FOR PLANTS\n");
        out.write("                                        </center>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("\n");
        out.write("                                <div id=\"shop\" style=\"margin-top: 50px;\" class=\"row\">\n");
        out.write("                                    <div class=\"title-category col-lg-4\">\n");
        out.write("                                        <img src=\"Images/index/plant.png\" style=\"width: 450px;\">\n");
        out.write("                                        <div style=\"top: 50px; left:210px; position: absolute; letter-spacing: 3px;\">Plants</div><br>\n");
        out.write("                                        <div style=\"top: 70px; left:230px; position: absolute;\">__</div>\n");
        out.write("                                        <div style=\"top: 110px; left:157px; position: absolute; letter-spacing: 3px;\">Shop Collection</div>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"title-category col-lg-4\">\n");
        out.write("                                        <img src=\"Images/index/cacti.png\" style=\"width: 450px;\">\n");
        out.write("                                        <div style=\"top: 50px; left:210px; position: absolute; letter-spacing: 3px;\">Cacti</div><br>\n");
        out.write("                                        <div style=\"top: 70px; left:230px; position: absolute;\">__</div>\n");
        out.write("                                        <div style=\"top: 110px; left:157px; position: absolute; letter-spacing: 3px;\">Shop Collection</div>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"title-category col-lg-4\">\n");
        out.write("                                        <img src=\"Images/index/succulent.png\" style=\"width: 450px;\">\n");
        out.write("                                        <div style=\"top: 50px; left:190px; position: absolute; letter-spacing: 3px;\">Succulents</div><br>\n");
        out.write("                                        <div style=\"top: 70px; left:230px; position: absolute;\">__</div>\n");
        out.write("                                        <div style=\"top: 110px; left:157px; position: absolute; letter-spacing: 3px;\">Shop Collection</div>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("\n");
        out.write("                                <table id=\"about\" class=\"row\" style=\"margin: 50px 0px 0px 0px;\">\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td class=\"about\">\n");
        out.write("                                    <center>\n");
        out.write("                                        About us\n");
        out.write("                                        <br><br>\n");
        out.write("                                        <p>\n");
        out.write("                                            Lorem ipsum dolor sit amet, ius habeo prompta id. Pri id exerci nostrud fierent, ex quando commodo detraxit nam. \n");
        out.write("                                            Duo suas novum ornatus an. At mea nobis congue debitis, affert complectitur at eos, et pro mollis vivendo omittam.\n");
        out.write("                                            Virtute lobortis liberavisse vix an. In sale legere periculis per, quaeque constituto disputationi usu ei. At mel tale intellegam. \n");
        out.write("                                            Ei deleniti lucilius his. Adhuc rationibus dissentias id sea, cu qui persius docendi, et ius nibh mucius tamquam.\n");
        out.write("                                            Ad stet civibus mei. Qui vide tamquam explicari in. Lorem libris accusamus eum ea, appareat lobortis atomorum quo te. Vero elit invidunt per et, mea an ludus viderer, at quas delectus eos.\n");
        out.write("                                            Sit cu sanctus repudiandae, sed corpora accusata necessitatibus ea. Sed ea wisi saperet verterem. Ne pri tale impetus reformidans. \n");
        out.write("\n");
        out.write("                                        </p>\n");
        out.write("                                    </center>\n");
        out.write("                                    </td>\n");
        out.write("                                    <td>\n");
        out.write("                                        <img src=\"Images/index/index_bot4.jpg\" style=\"width: 350px; height: 500px;\">\n");
        out.write("                                    </td>\n");
        out.write("                                    <td>\n");
        out.write("                                        <img src=\"Images/index/index_bot2.jpg\" style=\"width: 350px; height: 500px;\">\n");
        out.write("                                    </td>\n");
        out.write("                                    </tr>\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td>\n");
        out.write("                                            <img src=\"Images/index/index_bot3.jpg\" style=\"width: 720px; height: 500px\">\n");
        out.write("                                        </td>\n");
        out.write("                                        <td colspan=\"2\" class=\"buy-now\">\n");
        out.write("                                    <center>BUY ONLINE NOW & GET 20% OFF!</center>\n");
        out.write("                                    </td>\n");
        out.write("                                    </tr>\n");
        out.write("                                </table>\n");
        out.write("\n");
        out.write("                                <div id=\"contact\" class=\"parallax\" data-parallax=\"scroll\" data-z-index=\"1\" data-image-src=\"\">\n");
        out.write("                                    <div class=\"contact\">\n");
        out.write("                                        <center>\n");
        out.write("                                            For Special Requests and Orders\n");
        out.write("                                            <div style=\"margin-top:40px\">\n");
        out.write("                                                <input type=\"text\" placeholder=\"Name\"><br>\n");
        out.write("                                                <input type=\"text\" placeholder=\"Email\"><br>\n");
        out.write("                                                <input type=\"text\" placeholder=\"Subject\"><br>\n");
        out.write("                                                <textarea  type=\"text\" placeholder=\"Message\"></textarea>\n");
        out.write("                                            </div>\n");
        out.write("                                            <button class=\"submit-contact\">Submit</button>\n");
        out.write("                                        </center>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("\n");
        out.write("                                <footer>\n");
        out.write("                                    <div class=\"col-lg-4 footer\">\n");
        out.write("                                        <center>\n");
        out.write("                                            <div class=\"title-category\" style=\"letter-spacing: 3px;\">\n");
        out.write("                                                Our Store<br><br>\n");
        out.write("                                                <p>\n");
        out.write("                                                    Address: 10 N. Domingo Street Barangay Valencia Quezon City<br>\n");
        out.write("                                                    Phone: 9450150<br>\n");
        out.write("                                                    Email: artbar@domain.com\n");
        out.write("                                                    <br><br><br><br><br><br><br>\n");
        out.write("                                                </p>\n");
        out.write("                                            </div>\n");
        out.write("                                        </center>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"col-lg-4 footer\">\n");
        out.write("                                        <center>\n");
        out.write("                                            <div class=\"title-category\" style=\"letter-spacing: 3px;\">\n");
        out.write("                                                Opening Hours<br><br>\n");
        out.write("                                                <p>\n");
        out.write("                                                    Monday-Friday: 7:00-17:00<br>\n");
        out.write("                                                    Saturday: 10:00-20:00<br>\n");
        out.write("                                                    Sunday: 8:00-12:00<br><br>\n");
        out.write("                                                </p>\n");
        out.write("                                            </div>\n");
        out.write("                                            <br><br>\n");
        out.write("                                            <div style=\"margin-top: 9.5px\">\n");
        out.write("                                                FOLLOW US AND GET THE LATEST UPDATE!<br><br>\n");
        out.write("                                                <a href=\"http://www.facebook.com\" target=\"_blank\"><img src=\"Images/social_icons/facebook.png\" class=\"social-icon\"></a>\n");
        out.write("                                                <a href=\"http://www.twitter.com\" target=\"_blank\"><img src=\"Images/social_icons/twitter.png\" class=\"social-icon\"></a>\n");
        out.write("                                                <a href=\"http://www.instagram.com\" target=\"_blank\"><img src=\"Images/social_icons/instagram.png\" class=\"social-icon\"></a>\n");
        out.write("                                            </div>\n");
        out.write("                                        </center>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"col-lg-4 footer\">\n");
        out.write("                                        <center>\n");
        out.write("                                            <div class=\"title-category\" style=\"letter-spacing: 3px;\">\n");
        out.write("                                                Help<br><br>\n");
        out.write("                                                <form action=\"BasketServlet\" method=\"post\">\n");
        out.write("                                                    <p style=\"font-size: 16px; margin-top: -10px\">\n");
        out.write("                                                        <input type=\"hidden\" name=\"loginId\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        <input type=\"hidden\" name=\"basket\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list_basket}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        <button name=\"button\" value=\"shipping\">Shipping & Returns</button><br>\n");
        out.write("                                                        <button name=\"button\" value=\"privacy\">Privacy Policy</button><br>\n");
        out.write("                                                        <button name=\"button\" value=\"faq\">FAQ</button> \n");
        out.write("                                                        <br><br><br><br><br><br><br>\n");
        out.write("                                                    </p>\n");
        out.write("                                                </form>\n");
        out.write("\n");
        out.write("                                            </div>\n");
        out.write("                                        </center>\n");
        out.write("                                    </div>\n");
        out.write("                                </footer>\n");
        out.write("\n");
        out.write("                                <div style=\"color: #B97F6D; padding-top: 500px;\">\n");
        out.write("                                    <center>Art Bar &#169; 2017 </center>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                            <script src=\"js/script.js\"></script>\n");
        out.write("                            <script src=\"js/wow.min.js\"></script>\n");
        out.write("                            <script>\n");
        out.write("                                    new WOW().init();\n");
        out.write("                            </script>                \n");
        out.write("                        </body>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_0.setVar("description");
    _jspx_th_c_set_0.setValue(new String("1"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_1.setVar("price");
    _jspx_th_c_set_1.setValue(new String("2"));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }
}
