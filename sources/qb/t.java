package qb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import hb.x1;
import kb.w0;
import ud.b2;

/* loaded from: classes2.dex */
public final class t extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f48938b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f48939c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final w0 f48940a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), x1.view_holder_live_info_no_app, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new t((w0) e10, null);
        }
    }

    public t(w0 w0Var) {
        super(w0Var.u());
        this.f48940a = w0Var;
        Context context = w0Var.u().getContext();
        w0Var.M(context instanceof androidx.lifecycle.u ? (androidx.lifecycle.u) context : null);
    }

    public /* synthetic */ t(w0 w0Var, jo.h hVar) {
        this(w0Var);
    }

    public final void a(b2 b2Var) {
        jo.p.h(b2Var, "viewModel");
        this.f48940a.T(b2Var);
    }
}
