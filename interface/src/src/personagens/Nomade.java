package personagens;

public class Nomade extends Personagem {
    //Atributos da classe:
    private String habilidadeNomade;
    //Metodo construtor:
    public Nomade(String habilidadeNomade){

        this.setNomePersonagem("Jack Nomad - O Nômade Rústico");
        this.setVidaPersonagem(100);
        this.setFomePersonagem(100);
        this.setSedePersonagem(65);
        this.setEnergiaPersonagem(65);
        this.setSanidadePersonagem(100);
        this.setInventarioPersonagem(getInventarioPersonagem());
        this.setLocalizacaoPersonagem("");
        this.setContaminacaoPersonagem(false);
        this.setSedeInicialPersonagem(65);
        this.setFomeInicialPersonagem(100);
        this.habilidadeNomade = habilidadeNomade;
        this.setImagemPersonagemNoAmbiente("nomade");
        this.setSanidadeMaximaPersonagem(100);
        this.setVidaMaximaPersonagem(100);
        this.setEnergiaMaximaPersonagem(65);
    }
    //Metodos acessores:
    public void setHabilidadeNomade(String habilidadeNomade) {
        this.habilidadeNomade = habilidadeNomade;
    }
    public String getHabilidadeNomade() {
        return habilidadeNomade;
    }
}