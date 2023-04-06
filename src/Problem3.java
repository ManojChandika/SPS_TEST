public class Problem3 {
    public static void main(String[] args) {
        long x=0;
        long y=1;
        long z=0;
        int cnt=2;
        System.out.print(x+" "+ y+" ");
        while (cnt<100){
            z= x+y;
            System.out.print(z +" ");
            x=y;
            y=z;
            cnt++;
        }
    }
}
