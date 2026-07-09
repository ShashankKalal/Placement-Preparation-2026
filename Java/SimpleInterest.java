public class SimpleInterest {
    public static void main(String[] args) {
        int p, r, t, s;
        p = 1000; // Principal amount
        r = 5;    // Rate of interest           
        t = 2;    // Time in years
        s = (p * r * t) / 100; // Simple Interest formula   

        System.out.println("The simple interest is: " + s); 
    }
}
