package apa7.bitcoin.data;

import java.io.Serializable;

/**
 * Created by apa7 on 2019/7/16.
 * Maintainer:
 */
public class BlockResult implements Serializable {

    private BlockData result;

    public BlockData getResult() {
        return result;
    }

    public void setResult(BlockData result) {
        this.result = result;
    }
}
