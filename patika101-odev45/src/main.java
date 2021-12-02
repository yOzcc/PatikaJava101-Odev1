public class main {

    static boolean isFind(int[] arr, int value){
        for (int i: arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {


        int[] list = {1,2,3,3,4,4,5,6,7,8,9,10,10,15,15,22,22,46,47,68,68,70};
        int[] duplicate = new int[list.length];
        int first = 0;

        for (int i = 0 ; i < list.length ; i++){
            for (int j = 0 ; j < list.length ; j++){
                if ((i!=j) && list[i] == list[j] && list[i]%2 == 0){
                    if (!isFind(duplicate,list[i])){
                        duplicate[first++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : duplicate){
            if (value !=0){
                System.out.println(value);
            }
        }

    }
}
