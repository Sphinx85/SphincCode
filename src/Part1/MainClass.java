package Part1;

public class MainClass {

    public static void main(String[] args) {

        byte b = 53;
        short s = 4156;
        int i = 441365;
        long l = 415641L;

        double d = 3.14;
        float f = 456.4561F;

        char c = 'A';
        boolean bool = true;

        System.out.println(b + " " + s + " " + i + " " + l + " " + d + " " + f + " " + c + " " + bool);

        int x = 15616;
        int y = 1456;
        int z = 5;
        int a = 776;

        formula(x,y,z,a);
    }

    private static void formula(int x, int y, int z, int a) {
        int result;
        result = x * (y + (z / a));
        System.out.println(result);
    }
}
