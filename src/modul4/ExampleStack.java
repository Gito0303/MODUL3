package modul4;
import java.util.Stack;

public class ExampleStack {
    public static void main(String[] args) {
        Stack at = new Stack();

        at.push("Aku");
        at.push("Anak");
        at.push("Indonesia");

        System.out.println("Next : " +at.peek());
        at.push("Raya");
        System.out.println(at.pop());
        at.push("!");

        int count = at.search("Aku");
        while (count != -1 && count > 1){
            at.pop();
            count--;
        }
        System.out.println(at.pop());
        System.out.println(at.empty());
    }
}
