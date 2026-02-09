
package learninheritence.mobile;


public class Andorid extends Mobile{
    private String touchSreen;
    private String browser;
    private String playStore;
    private String setOs;

    public Andorid() {
    }

    public Andorid(String touchSreen, String browser, String playStore, String setOs) {
        this.touchSreen = touchSreen;
        this.browser = browser;
        this.playStore = playStore;
        this.setOs = setOs;
    }

    public Andorid(String touchSreen, String browser, String playStore, String setOs, String call, String message, String games, String camara, String galary) {
        super(call, message, games, camara, galary);
        this.touchSreen = touchSreen;
        this.browser = browser;
        this.playStore = playStore;
        this.setOs = setOs;
    }

    public String getTouchSreen() {
        return touchSreen;
    }

    public void setTouchSreen(String touchSreen) {
        this.touchSreen = touchSreen;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getPlayStore() {
        return playStore;
    }

    public void setPlayStore(String playStore) {
        this.playStore = playStore;
    }

    public String getSetOs() {
        return setOs;
    }

    public void setSetOs(String setOs) {
        this.setOs = setOs;
    }

    @Override
    public String toString() {
        return "Andorid{" + "touchSreen=" + touchSreen + ", browser=" + browser + ", playStore=" + playStore + ", setOs=" + setOs + '}';
    }

   
    
    
}
