
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/aneesha.bahukhandi/PLAY/File-Upload-Translation/conf/routes
// @DATE:Tue May 23 19:00:50 IST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUploadController UploadController = new controllers.ReverseUploadController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUploadController UploadController = new controllers.javascript.ReverseUploadController(RoutesPrefix.byNamePrefix());
  }

}
