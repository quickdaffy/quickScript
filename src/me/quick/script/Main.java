package me.quick.script;

import me.quick.script.classes.QSClass;
import me.quick.script.parser.Parser;
import me.quick.script.util.ParsingUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static Parser parser = new Parser();

    public static void main(String[] args) {
        String fileToParse = "C:\\Users\\husse\\Desktop\\quickScript\\test.qs";

        parser.parseFile(fileToParse);
    }

}
