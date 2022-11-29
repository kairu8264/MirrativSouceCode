package q1;

import androidx.compose.ui.platform.c1;

/* loaded from: classes.dex */
public final class t {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f48605w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(1);
            this.f48605w = obj;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("layoutId");
            c1Var.c(this.f48605w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    public static final Object a(b0 b0Var) {
        jo.p.h(b0Var, "<this>");
        Object d10 = b0Var.d();
        u uVar = d10 instanceof u ? (u) d10 : null;
        if (uVar != null) {
            return uVar.a();
        }
        return null;
    }

    public static final x0.f b(x0.f fVar, Object obj) {
        jo.p.h(fVar, "<this>");
        jo.p.h(obj, "layoutId");
        return fVar.L(new s(obj, androidx.compose.ui.platform.a1.c() ? new a(obj) : androidx.compose.ui.platform.a1.a()));
    }
}
