
import java.net.InetAddress;

public class Usuario implements Comparable<Usuario> {
    
    private int id;
    private String nome;
    private InetAddress ip;
    private int porta;
    private int ativo = 0;//0 inativo e 1 ativo
    private int tipo = -1;//0 atendente e 1 gerente
    private int qtAtivPend;
    
    public Usuario(String nome, InetAddress ip, int porta, int id, int tipo) {
        this.nome = nome;
        this.ip = ip;
        this.porta = porta;
        this.ativo = 1;
        this.id = id;
        this.tipo = tipo;
        this.qtAtivPend = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public InetAddress getIp() {
        return ip;
    }

    public void setIp(InetAddress ip) {
        this.ip = ip;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    @Override
    public String toString() {
        return nome;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getQtAtivPend() {
        return qtAtivPend;
    }

    public void setQtAtivPend(int qtAtivPend) {
        this.qtAtivPend = qtAtivPend;
    }

    public int compareTo(Usuario u) {
        if(this.qtAtivPend > u.getQtAtivPend()){
            return -1;
        }
        
        if(this.qtAtivPend < u.getQtAtivPend()){
            return 1;
        }
        
        return 0;
    }
}
