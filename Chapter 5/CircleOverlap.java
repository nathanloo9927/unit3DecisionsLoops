import java.util.Scanner;

public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      System.out.print("Input the x coordinate of the first circle: ");
      double xcenter1 = in.nextDouble();
      System.out.print("Input the y coordinate of the first circle: ");
      double ycenter1 = in.nextDouble();
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble();
      System.out.print("Input the x coordinate of the second circle: ");
      double xcenter2 = in.nextDouble();
      System.out.print("Input the y coordinate of the second circle: ");
      double ycenter2 = in.nextDouble();
      // Your work goes here
      if ((radius1 < 0) || (radius2 < 0)){
          System.out.println("Don't be stupid. Put in a positive value for the radius");
      } else if ((Math.sqrt(Math.pow(xcenter1 - xcenter2, 2) + Math.pow(ycenter1 - ycenter2, 2)) > radius1 + radius2)) {
          System.out.println("They are disjoint");
      } else if ((Math.sqrt(Math.pow(xcenter1 - xcenter2, 2) + Math.pow(ycenter1 - ycenter2, 2)) <= (radius2)) || (Math.sqrt(Math.pow(xcenter1 - xcenter2, 2) + Math.pow(ycenter1 - ycenter2, 2)) <= radius1)) {
          System.out.println("They are overlapping");
      } else if (Math.sqrt(Math.pow(xcenter1 - xcenter2, 2) + Math.pow(ycenter1 - ycenter2, 2)) == radius1 + radius2) {
          System.out.println("They are tangent");
      } else {
          System.out.println("They are mutually contained");
      }
   }
}