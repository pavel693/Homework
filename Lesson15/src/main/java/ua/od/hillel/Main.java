package ua.od.hillel;

public class Main {
    public static void main(String[] args) {
        CreateProgram java = new JavaProgram();
        CreateProgram c = new CProgram();
        java.startAndGetResult();
        System.out.println();
        c.startAndGetResult();
    }
}
