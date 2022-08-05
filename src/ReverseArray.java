import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Integer checkAndGet(List<Integer> arraylist, int position) {
        return (arraylist.size() > position) ? arraylist.get(position) : 0;
    }

    public ArrayList<Integer> reversedArray(ArrayList<Integer> array) {
        Integer index = array.size() - 1;
        int temp;
        int halfSize = array.size() / 2;
        if (array.isEmpty())
            System.out.println("array is empty");
        else {
            for (Integer i = 0; i < halfSize; i++) {
                temp = array.get(i);
                array.set(i, array.get(index - i));
                array.set(index - i, temp);
            }
        }
        return array;
    }
}

