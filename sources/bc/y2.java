package bc;

import ac.z3;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class y2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17519b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f17520c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final z3 f17521a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.item_emokara_title, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new y2((z3) e10, null);
        }
    }

    public y2(z3 z3Var) {
        super(z3Var.u());
        this.f17521a = z3Var;
    }

    public /* synthetic */ y2(z3 z3Var, jo.h hVar) {
        this(z3Var);
    }

    public final void a(int i10, String str) {
        jo.p.h(str, "title");
        this.f17521a.B.setVisibility(0);
        this.f17521a.B.setImageResource(i10);
        this.f17521a.C.setText(str);
    }
}
