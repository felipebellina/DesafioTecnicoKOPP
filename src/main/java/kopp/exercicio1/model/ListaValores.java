package kopp.exercicio1.model;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class ListaValores {
    private List<Double> lista;

    public ListaValores(){
        this.lista = new ArrayList<>();
    }


    public double total(){
        double somaTotal = 0;
        for (var valor : lista){
            somaTotal += valor;
        }
        return somaTotal;
    }

    public void listar(){
        System.out.println("Remessa gerada: ");
        var indice = 1;

        for (int i = 0; i < lista.size(); i++) {
            indice = i +1;
            System.out.println(indice + " cujo valor é " + NumberFormat.getCurrencyInstance().format(lista.get(i)) + ", ");
        }
        System.out.println("Total: " + NumberFormat.getCurrencyInstance().format(total()));
    }

    public void adicionarLista(Double valor){
        this.lista.add(valor);
    }

    public List<Double> getLista() {
        return lista;
    }

    public void setLista(List<Double> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ListaValores{" +
                "lista=" + lista +
                '}';
    }
}
