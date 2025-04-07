package kh.edu.jspexam.controller;
/*
AOP annotation 생성한 후에 빌드 작업을 해주지 않으면
스스로 import 해서 가져오는 폴더 위치를 직접 작성해야함
ctrl + f9 를 눌러 빌드 작업을 진행한 다음에
@interface 로 만든 어노테이션을 호출해서 사용하면
import 를 직접적으로 작성하지 않아도 무사히 사용됨
* */
import kh.edu.jspexam.annotation.Bye;
import kh.edu.jspexam.annotation.hi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {


    @hi
    @Bye
    @GetMapping("/hello")
    public String hello() {
        System.out.println(" @hi 어노테이션 실행 확인 중 ");
        return "hello , AOP !!! ";
    }

    @hi
    @Bye
    @GetMapping("/bye")
    public String bye() {
        System.out.println("@bye 어노테이션 실행 확인 중");
        return "bye , AOP !!! ";
    }
}
