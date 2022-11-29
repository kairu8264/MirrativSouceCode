package yo;

/* loaded from: classes4.dex */
public final class g<T> extends f<T, T> {
    public /* synthetic */ g(xo.c cVar, ao.g gVar, int i10, wo.h hVar, int i11, jo.h hVar2) {
        this(cVar, (i11 & 2) != 0 ? ao.h.f16651w : gVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? wo.h.SUSPEND : hVar);
    }

    @Override // yo.d
    public d<T> j(ao.g gVar, int i10, wo.h hVar) {
        return new g(this.f62091z, gVar, i10, hVar);
    }

    @Override // yo.d
    public xo.c<T> k() {
        return (xo.c<T>) this.f62091z;
    }

    @Override // yo.f
    public Object r(xo.d<? super T> dVar, ao.d<? super wn.v> dVar2) {
        Object a10 = this.f62091z.a(dVar, dVar2);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }

    public g(xo.c<? extends T> cVar, ao.g gVar, int i10, wo.h hVar) {
        super(cVar, gVar, i10, hVar);
    }
}
