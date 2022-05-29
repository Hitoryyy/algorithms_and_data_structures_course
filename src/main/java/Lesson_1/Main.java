package Lesson_1;

import java.util.LinkedList;
import java.util.List;

public class Main {
    private static class  Cat {
        int age;
        void voice() {
            System.out.println(age);
        }
    }
    public static void main(String[] args) {
        Cat c = new Cat();
        c.voice();
        List<String> l0 = new LinkedList<>();
    }
}
