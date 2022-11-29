package jd;

import h0.w1;
import wn.v;
import x0.f;
import y.d1;
import y.g1;
import y.r0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37593a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static io.q<z.h, l0.i, Integer, v> f37594b = s0.c.c(-2130359965, false, C0509a.f37595w);

    /* renamed from: jd.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0509a extends jo.q implements io.q<z.h, l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0509a f37595w = new C0509a();

        public C0509a() {
            super(3);
        }

        public final void a(z.h hVar, l0.i iVar, int i10) {
            jo.p.h(hVar, "$this$item");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
                return;
            }
            f.a aVar = x0.f.f59359u;
            g1.a(d1.o(aVar, m2.g.l(30)), iVar, 6);
            String b10 = v1.f.b(nc.i.text_profile_ribbon_not_exists, iVar, 0);
            x0.f i11 = r0.i(d1.n(aVar, 0.0f, 1, null), m2.g.l(16));
            int a10 = j2.e.f37075b.a();
            w1.c(b10, i11, v1.b.a(nc.b.f41802v, iVar, 0), 0L, null, null, null, 0L, null, j2.e.g(a10), 0L, 0, false, 0, null, o9.b.f44283a.b().p(), iVar, 48, 0, 32248);
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(z.h hVar, l0.i iVar, Integer num) {
            a(hVar, iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final io.q<z.h, l0.i, Integer, v> a() {
        return f37594b;
    }
}
