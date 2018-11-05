public class recursionDriver
{
 
 public static int elephant(int n)
 {
     if (n<1)
     {
         return 0;
     }
     return 10+elephant(n-1);
 }
 
 public static int student(int n)
 {
     if (n<1)
     {
         return 0;
     }
     return 20+student(n-1);
 }
 
 public static int fingers(int n)
 {
     if (n<1)
     {
         return 0;
     }
     return 10+fingers(n-1);
 }
 
 public static int oddnums(int n)
 {
     if (n==1)
     {
         return 0;
     }
     return 1+oddnums(n-2);
 }
 
 public static void main(String[] args)
 {
     /*
     * Count 
     * 1. Number of legs 10 elephant have
     * 2. Number of students in a school if each
     * class has 20 students and there are 12 rooms
     * 3. Number of fingers if there are 8 people
     * 4. Find the sum of odd numbers from 0 to N
     * 5. Find the sum of even numbers from 0 to N
    */ 
     int counted=0;
     System.out.println("*** Task 1 ***");
     counted = elephant(10);
     System.out.println(counted);
     
     System.out.println("*** Task 2 ***");
     System.out.println(student(12));
     
     System.out.println("*** Task 3 ***");
     System.out.println(fingers(8));
     
     System.out.println("*** Task 4 ***");
     System.out.println(oddnums(41));
 }
}