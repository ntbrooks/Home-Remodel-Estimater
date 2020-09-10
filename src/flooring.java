import java.text.DecimalFormat;
import java.util.Scanner;

public class flooring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		//This program will find the total cost of a home flooring remodel based on the data//
		//that the user provides for room dimensions and the cost of flooring//
		
		System.out.println("Please enter all measurements in feet.");
		
		//find room dimensions
		System.out.print("Enter kitchen width:");
		int kitchenW = in.nextInt();
		
		System.out.print("Enter kitchen length:");
		int kitchenL = in.nextInt();
		
		System.out.print("Enter dining room width:");
		int diningW = in.nextInt();
		
		System.out.print("Enter dining room length:");
		int diningL = in.nextInt();
		
		System.out.print("Enter living room width:");
		int livingW = in.nextInt();
		
		System.out.print("Enter living room length:");
		int livingL = in.nextInt();
		
		//cost of flooring
		System.out.print("Enter the cost of hardwood: ");
		double carpetCostPerFoot = in.nextDouble();
		
		System.out.print("Enter the cost of the carpet: ");
		double hardwoodCostPerFoot = in.nextDouble();
		
		//find sq ft of each room
		int kitchenSQFT = kitchenL * kitchenW;
		int diningSQFT = diningL * diningW;
		int livingSQFT = livingL * livingW;
		
		//cost to complete each room
		double kitchenCost = kitchenSQFT * hardwoodCostPerFoot;
		double diningCost = diningSQFT * hardwoodCostPerFoot;
		double livingCost = livingSQFT * carpetCostPerFoot;
		double install = 499.99;
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Cost to complete the kitchen: $" + df.format(kitchenCost));
		System.out.println("Cost to complete the dining room: $" + df.format(diningCost));
		System.out.println("Cost to complete the living room: $" + df.format(livingCost));
		System.out.println("Installation fee: $" + install);
		
		double totalCost = kitchenCost + diningCost + livingCost + install;
		
		System.out.println("The total cost to complete the home remodel is: $" + df.format(totalCost));

		in.close();
		
	}

}
