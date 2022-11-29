package bc;

import ac.x3;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Singer;

/* loaded from: classes2.dex */
public final class t1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17486b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f17487c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final x3 f17488a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.item_emokara_singer, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new t1((x3) e10, null);
        }
    }

    public t1(x3 x3Var) {
        super(x3Var.u());
        this.f17488a = x3Var;
    }

    public /* synthetic */ t1(x3 x3Var, jo.h hVar) {
        this(x3Var);
    }

    public final void a(Singer singer) {
        jo.p.h(singer, "singer");
        this.f17488a.D.setVisibility(0);
        this.f17488a.C.setVisibility(8);
        this.f17488a.D.setText(singer.getName());
    }

    public final void b(String str) {
        jo.p.h(str, "initial");
        this.f17488a.D.setVisibility(8);
        this.f17488a.C.setVisibility(0);
        this.f17488a.C.setText(str);
    }

    public final void c() {
        this.f17488a.D.setVisibility(8);
        this.f17488a.C.setVisibility(8);
        this.f17488a.B.setVisibility(0);
    }

    public final x3 d() {
        return this.f17488a;
    }
}
