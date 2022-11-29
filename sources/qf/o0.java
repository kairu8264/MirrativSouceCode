package qf;

import ae.ie;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class o0 extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f49314a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_gacha_collab_bonus_title, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new o0((ie) e10, null);
        }
    }

    public o0(ie ieVar) {
        super(ieVar.u());
    }

    public /* synthetic */ o0(ie ieVar, jo.h hVar) {
        this(ieVar);
    }
}
