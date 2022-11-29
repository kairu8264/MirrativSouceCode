package qb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import hb.x1;
import kb.y0;
import ud.c2;

/* loaded from: classes2.dex */
public final class v extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f48942b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f48943c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final y0 f48944a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), x1.view_holder_live_info_with_app, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new v((y0) e10, null);
        }
    }

    public v(y0 y0Var) {
        super(y0Var.u());
        this.f48944a = y0Var;
        Context context = y0Var.u().getContext();
        y0Var.M(context instanceof androidx.lifecycle.u ? (androidx.lifecycle.u) context : null);
    }

    public /* synthetic */ v(y0 y0Var, jo.h hVar) {
        this(y0Var);
    }

    public static final void c(io.a aVar, View view) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void b(c2 c2Var, final io.a<wn.v> aVar) {
        jo.p.h(c2Var, "liveInfoWithAddToMyAppBindModel");
        this.f48944a.T(c2Var);
        this.f48944a.E.setOnClickListener(new View.OnClickListener() { // from class: qb.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.c(io.a.this, view);
            }
        });
    }
}
