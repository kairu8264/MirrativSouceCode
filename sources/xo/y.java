package xo;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final zo.k0 f60631a = new zo.k0("NO_VALUE");

    public static final <T> r<T> a(int i10, int i11, wo.h hVar) {
        boolean z10 = true;
        if (i10 >= 0) {
            if (i11 >= 0) {
                if (i10 <= 0 && i11 <= 0 && hVar != wo.h.SUSPEND) {
                    z10 = false;
                }
                if (z10) {
                    int i12 = i11 + i10;
                    if (i12 < 0) {
                        i12 = Integer.MAX_VALUE;
                    }
                    return new x(i10, i12, hVar);
                }
                throw new IllegalArgumentException(jo.p.o("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", hVar).toString());
            }
            throw new IllegalArgumentException(jo.p.o("extraBufferCapacity cannot be negative, but was ", Integer.valueOf(i11)).toString());
        }
        throw new IllegalArgumentException(jo.p.o("replay cannot be negative, but was ", Integer.valueOf(i10)).toString());
    }

    public static /* synthetic */ r b(int i10, int i11, wo.h hVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            hVar = wo.h.SUSPEND;
        }
        return a(i10, i11, hVar);
    }

    public static final <T> c<T> e(w<? extends T> wVar, ao.g gVar, int i10, wo.h hVar) {
        return ((i10 == 0 || i10 == -3) && hVar == wo.h.SUSPEND) ? wVar : new yo.g(wVar, gVar, i10, hVar);
    }

    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
