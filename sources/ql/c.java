package ql;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f49569a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Object> f49570b;

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f49571a;

        /* renamed from: b  reason: collision with root package name */
        public Map<Class<?>, Object> f49572b = null;

        public b(String str) {
            this.f49571a = str;
        }

        public c a() {
            Map unmodifiableMap;
            String str = this.f49571a;
            if (this.f49572b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f49572b));
            }
            return new c(str, unmodifiableMap);
        }

        public <T extends Annotation> b b(T t10) {
            if (this.f49572b == null) {
                this.f49572b = new HashMap();
            }
            this.f49572b.put(t10.annotationType(), t10);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f49569a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f49570b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f49569a.equals(cVar.f49569a) && this.f49570b.equals(cVar.f49570b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f49569a.hashCode() * 31) + this.f49570b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f49569a + ", properties=" + this.f49570b.values() + "}";
    }

    public c(String str, Map<Class<?>, Object> map) {
        this.f49569a = str;
        this.f49570b = map;
    }
}
