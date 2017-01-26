package com.github.vedeshkin.chartconverter;

/**
 * Created by vedeshkin on 27.01.2017.
 */
public enum InputFormat {
    DATE(0),
    TIME(1),
    LOW(4),
    HIGH(3),
    OPEN(2),
    CLOSE(5),
    VALUE(6);

    private int postion;

    InputFormat(int postion) {
        this.postion = postion;
    }
    public  int getFieldPosition()
    { return postion;
    }
}
