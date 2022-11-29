package po;

/* loaded from: classes4.dex */
public final class i extends g implements f<Integer> {
    public static final a A = new a(null);
    public static final i B = new i(1, 0);

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a() {
            return i.B;
        }
    }

    public i(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // po.g
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (k() != iVar.k() || m() != iVar.m()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // po.g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (k() * 31) + m();
    }

    @Override // po.g, po.f
    public boolean isEmpty() {
        return k() > m();
    }

    public boolean t(int i10) {
        return k() <= i10 && i10 <= m();
    }

    @Override // po.g
    public String toString() {
        return k() + ".." + m();
    }

    @Override // po.f
    /* renamed from: u */
    public Integer j() {
        return Integer.valueOf(m());
    }

    @Override // po.f
    /* renamed from: w */
    public Integer d() {
        return Integer.valueOf(k());
    }
}
