package me.j220919.print;

public class practice2 {
    public static void main(String[] args) {
        int i = 10;
        float f = 12.34f;
        double d = 56.78;
        char c = 'a';
        String s = "Hello World";
        boolean b = true;

        //int
        System.out.printf("%d\n", i);
        System.out.printf("%10d\n", i);
        System.out.printf("%-10d\n", i);
        System.out.printf("%010d\n", i);
        System.out.printf("%o\n", i);
        System.out.printf("%x\n", i);
        System.out.printf("%X\n", i);
        System.out.printf("%n");
        System.out.println();

        //float
        System.out.printf("%f\n", f);
        System.out.printf("%.2f\n", f);
        System.out.printf("%.8f\n", f);
        System.out.printf("%5.2f\n", f);
        System.out.printf("%-5.2f\n", f);
        System.out.printf("%e\n", f);
        System.out.printf("%E\n", f);
        System.out.printf("%30.3e\n", f);
        System.out.printf("%30.3E\n", f);
        System.out.println();

        //double
        System.out.printf("%f\n", d);
        System.out.printf("%.2f\n", d);
        System.out.printf("%.8f\n", d);
        System.out.printf("%5.2f\n", d);
        System.out.printf("%-5.2f\n", d);
        System.out.printf("%e\n", d);
        System.out.printf("%E\n", d);
        System.out.printf("%30.3e\n", d);
        System.out.printf("%30.3E\n", d);
        System.out.println();

        //char
        System.out.printf("%c\n", c);
        System.out.printf("%C\n", c);
        System.out.printf("%30c\n", c);
        System.out.printf("%30C\n", c);
        System.out.println();

        //String
        System.out.printf("%s\n", s);
        System.out.printf("%S\n", s);
        System.out.printf("%30s\n", s);
        System.out.printf("%30S\n", s);
        System.out.println();

        //boolean
        System.out.printf("%b\n", b);
        System.out.printf("%B\n", b);
        System.out.printf("%30b\n", b);
        System.out.printf("%30B\n", b);
        System.out.println();

        //변수에 저장하지 않은 리터럴도 가능
        System.out.printf("%d\n", 12345);
        System.out.printf("%f\n", 12.34);
        System.out.printf("%c\n", 'a');
        System.out.printf("%s\n", "a");
        System.out.printf("%b\n", true);
        System.out.println();
    }
}
