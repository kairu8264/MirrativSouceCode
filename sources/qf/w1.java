package qf;

import ae.ah;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class w1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49417b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49418c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ah f49419a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_next_live_announcement, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new w1((ah) e10, null);
        }
    }

    public w1(ah ahVar) {
        super(ahVar.u());
        this.f49419a = ahVar;
        Context context = ahVar.u().getContext();
        ahVar.M(context instanceof androidx.lifecycle.u ? (androidx.lifecycle.u) context : null);
    }

    public /* synthetic */ w1(ah ahVar, jo.h hVar) {
        this(ahVar);
    }

    public static final void c(io.a aVar, View view) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void b(ud.n2 n2Var, final io.a<wn.v> aVar) {
        jo.p.h(n2Var, "nextLiveAnnouncementBindModel");
        this.f49419a.T(n2Var);
        this.f49419a.G.setOnClickListener(new View.OnClickListener() { // from class: qf.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w1.c(io.a.this, view);
            }
        });
        if (n2Var.b() == null) {
            this.f49419a.B.setVisibility(8);
            return;
        }
        this.f49419a.B.setVisibility(0);
        this.f49419a.B.a(n2Var.b());
    }
}
