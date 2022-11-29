package hd;

import h0.w1;
import io.q;
import wn.v;
import y.z0;
import y1.d0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f35359a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static q<z0, l0.i, Integer, v> f35360b = s0.c.c(1833949074, false, a.f35361w);

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements q<z0, l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f35361w = new a();

        public a() {
            super(3);
        }

        public final void a(z0 z0Var, l0.i iVar, int i10) {
            jo.p.h(z0Var, "$this$Button");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
            } else {
                w1.c(v1.f.b(nc.i.E4, iVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, o9.b.f44283a.b().b().C(new d0(v1.b.a(nc.b.F, iVar, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null)), iVar, 0, 0, 32766);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(z0 z0Var, l0.i iVar, Integer num) {
            a(z0Var, iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final q<z0, l0.i, Integer, v> a() {
        return f35360b;
    }
}
