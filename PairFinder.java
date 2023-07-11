package workshop;

public class PairFinder {
    public void findPairFinder(int[]numbers){
        for(int i =0;i<numbers.length;i++){

            for(int j=i+1;j<numbers.length;j++){

                if(numbers[i]+numbers[j]==0){

                    System.out.println(numbers[i]+","+numbers[j]);
                }
            }
        }
    }
}
