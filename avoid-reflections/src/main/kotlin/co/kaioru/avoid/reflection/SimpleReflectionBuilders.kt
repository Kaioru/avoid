package co.kaioru.avoid.reflection

import co.kaioru.retort.impl.CommandContext
import co.kaioru.retort.reflection.builder.impl.ReflectionGeneratorBuilder

open class SimpleReflectionBuilder<I : CommandContext> : ReflectionGeneratorBuilder<I, Void>()