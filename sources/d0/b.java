package d0;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import io.l;
import jo.p;
import jo.q;
import v.x;
import w1.h;
import w1.w;
import w1.y;
import wn.v;
import x.m;
import x0.f;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends q implements l<y, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f28916w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10) {
            super(1);
            this.f28916w = z10;
        }

        public final void a(y yVar) {
            p.h(yVar, "$this$semantics");
            w.J(yVar, this.f28916w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(y yVar) {
            a(yVar);
            return v.f59242a;
        }
    }

    /* renamed from: d0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0264b extends q implements l<c1, v> {
        public final /* synthetic */ h A;
        public final /* synthetic */ io.a B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f28917w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ m f28918x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x f28919y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f28920z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0264b(boolean z10, m mVar, x xVar, boolean z11, h hVar, io.a aVar) {
            super(1);
            this.f28917w = z10;
            this.f28918x = mVar;
            this.f28919y = xVar;
            this.f28920z = z11;
            this.A = hVar;
            this.B = aVar;
        }

        public final void a(c1 c1Var) {
            p.h(c1Var, "$this$null");
            c1Var.b("selectable");
            c1Var.a().b("selected", Boolean.valueOf(this.f28917w));
            c1Var.a().b("interactionSource", this.f28918x);
            c1Var.a().b("indication", this.f28919y);
            c1Var.a().b("enabled", Boolean.valueOf(this.f28920z));
            c1Var.a().b("role", this.A);
            c1Var.a().b("onClick", this.B);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c1 c1Var) {
            a(c1Var);
            return v.f59242a;
        }
    }

    public static final f a(f fVar, boolean z10, m mVar, x xVar, boolean z11, h hVar, io.a<v> aVar) {
        p.h(fVar, "$this$selectable");
        p.h(mVar, "interactionSource");
        p.h(aVar, "onClick");
        return a1.b(fVar, a1.c() ? new C0264b(z10, mVar, xVar, z11, hVar, aVar) : a1.a(), w1.p.b(v.l.c(f.f59359u, mVar, xVar, z11, null, hVar, aVar, 8, null), false, new a(z10), 1, null));
    }
}
