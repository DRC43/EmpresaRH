public class Desenvolvedor extends Pessoa {
    private double horas;
    private double salario;
    private String cargo = "Desenvolvedor";

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Desenvolvedor() {

    }

    public Desenvolvedor(String nomeEmpregado, String telefone, String data_admissao, double horas, double salario, String cargo) {
        super(nomeEmpregado, telefone, data_admissao);
        this.horas = horas;
        this.salario = salario;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "horas=" + horas +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
