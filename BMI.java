package CSC1009.wk04_lab;

public class BMI {

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
        double convertedWeight = (weight * 0.45359237);
        return convertedWeight;
    
    }

    //Conversation for Height
    public double convertHeight(){
        double convertedHeight = (height * 0.0254);
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
