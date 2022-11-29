package f0;

import java.util.List;
import l0.u1;
import l0.z1;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: f  reason: collision with root package name */
    public static final c f31565f = new c(null);

    /* renamed from: g  reason: collision with root package name */
    public static final u0.i<o0, Object> f31566g = u0.a.a(a.f31572w, b.f31573w);

    /* renamed from: a  reason: collision with root package name */
    public final l0.s0 f31567a;

    /* renamed from: b  reason: collision with root package name */
    public final l0.s0 f31568b;

    /* renamed from: c  reason: collision with root package name */
    public b1.h f31569c;

    /* renamed from: d  reason: collision with root package name */
    public long f31570d;

    /* renamed from: e  reason: collision with root package name */
    public final l0.s0 f31571e;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<u0.k, o0, List<? extends Object>> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f31572w = new a();

        public a() {
            super(2);
        }

        @Override // io.p
        /* renamed from: a */
        public final List<Object> invoke(u0.k kVar, o0 o0Var) {
            jo.p.h(kVar, "$this$listSaver");
            jo.p.h(o0Var, "it");
            Object[] objArr = new Object[2];
            objArr[0] = Float.valueOf(o0Var.d());
            objArr[1] = Boolean.valueOf(o0Var.f() == w.q.Vertical);
            return xn.s.m(objArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<List<? extends Object>, o0> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f31573w = new b();

        public b() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final o0 invoke(List<? extends Object> list) {
            jo.p.h(list, "restored");
            return new o0(((Boolean) list.get(1)).booleanValue() ? w.q.Vertical : w.q.Horizontal, ((Float) list.get(0)).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }

        public final u0.i<o0, Object> a() {
            return o0.f31566g;
        }
    }

    public o0(w.q qVar, float f10) {
        l0.s0 e10;
        l0.s0 e11;
        jo.p.h(qVar, "initialOrientation");
        e10 = z1.e(Float.valueOf(f10), null, 2, null);
        this.f31567a = e10;
        e11 = z1.e(Float.valueOf(0.0f), null, 2, null);
        this.f31568b = e11;
        this.f31569c = b1.h.f16726e.a();
        this.f31570d = y1.b0.f61064b.a();
        this.f31571e = u1.f(qVar, u1.n());
    }

    public final void b(float f10, float f11, int i10) {
        int i11;
        float d10 = d();
        float f12 = i10;
        float f13 = d10 + f12;
        h(d() + ((f11 <= f13 && (f10 >= d10 || f11 - f10 <= f12)) ? (i11 >= 0 || f11 - f10 > f12) ? 0.0f : f10 - d10 : f11 - f13));
    }

    public final float c() {
        return ((Number) this.f31568b.getValue()).floatValue();
    }

    public final float d() {
        return ((Number) this.f31567a.getValue()).floatValue();
    }

    public final int e(long j10) {
        return y1.b0.n(j10) != y1.b0.n(this.f31570d) ? y1.b0.n(j10) : y1.b0.i(j10) != y1.b0.i(this.f31570d) ? y1.b0.i(j10) : y1.b0.l(j10);
    }

    public final w.q f() {
        return (w.q) this.f31571e.getValue();
    }

    public final void g(float f10) {
        this.f31568b.setValue(Float.valueOf(f10));
    }

    public final void h(float f10) {
        this.f31567a.setValue(Float.valueOf(f10));
    }

    public final void i(long j10) {
        this.f31570d = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        if ((r6.l() == r4.f31569c.l()) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(w.q r5, b1.h r6, int r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "orientation"
            jo.p.h(r5, r0)
            java.lang.String r0 = "cursorRect"
            jo.p.h(r6, r0)
            int r8 = r8 - r7
            float r8 = (float) r8
            r4.g(r8)
            float r0 = r6.i()
            b1.h r1 = r4.f31569c
            float r1 = r1.i()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L21
            r0 = r1
            goto L22
        L21:
            r0 = r2
        L22:
            if (r0 == 0) goto L37
            float r0 = r6.l()
            b1.h r3 = r4.f31569c
            float r3 = r3.l()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L34
            r0 = r1
            goto L35
        L34:
            r0 = r2
        L35:
            if (r0 != 0) goto L58
        L37:
            w.q r0 = w.q.Vertical
            if (r5 != r0) goto L3c
            goto L3d
        L3c:
            r1 = r2
        L3d:
            if (r1 == 0) goto L44
            float r5 = r6.l()
            goto L48
        L44:
            float r5 = r6.i()
        L48:
            if (r1 == 0) goto L4f
            float r0 = r6.e()
            goto L53
        L4f:
            float r0 = r6.j()
        L53:
            r4.b(r5, r0, r7)
            r4.f31569c = r6
        L58:
            float r5 = r4.d()
            r6 = 0
            float r5 = po.n.l(r5, r6, r8)
            r4.h(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.o0.j(w.q, b1.h, int, int):void");
    }

    public /* synthetic */ o0(w.q qVar, float f10, int i10, jo.h hVar) {
        this(qVar, (i10 & 2) != 0 ? 0.0f : f10);
    }

    public o0() {
        this(w.q.Vertical, 0.0f, 2, null);
    }
}
