package v;

import androidx.compose.ui.platform.a1;
import l0.c1;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final c1<x> f56440a = l0.r.d(a.f56441w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f56441w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final x invoke() {
            return o.f56299a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x f56442w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x.k f56443x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x xVar, x.k kVar) {
            super(1);
            this.f56442w = xVar;
            this.f56443x = kVar;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("indication");
            c1Var.a().b("indication", this.f56442w);
            c1Var.a().b("interactionSource", this.f56443x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x f56444w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x.k f56445x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x xVar, x.k kVar) {
            super(3);
            this.f56444w = xVar;
            this.f56445x = kVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-353972293);
            x xVar = this.f56444w;
            if (xVar == null) {
                xVar = f0.f56198a;
            }
            y a10 = xVar.a(this.f56445x, iVar, 0);
            iVar.x(1157296644);
            boolean P = iVar.P(a10);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a0(a10);
                iVar.q(y10);
            }
            iVar.O();
            a0 a0Var = (a0) y10;
            iVar.O();
            return a0Var;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final c1<x> a() {
        return f56440a;
    }

    public static final x0.f b(x0.f fVar, x.k kVar, x xVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(kVar, "interactionSource");
        return x0.e.c(fVar, a1.c() ? new b(xVar, kVar) : a1.a(), new c(xVar, kVar));
    }
}
