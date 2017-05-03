package co.kaioru.avoid.reflection

import co.kaioru.retort.impl.CommandContext
import co.kaioru.retort.reflection.builder.impl.ReflectionGeneratorBuilder

class SimpleReflectionBuilder<I : CommandContext, O : Any> : ReflectionGeneratorBuilder<I, O>()