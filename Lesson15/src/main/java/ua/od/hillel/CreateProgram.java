package ua.od.hillel;

public abstract class CreateProgram {

    abstract void writingProgram();

    void debugging() {
        System.out.println("Debugging finished");
    }

    void compile() {
        System.out.println("Compiling finished");
    }

    void testing() {
        System.out.println("Testing finished");
    }

    void start() {
        System.out.println("Start the program and get result");
    }

    final void startAndGetResult() {
        writingProgram();
        debugging();
        compile();
        testing();
        start();
    }
}
