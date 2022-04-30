        
public class SwappingDemo {

    public static void main(String[] args) {

        float first = 4.5f, second = 5.9f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        
        float temporary = first;
        first = second;
        second = temporary;
        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}