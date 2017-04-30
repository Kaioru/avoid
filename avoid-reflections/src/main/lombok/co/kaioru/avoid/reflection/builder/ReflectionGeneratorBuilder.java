package co.kaioru.avoid.reflection.builder;

import co.kaioru.retort.BaseCommandContext;
import co.kaioru.retort.reflection.builder.BaseReflectionGeneratorBuilder;

public class ReflectionGeneratorBuilder<I extends BaseCommandContext, O> extends BaseReflectionGeneratorBuilder<I, O> {

    public ReflectionGeneratorBuilder(Class<O> outputClass) {
        super(outputClass);
    }

}
