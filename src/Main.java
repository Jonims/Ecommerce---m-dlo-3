import payments.EnumPagamentos;
import products.Informatica;
import products.Livro;
import products.Mercado;
import users.Admin;
import users.ClientePF;
import users.ClientePJ;

public class Main {

    public static void main(String[] args) {

        Admin a1 = new Admin("JoniAdmin");
        ClientePF pf = new ClientePF("Joni", "Silva", "xxx.xxx.xxx-xx");
        ClientePJ pj = new ClientePJ("Empresa Joni", "XXXX-XXXX-XXXX");
        ClientePJ pj2 = new ClientePJ("Empresa jONILTDA", "CCCVCVFF-FFFF");

        Livro cronicasDeNarnia = new Livro(
                "Harry Potter",
                85,
                "Fantasia",
                "JK",
                "J. K. ROLLING",
                352);

        Informatica teclado = new Informatica(
                "Mouse",
                120,
                "Periférico",
                "Ace",
                1);

        Mercado arroz = new Mercado(
                "Feijão",
                6,
                "Grãos",
                "Fradinho",
                "Integral",
                false);

        Informatica monitor = new Informatica(
                "Monitor",
                1600,
                "Periférico",
                "Sansung",
                1);

        Informatica notebook = new Informatica(
                "Notebook",
                4000,
                "Notebook",
                "Lenovo",
                1);

        Livro codigoLimpo = new Livro(
                "As Crônicas de Gelo e Fogo",
                55,
                "Fantasia",
                "ABC",
                "George R. Martin",
                425);

        //a1.cadastrarProduto(HarryPotter);
        //a1.cadastrarProduto(Mouse);
        //a1.cadastrarProduto(Feijao);
        //a1.cadastrarProduto(monitor);
        //a1.cadastrarProduto(notebook);
        //a1.cadastrarProduto(AsCronicasDeGeloEFogo);

        // a1.removerProduto(arroz);
        // a1.visualizarProdutos();
        // c1.ordenarPorPrecoMaiorMenor();
        // c1.ordenarPorPrecoMenorMaior();
        // c1.ordenarPorNomeMaiorMenor();
        // c1.ordenarPorNomeMenorMaior();

        pf.adicionarAoCarrinho(new String[] { "Harry Potter" });
        pj.adicionarAoCarrinho(new String[] { "As Crônicas de Narnia", "Mouse", "Feijão", "Arroz" });
        pj2.adicionarAoCarrinho(new String[] { "Notebook" });

        pf.pagar(EnumPagamentos.FATURAMENTO);
        pj.pagar(EnumPagamentos.FATURAMENTO);
        pj2.pagar(EnumPagamentos.PIX);
        pj2.pagar(EnumPagamentos.CARTAO);
        pj2.pagar(EnumPagamentos.BOLETO);

    }
}