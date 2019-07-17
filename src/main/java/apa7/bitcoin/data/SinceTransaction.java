package apa7.bitcoin.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by apa7 on 2019/7/17.
 * Maintainer:
 */
public class SinceTransaction implements Serializable {

    private String address;

    private String category;

    private BigDecimal amount;

    private Integer vout;

    private Long confirmations;

    private boolean generated;

    private String blockhash;

    private Integer blockindex;

    private Long blocktime;

    private String txid;

    private Long time;

    private Long timereceived;

    @SerializedName("bip125-replaceable")
    private String bip125Replaceable;

    private List walletconflicts;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getVout() {
        return vout;
    }

    public void setVout(Integer vout) {
        this.vout = vout;
    }

    public Long getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Long confirmations) {
        this.confirmations = confirmations;
    }

    public boolean isGenerated() {
        return generated;
    }

    public void setGenerated(boolean generated) {
        this.generated = generated;
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public Integer getBlockindex() {
        return blockindex;
    }

    public void setBlockindex(Integer blockindex) {
        this.blockindex = blockindex;
    }

    public Long getBlocktime() {
        return blocktime;
    }

    public void setBlocktime(Long blocktime) {
        this.blocktime = blocktime;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getTimereceived() {
        return timereceived;
    }

    public void setTimereceived(Long timereceived) {
        this.timereceived = timereceived;
    }

    public String getBip125Replaceable() {
        return bip125Replaceable;
    }

    public void setBip125Replaceable(String bip125Replaceable) {
        this.bip125Replaceable = bip125Replaceable;
    }

    public List getWalletconflicts() {
        return walletconflicts;
    }

    public void setWalletconflicts(List walletconflicts) {
        this.walletconflicts = walletconflicts;
    }
}