
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

object hashTaglistresult extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[TweetModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(hashtag:String , tweets:List[TweetModel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*6.2*/import helper._


Seq[Any](format.raw/*1.44*/("""
"""),format.raw/*2.1*/("""<!-- Author Jaskaran -->



"""),format.raw/*7.1*/("""
    """),format.raw/*8.5*/("""<html>
        <head>
            <title>Search Word</title>
        </head>

        <body>
            

            <h1>ALL Tweets using """),_display_(/*16.35*/hashtag),format.raw/*16.42*/(""" """),format.raw/*16.43*/("""</h1>
            """),_display_(/*17.14*/if(tweets!=null)/*17.30*/{_display_(Seq[Any](format.raw/*17.31*/("""
             """),_display_(/*18.15*/for(tweet<-tweets) yield /*18.33*/{_display_(Seq[Any](format.raw/*18.34*/("""
           
                """),format.raw/*20.17*/("""<b>Author:-</b><a href=""""),_display_(/*20.42*/routes/*20.48*/.TweetMinerController.getUserData(tweet.getAuthor().getScreenName())),format.raw/*20.116*/("""">"""),_display_(/*20.119*/tweet/*20.124*/.getAuthor().getScreenName()),format.raw/*20.152*/("""</a>
                <p><b>Tweet:-</b>"""),_display_(/*21.35*/tweet/*21.40*/.getTweet()),format.raw/*21.51*/("""</p>
                 <p><b>Location:-</b>"""),_display_(/*22.39*/tweet/*22.44*/.getLocation()),format.raw/*22.58*/("""</p>
                 <p><b>HashTags:-</b>"""),_display_(/*23.39*/for(hashtag<-tweet.getHashtags()) yield /*23.72*/{_display_(Seq[Any](format.raw/*23.73*/("""
                 
                  """),format.raw/*25.19*/("""<a href=""""),_display_(/*25.29*/routes/*25.35*/.TweetMinerController.searchHashTag(hashtag.getText())),format.raw/*25.89*/("""">#"""),_display_(/*25.93*/hashtag/*25.100*/.getText()),format.raw/*25.110*/("""</a> 
                 
                 """)))}),format.raw/*27.19*/("""
                 """),format.raw/*28.18*/("""</p>
                 <p>------------------------------------------------------------------------------------------------------------------------------------------------</P>
            """)))})))}),format.raw/*30.15*/("""
        """),format.raw/*31.9*/("""</body>
    </html>"""))
      }
    }
  }

  def render(hashtag:String,tweets:List[TweetModel]): play.twirl.api.HtmlFormat.Appendable = apply(hashtag,tweets)

  def f:((String,List[TweetModel]) => play.twirl.api.HtmlFormat.Appendable) = (hashtag,tweets) => apply(hashtag,tweets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jul 31 16:35:00 EDT 2018
                  SOURCE: C:/Users/JASKARN SINGH/Desktop/TweetMiner1/app/views/hashTaglistresult.scala.html
                  HASH: 62e321ff435f4375b3e953643847139a0399f99f
                  MATRIX: 977->1|1092->78|1137->43|1165->45|1223->95|1255->101|1431->250|1459->257|1488->258|1535->278|1560->294|1599->295|1642->311|1676->329|1715->330|1774->361|1826->386|1841->392|1931->460|1962->463|1977->468|2027->496|2094->536|2108->541|2140->552|2211->596|2225->601|2260->615|2331->659|2380->692|2419->693|2486->732|2523->742|2538->748|2613->802|2644->806|2661->813|2693->823|2768->867|2815->886|3039->1076|3076->1086
                  LINES: 28->1|31->6|34->1|35->2|39->7|40->8|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|52->20|52->20|52->20|52->20|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|57->25|57->25|57->25|57->25|57->25|57->25|57->25|59->27|60->28|62->30|63->31
                  -- GENERATED --
              */
          