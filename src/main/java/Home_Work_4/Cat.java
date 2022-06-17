package Home_Work_4;

import java.util.Objects;

public class Cat {

    public Cat(int i, String cat1) {

    }

    private static class MyCat {
        int age;
        String name;

        public MyCat(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyCat myCat = (MyCat) o;
            return age == myCat.age && name.equals(myCat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }

        @Override
        public String toString() {
            return "MyCat{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
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

}
