package dio.collections.map;

public class Evento {
    private String nomeDoEvento;
    private String atracao;

    public Evento(String nomeDoEvento, String atracao) {
        this.nomeDoEvento = nomeDoEvento;
        this.atracao = atracao;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "\n" + "Evento{" +
                "nomeDoEvento='" + nomeDoEvento + '\'' +
                ", atracao='" + atracao + '\'' +
                '}' + "\n";
    }
}
