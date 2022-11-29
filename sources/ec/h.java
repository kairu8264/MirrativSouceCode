package ec;

import ac.d6;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.o4;

/* loaded from: classes2.dex */
public final class h extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30421b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f30422c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final d6 f30423a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_floating_comment_text, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new h((d6) e10, null);
        }
    }

    public h(d6 d6Var) {
        super(d6Var.u());
        this.f30423a = d6Var;
    }

    public /* synthetic */ h(d6 d6Var, jo.h hVar) {
        this(d6Var);
    }

    public final void a(o4 o4Var) {
        jo.p.h(o4Var, "bindModel");
        this.f30423a.C.setText(o4Var.j());
        this.f30423a.o();
    }
}
