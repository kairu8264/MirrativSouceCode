package zo;

import uo.d2;

/* loaded from: classes4.dex */
public class g0<T> extends uo.a<T> implements co.e {

    /* renamed from: y  reason: collision with root package name */
    public final ao.d<T> f63289y;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(ao.g gVar, ao.d<? super T> dVar) {
        super(gVar, true, true);
        this.f63289y = dVar;
    }

    @Override // uo.k2
    public void H(Object obj) {
        l.c(bo.b.b(this.f63289y), uo.g0.a(obj, this.f63289y), null, 2, null);
    }

    @Override // uo.a
    public void V0(Object obj) {
        ao.d<T> dVar = this.f63289y;
        dVar.resumeWith(uo.g0.a(obj, dVar));
    }

    public final d2 Z0() {
        uo.v m02 = m0();
        if (m02 == null) {
            return null;
        }
        return m02.getParent();
    }

    @Override // co.e
    public final co.e getCallerFrame() {
        ao.d<T> dVar = this.f63289y;
        if (dVar instanceof co.e) {
            return (co.e) dVar;
        }
        return null;
    }

    @Override // co.e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // uo.k2
    public final boolean r0() {
        return true;
    }
}
