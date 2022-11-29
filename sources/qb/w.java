package qb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import hb.x1;
import kb.a1;
import ud.d2;

/* loaded from: classes2.dex */
public final class w extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f48945b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f48946c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final a1 f48947a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), x1.view_holder_live_viewer, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new w((a1) e10, null);
        }
    }

    public w(a1 a1Var) {
        super(a1Var.u());
        this.f48947a = a1Var;
        Context context = a1Var.u().getContext();
        a1Var.M(context instanceof androidx.lifecycle.u ? (androidx.lifecycle.u) context : null);
    }

    public /* synthetic */ w(a1 a1Var, jo.h hVar) {
        this(a1Var);
    }

    public final void a(d2 d2Var) {
        jo.p.h(d2Var, "liveViewerBindModel");
        this.f48947a.T(d2Var);
        this.f48947a.G.a(d2Var.i(), d2Var.h());
    }
}
