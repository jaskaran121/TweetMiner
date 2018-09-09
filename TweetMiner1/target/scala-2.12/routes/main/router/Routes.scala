// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JASKARN SINGH/Desktop/TweetMiner1/conf/routes
// @DATE:Tue Jul 31 21:28:17 EDT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  TweetMinerController_0: controllers.TweetMinerController,
  // @LINE:14
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    TweetMinerController_0: controllers.TweetMinerController,
    // @LINE:14
    Assets_1: controllers.Assets
  ) = this(errorHandler, TweetMinerController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, TweetMinerController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.TweetMinerController.index"""),
    ("""POST""", this.prefix, """controllers.TweetMinerController.search"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tweets""", """controllers.TweetMinerController.tweetrouter"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Location""", """controllers.TweetMinerController.getLatLongPositions(address:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userdata""", """controllers.TweetMinerController.getUserData(screenName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index1""", """controllers.TweetMinerController.appendString(searchKeyword:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """HashTaglistresult""", """controllers.TweetMinerController.searchHashTag(searchKeyword:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_TweetMinerController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_TweetMinerController_index0_invoker = createInvoker(
    TweetMinerController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TweetMinerController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_TweetMinerController_search1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_TweetMinerController_search1_invoker = createInvoker(
    TweetMinerController_0.search,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TweetMinerController",
      "search",
      Nil,
      "POST",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_TweetMinerController_tweetrouter2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tweets")))
  )
  private[this] lazy val controllers_TweetMinerController_tweetrouter2_invoker = createInvoker(
    TweetMinerController_0.tweetrouter,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TweetMinerController",
      "tweetrouter",
      Nil,
      "GET",
      this.prefix + """tweets""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_TweetMinerController_getLatLongPositions3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Location")))
  )
  private[this] lazy val controllers_TweetMinerController_getLatLongPositions3_invoker = createInvoker(
    TweetMinerController_0.getLatLongPositions(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TweetMinerController",
      "getLatLongPositions",
      Seq(classOf[String]),
      "GET",
      this.prefix + """Location""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_TweetMinerController_getUserData4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userdata")))
  )
  private[this] lazy val controllers_TweetMinerController_getUserData4_invoker = createInvoker(
    TweetMinerController_0.getUserData(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TweetMinerController",
      "getUserData",
      Seq(classOf[String]),
      "GET",
      this.prefix + """userdata""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_TweetMinerController_appendString5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index1")))
  )
  private[this] lazy val controllers_TweetMinerController_appendString5_invoker = createInvoker(
    TweetMinerController_0.appendString(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TweetMinerController",
      "appendString",
      Seq(classOf[String]),
      "GET",
      this.prefix + """index1""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_TweetMinerController_searchHashTag6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("HashTaglistresult")))
  )
  private[this] lazy val controllers_TweetMinerController_searchHashTag6_invoker = createInvoker(
    TweetMinerController_0.searchHashTag(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TweetMinerController",
      "searchHashTag",
      Seq(classOf[String]),
      "GET",
      this.prefix + """HashTaglistresult""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_TweetMinerController_index0_route(params@_) =>
      call { 
        controllers_TweetMinerController_index0_invoker.call(TweetMinerController_0.index)
      }
  
    // @LINE:7
    case controllers_TweetMinerController_search1_route(params@_) =>
      call { 
        controllers_TweetMinerController_search1_invoker.call(TweetMinerController_0.search)
      }
  
    // @LINE:8
    case controllers_TweetMinerController_tweetrouter2_route(params@_) =>
      call { 
        controllers_TweetMinerController_tweetrouter2_invoker.call(TweetMinerController_0.tweetrouter)
      }
  
    // @LINE:9
    case controllers_TweetMinerController_getLatLongPositions3_route(params@_) =>
      call(params.fromQuery[String]("address", None)) { (address) =>
        controllers_TweetMinerController_getLatLongPositions3_invoker.call(TweetMinerController_0.getLatLongPositions(address))
      }
  
    // @LINE:10
    case controllers_TweetMinerController_getUserData4_route(params@_) =>
      call(params.fromQuery[String]("screenName", None)) { (screenName) =>
        controllers_TweetMinerController_getUserData4_invoker.call(TweetMinerController_0.getUserData(screenName))
      }
  
    // @LINE:11
    case controllers_TweetMinerController_appendString5_route(params@_) =>
      call(params.fromQuery[String]("searchKeyword", None)) { (searchKeyword) =>
        controllers_TweetMinerController_appendString5_invoker.call(TweetMinerController_0.appendString(searchKeyword))
      }
  
    // @LINE:12
    case controllers_TweetMinerController_searchHashTag6_route(params@_) =>
      call(params.fromQuery[String]("searchKeyword", None)) { (searchKeyword) =>
        controllers_TweetMinerController_searchHashTag6_invoker.call(TweetMinerController_0.searchHashTag(searchKeyword))
      }
  
    // @LINE:14
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
