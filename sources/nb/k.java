package nb;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import hb.x1;
import jo.p;
import kb.u0;
import ud.z0;

/* loaded from: classes2.dex */
public final class k extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f41776b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f41777c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final u0 f41778a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), x1.view_holder_giftpanel_space, viewGroup, false);
            p.g(e10, "inflate(\n               …  false\n                )");
            return new k((u0) e10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u0 u0Var) {
        super(u0Var.u());
        p.h(u0Var, "binding");
        this.f41778a = u0Var;
    }

    public final void a(z0 z0Var) {
        p.h(z0Var, "bindModel");
        this.f41778a.T(z0Var);
    }
}
