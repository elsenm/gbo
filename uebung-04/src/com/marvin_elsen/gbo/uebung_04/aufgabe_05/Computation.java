package com.marvin_elsen.gbo.uebung_04.aufgabe_05;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Computation
{
    private final ScriptEngine engine;


    public Computation()
    {
        ScriptEngineManager manager = new ScriptEngineManager();
        engine = manager.getEngineByName("js");
    }


    public Object evaluate(String expression) throws ScriptException
    {
        return engine.eval(expression);
    }
}