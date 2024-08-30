package org.resolution;

public class Faturamento {
    public static void main(String[] args) {
        double[] faturamentoDiario = {1000.0, 0.0, 1200.0, 500.0, 300.0, 0.0, 0.0, 800.0, 0.0, 600.0,
                0.0, 700.0, 0.0, 1100.0, 0.0, 900.0, 0.0, 1000.0, 0.0, 800.0};
        double totalFaturamento = 0.0;
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        int diasAcimaMedia = 0;
        int diasComFaturamento = 0;

        for (double valor : faturamentoDiario) {
            if (valor > 0) {
                totalFaturamento += valor;
                diasComFaturamento++;
                if (valor < menorFaturamento) menorFaturamento = valor;
                if (valor > maiorFaturamento) maiorFaturamento = valor;
            }
        }

        double mediaMensal = (diasComFaturamento > 0) ? (totalFaturamento / diasComFaturamento) : 0.0;

        for (double valor : faturamentoDiario) {
            if (valor > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Número de dias acima da média: " + diasAcimaMedia);
    }
}
