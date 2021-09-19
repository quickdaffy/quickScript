package me.quick.script.method;

import me.quick.script.Main;
import me.quick.script.util.ParsingUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Method {

    public CopyOnWriteArrayList<String> lines = new CopyOnWriteArrayList<>();

    public String methodName;

    public Method(String methodName) {
        this.methodName = methodName;
    }

    public void addLines(String... addLines) {
        lines.addAll(Arrays.asList(addLines));
    }

    public void call() {
        List<String> toParse = new ArrayList<>();
        for(String line : lines) {
            if(line.contains("\n")) {
                toParse.addAll(Arrays.asList(line.split("\n")));
            } else {
                toParse.add(line);
            }
        }
        for(String line : toParse) {
             Main.parser.parseLine(ParsingUtil.removeSpaces(line));
        }
    }

}
