package c0;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import jo.p;
import jo.q;
import l0.a0;
import l0.c0;
import l0.z;
import wn.v;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.l<c1, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e f18605w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(1);
            this.f18605w = eVar;
        }

        public final void a(c1 c1Var) {
            p.h(c1Var, "$this$null");
            c1Var.b("bringIntoViewRequester");
            c1Var.a().b("bringIntoViewRequester", this.f18605w);
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
        public final /* synthetic */ e f18606w;

        /* loaded from: classes.dex */
        public static final class a extends q implements io.l<a0, z> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f18607w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ h f18608x;

            /* renamed from: c0.g$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0135a implements z {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ e f18609a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ h f18610b;

                public C0135a(e eVar, h hVar) {
                    this.f18609a = eVar;
                    this.f18610b = hVar;
                }

                @Override // l0.z
                public void dispose() {
                    ((f) this.f18609a).c().u(this.f18610b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, h hVar) {
                super(1);
                this.f18607w = eVar;
                this.f18608x = hVar;
            }

            @Override // io.l
            /* renamed from: a */
            public final z invoke(a0 a0Var) {
                p.h(a0Var, "$this$DisposableEffect");
                ((f) this.f18607w).c().c(this.f18608x);
                return new C0135a(this.f18607w, this.f18608x);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar) {
            super(3);
            this.f18606w = eVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            p.h(fVar, "$this$composed");
            iVar.x(-992853993);
            d b10 = l.b(iVar, 0);
            iVar.x(1157296644);
            boolean P = iVar.P(b10);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new h(b10);
                iVar.q(y10);
            }
            iVar.O();
            h hVar = (h) y10;
            e eVar = this.f18606w;
            if (eVar instanceof f) {
                c0.a(eVar, new a(eVar, hVar), iVar, 0);
            }
            iVar.O();
            return hVar;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final e a() {
        return new f();
    }

    public static final x0.f b(x0.f fVar, e eVar) {
        p.h(fVar, "<this>");
        p.h(eVar, "bringIntoViewRequester");
        return x0.e.c(fVar, a1.c() ? new a(eVar) : a1.a(), new b(eVar));
    }
}
