package yd;

import ae.we;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class s extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61790b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f61791c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final we f61792a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_gacha_open_result_header, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new s((we) e10, null);
        }
    }

    public s(we weVar) {
        super(weVar.u());
        this.f61792a = weVar;
    }

    public /* synthetic */ s(we weVar, jo.h hVar) {
        this(weVar);
    }

    public final void a(ud.k0 k0Var) {
        jo.p.h(k0Var, "bindModel");
        this.f61792a.T(k0Var);
    }
}
