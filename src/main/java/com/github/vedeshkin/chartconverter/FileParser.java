package com.github.vedeshkin.chartconverter;

import java.io.File;

/**
 * Created by vedeshkin on 25.01.2017.
 */
public class FileParser {

    private File input;
    public FileParser(File input) {
        this.input = input;
    }



    public Chart parse(){
    //implement main parse logic here


        return null;
    }

    public static void main(String[] args) {

        FileParser fp =  new FileParser(new File("C:\\Charts.txt"));
        Chart ch =  fp.parse();

    }
}
