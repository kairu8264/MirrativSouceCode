package g0;

import f0.t0;
import java.util.List;

/* loaded from: classes.dex */
public final class t extends b<t> {

    /* renamed from: i  reason: collision with root package name */
    public final e2.a0 f32279i;

    /* renamed from: j  reason: collision with root package name */
    public final t0 f32280j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(e2.a0 a0Var, e2.t tVar, t0 t0Var, y yVar) {
        super(a0Var.e(), a0Var.g(), t0Var != null ? t0Var.i() : null, tVar, yVar, null);
        jo.p.h(a0Var, "currentValue");
        jo.p.h(tVar, "offsetMapping");
        jo.p.h(yVar, "state");
        this.f32279i = a0Var;
        this.f32280j = t0Var;
    }

    public final List<e2.d> a0(io.l<? super t, ? extends e2.d> lVar) {
        jo.p.h(lVar, "or");
        if (y1.b0.h(w())) {
            e2.d invoke = lVar.invoke(this);
            if (invoke != null) {
                return xn.r.d(invoke);
            }
            return null;
        }
        return xn.s.m(new e2.a("", 0), new e2.z(y1.b0.l(w()), y1.b0.l(w())));
    }

    public final e2.a0 b0() {
        return e2.a0.d(this.f32279i, e(), w(), null, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c0(f0.t0 r6, int r7) {
        /*
            r5 = this;
            q1.q r0 = r6.c()
            if (r0 == 0) goto L15
            q1.q r1 = r6.b()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            b1.h r2 = q1.q.o(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1b
        L15:
            b1.h$a r0 = b1.h.f16726e
            b1.h r2 = r0.a()
        L1b:
            e2.t r0 = r5.p()
            e2.a0 r1 = r5.f32279i
            long r3 = r1.g()
            int r1 = y1.b0.i(r3)
            int r0 = r0.b(r1)
            y1.z r1 = r6.i()
            b1.h r0 = r1.d(r0)
            float r1 = r0.i()
            float r0 = r0.l()
            long r2 = r2.k()
            float r2 = b1.l.g(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            e2.t r7 = r5.p()
            y1.z r6 = r6.i()
            long r0 = b1.g.a(r1, r0)
            int r6 = r6.w(r0)
            int r6 = r7.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.t.c0(f0.t0, int):int");
    }

    public final t d0() {
        t0 t0Var;
        if ((y().length() > 0) && (t0Var = this.f32280j) != null) {
            V(c0(t0Var, 1));
        }
        return this;
    }

    public final t e0() {
        t0 t0Var;
        if ((y().length() > 0) && (t0Var = this.f32280j) != null) {
            V(c0(t0Var, -1));
        }
        return this;
    }
}
