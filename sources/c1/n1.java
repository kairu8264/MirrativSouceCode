package c1;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18729b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f18730c = o1.a(0.5f, 0.5f);

    /* renamed from: a  reason: collision with root package name */
    public final long f18731a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final long a() {
            return n1.f18730c;
        }
    }

    public /* synthetic */ n1(long j10) {
        this.f18731a = j10;
    }

    public static final /* synthetic */ n1 b(long j10) {
        return new n1(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof n1) && j10 == ((n1) obj).j();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final float f(long j10) {
        jo.i iVar = jo.i.f38148a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float g(long j10) {
        jo.i iVar = jo.i.f38148a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f18731a, obj);
    }

    public int hashCode() {
        return h(this.f18731a);
    }

    public final /* synthetic */ long j() {
        return this.f18731a;
    }

    public String toString() {
        return i(this.f18731a);
    }
}
