// Program: PaintPricer.java
// Author: M.Tween 
// Date: 5/21/19 
// Prices a paint job based on user input

import java.util.Scanner;

public class PaintPricer
{
    // constants
    final static int SQ_FT_PER_GALLON = 115;
    final static int HOURS_PER_GALLON = 8;
    final static double LABOR_COST_PER_HOUR = 20.0;
        
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
 
        // variables to store square footage and cost per gallon of paint
        int sqFeet = 0;
        double costPerGallon = 0.0;        
        
        // prompt for square footage and read user input
        System.out.print("Please enter the number of square feet to be painted: ");
        sqFeet = input.nextInt();
        
        // prompt for cost per gallon of paint and read user input
        System.out.print("Please enter the paint cost per gallon: ");
        costPerGallon = input.nextDouble();
        
        // calculate and display gallons of paint required and cost of paint
        showPaintGallonsAndCost(sqFeet, costPerGallon);
        
        // calculate and display labor hours required and labor charges
        // 1. call the method to show the labor hours and labor cost
        //    be sure to pass the correct argument (1 required)
        showLaborHoursAndCost(sqFeet);

        
        // calculate and display total cost
        // 2. call the method to calculate the total cost.
        //    be sure to pass the correct arguments (2 required)
        showTotalCost(sqFeet, costPerGallon);

    }

    public static void showPaintGallonsAndCost(int sqFeet, double costPerGallon)
    {
        // local variables for calculation results
        double numGallons = 0.0;
        double paintCost = 0.0;
        
        // calculate: number of gallons is square footage divided by square feet per gallon
        numGallons = (double) sqFeet / SQ_FT_PER_GALLON;
        
        // calculate: paint cost is number of gallons times cost per gallon
        paintCost = numGallons * costPerGallon;
        
        // display results
        System.out.printf("Number of gallons of paint required: %.2f\n", numGallons);
        System.out.printf("Paint cost is $%.2f\n", paintCost);
    }
    
    // calculate and display labor hours required and labor charges
    // 3. declare a method (module) which shows the labor hours and labor cost
    //    be sure to declare the correct parameter (1 required)
    public static void showLaborHoursAndCost(double sqFeet)
    {   
        // local variables for calculation results
        double numGallons = 0.0;
        double numHours = 0.0;
        double laborCost = 0.0;
        
        // calculate: number of hours is number of gallons required times hours per gallon
        numGallons = (double) sqFeet / SQ_FT_PER_GALLON;
        numHours = numGallons * HOURS_PER_GALLON;
        
        // calculate: labor cost is number of hours times labor cost per hour
        laborCost = numHours * LABOR_COST_PER_HOUR;
        
        // display results
        System.out.printf("Labor hours required: %.2f\n", numHours);
        System.out.printf("Labor cost is $%.2f\n", laborCost);
    }
    
    // show the total cost
    // 4. declare a method (module) which shows the total cost
    //    be sure to declare the correct parameters (2 required)

    public static void showTotalCost(double sqFeet, double costPerGallon)
    {
        // local variables for calculation results
        double numGallons = 0.0;
        double paintCost = 0.0;
        double numHours = 0.0;
        double laborCost = 0.0;
        
        // calculate: number of gallons is square footage divided by square feet per gallon
        numGallons = (double) sqFeet / SQ_FT_PER_GALLON;
        
        // calculate: paint cost is number of gallons times cost per gallon
        paintCost = numGallons * costPerGallon;
        
        // calculate: number of hours is number of gallons required times hours per gallon
        numHours = numGallons * HOURS_PER_GALLON;
        
        // calculate: labor cost is number of hours times labor cost per hour
        laborCost = numHours * LABOR_COST_PER_HOUR;
        
        // display results
        System.out.printf("Total cost is $%.2f\n", (paintCost + laborCost));
    }
}