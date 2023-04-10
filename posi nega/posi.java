import java.util.*;

public class posi {
    public static void main(String[] args) {
       System.out.println("Digite quantas vezes o programa irá rodar?");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j;
        double posi = 0;
        double neg = 03;
         for(j=0; j < i; j++){
             System.out.println("Digite um número");
             double num = sc.nextDouble();
             
             if(num < 0){
                 posi = num - (2*num);
                 neg = num;
             } else {
                 posi = num - (2*num);
                 neg = num;
             }
             System.out.println(neg);
             System.out.println(posi);
            }


    }
}