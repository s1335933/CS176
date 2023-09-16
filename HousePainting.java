import java.util.Scanner;

public class HousePainting {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input variables
        System.out.print("Please enter the cost per square foot: ");
        double costPerSquareFoot = scanner.nextDouble();

        System.out.print("Please enter the length of the house: ");
        double length = scanner.nextDouble();

        System.out.print("Please enter the width of the house: ");
        double width = scanner.nextDouble();

        System.out.print("Please enter the height of the house: ");
        double height = scanner.nextDouble();

        System.out.print("Please enter the number of windows: ");
        int numOfWindows = scanner.nextInt();

        System.out.print("Please enter the length of a window: ");
        double windowLength = scanner.nextDouble();

        System.out.print("Please enter the width of a window: ");
        double windowWidth = scanner.nextDouble();

        System.out.print("Please enter the number of doors: ");
        int numOfDoors = scanner.nextInt();

        System.out.print("Please enter the length of a door: ");
        double doorLength = scanner.nextDouble();

        System.out.print("Please enter the width of a door: ");
        double doorWidth = scanner.nextDouble();

        // Calculate the square footage of each side of the house
        double normalSideSquareFootage = length * width;
        double peakSideSquareFootage = length * width + 0.5 * (length * (height - width));

        // Calculate the total square footage of the house
        double totalSquareFootage = 2 * normalSideSquareFootage + 2 * peakSideSquareFootage;

        // Calculate the square footage taken up by windows and doors
        double windowSquareFootage = numOfWindows * (windowLength * windowWidth);
        double doorSquareFootage = numOfDoors * (doorLength * doorWidth);

        // Subtract the square footage of windows and doors from the total square footage
        double totalPaintableSquareFootage = totalSquareFootage - (windowSquareFootage + doorSquareFootage);

        // Calculate the estimated cost of painting
        double estimatedCost = totalPaintableSquareFootage * costPerSquareFoot;

        // Output the results
        System.out.println("Your total paintable surface area is " + totalPaintableSquareFootage + " square feet.");
        System.out.println("Your estimate is " + estimatedCost + " dollars.");

        // Close the scanner
        scanner.close();
    }
}
