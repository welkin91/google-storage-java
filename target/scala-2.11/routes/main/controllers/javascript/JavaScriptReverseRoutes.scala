
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/aneesha.bahukhandi/PLAY/File-Upload-Translation/conf/routes
// @DATE:Tue May 23 19:00:50 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:12
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseUploadController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UploadController.upload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
    // @LINE:9
    def allFiles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UploadController.allFiles",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "list/all"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UploadController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}