package CSC1009.wk04_lab;

import CSC1009.wk04_lab.BMI;
import CSC1009.wk04_lab.StackOfIntegers;
import java.util.Scanner;

public class Week04 {
  public void wk04_question1(){
        double weight, height;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        height = input.nextDouble();

        BMI person = new BMI();
        person.setWeight(weight);
        person.setHeight(height);
        double bmiResult = person.bmiCalculator();
        System.out.println("BMI is " + bmiResult);

        if (bmiResult < 18.5){
            System.out.format("Underweight\n");
        }   
        else if ( bmiResult >= 18.5 && bmiResult < 25.0 ){
            System.out.format("Normal\n");
        }   
        else if ( bmiResult >= 25.0 && bmiResult < 30.0 ){
            System.out.format("Overweight\n");
        }   
        else {
            System.out.format("Obese\n");
        }

    }

    public void wk04_question2(){

        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++)
            stack.push(i);
        

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
        

    }
}

