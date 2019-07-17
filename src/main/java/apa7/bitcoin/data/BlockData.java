package apa7.bitcoin.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by apa7 on 2019/7/5.
 * Maintainer:
 */
public class BlockData implements Serializable {

    private String hash;

    private int confirmations;

    private int size;

    private int height;

    private int version;

    private List<BlockTransactionData> tx;

    private long nonce;

    private String bits;

    private BigDecimal difficulty;

    private String chainwork;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public List<BlockTransactionData> getTx() {
        return tx;
    }

    public void setTx(List<BlockTransactionData> tx) {
        this.tx = tx;
    }

    public long getNonce() {
        return nonce;
    }

    public void setNonce(long nonce) {
        this.nonce = nonce;
    }

    public String getBits() {
        return bits;
    }

    public void setBits(String bits) {
        this.bits = bits;
    }

    public BigDecimal getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(BigDecimal difficulty) {
        this.difficulty = difficulty;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }
}