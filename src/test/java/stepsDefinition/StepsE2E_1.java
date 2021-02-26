package stepsDefinition;

import context.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PageEnd2End;

public class StepsE2E_1 {

	TestContext tstContext;
	PageEnd2End e2e;
	public StepsE2E_1(TestContext context) {
		tstContext=context;
		e2e=tstContext.getPageObjMng().getEnd2End();
	}
	
	@When("^selecciono la ficha (\\d+) de la lista$")
	public void selecciono_la_ficha_de_la_lista(int ficha) throws Throwable {
	    System.out.println("Cuando selecciono la ficha "+ficha+" de la lista");
	    e2e.select_Card(ficha);
	}
	
	@When("^selecciono la opcion (\\d+) del dropdown \"([^\"]*)\"$")
	public void selecciono_la_opcion_del_dropdown(int index, String option) throws Throwable {
		System.out.println("Cuando selecciono la opcion "+index+" del dropdown "+option+".");
	}
	
	@When("^hago clic en el boton \"([^\"]*)\"$")
	public void hago_clic_en_el_boton(String boton) throws Throwable {
		System.out.println("Cuando hago clic en el boton "+boton+".");
	}
	
	@Then("^se agrega al carrito de compra un producto$")
	public void se_agrega_al_carrito_de_compra_un_producto() throws Throwable {
		System.out.println("Entonces se agrega al carrito de compra un producto");
	}



}
