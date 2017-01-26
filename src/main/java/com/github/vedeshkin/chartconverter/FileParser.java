package com.github.vedeshkin.chartconverter;


import com.opencsv.CSVIterator;
import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import static com.github.vedeshkin.chartconverter.InputFormat.*;

/**
 * Created by vedeshkin on 25.01.2017.
 */
public class FileParser {
    private static Logger logger = LogManager.getLogger(FileParser.class.getName());

   private String file;
    public FileParser(String file) {
        this.file = file;
    }



    public void parse() {


        FileReader fileReader;
        ArrayList<String[]> parsedLines;

        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            logger.error(e);
            return;
        }
        CSVReader csvReader = new CSVReaderBuilder(fileReader).
                withSkipLines(1).
                build();

        try {
            parsedLines = (ArrayList) csvReader.readAll();
        } catch (IOException e) {
           logger.error(e);
           return;
        }
        for (String[] line:parsedLines)
        {
            if(line.length !=  7){
                logger.info("Wrong format");
            }
        }
        try {
            csvReader.close();
            fileReader.close();
        } catch (IOException e) {
            logger.error(e);
        }

    }

    public static void main(String[] args) {
        logger.info("Log4j is here");
        FileParser fp =  new FileParser("C:\\Data.csv");
        fp.parse();

    }

}
