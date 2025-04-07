package kh.edu.jspexam.annotation;


// bye 어노테이션을 메서드에서만 사용할 수 있고 런타임 환경에서만 사용할 수 있도록 설정
// ByeAspect 를 만들어서
// 1. 시스템 출력 문으로 byte 종료 어노테이션이 붙은 메서드가 호출됩니다.
// proceed 로 원래 메서드 실행해준 후
// return result;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// api 에서 endpoint /bye 주소로 접속했을 때
// 실행 종료 가 restController로 나올 수 있도록 설정
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Bye {
}
