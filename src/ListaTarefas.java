import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public List<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao) {
        List<String> removedorDeTarefas = new ArrayList<>();
        for (Tarefa tarefa: listaTarefas) {
            if (tarefa.getTarefa().equals(descricao)) {
                removedorDeTarefas.addAll(removedorDeTarefas);
            }
        }
    }

    public int obterNumeroTotalTarefas() {
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(getListaTarefas());
    }

    @Override
    public String toString() {
        return "ListaTarefas{" +
                "listaTarefas=" + listaTarefas +
                '}';
    }
}