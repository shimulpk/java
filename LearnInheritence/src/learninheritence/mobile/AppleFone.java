/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learninheritence.mobile;


public class AppleFone extends Mobile {
    
    private String faceall;
    private String appstore;
    private String imessage;

    public AppleFone() {
    }

    public AppleFone(String faceall, String appstore, String imessage) {
        this.faceall = faceall;
        this.appstore = appstore;
        this.imessage = imessage;
    }

    public AppleFone(String faceall, String appstore, String imessage, String call, String message, String games, String camara, String galary) {
        super(call, message, games, camara, galary);
        this.faceall = faceall;
        this.appstore = appstore;
        this.imessage = imessage;
    }

    public String getFaceall() {
        return faceall;
    }

    public void setFaceall(String faceall) {
        this.faceall = faceall;
    }

    public String getAppstore() {
        return appstore;
    }

    public void setAppstore(String appstore) {
        this.appstore = appstore;
    }

    public String getImessage() {
        return imessage;
    }

    public void setImessage(String imessage) {
        this.imessage = imessage;
    }

   
    
    
}

