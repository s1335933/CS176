import java.util.ArrayList;

public class Medals {
    public static void main(String[] args) {
        // Define the medal data for each country using ArrayList
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Canada");
        countries.add("Italy");
        countries.add("Germany");
        countries.add("Japan");
        countries.add("Kazakhstan");
        countries.add("Russia");
        countries.add("South Korea");
        countries.add("United States");

        ArrayList<Integer> goldMedals = new ArrayList<>();
        goldMedals.add(0);
        goldMedals.add(0);
        goldMedals.add(0);
        goldMedals.add(1);
        goldMedals.add(0);
        goldMedals.add(3);
        goldMedals.add(0);
        goldMedals.add(1);

        ArrayList<Integer> silverMedals = new ArrayList<>();
        silverMedals.add(3);
        silverMedals.add(0);
        silverMedals.add(0);
        silverMedals.add(0);
        silverMedals.add(0);
        silverMedals.add(1);
        silverMedals.add(1);
        silverMedals.add(0);

        ArrayList<Integer> bronzeMedals = new ArrayList<>();
        bronzeMedals.add(0);
        bronzeMedals.add(1);
        bronzeMedals.add(1);
        bronzeMedals.add(0);
        bronzeMedals.add(1);
        bronzeMedals.add(1);
        bronzeMedals.add(0);
        bronzeMedals.add(1);

        // Initialize total medal counts
        int totalGold = 0;
        int totalSilver = 0;
        int totalBronze = 0;

        // Print the table header
        System.out.printf("%-16s%-7s%-8s%-8s%-10s\n", "Country", "Gold", "Silver", "Bronze", "Total");

        // Iterate through each country
        for (int i = 0; i < countries.size(); i++) {
            String country = countries.get(i);
            int gold = goldMedals.get(i);
            int silver = silverMedals.get(i);
            int bronze = bronzeMedals.get(i);
            int total = gold + silver + bronze;

            // Print country medal counts
            System.out.printf("%-18s%-7d%-7d%-7d%-7d\n", country, gold, silver, bronze, total);

            // Update total medal counts
            totalGold += gold;
            totalSilver += silver;
            totalBronze += bronze;
        }

        // Print the totals row
        System.out.printf("%-18s%-7d%-7d%-7d%-7d\n", "Totals", totalGold, totalSilver, totalBronze, (totalGold + totalSilver + totalBronze));
    }
}
