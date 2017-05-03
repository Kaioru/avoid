package co.kaioru.avoid.annotation

import co.kaioru.avoid.SimpleContext
import co.kaioru.retort.annotation.impl.AnnotationFactory
import co.kaioru.retort.annotation.impl.AnnotationGenerator
import co.kaioru.retort.annotation.impl.AnnotationProcessor

class SimpleAnnotationFactory<I : SimpleContext> : AnnotationFactory<I, Void>()

abstract class SimpleAnnotationGenerator<I : SimpleContext> : AnnotationGenerator<I, Void>()

abstract class SimpleAnnotationProcessor<I : SimpleContext> : AnnotationProcessor<I, Void>()