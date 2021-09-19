package me.quick.script.parser;

import me.quick.script.basic.BasicOperators;
import me.quick.script.classes.QSClass;
import me.quick.script.math.Calculations;
import me.quick.script.util.ParsingUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Parser {

    public BasicOperators basic = new BasicOperators();
    public Calculations math = new Calculations();

    public void parseLine(String line) {
        if(line.startsWith("ba")) {
            //String sendToBasic = line.split("::")[1];
            basic.tryBuildInMethod(line.substring(line.lastIndexOf(":") + 1));
        }
        if(line.startsWith("math")) {
            String sendToMath = line.split("::")[1];
            math.parseMath(line.substring(line.lastIndexOf(":") + 1));
        }
    }

    public void parseFile(String fileToParse) {
        if(!fileToParse.endsWith(".qs")) return;

        try(BufferedReader br = new BufferedReader(new FileReader(fileToParse))) {
            String line = br.readLine();
            StringBuilder allLines = new StringBuilder();
            QSClass qsClass = null;
            while (line != null) {
                //parser.parseLine(line);
                if(line.startsWith("class:")) {
                    qsClass = new QSClass(ParsingUtil.getClassName(line));
                }
                allLines.append(line + "\n");
                line = br.readLine();
            }
            qsClass.addLine(allLines.toString());
            qsClass.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
