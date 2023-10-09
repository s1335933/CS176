public class Donations {
    private int numIndividual = 0;
    private double amtIndividual = 0.0;
    private int numBusiness = 0;
    private double amtBusiness = 0.0;
    private int numOther = 0;
    private double amtOther = 0.0;

    public void processDonation(String cat, double donation) {
        if (donation >= 0) {
            if (cat.equals("individual")) {
                numIndividual++;
                amtIndividual += donation;
            } else if (cat.equals("business")) {
                numBusiness++;
                amtBusiness += donation;
            } else if (cat.equals("other")) {
                numOther++;
                amtOther += donation;
            }
            System.out.println(cat + " donation amount: " + donation);
        } else {
            if (cat.equals("individual")) {
                numIndividual--;
                amtIndividual -= Math.abs(donation);
            } else if (cat.equals("business")) {
                numBusiness--;
                amtBusiness -= Math.abs(donation);
            } else if (cat.equals("other")) {
                numOther--;
                amtOther -= Math.abs(donation);
            }
            System.out.println(cat + " donation amount: " + donation);
        }
    }

    public void getStatistics() {
        System.out.println("Individual: #:" + numIndividual + " $" + amtIndividual);
        System.out.println("Business: #:" + numBusiness + " $" + amtBusiness);
        System.out.println("Other: #:" + numOther + " $" + amtOther);
    }
}
