package to;

/* loaded from: classes4.dex */
public interface h {

    /* loaded from: classes4.dex */
    public static final class a implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final a f53895a = new a();

        /* renamed from: to.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0843a implements g {

            /* renamed from: a  reason: collision with root package name */
            public final long f53896a;

            public /* synthetic */ C0843a(long j10) {
                this.f53896a = j10;
            }

            public static final /* synthetic */ C0843a a(long j10) {
                return new C0843a(j10);
            }

            public static long b(long j10) {
                return j10;
            }

            public static boolean c(long j10, Object obj) {
                return (obj instanceof C0843a) && j10 == ((C0843a) obj).f();
            }

            public static int d(long j10) {
                return (int) (j10 ^ (j10 >>> 32));
            }

            public static String e(long j10) {
                return "ValueTimeMark(reading=" + j10 + ')';
            }

            public boolean equals(Object obj) {
                return c(this.f53896a, obj);
            }

            public final /* synthetic */ long f() {
                return this.f53896a;
            }

            public int hashCode() {
                return d(this.f53896a);
            }

            public String toString() {
                return e(this.f53896a);
            }
        }

        @Override // to.h
        public /* bridge */ /* synthetic */ g a() {
            return C0843a.a(b());
        }

        public long b() {
            return f.f53893a.b();
        }

        public String toString() {
            return f.f53893a.toString();
        }
    }

    g a();
}
