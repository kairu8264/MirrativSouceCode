package w1;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;

/* loaded from: classes.dex */
public final class p {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f57931w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l f57932x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, io.l lVar) {
            super(1);
            this.f57931w = z10;
            this.f57932x = lVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("semantics");
            c1Var.a().b("mergeDescendants", Boolean.valueOf(this.f57931w));
            c1Var.a().b("properties", this.f57932x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f57933w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<y, wn.v> f57934x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z10, io.l<? super y, wn.v> lVar) {
            super(3);
            this.f57933w = z10;
            this.f57934x = lVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-140499264);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = Integer.valueOf(o.f57927y.a());
                iVar.q(y10);
            }
            iVar.O();
            o oVar = new o(((Number) y10).intValue(), this.f57933w, false, this.f57934x);
            iVar.O();
            return oVar;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar, boolean z10, io.l<? super y, wn.v> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "properties");
        return x0.e.c(fVar, a1.c() ? new a(z10, lVar) : a1.a(), new b(z10, lVar));
    }

    public static /* synthetic */ x0.f b(x0.f fVar, boolean z10, io.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(fVar, z10, lVar);
    }
}
