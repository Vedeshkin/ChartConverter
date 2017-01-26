package com.github.vedeshkin.chartconverter;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vedeshkin on 25.01.2017.
 */
public class FileParser {
    private static Logger logger = LogManager.getLogger(FileParser.class.getName());

   private String file;
    public FileParser(String file) {
        this.file = file;
    }



    public Chart parse(){
    //implement main parse logic here

        List records = new ArrayList();
        try {
            records = CSVParser.parse(new File(file), Charset.defaultCharset() ,CSVFormat.EXCEL).getRecords();
        }
        catch (IOException ex)
        {
            logger.error("Error during file open",ex);
        }

        return new Chart(ChartType.DAILY,(ArrayList)records);
    }

    public static void main(String[] args) {
        logger.info("Log4j is here");
        FileParser fp =  new FileParser("C:\\Charts.txt");
        Chart ch =  fp.parse();

    }
}
