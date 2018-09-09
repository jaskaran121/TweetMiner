
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

object listresult extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[SearchKeyword],LinkedHashMap[String, List[TweetModel]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchform : Form[SearchKeyword],tweets:LinkedHashMap[String,List[TweetModel]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*6.2*/import helper._


Seq[Any](format.raw/*1.82*/("""
"""),format.raw/*2.1*/("""<!-- Author Prabhleen -->



"""),format.raw/*7.1*/("""
    """),format.raw/*8.5*/("""<html>
        <head>
            <title>Search Word</title>
        </head>

        <body>
            """),_display_(/*14.14*/helper/*14.20*/.form(action= helper.CSRF(routes.TweetMinerController.search()))/*14.84*/{_display_(Seq[Any](format.raw/*14.85*/("""
                """),_display_(/*15.18*/helper/*15.24*/.inputText(searchform("keyword"))),format.raw/*15.57*/("""
                """),format.raw/*16.17*/("""<input type="submit" value="create">
            """)))}),format.raw/*17.14*/("""

            """),format.raw/*19.13*/("""<h1>ALL Tweets</h1>
            """),_display_(/*20.14*/if(tweets!=null)/*20.30*/{_display_(Seq[Any](format.raw/*20.31*/("""
             """),_display_(/*21.15*/for((str,t)<-tweets) yield /*21.35*/{_display_(Seq[Any](format.raw/*21.36*/("""
            """),format.raw/*22.13*/("""<div style="Float:left;"><h2>Total """),_display_(/*22.49*/t/*22.50*/.length),format.raw/*22.57*/(""" """),format.raw/*22.58*/("""tweets fetched for Keyword  <a href=""""),_display_(/*22.96*/routes/*22.102*/.TweetMinerController.appendString(str)),format.raw/*22.141*/("""">"""),_display_(/*22.144*/str),format.raw/*22.147*/("""</a> </h2></div>
            """),_display_(/*23.14*/for(tweet<-t) yield /*23.27*/{_display_(Seq[Any](format.raw/*23.28*/("""
            """),format.raw/*24.13*/("""<div style="background-color:lightblue">
                <b>Author:-</b><a href=""""),_display_(/*25.42*/routes/*25.48*/.TweetMinerController.getUserData(tweet.getAuthor().getScreenName())),format.raw/*25.116*/("""">"""),_display_(/*25.119*/tweet/*25.124*/.getAuthor().getScreenName()),format.raw/*25.152*/("""</a>
                <p><b>Tweet:-</b>"""),_display_(/*26.35*/tweet/*26.40*/.getTweet()),format.raw/*26.51*/("""</p>
                <p><b>Location:-</b><a href=""""),_display_(/*27.47*/routes/*27.53*/.TweetMinerController.getLatLongPositions(tweet.getLocation())),format.raw/*27.115*/("""">"""),_display_(/*27.118*/tweet/*27.123*/.getLocation()),format.raw/*27.137*/("""</a></p>
                 <p><b>HashTags:-</b>"""),_display_(/*28.39*/for(hashtag<-tweet.getHashtags()) yield /*28.72*/{_display_(Seq[Any](format.raw/*28.73*/("""
                 
                 """),format.raw/*30.18*/("""<a href=""""),_display_(/*30.28*/routes/*30.34*/.TweetMinerController.searchHashTag(hashtag.getText())),format.raw/*30.88*/("""">#"""),_display_(/*30.92*/hashtag/*30.99*/.getText()),format.raw/*30.109*/("""</a> 
                 
                 """)))}),format.raw/*32.19*/("""
                 """),format.raw/*33.18*/("""</p>
                 <p>------------------------------------------------------------------------------------------------------------------------------------------------</P>
                </div> 
            """)))})))})))}),format.raw/*36.16*/("""
        """),format.raw/*37.9*/("""</body>
    </html>"""))
      }
    }
  }

  def render(searchform:Form[SearchKeyword],tweets:LinkedHashMap[String, List[TweetModel]]): play.twirl.api.HtmlFormat.Appendable = apply(searchform,tweets)

  def f:((Form[SearchKeyword],LinkedHashMap[String, List[TweetModel]]) => play.twirl.api.HtmlFormat.Appendable) = (searchform,tweets) => apply(searchform,tweets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jul 31 21:35:03 EDT 2018
                  SOURCE: C:/Users/JASKARN SINGH/Desktop/TweetMiner1/app/views/listresult.scala.html
                  HASH: 185f5cfa2fadcab76e512083a2c387dddd1d83e9
                  MATRIX: 1006->1|1159->117|1204->81|1232->83|1291->134|1323->140|1462->252|1477->258|1550->322|1589->323|1635->342|1650->348|1704->381|1750->399|1832->450|1876->466|1937->500|1962->516|2001->517|2044->533|2080->553|2119->554|2161->568|2224->604|2234->605|2262->612|2291->613|2356->651|2372->657|2433->696|2464->699|2489->702|2547->733|2576->746|2615->747|2657->761|2767->844|2782->850|2872->918|2903->921|2918->926|2968->954|3035->994|3049->999|3081->1010|3160->1062|3175->1068|3259->1130|3290->1133|3305->1138|3341->1152|3416->1200|3465->1233|3504->1234|3570->1272|3607->1282|3622->1288|3697->1342|3728->1346|3744->1353|3776->1363|3851->1407|3898->1426|4151->1642|4188->1652
                  LINES: 28->1|31->6|34->1|35->2|39->7|40->8|46->14|46->14|46->14|46->14|47->15|47->15|47->15|48->16|49->17|51->19|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|54->22|54->22|54->22|54->22|54->22|54->22|54->22|55->23|55->23|55->23|56->24|57->25|57->25|57->25|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|59->27|59->27|59->27|60->28|60->28|60->28|62->30|62->30|62->30|62->30|62->30|62->30|62->30|64->32|65->33|68->36|69->37
                  -- GENERATED --
              */
          