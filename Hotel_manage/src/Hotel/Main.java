package Hotel ;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args){

        try
        {
            //System.out.println("here1");

            File f = new File("data");
            if(f.exists())
            {
                FileInputStream fin=new FileInputStream(f);
                ObjectInputStream ois=new ObjectInputStream(fin);
                hotel.hotel_ob=(holder)ois.readObject();
            }
            Scanner sc = new Scanner(System.in);
            int ch,ch2;
            char wish;

            //System.out.println("here2");
            x:
            do{  //System.out.println("here3");

                System.out.println("\nEnter your choice :\n1.Display room details\n2.Display room availability \n3.Book\n4.Order food\n5.Checkout\n6.Exit\n");
                ch = sc.nextInt();

                switch(ch){
                    case 1: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n4.Deluxe Single Room\n");
                        ch2 = sc.nextInt();
                        hotel.features(ch2);
                        break;
                    case 2:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                        ch2 = sc.nextInt();
                        hotel.availability(ch2);
                        break;
                    case 3:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                        ch2 = sc.nextInt();
                        hotel.bookroom(ch2);
                        break;
                    case 4:
                        System.out.print("Room Number -");
                        ch2 = sc.nextInt();
                        if(ch2>60)
                            System.out.println("Room doesn't exist");
                        else if(ch2>40)
                            hotel.order(ch2-41,4);
                        else if(ch2>30)
                            hotel.order(ch2-31,3);
                        else if(ch2>10)
                            hotel.order(ch2-11,2);
                        else if(ch2>0)
                            hotel.order(ch2-1,1);
                        else
                            System.out.println("Room doesn't exist");
                        break;
                    case 5:
                        System.out.print("Room Number -");
                        ch2 = sc.nextInt();
                        if(ch2>60)
                            System.out.println("Room doesn't exist");
                        else if(ch2>40)
                            hotel.deallocate(ch2-41,4);
                        else if(ch2>30)
                            hotel.deallocate(ch2-31,3);
                        else if(ch2>10)
                            hotel.deallocate(ch2-11,2);
                        else if(ch2>0)
                            hotel.deallocate(ch2-1,1);
                        else
                            System.out.println("Room doesn't exist");
                        break;
                    case 6:break x;

                }
                //System.out.println("here4");

                System.out.println("\nContinue : (y/n)");
                wish=sc.next().charAt(0);
                if(!(wish=='y'||wish=='Y'||wish=='n'||wish=='N'))
                {
                    System.out.println("Invalid Option");
                    System.out.println("\nContinue : (y/n)");
                    wish=sc.next().charAt(0);
                }

            }while(wish=='y'||wish=='Y');

            //System.out.println("here5");

            Thread t=new Thread(new write(hotel.hotel_ob));
            t.start();
        }

        catch(Exception e)
        {
            System.out.println("Not a valid input");
        }
        //System.out.println("here6");
    }


}


