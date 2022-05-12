public class Main {

    public static void main(String[] args ){

        System.out.println("=======================");
        System.out.println("주택용 전기요금(저압) 계산기");
        System.out.println("=======================");

        float[] a = {99,150,250,301,450,510};
        float result;

        for(float i : a) {
            if (i<=100){
                result = (float) (i * 60.7);
                System.out.printf("%fkWh의 전기요금은 %f원 입니다.%n",i,result);
            } else if (i<=200){
                result = (float) (100*60.7 + (i-100)*125.9);
                System.out.printf("%fkWh의 전기요금은 %f원 입니다.%n",i,result);
            } else if (i<=300){
                result = (float) (100*60.7 + 100*125.9 + (i-200)*187.9);
                System.out.printf("%fkWh의 전기요금은 %f원 입니다.%n",i,result);
            } else if (i<=400){
                result = (float) (100*60.7 + 100*125.9 + 100*187.9 + (i-300)*280.6);
                System.out.printf("%fkWh의 전기요금은 %f원 입니다.%n",i,result);
            } else if (i<=500){
                result = (float) (100*60.7 + 100*125.9 + 100*187.9 + 100*280.6 +(i-400)*417.7);
                System.out.printf("%fkWh의 전기요금은 %f원 입니다.%n",i,result);
            } else{
                result = (float) (100*60.7 + 100*125.9 + 100*187.9 + 100*280.6 + 100*417.7 + (i-500)*670.6);
                System.out.printf("%fkWh의 전기요금은 %f원 입니다.%n",i,result);
            }


        }

    }

}