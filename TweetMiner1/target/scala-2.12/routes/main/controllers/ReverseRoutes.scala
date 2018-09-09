// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JASKARN SINGH/Desktop/TweetMiner1/conf/routes
// @DATE:Tue Jul 31 21:28:17 EDT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseTweetMinerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def getLatLongPositions(address:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Location" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("address", address)))))
    }
  
    // @LINE:12
    def searchHashTag(searchKeyword:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "HashTaglistresult" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("searchKeyword", searchKeyword)))))
    }
  
    // @LINE:10
    def getUserData(screenName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userdata" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("screenName", screenName)))))
    }
  
    // @LINE:11
    def appendString(searchKeyword:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "index1" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("searchKeyword", searchKeyword)))))
    }
  
    // @LINE:7
    def search(): Call = {
      
      Call("POST", _prefix)
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def tweetrouter(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tweets")
    }
  
  }


}
