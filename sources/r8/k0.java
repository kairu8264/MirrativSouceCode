package r8;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.LiveCatalogStreamerView;
import com.dena.mirrorman.net.api.response.ThumbnailFrame;
import com.dena.mirrorman.net.api.response.live.UserAppStatus;

/* loaded from: classes.dex */
public final class k0 extends RecyclerView.e0 {

    /* renamed from: e  reason: collision with root package name */
    public static final b f49950e = new b(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f49951f = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t8.a1 f49952a;

    /* renamed from: b  reason: collision with root package name */
    public int f49953b;

    /* renamed from: c  reason: collision with root package name */
    public s8.j f49954c;

    /* renamed from: d  reason: collision with root package name */
    public l0 f49955d;

    /* loaded from: classes.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            k0.this.f49952a.N.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int width = (k0.this.f49952a.N.getWidth() + de.m.a(k0.this, 2)) / de.m.a(k0.this, 18);
            RecyclerView.p layoutManager = k0.this.f49952a.N.getLayoutManager();
            jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            ((GridLayoutManager) layoutManager).n3(width);
            k0.this.f49953b = width;
            k0.this.l();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }

        public final k0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            t8.a1 T = t8.a1.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new k0(T, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s8.j f49958x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s8.j jVar) {
            super(0);
            this.f49958x = jVar;
        }

        public final void a() {
            l0 l0Var = k0.this.f49955d;
            if (l0Var != null) {
                l0Var.b(this.f49958x.b());
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public k0(t8.a1 a1Var) {
        super(a1Var.u());
        this.f49952a = a1Var;
        a1Var.N.setLayoutManager(new GridLayoutManager(a1Var.u().getContext(), 10));
        a1Var.N.setAdapter(new b9.b());
        a1Var.N.g(new p001if.c(de.m.a(this, 2), 0, 0, 0, 0, 0, 32, null));
        a1Var.N.setAdapter(new b9.b());
        a1Var.N.getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    public /* synthetic */ k0(t8.a1 a1Var, jo.h hVar) {
        this(a1Var);
    }

    public static final void i(k0 k0Var, s8.j jVar, View view) {
        jo.p.h(k0Var, "this$0");
        jo.p.h(jVar, "$bindModel");
        l0 l0Var = k0Var.f49955d;
        if (l0Var != null) {
            l0Var.a(jVar.b(), k0Var.getAdapterPosition());
        }
    }

    public static final boolean j(k0 k0Var, View view, MotionEvent motionEvent) {
        jo.p.h(k0Var, "this$0");
        int action = motionEvent.getAction();
        if (action == 0) {
            k0Var.f49952a.u().startAnimation(AnimationUtils.loadAnimation(k0Var.f49952a.u().getContext(), z0.live_catalog_item_scale_down_animation));
            return false;
        } else if (action == 1 || action == 3) {
            k0Var.f49952a.u().startAnimation(AnimationUtils.loadAnimation(k0Var.f49952a.u().getContext(), z0.live_catalog_item_scale_up_animation));
            return false;
        } else {
            return false;
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void h(final s8.j jVar) {
        jo.p.h(jVar, "bindModel");
        this.f49954c = jVar;
        View view = this.f49952a.G;
        jo.p.g(view, "binding.newLiveBackgroundView");
        view.setVisibility(jVar.w() ? 0 : 8);
        AppCompatImageView appCompatImageView = this.f49952a.H;
        jo.p.g(appCompatImageView, "binding.previewImageView");
        td.a.g(appCompatImageView, jVar.o());
        AppCompatTextView appCompatTextView = this.f49952a.K;
        appCompatTextView.setText(jVar.s() + " views");
        this.f49952a.F.b(jVar.n());
        LiveCatalogStreamerView liveCatalogStreamerView = this.f49952a.E;
        jo.p.g(liveCatalogStreamerView, "binding.liveCatalogStreamerView");
        liveCatalogStreamerView.c(jVar.p(), jVar.u(), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : jVar.k(), (r13 & 16) != 0 ? null : jVar.l());
        AppCompatImageView appCompatImageView2 = this.f49952a.C;
        jo.p.g(appCompatImageView2, "binding.leftTopFrameImageView");
        ThumbnailFrame r10 = jVar.r();
        td.a.r(appCompatImageView2, r10 != null ? r10.getLeftThumbnailImageUrl() : null, 12, (r19 & 8) != 0 ? null : null, (r19 & 16) != 0 ? null : Boolean.TRUE, (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? null : null, (r19 & 128) != 0 ? null : null);
        AppCompatImageView appCompatImageView3 = this.f49952a.J;
        jo.p.g(appCompatImageView3, "binding.rightBottomFrameImageView");
        ThumbnailFrame r11 = jVar.r();
        td.a.e(appCompatImageView3, r11 != null ? r11.getRightThumbnailImageUrl() : null);
        AppCompatImageView appCompatImageView4 = this.f49952a.I;
        jo.p.g(appCompatImageView4, "binding.rightBottomFrameAnimationImageView");
        ThumbnailFrame r12 = jVar.r();
        td.a.v(appCompatImageView4, r12 != null ? r12.getRightThumbnailAnimationUrl() : null);
        AppCompatImageView appCompatImageView5 = this.f49952a.B;
        jo.p.g(appCompatImageView5, "binding.avatarBodyImageView");
        td.a.f(appCompatImageView5, jVar.j());
        UserAppStatus userAppStatus = (UserAppStatus) xn.a0.a0(jVar.t(), 0);
        if (userAppStatus != null) {
            this.f49952a.L.setVisibility(0);
            this.f49952a.L.a(userAppStatus);
        } else {
            this.f49952a.L.setVisibility(8);
        }
        UserAppStatus userAppStatus2 = (UserAppStatus) xn.a0.a0(jVar.t(), 1);
        if (userAppStatus2 != null) {
            this.f49952a.M.setVisibility(0);
            this.f49952a.M.a(userAppStatus2);
        } else {
            this.f49952a.M.setVisibility(8);
        }
        l();
        this.f49952a.o();
        this.f49952a.u().setOnClickListener(new View.OnClickListener() { // from class: r8.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                k0.i(k0.this, jVar, view2);
            }
        });
        this.f49952a.E.setOnProfileClickListener(new c(jVar));
        this.f49952a.u().setOnTouchListener(new View.OnTouchListener() { // from class: r8.j0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean j10;
                j10 = k0.j(k0.this, view2, motionEvent);
                return j10;
            }
        });
    }

    public final void k(l0 l0Var) {
        jo.p.h(l0Var, "listener");
        this.f49955d = l0Var;
    }

    public final void l() {
        RecyclerView.h adapter = this.f49952a.N.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.catalog.privatelive.PrivateLiveCatalogViewerAdapter");
        b9.b bVar = (b9.b) adapter;
        s8.j jVar = this.f49954c;
        if (jVar == null) {
            return;
        }
        int i10 = this.f49953b * (jVar.t().isEmpty() ? 3 : 2);
        if (i10 > 0 && jVar.v().size() > i10) {
            bVar.a(xn.a0.o0(jVar.v().subList(0, i10 - 1), xn.r.d(new s8.m(null, 1, null))));
        } else if (jVar.q()) {
            bVar.a(xn.a0.o0(jVar.v(), xn.r.d(new s8.m(null, 1, null))));
        } else {
            bVar.a(jVar.v());
        }
    }
}
