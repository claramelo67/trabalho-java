import java.util.Scanner;

public class PersonalidadeOculta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aventureiro = 0, zen = 0, curioso = 0;

        System.out.println(" Bem vindo ao Jogo da Personalidade Oculta ");
        System.out.println("Responda com A, B ou C para cada pergunta.\n");

        System.out.println("1. O que você prefere fazer no tempo livre?");
        System.out.println("A) Escalar uma montanha");
        System.out.println("B) Meditar ouvindo música calma");
        System.out.println("C) Ler sobre mistérios do universo");
        String resposta1 = scanner.nextLine().toUpperCase();

        if (resposta1.equals("A")) aventureiro++;
        else if (resposta1.equals("B")) zen++;
        else if (resposta1.equals("C")) curioso++;

        System.out.println("\n2. Qual dessas comidas te atrai mais?");
        System.out.println("A) Comida exótica e apimentada");
        System.out.println("B) Frutas frescas e chá de ervas");
        System.out.println("C) Algo que nunca provou antes");
        String resposta2 = scanner.nextLine().toUpperCase();

        if (resposta2.equals("A")) aventureiro++;
        else if (resposta2.equals("B")) zen++;
        else if (resposta2.equals("C")) curioso++;

        System.out.println("\n3. Se pudesse viajar agora, iria para:");
        System.out.println("A) Uma floresta cheia de trilhas");
        System.out.println("B) Um templo antigo no topo da montanha");
        System.out.println("C) Uma cidade futurista cheia de tecnologia");
        String resposta3 = scanner.nextLine().toUpperCase();

        if (resposta3.equals("A")) aventureiro++;
        else if (resposta3.equals("B")) zen++;
        else if (resposta3.equals("C")) curioso++;

        System.out.println("\n🔮 Calculando sua personalidade oculta...\n");

        if (aventureiro > zen && aventureiro > curioso) {
            System.out.println("🧗 Você é um Espírito Aventureiro!");
            System.out.println("Sempre em busca de emoção, desafios e novas paisagens.");
        } else if (zen > aventureiro && zen > curioso) {
            System.out.println("🧘 Você é uma Alma Zen!");
            System.out.println("Tranquilo, profundo e conectado com o universo.");
        } else if (curioso > aventureiro && curioso > zen) {
            System.out.println("🧠 Você é uma Mente Curiosa!");
            System.out.println("Sempre questionando, explorando e descobrindo o desconhecido.");
        } else {
            System.out.println("🌈 Você é uma mistura única!");
            System.out.println("Multifacetado, imprevisível e cheio de surpresas.");
        }

        scanner.close();
    }
}
