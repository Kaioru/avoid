package co.kaioru.avoid.reflection

import co.kaioru.avoid.SimpleContext
import co.kaioru.retort.reflection.impl.ReflectionGenerator
import co.kaioru.retort.reflection.impl.ReflectionProvider

open class SimpleReflectionGenerator<I : SimpleContext, O : Any> : ReflectionGenerator<I, O>()

abstract class SimpleReflectionProvider<I : SimpleContext, O : Any> : ReflectionProvider<I, O>()