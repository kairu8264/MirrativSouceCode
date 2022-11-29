package qf;

import ae.ec;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class d extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49094b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49095c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ec f49096a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_app, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new d((ec) e10, null);
        }
    }

    public d(ec ecVar) {
        super(ecVar.u());
        this.f49096a = ecVar;
    }

    public /* synthetic */ d(ec ecVar, jo.h hVar) {
        this(ecVar);
    }

    public final void a(ud.c cVar) {
        jo.p.h(cVar, "bindModel");
        this.f49096a.T(cVar);
    }
}
