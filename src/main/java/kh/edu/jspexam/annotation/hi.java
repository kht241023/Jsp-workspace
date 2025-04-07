package kh.edu.jspexam.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Target(ElementType.METHOD)
 *          : 어디에 붙일 수 있는지 지정
 *          : ElementType 기본 타입으로 Method 기능에만 붙일 수 있음
 *              @Service 나 @Controller 처럼 클래스에 붙이고 싶다면
 *              ElementType.METHOD      메서드             사용
 *              ElementType.TYPE        클래스, 인터페이스 사용
 *              ElementType.FIELD       멤버 변수에        사용
 *              ElementType.PARAMETER   메서드 파라미터    사용
 * @Retention(RetentionPolicy.RUNTIME)
 *           : 어노테이션이 언제까지 유지될 것인지 기간이나 시간 설정
 *              RetentionPolicy.RUNTIME : 어노테이션이 언제까지 유지될지 정함
 *              RetentionPolicy.SOURCE  : 컴파일할 때만 존재, 클래스 파일에 유지 X
 *                                          -> 자바언어에서 컴퓨터 언어로 변환할 때만 사용
 *                                          -> 실제 실행 중에는 사용 X
 *              RetentionPolicy.CLASS  : 클래스 파일까지 존재, 실행환경에서는 사용 불가

 * @interface   : 어노테이션 만드는 키워드
                    안에 속성(attribute)를 추가할 수 있음
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface hi {
    // 아래 속성 필수 아님 !
    String value() default "기본값";
}
