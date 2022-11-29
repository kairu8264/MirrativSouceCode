package qf;

import ae.eg;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.x1;

/* loaded from: classes3.dex */
public final class g1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49159b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49160c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final eg f49161a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_live_gift_cheer_user, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new g1((eg) e10, null);
        }
    }

    public g1(eg egVar) {
        super(egVar.u());
        this.f49161a = egVar;
    }

    public /* synthetic */ g1(eg egVar, jo.h hVar) {
        this(egVar);
    }

    public final void a(x1.e eVar) {
        jo.p.h(eVar, "bindModel");
        this.f49161a.T(eVar);
        this.f49161a.F.a(eVar.f(), Integer.valueOf(eVar.e()));
    }
}
