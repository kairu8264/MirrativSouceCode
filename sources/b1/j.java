package b1;

import jo.p;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: i  reason: collision with root package name */
    public static final a f16732i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final j f16733j = k.c(0.0f, 0.0f, 0.0f, 0.0f, b1.a.f16715a.a());

    /* renamed from: a  reason: collision with root package name */
    public final float f16734a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16735b;

    /* renamed from: c  reason: collision with root package name */
    public final float f16736c;

    /* renamed from: d  reason: collision with root package name */
    public final float f16737d;

    /* renamed from: e  reason: collision with root package name */
    public final long f16738e;

    /* renamed from: f  reason: collision with root package name */
    public final long f16739f;

    /* renamed from: g  reason: collision with root package name */
    public final long f16740g;

    /* renamed from: h  reason: collision with root package name */
    public final long f16741h;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public j(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f16734a = f10;
        this.f16735b = f11;
        this.f16736c = f12;
        this.f16737d = f13;
        this.f16738e = j10;
        this.f16739f = j11;
        this.f16740g = j12;
        this.f16741h = j13;
    }

    public /* synthetic */ j(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, jo.h hVar) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    public final float a() {
        return this.f16737d;
    }

    public final long b() {
        return this.f16741h;
    }

    public final long c() {
        return this.f16740g;
    }

    public final float d() {
        return this.f16737d - this.f16735b;
    }

    public final float e() {
        return this.f16734a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return p.c(Float.valueOf(this.f16734a), Float.valueOf(jVar.f16734a)) && p.c(Float.valueOf(this.f16735b), Float.valueOf(jVar.f16735b)) && p.c(Float.valueOf(this.f16736c), Float.valueOf(jVar.f16736c)) && p.c(Float.valueOf(this.f16737d), Float.valueOf(jVar.f16737d)) && b1.a.c(this.f16738e, jVar.f16738e) && b1.a.c(this.f16739f, jVar.f16739f) && b1.a.c(this.f16740g, jVar.f16740g) && b1.a.c(this.f16741h, jVar.f16741h);
        }
        return false;
    }

    public final float f() {
        return this.f16736c;
    }

    public final float g() {
        return this.f16735b;
    }

    public final long h() {
        return this.f16738e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f16734a) * 31) + Float.hashCode(this.f16735b)) * 31) + Float.hashCode(this.f16736c)) * 31) + Float.hashCode(this.f16737d)) * 31) + b1.a.f(this.f16738e)) * 31) + b1.a.f(this.f16739f)) * 31) + b1.a.f(this.f16740g)) * 31) + b1.a.f(this.f16741h);
    }

    public final long i() {
        return this.f16739f;
    }

    public final float j() {
        return this.f16736c - this.f16734a;
    }

    public String toString() {
        long j10 = this.f16738e;
        long j11 = this.f16739f;
        long j12 = this.f16740g;
        long j13 = this.f16741h;
        String str = c.a(this.f16734a, 1) + ", " + c.a(this.f16735b, 1) + ", " + c.a(this.f16736c, 1) + ", " + c.a(this.f16737d, 1);
        if (b1.a.c(j10, j11) && b1.a.c(j11, j12) && b1.a.c(j12, j13)) {
            if (b1.a.d(j10) == b1.a.e(j10)) {
                return "RoundRect(rect=" + str + ", radius=" + c.a(b1.a.d(j10), 1) + ')';
            }
            return "RoundRect(rect=" + str + ", x=" + c.a(b1.a.d(j10), 1) + ", y=" + c.a(b1.a.e(j10), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) b1.a.g(j10)) + ", topRight=" + ((Object) b1.a.g(j11)) + ", bottomRight=" + ((Object) b1.a.g(j12)) + ", bottomLeft=" + ((Object) b1.a.g(j13)) + ')';
    }
}
