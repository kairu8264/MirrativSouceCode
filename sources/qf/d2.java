package qf;

import ae.mh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.net.glide.GlideApp;
import oq.a;

/* loaded from: classes3.dex */
public final class d2 extends RecyclerView.e0 implements oq.a {

    /* renamed from: x  reason: collision with root package name */
    public static final a f49104x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f49105y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final mh f49106w;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_player_comment_bot_check_profile, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new d2((mh) e10, null);
        }
    }

    public d2(mh mhVar) {
        super(mhVar.u());
        this.f49106w = mhVar;
    }

    public /* synthetic */ d2(mh mhVar, jo.h hVar) {
        this(mhVar);
    }

    public static final void c(io.l lVar, ud.v2 v2Var, View view) {
        jo.p.h(v2Var, "$bindModel");
        if (lVar != null) {
            lVar.invoke(v2Var.e());
        }
    }

    public final void b(final ud.v2 v2Var, final io.l<? super String, wn.v> lVar) {
        jo.p.h(v2Var, "bindModel");
        this.f49106w.E.setText(v2Var.a());
        GlideApp.with(this.f49106w.C).load(Integer.valueOf(nd.y0.f42251g2)).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f49106w.C);
        ProfileImageView profileImageView = this.f49106w.G;
        jo.p.g(profileImageView, "binding.profileImageView");
        ProfileImageView.b(profileImageView, v2Var.g(), v2Var.b(), null, null, 12, null);
        this.f49106w.F.setOnClickListener(new View.OnClickListener() { // from class: qf.c2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d2.c(io.l.this, v2Var, view);
            }
        });
        this.f49106w.o();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
