public class ksims {
    public static void main(String[] args) 
    {
        System.out.println("Hello");
        System.out.println("Krex Simsiman");

        int a = 74;
        int b = 36;

        System.out.println(a + b);

        int c = 50;
        int d = 3; 

        System.out.println(c / d);

        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        System.out.println("      J       A     V       V     A");
        System.out.println("      J      A A     V     V     A A");
        System.out.println("J     J     A   A     V   V     A   A ");
        System.out.println("J     J    AAAAAAA     V V     AAAAAAA ");
        System.out.println(" JJJ  J   A       A     V     A       A ");

        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(result);

        double result1 = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result1);

        double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);

        double width = 5.6;
        double height = 8.5;

        double area1 = width * height;
        double perimeter1 = 2 * (width + height);

        System.out.println("Area is " + width + " * " + height + " = " + String.format("%.2f", area1));
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + String.format("%.2f", perimeter1));

        

    }
    
}
