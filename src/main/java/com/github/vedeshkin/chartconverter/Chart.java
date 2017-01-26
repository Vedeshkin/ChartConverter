package com.github.vedeshkin.chartconverter;

import java.io.File;
import java.util.TimeZone;

/**
 * Created by vedeshkin on 25.01.2017.
 */
public class Chart {
    private ChartType type;
    private File file;
    private TimeZone timeZone;

    public Chart(ChartType type, File file, TimeZone timeZone) {
        this.type = type;
        this.file = file;
        this.timeZone = timeZone;
    }

    public ChartType getType() {
        return type;
    }

    public File getFile() {
        return file;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }
}
