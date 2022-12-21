public class Gerente extends Pessoa {
   private double salarioBase;
   private String cargo = "gerente";
   private double horas;
   private int dias;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Gerente() {

    }

    public Gerente(String nomeEmpregado, String telefone, String data_admissao, double salarioBase, double horas, int dias) {
        super(nomeEmpregado, telefone, data_admissao);
        this.salarioBase = salarioBase;
        this.horas = horas;
        this.dias = dias;
    }



    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salarioBase +
                "nome=" + getEmpregado() +
                "telefone=" + getTelefone() +
                "data de admissao=" + getData_admissao() +
                ", cargo='" + cargo + '\'' +
                ", horas=" + horas +
                ", dias=" + dias +
                '}';
    }

    // so vai calcular e retorna o valor do salario
    public double calcularSalario(){
        double salario = salarioBase * horas * dias;
        return salario;
    }

    // vai calcular tambem mas nao retorna nada, por isso deve se usa no sout
    public void calcularSalariovoid (){
        double salario = salarioBase * horas * dias;
        System.out.println(" o salario do gerente é" + salario);
    }






}
