import java.util.stream.Stream;

public class AprendedendoMatch {
    public static void main(String[] args) {
        Double[] notas = {5.5, 5.5, 7.3, 7.2};

        //var aprovado_aprovada = Stream.of(notas).noneMatch(nota -> nota >= 7);
        //var aprovado_aprovada = Stream.of(notas).allMatch(nota -> nota >= 7);
        var aprovado_aprovada = Stream.of(notas).anyMatch(nota -> nota >= 7);
        System.out.println("Teve apovação: " + (aprovado_aprovada ? "sim" : "não"));
    }
}
