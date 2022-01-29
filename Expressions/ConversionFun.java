public class ConversionFun {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radiusCubed = 1.0;
        double volume1 = 4 / 3 * PI * radiusCubed;
        double volume2 = PI * radiusCubed * 4 / 3;
        double volume3 = PI * radiusCubed * (4 / 3);  
        double volume4 = 4 / (3 * PI) * radiusCubed;  


        System.out.println("Volume 1: " + volume1);
        System.out.println("Volume 2: " + volume2);
        System.out.println("Volume 3: " + volume3);
        System.out.println("Volume 4: " + volume4);
    }
}
