package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.example.service.MessageService.mesajVer(..))")
    public void mesajVerMethodundanOnce(JoinPoint joinPoint){ //o anki statei yakala

        System.out.println("Mesaj ver methodundan once parametre yakalandı param: "+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());

    }

    @After("execution(* com.example.service.*.*(..))") //herhangi class herhangi method
    public void mesajVerMethodundanSonra(JoinPoint joinPoint){

        System.out.println("Mesaj ver metodundan sonra parametre yakalandi param: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());

    }
}
