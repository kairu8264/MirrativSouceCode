package d1;

import jo.f0;
import jo.p;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f28959d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f28960a;

    /* renamed from: b  reason: collision with root package name */
    public final long f28961b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28962c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public c(String str, long j10, int i10) {
        this.f28960a = str;
        this.f28961b = j10;
        this.f28962c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public /* synthetic */ c(String str, long j10, int i10, jo.h hVar) {
        this(str, j10, i10);
    }

    public abstract float[] a(float[] fArr);

    public final int b() {
        return b.f(this.f28961b);
    }

    public final int c() {
        return this.f28962c;
    }

    public abstract float d(int i10);

    public abstract float e(int i10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.c(f0.b(getClass()), f0.b(obj.getClass()))) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f28962c == cVar.f28962c && p.c(this.f28960a, cVar.f28960a)) {
            return b.e(this.f28961b, cVar.f28961b);
        }
        return false;
    }

    public final long f() {
        return this.f28961b;
    }

    public final String g() {
        return this.f28960a;
    }

    public boolean h() {
        return false;
    }

    public int hashCode() {
        return (((this.f28960a.hashCode() * 31) + b.g(this.f28961b)) * 31) + this.f28962c;
    }

    public abstract float[] i(float[] fArr);

    public String toString() {
        return this.f28960a + " (id=" + this.f28962c + ", model=" + ((Object) b.h(this.f28961b)) + ')';
    }
}
