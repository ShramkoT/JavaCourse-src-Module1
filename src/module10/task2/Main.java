package module10.task2;

public class Main {
    public static void main(String[] args) throws MyOwnExeption {
        String s = "hi";

        try {
            MyOwnExeption t = new MyOwnExeption(s.toString());
            t.printString();
        } catch (Throwable a) {
            System.out.println("new exception");
        }
    }
}
