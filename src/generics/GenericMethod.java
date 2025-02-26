package generics;

public class GenericMethod {

    static <T> void printArray(T[] arr){
        for(T ele: arr){
            System.out.print(ele+" ");

        }
        System.out.println();
    }
    //Generic is not for primitive class
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"Hello","Prisha","is","Hot"};
        printArray(arr1);
        printArray(arr2);

    }
}
