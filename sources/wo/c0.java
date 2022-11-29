package wo;

import uo.u0;
import uo.v0;
import wn.l;
import zo.k0;
import zo.u;

/* loaded from: classes4.dex */
public class c0<E> extends a0 {
    public final uo.p<wn.v> A;

    /* renamed from: z  reason: collision with root package name */
    public final E f59270z;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(E e10, uo.p<? super wn.v> pVar) {
        this.f59270z = e10;
        this.A = pVar;
    }

    @Override // wo.a0
    public void Q() {
        this.A.T(uo.r.f56081a);
    }

    @Override // wo.a0
    public E S() {
        return this.f59270z;
    }

    @Override // wo.a0
    public void U(p<?> pVar) {
        uo.p<wn.v> pVar2 = this.A;
        l.a aVar = wn.l.f59224w;
        pVar2.resumeWith(wn.l.a(wn.m.a(pVar.a0())));
    }

    @Override // wo.a0
    public k0 V(u.c cVar) {
        Object d10 = this.A.d(wn.v.f59242a, cVar == null ? null : cVar.f63338c);
        if (d10 == null) {
            return null;
        }
        if (u0.a()) {
            if (!(d10 == uo.r.f56081a)) {
                throw new AssertionError();
            }
        }
        if (cVar != null) {
            cVar.d();
        }
        return uo.r.f56081a;
    }

    @Override // zo.u
    public String toString() {
        return v0.a(this) + '@' + v0.b(this) + '(' + S() + ')';
    }
}
