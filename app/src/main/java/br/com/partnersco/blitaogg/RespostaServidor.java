package br.com.partnersco.blitaogg;

/**
 * Created by GutoDesk on 04/04/2017.
 */

public class RespostaServidor {

    private String result;
    private boolean valid;
    private String from_value;
    private String to_type;
    private String from_type;

    public RespostaServidor(){}

    public String getResult() {
        return result;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFrom_value() {
        return from_value;
    }

    public void setFrom_value(String from_value) {
        this.from_value = from_value;
    }

    public String getTo_type() {
        return to_type;
    }

    public void setTo_type(String to_type) {
        this.to_type = to_type;
    }

    public String getFrom_type() {
        return from_type;
    }

    public void setFrom_type(String from_type) {
        this.from_type = from_type;
    }
}
