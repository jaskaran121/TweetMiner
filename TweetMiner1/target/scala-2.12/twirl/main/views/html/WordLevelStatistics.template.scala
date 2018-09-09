
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

object WordLevelStatistics extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, Long],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(print:Map[String, Long]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<!-- Author Gurdip -->


<!DOCTYPE html>
<html lang="en">
<head>
	<title>Word Level Statistics Table</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*13.48*/routes/*13.54*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*13.104*/("""">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*15.48*/routes/*15.54*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*15.107*/("""">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*17.48*/routes/*17.54*/.Assets.versioned("stylesheets/animate.css")),format.raw/*17.98*/("""">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*19.48*/routes/*19.54*/.Assets.versioned("stylesheets/select2.min.css")),format.raw/*19.102*/("""">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*21.48*/routes/*21.54*/.Assets.versioned("stylesheets/perfect-scrollbar.css")),format.raw/*21.108*/("""">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*23.48*/routes/*23.54*/.Assets.versioned("stylesheets/util.css")),format.raw/*23.95*/("""">
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*24.48*/routes/*24.54*/.Assets.versioned("stylesheets/main.css")),format.raw/*24.95*/("""">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
							<div class="table100 ver3 m-b-110">
					<div class="table100-head">
						<table>
							<thead>
								<tr class="row100 head">
									<th>Word Level Statistics Table</th>
									
								</tr>
							</thead>
						</table>
					</div>

				</div>
				<div class="table100 ver1 m-b-110">
					
					<div class="table100-head">
						<table>
							<thead>
								<tr class="row100 head">
									<th class="cell100 column1">Unique Word</th>
									<th class="cell100 column2">Count</th>
									
								</tr>
							</thead>
						</table>
					</div>
					"""),_display_(/*58.7*/for((str,t)<-print) yield /*58.26*/{_display_(Seq[Any](format.raw/*58.27*/("""

					"""),format.raw/*60.6*/("""<div class="table100-body js-pscroll">
						<table>
							<tbody>
								<tr class="row100 body">
									<td class="cell100 column1">"""),_display_(/*64.39*/str),format.raw/*64.42*/("""</td>
									<td class="cell100 column2">"""),_display_(/*65.39*/t),format.raw/*65.40*/("""</td>
								</tr>
							</tbody>
						</table>
					</div>
					""")))}),format.raw/*70.7*/("""
				"""),format.raw/*71.5*/("""</div>
				
	






			</div>
		</div>
	</div>


<!--===============================================================================================-->	
	<script src=""""),_display_(/*86.16*/routes/*86.22*/.Assets.versioned("javascripts/jquery-3.2.1.min.js")),format.raw/*86.74*/(""""></script>
<!--===============================================================================================-->
	<script src=""""),_display_(/*88.16*/routes/*88.22*/.Assets.versioned("javascripts/popper.js")),format.raw/*88.64*/(""""></script>
	<script src=""""),_display_(/*89.16*/routes/*89.22*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*89.71*/(""""></script>
<!--===============================================================================================-->
	
<!--===============================================================================================-->
	<script src=""""),_display_(/*93.16*/routes/*93.22*/.Assets.versioned("javascripts/perfect-scrollbar.min.js")),format.raw/*93.79*/(""""></script>
	<script>
		$('.js-pscroll').each(function()"""),format.raw/*95.35*/("""{"""),format.raw/*95.36*/("""
			"""),format.raw/*96.4*/("""var ps = new PerfectScrollbar(this);

			$(window).on('resize', function()"""),format.raw/*98.37*/("""{"""),format.raw/*98.38*/("""
				"""),format.raw/*99.5*/("""ps.update();
			"""),format.raw/*100.4*/("""}"""),format.raw/*100.5*/(""")
		"""),format.raw/*101.3*/("""}"""),format.raw/*101.4*/(""");
			
		
	</script>
<!--===============================================================================================-->
	<script src=""""),_display_(/*106.16*/routes/*106.22*/.Assets.versioned("javascripts/main.js")),format.raw/*106.62*/(""""></script>

</body>
</html>
<html><body>

</body>
</html>"""))
      }
    }
  }

  def render(print:Map[String, Long]): play.twirl.api.HtmlFormat.Appendable = apply(print)

  def f:((Map[String, Long]) => play.twirl.api.HtmlFormat.Appendable) = (print) => apply(print)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jul 31 16:35:00 EDT 2018
                  SOURCE: C:/Users/JASKARN SINGH/Desktop/TweetMiner1/app/views/WordLevelStatistics.scala.html
                  HASH: bcc5d1e8693eff3249dcf0e5d91329fc3a62c2a8
                  MATRIX: 973->1|1093->26|1121->28|1513->393|1528->399|1600->449|1782->604|1797->610|1872->663|2054->818|2069->824|2134->868|2316->1023|2331->1029|2401->1077|2583->1232|2598->1238|2674->1292|2856->1447|2871->1453|2933->1494|3011->1545|3026->1551|3088->1592|3939->2417|3974->2436|4013->2437|4049->2446|4219->2589|4243->2592|4315->2637|4337->2638|4441->2712|4474->2718|4684->2901|4699->2907|4772->2959|4931->3091|4946->3097|5009->3139|5064->3167|5079->3173|5149->3222|5415->3461|5430->3467|5508->3524|5594->3582|5623->3583|5655->3588|5759->3664|5788->3665|5821->3671|5866->3688|5895->3689|5928->3694|5957->3695|6129->3839|6145->3845|6207->3885
                  LINES: 28->1|33->1|34->2|45->13|45->13|45->13|47->15|47->15|47->15|49->17|49->17|49->17|51->19|51->19|51->19|53->21|53->21|53->21|55->23|55->23|55->23|56->24|56->24|56->24|90->58|90->58|90->58|92->60|96->64|96->64|97->65|97->65|102->70|103->71|118->86|118->86|118->86|120->88|120->88|120->88|121->89|121->89|121->89|125->93|125->93|125->93|127->95|127->95|128->96|130->98|130->98|131->99|132->100|132->100|133->101|133->101|138->106|138->106|138->106
                  -- GENERATED --
              */
          