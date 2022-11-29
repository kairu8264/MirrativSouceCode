package bc;

import ac.v3;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class f1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17311b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f17312c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final v3 f17313a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.item_emokara_search_history, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new f1((v3) e10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(v3 v3Var) {
        super(v3Var.u());
        jo.p.h(v3Var, "binding");
        this.f17313a = v3Var;
    }

    public final void a(String str) {
        jo.p.h(str, "keyword");
        this.f17313a.D.setText(str);
    }

    public final v3 b() {
        return this.f17313a;
    }
}
