package oa;

import c1.c0;
import h0.p0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f44312a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static io.p<l0.i, Integer, wn.v> f44313b = s0.c.c(1753012792, false, C0661a.f44314w);

    /* renamed from: oa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0661a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0661a f44314w = new C0661a();

        public C0661a() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                p0.a(v1.e.c(ja.k.f37424c, iVar, 0), null, null, c0.f18634b.e(), iVar, 3128, 4);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public final io.p<l0.i, Integer, wn.v> a() {
        return f44313b;
    }
}
