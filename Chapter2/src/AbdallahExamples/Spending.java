package AbdallahExamples;
import java.util.Scanner;

public class Spending 
{

	public static void main(String[] args) {
		
int food, clothing, entertainment, rent; 
	double totalExpenditure, foodPercent, clothingPercent, entertainmentPercent, rentPercent;	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the amount spent last month");
	System.out.println("Food: $");
	food = input.nextInt(); // Links Scanner to food variable
	System.out.println("Clothing: $");
	clothing = input.nextInt(); //Links Scanner to Clothing Variable
	System.out.println("Entertainment:   $");
	entertainment = input.nextInt(); // Links Scanner to Entertainment Variable
	System.out.println("Rent:    $");
	rent = input.nextInt(); // Links Scanner to Rent variable
	
	totalExpenditure = (food + clothing + entertainment + rent);
	foodPercent = (food / totalExpenditure * 100); // multiplies by 100 to get a percent
	clothingPercent = (clothing / totalExpenditure * 100);
	entertainmentPercent = (entertainment / totalExpenditure * 100);
	
	NumberFormat nf = NumberFormat.getPercentInstance();
	
	System.out.println("Category \t\t Budget");
	System.out.println(food +"\t\t" + nf.format(foodPercent));
	System.out.println(rent +"\t\t" + nf.format(rentPercent));
	System.out.println(entertainmentPercent +"\t\t" + nf.format(entertainmentPercent));
	System.out.println(clothing +"\t\t" + nf.format(clothingPercent));
	
	}

}





// Make sure all the values have the exact capitlization or spelling as the original intergers so they connect
