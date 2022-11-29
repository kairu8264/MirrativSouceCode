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
import com.dena.mirrativ.catalog.LivePreview;
import com.dena.mirrorman.customview.FollowingLabelView;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.LiveCatalogStreamerView;
import com.dena.mirrorman.net.api.response.ThumbnailFrame;
import com.dena.mirrorman.net.api.response.live.LiveTag;
import com.dena.mirrorman.net.api.response.live.UserAppStatus;
import sn.c;

/* loaded from: classes.dex */
public final class u extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f50030c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f50031d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t8.u0 f50032a;

    /* renamed from: b  reason: collision with root package name */
    public v f50033b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            t8.u0 T = t8.u0.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new u(T, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s8.g f50035x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s8.g gVar) {
            super(0);
            this.f50035x = gVar;
        }

        public final void a() {
            v vVar = u.this.f50033b;
            if (vVar != null) {
                vVar.b(this.f50035x.b());
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public u(t8.u0 u0Var) {
        super(u0Var.u());
        this.f50032a = u0Var;
    }

    public /* synthetic */ u(t8.u0 u0Var, jo.h hVar) {
        this(u0Var);
    }

    public static final void i(u uVar, s8.g gVar, View view) {
        jo.p.h(uVar, "this$0");
        jo.p.h(gVar, "$bindModel");
        v vVar = uVar.f50033b;
        if (vVar != null) {
            vVar.a(gVar.b(), uVar.getAdapterPosition());
        }
        uVar.f50032a.u().clearAnimation();
    }

    public static final boolean j(u uVar, View view, MotionEvent motionEvent) {
        jo.p.h(uVar, "this$0");
        int action = motionEvent.getAction();
        if (action == 0) {
            uVar.f50032a.u().startAnimation(AnimationUtils.loadAnimation(uVar.f50032a.u().getContext(), z0.live_catalog_item_scale_down_animation));
            return false;
        } else if (action == 1 || action == 3) {
            uVar.f50032a.u().startAnimation(AnimationUtils.loadAnimation(uVar.f50032a.u().getContext(), z0.live_catalog_item_scale_up_animation));
            return false;
        } else {
            return false;
        }
    }

    public final void d(s8.g gVar, androidx.lifecycle.u uVar) {
        jo.p.h(gVar, "bindModel");
        jo.p.h(uVar, "lifecycleOwner");
        g(gVar, uVar);
        h(gVar);
        this.f50032a.o();
    }

    public final void f(v vVar) {
        jo.p.h(vVar, "listener");
        this.f50033b = vVar;
    }

    @SuppressLint({"SetTextI18n"})
    public final void g(s8.g gVar, androidx.lifecycle.u uVar) {
        FollowingLabelView followingLabelView = this.f50032a.I;
        jo.p.g(followingLabelView, "binding.followingTextView");
        followingLabelView.setVisibility(gVar.o() ? 0 : 8);
        AppCompatImageView appCompatImageView = this.f50032a.B;
        jo.p.g(appCompatImageView, "binding.appImageView");
        td.a.d(appCompatImageView, gVar.q());
        this.f50032a.S.setText(gVar.w());
        AppCompatTextView appCompatTextView = this.f50032a.f53267b0;
        appCompatTextView.setText(gVar.C() + " views");
        LiveBadgeView liveBadgeView = this.f50032a.L;
        jo.p.g(liveBadgeView, "binding.liveBadgeView");
        liveBadgeView.setVisibility(gVar.t() ? 0 : 8);
        this.f50032a.R.b(gVar.v());
        LiveCatalogStreamerView liveCatalogStreamerView = this.f50032a.M;
        jo.p.g(liveCatalogStreamerView, "binding.liveCatalogStreamerView");
        liveCatalogStreamerView.c(gVar.z(), gVar.E(), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : gVar.m(), (r13 & 16) != 0 ? null : gVar.n());
        if (!gVar.p().isEmpty()) {
            this.f50032a.f53270e0.setVisibility(0);
            this.f50032a.f53270e0.h(gVar.p(), de.m.a(this, 14), de.m.a(this, 4));
        } else {
            this.f50032a.f53270e0.setVisibility(8);
        }
        if (!gVar.l().isEmpty()) {
            this.f50032a.E.setVisibility(0);
            this.f50032a.G.h(gVar.l(), de.m.a(this, 16), de.m.a(this, 9));
        } else {
            this.f50032a.E.setVisibility(8);
        }
        UserAppStatus userAppStatus = (UserAppStatus) xn.a0.a0(gVar.D(), 0);
        if (userAppStatus != null) {
            this.f50032a.f53268c0.setVisibility(0);
            this.f50032a.f53268c0.a(userAppStatus);
        } else {
            this.f50032a.f53268c0.setVisibility(8);
        }
        UserAppStatus userAppStatus2 = (UserAppStatus) xn.a0.a0(gVar.D(), 1);
        if (userAppStatus2 != null) {
            this.f50032a.f53269d0.setVisibility(0);
            this.f50032a.f53269d0.a(userAppStatus2);
        } else {
            this.f50032a.f53269d0.setVisibility(8);
        }
        LiveTag liveTag = (LiveTag) xn.a0.a0(gVar.u(), 0);
        if (liveTag != null) {
            this.f50032a.N.setVisibility(0);
            this.f50032a.N.a(liveTag);
        } else {
            this.f50032a.N.setVisibility(8);
        }
        LiveTag liveTag2 = (LiveTag) xn.a0.a0(gVar.u(), 1);
        if (liveTag2 != null) {
            this.f50032a.O.setVisibility(0);
            this.f50032a.O.a(liveTag2);
        } else {
            this.f50032a.O.setVisibility(8);
        }
        this.f50032a.J.setVisibility(gVar.F() ? 0 : 8);
        this.f50032a.T.setVisibility(gVar.G() ? 0 : 8);
        this.f50032a.V.setVisibility(gVar.H() ? 0 : 8);
        s8.k a10 = gVar.a();
        if (a10 != null) {
            this.f50032a.V.setBackground(a10.a());
            AppCompatImageView appCompatImageView2 = this.f50032a.W;
            jo.p.g(appCompatImageView2, "binding.recommendImageView");
            td.a.v(appCompatImageView2, a10.b());
            this.f50032a.X.setText(a10.c());
            this.f50032a.X.setTextColor(a10.d());
        }
        AppCompatImageView appCompatImageView3 = this.f50032a.K;
        jo.p.g(appCompatImageView3, "binding.leftTopFrameImageView");
        ThumbnailFrame B = gVar.B();
        String leftThumbnailImageUrl = B != null ? B.getLeftThumbnailImageUrl() : null;
        Boolean bool = Boolean.TRUE;
        td.a.r(appCompatImageView3, leftThumbnailImageUrl, 12, (r19 & 8) != 0 ? null : null, (r19 & 16) != 0 ? null : bool, (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? null : null, (r19 & 128) != 0 ? null : null);
        AppCompatImageView appCompatImageView4 = this.f50032a.Z;
        jo.p.g(appCompatImageView4, "binding.rightBottomFrameImageView");
        ThumbnailFrame B2 = gVar.B();
        td.a.e(appCompatImageView4, B2 != null ? B2.getRightThumbnailImageUrl() : null);
        AppCompatImageView appCompatImageView5 = this.f50032a.Y;
        jo.p.g(appCompatImageView5, "binding.rightBottomFrameAnimationImageView");
        ThumbnailFrame B3 = gVar.B();
        td.a.v(appCompatImageView5, B3 != null ? B3.getRightThumbnailAnimationUrl() : null);
        td.a aVar = td.a.f53592a;
        AppCompatImageView appCompatImageView6 = this.f50032a.C;
        String j10 = gVar.j();
        jo.p.g(appCompatImageView6, "avatarBodyImageView");
        td.a.r(appCompatImageView6, j10, 12, (r19 & 8) != 0 ? null : Boolean.FALSE, (r19 & 16) != 0 ? null : null, (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? null : bool, (r19 & 128) != 0 ? null : null);
        if (gVar.J()) {
            this.f50032a.f53266a0.setVisibility(0);
            AppCompatImageView appCompatImageView7 = this.f50032a.f53266a0;
            jo.p.g(appCompatImageView7, "binding.seasonClassIconImageView");
            td.a.v(appCompatImageView7, gVar.A());
            LiveCatalogStreamerView liveCatalogStreamerView2 = this.f50032a.M;
            ViewGroup.LayoutParams layoutParams = liveCatalogStreamerView2.getLayoutParams();
            jo.p.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.setMargins(de.m.a(this, 12), ((ViewGroup.MarginLayoutParams) bVar).topMargin, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
            liveCatalogStreamerView2.setLayoutParams(bVar);
        } else {
            this.f50032a.f53266a0.setVisibility(8);
            LiveCatalogStreamerView liveCatalogStreamerView3 = this.f50032a.M;
            ViewGroup.LayoutParams layoutParams2 = liveCatalogStreamerView3.getLayoutParams();
            jo.p.f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.setMargins(0, ((ViewGroup.MarginLayoutParams) bVar2).topMargin, ((ViewGroup.MarginLayoutParams) bVar2).rightMargin, ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin);
            liveCatalogStreamerView3.setLayoutParams(bVar2);
        }
        if (gVar.I()) {
            this.f50032a.H.setBackgroundResource(d1.bg_live_large_s_class);
        } else {
            this.f50032a.H.setBackgroundResource(0);
        }
        LivePreview livePreview = this.f50032a.P;
        jo.p.g(livePreview, "binding.livePreview");
        String k10 = gVar.k();
        String r10 = gVar.r();
        String y10 = gVar.y();
        jf.j0 x10 = gVar.x();
        androidx.lifecycle.e0<Boolean> isPlaying = gVar.isPlaying();
        e8.h bitmapTransform = e8.h.bitmapTransform(new m7.f(new v7.i(), new sn.c(de.m.a(this, 12), 0, c.b.TOP_LEFT), new sn.c(de.m.a(this, 12), 0, c.b.TOP_RIGHT)));
        jo.p.g(bitmapTransform, "bitmapTransform(\n       …          )\n            )");
        livePreview.h(k10, r10, y10, x10, isPlaying, bitmapTransform, (r27 & 64) != 0 ? 0 : de.m.a(this, 12), (r27 & 128) != 0 ? 0 : 0, (r27 & 256) != 0 ? 0 : de.m.a(this, 12), (r27 & 512) != 0 ? 0 : 0, uVar);
    }

    public final void h(final s8.g gVar) {
        this.f50032a.u().setOnClickListener(new View.OnClickListener() { // from class: r8.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.i(u.this, gVar, view);
            }
        });
        this.f50032a.M.setOnProfileClickListener(new b(gVar));
        this.f50032a.u().setOnTouchListener(new View.OnTouchListener() { // from class: r8.t
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean j10;
                j10 = u.j(u.this, view, motionEvent);
                return j10;
            }
        });
    }
}
