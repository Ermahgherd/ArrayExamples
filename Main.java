/*
 * Example for Arrays
 */

import java.util.Scanner;

class Main
{
    /*
     * This one will have public static void main
     */
    
    public static void main( String[] args)
    {
     
     
        
        /*
         * SET UP
         * We are going to ask the user to input an integer 
         * and we will call it
                              n
         */
        Scanner s = new Scanner(System.in);
        System.out.print(" Please type in an integer :");
        int n = s.nextInt();
        
        /*
         * Task 1.  Create an array of integers from 0 to n-1
         *          call this array ar1.  Print it out below.
         */
        System.out.println("*** PRINTING ar1 *");
        int[] ar1 = new int[n];
          
        
        for (int i=0; i<n; i++)
            {
            ar1[i]=n-i;
            System.out.println("ar1[" + i + "]"+ar1[i]);
        }
        /*
         * Task 2.  Create a new array called ar2.
         *          Copy the elements of ar1 into ar2.
         */
        
        //Another way to copy is .clone. So here it would be int[] ar2 = ar1.clone();
        System.out.println("** Task 2 **");
        int ar2[] = new int[ar1.length];
        
        for (int i=0; i<ar1.length; i++)
            {
                ar2[i] = ar1[i];
                System.out.println("ar2[" + i + "]"+ar2[i]);
        }
            
        
        /* 
         * Task 3. Add 1 to each element in ar1.  Print it out below
         */
        System.out.println("** Task 3 **");
        for (int i=0; i<n; i++)
        {
            ar1[i] = ar1[i]+1; 
            System.out.println("ar1[" + i + "]"+ar1[i]);
        }

        
        
        /*
         * task 4. Create a new array called ar3.
         *         Copy the elements of ar1 into ar3.  Then do it again
         *         For example
         *         ar1: 1 2 3
         *         ar3: 1 2 3 0 1 2 3
         */
        System.out.println("** Task 4 **");
        int ar3[] = new int[ar1.length*2];
        int looper = 0;
        for (int twotimes = 0; twotimes<2; twotimes++)
        {
            for (int i=0; i<ar1.length; i++)
            {
                ar3[looper] = ar1[i]-1;
                System.out.println("ar3[" + looper + "]"+ar3[looper]);
                looper++;
            }
        }
        
        /*
         * Task 5.  Switch the first and last element of ar1.
         *          print out the new ar1.  Then switch them back
         */
        System.out.println("** Task 5 **");
        int holder = ar1[0];
        ar1[0]=ar1[ar1.length-1];
        ar1[ar1.length-1]=holder;
        for (int i=0; i<ar1.length; i++)
        {
            System.out.println("ar1[" + i + "]" + ar1[i]);
        }
        holder = ar1[0];
        ar1[0]=ar1[ar1.length-1];
        ar1[ar1.length-1]=holder;;
        /*
         * Task 6A. Print the 2nd to (n-1)th elements of ar1
         * Task 6B: Print out just the odd numbers in ar1
         * Task 6C: Print out the elements of ar1 when
         *          the indices are multiples of 3
         *         
         */
        System.out.println("** Task 6A **");
        for (int i = 1; i<n-1;i++)
        {
            System.out.println(ar1[i]);
        }
        System.out.println("** Task 6B **");
        for (int i = 0; i<ar1.length-1; i++)
        {
            if (ar1[i]%2 == 1)
            {
                System.out.println(ar1[i]);
            }
        }
        System.out.println("** Task 6C **");
        for (int i = 0; i<ar1.length-1; i++)
        {
            if (i%3 == 0)
            {
                System.out.println(ar1[i]);
            }
        }
        /*
         * Task 7.  For each element in ar1, 
         *          If the element is even: leave alone
         *          if the element is odd, multiply by 10
         *          print out the new ar1
         *          Example
         *          ar[0]=10
         *          ar[1]=2
         *          ar[2]=30
         *          ar[3]=4
         */
        System.out.println("** Task 7 **");
        for (int i = 0; i<ar1.length-1; i++)
        {
            if (ar1[i]%2==1)
            {
                ar1[i] = ar1[i]*10;
                System.out.println(ar1[i]);
            }
        }
         /*
          * Task 8
          *    Create an array called ar2odds
          *    If the index of ar2 is odd, copy it to ar2odds.
          *    If not, do not
          *    ar2[0]=0
          *    ar2[1]=1  ->  ar2odds[0]=1
          *    ar2[2]=2
          *    ar2[3]=3  ->  ar2odds[1]=3
          */
        System.out.println("** Task 8 **");
        int ar2odds[] = new int[ar2.length];
        int counter = 0;
        for (int i = 0; i<ar2.length; i++)
        {
            if (i%2 == 1)
            {
                ar2odds[counter]= ar2[i];
                System.out.println(ar2odds[counter]);
                counter++;
            }
        }
        /*
         * Task 9. In the array ar2, count how many odd numbers you
         * have.  Then create an ew array called ar4.  Copy just the odd
         * numbers from ar1 into ar4.  Print ar4
         */
        System.out.println("** Task 9 **");
        int ar4[] = new int[(int)ar2.length/2+1];
        int loo = 0;
        for (int i = 0; i<ar2.length; i++)
        {
            if (ar2[i]%2 ==1)
            {
                ar4[loo] = ar2[i];
                loo ++;
            }
        }
        System.out.println("There are " + loo + " odd numbers");
        for (int i = 0; i<ar4.length; i++)
        {
            System.out.println(ar4[i]);
        }
        /*
         * Task 10.  Shift the elements of ar4 right by 1
         * For example
         * old   ar4: 1 3 5 7 9
         * new   ar4  9 1 3 5 7
         */
        System.out.println("** Task 10 **");
        int last = ar4[ar4.length-1];
        for (int i = ar4.length-1; i>0; i--)
        {
            ar4[i] = ar4[i-1];
        }
        ar4[0] = last;
        for (int i = 0; i<ar4.length; i++)
        {
            System.out.println(ar4[i]);
        }
        /*
         * Task 11.  Reverse the order of elements in ar2
         */
        System.out.println("** Task 11 **");
        int ar2len = ar2.length;
        int holder2 = 0;
        for (int i=0 ; i<ar2.length ; i++)
            System.out.println("ar2["+i+"] = "+ar2[i]);
        for (int i = 0; i<ar2.length-1/2; i++)
        {
            holder2 = ar2[i];
            ar2[i] = ar2[ar2len-1-i];
            ar2[ar2len-1-i] = holder2;
        }
        for (int i = 0; i<ar2.length; i++)
        {
            System.out.println(ar2[i]);
        }
        /*
         * Task 12: 
         * Create an array of Strings called ar5.
         * 
         * Each element is a word of the following phrase
         * 
         * 
         * Four score and seven years ago our fathers brought forth on
         * this continent a new nation
         *
         *. ar5[0] = "Four"
         *  ar5[1] = "score"
         *  
         *  Create another array of ints called ar6.  Write a for loop that
         *  will iterate through each element in ar5 and the length of the
         *  word is the element in ar6.
         *  
         *  ar5[0]= "Four"   ar6[0]=4
         *  ar5[1]="score"   ar6[1]=5
         *  ar5[2]="and"     ar6[2]=3
         *  
         *  Count how many words have more than 5 letters.
         */
        System.out.println("** Task 12 **");
        String ar5[] = new String[16];
        ar5[0]="Four";
        ar5[1]="score";
        ar5[2]="and";
        ar5[3]="seven";
        ar5[4]="years";
        ar5[5]="ago";
        ar5[6]="our";
        ar5[7]="fathers";
        ar5[8]="brought";
        ar5[9]="forth";
        ar5[10]="on";
        ar5[11]="this";
        ar5[12]="continent";
        ar5[13]="a";
        ar5[14]="new";
        ar5[15]="nation";
        int looper6 = 0;
        int ar6[] = new int[16];
        for (int i = 0; i<ar5.length; i++)
        {
            ar6[i] = ar5[i].length();
        }
        for (int i = 0; i<ar6.length; i++)
        {
            System.out.println(ar6[i]);
        }
        for (int i = 0; i<ar6.length; i++)
        {
            if (ar6[i] > 5)
            {
                looper6++;
            }
        }
        System.out.println("It Has " +looper6 +" words longer than 5 letters");
        /*
         * Task 13
         * Create an array called monsterArray of 5 Monsters.
         * The name of the monsters are
         * "Cookie"
         * "Grover"
         * "Oscar the Grouch"
         * "Elmo"
         * "Rosita"
         * 
         * Print out their names
         * Use a for loop to print out the names of monster that start with
         * a vowel
         */
        System.out.println("** Task 13 **");
        String monsterArray[] = new String[5];
        monsterArray[0] = "Cookie";
        monsterArray[1] = "Grover";
        monsterArray[2] = "Oscar the Grouch";
        monsterArray[3] = "Elmo";
        monsterArray[4] = "Rosita";
        char c;
        for (int i = 0; i<monsterArray.length; i++)
        {
            c=monsterArray[i].toLowerCase().charAt(0);
            if (c == 'a' || c== 'e' || c== 'i' || c=='o' || c=='u')
            {
                System.out.println(monsterArray[i]);
            }
        }
        
         /*
          * Task 14
          * Create an array of integers from 3 to 94 and call it arx
          * Create an array of the indices of arx when the item is
          * divisible by 3.  Call this arindex
          *      arx[0]=94
          *      arx[1]=95
          *      arx[2]=96 // this is divisible.  Index is 2
          *      arx[3]=97
          *      arx[4]=98
          *      arx[5]=99 // this is divisible  Index is 5
          *      
          *      So arindex[0]=2
          *         arindex[1]=5
          */
        System.out.println("** Task 14 **");
        int arx[] = new int[92];
        int zee = 3;
        int arxindex[] = new int[94];
        int peep = 0;
        for(int i = 0; i<arx.length;i++)
        {
            arx[i] = zee;
            zee++;
        }
        for (int i = 0; i<arx.length; i++)
        {
            if (arx[i] %3 == 0)
            {
                arxindex[peep] = i;
                peep ++;
            }
        }
                
        
    
         /*
          * Create an arrary called "fb" and calculate the
          * first 10 fibonacci sequence.  You start with
          * fb[0]=1
          * fb[1]=1
          * fb[2]=fb[0]+fb[1]
          * fb[3]=fb[1]+fb[2]
          * fb[4]=fb[2]+fb[3]
          */
        
        
        
}
}