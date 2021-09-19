package me.quick.script.util;

import me.quick.script.classes.QSClass;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ParsingUtil {


    public static String getInBetweenParenthesis(String input) {
        return StringUtils.substringBetween(input, "(", ")");
    }

    public static String getInBetweenQuotes(String input) {
        return StringUtils.substringBetween(input, "'", "'");
    }

    public static String getInBetweenBrackets(String input) {
        return StringUtils.substringBetween(input, "{", "}");
    }

    public static String getClassName(String input) {
        return StringUtils.substringBetween(input, ":", " {");
    }

    public static String removeSpaces(String line) {
        String returningString;
        returningString = line.replaceAll("\\s", "");
        returningString = line.replaceAll("\\t", "");
        return returningString;
    }

}
