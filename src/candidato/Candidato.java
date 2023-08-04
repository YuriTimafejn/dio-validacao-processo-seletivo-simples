package candidato;

public class Candidato {
    private double salarioPretendido;

    public Candidato (double pretensao)
    {
        this.salarioPretendido = pretensao;
    }

    public void analisaCandidato()
    {
        if(Salario.BASE > getSalarioPretendido()) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (Salario.BASE == getSalarioPretendido()) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    public double getSalarioPretendido() {
        return salarioPretendido;
    }
}
