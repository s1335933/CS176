import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {
    public static void main(String[] args) {
        Donations giveToMe = new Donations();
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Would you like to process donations now? (enter 'Yes' to continue): ");
        String userInput = inputScanner.nextLine();

        if (userInput.equalsIgnoreCase("Yes")) {
            try {
                File file = new File("Donations.txt");
                Scanner fileScanner = new Scanner(file);

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.equals("<EOF>")) {
                        break; // Exit the loop when <EOF> is encountered
                    }

                    // Extract category and donation amount from the line
                    String[] parts = line.split(">");
                    if (parts.length == 2) {
                        String category = parts[0].substring(1); // Remove '<'
                        double donation = Double.parseDouble(parts[1]);
                        giveToMe.processDonation(category, donation);
                    }
                }

                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found: Donations.txt");
            }
        } else {
            System.out.println("Ending now without processing donations.");
        }

        giveToMe.getStatistics();
        inputScanner.close();
    }
}
