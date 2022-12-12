import java.util.List;

public class Main {
    public static void main(String[] args) {
        Categoria cate = new Categoria();
        cate.setNome("Refrigerantes");
        Produto refri = new Produto("Fanta", 001, 5.00, 10, "1", 3, cate);
        List<Produto> refrigerantes = List.of(refri);
        System.out.println(cate.getNome() + "\n");
        System.out.println(refri.getNome() + "\n");
        System.out.println(refri.getId() + "\n");
        System.out.println(refri.getPreco() + "\n");
        System.out.println(refri.getQtd() + "\n");
        System.out.println(refri.getTipoUn() + "\n");
    }
}