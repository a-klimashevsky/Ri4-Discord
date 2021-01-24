package tv.z85.domain.sde.yaml

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*


@ExperimentalSerializationApi
fun <T> buildSerializerFor(clazz: Class<T>): KSerializer<T> {
    return object : KSerializer<T> {

        override val descriptor: SerialDescriptor = buildClassSerialDescriptor(clazz.name) {

            for (field in clazz.declaredFields) {
                if(field.name == "Companion")
                    continue

                when((field.type)) {
                    Int::class.java -> element<Int>(field.name)
                    String::class.java -> element<String>(field.name)
                    else -> throw IllegalArgumentException("Unknown field type ${field.type}")
                }
            }
        }

        override fun serialize(encoder: Encoder, value: T) = throw NotImplementedError()

        override fun deserialize(decoder: Decoder): T =
            decoder.decodeStructure(descriptor) {
                val args = mutableListOf<Any>()
                while (true) {
                    val index = decodeElementIndex(descriptor)
                    if(index == CompositeDecoder.DECODE_DONE) {
                        break
                    } else {
                        val value = decodeElement(this, descriptor, index)
                        args.add(value)
                    }
                }

                clazz.declaredConstructors
                    .first { it.parameterCount == args.size }
                    .newInstance(*args.toTypedArray()) as T
            }

        private fun decodeElement(
            compositeDecoder: CompositeDecoder,
            descriptor: SerialDescriptor,
            index: Int
        ): Any {
            val elementDescriptor = descriptor.getElementDescriptor(index)
            return when(elementDescriptor.kind){
                PrimitiveKind.INT -> compositeDecoder.decodeIntElement(descriptor, index)
                PrimitiveKind.BOOLEAN -> TODO()
                PrimitiveKind.BYTE -> TODO()
                PrimitiveKind.CHAR -> TODO()
                PrimitiveKind.SHORT -> TODO()
                PrimitiveKind.LONG -> TODO()
                PrimitiveKind.FLOAT -> TODO()
                PrimitiveKind.DOUBLE -> TODO()
                PrimitiveKind.STRING -> compositeDecoder.decodeStringElement(descriptor, index)
                StructureKind.CLASS -> TODO()
                StructureKind.LIST -> TODO()
                StructureKind.MAP -> TODO()
                StructureKind.OBJECT -> TODO()
                PolymorphicKind.SEALED -> TODO()
                PolymorphicKind.OPEN -> TODO()
                SerialKind.ENUM -> TODO()
                SerialKind.CONTEXTUAL -> TODO()
            }
        }
    }
}