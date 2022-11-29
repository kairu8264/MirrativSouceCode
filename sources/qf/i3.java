package qf;

import ae.oj;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class i3 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49231b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49232c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final oj f49233a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i3 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_vertical_space, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new i3((oj) e10, null);
        }
    }

    public i3(oj ojVar) {
        super(ojVar.u());
        this.f49233a = ojVar;
    }

    public /* synthetic */ i3(oj ojVar, jo.h hVar) {
        this(ojVar);
    }

    public final void a(int i10) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(this.f49233a.B);
        cVar.l(this.f49233a.C.getId(), i10);
        cVar.c(this.f49233a.B);
    }
}
