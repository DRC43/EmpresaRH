public class Principal {
    public static void main(String[] args) {

        // aqui eu estou instaciando um objeto da classe GERENTE
        Gerente gerente01 = new Gerente();

        // aqui esta se inserindo os dados atraves do set
        gerente01.setSalarioBase(500);
        gerente01.setHoras(9);
        gerente01.setDias(20);
        gerente01.setEmpregado("Dener Corrêa");
        gerente01.setTelefone("47 996598078");
        gerente01.setData_admissao("01/01/2022");

        // toString retorna conjunto de dados
        System.out.println(gerente01.toString());

        // funçao retorna a função double
        System.out.println(gerente01.calcularSalario());

        //função retorna a função void = (nada)
        gerente01.calcularSalariovoid();

        //------------------------------------------------------

        // aqui esta instanciando o objeto com o constructor cheio
        Gerente gerente02 = new Gerente("Dener",
                "47 996598078", "01/12/2013", 450, 7, 15);

        // funçao retorna a função double
        System.out.println(gerente02.calcularSalario());

        //função retorna a função void =  (nada)
        gerente02.calcularSalariovoid();

        // toString retorna conjunto de dados
        System.out.println(gerente02.toString());

    }
}