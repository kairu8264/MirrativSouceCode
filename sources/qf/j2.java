package qf;

import ae.sh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.ProfileImageView;
import oq.a;

/* loaded from: classes3.dex */
public final class j2 extends RecyclerView.e0 implements oq.a {

    /* renamed from: x  reason: collision with root package name */
    public static final a f49244x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f49245y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final sh f49246w;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_player_comment_streamer_memo, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new j2((sh) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f49247w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.c3 f49248x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super String, wn.v> lVar, ud.c3 c3Var) {
            super(1);
            this.f49247w = lVar;
            this.f49248x = c3Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<String, wn.v> lVar = this.f49247w;
            if (lVar != null) {
                lVar.invoke(this.f49248x.e());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public j2(sh shVar) {
        super(shVar.u());
        this.f49246w = shVar;
    }

    public /* synthetic */ j2(sh shVar, jo.h hVar) {
        this(shVar);
    }

    public final void a(ud.c3 c3Var, io.l<? super String, wn.v> lVar) {
        jo.p.h(c3Var, "comment");
        this.f49246w.F.setText(c3Var.c());
        this.f49246w.D.setText(c3Var.a());
        ProfileImageView profileImageView = this.f49246w.E;
        jo.p.g(profileImageView, "binding.profileImageView");
        ProfileImageView.b(profileImageView, c3Var.g(), c3Var.b(), null, null, 12, null);
        View u10 = this.f49246w.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new b(lVar, c3Var));
        this.f49246w.o();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
