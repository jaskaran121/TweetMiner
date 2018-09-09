// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JASKARN SINGH/Documents/GitHub/TweetMiner1/TweetMiner1/conf/routes
// @DATE:Sat Jul 28 17:33:57 EDT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
