package r8;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.catalog.LiveCatalogSmallStreamerView;
import com.dena.mirrativ.catalog.LivePreview;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.net.api.response.ThumbnailFrame;
import com.dena.mirrorman.net.api.response.live.LiveTag;
import sn.c;

/* loaded from: classes.dex */
public final class z extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f50116c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f50117d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t8.w0 f50118a;

    /* renamed from: b  reason: collision with root package name */
    public a0 f50119b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            t8.w0 T = t8.w0.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new z(T, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s8.h f50121x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s8.h hVar) {
            super(0);
            this.f50121x = hVar;
        }

        public final void a() {
            a0 a0Var = z.this.f50119b;
            if (a0Var != null) {
                a0Var.b(this.f50121x.b());
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public z(t8.w0 w0Var) {
        super(w0Var.u());
        this.f50118a = w0Var;
    }

    public /* synthetic */ z(t8.w0 w0Var, jo.h hVar) {
        this(w0Var);
    }

    public static final void g(z zVar, Boolean bool) {
        jo.p.h(zVar, "this$0");
        View view = zVar.f50118a.S;
        jo.p.g(view, "binding.newLiveBackgroundView");
        jo.p.g(bool, "it");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void h(z zVar, s8.h hVar, View view) {
        jo.p.h(zVar, "this$0");
        jo.p.h(hVar, "$bindModel");
        a0 a0Var = zVar.f50119b;
        if (a0Var != null) {
            a0Var.a(hVar.b(), zVar.getAdapterPosition());
        }
    }

    public static final boolean i(z zVar, View view, MotionEvent motionEvent) {
        jo.p.h(zVar, "this$0");
        int action = motionEvent.getAction();
        if (action == 0) {
            zVar.f50118a.u().startAnimation(AnimationUtils.loadAnimation(zVar.f50118a.u().getContext(), z0.live_catalog_item_scale_down_animation));
            return false;
        } else if (action == 1 || action == 3) {
            zVar.f50118a.u().startAnimation(AnimationUtils.loadAnimation(zVar.f50118a.u().getContext(), z0.live_catalog_item_scale_up_animation));
            return false;
        } else {
            return false;
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void f(final s8.h hVar, androidx.lifecycle.u uVar) {
        jo.p.h(hVar, "bindModel");
        jo.p.h(uVar, "lifecycleOwner");
        hVar.I().i(uVar, new androidx.lifecycle.f0() { // from class: r8.y
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                z.g(z.this, (Boolean) obj);
            }
        });
        AppCompatImageView appCompatImageView = this.f50118a.B;
        jo.p.g(appCompatImageView, "binding.appImageView");
        td.a.d(appCompatImageView, hVar.p());
        this.f50118a.R.setText(hVar.w());
        AppCompatTextView appCompatTextView = this.f50118a.X;
        appCompatTextView.setText(hVar.D() + " views");
        LiveBadgeView liveBadgeView = this.f50118a.I;
        jo.p.g(liveBadgeView, "binding.liveBadgeView");
        liveBadgeView.setVisibility(hVar.L() ? 0 : 8);
        this.f50118a.Q.b(hVar.v());
        this.f50118a.J.a(hVar.A(), hVar.E(), hVar.t(), hVar.m(), hVar.n());
        if (hVar.K()) {
            this.f50118a.Y.setVisibility(0);
            this.f50118a.f53274a0.setVisibility(0);
            this.f50118a.f53274a0.h(hVar.o(), de.m.a(this, 14), de.m.a(this, 4));
        } else {
            this.f50118a.Y.setVisibility(8);
            this.f50118a.f53274a0.setVisibility(8);
        }
        this.f50118a.T.setVisibility(hVar.M() ? 0 : 8);
        if (!hVar.l().isEmpty()) {
            this.f50118a.D.setVisibility(0);
            this.f50118a.F.h(hVar.l(), de.m.a(this, 12), de.m.a(this, 8));
        } else {
            this.f50118a.D.setVisibility(8);
        }
        LiveTag liveTag = (LiveTag) xn.a0.a0(hVar.u(), 0);
        if (liveTag != null) {
            this.f50118a.K.setVisibility(0);
            this.f50118a.K.a(liveTag);
        } else {
            this.f50118a.K.setVisibility(8);
        }
        LiveTag liveTag2 = (LiveTag) xn.a0.a0(hVar.u(), 1);
        if (liveTag2 != null) {
            this.f50118a.L.setVisibility(0);
            this.f50118a.L.a(liveTag2);
        } else {
            this.f50118a.L.setVisibility(8);
        }
        if (hVar.G()) {
            this.f50118a.R.setMaxLines(2);
            this.f50118a.M.setVisibility(0);
            this.f50118a.M.setText(hVar.r());
        } else {
            this.f50118a.M.setVisibility(8);
        }
        if (hVar.H()) {
            this.f50118a.N.setVisibility(0);
            this.f50118a.N.setText(hVar.s());
        } else {
            this.f50118a.N.setVisibility(8);
        }
        if (hVar.J()) {
            this.f50118a.R.setMaxLines(2);
            this.f50118a.Z.setVisibility(0);
            t8.w0 w0Var = this.f50118a;
            w0Var.Z.setText(w0Var.u().getContext().getString(h1.text_livegame_viewer_play_count, Integer.valueOf(hVar.F())));
        } else {
            this.f50118a.Z.setVisibility(8);
        }
        this.f50118a.o();
        this.f50118a.u().setOnClickListener(new View.OnClickListener() { // from class: r8.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.h(z.this, hVar, view);
            }
        });
        this.f50118a.J.setOnProfileClickListener(new b(hVar));
        AppCompatImageView appCompatImageView2 = this.f50118a.H;
        jo.p.g(appCompatImageView2, "binding.leftTopFrameImageView");
        ThumbnailFrame C = hVar.C();
        td.a.r(appCompatImageView2, C != null ? C.getLeftThumbnailImageUrl() : null, 12, (r19 & 8) != 0 ? null : null, (r19 & 16) != 0 ? null : Boolean.TRUE, (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? null : null, (r19 & 128) != 0 ? null : null);
        AppCompatImageView appCompatImageView3 = this.f50118a.V;
        jo.p.g(appCompatImageView3, "binding.rightBottomFrameImageView");
        ThumbnailFrame C2 = hVar.C();
        td.a.e(appCompatImageView3, C2 != null ? C2.getRightThumbnailImageUrl() : null);
        AppCompatImageView appCompatImageView4 = this.f50118a.U;
        jo.p.g(appCompatImageView4, "binding.rightBottomFrameAnimationImageView");
        ThumbnailFrame C3 = hVar.C();
        td.a.v(appCompatImageView4, C3 != null ? C3.getRightThumbnailAnimationUrl() : null);
        AppCompatImageView appCompatImageView5 = this.f50118a.C;
        jo.p.g(appCompatImageView5, "binding.avatarBodyImageView");
        td.a.f(appCompatImageView5, hVar.j());
        if (hVar.O()) {
            this.f50118a.W.setVisibility(0);
            AppCompatImageView appCompatImageView6 = this.f50118a.W;
            jo.p.g(appCompatImageView6, "binding.seasonClassIconImageView");
            td.a.v(appCompatImageView6, hVar.B());
            LiveCatalogSmallStreamerView liveCatalogSmallStreamerView = this.f50118a.J;
            ViewGroup.LayoutParams layoutParams = liveCatalogSmallStreamerView.getLayoutParams();
            jo.p.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.setMargins(de.m.a(this, 18), ((ViewGroup.MarginLayoutParams) bVar).topMargin, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
            liveCatalogSmallStreamerView.setLayoutParams(bVar);
        } else {
            this.f50118a.W.setVisibility(8);
            LiveCatalogSmallStreamerView liveCatalogSmallStreamerView2 = this.f50118a.J;
            ViewGroup.LayoutParams layoutParams2 = liveCatalogSmallStreamerView2.getLayoutParams();
            jo.p.f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.setMargins(de.m.a(this, 10), ((ViewGroup.MarginLayoutParams) bVar2).topMargin, ((ViewGroup.MarginLayoutParams) bVar2).rightMargin, ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin);
            liveCatalogSmallStreamerView2.setLayoutParams(bVar2);
        }
        if (hVar.N()) {
            this.f50118a.G.setBackgroundResource(d1.bg_live_small_s_class);
        } else {
            this.f50118a.G.setBackgroundResource(0);
        }
        LivePreview livePreview = this.f50118a.O;
        jo.p.g(livePreview, "binding.livePreview");
        String k10 = hVar.k();
        String y10 = hVar.y();
        String z10 = hVar.z();
        jf.j0 x10 = hVar.x();
        androidx.lifecycle.e0<Boolean> isPlaying = hVar.isPlaying();
        e8.h bitmapTransform = e8.h.bitmapTransform(new m7.f(new v7.i(), new sn.c(de.m.a(this, 12), 0, c.b.TOP_LEFT), new sn.c(de.m.a(this, 12), 0, c.b.BOTTOM_LEFT)));
        jo.p.g(bitmapTransform, "bitmapTransform(\n       …          )\n            )");
        livePreview.h(k10, y10, z10, x10, isPlaying, bitmapTransform, (r27 & 64) != 0 ? 0 : 0, (r27 & 128) != 0 ? 0 : de.m.a(this, 12), (r27 & 256) != 0 ? 0 : 0, (r27 & 512) != 0 ? 0 : de.m.a(this, 12), uVar);
        this.f50118a.u().setOnTouchListener(new View.OnTouchListener() { // from class: r8.x
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean i10;
                i10 = z.i(z.this, view, motionEvent);
                return i10;
            }
        });
    }

    public final void j(a0 a0Var) {
        jo.p.h(a0Var, "listener");
        this.f50119b = a0Var;
    }
}
