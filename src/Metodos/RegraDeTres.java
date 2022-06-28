package Metodos;

/*
        50 --- 100 %   .   50 * 20 = x * 100
         x --- 20%     .         x = (50*20) / 100

 */
public class RegraDeTres {
    public static void main(String[] args) {
        Double[] premissaInicial = new Double[]{50.0, 100.0};
        Double proporcao = 20.0;
        Double resultadoFinal = regraDeTres(premissaInicial,proporcao);

        System.out.println("Resultado: " + resultadoFinal);
    }

    static Double regraDeTres(Double[] premissa, Double proporcao){
        Double resultado = (premissa[0] * 20)/premissa[1];
        return resultado;
    }
}
