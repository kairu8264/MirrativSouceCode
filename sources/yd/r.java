package yd;

import ae.ke;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.GiftGachaDuplicatedPointGaugeView;

/* loaded from: classes2.dex */
public final class r extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61784b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f61785c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ke f61786a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final r a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_gacha_gauge, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new r((ke) e10, null);
        }
    }

    public r(ke keVar) {
        super(keVar.u());
        this.f61786a = keVar;
    }

    public /* synthetic */ r(ke keVar, jo.h hVar) {
        this(keVar);
    }

    public static final void c(r rVar, ud.h0 h0Var, Integer num) {
        jo.p.h(rVar, "this$0");
        jo.p.h(h0Var, "$bindModel");
        GiftGachaDuplicatedPointGaugeView giftGachaDuplicatedPointGaugeView = rVar.f61786a.B;
        jo.p.g(num, "progress");
        giftGachaDuplicatedPointGaugeView.c(num.intValue(), h0Var.d(), true);
    }

    public final void b(androidx.lifecycle.u uVar, final ud.h0 h0Var) {
        jo.p.h(uVar, "viewLifecycleOwner");
        jo.p.h(h0Var, "bindModel");
        this.f61786a.M(uVar);
        this.f61786a.T(h0Var);
        this.f61786a.B.b();
        this.f61786a.B.setGaugeColor(h0Var.c());
        Integer f10 = h0Var.a().f();
        int b10 = h0Var.b();
        if (f10 != null && f10.intValue() == b10) {
            this.f61786a.B.c(h0Var.b(), h0Var.d(), false);
        } else {
            h0Var.a().i(uVar, new androidx.lifecycle.f0() { // from class: yd.q
                @Override // androidx.lifecycle.f0
                public final void d(Object obj) {
                    r.c(r.this, h0Var, (Integer) obj);
                }
            });
        }
    }
}
