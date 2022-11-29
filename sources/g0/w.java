package g0;

import f0.r0;
import f0.t0;
import kotlin.NoWhenBranchMatchedException;
import l0.l1;
import n1.e0;
import n1.o0;

/* loaded from: classes.dex */
public final class w {

    @co.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", f = "TextFieldSelectionManager.kt", l = {818}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<e0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f32310w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f32311x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f0.e0 f32312y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f0.e0 e0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f32312y = e0Var;
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(e0 e0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(e0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f32312y, dVar);
            aVar.f32311x = obj;
            return aVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f32310w;
            if (i10 == 0) {
                wn.m.b(obj);
                f0.e0 e0Var = this.f32312y;
                this.f32310w = 1;
                if (f0.w.c((e0) this.f32311x, e0Var, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f32313w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ j2.d f32314x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ v f32315y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f32316z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, j2.d dVar, v vVar, int i10) {
            super(2);
            this.f32313w = z10;
            this.f32314x = dVar;
            this.f32315y = vVar;
            this.f32316z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            w.a(this.f32313w, this.f32314x, this.f32315y, iVar, this.f32316z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32317a;

        static {
            int[] iArr = new int[f0.j.values().length];
            iArr[f0.j.Cursor.ordinal()] = 1;
            iArr[f0.j.SelectionStart.ordinal()] = 2;
            iArr[f0.j.SelectionEnd.ordinal()] = 3;
            f32317a = iArr;
        }
    }

    public static final void a(boolean z10, j2.d dVar, v vVar, l0.i iVar, int i10) {
        jo.p.h(dVar, "direction");
        jo.p.h(vVar, "manager");
        l0.i h10 = iVar.h(-1344558920);
        Boolean valueOf = Boolean.valueOf(z10);
        h10.x(511388516);
        boolean P = h10.P(valueOf) | h10.P(vVar);
        Object y10 = h10.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = vVar.I(z10);
            h10.q(y10);
        }
        h10.O();
        f0.e0 e0Var = (f0.e0) y10;
        long z11 = vVar.z(z10);
        boolean m10 = y1.b0.m(vVar.H().g());
        x0.f b10 = o0.b(x0.f.f59359u, e0Var, new a(e0Var, null));
        int i11 = i10 << 3;
        g0.a.c(z11, z10, dVar, m10, b10, null, h10, 196608 | (i11 & 112) | (i11 & 896));
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(z10, dVar, vVar, i10));
    }

    public static final long b(v vVar, long j10) {
        int n10;
        t0 g10;
        y1.z i10;
        q1.q f10;
        t0 g11;
        q1.q c10;
        jo.p.h(vVar, "manager");
        if (vVar.H().h().length() == 0) {
            return b1.f.f16721b.b();
        }
        f0.j w10 = vVar.w();
        int i11 = w10 == null ? -1 : c.f32317a[w10.ordinal()];
        if (i11 != -1) {
            if (i11 == 1 || i11 == 2) {
                n10 = y1.b0.n(vVar.H().g());
            } else if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                n10 = y1.b0.i(vVar.H().g());
            }
            int n11 = po.n.n(vVar.C().b(n10), so.o.N(vVar.H().h()));
            r0 E = vVar.E();
            if (E != null && (g10 = E.g()) != null && (i10 = g10.i()) != null) {
                long g12 = i10.c(n11).g();
                r0 E2 = vVar.E();
                if (E2 != null && (f10 = E2.f()) != null) {
                    r0 E3 = vVar.E();
                    if (E3 != null && (g11 = E3.g()) != null && (c10 = g11.c()) != null) {
                        b1.f u10 = vVar.u();
                        if (u10 != null) {
                            float m10 = b1.f.m(c10.z(f10, u10.u()));
                            int p10 = i10.p(n11);
                            int t10 = i10.t(p10);
                            int n12 = i10.n(p10, true);
                            boolean z10 = y1.b0.n(vVar.H().g()) > y1.b0.i(vVar.H().g());
                            float a10 = b0.a(i10, t10, true, z10);
                            float a11 = b0.a(i10, n12, false, z10);
                            float l10 = po.n.l(m10, Math.min(a10, a11), Math.max(a10, a11));
                            if (Math.abs(m10 - l10) > m2.o.g(j10) / 2) {
                                return b1.f.f16721b.b();
                            }
                            return f10.z(c10, b1.g.a(l10, b1.f.n(g12)));
                        }
                        return b1.f.f16721b.b();
                    }
                    return b1.f.f16721b.b();
                }
                return b1.f.f16721b.b();
            }
            return b1.f.f16721b.b();
        }
        return b1.f.f16721b.b();
    }

    public static final boolean c(v vVar, boolean z10) {
        q1.q f10;
        b1.h b10;
        jo.p.h(vVar, "<this>");
        r0 E = vVar.E();
        if (E == null || (f10 = E.f()) == null || (b10 = p.b(f10)) == null) {
            return false;
        }
        return p.a(b10, vVar.z(z10));
    }
}
