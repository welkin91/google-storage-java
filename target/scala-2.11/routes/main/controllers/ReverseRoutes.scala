
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/aneesha.bahukhandi/PLAY/File-Upload-Translation/conf/routes
// @DATE:Tue May 23 19:00:50 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:12
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseUploadController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def upload(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "upload")
    }
  
    // @LINE:9
    def allFiles(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "list/all")
    }
  
    // @LINE:7
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }


}