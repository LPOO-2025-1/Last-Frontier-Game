package personagens;

public class Cientista extends Personagem {
    //Atributos da classe:
    private String habilidadeCientista;
    //Metodo construtor:
    public Cientista(String nomePersonagem, double vidaPersonagem, double fomePersonagem, double sedePersonagem, double energiaPersonagem,
                     double sanidadePersonagem, String inventarioPersonagem, String localizacaoPersonagem, String habilidadeCientista) {
        super(nomePersonagem, vidaPersonagem, fomePersonagem, sedePersonagem, energiaPersonagem,
                sanidadePersonagem, inventarioPersonagem, localizacaoPersonagem);
        this.setNomePersonagem("Gearhead Martinez");
        this.setVidaPersonagem(85);
        this.setFomePersonagem(85);
        this.setSedePersonagem(100);
        this.setEnergiaPersonagem(100);
        this.setSanidadePersonagem(85);
        this.setInventarioPersonagem(" ");
        this.setLocalizacaoPersonagem(" ");
        this.habilidadeCientista = habilidadeCientista;
    }
    //Metodos acessores:
    public void setHabilidadeCientista(String habilidadeCientista) {
        this.habilidadeCientista = habilidadeCientista;
    }
    public String getHabilidadeCientista() {
        return habilidadeCientista;
    }
}
