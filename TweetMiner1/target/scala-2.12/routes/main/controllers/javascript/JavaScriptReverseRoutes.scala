// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JASKARN SINGH/Desktop/TweetMiner1/conf/routes
// @DATE:Tue Jul 31 21:28:17 EDT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseTweetMinerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def getLatLongPositions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TweetMinerController.getLatLongPositions",
      """
        function(address0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Location" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("address", address0)])})
        }
      """
    )
  
    // @LINE:12
    def searchHashTag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TweetMinerController.searchHashTag",
      """
        function(searchKeyword0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HashTaglistresult" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("searchKeyword", searchKeyword0)])})
        }
      """
    )
  
    // @LINE:10
    def getUserData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TweetMinerController.getUserData",
      """
        function(screenName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userdata" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("screenName", screenName0)])})
        }
      """
    )
  
    // @LINE:11
    def appendString: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TweetMinerController.appendString",
      """
        function(searchKeyword0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index1" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("searchKeyword", searchKeyword0)])})
        }
      """
    )
  
    // @LINE:7
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TweetMinerController.search",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TweetMinerController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def tweetrouter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TweetMinerController.tweetrouter",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tweets"})
        }
      """
    )
  
  }


}
