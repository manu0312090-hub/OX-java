// exercicio 6

public class OX {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, digite um número inteiro após o nome do programa.");
            System.exit(0);
        }

        try {
            int numero = Integer.parseInt(args[0]);
            String tipo;
            char letra;

            if (numero % 2 == 0) {
                tipo = "par";
                letra = 'O';
            } else {
                tipo = "ímpar";
                letra = 'X';
            }

            System.out.println("Você digitou " + numero + ", que é " + tipo + ", então a letra é " + letra);

        } catch (NumberFormatException e) {
            System.out.println("Erro: O argumento digitado deve ser um número inteiro.");

                        System.out.println("Emanuelle Donato");

        }
    }
}