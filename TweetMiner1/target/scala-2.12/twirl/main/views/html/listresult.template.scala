
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object listresult extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[SearchKeyword],Set[SearchKeyword],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchform : Form[SearchKeyword],keywords:Set[SearchKeyword]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
    """),format.raw/*4.5*/("""<html>
        <head>
            <title>Create Book</title>
        </head>

        <body>
            """),_display_(/*10.14*/helper/*10.20*/.form(action= helper.CSRF(routes.TweetMinerController.search()))/*10.84*/{_display_(Seq[Any](format.raw/*10.85*/("""
                """),_display_(/*11.18*/helper/*11.24*/.inputText(searchform("keyword"))),format.raw/*11.57*/("""
                """),format.raw/*12.17*/("""<input type="submit" value="create">
            """)))}),format.raw/*13.14*/("""

            """),format.raw/*15.13*/("""<h1>ALL books</h1>
            """),_display_(/*16.14*/if(keywords!=null)/*16.32*/{_display_(Seq[Any](format.raw/*16.33*/("""
            """),_display_(/*17.14*/for(keywrd<-keywords) yield /*17.35*/{_display_(Seq[Any](format.raw/*17.36*/("""
                """),format.raw/*18.17*/("""<p>"""),_display_(/*18.21*/keywrd/*18.27*/.getKeyword()),format.raw/*18.40*/("""</p>
            """)))})))}),format.raw/*19.15*/("""
        """),format.raw/*20.9*/("""</body>
    </html>"""))
      }
    }
  }

  def render(searchform:Form[SearchKeyword],keywords:Set[SearchKeyword]): play.twirl.api.HtmlFormat.Appendable = apply(searchform,keywords)

  def f:((Form[SearchKeyword],Set[SearchKeyword]) => play.twirl.api.HtmlFormat.Appendable) = (searchform,keywords) => apply(searchform,keywords)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jul 28 17:33:58 EDT 2018
                  SOURCE: C:/Users/JASKARN SINGH/Documents/GitHub/TweetMiner1/TweetMiner1/app/views/listresult.scala.html
                  HASH: 9a8abe3d9155bfe249c4e61bc3c7c5847f56ae94
                  MATRIX: 985->1|1120->66|1165->63|1193->83|1225->89|1364->201|1379->207|1452->271|1491->272|1537->291|1552->297|1606->330|1652->348|1734->399|1778->415|1838->448|1865->466|1904->467|1946->482|1983->503|2022->504|2068->522|2099->526|2114->532|2148->545|2202->565|2239->575
                  LINES: 28->1|31->2|34->1|35->3|36->4|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|45->13|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|50->18|51->19|52->20
                  -- GENERATED --
              */
          