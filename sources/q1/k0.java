package q1;

import androidx.compose.ui.platform.c1;

/* loaded from: classes.dex */
public final class k0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l f48588w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.l lVar) {
            super(1);
            this.f48588w = lVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("onGloballyPositioned");
            c1Var.a().b("onGloballyPositioned", this.f48588w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    public static final x0.f a(x0.f fVar, io.l<? super q, wn.v> lVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(lVar, "onGloballyPositioned");
        return fVar.L(new j0(lVar, androidx.compose.ui.platform.a1.c() ? new a(lVar) : androidx.compose.ui.platform.a1.a()));
    }
}
