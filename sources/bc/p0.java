package bc;

import ac.t3;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class p0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17424b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f17425c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t3 f17426a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.item_emokara_search_empty, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new p0((t3) e10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(t3 t3Var) {
        super(t3Var.u());
        jo.p.h(t3Var, "binding");
        this.f17426a = t3Var;
    }

    public final void a(String str) {
        jo.p.h(str, "keyword");
        String string = this.f17426a.u().getContext().getString(nd.f1.text_empty_cell_body_karaoke_search, str);
        jo.p.g(string, "binding.root.context.get…_karaoke_search, keyword)");
        this.f17426a.C.setText(string);
    }
}
