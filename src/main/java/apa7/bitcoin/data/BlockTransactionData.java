package apa7.bitcoin.data;

import java.io.Serializable;
import java.util.List;

public class BlockTransactionData implements Serializable {

//    String hex;

    private String txid;

    private String hash;

    private int version;

    private long lockTime;

    private long size;

    private long vsize;

    /**
     * This method should be replaced someday
     */
    private List<Output> vout;

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public long getLockTime() {
        return lockTime;
    }

    public void setLockTime(long lockTime) {
        this.lockTime = lockTime;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getVsize() {
        return vsize;
    }

    public void setVsize(long vsize) {
        this.vsize = vsize;
    }

    public List<Output> getVout() {
        return vout;
    }

    public void setVout(List<Output> vout) {
        this.vout = vout;
    }
}