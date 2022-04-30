public class SwapDemo2 {

    public static void main(String[] args) {

        float first = 36.5f, second = 40.4f;

     System.out.println("--Before swap--");
     System.out.println("First number = " + first);
     System.out.println("Second number = " + second);

      first = first - second;
      second = first + second;
      first = second - first;

     System.out.println("--After swap--");
     System.out.println("First number = " + first);
     System.out.println("Second number = " + second);
    }
}
        
    