import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//checking git working or not
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter marks of subject 1");
        int m1= sc.nextInt();

        System.out.println("Enter marks of subject 2");
        int m2= sc.nextInt();

        System.out.println("Enter marks of subject 3");
        int m3= sc.nextInt();

        System.out.println("Enter marks of subject 4");
        int m4= sc.nextInt();

        System.out.println("Enter marks of subject 5");
        int m5= sc.nextInt();

        int sum = m1+m2+m3+m4+m5;
        int avg= sum/5;

        System.out.print("sum of marks are: ");
        System.out.println(sum);
        System.out.print("average of marks are: ");
        System.out.println(avg);



    }
}