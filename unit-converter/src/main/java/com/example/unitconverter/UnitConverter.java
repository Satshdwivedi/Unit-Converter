package com.example.unitconverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnitConverter {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    boolean run=true;
while(run){
    System.out.println("=====Unit-Converter======");
    System.out.println("1.Kilometer to Meter");
    System.out.println("2.Meter to Kilometer");
    System.out.println("3.Celsius to Fahrenheit");
    System.out.println("4.Fahrenheit to Celsius");
    System.out.println("5.Kilogram to Pound");
    System.out.println("6.Pound to Kilogram");
    System.out.println("7.Exit");
    
    System.out.print("Enter choice= ");
    try{
    int choice=sc.nextInt();
    sc.nextLine();
switch(choice){
 case 1:
    System.out.println("Kilometer to Meter selected");
    System.out.print("Enter kilometer= ");
    double a=sc.nextDouble();
    sc.nextLine();
    double meter=a*1000;
    System.out.println("Meter= "+meter);
    break;
case 2:
    System.out.println("Meter to Kilometer selected");
    System.out.print("Enter Meter= ");
    double b=sc.nextDouble();
    sc.nextLine();
    double km=b/1000;
    System.out.println("Kilometer= "+km);
    break;  
case 3:
    System.out.println("Celsius to Fahrenheit selected");
    System.out.print("Enter Celsius= ");
    double c=sc.nextDouble();
    sc.nextLine();
    double fah=((9*c)/5)+32;
    System.out.println("Fahrenheit= "+fah);
    break;  
case 4:
    System.out.println("Fahrenheit to Celsius selected");
    System.out.print("Enter Fahrenheit= ");
    double d=sc.nextDouble();
    sc.nextLine();
    double cel=(5*(d-32))/9;
    System.out.println("Celsius= "+cel);
    break;  
case 5:
    System.out.println("Kilogram to Pound selected");
    System.out.print("Enter Kilogram= ");
    double e=sc.nextDouble();
    sc.nextLine();
    double pou=e*2.20462;
    System.out.println("Pound= "+pou);
    break;  
case 6:
    System.out.println("Pound to Kilogram selected");
    System.out.print("Enter Pound= ");
    double f=sc.nextDouble();
    sc.nextLine();
    double kg=f*0.4536;
    System.out.println("Kilogram= "+kg);
    break;  
case 7:
       run=false;
    System.out.println("GoodBye!");
    break; 
default :
    System.out.println("Invalid Choice");        
}
}
catch(InputMismatchException e){
    System.out.println("Invalid choice! Please enter a valid number.");
    sc.nextLine();
}
}
sc.close();
  }
}
