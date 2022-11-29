package androidx.lifecycle;

import androidx.lifecycle.o;

/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    public static final Object a(o oVar, o.c cVar, io.p<? super uo.q0, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super wn.v> dVar) {
        if (cVar != o.c.INITIALIZED) {
            if (oVar.b() == o.c.DESTROYED) {
                return wn.v.f59242a;
            }
            Object e10 = uo.r0.e(new RepeatOnLifecycleKt$repeatOnLifecycle$3(oVar, cVar, pVar, null), dVar);
            return e10 == bo.c.c() ? e10 : wn.v.f59242a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    public static final Object b(u uVar, o.c cVar, io.p<? super uo.q0, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super wn.v> dVar) {
        o g10 = uVar.g();
        jo.p.g(g10, "lifecycle");
        Object a10 = a(g10, cVar, pVar, dVar);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }
}
