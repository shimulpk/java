
package learninheritence.mobile;

public class Mobile {
    private String call;
    private String message;
    private String games;
    private String camara;
    private String galary;

    public Mobile() {
    }

    public Mobile(String call, String message, String games, String camara, String galary) {
        this.call = call;
        this.message = message;
        this.games = games;
        this.camara = camara;
        this.galary = galary;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getGalary() {
        return galary;
    }

    public void setGalary(String galary) {
        this.galary = galary;
    }
    
    
    
}

