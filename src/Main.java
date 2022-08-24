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
    int max=arr[0];
    for (int i=0; i< arr.length;i++){
        if (arr[i] > max) {
            max=arr[i];
        }
    }
    System.out.println("Максимальная сумма трат за день составила "+max+"рублей");
            //Задание 2.1
            int min= arr[0]; ;
            for (int i=0; i< arr.length;i++){
                   if (arr[i] < min) {
min = arr[i];
                    }
                }
            System.out.println("Минимальная сумма трат за день составила "+min +"рублей");

    //Задание 3
     int mean = sum/arr.length;
            System.out.println("Средняя сумма трат за месяц составила "+mean+ "рублей");
   //Задание 4
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};


}
}




