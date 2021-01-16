package com.devlabs.lab4;

//Example 3: nested-if

import java.util.*;
public class NestedIfDemo {

    public static void main(String[] args)
    {
        int marksObt, passMarks=40;
        char grade;
        // int count = 1;
        
        //passMarks = 40;
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks obtained:");
        marksObt = input.nextInt();
        
        input.close();
        //nested if with if-elseif ladder
        // one if is inside another if
        if(marksObt >=passMarks)
        {
            if(marksObt >90){ //as long as there is a single line inside my if or else body
                grade = 'A';}
            else if(marksObt >75){
                grade = 'B';}
            else if (marksObt >60){
                grade = 'C';}
            else{
                grade = 'D';
            }
            System.out.println("Passed");
        }
        
        else
        {
            grade = 'F';
            System.out.println("Try Harder");
        }
        System.out.println("Grade of the child is: " + grade);
    }
}
