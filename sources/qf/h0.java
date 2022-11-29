package qf;

import ae.ud;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class h0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49192b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49193c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ud f49194a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_emomo_run_gift, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new h0((ud) e10, null);
        }
    }

    public h0(ud udVar) {
        super(udVar.u());
        this.f49194a = udVar;
    }

    public /* synthetic */ h0(ud udVar, jo.h hVar) {
        this(udVar);
    }

    public static final void c(ud.a0 a0Var, io.p pVar, h0 h0Var, View view) {
        jo.p.h(a0Var, "$bindModel");
        jo.p.h(h0Var, "this$0");
        String f10 = a0Var.c().f();
        if (f10 != null) {
            if (!(f10.length() > 0) || pVar == null) {
                return;
            }
            View u10 = h0Var.f49194a.u();
            jo.p.g(u10, "binding.root");
            pVar.invoke(f10, u10);
        }
    }

    public final void b(final ud.a0 a0Var, final io.p<? super String, ? super View, wn.v> pVar) {
        jo.p.h(a0Var, "bindModel");
        this.f49194a.T(a0Var);
        this.f49194a.D.setOnClickListener(new View.OnClickListener() { // from class: qf.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h0.c(ud.a0.this, pVar, this, view);
            }
        });
        this.f49194a.o();
    }
}
