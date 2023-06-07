import java.util.Scanner;

public class Main {
    public static boolean CheckSNT(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
//        loop
//        Vong lap for ... i
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        int[] arr = {1, 2, 3, 4, 5};
//        Array (mang) : thuoc collection
//        for (int number : arr) {
//            System.out.println(number);
//        }

//        Vong lap while
//        boolean check = true;
//        int so = 0;
//        while (check) {
//            System.out.println("Vong lap van hoat dong");
//            if (so == 10) {
//                check = false;
//
//            }
//            so++;
//        }

//        Scanner sc = new Scanner(System.in);
//        do...while
//        int number = 0;
//        do{
//            System.out.println("Nhap 1 stn");
//            number = Integer.parseInt(sc.nextLine());
//            System.out.println(number);
//            if(number >5){
//                continue;
//                System.out.println("ádasd");
//            }
//            System.out.println("ádasdas");
//        }while(number !=10);

//        Cac menh de Break/Continue



//        BT

//BT1
//        int a = 6,b = 3;
//        for(int i = 0 ; i < b ; i ++){
//            System.out.println("");
//            for(int j = 0 ; j < a ; j ++){
//                System.out.print("* ");
//            }
//        }

//        int a = 5;
//        for(int i = 1 ; i <= a; i ++){
//            System.out.println("");
//            for(int j = 0 ; j <i; j ++){
//                System.out.print("* ");
//            }
//        }

//        int a = 5;
//        for(int i = 1 ; i <= a; i ++){
//            System.out.println("");
//            for(int j = a ; j >=i; j --){
//                System.out.print("* ");
//            }
//        }





//        BT2
//        Hien thi 20SNT dau tien
//       int count = 0 ;
//       int i =2 ;
//       while(count < 20){
//           if(CheckSNT(i)){
//               System.out.printf("%d ",i);
//               count ++;
//           }
//           i++;
//       }

    }
}
