package v;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import java.util.List;
import l0.u1;
import l0.z1;
import x0.f;

/* loaded from: classes.dex */
public final class a implements i0 {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f56106a;

    /* renamed from: b  reason: collision with root package name */
    public final EdgeEffect f56107b;

    /* renamed from: c  reason: collision with root package name */
    public final EdgeEffect f56108c;

    /* renamed from: d  reason: collision with root package name */
    public final EdgeEffect f56109d;

    /* renamed from: e  reason: collision with root package name */
    public final EdgeEffect f56110e;

    /* renamed from: f  reason: collision with root package name */
    public final List<EdgeEffect> f56111f;

    /* renamed from: g  reason: collision with root package name */
    public final EdgeEffect f56112g;

    /* renamed from: h  reason: collision with root package name */
    public final EdgeEffect f56113h;

    /* renamed from: i  reason: collision with root package name */
    public final EdgeEffect f56114i;

    /* renamed from: j  reason: collision with root package name */
    public final EdgeEffect f56115j;

    /* renamed from: k  reason: collision with root package name */
    public final l0.s0<wn.v> f56116k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f56117l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f56118m;

    /* renamed from: n  reason: collision with root package name */
    public long f56119n;

    /* renamed from: o  reason: collision with root package name */
    public final l0.s0<Boolean> f56120o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f56121p;

    /* renamed from: q  reason: collision with root package name */
    public final io.l<m2.o, wn.v> f56122q;

    /* renamed from: r  reason: collision with root package name */
    public final x0.f f56123r;

