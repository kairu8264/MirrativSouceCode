package fc;

import ac.h3;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;
import hf.c;
import jo.p;
import xb.q;

/* loaded from: classes2.dex */
public final class e extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f31927b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f31928c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final h3 f31929a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.item_app_grid_small, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new e((h3) e10, null);
        }
    }

    public e(h3 h3Var) {
        super(h3Var.u());
        this.f31929a = h3Var;
        this.itemView.setBackgroundResource(xb.n.bg_app_grid_item);
    }

    public /* synthetic */ e(h3 h3Var, jo.h hVar) {
        this(h3Var);
    }

    public final void a(c.a aVar) {
        p.h(aVar, "appInfo");
        GlideApp.with(this.itemView.getContext()).load(aVar.e()).placeholder(q.f60064c).into(this.f31929a.B);
        this.f31929a.C.setText(aVar.g());
    }
}
