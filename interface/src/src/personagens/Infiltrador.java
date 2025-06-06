package personagens;

public class Infiltrador extends Personagem {

    //Atributos da classe:
    private String habilidadeInfiltrador;

    //Metodo construtor:
    public Infiltrador(String habilidadeInfiltrador) {

        this.setNomePersonagem("Malik Gohst - O Infiltrador Fantasma");
        this.setVidaPersonagem(85);
        this.setFomePersonagem(65);
        this.setSedePersonagem(85);
        this.setEnergiaPersonagem(100);
        this.setSanidadePersonagem(100);
        this.setInventarioPersonagem(getInventarioPersonagem());
        this.setLocalizacaoPersonagem("");
        this.setContaminacaoPersonagem(false);
        this.setSedeInicialPersonagem(85);
        this.setFomeInicialPersonagem(65);
        this.habilidadeInfiltrador = habilidadeInfiltrador;
        this.setImagemPersonagemNoAmbiente("infiltrador");
        this.setEnergiaMaximaPersonagem(100);
        this.setVidaMaximaPersonagem(85);
        this.setSanidadeMaximaPersonagem(100);
    }
    //Metodos acessores:
    public void setHabilidadeInfiltrador(String habilidadeInfiltrador) {
        this.habilidadeInfiltrador = habilidadeInfiltrador;
    }
    public String getHabilidadeInfiltrador() {
        return habilidadeInfiltrador;
    }
}