public class Main {
    public static void main(String[] args) {
        Associado associado = new Associado(1, "João", "Rua X", "111", "111-11", "Bairro X", "Bauru", "SP",
                "14-1111-1111", "111.111.111-11", "Ativo", 1);
        Colaborador colaborador = new Colaborador(2, "Maria", "Rua Y", "222", "222-22", "Bairro Y", "Bauru", "SP",
                "14-2222-2222", "222.222.222-22", "Programadora");
        Fornecedor fornecedor = new Fornecedor(3, "Coders", "Rua Z", "333", "333-33", "Bairro Z", "São Paulo", "SP",
                "11-3333-3333", "33.333.333/0001-1", "Energy Coders", "www.energycoders.com");

        System.out.println("Associado: " + associado.getNome() + ", ID: " + associado.getId() + ".");
        System.out.println("Colaborador: " + colaborador.getNome() + ", ID: " + colaborador.getId() + ".");
        System.out.println("Fornecedor: " + fornecedor.getNome() + ", ID: " + fornecedor.getId() + ".");
    }
}
