package apa7.bitcoin.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by apa7 on 2019/7/17.
 * Maintainer:
 */
public class TransactionData implements Serializable {

    private Long confirmations;

    private String blockhash;

    private Integer blockindex;

    private Long blocktime;

    private String txid;

    private Long timereceived;

    private List<TransactionDetail> details;

    public class TransactionDetail implements Serializable {

        private String address;

        private String category;

        private BigDecimal amount;

        private String label;

        private BigDecimal vout;

        private BigDecimal fee;

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

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public BigDecimal getVout() {
            return vout;
        }

        public void setVout(BigDecimal vout) {
            this.vout = vout;
        }

        public BigDecimal getFee() {
            return fee;
        }

        public void setFee(BigDecimal fee) {
            this.fee = fee;
        }
    }


    public Long getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Long confirmations) {
        this.confirmations = confirmations;
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

    public Long getTimereceived() {
        return timereceived;
    }

    public void setTimereceived(Long timereceived) {
        this.timereceived = timereceived;
    }

    public List<TransactionDetail> getDetails() {
        return details;
    }

    public void setDetails(List<TransactionDetail> details) {
        this.details = details;
    }
}