    /* renamed from: v.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0881a extends jo.q implements io.l<m2.o, wn.v> {
        public C0881a() {
            super(1);
        }

        public final void a(long j10) {
            boolean z10 = !b1.l.f(m2.p.b(j10), a.this.f56119n);
            a.this.f56119n = m2.p.b(j10);
            if (z10) {
                a.this.f56107b.setSize(m2.o.g(j10), m2.o.f(j10));
                a.this.f56108c.setSize(m2.o.g(j10), m2.o.f(j10));
                a.this.f56109d.setSize(m2.o.f(j10), m2.o.g(j10));
                a.this.f56110e.setSize(m2.o.f(j10), m2.o.g(j10));
                a.this.f56112g.setSize(m2.o.g(j10), m2.o.f(j10));
                a.this.f56113h.setSize(m2.o.g(j10), m2.o.f(j10));
                a.this.f56114i.setSize(m2.o.f(j10), m2.o.g(j10));
                a.this.f56115j.setSize(m2.o.f(j10), m2.o.g(j10));
            }
            if (z10) {
                a.this.y();
                a.this.s();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(m2.o oVar) {
            a(oVar.j());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c1, wn.v> {
        public b() {
            super(1);
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("overscroll");
            c1Var.c(a.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    public a(Context context, g0 g0Var) {
        l0.s0<Boolean> e10;
        x0.f fVar;
        jo.p.h(context, "context");
        jo.p.h(g0Var, "overscrollConfig");
        this.f56106a = g0Var;
        q qVar = q.f56307a;
        EdgeEffect a10 = qVar.a(context, null);
        this.f56107b = a10;
        EdgeEffect a11 = qVar.a(context, null);
        this.f56108c = a11;
        EdgeEffect a12 = qVar.a(context, null);
        this.f56109d = a12;
        EdgeEffect a13 = qVar.a(context, null);
        this.f56110e = a13;
        List<EdgeEffect> m10 = xn.s.m(a12, a10, a13, a11);
        this.f56111f = m10;
        this.f56112g = qVar.a(context, null);
        this.f56113h = qVar.a(context, null);
        this.f56114i = qVar.a(context, null);
        this.f56115j = qVar.a(context, null);
        int size = m10.size();
        for (int i10 = 0; i10 < size; i10++) {
            m10.get(i10).setColor(c1.e0.i(this.f56106a.b()));
        }
        this.f56116k = u1.f(wn.v.f59242a, u1.h());
        this.f56117l = true;
        this.f56119n = b1.l.f16742b.b();
        e10 = z1.e(Boolean.FALSE, null, 2, null);
        this.f56120o = e10;
        C0881a c0881a = new C0881a();
        this.f56122q = c0881a;
        f.a aVar = x0.f.f59359u;
        fVar = v.b.f56128b;
        this.f56123r = q1.n0.a(aVar.L(fVar), c0881a).L(new p(this, a1.c() ? new b() : a1.a()));
    }

    public final float A(long j10, long j11) {
        float n10 = b1.f.n(j11) / b1.l.g(this.f56119n);
        return q.f56307a.d(this.f56109d, b1.f.m(j10) / b1.l.i(this.f56119n), 1 - n10) * b1.l.i(this.f56119n);
    }

    public final float B(long j10, long j11) {
        return (-q.f56307a.d(this.f56110e, -(b1.f.m(j10) / b1.l.i(this.f56119n)), b1.f.n(j11) / b1.l.g(this.f56119n))) * b1.l.i(this.f56119n);
    }

    public final float C(long j10, long j11) {
        float m10 = b1.f.m(j11) / b1.l.i(this.f56119n);
        return q.f56307a.d(this.f56107b, b1.f.n(j10) / b1.l.g(this.f56119n), m10) * b1.l.g(this.f56119n);
    }

    public final boolean D(long j10) {
        boolean z10;
        boolean z11 = false;
        if (this.f56109d.isFinished() || b1.f.m(j10) >= 0.0f) {
            z10 = false;
        } else {
            this.f56109d.onRelease();
            z10 = this.f56109d.isFinished();
        }
        if (!this.f56110e.isFinished() && b1.f.m(j10) > 0.0f) {
            this.f56110e.onRelease();
            z10 = z10 || this.f56110e.isFinished();
        }
        if (!this.f56107b.isFinished() && b1.f.n(j10) < 0.0f) {
            this.f56107b.onRelease();
            z10 = z10 || this.f56107b.isFinished();
        }
        if (this.f56108c.isFinished() || b1.f.n(j10) <= 0.0f) {
            return z10;
        }
        this.f56108c.onRelease();
        if (z10 || this.f56108c.isFinished()) {
            z11 = true;
        }
        return z11;
    }

    public final boolean E() {
        boolean z10;
        long b10 = b1.m.b(this.f56119n);
        q qVar = q.f56307a;
        if (qVar.b(this.f56109d) == 0.0f) {
            z10 = false;
        } else {
            A(b1.f.f16721b.c(), b10);
            z10 = true;
        }
        if (!(qVar.b(this.f56110e) == 0.0f)) {
            B(b1.f.f16721b.c(), b10);
            z10 = true;
        }
        if (!(qVar.b(this.f56107b) == 0.0f)) {
            C(b1.f.f16721b.c(), b10);
            z10 = true;
        }
        if (qVar.b(this.f56108c) == 0.0f) {
            return z10;
        }
        z(b1.f.f16721b.c(), b10);
        return true;
    }

    @Override // v.i0
    public void a(long j10, long j11, b1.f fVar, int i10) {
        boolean z10;
        boolean z11 = true;
        if (m1.f.d(i10, m1.f.f40505a.a())) {
            long u10 = fVar != null ? fVar.u() : b1.m.b(this.f56119n);
            if (b1.f.m(j11) > 0.0f) {
                A(j11, u10);
            } else if (b1.f.m(j11) < 0.0f) {
                B(j11, u10);
            }
            if (b1.f.n(j11) > 0.0f) {
                C(j11, u10);
            } else if (b1.f.n(j11) < 0.0f) {
                z(j11, u10);
            }
            z10 = !b1.f.j(j11, b1.f.f16721b.c());
        } else {
            z10 = false;
        }
        if (!D(j10) && !z10) {
            z11 = false;
        }
        if (z11) {
            y();
        }
    }

    @Override // v.i0
    public Object b(long j10, ao.d<? super wn.v> dVar) {
        this.f56118m = false;
        if (m2.u.h(j10) > 0.0f) {
            q.f56307a.c(this.f56109d, lo.c.c(m2.u.h(j10)));
        } else if (m2.u.h(j10) < 0.0f) {
            q.f56307a.c(this.f56110e, -lo.c.c(m2.u.h(j10)));
        }
        if (m2.u.i(j10) > 0.0f) {
            q.f56307a.c(this.f56107b, lo.c.c(m2.u.i(j10)));
        } else if (m2.u.i(j10) < 0.0f) {
            q.f56307a.c(this.f56108c, -lo.c.c(m2.u.i(j10)));
        }
        if (!m2.u.g(j10, m2.u.f40549b.a())) {
            y();
        }
        s();
        return wn.v.f59242a;
    }

    @Override // v.i0
    public boolean c() {
        List<EdgeEffect> list = this.f56111f;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!(q.f56307a.b(list.get(i10)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    @Override // v.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(long r6, ao.d<? super m2.u> r8) {
        /*
            r5 = this;
            float r8 = m2.u.h(r6)
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r8 <= 0) goto L2e
            v.q r8 = v.q.f56307a
            android.widget.EdgeEffect r3 = r5.f56109d
            float r3 = r8.b(r3)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L19
            r3 = r1
            goto L1a
        L19:
            r3 = r2
        L1a:
            if (r3 != 0) goto L2e
            android.widget.EdgeEffect r3 = r5.f56109d
            float r4 = m2.u.h(r6)
            int r4 = lo.c.c(r4)
            r8.c(r3, r4)
            float r8 = m2.u.h(r6)
            goto L5b
        L2e:
            float r8 = m2.u.h(r6)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L5a
            v.q r8 = v.q.f56307a
            android.widget.EdgeEffect r3 = r5.f56110e
            float r3 = r8.b(r3)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L44
            r3 = r1
            goto L45
        L44:
            r3 = r2
        L45:
            if (r3 != 0) goto L5a
            android.widget.EdgeEffect r3 = r5.f56110e
            float r4 = m2.u.h(r6)
            int r4 = lo.c.c(r4)
            int r4 = -r4
            r8.c(r3, r4)
            float r8 = m2.u.h(r6)
            goto L5b
        L5a:
            r8 = r0
        L5b:
            float r3 = m2.u.i(r6)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L86
            v.q r3 = v.q.f56307a
            android.widget.EdgeEffect r4 = r5.f56107b
            float r4 = r3.b(r4)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L71
            r4 = r1
            goto L72
        L71:
            r4 = r2
        L72:
            if (r4 != 0) goto L86
            android.widget.EdgeEffect r0 = r5.f56107b
            float r1 = m2.u.i(r6)
            int r1 = lo.c.c(r1)
            r3.c(r0, r1)
            float r0 = m2.u.i(r6)
            goto Lb0
        L86:
            float r3 = m2.u.i(r6)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto Lb0
            v.q r3 = v.q.f56307a
            android.widget.EdgeEffect r4 = r5.f56108c
            float r4 = r3.b(r4)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L9b
            goto L9c
        L9b:
            r1 = r2
        L9c:
            if (r1 != 0) goto Lb0
            android.widget.EdgeEffect r0 = r5.f56108c
            float r1 = m2.u.i(r6)
            int r1 = lo.c.c(r1)
            int r1 = -r1
            r3.c(r0, r1)
            float r0 = m2.u.i(r6)
        Lb0:
            long r6 = m2.v.a(r8, r0)
            m2.u$a r8 = m2.u.f40549b
            long r0 = r8.a()
            boolean r8 = m2.u.g(r6, r0)
            if (r8 != 0) goto Lc3
            r5.y()
        Lc3:
            m2.u r6 = m2.u.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v.a.d(long, ao.d):java.lang.Object");
    }

    @Override // v.i0
    public x0.f e() {
        return this.f56123r;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e8  */
    @Override // v.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long f(long r7, b1.f r9, int r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.a.f(long, b1.f, int):long");
    }

    @Override // v.i0
    public boolean isEnabled() {
        return this.f56120o.getValue().booleanValue();
    }

    public final void s() {
        List<EdgeEffect> list = this.f56111f;
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = list.get(i10);
            edgeEffect.onRelease();
            z10 = edgeEffect.isFinished() || z10;
        }
        if (z10) {
            y();
        }
    }

    @Override // v.i0
    public void setEnabled(boolean z10) {
        boolean z11 = this.f56121p != z10;
        this.f56120o.setValue(Boolean.valueOf(z10));
        this.f56121p = z10;
        if (z11) {
            this.f56118m = false;
            s();
        }
    }

    public final boolean t(e1.e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-b1.l.i(this.f56119n), (-b1.l.g(this.f56119n)) + eVar.I0(this.f56106a.a().a()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean u(e1.e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-b1.l.g(this.f56119n), eVar.I0(this.f56106a.a().b(eVar.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final void v(e1.e eVar) {
        boolean z10;
        jo.p.h(eVar, "<this>");
        c1.w e10 = eVar.M0().e();
        this.f56116k.getValue();
        Canvas c10 = c1.c.c(e10);
        q qVar = q.f56307a;
        boolean z11 = true;
        if (!(qVar.b(this.f56114i) == 0.0f)) {
            w(eVar, this.f56114i, c10);
            this.f56114i.finish();
        }
        if (this.f56109d.isFinished()) {
            z10 = false;
        } else {
            z10 = u(eVar, this.f56109d, c10);
            qVar.d(this.f56114i, qVar.b(this.f56109d), 0.0f);
        }
        if (!(qVar.b(this.f56112g) == 0.0f)) {
            t(eVar, this.f56112g, c10);
            this.f56112g.finish();
        }
        if (!this.f56107b.isFinished()) {
            z10 = x(eVar, this.f56107b, c10) || z10;
            qVar.d(this.f56112g, qVar.b(this.f56107b), 0.0f);
        }
        if (!(qVar.b(this.f56115j) == 0.0f)) {
            u(eVar, this.f56115j, c10);
            this.f56115j.finish();
        }
        if (!this.f56110e.isFinished()) {
            z10 = w(eVar, this.f56110e, c10) || z10;
            qVar.d(this.f56115j, qVar.b(this.f56110e), 0.0f);
        }
        if (!(qVar.b(this.f56113h) == 0.0f)) {
            x(eVar, this.f56113h, c10);
            this.f56113h.finish();
        }
        if (!this.f56108c.isFinished()) {
            if (!t(eVar, this.f56108c, c10) && !z10) {
                z11 = false;
            }
            qVar.d(this.f56113h, qVar.b(this.f56108c), 0.0f);
            z10 = z11;
        }
        if (z10) {
            y();
        }
    }

    public final boolean w(e1.e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int c10 = lo.c.c(b1.l.i(this.f56119n));
        float c11 = this.f56106a.a().c(eVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-c10) + eVar.I0(c11));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean x(e1.e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, eVar.I0(this.f56106a.a().d()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final void y() {
        if (this.f56117l) {
            this.f56116k.setValue(wn.v.f59242a);
        }
    }

    public final float z(long j10, long j11) {
        float m10 = b1.f.m(j11) / b1.l.i(this.f56119n);
        return (-q.f56307a.d(this.f56108c, -(b1.f.n(j10) / b1.l.g(this.f56119n)), 1 - m10)) * b1.l.g(this.f56119n);
    }
}
