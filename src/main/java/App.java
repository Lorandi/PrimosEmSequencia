import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Integer valorFinal = 10;
        Integer valorInicial= 1;
        Integer before = valorInicial;
        List<Integer> primos = new ArrayList<>();

        for (int i = valorInicial; i < valorFinal; i++) {
            Integer verificador = 0;
            for (Integer primo : primos) {
                if (primo > 1 && i % primo == 0) {
                    break;
                }
                verificador++;
            }
            if (verificador == primos.size()) {
                primos.add(i);
            }
        }

        Integer contatdorDuplas = 0;

        for(Integer primo : primos){
            if(before == (primo - 2)){
                System.out.println(before + " " + primo);
                contatdorDuplas++;
            }
            before = primo;
        }

        System.out.println("Há " + contatdorDuplas + " duplas no intervalo");
        System.out.println(primos);


    }
}
