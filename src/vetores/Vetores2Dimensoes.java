package vetores;

public class Vetores2Dimensoes {
    public static void main(String[] args) {
        Double faturamentoDia = 1000.0;

        Double[] faturamentoJaneiro = new Double[]{1500.0, 2.000, 1700.0};
        Double[] faturamentoFevereiro = new Double[]{1580.0, 4.000, 1800.0};

        Double[][] faturamentoAnual = new Double[][]{faturamentoJaneiro, faturamentoFevereiro};

        //acessando faturamento anual na posicao 0 - janeiro, na posicao 0 - valor dia 1
        System.out.println("Faturamento do dia 1 de janeiro: " + faturamentoAnual[0][0]);
        System.out.println("Faturamento do dia 3 de fevereiro: " + faturamentoAnual[1][2]);

        for (int i = 0; i < faturamentoAnual.length; i++){
            System.out.println("Mes: " + (i + 1));
            Double[] mes = faturamentoAnual[i];

            for (int y = 0; y < mes.length; y++){
                Double dia = mes[y];
                System.out.println("Dia " + y + ": " + dia);

            }
        }
    }
}
