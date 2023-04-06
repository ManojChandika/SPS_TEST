import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        int[] numbers= {50,2,1,9,-7};
        List<String> strNum = new ArrayList<>();

        for (int x: numbers) strNum.add(String.valueOf(x));

        // Compare string values using compareTo()method from String class
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        // sort the array
        Collections.sort(strNum,comparator);

        StringBuffer stringBuffer= new StringBuffer();
         for (String x: strNum){
             // append only positives
             if (Integer.valueOf(x)>0){
                 stringBuffer.append(x);
             }
         }

        System.out.println(stringBuffer.toString());

    }
}
