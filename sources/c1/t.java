package c1;

import q1.q0;

/* loaded from: classes.dex */
public final class t extends androidx.compose.ui.platform.d1 implements q1.x {

    /* renamed from: x  reason: collision with root package name */
    public final io.l<i0, wn.v> f18767x;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f18768w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ t f18769x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.q0 q0Var, t tVar) {
            super(1);
            this.f18768w = q0Var;
            this.f18769x = tVar;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.v(aVar, this.f18768w, 0, 0, 0.0f, this.f18769x.f18767x, 4, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(io.l<? super i0, wn.v> lVar, io.l<? super androidx.compose.ui.platform.c1, wn.v> lVar2) {
        super(lVar2);
        jo.p.h(lVar, "layerBlock");
        jo.p.h(lVar2, "inspectorInfo");
        this.f18767x = lVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof t) {
            return jo.p.c(this.f18767x, ((t) obj).f18767x);
        }
        return false;
    }

    public int hashCode() {
        return this.f18767x.hashCode();
    }

    @Override // q1.x
    public q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        q1.q0 M = b0Var.M(j10);
        return q1.e0.O0(e0Var, M.r0(), M.f0(), null, new a(M, this), 4, null);
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f18767x + ')';
    }
}
