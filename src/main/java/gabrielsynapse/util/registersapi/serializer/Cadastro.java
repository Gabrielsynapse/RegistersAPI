package gabrielsynapse.util.registersapi.serializer;

import gabrielsynapse.util.fileutil.Json;

import java.util.ArrayList;

public class Cadastro {
    private String discordUserName;
    private String discordId;
    private String nickname;
    private boolean present = true;

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
    public String getNickname() {
        return nickname;
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
    //metodos estaticos
    private static Json<Cadastro> json = new Json<>(Cadastro.class);
    //metodos getters
    public Cadastro getCadastro(String nickname) {
        return json.read("registers/" + nickname + ".json");
    }
    //metodos setters

}
