package interfaces;

import eventos.EventoCriatura;
import personagens.Personagem;

public interface AcoesArmas {
    //Nessa ‘Interface’ está a assinatura do metodo usado na subclasse Armas:
    public abstract void atacar(Personagem personagemEscolhido, EventoCriatura criaturaAtacada);
}