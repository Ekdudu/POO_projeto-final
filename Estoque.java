public class Estoque {
    private double refri;
    private double carnes;
    private double industr;
    private double frios;
    private double variados;
    private Data validade;

    public Estoque(double refri, double carnes, double indust, double frios, double variados, int validadeD,
            int validadeM, int validadeA) {
        this.refri = refri;
        this.carnes = carnes;
        this.industr = indust;
        this.frios = frios;
        this.variados = variados;
        this.validade = new Data(validadeD, validadeM, validadeA);
    }

    public void mostra() {
        System.out.println("");
        System.out.println("Quantidade de Refrigerantes e Validade: " + refri + validade);
        System.out.println("Quantidade de carnes e Validade: " + carnes + validade);
        System.out.println("Quantidade de Insdustrializados e Validade: " + industr + validade);
        System.out.println("Quantidade de Variados e Validade: " + variados + validade);
    }
}