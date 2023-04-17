
import java.util.ArrayList;
import java.util.Arrays;

public class problema5 {
    public static void main(String[] args) {
        String[] strArr1 = {"apple", "banana", "orange", "kiwi", "grape"};
        String[] strArr2 = {"orange", "grape", "pear", "melon", "kiwi"};

        Integer[] intArr1 = {1, 3, 5, 7, 9};
        Integer[] intArr2 = {2, 4, 6, 8, 1};

        ArrayList<String> strCommon = new ArrayList<String>();
        ArrayList<Integer> intCommon = new ArrayList<Integer>();

        for (String str : strArr1) {
            if (Arrays.asList(strArr2).contains(str)) {
                strCommon.add(str);
            }
        }

        for (Integer num : intArr1) {
            if (Arrays.asList(intArr2).contains(num)) {
                intCommon.add(num);
            }
        }

        System.out.println("Common string elements: " + strCommon);
        System.out.println("Common integer elements: " + intCommon);
    }
}




