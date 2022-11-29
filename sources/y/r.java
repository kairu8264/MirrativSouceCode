package y;

import androidx.appcompat.widget.ActivityChooserModel;
import x0.a;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    public static final r f60913a = new r();

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a.b f60914w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a.b bVar) {
            super(1);
            this.f60914w = bVar;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("align");
            c1Var.c(this.f60914w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60915w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f60916x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, boolean z10) {
            super(1);
            this.f60915w = f10;
            this.f60916x = z10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b(ActivityChooserModel.ATTRIBUTE_WEIGHT);
            c1Var.c(Float.valueOf(this.f60915w));
            c1Var.a().b(ActivityChooserModel.ATTRIBUTE_WEIGHT, Float.valueOf(this.f60915w));
            c1Var.a().b("fill", Boolean.valueOf(this.f60916x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    @Override // y.q
    public x0.f a(x0.f fVar, float f10, boolean z10) {
        jo.p.h(fVar, "<this>");
        if (((double) f10) > 0.0d) {
            return fVar.L(new h0(f10, z10, androidx.compose.ui.platform.a1.c() ? new b(f10, z10) : androidx.compose.ui.platform.a1.a()));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // y.q
    public x0.f b(x0.f fVar, a.b bVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(bVar, "alignment");
        return fVar.L(new y(bVar, androidx.compose.ui.platform.a1.c() ? new a(bVar) : androidx.compose.ui.platform.a1.a()));
    }
}
