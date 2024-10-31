import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Startup {
    public static void main(String[] args) {
        List<String> estudantes = Arrays.asList("Gustavo", "Luciano", "Ana Luiza", "Izabella");

        System.out.println("****** Utilizando oforeach ******");

        for (String nome: estudantes){
            System.out.println("Estudante: " + nome);
        }

        System.out.println("****** Utilizando iterator ******");

        Iterator<String> interator = estudantes.iterator();

        while (interator.hasNext()){
            System.out.println("Estudade: " + interator.next());
        }

        System.out.println("****** Utilizando a Stream ******");

        Stream<String> stream = estudantes.stream();
        stream.forEach(System.out::println);

    }
}
