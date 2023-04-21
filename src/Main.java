public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 12, 8, 10, 19, 15, 21, 10, 20, 15};

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }


    }
}