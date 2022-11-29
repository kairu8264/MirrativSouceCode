package gd;

import c1.c0;
import h0.w1;
import io.q;
import jo.p;
import wn.v;
import y.z0;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f33241a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static q<z0, l0.i, Integer, v> f33242b = s0.c.c(1512914373, false, a.f33243w);

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements q<z0, l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f33243w = new a();

        public a() {
            super(3);
        }

        public final void a(z0 z0Var, l0.i iVar, int i10) {
            p.h(z0Var, "$this$Button");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
            } else {
                w1.c(v1.f.b(nc.i.text_purchase_coin, iVar, 0), null, c0.f18634b.f(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 384, 0, 65530);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(z0 z0Var, l0.i iVar, Integer num) {
            a(z0Var, iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final q<z0, l0.i, Integer, v> a() {
        return f33242b;
    }
}
