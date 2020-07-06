package birthday;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Toy{
   //return the toycost based on toyname
   public static double getToyCost(String toyName) {
       double toyCost = 0;
       if(toyName.equalsIgnoreCase("plushie")){
           toyCost = 25;
       }else if(toyName.equalsIgnoreCase("blocks")){
           toyCost = 20;
       }else if(toyName.equalsIgnoreCase("book")){
           toyCost = 15;
       }
       return toyCost;
   }

   //return order number which is a 5 digit random number
   public static int getOrderNumber() {
       Random r = new Random( System.currentTimeMillis() );
       return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
   }

   //which will display the order details
   public static void displayOrderDetails(String name, String age,
           String toyName, double toyCost) {
       System.out.println("The gift for "+name+" "+age+" years old is "+toyName+" $"+String.format("%.2f",toyCost));
   }
  
}
public class birthday {
   public static void main(String[] args) {
       JFrame f=new JFrame();
       String name,age,toyName,wantCard,wantBalloon,anotherToy;
       double total = 0,toyCost = 0;
       System.out.println("BIRTHDAY GIFTS\n");
       JOptionPane.showMessageDialog(f,"Welcome to the Toy Company \nto choose gifts for young children");
       while(true)
       {
           //taking name
           name=JOptionPane.showInputDialog(f,"Enter the name of the chiLd");
           //taking age
           age=JOptionPane.showInputDialog(f,"How old is the child?");
           //taking toyname
           toyName=JOptionPane.showInputDialog(f,"Choose a toy: a plushie, blocks, or a book");
           //getting toycost
           toyCost = Toy.getToyCost(toyName);
           total += toyCost;
           wantCard=JOptionPane.showInputDialog(f,"Do you want a card with the gift? Yes or No");
           //adding additional 5 rupees if you they want card
           if(wantCard.equalsIgnoreCase("yes")){
               total += 5;
           }
           wantBalloon=JOptionPane.showInputDialog(f,"Do you want a ballon with the gift? Yes or No");
           if(wantBalloon.equalsIgnoreCase("yes")){
               total += 5;
           }
           Toy.displayOrderDetails(name,age,toyName,toyCost);
           anotherToy=JOptionPane.showInputDialog(f,"Do you want another toy? Yes or No");
           if(anotherToy.equalsIgnoreCase("No")){
               break;
           }
       }
       System.out.println("The total cost of your order is $"+String.format("%.2f",total)+" order number is "+Toy.getOrderNumber());
       System.out.println("Programmer :AVENIR TOUWE ");
   }
}