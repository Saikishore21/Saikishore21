import java.util.*;
public class Students
{
 private int roll_no;
 String name;
 int[] marks = new int[5];
 float percentagef;
 public void readmarks() 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Roll_no");
      this.roll_no = sc.nextInt();
      System.out.println("Enter your Name");
      this.name = sc.next();

      for(int i=0;i<5;i++) 
       {
          System.out.println("Enter the" + (i + 1) + "subject marks ");
         marks[i] = sc.nextInt();
        }
      sc.close();
    }
    private float calculate_percentage()
    {
      int result = 0;
      for(int element : marks) 
        {
          result += element;
        }

       return(float) result / marks.length;

    }
    public void displaymarks() 
    {
        System.out.println("Your roll_No = " + roll_no);
        System.out.println("Your name = " + name);
        for(int i=0; i<marks.length; i++) 
        {
          System.out.println((i + 1) + " subject marks = " + marks[i]);
        }

        System.out.println("The percentage is = " + calculate_percentage());

    }
     public static void main(String[] args)
    {
       Students s = new Students();
       s.readmarks();
       s.displaymarks();
    }
}
