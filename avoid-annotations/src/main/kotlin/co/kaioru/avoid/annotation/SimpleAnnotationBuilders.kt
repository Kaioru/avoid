package co.kaioru.avoid.annotation

import co.kaioru.avoid.SimpleContext
import co.kaioru.retort.annotation.builder.impl.AnnotationFactoryBuilder

open class SimpleAnnotationBuilder<I : SimpleContext> : AnnotationFactoryBuilder<I, Void>()