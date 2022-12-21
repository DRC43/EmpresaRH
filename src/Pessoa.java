public class Pessoa {
    private String nomeEmpregado;
    private String telefone;
    private String data_admissao;

    public Pessoa (){
    }

    public Pessoa(String nomeEmpregado, String telefone, String data_admissao) {
        this.nomeEmpregado = nomeEmpregado;
        this.telefone = telefone;
        this.data_admissao = data_admissao;
    }
    public String getEmpregado() {
        return nomeEmpregado;
    }
    public void setEmpregado(String nomeEmpregado) {
        this.nomeEmpregado = nomeEmpregado;
    }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getData_admissao() {
        return data_admissao;
    }
    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomeEmpregado='" + nomeEmpregado + '\'' +
                ", telefone='" + telefone + '\'' +
                ", data_admissao='" + data_admissao + '\'' +
                '}';
    }
}
