package v;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final r1.f<io.l<q1.q, wn.v>> f56385a = r1.c.a(a.f56386w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<io.l<? super q1.q, ? extends wn.v>> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f56386w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final io.l<q1.q, wn.v> invoke() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f56387w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.l lVar) {
            super(1);
            this.f56387w = lVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("onFocusedBoundsChanged");
            c1Var.a().b("onPositioned", this.f56387w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<q1.q, wn.v> f56388w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.l<? super q1.q, wn.v> lVar) {
            super(3);
            this.f56388w = lVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(1176407768);
            io.l<q1.q, wn.v> lVar = this.f56388w;
            iVar.x(1157296644);
            boolean P = iVar.P(lVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new u(lVar);
                iVar.q(y10);
            }
            iVar.O();
            u uVar = (u) y10;
            iVar.O();
            return uVar;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final r1.f<io.l<q1.q, wn.v>> a() {
        return f56385a;
    }

    public static final x0.f b(x0.f fVar, io.l<? super q1.q, wn.v> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "onPositioned");
        return x0.e.c(fVar, a1.c() ? new b(lVar) : a1.a(), new c(lVar));
    }
}
