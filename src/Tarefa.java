import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getTarefa() {
        return descricao;
    }


    public static void main(String[] args) {


        ListaTarefas tarefa01 = new ListaTarefas();

        tarefa01.adicionarTarefa("Arrumar a casa");
        tarefa01.adicionarTarefa("Arrumar a casa");
        tarefa01.adicionarTarefa("Arrumar a casa01");

        tarefa01.removerTarefa("Arrumar a casa01");


        System.out.println(tarefa01.obterNumeroTotalTarefas());





    }
}
