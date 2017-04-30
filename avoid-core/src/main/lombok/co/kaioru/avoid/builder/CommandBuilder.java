package co.kaioru.avoid.builder;

import co.kaioru.retort.BaseCommandContext;
import co.kaioru.retort.builder.BaseCommandBuilder;

public class CommandBuilder<I extends BaseCommandContext> extends BaseCommandBuilder<I, Void> {

    public CommandBuilder(String name) {
        super(name);
    }

}
