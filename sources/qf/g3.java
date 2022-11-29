package qf;

import ae.gj;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class g3 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49172b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49173c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final gj f49174a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g3 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_text, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new g3((gj) e10, null);
        }
    }

    public g3(gj gjVar) {
        super(gjVar.u());
        this.f49174a = gjVar;
    }

    public /* synthetic */ g3(gj gjVar, jo.h hVar) {
        this(gjVar);
    }

    public final void a(String str, float f10) {
        jo.p.h(str, "text");
        this.f49174a.B.setText(str);
        this.f49174a.B.setTextSize(2, f10);
    }
}
