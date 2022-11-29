package hc;

import ac.p6;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.j1;

/* loaded from: classes2.dex */
public final class h extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f35117b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f35118c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final p6 f35119a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_group_shot_background_setting_gallery_image, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new h((p6) e10, null);
        }
    }

    public h(p6 p6Var) {
        super(p6Var.u());
        this.f35119a = p6Var;
    }

    public /* synthetic */ h(p6 p6Var, jo.h hVar) {
        this(p6Var);
    }

    public final void a(j1 j1Var) {
        jo.p.h(j1Var, "bindModel");
        this.f35119a.C.setBackgroundImage(j1Var.a());
        this.f35119a.C.setChecked(j1Var.b());
    }
}
