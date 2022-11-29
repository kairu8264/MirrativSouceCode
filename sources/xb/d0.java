package xb;

import ac.d7;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.l4;

/* loaded from: classes2.dex */
public final class d0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f59871b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f59872c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final d7 f59873a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), p.view_holder_stream_comment_collab_recommend_live, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new d0((d7) e10, null);
        }
    }

    public d0(d7 d7Var) {
        super(d7Var.u());
        this.f59873a = d7Var;
    }

    public /* synthetic */ d0(d7 d7Var, jo.h hVar) {
        this(d7Var);
    }

    public static final void c(io.l lVar, l4 l4Var, View view) {
        jo.p.h(lVar, "$clickListener");
        jo.p.h(l4Var, "$bindModel");
        lVar.invoke(l4Var.b());
    }

    public final void b(final l4 l4Var, final io.l<? super String, wn.v> lVar) {
        jo.p.h(l4Var, "bindModel");
        jo.p.h(lVar, "clickListener");
        this.f59873a.C.setText(l4Var.a());
        this.f59873a.D.setText(l4Var.c());
        AppCompatImageView appCompatImageView = this.f59873a.E;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        de.f.e(appCompatImageView, l4Var.f(), Integer.valueOf(n.f59962i0));
        AppCompatImageView appCompatImageView2 = this.f59873a.B;
        jo.p.g(appCompatImageView2, "binding.badgeImage");
        td.a.f(appCompatImageView2, l4Var.g());
        this.f59873a.F.setOnClickListener(new View.OnClickListener() { // from class: xb.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.c(io.l.this, l4Var, view);
            }
        });
        this.f59873a.o();
    }
}
