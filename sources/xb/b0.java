package xb;

import ac.b7;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;
import ud.i4;

/* loaded from: classes2.dex */
public final class b0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f59864b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f59865c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final b7 f59866a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), p.view_holder_stream_comment_collab_end, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new b0((b7) e10, null);
        }
    }

    public b0(b7 b7Var) {
        super(b7Var.u());
        this.f59866a = b7Var;
    }

    public /* synthetic */ b0(b7 b7Var, jo.h hVar) {
        this(b7Var);
    }

    public static final void c(io.l lVar, i4 i4Var, View view) {
        jo.p.h(lVar, "$clickListener");
        jo.p.h(i4Var, "$bindModel");
        lVar.invoke(i4Var.e());
    }

    public final void b(final i4 i4Var, final io.l<? super String, wn.v> lVar) {
        jo.p.h(i4Var, "bindModel");
        jo.p.h(lVar, "clickListener");
        this.f59866a.C.setText(i4Var.a());
        GlideApp.with(this.f59866a.D).load(Integer.valueOf(n.f59962i0)).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f59866a.D);
        AppCompatImageView appCompatImageView = this.f59866a.E;
        jo.p.g(appCompatImageView, "binding.userImageView");
        td.a.e(appCompatImageView, i4Var.f());
        this.f59866a.B.setOnClickListener(new View.OnClickListener() { // from class: xb.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b0.c(io.l.this, i4Var, view);
            }
        });
        this.f59866a.o();
    }
}
