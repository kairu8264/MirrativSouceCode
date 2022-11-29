package qf;

import ae.aj;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class e3 extends RecyclerView.e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f49125a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e3 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_stream_comment_empty, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new e3((aj) e10, null);
        }
    }

    public e3(aj ajVar) {
        super(ajVar.u());
    }

    public /* synthetic */ e3(aj ajVar, jo.h hVar) {
        this(ajVar);
    }
}
