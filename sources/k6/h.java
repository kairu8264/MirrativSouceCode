package k6;

import jo.p;
import k6.b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f38443c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final h f38444d;

    /* renamed from: a  reason: collision with root package name */
    public final b f38445a;

    /* renamed from: b  reason: collision with root package name */
    public final b f38446b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    static {
        b.a aVar = b.a.f38437a;
        f38444d = new h(aVar, aVar);
    }

    public h(b bVar, b bVar2) {
        this.f38445a = bVar;
        this.f38446b = bVar2;
    }

    public final b a() {
        return this.f38446b;
    }

    public final b b() {
        return this.f38445a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return p.c(this.f38445a, hVar.f38445a) && p.c(this.f38446b, hVar.f38446b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f38445a.hashCode() * 31) + this.f38446b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f38445a + ", height=" + this.f38446b + ')';
    }
}
