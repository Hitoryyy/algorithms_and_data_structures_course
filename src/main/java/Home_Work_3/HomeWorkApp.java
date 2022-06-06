package Home_Work_3;

public class HomeWorkApp {

    //Проверка скобок
    private static boolean parenthesisCheck(String expression) {
        int check_bracket = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (check_bracket < 0) {
                return false;
            }

            String one_symbol = expression.substring(i, i + 1);
            if (one_symbol.equals("(") || one_symbol.equals("[")) {
                check_bracket++;
            } else {
                check_bracket--;
            }
        }

        if (check_bracket == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static class Stack {
        private int maxSize; // размер
        private int[] stack; // место хранения
        private int head;  // вершина

        public Stack(int size) {
            this.maxSize = size;
            this.stack = new int[this.maxSize];
            this.head = -1;
        }

        public boolean isEmpty() {
            return this.head == -1;
        }

        public boolean isFull() {
            return this.head == this.maxSize - 1;
        }

        public void push(int i) {
            if (isFull()) {
                this.maxSize *= 2;
                int[] newStack = new int[this.maxSize];
                System.arraycopy(this.stack, 0, newStack, 0, this.stack.length);
                this.stack = newStack;
            }
            this.stack[++this.head] = i;
        }

        public int pop() {
            if (isEmpty()) throw new RuntimeException("Stack is empty"); // ret - 1
            return this.stack[this.head--];
        }

        public int peek() throws ArrayIndexOutOfBoundsException {
            return this.stack[this.head];
        }
    }

    //Проверка скобок 2-й способ
    private static int check(String input) {
        final int TYPES = 3;
        char braces[][] = {{'(', ')'}, {'{', '}'}, {'[', ']'},};
        Stack s = new Stack(10);
        int l = input.length();
        for (int i = 0; i < l; i++) {
            char ch = input.charAt(i);
            for (int j = 0; j < TYPES; ++j) {
                if (ch == braces[j][0])
                    s.push(j);
            }
            for (int j = 0; j < TYPES; ++j) {
                if (ch == braces[j][1]) {
                    if (s.isEmpty())
                        return i;
                    if (j == s.peek())
                        s.pop();
                    else
                        return i;
                }
            }
        }
        if (!s.isEmpty())
            return l;
        return -1;
    }

    public static void main(String[] args) {
        String v = "()()[](";
        System.out.println(parenthesisCheck(v));
    }
}
