package exemplolista;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {

    public static void main(String[] args) {
    
        List<String> nomes = new ArrayList<String>();
        
        nomes.add("Douglas");
        nomes.add("Matheus 1");
        nomes.add("Isabela");
        nomes.add("Murilo");
        nomes.add("Murilo 3");
        nomes.add("Murilo 5");
        nomes.add("Murilo 7");
        nomes.remove(0);
        /*
        System.out.println(nomes.get(2));
        nomes.remove("Isabela");
        System.out.println(nomes.get(2));*/
        
        //System.out.println(nomes);
        
        /*System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));
        System.out.println(nomes.get(2));
        System.out.println(nomes.get(3)); */
        //for tab tab
        /*for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }*/
        //fore tab tab
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
    
}
