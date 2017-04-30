package co.kaioru.avoid;

import co.kaioru.retort.AbstractCommand;
import co.kaioru.retort.BaseCommandContext;

public abstract class Command<I extends BaseCommandContext> extends AbstractCommand<I, Void> {

    public Command(String name) {
        super(name);
    }

}
