package me.quick.script.classes;

import me.quick.script.Main;
import me.quick.script.method.Method;
import me.quick.script.parser.Parser;
import me.quick.script.util.ParsingUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class QSClass {

    public CopyOnWriteArrayList<String> lines = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<Method> methods = new CopyOnWriteArrayList<>();

    public String className;

    public QSClass(String className) {
        this.className = className;
    }

    public void addLines(String... addLines) {
        lines.addAll(Arrays.asList(addLines));
    }

    public void addLine(String addLines) {
        lines.add(addLines);
    }

    public void addMethods(Method... addMethods) {
        methods.addAll(Arrays.asList(addMethods));
    }

    public void parse() {
        List<String> toParse = new ArrayList<>();
        for(String line : lines) {
            if(line.contains("\n")) {
                toParse.addAll(Arrays.asList(line.split("\n")));
            } else {
                toParse.add(line);
            }
            //if(!line.startsWith("method:")) Main.parser.parseLine(line);
        }
        for(String line : toParse) {
            if(!line.startsWith("method:")) {
                Main.parser.parseLine(ParsingUtil.removeSpaces(line));
            } else {
                Method method = new Method(ParsingUtil.getClassName(line));
                methods.add(method);
                List<String> linesInsideMethod = new ArrayList<>();
            }
        }
    }

    public void callMethod(String methodName) {
        for(Method method : methods) {
            if(method.methodName.equals(methodName)) {
                method.call();
            }
        }
    }



}
