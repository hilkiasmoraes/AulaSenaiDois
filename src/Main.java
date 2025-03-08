public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        System.out.println(empresa.nomeEmpresa);
        System.out.println(empresa.CnpjEmpresa);
        System.out.println(empresa.TipoEmpresa);

        System.out.println("O nome do funcionário é " + empresa.nomeFuncionario);
        System.out.println("O salário do funcionário é " + empresa.valorSalarioFuncionario);
        System.out.println("O cargo do funcionário é de " + empresa.cargoFuncionario);

        // Testando a nova Branch
        Empresa empresa = new Empresa();
        System.out.println(empresaSetor.nomeSetorJuridico);
        System.out.println(empresaSetor.nomeSetorRH);

        Funcionario funcionario = new Funcionario();
        System.out.println("O nome do funcionário é " + funcionario.nomeFuncionario);
        System.out.println("O salário do funcionário é " + funcionario.valorSalarioFuncionario);
        System.out.println("O cargo do funcionário é de " + funcionario.cargoFuncionario);

        int aumento = 120;
        int salarioFuncionario = 1512;

        System.out.println(aumento + salarioFuncionario);

        System.out.println(aumento - salarioFuncionario);

        System.out.println(aumento * salarioFuncionario); // Não acontece no mundo real

        System.out.println(aumento / salarioFuncionario);

        System.out.println(salarioFuncionario / aumento);

    }
}