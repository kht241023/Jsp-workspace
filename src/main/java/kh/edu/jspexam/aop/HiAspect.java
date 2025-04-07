package kh.edu.jspexam.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import kh.edu.jspexam.annotation.hi;

/**
@Aspect
            공통 기능을 모아놓은 클래스 ( 예 : 로깅, 트랜잭션, 보안 체크 등)
@Component
            스프링이 HiAspect 클래스를 외부에서 사용하고 인지할 수 있도록 빈(Bean)으로 자동 등록
@Around("@annotation(kh.edu.jspexam.annotation.hi)")
            스프링이 메서드 실행 전 / 후에 동작을 삽입할 수 있도록
            hi 라는 어노테이션이 붙어 있는 모든 기능을 감싸주는 역할
            어디서부터 어디까지가 @hi 기능으로 호출해서 실행하는 공간이다. 범위 설정
ProceedingJoinPoint
            현재 실행 중인 메서드에 대한 정보를 담고있는 객체
            메서드 이름, 파라미터, 반환값, 실행 흐름을 제어할 수 있음
        .proceed()       : 진행하다라는 영어 시작! 을 나타내는 메서드
        .getSignature()  : 실행한 메서드(기능) 이름, 시그니처(정보)를 출력
 */
/*
전체 흐름
1. @hi 어노테이션이 붙은 메서드가 호출되면
2. around 메서드가 실행
3. 메서드 실행 전 로그 출력
4. 원래 메서드 실행 (joinPoint.proceed())
5. 메서드 실행 완료 된 후 실행 정보에 대한 로그 출력
6. 원래 메서드의 반환값을 그대로 반환 한다면 반환하기 까지 완료 !

클라이언트(소비자) 요청   -> AOP (HiAspect.around)
                               ├── 실행 전 로그 출력
                               ├── 원래 메서드 실행(joinPoint.proceed())
                               └── 실행 후 로그 출력
클라이언트(소비자) 응답 전달
* */
@Aspect
@Component
public class HiAspect {
    // @Around("@annotation(hi)") -> hi 어노테이션 호출이 안될 경우 빌드가 되기 전이므로
    // import 대신 직접적으로 hi 어노테이션을 가져오는 위치를 설정
    @Around("@annotation(kh.edu.jspexam.annotation.hi)")
    public Object around(ProceedingJoinPoint joinPoint) throws  Throwable{

        System.out.println("😀 @hi 어노테이션이 붙은 메서드가 호출됩니다.");

        Object result = joinPoint.proceed();
        System.out.println("😁 메서드 실행 완료 : " + joinPoint.getSignature());
        return result;
    }
}
