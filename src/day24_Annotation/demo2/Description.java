package day24_Annotation.demo2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * @Retention：说明该注解的生命周期
			RententionPolicy.CLASS：指注解只保留一个class文件中
			RententionPolicy.SOURCE：指定注解只保留在一个源文件中
			RententionPolicy.RUNTIME：指定注解可以保留在程序运行期间
		@Documented:文档注解
		@Inherited:被他修饰的注解将具有继承性，如果某个类使用被该注解修饰的注解，则它的子类将自动具有该注解。
		@Target: 作用域
			ElementType.TYPE：说明该注解只能被声明在一个类前。
			ElementType.FIELD：说明该注解只能被声明在一个类的字段前。 
			ElementType.METHOD：说明该注解只能被声明在一个类的方法前。
			ElementType.PARAMETER：说明该注解只能被声明在一个方法参数前。
			ElementType.CONSTRUCTOR：说明该注解只能声明在一个类的构造方法前。 
			ElementType.LOCAL_VARIABLE：说明该注解只能声明在一个局部变量前。
			ElementType.ANNOTATION_TYPE：说明该注解只能声明在一个注解类型前。
			ElementType.PACKAGE：说明该注解只能声明在一个包名前。
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Description {

	/*
	 * 1.成员类型受限，合法类型 基本数据类型，String，Class Annotation，等
	 * 2.如何注解只有一个成员，则成员名必须为value(),在使用时候可以忽略成员名和赋值号(=) 3.注解类可以没有成员，没有成员注解称为标识注解
	 * 
	 * 注解按照是否有值可以分为三类，分别是 标记注解 、 单值注解 、 完全注解 。
	 * 
	 */
	// String desc();//在注解里面只是一个成员变量
	// String author();
	// int age() default 18; //成员变量可以使用default指定一个默认值

	String value() default "小二";
}
