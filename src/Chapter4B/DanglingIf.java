package Chapter4B;

public class DanglingIf {
    public static void main(String[] args) {
        int x = 8;
        int y = 5;
        if (x == 8) {
            if (y == 5) {
                System.out.println("@@@@@@");
            } else {
                System.out.println("#####");
            }
        }
        System.out.println("SSSSS");
        System.out.println("&&&&&");
    }
}
