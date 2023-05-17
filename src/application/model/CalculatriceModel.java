package application.model;

public class CalculatriceModel {
	private double number1;
	private double number2;
	private double result;
	private boolean error;
	private String errorMessage;
	
	
	public void setNumber1(double number1) {
		this.number1=number1;
	}
	
	 public void setNumber2(double number2) {
	        this.number2 = number2;
	    }

	    public double getResult() {
	        return result;
	    }

	    public boolean hasError() {
	        return error;
	    }

	    public String getErrorMessage() {
	        return errorMessage;
	    }

	    public void doAddition() {
	        result = number1 + number2;
	    }

	    public void doSubtraction() {
	        result = number1 - number2;
	    }

	    public void doMultiplication() {
	        result = number1 * number2;
	    }

	    public void doDivision() {
	        if (number2 == 0) {
	            error = true;
	            errorMessage = "Impossible de diviser un nombre par 0";
	            result = 0.0; 
	        } else {
	            double result = number1 / number2;
	            if (Double.isInfinite(result)) {
	                error = true;
	                errorMessage = "Erreur : Résultat de la division indéfini";
	            } else {
	                error = false;
	                this.result = result;
	            }
	        }
	    }
	
	
}
