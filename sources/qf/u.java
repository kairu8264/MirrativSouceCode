package qf;

import ae.gd;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.k4;

/* loaded from: classes3.dex */
public final class u extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49392b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49393c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final gd f49394a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_emomo_comment_collab_matching_start, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new u((gd) e10, null);
        }
    }

    public u(gd gdVar) {
        super(gdVar.u());
        this.f49394a = gdVar;
    }

    public /* synthetic */ u(gd gdVar, jo.h hVar) {
        this(gdVar);
    }

    public static final void c(io.l lVar, k4 k4Var, View view) {
        jo.p.h(lVar, "$clickListener");
        jo.p.h(k4Var, "$bindModel");
        lVar.invoke(k4Var.e());
    }

    public final void b(final k4 k4Var, final io.l<? super String, wn.v> lVar) {
        jo.p.h(k4Var, "bindModel");
        jo.p.h(lVar, "clickListener");
        AppCompatImageView appCompatImageView = this.f49394a.C;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        de.f.e(appCompatImageView, k4Var.f(), Integer.valueOf(nd.y0.f42251g2));
        this.f49394a.B.setText(k4Var.a());
        this.f49394a.D.setOnClickListener(new View.OnClickListener() { // from class: qf.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.c(io.l.this, k4Var, view);
            }
        });
        this.f49394a.o();
    }
}
