
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

object UserData extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[twitter4j.User,List[twitter4j.Status],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:twitter4j.User,recentPost:List[twitter4j.Status]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""
"""),format.raw/*2.1*/("""<!-- Author Gagan -->

    <html>
        <head>
            <title>User</title>
          
        </head>

        <body>
        
        
        <h2>User Profile</h2>
		<p><b>Banner Image Url:-</b>"""),_display_(/*14.32*/user/*14.36*/.getProfileBannerURL()),format.raw/*14.58*/("""</p>
		<p><b>Profile Image Url:-</b>"""),_display_(/*15.33*/user/*15.37*/.getBiggerProfileImageURLHttps()),format.raw/*15.69*/("""</p>
		<p><b>Following:-</b>"""),_display_(/*16.25*/user/*16.29*/.getFriendsCount),format.raw/*16.45*/("""</p>
		<p><b>Followers:-</b>"""),_display_(/*17.25*/user/*17.29*/.getFollowersCount),format.raw/*17.47*/("""</p>
		<p><b>Likes:-</b>"""),_display_(/*18.21*/user/*18.25*/.getFavouritesCount),format.raw/*18.44*/("""</p>
		<p><b>No of Tweets:-</b>"""),_display_(/*19.28*/user/*19.32*/.getStatusesCount),format.raw/*19.49*/("""</p>
		<a target="_blank" href="https://twitter.com/"""),_display_(/*20.49*/user/*20.53*/.getScreenName),format.raw/*20.67*/("""" >"""),_display_(/*20.71*/user/*20.75*/.getName),format.raw/*20.83*/("""</a>
	
		<div >
	<h2>Recent Posts:</h2>
	"""),_display_(/*24.3*/if(!recentPost.isEmpty)/*24.26*/{_display_(Seq[Any](format.raw/*24.27*/("""
		"""),_display_(/*25.4*/for(status <- recentPost) yield /*25.29*/{_display_(Seq[Any](format.raw/*25.30*/("""
			"""),format.raw/*26.4*/("""<div>
				<div >
					<strong>"""),_display_(/*28.15*/status/*28.21*/.getUser().getName()),format.raw/*28.41*/("""</strong>
								<br/>&#64<i>"""),_display_(/*29.22*/status/*29.28*/.getUser().getScreenName()),format.raw/*29.54*/("""</i>
							</div>
							<div >	
								<p> """),_display_(/*32.14*/status/*32.20*/.getText),format.raw/*32.28*/("""</p>
								
								<p>
									<span >"""),_display_(/*35.18*/if(status.getRetweetedStatus!=null)/*35.53*/{_display_(_display_(/*35.55*/status/*35.61*/.getRetweetedStatus.getRetweetCount))}/*35.98*/else/*35.103*/{_display_(Seq[Any](format.raw/*35.104*/(""" """),format.raw/*35.105*/("""0 """)))}),format.raw/*35.108*/("""</span>
									<span >"""),_display_(/*36.18*/if(status.getRetweetedStatus!=null)/*36.53*/{_display_(_display_(/*36.55*/status/*36.61*/.getRetweetedStatus.getFavoriteCount))}/*36.99*/else/*36.104*/{_display_(Seq[Any](format.raw/*36.105*/(""" """),format.raw/*36.106*/("""0 """)))}),format.raw/*36.109*/("""</span>
								</p>
							</div>
						</div>
					</div>
				</div>
		""")))}),format.raw/*42.4*/("""
	""")))}),format.raw/*43.3*/("""
	"""),format.raw/*44.2*/("""</div>

        </body>"""))
      }
    }
  }

  def render(user:twitter4j.User,recentPost:List[twitter4j.Status]): play.twirl.api.HtmlFormat.Appendable = apply(user,recentPost)

  def f:((twitter4j.User,List[twitter4j.Status]) => play.twirl.api.HtmlFormat.Appendable) = (user,recentPost) => apply(user,recentPost)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jul 31 16:35:00 EDT 2018
                  SOURCE: C:/Users/JASKARN SINGH/Desktop/TweetMiner1/app/views/UserData.scala.html
                  HASH: a35bbd8c3d42f44467311d85ebd5380ffbb7ea55
                  MATRIX: 982->1|1132->56|1160->58|1402->273|1415->277|1458->299|1523->337|1536->341|1589->373|1646->403|1659->407|1696->423|1753->453|1766->457|1805->475|1858->501|1871->505|1911->524|1971->557|1984->561|2022->578|2103->632|2116->636|2151->650|2182->654|2195->658|2224->666|2296->712|2328->735|2367->736|2398->741|2439->766|2478->767|2510->772|2570->805|2585->811|2626->831|2685->863|2700->869|2747->895|2824->945|2839->951|2868->959|2941->1005|2985->1040|3015->1042|3030->1048|3077->1085|3091->1090|3131->1091|3161->1092|3196->1095|3249->1121|3293->1156|3323->1158|3338->1164|3386->1202|3400->1207|3440->1208|3470->1209|3505->1212|3615->1292|3649->1296|3679->1299
                  LINES: 28->1|33->1|34->2|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|56->24|56->24|56->24|57->25|57->25|57->25|58->26|60->28|60->28|60->28|61->29|61->29|61->29|64->32|64->32|64->32|67->35|67->35|67->35|67->35|67->35|67->35|67->35|67->35|67->35|68->36|68->36|68->36|68->36|68->36|68->36|68->36|68->36|68->36|74->42|75->43|76->44
                  -- GENERATED --
              */
          