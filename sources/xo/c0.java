package xo;

/* loaded from: classes4.dex */
public interface c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60480a = a.f60481a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f60481a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final c0 f60482b = new d0();

        /* renamed from: c  reason: collision with root package name */
        public static final c0 f60483c = new e0();

        public static /* synthetic */ c0 b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return aVar.a(j10, j11);
        }

        public final c0 a(long j10, long j11) {
            return new f0(j10, j11);
        }

        public final c0 c() {
            return f60482b;
        }

        public final c0 d() {
            return f60483c;
        }
    }

    c<a0> a(g0<Integer> g0Var);
}
