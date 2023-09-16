package Chapter4B;

public class TabularOutPut {
    public static void main(String[] args) {

            System.out.println("N\tN2\tN3\tN4");
        for (int N = 1;  N< 6 ; N++) {
            System.out.println(N   + "    "  +     N * N+     "   "  +  N *N*N  + "   " + N*N*N*N   +  " ");
        }

    }
}