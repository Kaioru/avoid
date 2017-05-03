package co.kaioru.avoid

import co.kaioru.retort.impl.Command
import co.kaioru.retort.impl.CommandContext
import co.kaioru.retort.impl.CommandMiddleware
import co.kaioru.retort.impl.CommandRegistry

abstract class SimpleContext : CommandContext()

abstract class SimpleCommand<I : SimpleContext>(name: String) : Command<I, Void>(name)

abstract class SimpleMiddleware<I : SimpleContext> : CommandMiddleware<I>()

class SimpleCommandRegistry<I : SimpleContext> : CommandRegistry<I, Void>()