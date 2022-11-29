package po;

/* loaded from: classes4.dex */
public final class l extends j implements f<Long> {
    public static final a A = new a(null);
    public static final l B = new l(1, 0);

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public l(long j10, long j11) {
        super(j10, j11, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (k() != lVar.k() || m() != lVar.m()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (k() ^ (k() >>> 32))) + (m() ^ (m() >>> 32)));
    }

    @Override // po.f
    public boolean isEmpty() {
        return k() > m();
    }

    public boolean r(long j10) {
        return k() <= j10 && j10 <= m();
    }

    @Override // po.f
    /* renamed from: s */
    public Long j() {
        return Long.valueOf(m());
    }

    @Override // po.f
    /* renamed from: t */
    public Long d() {
        return Long.valueOf(k());
    }

    public String toString() {
        return k() + ".." + m();
    }
}
