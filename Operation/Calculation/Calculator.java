package Lesson_7.Operation.Calculation;

import java.util.Scanner;

import Lesson_7.Operation.CalculatorView.CalcScanner;
import Lesson_7.Operation.Operation.Addition;
import Lesson_7.Operation.Operation.Division;
import Lesson_7.Operation.Operation.Multiplication;
import Lesson_7.Operation.Operation.Operands;
import Lesson_7.Operation.Operation.Subtraction;


    public class Calculator <T extends Operands>    {
    
        T operand;
        Scanner calScanner = new Scanner(System.in);

        public Calculator(T operand, Scanner calScanner) {
        this.operand = operand;
        this.calScanner = calScanner;
        }
    
    


    public void calculate ()  {

        System.out.print("Enter first number: ");

        int num1 = calScanner.nextInt();

        System.out.print("Enter second number: ");

        int num2 = calScanner.nextInt();

        char choice = CalcScanner.getChoice();

        switch (choice) {

            case 1: {
            Addition operator = new Addition();
            operator.getNum1(num1);
            operator.getNum2(num2);
            int result = operator.result();
            System.out.println(result);
            break;
            }


            case 2: {
                Division operator = new Division();
                operator.getNum1(num1);
                operator.getNum2(num2);
                int result = operator.result();
                System.out.println(result);
                break;

            }

            case 3: {
                Multiplication operator = new Multiplication();
                operator.getNum1(num1);
                operator.getNum2(num2);
                int result = operator.result();
                System.out.println(result);
                break;
            }

            case 4: {
                Subtraction operator = new Subtraction();
                operator.getNum1(num1);
                operator.getNum2(num2);
                int result = operator.result();
                System.out.println(result);
                break;
            }

        }

    }

}
    



    





        







    

