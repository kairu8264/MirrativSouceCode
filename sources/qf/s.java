package qf;

import ae.ed;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import ud.i4;

/* loaded from: classes3.dex */
public final class s extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49369b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49370c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ed f49371a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_emomo_comment_collab_end, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new s((ed) e10, null);
        }
    }

    public s(ed edVar) {
        super(edVar.u());
        this.f49371a = edVar;
    }

    public /* synthetic */ s(ed edVar, jo.h hVar) {
        this(edVar);
    }

    public static final void c(io.l lVar, i4 i4Var, View view) {
        jo.p.h(lVar, "$clickListener");
        jo.p.h(i4Var, "$bindModel");
        lVar.invoke(i4Var.e());
    }

    public final void b(final i4 i4Var, final io.l<? super String, wn.v> lVar) {
        jo.p.h(i4Var, "bindModel");
        jo.p.h(lVar, "clickListener");
        AppCompatImageView appCompatImageView = this.f49371a.D;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        de.f.e(appCompatImageView, i4Var.f(), Integer.valueOf(nd.y0.f42251g2));
        this.f49371a.C.setText(i4Var.a());
        this.f49371a.B.setOnClickListener(new View.OnClickListener() { // from class: qf.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.c(io.l.this, i4Var, view);
            }
        });
        this.f49371a.o();
    }
}
