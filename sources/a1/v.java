package a1;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final r1.f<w> f352a = r1.c.a(a.f353w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<w> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f353w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final w invoke() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ t f354w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar) {
            super(1);
            this.f354w = tVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("focusRequester");
            c1Var.a().b("focusRequester", this.f354w);
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
        public final /* synthetic */ t f355w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t tVar) {
            super(3);
            this.f355w = tVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(-307396750);
            t tVar = this.f355w;
            int i11 = m0.e.f40467z;
            iVar.x(1157296644);
            boolean P = iVar.P(tVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new w(tVar);
                iVar.q(y10);
            }
            iVar.O();
            w wVar = (w) y10;
            iVar.O();
            return wVar;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar, t tVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(tVar, "focusRequester");
        return x0.e.c(fVar, a1.c() ? new b(tVar) : a1.a(), new c(tVar));
    }

    public static final r1.f<w> b() {
        return f352a;
    }
}
