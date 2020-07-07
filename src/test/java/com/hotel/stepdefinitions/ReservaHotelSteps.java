package com.hotel.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.GoTravelsPage;
import tasks.OpenPage;
import tasks.Reservar;
import io.cucumber.datatable.DataTable;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ReservaHotelSteps {
    @Before
    public void initialConfig(){
        setTheStage(new OnlineCast());
        theActorCalled("user");
    }

    @Given("se accede a la pagina para reservar hotel")
    public void seAccedeALaPaginaParaReservarHotel() {
        theActorInTheSpotlight().attemptsTo(OpenPage.travels());
        theActorInTheSpotlight().attemptsTo(GoTravelsPage.phpPage());
    }

    @When("se busca el hotel con la siguiente informacion")
    public void seBuscaElHotelConLaSiguienteInformacion(DataTable table) {
        List<List<String>> hotel = table.asLists(String.class);
        theActorInTheSpotlight().attemptsTo(Reservar.hotel(hotel));
    }

    @When("selecciona el hospedaje con el precio mas bajo")
    public void seleccionaElHospedajeConElPrecioMasBajo() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("se muestra el detalle de la reserva")
    public void seMuestraElDetalleDeLaReserva() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
