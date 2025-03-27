public class Main {
    public static void main(String[] args) {
        // byte => 8 bits => -128 to 127
        // short => 16 bits => -32,768 to 32,767
        // int => 32 bits => -2,147,483,648 to 2,147,483,647
        // long => 64 bits => -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float => 32 bits => 1.4e-045 to 3.4e+038
        // double => 64 bits => 4.9e-324 to 1.8e+308
        // char => representar um unico caractere
        // boolean => true or false
        // string => sequencia de caracteres, a diferença pro char é que o char só pode ter um caractere
        byte b = 100;
        short s = 1000;
        int i = 100000;
        long l = 1000000000;
        float f = 1.0f;
        double d = 1.0;
        char c = 'a';
        boolean bool = true;

        String str = "Hello World";

        if (str.isBlank()) {
            System.out.println("verdadeiro");
        } else if (str == "Hello World") {
            System.out.println("eh hello world");
        } else {
            System.out.println("Falso");
        }
    }
}
