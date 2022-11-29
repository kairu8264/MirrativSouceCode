package xn;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes4.dex */
public class s0 {
    public static final <T> Set<T> a(T t10) {
        Set<T> singleton = Collections.singleton(t10);
        jo.p.g(singleton, "singleton(element)");
        return singleton;
    }
}
