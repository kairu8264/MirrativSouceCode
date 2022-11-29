package po;

import jo.p;

/* loaded from: classes4.dex */
public final class c extends po.a implements f<Character> {
    public static final a A = new a(null);
    public static final c B = new c(1, 0);

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public c(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (k() != cVar.k() || m() != cVar.m()) {
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
        return (k() * 31) + m();
    }

    @Override // po.f
    public boolean isEmpty() {
        return p.j(k(), m()) > 0;
    }

    public boolean r(char c10) {
        return p.j(k(), c10) <= 0 && p.j(c10, m()) <= 0;
    }

    @Override // po.f
    /* renamed from: s */
    public Character j() {
        return Character.valueOf(m());
    }

    @Override // po.f
    /* renamed from: t */
    public Character d() {
        return Character.valueOf(k());
    }

    public String toString() {
        return k() + ".." + m();
    }
}
