package com.aop.ex3.aspect;

import com.aop.ex3.dao.RememberRepository;
import com.aop.ex3.domain.RememberTable;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SaveResultAspect {
    @Autowired
    private RememberRepository rememberRepository;

    /**
     * This advice is executed when a method that matches the @annotation(com.aop.ex3.annotation.Remember) PointCut is intercepted.
     * If the result is not already inserted in the remember table, then it will be inserted.
     * */
    @AfterReturning(value = "@annotation(com.aop.ex3.annotation.Remember)", returning = "result")
    public void afterReturningAdvice(JoinPoint joinPoint, Object result) {
        if (!rememberRepository.existsByResult(result.toString())) {
            rememberRepository.save(new RememberTable(result.toString()));
        }
    }
}
