
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.ErrorDescriptor,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(error: models.ErrorDescriptor)(success: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""

"""),_display_(/*3.2*/main("")/*3.10*/ {_display_(Seq[Any](format.raw/*3.12*/("""
 """),format.raw/*4.2*/("""<div class="ui segment main_segment" style="width: 80%">
 <div class="ui ignored info message" style="text-align: center">
 <b>Please Upload any new files to the Bucket!</b> Please Visit <a href="http://localhost:9000/list/all">
   <code>"View all files"</code>
  </a> for their Srcipts!
 </div>
 <div class="ui basic segment" style="width: 33%; margin-left: 33%">
  <div class="container" id='upload_div'>
   <div class="ui card raised">
    <div class="content">
     <div class="ui small feed">
      <h3>
        Please Upload here
      </h3>
      <br>
      """),format.raw/*19.59*/("""
      """),format.raw/*20.7*/("""<div class="ui action input">
       <input type="text" placeholder="Browse Path" id="input_field" value="">
       <button class="ui button browse yellow basic">Browse</button>
      </div>
      <p>
       """),_display_(/*25.9*/helper/*25.15*/.form(action = routes.UploadController.upload, 'enctype -> "multipart/form-data")/*25.96*/ {_display_(Seq[Any](format.raw/*25.98*/("""
       """),format.raw/*26.8*/("""<input type="file" class="browse_hidden" name="audioFileDescriptor" style="display: none">

       <p>
         <button class="ui button hidden hidden_upload_btn" type="submit" style="display: none">Upload</button>
       </p>
      """)))}),format.raw/*31.8*/("""
     """),format.raw/*32.6*/("""</div>
    </div>
    <div class="extra content">
     <button class="ui button green" id="upload_submit">Upload</button>
    </div>
   </div>
  </div>
  </div>
  """),_display_(/*40.4*/if(error != null)/*40.21*/ {_display_(Seq[Any](format.raw/*40.23*/("""
   """),format.raw/*41.4*/("""<div class="ui ignored error message" style="text-align: center">
    Error Occurred:  """),_display_(/*42.23*/error/*42.28*/.getMessage),format.raw/*42.39*/("""
   """),format.raw/*43.4*/("""</div>
  """)))}),format.raw/*44.4*/("""
  """),_display_(/*45.4*/if(success != null)/*45.23*/ {_display_(Seq[Any](format.raw/*45.25*/("""
   """),format.raw/*46.4*/("""<div class="ui ignored positive message" style="text-align: center">
    """),_display_(/*47.6*/success),format.raw/*47.13*/("""
   """),format.raw/*48.4*/("""</div>
  """)))}),format.raw/*49.4*/("""
 """),format.raw/*50.2*/("""</div>

""")))}),format.raw/*52.2*/("""
"""),format.raw/*53.1*/("""<t></t>"""))
      }
    }
  }

  def render(error:models.ErrorDescriptor,success:String): play.twirl.api.HtmlFormat.Appendable = apply(error)(success)

  def f:((models.ErrorDescriptor) => (String) => play.twirl.api.HtmlFormat.Appendable) = (error) => (success) => apply(error)(success)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue May 23 20:48:11 IST 2017
                  SOURCE: /Users/aneesha.bahukhandi/PLAY/File-Upload-Translation/app/views/index.scala.html
                  HASH: 4e95302e0af869dab6057bc7e47bd479c791727d
                  MATRIX: 768->1|911->49|939->52|955->60|994->62|1022->64|1615->681|1649->688|1884->897|1899->903|1989->984|2029->986|2064->994|2328->1228|2361->1234|2551->1398|2577->1415|2617->1417|2648->1421|2763->1509|2777->1514|2809->1525|2840->1529|2880->1539|2910->1543|2938->1562|2978->1564|3009->1568|3109->1642|3137->1649|3168->1653|3208->1663|3237->1665|3276->1674|3304->1675
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|50->19|51->20|56->25|56->25|56->25|56->25|57->26|62->31|63->32|71->40|71->40|71->40|72->41|73->42|73->42|73->42|74->43|75->44|76->45|76->45|76->45|77->46|78->47|78->47|79->48|80->49|81->50|83->52|84->53
                  -- GENERATED --
              */
          