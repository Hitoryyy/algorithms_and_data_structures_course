package Home_Work_2;

public class HWArray {

    private int[] arr;
    private int capacity;

    public HWArray(int size) {
        this.arr = new int[size];
        this.capacity = 0;
    }

    public HWArray(int[] init) {
        this.capacity = init.length;
        this.arr = init;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int val) {
        arr[index] = val;
    }

    //Вывод масиива на экран
    void outputArray() {
        for (int i = 0; i < this.capacity; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Удаление элемента массива
    boolean deleteValue(int value) {
        for (int i = 0; i < this.capacity; i++) {
            if (this.arr[i] == value) {
                System.arraycopy(this.arr, i + 1, this.arr, i, this.capacity - i - 1);
                return true;
            }
        }
        return false;
    }

    //Удаление всех элементов массива
    boolean deleteAllValue(int value) {
        boolean perfomed = false;
        for (int i = 0; i < capacity; ++i) {
            if (this.arr[i] == value) {
                deleteValue(i--);
                perfomed = true;
            }
        }
        return perfomed;
    }

    void deleteAllValue() {
        capacity = 0;
    }

    //Вставка элемента в массив (в указанный индекс - указанное значение)
    void insertValue(int index, int value) {
        int[] temp = arr;
        if (capacity >= arr.length) {
            arr = new int[capacity * 2];
            System.arraycopy(temp, 0, arr, 0, index);
        }
        System.arraycopy(temp, index, arr, index + 1, capacity - index);
        arr[index] = value;
        capacity++;
    }

    //Нахождение максимального элемента массива
    int getMaxElement() {
        int x = arr[0];
        if (capacity == 0) {
            throw new RuntimeException("Пустой массив");
        }
        if (capacity == 1) {
            return arr[0];
        }
        for (int i = 1; i < capacity; i++) {
            if (x < arr[i])
                x = arr[i];
        }
        return x;
    }

    //Нахождение минимального элемента в массиве
    int getMinElement() {
        if (capacity == 0) throw new RuntimeException("Пустой массив");
        if (capacity == 1) return arr[0];
        int x = arr[0];
        for (int i = 1; i < capacity; i++) {
            if (x > arr[i])
                x = arr[i];
        }
        return x;
    }

    //"Голубиная сортировка"
    int pigeonSort() {
        int y = 0;
        int min = getMinElement();
        int max = getMaxElement();
        int[] ar = new int[max - min + 1];
        for (int i = 0; i < capacity; i++) {
            y++;
            ar[arr[i] - min]++;
        }

        int arrIndex = 0;
        for (int i = 0; i < ar.length; i++)
            for (int elems = ar[i]; elems > 0; elems--) {
                y++;
                arr[arrIndex++] = i + min;
            }
        return y;
    }

    //Шейкерная сортировка
    private void swap(int a, int b) {
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }

    public int sortBubble() {
        int c = 0;
        boolean flag = false;
        for (int i = 0; i < capacity; i++) {
            for (int j = 0; j < capacity - 1 - i; j++) {
                c++;
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                    flag = true;
                }
            }
            if (!flag) break;
        }
        return c;
    }
}
