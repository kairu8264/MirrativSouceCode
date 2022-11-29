package q1;

import androidx.compose.ui.platform.c1;

/* loaded from: classes.dex */
public final class n0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f48589w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.l lVar) {
            super(1);
            this.f48589w = lVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("onSizeChanged");
            c1Var.a().b("onSizeChanged", this.f48589w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    public static final x0.f a(x0.f fVar, io.l<? super m2.o, wn.v> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "onSizeChanged");
        return fVar.L(new o0(lVar, androidx.compose.ui.platform.a1.c() ? new a(lVar) : androidx.compose.ui.platform.a1.a()));
    }
}
