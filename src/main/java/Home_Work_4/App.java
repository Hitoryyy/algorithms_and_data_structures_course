package Home_Work_4;

public class App {
    public static void main(String[] args) {
        DRelatedList<Cat> drl = new DRelatedList<>();
        System.out.println(drl);
        drl.push(new Cat(1, "cat1"));
        drl.push(new Cat(2, "cat2"));
        drl.push(new Cat(3, "cat3"));
        System.out.println(drl);
        drl.pop();
        System.out.println(drl);
        ListIterator<Cat> mi = drl.getIterator();
        System.out.println(mi.getCurrent());
        System.out.println(mi.hasNext());
        mi.deleteCurrent();
        System.out.println(drl);
        drl.push(new Cat(4, "cat4"));
        System.out.println(drl);
        drl.delete(new Cat(4, "cat4"));
        System.out.println(drl);
    }
}
