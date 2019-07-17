package apa7.bitcoin.data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by apa7 on 2019/7/17.
 * Maintainer:
 */
public class SinceTransactions implements Serializable {

    private List<SinceTransaction> transactions;

    public List<SinceTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<SinceTransaction> transactions) {
        this.transactions = transactions;
    }
}