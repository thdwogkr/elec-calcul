public class Refactoring {

    public static void main(String[] args ){

        System.out.println("=======================");
        System.out.println("주택용 전기요금(저압) 계산기");
        System.out.println("=======================");

        double[] a = {99,150,250,301,450,510};
        double result;
        double p100 =  60.7;
        double p200 = 125.9;
        double p300 = 187.9;
        double p400 = 280.6;
        double p500 = 417.7;
        double p501 = 670.6;

        for(double i : a) {
            if (i<=100){
                result = (i * p100);

            } else if (i<=200){
                result =  (100*(p100) + (i-100)*p200);

            } else if (i<=300){
                result =  (100*(p100+p200) + (i-200)*p300);

            } else if (i<=400){
                result =  (100*(p100+p200+p300) + (i-300)*p400);

            } else if (i<=500){
                result =  (100*(p100+p200+p300+p400) +(i-400)*p500);

            } else{
                result =  (100*(p100+p200+p300+p400+p500) + (i-500)*p501);

            }
            System.out.printf("%fkWh의 전기요금은 %f원 입니다.%n",i,result);

        }

    }

}