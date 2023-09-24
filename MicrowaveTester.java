public class MicrowaveTester {
	
    public static void main(String[] args) {
        Microwave myMicrowave = new Microwave();

        // Simulate button presses
        myMicrowave.timeButton();
        myMicrowave.timeButton();
        myMicrowave.powerButton();
        myMicrowave.startButton();
        myMicrowave.resetButton();
    }
}
