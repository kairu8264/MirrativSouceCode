package aa;

import io.p;
import jo.q;
import v.w;
import wn.v;
import y.d1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f661a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static p<l0.i, Integer, v> f662b = s0.c.c(1978464097, false, C0010a.f663w);

    /* renamed from: aa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0010a extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0010a f663w = new C0010a();

        public C0010a() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            w.a(v1.e.c(q9.f.f48825y, iVar, 0), null, d1.u(x0.f.f59359u, m2.g.l(22)), null, null, 0.0f, null, iVar, 440, 120);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final p<l0.i, Integer, v> a() {
        return f662b;
    }
}
