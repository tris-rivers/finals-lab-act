<%-- 
    Document   : index
    Created on : Sep 30, 2017, 6:47:09 PM
    Author     : Arianne
--%>

<%@page import = "java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib uri = "/struts-tags" prefix = "s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Art Bar</title>
        <script src="Bootstrap/js/jquery.js"></script>
        <script src="Bootstrap/js/bootstrap.js"></script>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="Parallax/parallax.js"></script>
        <link rel="stylesheet" href="Bootstrap/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">

        <link rel="stylesheet" type="text/css" href="css/animate.css">

    </head>

    <c:if test="${sessionScope.clock == null}">
        <body>
            <nav class="navbar">
                <a href="#home">Home</a>
                <a href="#about">About</a>
                <a href="faq.jsp">FAQ</a>
                <a href="#contact">Contact</a>
                <form action="InventoryUser">
                    <button name="button" value="shop" class="nav-item dropdown"><a>Shop</a></button>                     
                </form>

                <div id="main">
                    <a href="login.jsp" style="padding-right: 5px">Sign in</a>
                    <a href="register.jsp">Register</a>
                    <span style="cursor:pointer" onclick="openNav()">
                        <img src="Images/index/basket.png" class="right-icon" style="margin-left: 15px; margin-top:12px; margin-right: 40px;">
                    </span>
                </div>


            <div id="mySidenav" class="sidenav">
                <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                <a href="#">ITEMS</a>
                <hr>
                <div class="products">
                    This is a product<br>
                    P20.00
                </div>

        </nav>

        <div class="container-fluid">

            <div id = "home" class="parallax overlay" data-parallax="scroll" data-z-index="1" data-image-src="img/header.jpg">
                <div class="title">
                    <center>
                        EST <img src="img/header-icon1.png" style="height: 90px; width: 100px"> 2017
                        <br>
                        <div class="company">ART BAR</div>
                        SATISFY YOUR CREATIVE SIDE
                    </center>
                </div>
            </div>

            <div id="shop" style="margin-top: 50px;" class="row">
                <div class="title-category col-sm-4 wow fadeInUp">
                    <img src="img/coll/paintframe.jpg" style="width: 400px; height: auto;">
                    <div style="top: 45px; left:180px; position: absolute; letter-spacing: 3px;">Paint</div><br>
                    <div style="top: 65px; left:196px; position: absolute;">__</div>
                    <div style="top: 105px; left:120px; position: absolute; letter-spacing: 3px;"><a href="#" style="color: #B97F6D">Shop Collection</a></div>
                </div>
                <div class="title-category col-sm-4 wow fadeInUp" data-wow-delay="0.3s">
                    <img src="img/coll/brushframe.jpg" style="width: 400px; height: auto;">
                    <div style="top: 45px; left:180px; position: absolute; letter-spacing: 3px;">Brushes</div><br>
                    <div style="top: 65px; left:210px; position: absolute;">__</div>
                    <div style="top: 105px; left:130px; position: absolute; letter-spacing: 3px;"><a href="#" style="color: #B97F6D">Shop Collection</a></div>
                </div>
                <div class="title-category col-sm-4 wow fadeInUp" data-wow-delay="0.8s">
                    <img src="img/coll/canvasframe.jpg" style="width: 400px; height: auto;">
                    <div style="top: 45px; left:180px; position: absolute; letter-spacing: 3px;">Canvas</div><br>
                    <div style="top: 65px; left:210px; position: absolute;">__</div>
                    <div style="top: 105px; left:135px; position: absolute; letter-spacing: 3px;"><a href="#" style="color: #B97F6D">Shop Collection</a></div>
                </div>
            </div>

            <table id="about" class="row" style="margin: 50px 0px 0px 0px;" width="1250">
                <tr>
                    <td class="about">
                <center>
                    About us
                    <br><br>
                    <p>
                        Lorem ipsum dolor sit amet, ius habeo prompta id. Pri id exerci nostrud fierent, ex quando commodo detraxit nam. 
                        Duo suas novum ornatus an. At mea nobis congue debitis, affert complectitur at eos, et pro mollis vivendo omittam.
                        Virtute lobortis liberavisse vix an. In sale legere periculis per, quaeque constituto disputationi usu ei. At mel tale intellegam. 
                        Ei deleniti lucilius his. Adhuc rationibus dissentias id sea, cu qui persius docendi, et ius nibh mucius tamquam.

                    </p>
                </center>
                </td>
                <td>
                    <img class="wow slideInRight" src="img/form-img.jpg" style="width: 533px; height: 370px;">
                </td>
                </tr>
                <tr>
                    <td>
                        <img class="wow slideInLeft" src="img/art_studio_1.jpg" style="width: 720px; height: 500px">
                    </td>
                    <td colspan="2" class="buy-now" style="background-color: #34344A">
                <center>BUY ONLINE NOW & GET 20% OFF!</center>
                </td>
                </tr>
            </table>

            <div id = "contact" class="parallax" data-parallax="scroll" data-z-index="1" data-image-src="img/joanna.jpg">
                <div class="contact">
                    <center>
                        For Special Requests and Orders
                        <div style="margin-top:40px">
                            <input type="text" placeholder="Name"><br>
                            <input type="text" placeholder="Email"><br>
                            <input type="text" placeholder="Subject"><br>
                            <textarea  type="text" placeholder="Message"></textarea>
                        </div>
                        <button class="submit-contact">Submit</button>
                    </center>
                </div>
            </div>

            <footer>
                <div class="col-lg-4 footer">
                    <center>
                        <div class="title-category" style="letter-spacing: 3px;">
                            Our Store<br><br>
                            <p>
                                Address: 10 N. Domingo Street Barangay Valencia Quezon City<br>
                                Phone: 9450150<br>
                                Email: greenery@domain.com
                            </p>
                        </div>
                    </center>
                </div>
                <div class="col-lg-4 footer">
                    <center>
                        <div class="title-category" style="letter-spacing: 3px;">
                            Opening Hours<br><br>
                            <p>
                                Monday-Friday: 7:00-17:00<br>
                                Saturday: 10:00-20:00<br>
                                Sunday: 8:00-12:00<br><br>
                            </p>
                        </div>
                    </center>
                </div>
                <div class="col-lg-4 footer">
                    <center>
                        <div class="title-category" style="letter-spacing: 3px;">
                            Help<br><br>
                            <p>
                                <a href="shipping.jsp">Shipping & Returns</a><br>
                                <a href="privacy.jsp">Privacy Policy</a><br>
                                <a href="faq.jsp">FAQ</a><br><br>
                            </p>
                        </div>
                    </center>
                </div>
                <div class="footer">
                    <center>
                        FOLLOW US AND GET THE LATEST UPDATE!<br><br>
                        <a href="http://www.facebook.com" target="_blank"><img src="Images/social_icons/facebook.png" class="social-icon"></a>
                        <a href="http://www.twitter.com" target="_blank"><img src="Images/social_icons/twitter.png" class="social-icon"></a>
                        <a href="http://www.instagram.com" target="_blank"><img src="Images/social_icons/instagram.png" class="social-icon"></a>
                    </center>
                    <div>
                        </footer>

                        <div style="color: #B97F6D; padding-top: 50px;">
                            <center>Art Bar &#169; 2017 </center>
                        </div>
                    </div>
                    </body>
                </c:if>
                <!-///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////-->
                <!-HEADER FOR ADMIN-->               
                <c:if test="${sessionScope.clock != null}">
                    <body>

                        <div class="navbar">
                            <table>
                                <tr>
                                    <td><a href="#home">Home</a></td>
                                    <td><a href="#about">About</a></td>
                                    <td>
                                        <form action="ReturnServlet" method="post">
                                            <input type="hidden" name="loginId" value="${id}">
                                            <button name="button" value="faq"><a>FAQ</a></button>                     
                                        </form>
                                    </td>
                                    <td><a href="#contact">Contact</a></td>
                                    <td>
                                        <form action="InventoryUser">
                                            <%--<input type="hidden" name="loginId" value="${id}">--%>
                                            <button name="button" value="shop"><a>Shop</a></button>                     
                                        </form>
                                    </td>
                                </tr>
                            </table>

                            <div id="main">
                                <table>
                                    <tr>
                                        <td>
                                            <form action="Signout">
                                                <button name="button" value="logout"><a>Logout</a></button>
                                            </form>
                                        </td>
                                        <td>
                                            <form action="ViewAccount" method="post">
                                                <div>
                                                    <button name="button" value="viewAccount"><a>Manage Account</a></button>
                                                </div>
                                            </form>
                                        </td>
                                        <td>
                                            <span style="cursor:pointer" onclick="openNav()">
                                                <img src="Images/index/basket.png" class="right-icon" style="margin-left: 15px; margin-top:0px; margin-right: 60px;">
                                            </span>
                                        </td>
                                    </tr>
                                </table>
                            </div>

                        </div>

                        <c:set var="description" value = "1"/>
                        <c:set var="price" value = "2"/>
                        <div id="mySidenav" class="sidenav">
                            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                            <a href="#">ITEMS</a>
                            <hr>
                            <div class="products">
                                This is a product<br>
                                P20.00
                            </div>
                        </div>

                        <div class="container-fluid">

                            <div id = "home" class="parallax" data-parallax="scroll" data-z-index="1" data-image-src="img/header.jpg">
                                <div class="title">
                                    <center>
                                        EST <img src="img/header-icon1.jpg" style="height: 100px; width: 80px"> 2017
                                        <br>
                                        <div class="company">ART BAR</div>
                                        SATISFY YOUR CREATIVE SIDE
                                    </center>
                                </div>
                            </div>

                            <div id="shop" style="margin-top: 50px;" class="row">
                                <div class="title-category col-sm-4">
                                    <img class=" wow fadeInUp" src="img/coll/paintframe.jpg" style="width: 400px; height: auto;">
                                    <div style="top: 45px; left:180px; position: absolute; letter-spacing: 3px;">Paint</div><br>
                                    <div style="top: 65px; left:196px; position: absolute;">__</div>
                                    <div style="top: 105px; left:120px; position: absolute; letter-spacing: 3px;">Shop Collection</div>
                                </div>
                                <div class="title-category col-sm-4">
                                    <img src="img/coll/brushframe.jpg" style="width: 400px; height: auto;">
                                    <div style="top: 45px; left:180px; position: absolute; letter-spacing: 3px;">Brushes</div><br>
                                    <div style="top: 65px; left:210px; position: absolute;">__</div>
                                    <div style="top: 105px; left:130px; position: absolute; letter-spacing: 3px;">Shop Collection</div>
                                </div>
                                <div class="title-category col-sm-4">
                                    <img src="img/coll/canvasframe.jpg" style="width: 400px; height: auto;">
                                    <div style="top: 45px; left:180px; position: absolute; letter-spacing: 3px;">Canvas</div><br>
                                    <div style="top: 65px; left:210px; position: absolute;">__</div>
                                    <div style="top: 105px; left:135px; position: absolute; letter-spacing: 3px;">Shop Collection</div>
                                </div>
                            </div>

                            <table id="about" class="row" style="margin: 50px 0px 0px 0px;" width="1250">
                                <tr>
                                    <td class="about">
                                <center>
                                    About us
                                    <br><br>
                                    <p>
                                        Lorem ipsum dolor sit amet, ius habeo prompta id. Pri id exerci nostrud fierent, ex quando commodo detraxit nam. 
                                        Duo suas novum ornatus an. At mea nobis congue debitis, affert complectitur at eos, et pro mollis vivendo omittam.
                                        Virtute lobortis liberavisse vix an. In sale legere periculis per, quaeque constituto disputationi usu ei. At mel tale intellegam. 
                                        Ei deleniti lucilius his. Adhuc rationibus dissentias id sea, cu qui persius docendi, et ius nibh mucius tamquam.

                                    </p>
                                </center>
                                </td>
                                <td>
                                    <img src="img/form-img.jpg" style="width: 533px; height: 370px;">
                                </td>
                                </tr>
                                <tr>
                                    <td>
                                        <img src="img/art_studio_1.jpg" style="width: 720px; height: 500px">
                                    </td>
                                    <td colspan="2" class="buy-now" style="background-color: #34344A">
                                <center>BUY ONLINE NOW & GET 20% OFF!</center>
                                </td>
                                </tr>
                            </table>

                            <div id="contact" class="parallax" data-parallax="scroll" data-z-index="1" data-image-src="">
                                <div class="contact">
                                    <center>
                                        For Special Requests and Orders
                                        <div style="margin-top:40px">
                                            <input type="text" placeholder="Name"><br>
                                            <input type="text" placeholder="Email"><br>
                                            <input type="text" placeholder="Subject"><br>
                                            <textarea  type="text" placeholder="Message"></textarea>
                                        </div>
                                        <button class="submit-contact">Submit</button>
                                    </center>
                                </div>
                            </div>

                            <footer>
                                <div class="col-lg-4 footer">
                                    <center>
                                        <div class="title-category" style="letter-spacing: 3px;">
                                            Our Store<br><br>
                                            <p>
                                                Address: 10 N. Domingo Street Barangay Valencia Quezon City<br>
                                                Phone: 9450150<br>
                                                Email: artbar@domain.com
                                                <br><br><br><br><br><br><br>
                                            </p>
                                        </div>
                                    </center>
                                </div>
                                <div class="col-lg-4 footer">
                                    <center>
                                        <div class="title-category" style="letter-spacing: 3px;">
                                            Opening Hours<br><br>
                                            <p>
                                                Monday-Friday: 7:00-17:00<br>
                                                Saturday: 10:00-20:00<br>
                                                Sunday: 8:00-12:00<br><br>
                                            </p>
                                        </div>
                                        <br><br>
                                        <div style="margin-top: 9.5px">
                                            FOLLOW US AND GET THE LATEST UPDATE!<br><br>
                                            <a href="http://www.facebook.com" target="_blank"><img src="Images/social_icons/facebook.png" class="social-icon"></a>
                                            <a href="http://www.twitter.com" target="_blank"><img src="Images/social_icons/twitter.png" class="social-icon"></a>
                                            <a href="http://www.instagram.com" target="_blank"><img src="Images/social_icons/instagram.png" class="social-icon"></a>
                                        </div>
                                    </center>
                                </div>
                                <div class="col-lg-4 footer">
                                    <center>
                                        <div class="title-category" style="letter-spacing: 3px;">
                                            Help<br><br>
                                            <form action="BasketServlet" method="post">
                                                <p style="font-size: 16px; margin-top: -10px">
                                                    <input type="hidden" name="loginId" value="${id}">
                                                    <input type="hidden" name="basket" value="${list_basket}">
                                                    <button name="button" value="shipping">Shipping & Returns</button><br>
                                                    <button name="button" value="privacy">Privacy Policy</button><br>
                                                    <button name="button" value="faq">FAQ</button> 
                                                    <br><br><br><br><br><br><br>
                                                </p>
                                            </form>

                                        </div>
                                    </center>
                                </div>
                            </footer>

                            <div style="color: #B97F6D; padding-top: 500px;">
                                <center>Art Bar &#169; 2017 </center>
                            </div>
                        </div>



                    </c:if>
                    <script src="js/script.js"></script>
                    <script src="js/wow.min.js"></script>
                    <script>
                                new WOW().init();
                    </script>                
                </body>

                </html>
