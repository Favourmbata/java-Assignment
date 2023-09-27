package arrayPackage;

public class ElementContained {
    public static boolean contains(int [] number,int item){
        for (int arr :number){
         if (item == arr){
             return true;
         }
        }
    return false;

    }

    public static void main(String[] args) {
        int []myArr = {800,67,90,66,4588,500,4000};
        System.out.println(contains(myArr,8000));
        System.out.println(contains(myArr,4000));
    }
}
