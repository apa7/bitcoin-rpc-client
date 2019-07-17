package apa7.bitcoin.data;

import java.io.Serializable;

public class TxInput implements Serializable {

    public String txid;

    public String scriptPubKey;

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getScriptPubKey() {
        return scriptPubKey;
    }

    public void setScriptPubKey(String scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }
}