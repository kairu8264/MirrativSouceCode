package qf;

import ae.ge;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class n0 extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f49303a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_gacha_collab_bonus_lose, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new n0((ge) e10, null);
        }
    }

    public n0(ge geVar) {
        super(geVar.u());
    }

    public /* synthetic */ n0(ge geVar, jo.h hVar) {
        this(geVar);
    }
}
