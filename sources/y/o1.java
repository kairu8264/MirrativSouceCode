package y;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f60867a = ViewConfiguration.getScrollFriction();

    /* renamed from: b  reason: collision with root package name */
    public static final double f60868b;

    /* renamed from: c  reason: collision with root package name */
    public static final double f60869c;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {
        public a() {
            super(1);
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("imeNestedScroll");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f60870w = new b();

        public b() {
            super(3);
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-369978792);
            x0.f b10 = m1.c.b(fVar, o1.e(p1.f60881v.c(iVar, 8).d(), u1.f60981a.e(), iVar, 48), null, 2, null);
            iVar.O();
            return b10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r1 f60871w;

        /* loaded from: classes.dex */
        public static final class a implements l0.z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ r1 f60872a;

            public a(r1 r1Var) {
                this.f60872a = r1Var;
            }

            @Override // l0.z
            public void dispose() {
                this.f60872a.p();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r1 r1Var) {
            super(1);
            this.f60871w = r1Var;
        }

        @Override // io.l
        /* renamed from: a */
        public final l0.z invoke(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            return new a(this.f60871w);
        }
    }

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        f60868b = log;
        f60869c = log - 1.0d;
    }

    public static final x0.f d(x0.f fVar) {
        jo.p.h(fVar, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            return fVar;
        }
        return x0.e.c(fVar, androidx.compose.ui.platform.a1.c() ? new a() : androidx.compose.ui.platform.a1.a(), b.f60870w);
    }

    public static final m1.a e(e eVar, int i10, l0.i iVar, int i11) {
        jo.p.h(eVar, "windowInsets");
        iVar.x(-1011341039);
        if (Build.VERSION.SDK_INT < 30) {
            u uVar = u.f60976w;
            iVar.O();
            return uVar;
        }
        c1 a10 = c1.f60687a.a(i10, (m2.q) iVar.G(androidx.compose.ui.platform.o0.j()));
        View view = (View) iVar.G(androidx.compose.ui.platform.z.k());
        m2.d dVar = (m2.d) iVar.G(androidx.compose.ui.platform.o0.e());
        Object[] objArr = {eVar, view, a10, dVar};
        iVar.x(-568225417);
        boolean z10 = false;
        for (int i12 = 0; i12 < 4; i12++) {
            z10 |= iVar.P(objArr[i12]);
        }
        Object y10 = iVar.y();
        if (z10 || y10 == l0.i.f39065a.a()) {
            y10 = new r1(eVar, view, a10, dVar);
            iVar.q(y10);
        }
        iVar.O();
        r1 r1Var = (r1) y10;
        l0.c0.a(r1Var, new c(r1Var), iVar, 8);
        iVar.O();
        return r1Var;
    }
}
