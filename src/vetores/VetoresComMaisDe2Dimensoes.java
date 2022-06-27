package vetores;

public class VetoresComMaisDe2Dimensoes {
    public static void main(String[] args) {
        Double[] faturamentoJaneiro = new Double[]{1500.0, 2.000, 1700.0};
        Double[] faturamentoFevereiro = new Double[]{1580.0, 4.000, 1800.0};
        Double[][] faturamentoAnual = new Double[][]{faturamentoJaneiro, faturamentoFevereiro};
        Double[][][] faturamentoQuinquenal = new Double[][][]{faturamentoAnual};


        for (int i = 0; i < faturamentoQuinquenal.length; i++){
            System.out.println("Ano: " + (i + 1));
            Double[][] ano = faturamentoQuinquenal[i];
            for (int y = 0; y < ano.length; y++){
            System.out.println("\nMes " + (y+ 1));
                Double[] mes= ano[y];
                    for (int z = 0; z < mes.length; z++){
                    Double dia = mes[z];
                    System.out.println("Dia " + z + ": " + dia);


                }
            }
        }

    }
}
