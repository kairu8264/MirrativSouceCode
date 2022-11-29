package qf;

import ae.oi;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.ShooterVictoryCountView;
import java.util.ArrayList;
import java.util.List;
import ud.x3;
import ud.y3;

/* loaded from: classes3.dex */
public final class w2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49420b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49421c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final oi f49422a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_shooter_ranking_user, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new w2((oi) e10, null);
        }
    }

    public w2(oi oiVar) {
        super(oiVar.u());
        this.f49422a = oiVar;
        oiVar.F.setLayoutManager(new LinearLayoutManager(oiVar.u().getContext(), 0, false));
        oiVar.F.g(new p001if.c(de.m.a(this, 4), 0, 0, 0, 0, 0));
    }

    public /* synthetic */ w2(oi oiVar, jo.h hVar) {
        this(oiVar);
    }

    public static final void f(io.l lVar, x3 x3Var, View view) {
        jo.p.h(x3Var, "$bindModel");
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(x3Var.q()));
        }
    }

    public static final void g(io.l lVar, x3 x3Var, View view) {
        jo.p.h(x3Var, "$bindModel");
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(x3Var.q()));
        }
    }

    public static final void h(x3 x3Var, io.l lVar, View view) {
        jo.p.h(x3Var, "$bindModel");
        if (!(x3Var.b().length() > 0) || lVar == null) {
            return;
        }
        lVar.invoke(x3Var.b());
    }

    public final void d(final x3 x3Var, final io.l<? super Integer, wn.v> lVar, final io.l<? super String, wn.v> lVar2) {
        jo.p.h(x3Var, "bindModel");
        this.f49422a.T(x3Var);
        oi oiVar = this.f49422a;
        ShooterVictoryCountView shooterVictoryCountView = oiVar.X;
        y3.a aVar = y3.f55762e;
        Context context = oiVar.u().getContext();
        jo.p.g(context, "binding.root.context");
        shooterVictoryCountView.a(aVar.a(context, x3Var.s(), x3Var.r()));
        this.f49422a.K.setOnClickListener(new View.OnClickListener() { // from class: qf.u2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w2.f(io.l.this, x3Var, view);
            }
        });
        this.f49422a.O.setOnClickListener(new View.OnClickListener() { // from class: qf.t2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w2.g(io.l.this, x3Var, view);
            }
        });
        this.f49422a.M.setOnClickListener(new View.OnClickListener() { // from class: qf.v2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w2.h(x3.this, lVar2, view);
            }
        });
        RecyclerView recyclerView = this.f49422a.F;
        rd.u0 u0Var = new rd.u0();
        List<String> d10 = x3Var.d();
        ArrayList arrayList = new ArrayList(xn.t.u(d10, 10));
        int i10 = 0;
        for (Object obj : d10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                xn.s.t();
            }
            arrayList.add(new ud.f3((String) obj, x3Var.c().get(i10)));
            i10 = i11;
        }
        u0Var.c(arrayList);
        recyclerView.setAdapter(u0Var);
        this.f49422a.o();
    }
}
