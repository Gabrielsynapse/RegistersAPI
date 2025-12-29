package gabrielsynapse.bukit.discordBot.serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import gabrielsynapse.util.fileutil.Json;

import java.util.ArrayList;

public class Cadastro {
    private String userdiscordName;
    private String userdiscordId;
    private ArrayList<String> nicknames;
    public Cadastro(String userdiscordName, String userdiscordId) {
        this.userdiscordName = userdiscordName;
        this.userdiscordId = userdiscordId;
    }
    //metodos getters
    public String getUserdiscordName() {
        return userdiscordName;
    }
    public String getUserDiscordId() {
        return userdiscordId;
    }
    public ArrayList<String> getNicknames() {
        return nicknames;
    }
    //metodos setters
    public void addNickname(String nickname) {
        this.nicknames.add(nickname);
    }
    //metodos estaticos
    private static Json<Cadastro> json = new Json<>(Cadastro.class);
    //metodos getters
    public Cadastro getCadastro(String discordId) {
        return json.read("registers/" + discordId + ".json");
    }
    //metodos setters

}
