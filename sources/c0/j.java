package c0;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import jo.p;
import jo.q;
import wn.v;

/* loaded from: classes.dex */
public final class j {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.l<c1, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ i f18611w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar) {
            super(1);
            this.f18611w = iVar;
        }

        public final void a(c1 c1Var) {
            p.h(c1Var, "$this$null");
            c1Var.b("bringIntoViewResponder");
            c1Var.a().b("responder", this.f18611w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c1 c1Var) {
            a(c1Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ i f18612w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar) {
            super(3);
            this.f18612w = iVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            p.h(fVar, "$this$composed");
            iVar.x(-852052847);
            d b10 = l.b(iVar, 0);
            iVar.x(1157296644);
            boolean P = iVar.P(b10);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new k(b10);
                iVar.q(y10);
            }
            iVar.O();
            k kVar = (k) y10;
            kVar.r(this.f18612w);
            iVar.O();
            return kVar;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f c(x0.f fVar, i iVar) {
        p.h(fVar, "<this>");
        p.h(iVar, "responder");
        return x0.e.c(fVar, a1.c() ? new a(iVar) : a1.a(), new b(iVar));
    }

    public static final boolean d(b1.h hVar, b1.h hVar2) {
        return hVar.i() <= hVar2.i() && hVar.l() <= hVar2.l() && hVar.j() >= hVar2.j() && hVar.e() >= hVar2.e();
    }

    public static final b1.h e(q1.q qVar, q1.q qVar2, b1.h hVar) {
        return hVar.r(qVar.k(qVar2, false).m());
    }
}
