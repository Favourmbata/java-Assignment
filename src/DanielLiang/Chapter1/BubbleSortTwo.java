package DanielLiang.Chapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortTwo {
    // Function to implement bubble
    // sort without using loops
   public static ArrayList<Integer> bubble_sort(ArrayList<Integer> ar)
    {

        // Base Case: If array
        // contains a single element
        if (ar.size() <= 1)
            return ar;

        // Base Case: If array
        // contains two elements
        if (ar.size() == 2) {
            if (ar.get(0) < ar.get(1))
                return ar;
            else
                return new ArrayList<Integer>(
                        Arrays.asList(ar.get(1), ar.get(0)));
        }

        // Store the first two elements
        // of the list in variables a and b
        int a = ar.get(0);
        int b = ar.get(1);

        // Store remaining elements
        // in the list bs
        ArrayList<Integer> bs = new ArrayList<>();
        for (int i = 2; i < ar.size(); i++)
            bs.add(ar.get(i));

        // Store the list after
        // each recursive call
        ArrayList<Integer> res = new ArrayList<>();

        // If a < b
        if (a < b) {
            ArrayList<Integer> temp1 = new ArrayList<>();
            temp1.add(b);
            for (int i = 0; i < bs.size(); i++)
                temp1.add(bs.get(i));

            ArrayList<Integer> v = bubble_sort(temp1);
            v.add(0, a);
            res = v;
        }

        // Otherwise, if b >= a
        else {
            ArrayList<Integer> temp1 = new ArrayList<>();
            temp1.add(a);
            for (int i = 0; i < bs.size(); i++)
                temp1.add(bs.get(i));

            ArrayList<Integer> v = bubble_sort(temp1);
            v.add(0, b);
            res = v;
        }

        // Recursively call for the list
        // less than the last element and
        // and return the newly formed list
        ArrayList<Integer> pass = new ArrayList<>();
        for (int i = 0; i < res.size() - 1; i++)
            pass.add(res.get(i));

        ArrayList<Integer> ans = bubble_sort(pass);
        ans.add(res.get(res.size() - 1));
        return ans;
    }

    // Driver Code
    public static void main(String[] args)
    {

        ArrayList<Integer> arr = new ArrayList<Integer>(
                Arrays.asList(1, 3, 4, 5, 6, 2));
        ArrayList<Integer> res = bubble_sort(arr);

        // Print the array
        for (int i = 0; i < res.size(); i++)
            System.out.print(res.get(i) + " ");
    }
}


