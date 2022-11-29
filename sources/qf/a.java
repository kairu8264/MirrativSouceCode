package qf;

import ae.cc;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class a extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final C0741a f49019b = new C0741a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49020c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final cc f49021a;

    /* renamed from: qf.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0741a {
        public C0741a() {
        }

        public /* synthetic */ C0741a(jo.h hVar) {
            this();
        }

        public final a a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_add_to_my_app, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new a((cc) e10, null);
        }
    }

    public a(cc ccVar) {
        super(ccVar.u());
        this.f49021a = ccVar;
    }

    public /* synthetic */ a(cc ccVar, jo.h hVar) {
        this(ccVar);
    }

    public final void a(ud.b bVar) {
        jo.p.h(bVar, "bindModel");
        this.f49021a.T(bVar);
    }
}
