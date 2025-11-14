import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
        System.out.println(Arrays.toString(items));
        System.out.println("items:" + items.length);

    }

    public void insert(int item) {
        // if the array is full , resize it
        if (count == items.length) {
            // create the new array ( size + 1)
            int[] newItems = new int[count + 1];
            // copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            // set "items" to this new array
            items = newItems;

        }
        // add new item at the end
        items[count++] = item;
    }

}
