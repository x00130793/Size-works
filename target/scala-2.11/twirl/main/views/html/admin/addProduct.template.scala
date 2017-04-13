
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

     object addProduct_Scope1 {
import models._
import helper._

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[models.Product],models.users.User,Form[models.Size],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(addProductForm: play.data.Form[models.Product], user: models.users.User, size: Form[models.Size]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.100*/("""


"""),format.raw/*8.102*/("""

"""),_display_(/*10.2*/admin/*10.7*/.adminMain("Add Product", user)/*10.38*/ {_display_(Seq[Any](format.raw/*10.40*/("""
	"""),format.raw/*11.2*/("""<h3>Add a new Product</h3>
	
						

	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*16.3*/form(action = routes.AdminController.addProductSubmit(), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*16.138*/ {_display_(Seq[Any](format.raw/*16.140*/("""
		





		"""),format.raw/*23.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*25.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*25.81*/("""
		"""),_display_(/*26.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*26.95*/("""

        """),format.raw/*28.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        """),_display_(/*30.10*/for((value, name) <- Category.options) yield /*30.48*/ {_display_(Seq[Any](format.raw/*30.50*/("""
            """),format.raw/*31.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*31.63*/value),format.raw/*31.68*/("""" />"""),_display_(/*31.73*/name),format.raw/*31.77*/("""<br>        
        """)))}),format.raw/*32.10*/("""

		"""),_display_(/*34.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*34.83*/("""
		"""),_display_(/*35.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*35.83*/("""
		"""),_display_(/*36.4*/inputText(addProductForm("sizeName"), '_label -> "Size",'class -> "form-control")),format.raw/*36.85*/("""
		
		

		"""),format.raw/*40.3*/("""<!-- Image upload input -->
		<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Add Product" class="btn btn-primary">
			<a href=""""),_display_(/*49.14*/routes/*49.20*/.AdminController.products(0)),format.raw/*49.48*/(""""
				<button class="btn btn-warning">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*53.3*/(""" """),format.raw/*53.4*/("""<!-- End Form definition -->

""")))}),format.raw/*55.2*/(""" """),format.raw/*55.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:play.data.Form[models.Product],user:models.users.User,size:Form[models.Size]): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user,size)

  def f:((play.data.Form[models.Product],models.users.User,Form[models.Size]) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user,size) => apply(addProductForm,user,size)

  def ref: this.type = this

}


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Thu Apr 13 16:00:15 IST 2017
                  SOURCE: /home/wdd/Desktop/13-04-17/integrated-11-04-17/app/views/admin/addProduct.scala.html
                  HASH: 43059e1c527c23eeeff2e712e37f20da217e609a
                  MATRIX: 886->37|1080->135|1111->239|1140->242|1153->247|1193->278|1233->280|1262->282|1391->385|1536->520|1577->522|1615->533|1736->628|1834->705|1864->709|1976->800|2013->810|2208->978|2262->1016|2302->1018|2343->1031|2420->1081|2446->1086|2478->1091|2503->1095|2556->1117|2587->1122|2687->1201|2717->1205|2817->1284|2847->1288|2949->1369|2986->1379|3282->1648|3297->1654|3346->1682|3449->1755|3477->1756|3538->1787|3566->1788
                  LINES: 31->5|36->5|39->8|41->10|41->10|41->10|41->10|42->11|47->16|47->16|47->16|54->23|56->25|56->25|57->26|57->26|59->28|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|63->32|65->34|65->34|66->35|66->35|67->36|67->36|71->40|80->49|80->49|80->49|84->53|84->53|86->55|86->55
                  -- GENERATED --
              */
          