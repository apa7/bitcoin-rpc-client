package apa7.bitcoin.data;

import java.io.Serializable;
import java.math.BigDecimal;

public class Output implements Serializable {

    private BigDecimal value;

    private int n;

    private ScriptPubKey scriptPubKey;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ScriptPubKey getScriptPubKey() {
        return scriptPubKey;
    }

    public void setScriptPubKey(ScriptPubKey scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

}