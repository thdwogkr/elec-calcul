import java.util.Scanner;

public class Mine {


    public static void main(String[] args){
        System.out.println("=".repeat(25));
        System.out.println("직구 계산기_미국_의류");
        System.out.println("=".repeat(25));

        double usd2won = 1290.50d;

        Scanner scan = new Scanner(System.in);


            System.out.println("물건의 금액을 입력 해 주세요_USD");
            double price_usd = scan.nextDouble();
            String madebyusd="";

        for(int i = 0; i==0;) {
            madebyusd = scan.nextLine();
            System.out.println("물건의 생산지가 미국입니까? y/n");


            if(madebyusd.compareTo("y")==0||madebyusd.compareTo("n")==0) {
                break;

            } else {
                System.out.println("뭥미");
            }

        }
        double result = usd2won * price_usd;

        if(price_usd<=200) {

        } else if (madebyusd.compareTo("y")==0) {
            result = result * 1.1;

        } else {
            result = result * 1.13 * 1.1;
        }

        System.out.printf("총 금액은 %f원 입니다.",result);














    }




}
