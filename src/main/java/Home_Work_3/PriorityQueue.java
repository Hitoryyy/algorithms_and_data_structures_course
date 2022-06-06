package Home_Work_3;

public class PriorityQueue extends Queue {

    public PriorityQueue(int size) {
        super(size);
    }

    @Override
    public void insert(int Val) {
        if (isFull())
            throw new RuntimeException("Queue is full");
        int i;
        for (i = 0; i < getMaxSize(); i++){
            if (getQueue()[i] < Val) {
                break;
            }
        }

        System.arraycopy(getQueue(), i, getQueue(), i + 1, getMaxSize() - i - 1);
        getQueue()[i] = Val;
        setCapacity(getCapacity() + i);
    }

    @Override
    public int remove() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");

        int temp = getQueue()[0];
        System.arraycopy(getQueue(), 1, getQueue(), 0, getMaxSize() - 1);
        setCapacity(getCapacity() - 1);
        return temp;
    }
}
