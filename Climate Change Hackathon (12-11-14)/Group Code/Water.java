import java.util.*;

public class Water
{
    public static void main(String[] args)
	{
	    water();
	}
	
	public static int water() {
		//variables
		Scanner keyboard = new Scanner(System.in);
		int choice; //default variable used to get user input
		int points = 0; //used to calculate running total of "Greenness" or "green points"
		
		//shower options
		//ask user how long they shower
		System.out.println("How long do you shower? Enter the number corresponding to your choice.");
			//give user a range to choose from
			System.out.println("1. Under 10 minutes");
			System.out.println("2. 10-20 minutes");
			System.out.println("3. 20-30 minutes");
			System.out.println("4. More than 30 minutes");
			//have them input their answer
			choice = keyboard.nextInt();
			//make sure their choice gets them the correct number of points
			if (choice == 1) {
				//showers under 10 minutes are the most preferable for
				//water conservation
				points += 5; 
			} else if (choice == 2) {
				points += 3;
			} else if (choice == 3) {
				points += 2;
			} else {
				//showers more than 30 minutes in length use up a lot of water
				//and so garner the least amount of green points
				points += 1;
			}
			
	
		//leaks and running faucets
		System.out.println("When brushing your teeth, do you leave the faucet running? Enter the number corresponding to your choice.");
			System.out.println("1. Yes");
			System.out.println("2. No");
			choice = keyboard.nextInt();
			//award points based on user input
			if (choice == 1) {
				//having the faucet running uses up a lot more water and 
				//largely increases your water bill
				points += 1;
			} else {
				//turning the faucet off while brushing your teeth, or even
				//washing your hands minimizes the water used and can greatly
				//reduce your water bill
				points += 5;
			}
		
		
		//cleaning, eg. laundry, dishwasher
		//ask user about laundry habits
		System.out.println("How often do you do laundry? Enter the number corresponding to your choice.");
			System.out.println("1. Very often, as soon as I get a few dirty clothes");
			System.out.println("2. Somewhat often, I let the clothes pile up a bit");
			System.out.println("3. Not unless I have to, I'm out of clothes!");
			choice = keyboard.nextInt();
			//award points based on user's choice
			if (choice == 1) {
				//doing laundry often uses up a lot of water, and increases
				//your water bill!
				points += 1;
			} else if (choice == 2) {
				//waiting to do laundry uses less water and can lower your water
				//bill
				points += 3;
			} else {
				//waiting until the washer's full of dirty laundry can save up 
				//to 1,000 gallons of water per month
				points += 5;
			}
		
		//other, eg. tap vs bottle water
		System.out.println("Do you prefer to drink tap or bottled water? Enter the number corresponding to your choice.");
			System.out.println("1. Tap water");
			System.out.println("2. Bottled water");
			choice = keyboard.nextInt();
			//award points based on the user's choice
			if (choice == 1) {
				//drinking tap water is a lot more cost and eco friendly
				points += 5;
			} else {
				//drinking bottled water is a lot less cost and eco friendly
				points += 1;
			}
		
		//return the total number of points earned
		return points;
	}
}