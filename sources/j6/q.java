package j6;

import java.util.Map;
import xn.n0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37236b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final q f37237c = new q(n0.e());

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f37238a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q a(Map<Class<?>, ? extends Object> map) {
            return new q(o6.c.b(map), null);
        }
    }

    public q(Map<Class<?>, ? extends Object> map) {
        this.f37238a = map;
    }

    public /* synthetic */ q(Map map, jo.h hVar) {
        this(map);
    }

    public final Map<Class<?>, Object> a() {
        return this.f37238a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && jo.p.c(this.f37238a, ((q) obj).f37238a);
    }

    public int hashCode() {
        return this.f37238a.hashCode();
    }

    public String toString() {
        return "Tags(tags=" + this.f37238a + ')';
    }
}
