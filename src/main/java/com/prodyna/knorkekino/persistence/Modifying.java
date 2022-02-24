package com.prodyna.knorkekino.persistence;

public @interface Modifying {
    boolean clear() default false;

    boolean flush() default false;
}
