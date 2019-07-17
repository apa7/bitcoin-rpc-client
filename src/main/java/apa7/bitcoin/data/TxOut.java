package apa7.bitcoin.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class TxOut implements Serializable {

    private String bestBlock;

    private long confirmations;

    private BigDecimal value;

    private String asm;

    private String hex;

    private long reqSigs;

    private String type;

    private List<String> addresses;

    private long version;

    private boolean coinBase;

    public String getBestBlock() {
        return bestBlock;
    }

    public void setBestBlock(String bestBlock) {
        this.bestBlock = bestBlock;
    }

    public long getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(long confirmations) {
        this.confirmations = confirmations;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getAsm() {
        return asm;
    }

    public void setAsm(String asm) {
        this.asm = asm;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public long getReqSigs() {
        return reqSigs;
    }

    public void setReqSigs(long reqSigs) {
        this.reqSigs = reqSigs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public boolean isCoinBase() {
        return coinBase;
    }

    public void setCoinBase(boolean coinBase) {
        this.coinBase = coinBase;
    }
}
