package stepsDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepsAPI_1 {

	@Given("^accedo a la url \"([^\"]*)\"$")
	public void accedo_a_la_url(String url) throws Throwable {
	    System.out.println("accedo a la url "+url);
	}

	@Given("^tengo el path de la api \"([^\"]*)\"$")
	public void tengo_el_path_de_la_api(String api) throws Throwable {
		System.out.println("tengo el path de la api "+api);
	}

	@Given("^ingreso los paramatros \"([^\"]*)\"$")
	public void ingreso_los_paramatros(String params) throws Throwable {
		System.out.println("ingreso los paramatros "+params);
	}

	@Given("^indico la cabecera \"([^\"]*)\"$")
	public void indico_la_cabecera(String header) throws Throwable {
		System.out.println("indico la cabecera "+header);
	}

	@Then("^me responde (\\d+) como respuesta$")
	public void me_responde_como_respuesta(int code) throws Throwable {
		System.out.println("me responde "+code+" como respuesta");
	}
	
}
