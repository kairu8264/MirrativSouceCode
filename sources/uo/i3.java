package uo;

/* loaded from: classes4.dex */
public final class i3<T> extends zo.g0<T> {

    /* renamed from: z  reason: collision with root package name */
    public ThreadLocal<wn.k<ao.g, Object>> f56030z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i3(ao.g r3, ao.d<? super T> r4) {
        /*
            r2 = this;
            uo.j3 r0 = uo.j3.f56037w
            ao.g$b r1 = r3.get(r0)
            if (r1 != 0) goto Lc
            ao.g r3 = r3.plus(r0)
        Lc:
            r2.<init>(r3, r4)
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r2.f56030z = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.i3.<init>(ao.g, ao.d):void");
    }

    @Override // zo.g0, uo.a
    public void V0(Object obj) {
        wn.k<ao.g, Object> kVar = this.f56030z.get();
        if (kVar != null) {
            zo.o0.a(kVar.a(), kVar.b());
            this.f56030z.set(null);
        }
        Object a10 = g0.a(obj, this.f63289y);
        ao.d<T> dVar = this.f63289y;
        ao.g context = dVar.getContext();
        Object c10 = zo.o0.c(context, null);
        i3<?> g10 = c10 != zo.o0.f63311a ? j0.g(dVar, context, c10) : null;
        try {
            this.f63289y.resumeWith(a10);
            wn.v vVar = wn.v.f59242a;
        } finally {
            if (g10 == null || g10.a1()) {
                zo.o0.a(context, c10);
            }
        }
    }

    public final boolean a1() {
        if (this.f56030z.get() == null) {
            return false;
        }
        this.f56030z.set(null);
        return true;
    }

    public final void b1(ao.g gVar, Object obj) {
        this.f56030z.set(wn.q.a(gVar, obj));
    }
}
