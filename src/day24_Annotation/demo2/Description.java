package day24_Annotation.demo2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * @Retention��˵����ע�����������
			RententionPolicy.CLASS��ָע��ֻ����һ��class�ļ���
			RententionPolicy.SOURCE��ָ��ע��ֻ������һ��Դ�ļ���
			RententionPolicy.RUNTIME��ָ��ע����Ա����ڳ��������ڼ�
		@Documented:�ĵ�ע��
		@Inherited:�������ε�ע�⽫���м̳��ԣ����ĳ����ʹ�ñ���ע�����ε�ע�⣬���������ཫ�Զ����и�ע�⡣
		@Target: ������
			ElementType.TYPE��˵����ע��ֻ�ܱ�������һ����ǰ��
			ElementType.FIELD��˵����ע��ֻ�ܱ�������һ������ֶ�ǰ�� 
			ElementType.METHOD��˵����ע��ֻ�ܱ�������һ����ķ���ǰ��
			ElementType.PARAMETER��˵����ע��ֻ�ܱ�������һ����������ǰ��
			ElementType.CONSTRUCTOR��˵����ע��ֻ��������һ����Ĺ��췽��ǰ�� 
			ElementType.LOCAL_VARIABLE��˵����ע��ֻ��������һ���ֲ�����ǰ��
			ElementType.ANNOTATION_TYPE��˵����ע��ֻ��������һ��ע������ǰ��
			ElementType.PACKAGE��˵����ע��ֻ��������һ������ǰ��
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Description {

	/*
	 * 1.��Ա�������ޣ��Ϸ����� �����������ͣ�String��Class Annotation����
	 * 2.���ע��ֻ��һ����Ա�����Ա������Ϊvalue(),��ʹ��ʱ����Ժ��Գ�Ա���͸�ֵ��(=) 3.ע�������û�г�Ա��û�г�Աע���Ϊ��ʶע��
	 * 
	 * ע�ⰴ���Ƿ���ֵ���Է�Ϊ���࣬�ֱ��� ���ע�� �� ��ֵע�� �� ��ȫע�� ��
	 * 
	 */
	// String desc();//��ע������ֻ��һ����Ա����
	// String author();
	// int age() default 18; //��Ա��������ʹ��defaultָ��һ��Ĭ��ֵ

	String value() default "С��";
}
