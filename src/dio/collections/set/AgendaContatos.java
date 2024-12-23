package dio.collections.set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatoPorNome.add(contato);
                break;
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoParaAtualizar = null;
        for(Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
               contato.setNumeroDeTelefone(novoNumero);
                contatoParaAtualizar = contato;
                break;
            }
        }
        return contatoParaAtualizar;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5645);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));


        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Camila", 5555555));
        agendaContatos.exibirContatos();



    }
}
