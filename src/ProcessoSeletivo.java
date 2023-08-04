import candidato.Candidato;
import candidato.Repositorio;

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

        repositorio.selecionaCandidatos(5);
    }
}
