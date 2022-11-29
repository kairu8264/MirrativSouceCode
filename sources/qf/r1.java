package qf;

import ae.qg;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class r1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49361b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49362c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final qg f49363a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final r1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_loading, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new r1((qg) e10, null);
        }
    }

    public r1(qg qgVar) {
        super(qgVar.u());
        this.f49363a = qgVar;
        Context context = qgVar.u().getContext();
        qgVar.M(context instanceof androidx.lifecycle.u ? (androidx.lifecycle.u) context : null);
    }

    public /* synthetic */ r1(qg qgVar, jo.h hVar) {
        this(qgVar);
    }

    public final void a(ud.f2 f2Var) {
        jo.p.h(f2Var, "loadingBindModel");
        this.f49363a.T(f2Var);
    }
}
