public class MeasurableTester
{
   public static void main(String[] args)
   {
      Measurable[] objects = new Measurable[5];

      objects[0] = new Quiz(95);
      objects[1] = new Quiz(80);
      objects[2] = new Quiz(90);
      objects[3] = new Quiz(50);
      objects[4] = new Quiz(75);

      double average = Data.average(objects);
      double max = Data.max(objects);

      System.out.println("Average: " + average);
      System.out.println("Max: " + max);
   }
}
