import java.util.ArrayList;
import java.util.List;

public class IndexOfMaxValue {
    public static void main(String[] args) {
        List<Integer> k = new ArrayList();
        k.add(9);
        k.add(4);
        k.add(15);
        k.add(10);

        int ind = findMax(k);
        System.out.println(ind);
    }


    public static int findMax(List<Integer> list) {
        Integer max = null, index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max == null) {
                max = list.get(i);
                index = i;
            } else if (max <= list.get(i)) {
                max = list.get(i);
                index = i;
            }
        }


        return index;

    }
}
