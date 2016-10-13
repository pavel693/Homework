package ua.od.hillel.stack;

public class StackBracketsMain {

    public static void main(String[] args) {
        String o = "(((((((((((((((((()){{}}}{{)()(){)})";
        StackBrackets stackBrackets = new StackBrackets();
        if (stackBrackets.stackBrackets(o))
            System.out.println("Brackets are balanced");
        else
            System.out.println("Brackets are not balanced");
    }
}