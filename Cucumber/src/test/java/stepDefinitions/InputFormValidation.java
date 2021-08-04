package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageActions.InputFormActions;

public class InputFormValidation {
	
	@And("^Enter the ([^\"]*) details in ([^\"]*)$")
	public void enter_the_field_details_in_value(DataTable table) {
		List<Map<String,String>> data = table.asMaps(String.class, String.class);
		InputFormActions InputFormActions = new InputFormActions();
		InputFormActions.inputFormFirstName(data.get(0).get("Value"));
		InputFormActions.inputFormLastName(data.get(1).get("Value"));
		InputFormActions.inputFormEmail(data.get(2).get("Value"));
		InputFormActions.inputFormPhone(data.get(3).get("Value"));
		InputFormActions.inputFormAddress(data.get(4).get("Value"));
		InputFormActions.inputFormCity(data.get(5).get("Value"));
		InputFormActions.inputFormZip(data.get(6).get("Value"));
		InputFormActions.inputFormDescription(data.get(7).get("Value"));
	}
	@Then("^Click on ([^\"]*) button$")
	public void click_on_send_button(String sendButton) {
		InputFormActions InputFormActions = new InputFormActions();
		InputFormActions.inputFormSubmitButton();
	}
}
