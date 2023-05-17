package application.controller;

import application.model.CalculatriceModel;
import application.vue.CalculatriceVue;

public class CalculatriceController {
	private CalculatriceModel model;
	private CalculatriceVue vue;
	
	public CalculatriceController(CalculatriceModel model,CalculatriceVue vue) {
		this.model=model;
		this.vue=vue;
		this.vue.setController(this);
	}
	
	public void doAddition() {
		double number1=vue.getNumber1();
		double number2=vue.getNumber2();
		model.setNumber1(number1);
		model.setNumber2(number2);
		model.doAddition();
		updateView();
	}
	
	public void doSubtraction() {
        double number1 = vue.getNumber1();
        double number2 = vue.getNumber2();
        model.setNumber1(number1);
        model.setNumber2(number2);
        model.doSubtraction();
        updateView();
    }

    public void doMultiplication() {
        double number1 = vue.getNumber1();
        double number2 = vue.getNumber2();
        model.setNumber1(number1);
        model.setNumber2(number2);
        model.doMultiplication();
        updateView();
        
    }

    public void doDivision() {
        double number1 = vue.getNumber1();
        double number2 = vue.getNumber2();
        model.setNumber1(number1);
        model.setNumber2(number2);
        model.doDivision();
        updateView();
    }
    
    
    private void updateView() {
        if (model.hasError()) {
            vue.setResult(0.0); 
            vue.showError(model.getErrorMessage());
        } else {
            double result = model.getResult();
            if (Double.isNaN(result)) {
                vue.clearResult(); 
            } else {
                vue.setResult(result);
            }
            vue.clearError();
        }
    }

	
	
	
	
	
}

