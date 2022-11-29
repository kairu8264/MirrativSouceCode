package o1;

import b1.f;
import jo.p;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f43808e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final f f43809f;

    /* renamed from: a  reason: collision with root package name */
    public final long f43810a;

    /* renamed from: b  reason: collision with root package name */
    public final float f43811b;

    /* renamed from: c  reason: collision with root package name */
    public final long f43812c;

    /* renamed from: d  reason: collision with root package name */
    public final long f43813d;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f a() {
            return f.f43809f;
        }
    }

    static {
        f.a aVar = b1.f.f16721b;
        f43809f = new f(aVar.c(), 1.0f, 0L, aVar.c(), null);
    }

    public f(long j10, float f10, long j11, long j12) {
        this.f43810a = j10;
        this.f43811b = f10;
        this.f43812c = j11;
        this.f43813d = j12;
    }

    public /* synthetic */ f(long j10, float f10, long j11, long j12, jo.h hVar) {
        this(j10, f10, j11, j12);
    }

    public final long b() {
        return this.f43810a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return b1.f.j(this.f43810a, fVar.f43810a) && p.c(Float.valueOf(this.f43811b), Float.valueOf(fVar.f43811b)) && this.f43812c == fVar.f43812c && b1.f.j(this.f43813d, fVar.f43813d);
        }
        return false;
    }

    public int hashCode() {
        return (((((b1.f.o(this.f43810a) * 31) + Float.hashCode(this.f43811b)) * 31) + Long.hashCode(this.f43812c)) * 31) + b1.f.o(this.f43813d);
    }

    public String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + ((Object) b1.f.t(this.f43810a)) + ", confidence=" + this.f43811b + ", durationMillis=" + this.f43812c + ", offset=" + ((Object) b1.f.t(this.f43813d)) + ')';
    }
}
