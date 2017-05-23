
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="stylesheet" media="screen" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.10/semantic.css">

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
        <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"
            type="text/javascript"></script>
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.versioned("javascripts/storage_functions.js")),format.raw/*20.70*/(""""
            type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.10/semantic.js" 
            type="text/javascript"></script>
    </head>
    <body>
        <div class="ui top attached demo menu">
            <a class="item">
                <i class="sidebar icon"></i>
                Menu
            </a>
        </div>
        <div class="ui bottom attached segment pushable">
            <div class="ui inverted labeled icon left inline vertical sidebar menu uncover visible">
                <a class="item" id='upload_button'>
                    <i class="upload icon"></i>
                    Upload a file
                </a>
                <a class="item" id="show_button">
                    <i class="block layout icon"></i>
                    View all files
                </a>
            </div>
            <div class="pusher" style="margin-left: -9%; margin-top: 2%">
                <div>

                    """),_display_(/*46.22*/content),format.raw/*46.29*/("""

                """),format.raw/*48.17*/("""</div>
                <div class="ui segment loader_segment hidden loading" style="min-height: 300px; width: 80%; display: none">

                </div>

            </div>
        </div>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue May 23 20:58:02 IST 2017
                  SOURCE: /Users/aneesha.bahukhandi/PLAY/File-Upload-Translation/app/views/main.scala.html
                  HASH: 93856457a59ba93007f94592c51a08683bfcdd05
                  MATRIX: 1002->260|1127->290|1155->292|1235->397|1271->406|1306->414|1332->419|1421->481|1436->487|1499->528|1713->715|1728->721|1789->760|1967->911|1982->917|2044->958|3066->1953|3094->1960|3140->1978
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|47->17|47->17|47->17|50->20|50->20|50->20|76->46|76->46|78->48
                  -- GENERATED --
              */
          