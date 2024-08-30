package org.resolution;

public class PercentualRepresentacao {
    public static void main(String[] args) {
        double totalFaturamento = 67_836.43 + 36_678.66 + 29_229.88 + 27_165.48 + 19_849.53;
        double sp = 67_836.43;
        double rj = 36_678.66;
        double mg = 29_229.88;
        double es = 27_165.48;
        double outros = 19_849.53;

        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: %.2f%%\n", (sp / totalFaturamento) * 100);
        System.out.printf("RJ: %.2f%%\n", (rj / totalFaturamento) * 100);
        System.out.printf("MG: %.2f%%\n", (mg / totalFaturamento) * 100);
        System.out.printf("ES: %.2f%%\n", (es / totalFaturamento) * 100);
        System.out.printf("Outros: %.2f%%\n", (outros / totalFaturamento) * 100);
    }
}
