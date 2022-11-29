package qf;

import ae.cj;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.t4;

/* loaded from: classes3.dex */
public final class f3 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49153b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49154c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final cj f49155a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f3 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_stream_comment_text, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new f3((cj) e10, null);
        }
    }

    public f3(cj cjVar) {
        super(cjVar.u());
        this.f49155a = cjVar;
    }

    public /* synthetic */ f3(cj cjVar, jo.h hVar) {
        this(cjVar);
    }

    public final void a(t4 t4Var) {
        jo.p.h(t4Var, "bindModel");
        this.f49155a.B.setText(t4Var.a());
        this.f49155a.o();
    }
}
