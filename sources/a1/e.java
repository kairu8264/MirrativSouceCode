package a1;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final r1.f<f> f303a = r1.c.a(a.f304w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<f> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f304w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final f invoke() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f305w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.l lVar) {
            super(1);
            this.f305w = lVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("onFocusEvent");
            c1Var.a().b("onFocusEvent", this.f305w);
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
        public final /* synthetic */ io.l<x, wn.v> f306w;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ f f307w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar) {
                super(0);
                this.f307w = fVar;
            }

            public final void a() {
                this.f307w.f();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.l<? super x, wn.v> lVar) {
            super(3);
            this.f306w = lVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(607036704);
            io.l<x, wn.v> lVar = this.f306w;
            iVar.x(1157296644);
            boolean P = iVar.P(lVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new f(lVar);
                iVar.q(y10);
            }
            iVar.O();
            f fVar2 = (f) y10;
            l0.c0.g(new a(fVar2), iVar, 0);
            iVar.O();
            return fVar2;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final r1.f<f> a() {
        return f303a;
    }

    public static final x0.f b(x0.f fVar, io.l<? super x, wn.v> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "onFocusEvent");
        return x0.e.c(fVar, a1.c() ? new b(lVar) : a1.a(), new c(lVar));
    }
}
