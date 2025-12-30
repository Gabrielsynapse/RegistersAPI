package gabrielsynapse.util.registersapi.serializer;

import gabrielsynapse.util.fileutil.Json;

public class Cadastro {
    private String discordUserName;
    private String discordId;
    private String nickname;
    public boolean present = true;
    public int ausent = 0;
    public boolean susspent = false;

    public Cadastro(){

    }
    public Cadastro(String discordUserName, String discordId) {
        this.discordUserName = discordUserName;
        this.discordId = discordId;
    }
    //metodos getters
    public String getDiscordUserName() {
        return discordUserName;
    }
    public String getDiscordId() {
        return discordId;
    }
    public boolean isPresent() {
        return present;
    }
    public boolean isSusspent() {
        return susspent;
    }
    public String getNickname() {
        return nickname;
    }
    public int getAusent() {
        return ausent;
    }
    //metodos setters
    public void setNickname(String nickname) {
        this.nickname =  nickname;
    }
    public void setDiscordUserName(String discordUserName) {
        this.discordUserName = discordUserName;
    }
    public void setDiscordId(String discordId) {
        this.discordId = discordId;
    }
    public void setPresent(boolean present) {
        this.present = present;
    }
    public void addAusent(int ausent) {
        this.ausent += ausent;
    }
    public void setSusspent(boolean susspent) {
        this.susspent = susspent;
    }
    public void resetAusent() {
        this.ausent = 0;
    }
    //metodos estaticos
    private static Json<Cadastro> json = new Json<>(Cadastro.class);
    //metodos getters
    public static Cadastro load(String nickname) {
        return json.read("registers/" + nickname + ".json");
    }
    //metodos setters
}
