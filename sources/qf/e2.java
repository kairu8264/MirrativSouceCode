package qf;

import ae.oh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.glide.GlideApp;
import oq.a;

/* loaded from: classes3.dex */
public final class e2 extends RecyclerView.e0 implements oq.a {

    /* renamed from: x  reason: collision with root package name */
    public static final a f49121x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f49122y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final oh f49123w;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_player_comment_bot_share, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new e2((oh) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49124w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(1);
            this.f49124w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49124w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public e2(oh ohVar) {
        super(ohVar.u());
        this.f49123w = ohVar;
    }

    public /* synthetic */ e2(oh ohVar, jo.h hVar) {
        this(ohVar);
    }

    public final void a(ud.d3 d3Var, io.a<wn.v> aVar) {
        jo.p.h(d3Var, "bindModel");
        jo.p.h(aVar, "onClickShareButton");
        this.f49123w.E.setText(d3Var.a());
        GlideApp.with(this.f49123w.C).load(Integer.valueOf(nd.y0.f42251g2)).apply((e8.a<?>) new e8.h().circleCrop()).into(this.f49123w.C);
        RoundedButtonView roundedButtonView = this.f49123w.F;
        jo.p.g(roundedButtonView, "binding.shareButtonView");
        yd.g1.a(roundedButtonView, new b(aVar));
        this.f49123w.o();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
