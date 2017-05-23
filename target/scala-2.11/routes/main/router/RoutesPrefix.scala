
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/aneesha.bahukhandi/PLAY/File-Upload-Translation/conf/routes
// @DATE:Tue May 23 19:00:50 IST 2017


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
