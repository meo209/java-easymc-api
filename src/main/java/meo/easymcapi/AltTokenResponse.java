package meo.easymcapi;

public class AltTokenResponse {

    private String mcName, uuid, session, message, userId, msaCredentials;
    private boolean microsoft;

    public boolean isMicrosoft() {
        return microsoft;
    }

    public void setMicrosoft(boolean microsoft) {
        this.microsoft = microsoft;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMsaCredentials() {
        return msaCredentials;
    }

    public void setMsaCredentials(String msaCredentials) {
        this.msaCredentials = msaCredentials;
    }

    public String getMcName() {
        return mcName;
    }

    public void setMcName(String mcName) {
        this.mcName = mcName;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
