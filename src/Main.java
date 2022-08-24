public class  Main {

     public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;
     }
     //Задание 1
        public static void main (String[] args) {


            int[] arr = generateRandomArray();
            int sum = 0;
            for (int i = 0; i < arr.length; i++){
                sum+= arr[i];
         }

                System.out.println("Сумма трат за месяц составила "+ sum + " рублей");

    //Задание 2
    int max=1;
    for (int i=0; i< arr.length;i++){
        if (arr[i] > max) {
            max=arr[i];
        }
    }
    System.out.println("Максимальная сумма трат за день составила "+max+"рублей");
        }
}


