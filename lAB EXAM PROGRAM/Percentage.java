import java.util.Scanner;
class Student{
    Scanner sc = new Scanner(System.in);
    String name;
    String USN;
    String college_name;
    int age;
    void studDetails(){

        System.out.println("Enter the Student name:");
        String name= sc.nextLine();
        System.out.println("Enter the usn:");
        String usn = sc.nextLine();
        System.out.println("Enter the name of college:");
        String college=sc.nextLine();
        System.out.println("Enter the age:");
        int age = sc.nextInt();

        this.name=name;
        this.USN=usn;
        this.college_name=college;
        this.age=age;
        
    }
    void studDetails(int rank){
        System.out.println("The rank of the student is :"+rank);
    }
    void studDetails( int rank, String remarks){
        System.out.println("The rank of the student is :" +rank);
        System.out.println("The remarks for the student is:"+remarks);
    }
    double calcPercentage(){
        double totalgained_marks=0;
        double full_marks=0;
        return  (totalgained_marks/full_marks)*100;
    }
}
class secondyear extends Student{
    double gained_marks=0;
    double calcPercentage(){
        for (int i=0; i<6; i++){
            double marks=sc.nextDouble();
            gained_marks+=marks;
        }
        return (gained_marks/(6*50))*100;
    }
}
class thirdyear extends Student{
    double gained_marks=0;
    double calcPercentage(){
        for (int i=0; i<8; i++){
            double marks=sc.nextDouble();
            gained_marks+=marks;
        }
        return (gained_marks/(8*50))*100;
    }
}
class fourthyear extends Student{
    double gained_marks=0;
    double calcPercentage(){
        for (int i=0; i<8; i++){
            double marks=sc.nextDouble();
            gained_marks+=marks;
        }
        return (gained_marks/(4*50))*100;
    }
}
public class Percentage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year of the Student:");
        int year=sc.nextInt();
        if(year==2){
            System.out.println("Enter the details for the student:");
            secondyear sec=new secondyear();
            sec.studDetails();
            System.out.println("Enter the marks to calculate the percentage:");
            System.out.println("Percentage is:"+sec.calcPercentage());
            sec.studDetails(5);
            String a = "verygood";
            sec.studDetails(5, a);
        }
        else if(year==3){
            System.out.println("Enter the detail student:");
            thirdyear third = new thirdyear();
            third.studDetails();
            System.out.println("Enter the marks to calculate the percentage:");
            System.out.println("Percentage is:" +third.calcPercentage());
        }
         else if(year==4){
            System.out.println("Enter the detail student:");
            thirdyear fourth = new thirdyear();
            fourth.studDetails();
            System.out.println("Enter the marks to calculate the percentage:");
            System.out.println("Percentage is:" +fourth.calcPercentage());
        }
        sc.close();
    }
}