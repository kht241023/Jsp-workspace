package kh.edu.jspexam.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ByeAspect {
        // 생성한 어노테이션을 호출할 때는 아래와 같이 작성해주는 것이 정석
    @Around("@annotation(kh.edu.jspexam.annotation.Bye)")
    public Object byeAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("byte 종료 어노테이션이 붙은 메서드가 호출됩니다.");

        Object result = pjp.proceed();
        System.out.println(" 메서드 실행 완료 : " + pjp.getSignature().getName());
        return result;
    }
}
