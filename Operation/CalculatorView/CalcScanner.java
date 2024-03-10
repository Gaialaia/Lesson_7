package Lesson_7.Operation.CalculatorView;

import java.util.Scanner;

public class CalcScanner {

    Scanner reader = new Scanner(System.in);

    public char getChoice() {
        System.out.println("Chose operator:");
        System.out.println("\t2. + ");
        System.out.println("\t2. - ");
        System.out.println("\t3. * ");
        System.out.println("\t4. : ");
        return reader.next().charAt(0);

    
}

}

    

