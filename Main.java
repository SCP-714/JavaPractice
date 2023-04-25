public class Main {
    public static void main(String[] args){
        //Java helloWorld
       String x = "Water";
       String y = "Kool-aid";
       String temp;

       temp = x;
       x=y;
       y=temp;

        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}
