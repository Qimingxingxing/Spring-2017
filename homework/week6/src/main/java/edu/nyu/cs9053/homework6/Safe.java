package edu.nyu.cs9053.homework6;
import java.lang.annotation.*;
/**
 * User: blangel
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Safe {
	
    static final long INVALID = 0L;

    /**
     * @return the deposit-safe's password
     */
    long password() default INVALID;

}
