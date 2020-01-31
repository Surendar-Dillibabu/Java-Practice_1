package main.java8.jjs.ex.pgms;

import java.io.FileReader;
import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornBindingEx {

  public static void main(String[] args) throws Exception {
    // Creating script engine
    ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
    // Binding script and Define scope of script
    Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);
    bind.put("name", "Nashorn");
    // Reading Nashorn file
    ee.eval(new FileReader(
        "G:\\Photon workspace\\Java-projects\\Practice_1\\src\\main\\java8\\jjs\\ex\\pgms\\embedded-msg.js"));
    
    Invocable invocable = (Invocable) ee;

    Object result = invocable.invokeFunction("sum", 10, 20);
    System.out.println("Sum of 10 and 20 :"+result);
    System.out.println("Returned result class type :"+result.getClass());

  }
}
