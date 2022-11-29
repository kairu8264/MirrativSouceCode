package z0;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import c1.d0;
import wn.v;

/* loaded from: classes.dex */
public final class n {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, v> {
        public final /* synthetic */ float A;
        public final /* synthetic */ d0 B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f1.d f62416w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f62417x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.a f62418y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ q1.f f62419z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1.d dVar, boolean z10, x0.a aVar, q1.f fVar, float f10, d0 d0Var) {
            super(1);
            this.f62416w = dVar;
            this.f62417x = z10;
            this.f62418y = aVar;
            this.f62419z = fVar;
            this.A = f10;
            this.B = d0Var;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("paint");
            c1Var.a().b("painter", this.f62416w);
            c1Var.a().b("sizeToIntrinsics", Boolean.valueOf(this.f62417x));
            c1Var.a().b("alignment", this.f62418y);
            c1Var.a().b("contentScale", this.f62419z);
            c1Var.a().b("alpha", Float.valueOf(this.A));
            c1Var.a().b("colorFilter", this.B);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c1 c1Var) {
            a(c1Var);
            return v.f59242a;
        }
    }

    public static final x0.f a(x0.f fVar, f1.d dVar, boolean z10, x0.a aVar, q1.f fVar2, float f10, d0 d0Var) {
        jo.p.h(fVar, "<this>");
        jo.p.h(dVar, "painter");
        jo.p.h(aVar, "alignment");
        jo.p.h(fVar2, "contentScale");
        return fVar.L(new m(dVar, z10, aVar, fVar2, f10, d0Var, a1.c() ? new a(dVar, z10, aVar, fVar2, f10, d0Var) : a1.a()));
    }

    public static /* synthetic */ x0.f b(x0.f fVar, f1.d dVar, boolean z10, x0.a aVar, q1.f fVar2, float f10, d0 d0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            aVar = x0.a.f59327a.e();
        }
        x0.a aVar2 = aVar;
        if ((i10 & 8) != 0) {
            fVar2 = q1.f.f48569a.e();
        }
        q1.f fVar3 = fVar2;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            d0Var = null;
        }
        return a(fVar, dVar, z11, aVar2, fVar3, f11, d0Var);
    }
}
