import java.util.Arrays;

public class IntArray {
    private int[] data;
    private int size;

    public IntArray(int capacity) {
        data = new int[capacity];
        size = capacity;
    }

    public int size() {
        return size;
    }

    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(6) + 1;
        }
    }

    public void set(int index, int value) {
        if (index >= 0 && index < size) {
            data[index] = value;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        } else {
            System.out.println("Index out of bounds");
            return -1;
        }
    }

    public void clear() {
        data = new int[0];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void sort() {
        Arrays.sort(data);
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        String result = "[";
        for (int i = 0; i < size; i++) {
            result += data[i];
            if (i < size - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}