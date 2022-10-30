public class Main {
    public static void main(String[] args) {
        //Criando carrinho de compras
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        //Criando Biscoitos
        Biscoito b1 = new Biscoito("Passatempo",3.50,2,"Chocolate");
        Biscoito b2 = new Biscoito("Trakinas",2.50,-6,"Morango");
        Biscoito b3 = new Biscoito("Nescau",3.00,5,"Chocolate");

        //Adicionando Biscoitos ao carrinho
        carrinhoDeCompra.addBiscoito(b1);
        carrinhoDeCompra.addBiscoito(b2);
        carrinhoDeCompra.addBiscoito(b3);

        //Calculando total sem descontos
        System.out.println("Soma total atual sem descontos: "+carrinhoDeCompra.somaTotal());

        //Criando Cupons
        CupomDesconto c1 = new CupomDesconto(2.50);
        CupomDesconto c2 = new CupomDesconto(1.50);

        //Adicionando Cupons
        carrinhoDeCompra.addCupomDesconto(c1);
        carrinhoDeCompra.addCupomDesconto(c2);

        //Mostrando Soma Total com descontos
        System.out.println("Soma total atual com descontos: "+carrinhoDeCompra.somaTotal());

    }
}