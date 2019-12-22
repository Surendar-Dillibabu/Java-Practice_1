package main.java8.jjs.ex.pgms;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {

  public static void main(String[] args) throws ScriptException {
    ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
    // Evaluating Nashorn code
    ee.eval("print('Hello Nashorn');");

  }
}
