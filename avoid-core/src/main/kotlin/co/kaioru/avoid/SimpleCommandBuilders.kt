package co.kaioru.avoid

import co.kaioru.retort.builder.impl.CommandBuilder
import co.kaioru.retort.builder.impl.MiddlewareBuilder

class SimpleCommandBuilder<I : SimpleContext>(name: String) : CommandBuilder<I, Void>(name)

class SimpleMiddlewareBuilder<I : SimpleContext> : MiddlewareBuilder<I>()