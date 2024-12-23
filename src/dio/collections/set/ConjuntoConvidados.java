package dio.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int condigoConvite) {
        convidadoSet.add(new Convidado(nome, condigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for(Convidado convidado : convidadoSet) {
            if (convidado.getCodigoDoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");


        conjuntoConvidados.adicionarConvidados("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidados("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidados("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidados("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1235);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();
    }
}

