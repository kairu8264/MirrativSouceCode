package com.dena.mirrorman.customview;

import ae.yk;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.o;
import com.airbnb.lottie.LottieAnimationView;
import com.cookpad.puree.Puree;
import com.dena.mirrorman.clientlog.logs.BottomNavigation;
import com.dena.mirrorman.customview.MRBottomNavigationView;
import com.dena.mirrorman.net.api.Referer;
import io.l;
import java.io.File;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import nd.b1;
import nd.f1;
import nd.w0;
import nd.y0;
import nd.z0;
import o7.j;
import oq.a;
import wn.g;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class MRBottomNavigationView extends ConstraintLayout implements oq.a {
    public final wn.f U;
    public final yk V;
    public Integer W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f25510a0;

    /* loaded from: classes2.dex */
    public static final class a extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l<String, v> f25511w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ MRBottomNavigationView f25512x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super String, v> lVar, MRBottomNavigationView mRBottomNavigationView) {
            super(1);
            this.f25511w = lVar;
            this.f25512x = mRBottomNavigationView;
        }

        public final void a(View view) {
            p.h(view, "it");
            this.f25511w.invoke(this.f25512x.getWhere());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ NavController f25514x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NavController navController) {
            super(1);
            this.f25514x = navController;
        }

        public final void a(View view) {
            p.h(view, "it");
            if (!MRBottomNavigationView.this.z()) {
                Integer currentDestinationId = MRBottomNavigationView.this.getCurrentDestinationId();
                int i10 = z0.homeCatalogFragment;
                if (currentDestinationId != null && currentDestinationId.intValue() == i10) {
                    MRBottomNavigationView.this.getGlobalActionCreator().x();
                    return;
                }
            }
            g9.a aVar = g9.a.f32826a;
            aVar.i("BottomNavigator click : Dashboard at " + MRBottomNavigationView.this.getWhere());
            Puree.d(new BottomNavigation.LaunchTab(Referer.HOME_SELECT, MRBottomNavigationView.this.getWhere()));
            this.f25514x.m(z0.to_select);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ NavController f25516x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NavController navController) {
            super(1);
            this.f25516x = navController;
        }

        public final void a(View view) {
            p.h(view, "it");
            if (!MRBottomNavigationView.this.z()) {
                Integer currentDestinationId = MRBottomNavigationView.this.getCurrentDestinationId();
                int i10 = z0.followCatalogFragment;
                if (currentDestinationId != null && currentDestinationId.intValue() == i10) {
                    MRBottomNavigationView.this.getGlobalActionCreator().x();
                    return;
                }
            }
            g9.a aVar = g9.a.f32826a;
            aVar.i("BottomNavigator click : Following at " + MRBottomNavigationView.this.getWhere());
            Puree.d(new BottomNavigation.LaunchTab(Referer.HOME_FOLLOW, MRBottomNavigationView.this.getWhere()));
            this.f25516x.m(z0.to_follows);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ NavController f25518x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(NavController navController) {
            super(1);
            this.f25518x = navController;
        }

        public final void a(View view) {
            p.h(view, "it");
            if (!MRBottomNavigationView.this.z()) {
                Integer currentDestinationId = MRBottomNavigationView.this.getCurrentDestinationId();
                int i10 = z0.noticeFragment;
                if (currentDestinationId != null && currentDestinationId.intValue() == i10) {
                    MRBottomNavigationView.this.getGlobalActionCreator().x();
                    return;
                }
            }
            g9.a aVar = g9.a.f32826a;
            aVar.i("BottomNavigator click : Notice at " + MRBottomNavigationView.this.getWhere());
            Puree.d(new BottomNavigation.LaunchTab(Referer.NOTICE, MRBottomNavigationView.this.getWhere()));
            this.f25518x.m(z0.to_notice);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ NavController f25520x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(NavController navController) {
            super(1);
            this.f25520x = navController;
        }

        public final void a(View view) {
            p.h(view, "it");
            if (!MRBottomNavigationView.this.z()) {
                Integer currentDestinationId = MRBottomNavigationView.this.getCurrentDestinationId();
                int i10 = z0.liveGameFragment;
                if (currentDestinationId != null && currentDestinationId.intValue() == i10) {
                    MRBottomNavigationView.this.getGlobalActionCreator().x();
                    return;
                }
            }
            g9.a aVar = g9.a.f32826a;
            aVar.i("BottomNavigator click : Profile at " + MRBottomNavigationView.this.getWhere());
            Puree.d(new BottomNavigation.LaunchTab(Referer.LIVE_GAME, MRBottomNavigationView.this.getWhere()));
            this.f25520x.m(z0.to_live_game_listing);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f25521w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25522x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25523y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f25521w = aVar;
            this.f25522x = aVar2;
            this.f25523y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            xq.a b10;
            oq.a aVar = this.f25521w;
            vq.a aVar2 = this.f25522x;
            io.a<? extends uq.a> aVar3 = this.f25523y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(od.p.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MRBottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ MRBottomNavigationView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void F(NavController navController, MRBottomNavigationView mRBottomNavigationView, NavController navController2, o oVar, Bundle bundle) {
        p.h(navController, "$navController");
        p.h(mRBottomNavigationView, "this$0");
        p.h(navController2, "<anonymous parameter 0>");
        p.h(oVar, "destination");
        navController.t();
        if (oVar.r() == z0.myPageFragment) {
            mRBottomNavigationView.f25510a0 = true;
        } else {
            mRBottomNavigationView.f25510a0 = false;
            mRBottomNavigationView.W = Integer.valueOf(oVar.r());
        }
        Integer num = mRBottomNavigationView.W;
        int i10 = z0.homeCatalogFragment;
        if (num != null && num.intValue() == i10) {
            if (mRBottomNavigationView.D()) {
                return;
            }
            mRBottomNavigationView.E();
            mRBottomNavigationView.V.I.r();
            mRBottomNavigationView.V.K.setTextColor(c3.a.d(mRBottomNavigationView.getContext(), w0.f42242u0));
            return;
        }
        int i11 = z0.followCatalogFragment;
        if (num != null && num.intValue() == i11) {
            if (mRBottomNavigationView.A()) {
                return;
            }
            mRBottomNavigationView.E();
            mRBottomNavigationView.V.M.r();
            mRBottomNavigationView.V.O.setTextColor(c3.a.d(mRBottomNavigationView.getContext(), w0.f42242u0));
            return;
        }
        int i12 = z0.noticeFragment;
        if (num != null && num.intValue() == i12) {
            if (mRBottomNavigationView.C()) {
                return;
            }
            mRBottomNavigationView.E();
            mRBottomNavigationView.V.V.r();
            mRBottomNavigationView.V.X.setTextColor(c3.a.d(mRBottomNavigationView.getContext(), w0.f42242u0));
            return;
        }
        int i13 = z0.liveGameFragment;
        if (num != null && num.intValue() == i13) {
            if (mRBottomNavigationView.B()) {
                return;
            }
            mRBottomNavigationView.E();
            mRBottomNavigationView.V.T.setTextColor(c3.a.d(mRBottomNavigationView.getContext(), w0.f42242u0));
            mRBottomNavigationView.V.R.r();
            return;
        }
        mRBottomNavigationView.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final od.p getGlobalActionCreator() {
        return (od.p) this.U.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getWhere() {
        Integer num = this.W;
        int i10 = z0.homeCatalogFragment;
        if (num != null && num.intValue() == i10) {
            return Referer.HOME_SELECT;
        }
        int i11 = z0.followCatalogFragment;
        if (num != null && num.intValue() == i11) {
            return Referer.HOME_FOLLOW;
        }
        int i12 = z0.noticeFragment;
        if (num != null && num.intValue() == i12) {
            return Referer.NOTICE;
        }
        return (num != null && num.intValue() == z0.liveGameFragment) ? Referer.LIVE_GAME : "";
    }

    public final boolean A() {
        return !(this.V.M.getProgress() == 0.0f);
    }

    public final boolean B() {
        return !(this.V.R.getProgress() == 0.0f);
    }

    public final boolean C() {
        return !(this.V.V.getProgress() == 0.0f);
    }

    public final boolean D() {
        return !(this.V.I.getProgress() == 0.0f);
    }

    public final void E() {
        yk ykVar = this.V;
        LottieAnimationView lottieAnimationView = ykVar.I;
        lottieAnimationView.h();
        if (!(lottieAnimationView.getProgress() == 0.0f)) {
            lottieAnimationView.setProgress(0.0f);
        }
        LottieAnimationView lottieAnimationView2 = ykVar.M;
        lottieAnimationView2.h();
        if (!(lottieAnimationView2.getProgress() == 0.0f)) {
            lottieAnimationView2.setProgress(0.0f);
        }
        LottieAnimationView lottieAnimationView3 = ykVar.V;
        lottieAnimationView3.h();
        if (!(lottieAnimationView3.getProgress() == 0.0f)) {
            lottieAnimationView3.setProgress(0.0f);
        }
        LottieAnimationView lottieAnimationView4 = ykVar.R;
        lottieAnimationView4.h();
        if (!(lottieAnimationView4.getProgress() == 0.0f)) {
            lottieAnimationView4.setProgress(0.0f);
        }
        AppCompatTextView appCompatTextView = ykVar.K;
        Context context = getContext();
        int i10 = w0.f42230e0;
        appCompatTextView.setTextColor(c3.a.d(context, i10));
        ykVar.O.setTextColor(c3.a.d(getContext(), i10));
        ykVar.X.setTextColor(c3.a.d(getContext(), i10));
        ykVar.T.setTextColor(c3.a.d(getContext(), i10));
    }

    public final void G(boolean z10) {
        this.V.N.setVisibility(z10 ? 0 : 8);
    }

    public final void H(boolean z10) {
        this.V.S.setVisibility(z10 ? 0 : 8);
    }

    public final void I(boolean z10) {
        this.V.W.setVisibility(z10 ? 0 : 8);
    }

    public final Integer getCurrentDestinationId() {
        return this.W;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final void setBroadcastButtonEmomo(boolean z10) {
        yk ykVar = this.V;
        try {
            File file = new File(getContext().getCacheDir(), "/profile_image.png");
            if (file.exists()) {
                com.bumptech.glide.c.B(getContext()).m12load(file).diskCacheStrategy(j.f44186b).skipMemoryCache(true).apply((e8.a<?>) e8.h.circleCropTransform()).into(ykVar.E);
            } else {
                com.bumptech.glide.c.B(getContext()).m13load(Integer.valueOf(y0.bottom_tab_default_emomo)).apply((e8.a<?>) e8.h.circleCropTransform()).into(ykVar.E);
                ykVar.E.setBackground(c3.a.f(getContext(), y0.bg_bottom_tab_default_emomo));
            }
        } catch (Exception e10) {
            g9.a.c(e10);
            com.bumptech.glide.c.B(getContext()).m13load(Integer.valueOf(y0.bottom_tab_default_emomo)).apply((e8.a<?>) e8.h.circleCropTransform()).into(ykVar.E);
            ykVar.E.setBackground(c3.a.f(getContext(), y0.bg_bottom_tab_default_emomo));
        }
        ykVar.G.setText(getContext().getString(z10 ? f1.text_tab_live_streaming : f1.text_tab_broadcast_settings));
        ykVar.G.setTextColor(c3.a.d(getContext(), z10 ? w0.S : w0.f42230e0));
        ykVar.G.setTypeface(z10 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        AppCompatImageView appCompatImageView = ykVar.P;
        p.g(appCompatImageView, "iconLiveStreaming");
        appCompatImageView.setVisibility(z10 ? 0 : 8);
    }

    public final void setCurrentDestinationId(Integer num) {
        this.W = num;
    }

    public final void setMyPageOpen(boolean z10) {
        this.f25510a0 = z10;
    }

    public final void setOnClickBroadCastButtonListener(l<? super String, v> lVar) {
        p.h(lVar, "listener");
        AppCompatImageView appCompatImageView = this.V.E;
        p.g(appCompatImageView, "binding.broadcastBtnImageView");
        g1.a(appCompatImageView, new a(lVar, this));
    }

    public final void setTutorialCover(boolean z10) {
        BottomNavigationTutorialCoverView bottomNavigationTutorialCoverView = this.V.Y;
        p.g(bottomNavigationTutorialCoverView, "binding.tutorialCover");
        bottomNavigationTutorialCoverView.setVisibility(z10 ? 0 : 8);
        View view = this.V.D;
        p.g(view, "binding.bottomNavigationEdgeBorder");
        view.setVisibility(z10 ? 4 : 0);
        this.V.H.setEnabled(!z10);
        this.V.L.setEnabled(!z10);
        this.V.U.setEnabled(!z10);
        this.V.Q.setEnabled(!z10);
        this.V.E.setEnabled(!z10);
    }

    public final void setupWithNavController(final NavController navController) {
        p.h(navController, "navController");
        ConstraintLayout constraintLayout = this.V.H;
        p.g(constraintLayout, "binding.dashboardContainer");
        g1.a(constraintLayout, new b(navController));
        ConstraintLayout constraintLayout2 = this.V.L;
        p.g(constraintLayout2, "binding.followingContainer");
        g1.a(constraintLayout2, new c(navController));
        ConstraintLayout constraintLayout3 = this.V.U;
        p.g(constraintLayout3, "binding.noticeContainer");
        g1.a(constraintLayout3, new d(navController));
        ConstraintLayout constraintLayout4 = this.V.Q;
        p.g(constraintLayout4, "binding.liveGameContainer");
        g1.a(constraintLayout4, new e(navController));
        navController.a(new NavController.b() { // from class: yd.q0
            @Override // androidx.navigation.NavController.b
            public final void a(NavController navController2, androidx.navigation.o oVar, Bundle bundle) {
                MRBottomNavigationView.F(NavController.this, this, navController2, oVar, bundle);
            }
        });
    }

    public final boolean z() {
        return this.f25510a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRBottomNavigationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.U = g.b(cr.a.f28611a.b(), new f(this, null, null));
        this.V = (yk) androidx.databinding.f.e(LayoutInflater.from(context), b1.view_mr_bottom_navigation, this, true);
    }
}
