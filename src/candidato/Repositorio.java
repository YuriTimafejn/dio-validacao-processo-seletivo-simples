package candidato;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Repositorio {
    private List<Candidato> repositorio;

    public void add(Candidato candidato)
    {
        this.repositorio.add(candidato);
    }

    public List<Candidato> getRepositorio()
    {
        return this.repositorio;
    }

    public void ordenaRepositorioPorPretensao()
    {
        Collections.sort(this.repositorio, Comparator.comparing(Candidato::getSalarioPretendido));
    }

    public void selecionaCandidatos(int quantidadeCandidatos)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Lista_Candidatos.txt"))) {
            int count = 0;
            for (Candidato candidato: this.repositorio)
            {
                if (count > 5)
                {
                    break;
                }

                writer.write("O candidato " + candidato.getNome() + "indicou o valor de R$ " + candidato.getSalarioPretendidoString() + "como remuneração pretendida.\n");
                count++;
            }
        } catch (IOException ioException)
        {
            System.err.println("Error: " + ioException.getMessage());
        }
    }
}
