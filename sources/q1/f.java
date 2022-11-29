package q1;

/* loaded from: classes.dex */
public interface f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f48569a = a.f48570a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f48570a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final f f48571b = new C0731a();

        /* renamed from: c  reason: collision with root package name */
        public static final f f48572c = new e();

        /* renamed from: d  reason: collision with root package name */
        public static final f f48573d = new c();

        /* renamed from: e  reason: collision with root package name */
        public static final f f48574e = new d();

        /* renamed from: f  reason: collision with root package name */
        public static final f f48575f = new C0732f();

        /* renamed from: g  reason: collision with root package name */
        public static final i f48576g = new i(1.0f);

        /* renamed from: h  reason: collision with root package name */
        public static final f f48577h = new b();

        /* renamed from: q1.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0731a implements f {
            @Override // q1.f
            public long a(long j10, long j11) {
                float f10;
                f10 = g.f(j10, j11);
                return w0.a(f10, f10);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements f {
            @Override // q1.f
            public long a(long j10, long j11) {
                float h10;
                float e10;
                h10 = g.h(j10, j11);
                e10 = g.e(j10, j11);
                return w0.a(h10, e10);
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements f {
            @Override // q1.f
            public long a(long j10, long j11) {
                float e10;
                e10 = g.e(j10, j11);
                return w0.a(e10, e10);
            }
        }

        /* loaded from: classes.dex */
        public static final class d implements f {
            @Override // q1.f
            public long a(long j10, long j11) {
                float h10;
                h10 = g.h(j10, j11);
                return w0.a(h10, h10);
            }
        }

        /* loaded from: classes.dex */
        public static final class e implements f {
            @Override // q1.f
            public long a(long j10, long j11) {
                float g10;
                g10 = g.g(j10, j11);
                return w0.a(g10, g10);
            }
        }

        /* renamed from: q1.f$a$f  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0732f implements f {
            @Override // q1.f
            public long a(long j10, long j11) {
                float g10;
                if (b1.l.i(j10) > b1.l.i(j11) || b1.l.g(j10) > b1.l.g(j11)) {
                    g10 = g.g(j10, j11);
                    return w0.a(g10, g10);
                }
                return w0.a(1.0f, 1.0f);
            }
        }

        public final f a() {
            return f48571b;
        }

        public final f b() {
            return f48577h;
        }

        public final f c() {
            return f48574e;
        }

        public final f d() {
            return f48572c;
        }

        public final f e() {
            return f48575f;
        }
    }

    long a(long j10, long j11);
}
