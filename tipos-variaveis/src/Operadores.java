public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Flavio" + "Diggelmann";
        System.out.println(nomeCompleto);    

        String concatanacao = "?";

        concatanacao = 1 + 1 + 1 + "1";

        System.out.println(concatanacao);
        concatanacao = 1 + "1" + 1 + 1;
        System.out.println(concatanacao);
        concatanacao = 1 + "1" + 1 + "1";
        System.out.println(concatanacao);
        concatanacao = "1" + 1 + 1 + 1;
        System.out.println(concatanacao);
        concatanacao = "1" + (1 + 1 + 1);
        System.out.println(concatanacao);
        // Operadores Aritmeticos
    }
}
