package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodAnnotation {
    /**
     * In this case, the allowed types for the times attribute are:
     * <p>
     * Primitive Types: This includes the standard numeric primitive types in Java, such as int, long, short, byte, char, float, and double.
     * <p>
     * String: The String type is also allowed as an attribute value.
     * <p>
     * Enums: Enum types are allowed as well.
     * <p>
     * Array Types: Arrays of the above types are also allowed. For example, int[] or String[].
     */
    int times() default 1;
}
