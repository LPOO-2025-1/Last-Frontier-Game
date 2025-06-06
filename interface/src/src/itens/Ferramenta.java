package itens;

import ambientes.Ambiente;
import interfaces.AcoesFerramentas;

public class Ferramenta extends Item implements AcoesFerramentas {
    //Atributos da subclasse:
    private String tipoFerramenta;
    private int eficienciaFerramenta;
    //Metodo construtor:
    public Ferramenta(String nomeItem, int pesoItem, int durabilidadeItem, String tipoFerramenta, int eficienciaFerramenta) {
        super(nomeItem, pesoItem, durabilidadeItem);
        this.tipoFerramenta = tipoFerramenta;
        this.eficienciaFerramenta = eficienciaFerramenta;
    }
    //Metodos acessores:
    public void setTipoFerramenta(String tipoFerramenta) {
        this.tipoFerramenta = tipoFerramenta;
    }
    public String getTipoFerramenta() {
        return tipoFerramenta;
    }
    public void setEficienciaFerramenta(int eficienciaFerramenta) {
        this.eficienciaFerramenta = eficienciaFerramenta;
    }
    public int getEficienciaFerramenta() {
        return eficienciaFerramenta;
    }
    //Metodos especiais:
    @Override
    public void utilizar(Ambiente recursosAlvo) {
        System.out.println("A ferramenta selecionada " + this.getNomeItem() + " foi utilizada para extrair recursos de "
                + recursosAlvo.getRecursosAmbiente());
        //Futuramente esse metodo também deve exibir os itens extraídos.
    }
}