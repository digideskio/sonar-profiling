package org.sonar.profiling.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.sonar.profiling.Profiler;
import org.sonar.profiling.Profilers;

@Aspect
public class Aspects {
    Profiler profiler;
    
    @Around(value = "execution(@org.sonar.profiling.aspects.Profiled * * (..))")
    public Object aroundProfiled(ProceedingJoinPoint joinPoint) throws Throwable {
      Profiler profiler = Profilers.start(joinPoint.toShortString());
      Object ret;
      try {
        ret = joinPoint.proceed();
      } finally {
        profiler.stop();
      }
      
      return ret;
    }
}
