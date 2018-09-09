
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

object locationTweets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[String],String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(l:List[String],a:String,b:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""
"""),format.raw/*2.1*/("""<!-- Author Amankirat -->



<html>
<body>
<h2>"""),_display_(/*8.6*/l/*8.7*/.size()),format.raw/*8.14*/(""" """),format.raw/*8.15*/("""Results searched for the selected location :-</b>"""),format.raw/*8.64*/("""{"""),_display_(/*8.66*/a),format.raw/*8.67*/(""","""),_display_(/*8.69*/b),format.raw/*8.70*/("""}"""),format.raw/*8.71*/("""</h2>
"""),_display_(/*9.2*/for(k<-l) yield /*9.11*/{_display_(Seq[Any](format.raw/*9.12*/("""
"""),format.raw/*10.1*/("""<p><b>Tweet:-</b>"""),_display_(/*10.19*/k),format.raw/*10.20*/("""</p>

<p>------------------------------------------------------------------------------------------------------------------------------------------------</P>
""")))}),format.raw/*13.2*/("""
"""),format.raw/*14.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(l:List[String],a:String,b:String): play.twirl.api.HtmlFormat.Appendable = apply(l,a,b)

  def f:((List[String],String,String) => play.twirl.api.HtmlFormat.Appendable) = (l,a,b) => apply(l,a,b)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jul 31 21:30:15 EDT 2018
                  SOURCE: C:/Users/JASKARN SINGH/Desktop/TweetMiner1/app/views/locationTweets.scala.html
                  HASH: 762963f912b2fb5aeb3e291b84e73a19f6eddc05
                  MATRIX: 977->1|1106->35|1134->37|1213->91|1221->92|1248->99|1276->100|1352->149|1380->151|1401->152|1429->154|1450->155|1478->156|1511->164|1535->173|1573->174|1602->176|1647->194|1669->195|1861->357|1890->359
                  LINES: 28->1|33->1|34->2|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|45->13|46->14
                  -- GENERATED --
              */
          