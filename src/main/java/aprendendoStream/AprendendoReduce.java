package aprendendoStream;

import java.util.stream.Stream;

public class AprendendoReduce {
    public static void main(String[] args) {
        Double[] notas = {5.5, 5.5, 7.3, 7.2};

        var aprovado_aprovada =
                Stream.of(notas)
                        .reduce((acumulado, nota) -> acumulado + nota)
                        .map(somaDasNotas -> somaDasNotas / 4)
                        .filter(nota -> nota > 5)
                        .isPresent();
        System.out.println("Você foi aprovado: " + (aprovado_aprovada ? "sim" : "não"));
    }
}
