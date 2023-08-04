package candidato;

public class Candidato {
    private String nome;
    private double salarioPretendido;

    public Candidato (String nome, double pretensao)
    {
        this.nome = nome;
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

    public String getSalarioPretendidoString() {
        return String.format("%4.2f", this.getSalarioPretendido());
    }


    public String getNome() {
        return this.nome;
    }
}
