import java.util.*;
public class HotelBookingSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Hotel hotel=new Hotel();
        hotel.addR(101,"Single Bed");
        hotel.addR(102,"Double Bed");
        hotel.addR(103,"Villa");
        hotel.addR(201,"Single Bed");
        hotel.addR(202,"Double Bed");
        hotel.addR(203,"Villa");
        while(true){
            System.out.println("\n1.Check Availability \n2.Book Rooms \n3.Vacate \n4.Exit \n");
            int n=sc.nextInt();
            switch(n){
                case 1:
                    hotel.checkAvail();
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    String name=sc.next();
                    System.out.print("Enter Phone Number: ");
                    String phn=sc.next();
                    sc.nextLine();
                    System.out.print("Enter Room No:");
                    int rno=sc.nextInt();
                    sc.nextLine();
                    hotel.Book(rno,name,phn);
                    break;
                case 3:
                    System.out.print("Enter Room Number: ");
                    int Rno=sc.nextInt();
                    sc.nextLine();
                    hotel.Vacate(Rno);
                    break;
                case 4:
                    return;
            }
        }
    }
}
