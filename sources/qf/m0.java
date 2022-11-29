package qf;

import ae.ee;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class m0 extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f49292a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_gacha_about_duplicated_point, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new m0((ee) e10, null);
        }
    }

    public m0(ee eeVar) {
        super(eeVar.u());
    }

    public /* synthetic */ m0(ee eeVar, jo.h hVar) {
        this(eeVar);
    }
}
