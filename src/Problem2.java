import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        char[] chars = {'a','b','c'};
        int[] list = {2,3,4};
        System.out.println(Arrays.toString(combine(list, chars)));
    }
    static String[] combine(int[] ints, char[] chars){

        int intsLength = ints.length;
        int charsLength = chars.length;
        int i = 0,j=0,k =0;

        String[] list = new String[intsLength+charsLength];

        while (i<intsLength && j< charsLength){
            list[k++]=String.valueOf(chars[j++]);
            list[k++]=String.valueOf(ints[i++]);
        }

        while (i<intsLength){
            list[k++]=String.valueOf(ints[i++]);
        }

        while (j<charsLength){
            list[k++]=String.valueOf(chars[j++]);
        }
        return list;

    }
}
