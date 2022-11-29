package q1;

/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public interface a {
        boolean a();
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f48551a = new a(null);

        /* renamed from: b  reason: collision with root package name */
        public static final int f48552b = g(1);

        /* renamed from: c  reason: collision with root package name */
        public static final int f48553c = g(2);

        /* renamed from: d  reason: collision with root package name */
        public static final int f48554d = g(3);

        /* renamed from: e  reason: collision with root package name */
        public static final int f48555e = g(4);

        /* renamed from: f  reason: collision with root package name */
        public static final int f48556f = g(5);

        /* renamed from: g  reason: collision with root package name */
        public static final int f48557g = g(6);

        /* loaded from: classes.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(jo.h hVar) {
                this();
            }

            public final int a() {
                return b.f48556f;
            }

            public final int b() {
                return b.f48553c;
            }

            public final int c() {
                return b.f48552b;
            }

            public final int d() {
                return b.f48557g;
            }

            public final int e() {
                return b.f48554d;
            }

            public final int f() {
                return b.f48555e;
            }
        }

        public static int g(int i10) {
            return i10;
        }

        public static final boolean h(int i10, int i11) {
            return i10 == i11;
        }
    }

    <T> T a(int i10, io.l<? super a, ? extends T> lVar);
}
