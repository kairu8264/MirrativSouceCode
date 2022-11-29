package tc;

import ae.yg;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class p1 extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f53561a = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nc.f.f41865q0, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new p1((yg) e10, null);
        }
    }

    public p1(yg ygVar) {
        super(ygVar.u());
    }

    public /* synthetic */ p1(yg ygVar, jo.h hVar) {
        this(ygVar);
    }
}
