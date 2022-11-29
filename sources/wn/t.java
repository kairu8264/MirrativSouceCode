package wn;

/* loaded from: classes4.dex */
public final class t implements Comparable<t> {

    /* renamed from: x  reason: collision with root package name */
    public static final a f59239x = new a(null);

    /* renamed from: w  reason: collision with root package name */
    public final long f59240w;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public /* synthetic */ t(long j10) {
        this.f59240w = j10;
    }

    public static final /* synthetic */ t a(long j10) {
        return new t(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof t) && j10 == ((t) obj).l();
    }

    public static int h(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static String i(long j10) {
        return x.c(j10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(t tVar) {
        return x.a(l(), tVar.l());
    }

    public boolean equals(Object obj) {
        return e(this.f59240w, obj);
    }

    public int hashCode() {
        return h(this.f59240w);
    }

    public final /* synthetic */ long l() {
        return this.f59240w;
    }

    public String toString() {
        return i(this.f59240w);
    }
}
