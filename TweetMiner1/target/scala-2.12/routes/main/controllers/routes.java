// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JASKARN SINGH/Desktop/TweetMiner1/conf/routes
// @DATE:Tue Jul 31 21:28:17 EDT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTweetMinerController TweetMinerController = new controllers.ReverseTweetMinerController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTweetMinerController TweetMinerController = new controllers.javascript.ReverseTweetMinerController(RoutesPrefix.byNamePrefix());
  }

}
