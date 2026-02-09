
package learninheritence.mobile;


public class FeatureFone extends Andorid{
    private String button;

    public FeatureFone() {
    }

    public FeatureFone(String button) {
        this.button = button;
    }

    public FeatureFone(String button, String touchSreen, String browser, String playStore, String setOs) {
        super(touchSreen, browser, playStore, setOs);
        this.button = button;
    }

    public FeatureFone(String button, String touchSreen, String browser, String playStore, String setOs, String call, String message, String games, String camara, String galary) {
        super(touchSreen, browser, playStore, setOs, call, message, games, camara, galary);
        this.button = button;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }
    
    
    
    
}
