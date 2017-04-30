package co.kaioru.avoid.reflection;

import co.kaioru.retort.BaseCommandContext;
import co.kaioru.retort.reflection.AbstractReflectionProvider;

public abstract class ReflectionProvider<I extends BaseCommandContext, O> extends AbstractReflectionProvider<I, O> {

    public ReflectionProvider(Class<O> type) {
        super(type);
    }

}
