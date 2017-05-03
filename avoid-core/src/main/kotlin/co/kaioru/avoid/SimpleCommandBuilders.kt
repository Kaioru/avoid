package co.kaioru.avoid

import co.kaioru.retort.builder.impl.CommandBuilder
import co.kaioru.retort.builder.impl.MiddlewareBuilder

open class SimpleCommandBuilder<I : SimpleContext>(name: String) : CommandBuilder<I, Void>(name)

open class SimpleMiddlewareBuilder<I : SimpleContext> : MiddlewareBuilder<I>()