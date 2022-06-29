package metodoinstancia;

public class MetodoInstancia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Thainara";
        cliente.ultimoNome = "Carvalho";
        cliente.telefone = "630000-0000";
        cliente.email = "thai.cds1@gmail.com";

        System.out.println("Nome: " + cliente.obterNomeCompleto() );
        System.out.println("DDD: " + cliente.obterDDD() );
    }
}
