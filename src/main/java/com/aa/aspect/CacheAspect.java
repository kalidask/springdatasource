package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import com.aa.util.Cache;
import com.aa.util.KeyUtil;

public class CacheAspect {
	private Cache cache;

	public Object cache(ProceedingJoinPoint pjp, int x, int y) throws Throwable {
		String methodName = null;
		Object[] args = null;
		String key = null;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();
		key = KeyUtil.getKey(methodName, args);

		if (cache.containsKey(key)) {
			return cache.get(key);
		}
		Object ret = pjp.proceed();
		cache.put(key, ret);
		return ret;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

}
