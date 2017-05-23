
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/aneesha.bahukhandi/PLAY/File-Upload-Translation/conf/routes
// @DATE:Tue May 23 19:00:50 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix, """@controllers.UploadController@.index()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """upload""", """@controllers.UploadController@.upload()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """list/all""", """@controllers.UploadController@.allFiles()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """@controllers.Assets@.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_UploadController_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_UploadController_index0_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UploadController]).index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UploadController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UploadController_upload1_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_UploadController_upload1_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UploadController]).upload(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UploadController",
      "upload",
      Nil,
      "POST",
      """""",
      this.prefix + """upload"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UploadController_allFiles2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("list/all")))
  )
  private[this] lazy val controllers_UploadController_allFiles2_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UploadController]).allFiles(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UploadController",
      "allFiles",
      Nil,
      "GET",
      """""",
      this.prefix + """list/all"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Assets_versioned3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Assets]).versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_UploadController_index0_route(params) =>
      call { 
        controllers_UploadController_index0_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UploadController]).index())
      }
  
    // @LINE:8
    case controllers_UploadController_upload1_route(params) =>
      call { 
        controllers_UploadController_upload1_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UploadController]).upload())
      }
  
    // @LINE:9
    case controllers_UploadController_allFiles2_route(params) =>
      call { 
        controllers_UploadController_allFiles2_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UploadController]).allFiles())
      }
  
    // @LINE:12
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Assets]).versioned(path, file))
      }
  }
}