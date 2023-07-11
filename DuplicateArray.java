package workshop;

public class DuplicateArray {
    public static void main(String[] args) {
        int []arr ={1,5,8,3,5,1,3,8,9,7,3};
        System.out.print("duplicate Element of array : ");
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j =i+1;j<arr.length;j++){
                if((arr[i]==arr[j]) && (i != j))
                {
                    System.out.print(" "+arr[j]);
                }
            }
        }

    }

}
