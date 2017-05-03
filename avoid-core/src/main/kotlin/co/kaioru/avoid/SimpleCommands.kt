package co.kaioru.avoid

import co.kaioru.retort.impl.Command
import co.kaioru.retort.impl.CommandContext
import co.kaioru.retort.impl.CommandMiddleware
import co.kaioru.retort.impl.CommandRegistry

abstract class SimpleContext : CommandContext()

abstract class SimpleCommand<I : SimpleContext>(name: String) : Command<I, Void>(name) {
    @Suppress("UNREACHABLE_CODE")
    override fun execute(input: I): Void {
        executeAfter(input)
        return null!!
    }

    abstract fun executeAfter(input: I)
}

abstract class SimpleMiddleware<I : SimpleContext> : CommandMiddleware<I>()

open class SimpleCommandRegistry<I : SimpleContext> : CommandRegistry<I, Void>()