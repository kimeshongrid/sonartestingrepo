package org.example;

import java.lang.instrument.Instrumentation;
import java.lang.RuntimeException;
import java.lang.NumberFormatException;

public class InstrumentationAgent  {
    private static volatile Instrumentation globalInstrumentation;

    public static void premain(final String agentArgs, final Instrumentation inst) {
        globalInstrumentation = inst;
    }

    public static long getObjectSize(final Object object) {
        if (globalInstrumentation == null) {
            throw new IllegalStateException("Agent not initialized.");
        }
        return globalInstrumentation.getObjectSize(object);
    }
}
