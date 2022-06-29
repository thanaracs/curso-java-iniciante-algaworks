package encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
/*        Cliente cliente = new Cliente();

        cliente.nome = "Thainara";
        cliente.telefone = "6090000-0000";

        System.out.println("Nome cliente: " + cliente.nome);
    }*/
        Cliente cliente = new Cliente();
        cliente.setNome("Thainara Carvalho");
        cliente.setTelefone("6398100-0000");

        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("Ultimo nome: " + cliente.getUltimoNome());

    }
}
