class ArrayUtil {

    public static int [] concat(int []a, int []b){
        int [] temp = new int[a.length+b.length];
        int i=0;
        for(int j=0;i<a.length; i++, j++){
            temp[i] = a[j];
        }
        for(int j=0;i<b.length+a.length; i++, j++){
            temp[i] = b[j];
        }

        return temp;
    }

    public static void print(int[] a){
        System.out.print("[ ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("]");
    }
}

public class StaticEx{
    public static void main(String[] args){
        int [] array1 = {1,5,7,9};
        int [] array2 = {3,6,-1,100,77};
        int [] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}
