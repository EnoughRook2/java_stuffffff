import java.util.*;
class car{
    private String name;
    private String colour;
    private String breed;
    public car(String name, String colour, String breed){
        this.name= name;
        this.colour= colour;
        this.breed= breed;
    }
    public void Input(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter name of car: ");
        this.name= in.next();
        System.out.println("Enter colour of car:  ");
        this.colour= in.next();
        System.out.println("Enter breed of car: ");
        this.breed= in.next();
    }
    public void Display(){
        System.out.printf("\nName: %s \n",this.name);
        System.out.printf("Colour: %s\n",this.colour);
        System.out.printf("Breed: %s",this.breed);
    }
}
public class cat{
    public static void main(String[] args){
        car c1= new car("dolly","orang","pspsps");
        
        c1.Display();
    }
}