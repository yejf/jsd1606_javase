/**
 * �������xxx��˾��Ȩ���У�
 * δ�����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day19;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yejf
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
public @interface Port {

	int value() default 6668;
}