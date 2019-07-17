package apa7.bitcoin.data;

import java.io.Serializable;

/**
 * Created by apa7 on 2019/7/17.
 * Maintainer:
 */
public class Response<T> implements Serializable {

    T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}