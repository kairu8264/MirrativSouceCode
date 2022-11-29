package h0;

import androidx.compose.ui.platform.g2;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a  reason: collision with root package name */
    public static final l0.c1<Boolean> f34373a = l0.r.d(a.f34374w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f34374w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {
        public b() {
            super(1);
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("minimumTouchTargetSize");
            c1Var.a().b("README", "Adds outer padding to measure at least 48.dp (default) in size to disambiguate touch interactions if the element would measure smaller");
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
        public static final c f34375w = new c();

        public c() {
            super(3);
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            x0.f fVar2;
            jo.p.h(fVar, "$this$composed");
            iVar.x(1220403677);
            if (((Boolean) iVar.G(y1.a())).booleanValue()) {
                fVar2 = new r0(((g2) iVar.G(androidx.compose.ui.platform.o0.n())).d(), null);
            } else {
                fVar2 = x0.f.f59359u;
            }
            iVar.O();
            return fVar2;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final l0.c1<Boolean> a() {
        return f34373a;
    }

    public static final x0.f b(x0.f fVar) {
        jo.p.h(fVar, "<this>");
        return x0.e.c(fVar, androidx.compose.ui.platform.a1.c() ? new b() : androidx.compose.ui.platform.a1.a(), c.f34375w);
    }
}
