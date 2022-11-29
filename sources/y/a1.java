package y;

import androidx.appcompat.widget.ActivityChooserModel;
import x0.a;
import y.b1;

/* loaded from: classes.dex */
public final class a1 implements z0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a1 f60672a = new a1();

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a.c f60673w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a.c cVar) {
            super(1);
            this.f60673w = cVar;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("align");
            c1Var.c(this.f60673w);
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
        public final /* synthetic */ q1.k f60674w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q1.k kVar) {
            super(1);
            this.f60674w = kVar;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("alignBy");
            c1Var.c(this.f60674w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<androidx.compose.ui.platform.c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ float f60675w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f60676x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f10, boolean z10) {
            super(1);
            this.f60675w = f10;
            this.f60676x = z10;
        }

        public final void a(androidx.compose.ui.platform.c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b(ActivityChooserModel.ATTRIBUTE_WEIGHT);
            c1Var.c(Float.valueOf(this.f60675w));
            c1Var.a().b(ActivityChooserModel.ATTRIBUTE_WEIGHT, Float.valueOf(this.f60675w));
            c1Var.a().b("fill", Boolean.valueOf(this.f60676x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(androidx.compose.ui.platform.c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    @Override // y.z0
    public x0.f a(x0.f fVar, float f10, boolean z10) {
        jo.p.h(fVar, "<this>");
        if (((double) f10) > 0.0d) {
            return fVar.L(new h0(f10, z10, androidx.compose.ui.platform.a1.c() ? new c(f10, z10) : androidx.compose.ui.platform.a1.a()));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // y.z0
    public x0.f b(x0.f fVar) {
        jo.p.h(fVar, "<this>");
        return e(fVar, q1.b.a());
    }

    @Override // y.z0
    public x0.f d(x0.f fVar, a.c cVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(cVar, "alignment");
        return fVar.L(new m1(cVar, androidx.compose.ui.platform.a1.c() ? new a(cVar) : androidx.compose.ui.platform.a1.a()));
    }

    public x0.f e(x0.f fVar, q1.k kVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(kVar, "alignmentLine");
        return fVar.L(new b1.a(kVar, androidx.compose.ui.platform.a1.c() ? new b(kVar) : androidx.compose.ui.platform.a1.a()));
    }
}
