
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
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

     object list_Scope1 {
import java.util

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[models.MediaDescriptor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(mediaList: util.List[models.MediaDescriptor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.48*/("""

"""),_display_(/*5.2*/main("")/*5.10*/ {_display_(Seq[Any](format.raw/*5.12*/("""

    """),format.raw/*7.5*/("""<div class="ui segment" id='show_div' style="width: 80%">
        <div class="ui ignored info message">
            This tool uses asynchronous voice recognition features of
                <a href="https://cloud.google.com/speech/docs/">
                    <code>Google Speech Apis v1 (beta).</code>
                </a> It might take some time to retrieve the script.
        </div>
        """),_display_(/*14.10*/if(mediaList == null)/*14.31*/{_display_(Seq[Any](format.raw/*14.32*/("""
            """),format.raw/*15.13*/("""<div class="ui segment loading" style="min-height: 200px">

            </div>
        """)))}/*18.11*/else/*18.16*/{_display_(Seq[Any](format.raw/*18.17*/("""
            """),format.raw/*19.13*/("""<div class="table_body">
                <table class="ui celled table">
                    <thead>
                        <tr>
                            <th>File Name</th>
                            <th>Global Link</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*29.22*/for(media <- mediaList) yield /*29.45*/ {_display_(Seq[Any](format.raw/*29.47*/("""
                        """),format.raw/*30.25*/("""<tr>
                            <td >"""),_display_(/*31.35*/media/*31.40*/.getItemName),format.raw/*31.52*/("""</td>
                            <td>"""),_display_(/*32.34*/media/*32.39*/.getMediaUrl),format.raw/*32.51*/("""</td>
                            <td>
                                <div class="ui small basic icon buttons yellow">
                                    <button class="ui button convert_btns"
                                    data-segment_id=""""),_display_(/*36.55*/media/*36.60*/.getMediaId),format.raw/*36.71*/(""""
                                    data-file_name=""""),_display_(/*37.54*/media/*37.59*/.getItemName),format.raw/*37.71*/(""""
                                    >
                                        <i class="file icon"></i> Convert into Text
                                    </button>
                                </div>
                            </td>
                        </tr>
                        <tr class="file_segment_"""),_display_(/*44.50*/media/*44.55*/.getMediaId),format.raw/*44.66*/("""" style="display: none">
                            <td colspan="3">
                                <div class="ui segment loading raised loading_segment_"""),_display_(/*46.88*/media/*46.93*/.getMediaId),format.raw/*46.104*/("""" style="min-height: 80px">

                            </div>
                            </td>
                        </tr>
                    """)))}),format.raw/*51.22*/("""

                    """),format.raw/*53.21*/("""</tbody>
                    <tfoot>
                        <tr>
                            <th colspan="3">Thats all folks!</th>
                        </tr>
                    </tfoot>
                </table>
            </div>
        """)))}),format.raw/*61.10*/("""
    """),format.raw/*62.5*/("""</div>
""")))}),format.raw/*63.2*/("""
"""),format.raw/*64.1*/("""<t></t>"""))
      }
    }
  }

  def render(mediaList:util.List[models.MediaDescriptor]): play.twirl.api.HtmlFormat.Appendable = apply(mediaList)

  def f:((util.List[models.MediaDescriptor]) => play.twirl.api.HtmlFormat.Appendable) = (mediaList) => apply(mediaList)

  def ref: this.type = this

}


}
}

/**/
object list extends list_Scope0.list_Scope1.list
              /*
                  -- GENERATED --
                  DATE: Tue May 23 22:43:22 IST 2017
                  SOURCE: /Users/aneesha.bahukhandi/PLAY/File-Upload-Translation/app/views/list.scala.html
                  HASH: 150e3b6c30f50f72a7bf9814d9013d1e73f6cb68
                  MATRIX: 814->20|955->66|983->69|999->77|1038->79|1070->85|1492->480|1522->501|1561->502|1602->515|1709->604|1722->609|1761->610|1802->623|2208->1002|2247->1025|2287->1027|2340->1052|2406->1091|2420->1096|2453->1108|2519->1147|2533->1152|2566->1164|2842->1413|2856->1418|2888->1429|2970->1484|2984->1489|3017->1501|3366->1823|3380->1828|3412->1839|3596->1996|3610->2001|3643->2012|3823->2161|3873->2183|4148->2427|4180->2432|4218->2440|4246->2441
                  LINES: 30->3|35->3|37->5|37->5|37->5|39->7|46->14|46->14|46->14|47->15|50->18|50->18|50->18|51->19|61->29|61->29|61->29|62->30|63->31|63->31|63->31|64->32|64->32|64->32|68->36|68->36|68->36|69->37|69->37|69->37|76->44|76->44|76->44|78->46|78->46|78->46|83->51|85->53|93->61|94->62|95->63|96->64
                  -- GENERATED --
              */
          