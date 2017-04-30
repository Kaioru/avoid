package co.kaioru.avoid;

import co.kaioru.retort.BaseCommandContext;
import co.kaioru.retort.BaseCommandRegistry;

public class CommandRegistry<I extends BaseCommandContext> extends BaseCommandRegistry<I, Void> {

    public CommandRegistry() {
        super("registry");
    }

}

