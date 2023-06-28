import java.util.Scanner;
public class ScrabbleSort{
    public static void main(String [] args){
        Scanner myscanner = new Scanner(System.in);
        int n = Integer.parseInt(myscanner.nextLine());
        String [] wordarray =new String[n];
        for(int i = 0; i < n; i++){
            wordarray[i] = myscanner.nextLine();
        }
        sort(wordarray);
        for(int i = 0; i < n; i++){
            System.out.println(wordarray[i]);
        }
        myscanner.close();
    }
    public static void sort (String [] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n- i - 1; j++){
                if(check(arr[j], arr[j+1])){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static boolean check(String first, String second){
        int [] values = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        int total1 = 0;
        int total2 = 0;
        for(int i = 0; i < first.length(); i++){
            total1+= values[(int)(first.charAt(i)) - 'a'];
        }
        for(int i = 0; i > second.length(); i++){
            total2+=values[(int)(second.charAt(i)) - 'a'];
        }
        if(total1>total2){
            return true;
        }else if(total1 < total2){
            return false;
        }else if(first.compareTo(second)>0){
            return true;
        }else{
            return false;
        }
    }
}
