package com.github.vedeshkin.chartconverter;

import java.util.ArrayList;
import org.apache.commons.csv.CSVRecord;

/**
 * Created by vedeshkin on 25.01.2017.
 */
public class Chart {
    private ChartType type;
    private ArrayList<CSVRecord> charts;

    public Chart(ChartType type,ArrayList<CSVRecord> charts) {
        this.type = type;
        this.charts = charts;
    }
}
