package interfaces;

import itens.Item;
import personagens.Personagem;

public interface AcoesInventario {
    //Metodos que serão implementados na classe Inventario:
    public abstract boolean adicionarItem(Item itemAdicionado);
    public abstract void descartarItem(Item itemDescartado);
    public abstract void selecionarItem(int posicaoItemSelecionado, Personagem personagemEscolhido);
    public abstract void mostrarInventario();
    public abstract void mostrarItem(Item itemSelecionado); //Metodo adicionado para o utilizador administrar o inventário!
}
