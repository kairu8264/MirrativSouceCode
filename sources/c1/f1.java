package c1;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f18663d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final f1 f18664e = new f1(0, 0, 0.0f, 7, null);

    /* renamed from: a  reason: collision with root package name */
    public final long f18665a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18666b;

    /* renamed from: c  reason: collision with root package name */
    public final float f18667c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f1 a() {
            return f1.f18664e;
        }
    }

    public f1(long j10, long j11, float f10) {
        this.f18665a = j10;
        this.f18666b = j11;
        this.f18667c = f10;
    }

    public /* synthetic */ f1(long j10, long j11, float f10, jo.h hVar) {
        this(j10, j11, f10);
    }

    public final float b() {
        return this.f18667c;
    }

    public final long c() {
        return this.f18665a;
    }

    public final long d() {
        return this.f18666b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (c0.m(this.f18665a, f1Var.f18665a) && b1.f.j(this.f18666b, f1Var.f18666b)) {
                return (this.f18667c > f1Var.f18667c ? 1 : (this.f18667c == f1Var.f18667c ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((c0.s(this.f18665a) * 31) + b1.f.o(this.f18666b)) * 31) + Float.hashCode(this.f18667c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) c0.t(this.f18665a)) + ", offset=" + ((Object) b1.f.t(this.f18666b)) + ", blurRadius=" + this.f18667c + ')';
    }

    public /* synthetic */ f1(long j10, long j11, float f10, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? e0.c(4278190080L) : j10, (i10 & 2) != 0 ? b1.f.f16721b.c() : j11, (i10 & 4) != 0 ? 0.0f : f10, null);
    }
}
