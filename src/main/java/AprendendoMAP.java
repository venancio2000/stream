import java.util.stream.Stream;

public class AprendendoMAP {
    public static void main(String[] args) {
        Double[] notas = {5.5, 5.5, 7.3, 7.2};
        Stream.of(notas)
                .map(nota -> nota + 2)
                .map(nota -> nota -1)
                .forEach(System.out::println);
    }
}
