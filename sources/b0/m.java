package b0;

import android.view.View;
import androidx.compose.ui.platform.z;
import l0.l1;
import q1.y0;
import wn.v;

/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ k f16706w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e f16707x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y0 f16708y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f16709z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, e eVar, y0 y0Var, int i10) {
            super(2);
            this.f16706w = kVar;
            this.f16707x = eVar;
            this.f16708y = y0Var;
            this.f16709z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            m.a(this.f16706w, this.f16707x, this.f16708y, iVar, this.f16709z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(k kVar, e eVar, y0 y0Var, l0.i iVar, int i10) {
        jo.p.h(kVar, "prefetchState");
        jo.p.h(eVar, "itemContentFactory");
        jo.p.h(y0Var, "subcomposeLayoutState");
        l0.i h10 = iVar.h(1113453182);
        View view = (View) h10.G(z.k());
        int i11 = y0.f48626f;
        h10.x(1618982084);
        boolean P = h10.P(y0Var) | h10.P(kVar) | h10.P(view);
        Object y10 = h10.y();
        if (P || y10 == l0.i.f39065a.a()) {
            h10.q(new l(kVar, y0Var, eVar, view));
        }
        h10.O();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(kVar, eVar, y0Var, i10));
    }
}
