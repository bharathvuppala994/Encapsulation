
public class Test
{    
    public static void main (String[] args) 
    {
        Encaapsulation obj = new Encaapsulation();
         
        // setting values of the variables 
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);
         
        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());
         
        // Direct access of geekRoll is not possible
        // due to encapsulation
     //   System.out.println("Geek's roll: " + obj.geekName);        
    }
}