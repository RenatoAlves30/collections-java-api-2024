package dio.collections.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatosMap = new AgendaContatos();

        agendaContatosMap.adicionarContato("Camila", 123456);
        agendaContatosMap.adicionarContato("Camila", 5645);
        agendaContatosMap.adicionarContato("Camila Cavalcante", 1111111111);
        agendaContatosMap.adicionarContato("Camila DIO", 654987);
        agendaContatosMap.adicionarContato("Maria Silva", 1111111111);
        agendaContatosMap.adicionarContato("Camila", 44444);


        agendaContatosMap.removerContato("Maria Silva");
        agendaContatosMap.exibirContatos();

        System.out.println(agendaContatosMap.pesquisarPorNome("Camila DIO"));

    }
}
