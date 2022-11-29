package qf;

import ae.qj;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.LiveCatalogStreamerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import ud.b5;

/* loaded from: classes3.dex */
public final class j3 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49249b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49250c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final qj f49251a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j3 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_view_history, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new j3((qj) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49252w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<wn.v> aVar) {
            super(1);
            this.f49252w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49252w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49253w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a<wn.v> aVar) {
            super(0);
            this.f49253w = aVar;
        }

        public final void a() {
            this.f49253w.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49254w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a<wn.v> aVar) {
            super(1);
            this.f49254w = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f49254w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public j3(qj qjVar) {
        super(qjVar.u());
        this.f49251a = qjVar;
    }

    public /* synthetic */ j3(qj qjVar, jo.h hVar) {
        this(qjVar);
    }

    public final void a(b5 b5Var, io.a<wn.v> aVar, io.a<wn.v> aVar2, io.a<wn.v> aVar3) {
        jo.p.h(b5Var, "bindModel");
        jo.p.h(aVar, "itemClickListener");
        jo.p.h(aVar2, "userProfileClickListener");
        jo.p.h(aVar3, "followIconClickListener");
        this.f49251a.T(b5Var);
        this.f49251a.G.setTitle(b5Var.g());
        this.f49251a.G.setBorderColor(b5Var.e());
        this.f49251a.G.setTitleColor(b5Var.h());
        this.f49251a.G.setRippleOverlayColor(b5Var.f());
        this.f49251a.G.setRoundedButtonViewBackgroundColor(b5Var.d());
        Rect rect = new Rect();
        this.f49251a.H.getDrawingRect(rect);
        this.f49251a.H.setTouchDelegate(new TouchDelegate(rect, this.f49251a.G));
        this.f49251a.O.b(b5Var.l());
        LiveCatalogStreamerView liveCatalogStreamerView = this.f49251a.M;
        jo.p.g(liveCatalogStreamerView, "binding.liveStreamerView");
        liveCatalogStreamerView.c(b5Var.p(), b5Var.w(), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : b5Var.b(), (r13 & 16) != 0 ? null : b5Var.c());
        this.f49251a.u().setEnabled(b5Var.y());
        View u10 = this.f49251a.u();
        jo.p.g(u10, "binding.root");
        yd.g1.a(u10, new b(aVar));
        this.f49251a.M.setOnProfileClickListener(new c(aVar2));
        RoundedButtonView roundedButtonView = this.f49251a.G;
        jo.p.g(roundedButtonView, "binding.followButton");
        yd.g1.a(roundedButtonView, new d(aVar3));
    }
}
