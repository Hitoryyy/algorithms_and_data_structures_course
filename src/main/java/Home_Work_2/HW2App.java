package Home_Work_2;

import Lesson_2.MyArray;

public class HW2App {

    public static void main(String[] args) {

        HWArray array = new HWArray(new int[] {1,5,6,7,2,7,2,87,3,4});
        array.outputArray();
        array.deleteAllValue();
        array.outputArray();

        HWArray array1 = new HWArray(new int[]{1, 2, 3, 6, 7, 3, 4, 9, 1});
        array1.outputArray();
        array1.insertValue(4, 3);
        array1.outputArray();

        HWArray array2 = new HWArray(new int[]{23,24,5,34,6,3,3});
        array2.sortBubble();
        array2.outputArray();

        HWArray array3 = new HWArray(new int[]{6,4,2,87,44,2,4,6,7});
        array3.pigeonSort();
        array3.outputArray();
    }
}
