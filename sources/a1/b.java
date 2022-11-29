package a1;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import l0.s0;
import l0.z1;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f279w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.l lVar) {
            super(1);
            this.f279w = lVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("onFocusChanged");
            c1Var.a().b("onFocusChanged", this.f279w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* renamed from: a1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0004b extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<x, wn.v> f280w;

        /* renamed from: a1.b$b$a */
        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<x, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ s0<x> f281w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ io.l<x, wn.v> f282x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(s0<x> s0Var, io.l<? super x, wn.v> lVar) {
                super(1);
                this.f281w = s0Var;
                this.f282x = lVar;
            }

            public final void a(x xVar) {
                jo.p.h(xVar, "it");
                if (jo.p.c(this.f281w.getValue(), xVar)) {
                    return;
                }
                this.f281w.setValue(xVar);
                this.f282x.invoke(xVar);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(x xVar) {
                a(xVar);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0004b(io.l<? super x, wn.v> lVar) {
            super(3);
            this.f280w = lVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-1741761824);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = z1.e(null, null, 2, null);
                iVar.q(y10);
            }
            iVar.O();
            x0.f b10 = e.b(x0.f.f59359u, new a((s0) y10, this.f280w));
            iVar.O();
            return b10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar, io.l<? super x, wn.v> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "onFocusChanged");
        return x0.e.c(fVar, a1.c() ? new a(lVar) : a1.a(), new C0004b(lVar));
    }
}
