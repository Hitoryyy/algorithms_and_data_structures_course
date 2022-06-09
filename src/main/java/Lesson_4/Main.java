package Lesson_4;

import java.util.LinkedList;
import java.util.Objects;

public class Main {

    private static class Cat {
        int age;
        String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return age == cat.age && name.equals(cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }

        @Override
        public String toString() {
            return String.format("C(%s, %d)", name, age);
        }

        public Cat(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private static class LinkedList {
        private class Node {
            Cat c;
            Node next;

            public Node(Cat c) {
                this.c = c;
            }

            @Override
            public String toString() {
                return String.format("N(%s)", c);
            }
        }

        private Node head;

        public LinkedList() {
            this.head = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void push(Cat c) {
            Node newNode = new Node(c);
            newNode.next = head;
            head = newNode;
        }

        public Cat pop() {
            if (isEmpty()) return null;
            Cat c = head.c;
            head = head.next;
            return c;
        }

        public Cat peek() {
            if (isEmpty()) return null;
            return head.c;
        }

        public String toString() {
            Node current = head;
            StringBuilder sb = new StringBuilder("[");
            while (current != null) {
                sb.append(current.toString());
                current = current.next;
                sb.append((current == null) ? " ]" : ", ");
            }
            return sb.toString();
        }

        public Cat find(Cat c) {
            Node current = head;
            while (!current.c.equals(c)) {
                if (current == null)
                    return null;
                else
                    current = current.next;
            }
            return current.c;
        }

        public Cat delete(Cat c) {
            Node curr = head;
            Node prev = head;
            while (!curr.c.equals(c)) {
                if (curr.next == null) {
                    return null;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            if (curr == head) {
                head = head.next;
            } else {
                prev.next = curr.next;
            }
            return curr.c;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(new Cat(1, "Barsik"));
        list.push(new Cat(2, "Murzik"));
        list.push(new Cat(3, "Kissik"));
        list.push(new Cat(4, "Vassik"));
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list);
    }
}

/*
    reset() - перемещение в начало списка;
    next() - перемещение итератора к следуюшему элементу;
    getCurrent() - получение элемента, на который указывает итератор;
    atEnd() - возвращает true, если итератор находится в конце списка;
    insertAfter() - вставка элемента после итератора;
    insertBefore() - вставка элемента до итератора;
    deleteCurrent() - удаление элемента в текущей позиции итератора.
*/
