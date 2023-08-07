import candidato.Candidato;
import candidato.Repositorio;

import java.util.Random;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();

        repositorio.add(new Candidato("João Silveira", 1800));
        repositorio.add(new Candidato("Bernardo Pereira", 2000));
        repositorio.add(new Candidato("Erika Santos", 2100));
        repositorio.add(new Candidato("Joaquim Fernandes", 1999));
        repositorio.add(new Candidato("Ana Clara", 2300));
        repositorio.add(new Candidato("Cristiane Helena", 3000));
        repositorio.add(new Candidato("Loyanne Fernadino", 7000));
        repositorio.add(new Candidato("Adecio Albuquerque", 1850));
        repositorio.add(new Candidato("Benetido Bernardo", 1800));
        repositorio.add(new Candidato("Cezar Cruz", 1700));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos candidatos deseja filtrar?");
        int numeroCandidatos = scanner.nextInt();

        repositorio.selecionaCandidatos(numeroCandidatos);
        tentativaContato(repositorio, numeroCandidatos);
    }

    public static void tentativaContato(Repositorio repositorio, int candidatos)
    {
        for (Candidato candidato :
                repositorio.getRepositorioComQuantidadeCandidatos(candidatos)) {
            int contador = 1;

            while (contador <= 3)
            {
                if (atendeu())
                {
                    System.out.println("O candidato " + candidato.getNome() + " atendeu as ligações na " +contador + "° tentativa e agendou uma entrevista");
                    break;
                }
                contador++;
            }

        }
    }

    private static boolean atendeu() {
        return Random.from(new Random()).nextInt(3) == 1;
    }
}
