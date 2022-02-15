package CSC1009.wk04_lab;

public class Bmi {

    final double POUNDSCONVERTION = 0.45359237;
    final double INCHESCONVERTION = 0.0254;

    private double weight;
    private double height;
    
    //Get and Set for weight
    public double getWeight(){
        return weight;

    }

    public void setWeight(double weight){
        this.weight = weight;

    }

    //Get and Set for height
    public double getHeight(){
        return height;

    }

    public void setHeight(double height){
        this.height = height;

    }

    //Conversation for Weight
    public double convertWeight(){
        double convertedWeight = (weight * POUNDSCONVERTION);
        return convertedWeight;
    
    }

    //Conversation for Height
    public double convertHeight(){
        double convertedHeight = (height * INCHESCONVERTION);
        return convertedHeight;

    }

    //Calculate BMI
    public double bmiCalculator(){
        double convertedWeight = convertWeight();
        double convertedHeight = convertHeight();
        double bmiResult = ( convertedWeight / Math.pow(convertedHeight,2) ); 
        return bmiResult;

    }

}
