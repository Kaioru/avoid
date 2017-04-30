package co.kaioru.avoid.reflection;

import co.kaioru.retort.BaseCommandContext;
import co.kaioru.retort.reflection.AbstractReflectionGenerator;

public class ReflectionGenerator<I extends BaseCommandContext, O> extends AbstractReflectionGenerator<I, O> {

    public ReflectionGenerator(Class<O> outputClass) {
        super(outputClass);
    }

}
