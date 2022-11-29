package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f20095a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class<?>, Object> f20096a = new HashMap();

        public f b() {
            return new f(this);
        }
    }

    public f(a aVar) {
        this.f20095a = Collections.unmodifiableMap(new HashMap(aVar.f20096a));
    }

    public boolean a(Class<Object> cls) {
        return this.f20095a.containsKey(cls);
    }
}
