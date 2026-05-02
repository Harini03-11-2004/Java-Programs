 import java.util.Arrays;
 import java.util.ArrayList;
 class arrlist {
    public static void main(String args[])
    {
        // int arr[]=new int[5];
        // arr[0]=0;
        // arr[1]=1;
        //System.out.println(Arrays.toString(arr));//create a element in array
        ArrayList<Integer> arr = new ArrayList<>();//arrayList
        arr.add(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);//add
        arr.set(2,7);//replace
        System.out.println(arr);
        arr.remove(3);//remove
        System.out.println(arr);

    }
}
