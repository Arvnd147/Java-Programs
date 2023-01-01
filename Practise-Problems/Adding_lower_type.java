public class Adding_lower_type {
    public static void main(String[] args) {
        byte a=20;
        byte b=10;
        //byte c=a+b//compile time error bcoz a+b=30 will be int
        byte c=(byte)(a+b);
        System.out.println(c);
    }
}
