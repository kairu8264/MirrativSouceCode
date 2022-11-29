package qf;

import ae.yf;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class e1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49118b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49119c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final yf f49120a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_landing_page_ranking_user, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new e1((yf) e10, null);
        }
    }

    public e1(yf yfVar) {
        super(yfVar.u());
        this.f49120a = yfVar;
    }

    public /* synthetic */ e1(yf yfVar, jo.h hVar) {
        this(yfVar);
    }

    public static final void f(ud.r1 r1Var, io.l lVar, View view) {
        jo.p.h(r1Var, "$bindModel");
        Integer f10 = r1Var.k().f();
        if (f10 == null || f10.intValue() <= 0 || lVar == null) {
            return;
        }
        lVar.invoke(f10);
    }

    public static final void g(ud.r1 r1Var, io.l lVar, View view) {
        jo.p.h(r1Var, "$bindModel");
        Integer f10 = r1Var.k().f();
        if (f10 == null || f10.intValue() <= 0 || lVar == null) {
            return;
        }
        lVar.invoke(f10);
    }

    public static final void h(ud.r1 r1Var, io.l lVar, View view) {
        jo.p.h(r1Var, "$bindModel");
        String f10 = r1Var.d().f();
        if (f10 == null || TextUtils.isEmpty(f10) || lVar == null) {
            return;
        }
        lVar.invoke(f10);
    }

    public final void d(final ud.r1 r1Var, final io.l<? super Integer, wn.v> lVar, final io.l<? super String, wn.v> lVar2) {
        jo.p.h(r1Var, "bindModel");
        this.f49120a.T(r1Var);
        this.f49120a.E.setOnClickListener(new View.OnClickListener() { // from class: qf.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e1.f(ud.r1.this, lVar, view);
            }
        });
        this.f49120a.I.setOnClickListener(new View.OnClickListener() { // from class: qf.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e1.g(ud.r1.this, lVar, view);
            }
        });
        this.f49120a.G.setOnClickListener(new View.OnClickListener() { // from class: qf.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e1.h(ud.r1.this, lVar2, view);
            }
        });
        this.f49120a.o();
    }
}
