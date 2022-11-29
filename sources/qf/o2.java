package qf;

import ae.ci;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class o2 extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f49317a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_separator, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new o2((ci) e10, null);
        }
    }

    public o2(ci ciVar) {
        super(ciVar.u());
    }

    public /* synthetic */ o2(ci ciVar, jo.h hVar) {
        this(ciVar);
    }
}
