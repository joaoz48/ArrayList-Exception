import java.util.ArrayList;

public class CarrinhoDeCompra {
    private ArrayList<Biscoito> biscoitos;
    private ArrayList<CupomDesconto> cupomDescontos;

    public void addCupomDesconto(CupomDesconto cd) {
        cupomDescontos.add(cd);
    }

    public CarrinhoDeCompra() {
        biscoitos = new ArrayList<>();
        cupomDescontos = new ArrayList<>();
    }

    public void addBiscoito(Biscoito bisc){
        try {
            if(bisc.getQtd() > 0)
                biscoitos.add(bisc);
            else
                throw new NumeroNegativoException();
        }catch (NumeroNegativoException e){
            System.out.println(e);
        }

    }

    public double somaTotal(){
        double soma = 0;

        for (int i = 0; i < biscoitos.size(); i++) {
            soma += biscoitos.get(i).getValor() * biscoitos.get(i).getQtd();
        }

        if(cupomDescontos.isEmpty()) {
            return soma;
        }
        else {
            for (int i = 0; i < cupomDescontos.size(); i++) {
                soma = somaTotalComDesconto(soma,cupomDescontos.get(i).getValorDesconto());
            }
            return soma;
        }
    }

    private double somaTotalComDesconto(double total, double desc){
        double somaComDesconto = 0;

        somaComDesconto = total - desc;

        return somaComDesconto;
    }

}
