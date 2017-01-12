package org.dougllas.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.dougllas.CellTextAlignment;
import org.dougllas.ColumnHeaderTextAlignment;

/**
 * @author dougllas.sousa
 * @since 17-08-2016
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ColunaPlanilha {

	String cabecalho() default "";
	
	int tamanho() default 10;
	
	CellTextAlignment cellTextAlignment() default CellTextAlignment.LEFT;
	
	ColumnHeaderTextAlignment columnHeaderTextAlignment() default ColumnHeaderTextAlignment.LEFT;
	
	int columnPosition() default -1;
	
}