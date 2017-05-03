package co.kaioru.avoid

import co.kaioru.retort.builder.impl.CommandBuilder
import co.kaioru.retort.builder.impl.MiddlewareBuilder

abstract class SimpleCommandBuilder<I : SimpleContext>(name: String) : CommandBuilder<I, Void>(name)

abstract class SimpleMiddlewareBuilder<I : SimpleContext> : MiddlewareBuilder<I>()