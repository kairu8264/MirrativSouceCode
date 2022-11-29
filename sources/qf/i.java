package qf;

import ae.qc;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;
import oq.a;
import ud.g4;

/* loaded from: classes3.dex */
public final class i extends RecyclerView.e0 implements oq.a {

    /* renamed from: x  reason: collision with root package name */
    public static final a f49210x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f49211y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final qc f49212w;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_comment_bot, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new i((qc) e10, null);
        }
    }

    public i(qc qcVar) {
        super(qcVar.u());
        this.f49212w = qcVar;
    }

    public /* synthetic */ i(qc qcVar, jo.h hVar) {
        this(qcVar);
    }

    public final void a(ud.u2 u2Var) {
        jo.p.h(u2Var, "bindModel");
        this.f49212w.E.setText(u2Var.a());
        GlideApp.with(this.f49212w.C).load(Integer.valueOf(nd.y0.f42251g2)).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f49212w.C);
        this.f49212w.o();
    }

    public final void b(g4 g4Var) {
        jo.p.h(g4Var, "bindModel");
        this.f49212w.E.setText(g4Var.a());
        GlideApp.with(this.f49212w.C).load(Integer.valueOf(nd.y0.f42251g2)).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f49212w.C);
        this.f49212w.o();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
