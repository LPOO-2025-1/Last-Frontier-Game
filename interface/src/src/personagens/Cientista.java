package personagens;

public class Cientista extends Personagem {

    //Atributos da classe:
    private String habilidadeCientista;

    //Metodo construtor:
    public Cientista(String habilidadeCientista) {

        this.setNomePersonagem("Gearhead Martinez - O Cientista Criativo");
        this.setVidaPersonagem(85);
        this.setFomePersonagem(85);
        this.setSedePersonagem(100);
        this.setEnergiaPersonagem(100);
        this.setSanidadePersonagem(85);
        this.setInventarioPersonagem(getInventarioPersonagem());
        this.setLocalizacaoPersonagem("");
        this.setContaminacaoPersonagem(false);
        this.setSedeInicialPersonagem(100);
        this.setFomeInicialPersonagem(85);
        this.habilidadeCientista = habilidadeCientista;
        this.setImagemPersonagemNoAmbiente("cientista");
        this.setEnergiaMaximaPersonagem(100);
        this.setSanidadeMaximaPersonagem(85);
        this.setVidaMaximaPersonagem(85);
    }
    //Metodos acessores:
    public void setHabilidadeCientista(String habilidadeCientista) {
        this.habilidadeCientista = habilidadeCientista;
    }
    public String getHabilidadeCientista() {
        return habilidadeCientista;
    }
}