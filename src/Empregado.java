public class Empregado extends Pessoa {
    private String cargo;
    private double salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empregado() {

    }

    public Empregado(String nomeEmpregado, String telefone, String data_admissao, String cargo, double salario) {
        super(nomeEmpregado, telefone, data_admissao);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
