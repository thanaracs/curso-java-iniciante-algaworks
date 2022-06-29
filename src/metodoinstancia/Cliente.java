package metodoinstancia;

public class Cliente {
    //Metodo de instancia
    String primeiroNome, ultimoNome, telefone, email;


    String obterNomeCompleto(){
        String nomeCompleto = primeiroNome + " " + ultimoNome;
        return nomeCompleto;
    }

    String obterDDD(){
        String ddd = telefone.substring(0,2);
        return ddd;
    }
}
