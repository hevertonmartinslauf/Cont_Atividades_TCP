
public class Atividade {
    private String cliente;
    private int numero;
    private String descricao;
    private String resposta;
    private int atendente;
    private int fechada;//0=nao - 1=sim

    public Atividade(String cliente, int numero, String descricao) {
        this.cliente = cliente;
        this.numero = numero;
        this.descricao = descricao;
        this.fechada = 0;
        this.atendente = -1;
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public int getAtendente() {
        return atendente;
    }

    public void setAtendente(int atendente) {
        this.atendente = atendente;
    }

    public int getFechada() {
        return fechada;
    }

    public void setFechada(int fechada) {
        this.fechada = fechada;
    }
    
    
}
