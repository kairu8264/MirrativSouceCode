package com.dena.mirrativ.catalog.groupshot;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import ce.x;
import com.dena.mirrativ.catalog.groupshot.GroupShotGalleryDetailActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.google.android.material.card.MaterialCardView;
import de.n;
import io.l;
import java.io.Serializable;
import java.util.HashMap;
import jo.f0;
import jo.p;
import jo.q;
import r8.b1;
import r8.f1;
import tj.k;
import tj.o;
import wn.v;
import xn.s;
import yd.g1;

/* loaded from: classes.dex */
public final class GroupShotGalleryDetailActivity extends e.b {
    public static final a U = new a(null);
    public static final int V = 8;
    public final wn.f O = wn.g.a(new b());
    public final wn.f P = wn.g.a(new c());
    public final wn.f Q;
    public final wn.f R;
    public int S;
    public float T;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, v8.g gVar, String str) {
            p.h(context, "context");
            p.h(gVar, "bindModel");
            p.h(str, "referer");
            Intent intent = new Intent(context, GroupShotGalleryDetailActivity.class);
            intent.putExtra("EXTRA_BIND_MODEL", gVar);
            intent.putExtra("EXTRA_PREV_REFERER", str);
            return intent;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<v8.g> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final v8.g invoke() {
            Serializable serializableExtra = GroupShotGalleryDetailActivity.this.getIntent().getSerializableExtra("EXTRA_BIND_MODEL");
            p.f(serializableExtra, "null cannot be cast to non-null type com.dena.mirrativ.catalog.groupshot.GroupShotGalleryDetailBindModel");
            return (v8.g) serializableExtra;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = GroupShotGalleryDetailActivity.this.getIntent().getStringExtra("EXTRA_PREV_REFERER");
            p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t8.c f20487a;

        public d(t8.c cVar) {
            this.f20487a = cVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            p.h(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            p.h(transition, "transition");
            this.f20487a.N.setVisibility(0);
            this.f20487a.F.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            this.f20487a.N.startAnimation(alphaAnimation);
            this.f20487a.F.startAnimation(alphaAnimation);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            p.h(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            p.h(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            p.h(transition, "transition");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements l<View, v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            GroupShotGalleryDetailActivity.this.onBackPressed();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements l<View, v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            GroupShotGalleryDetailActivity groupShotGalleryDetailActivity = GroupShotGalleryDetailActivity.this;
            tb.c B3 = groupShotGalleryDetailActivity.B3();
            GroupShotGalleryDetailActivity groupShotGalleryDetailActivity2 = GroupShotGalleryDetailActivity.this;
            groupShotGalleryDetailActivity.startActivity(B3.s(groupShotGalleryDetailActivity2, groupShotGalleryDetailActivity2.A3().g(), Referer.Broadcast.GROUPSHOT_GALLERY_DETAIL));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements l<View, v> {

        /* loaded from: classes.dex */
        public static final class a extends q implements l<Intent, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ GroupShotGalleryDetailActivity f20491w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GroupShotGalleryDetailActivity groupShotGalleryDetailActivity) {
                super(1);
                this.f20491w = groupShotGalleryDetailActivity;
            }

            public final void a(Intent intent) {
                p.h(intent, "it");
                this.f20491w.startActivity(intent);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Intent intent) {
                a(intent);
                return v.f59242a;
            }
        }

        public g() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            LiveBasicParams e10 = GroupShotGalleryDetailActivity.this.A3().e();
            if (e10 != null) {
                GroupShotGalleryDetailActivity groupShotGalleryDetailActivity = GroupShotGalleryDetailActivity.this;
                new x(groupShotGalleryDetailActivity, new a(groupShotGalleryDetailActivity)).a(e10, Referer.Broadcast.GROUPSHOT_GALLERY_DETAIL);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20492w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20493x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20494y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20492w = componentCallbacks;
            this.f20493x = aVar;
            this.f20494y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f20492w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f20493x, this.f20494y);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20495w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20496x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20497y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20495w = componentCallbacks;
            this.f20496x = aVar;
            this.f20497y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f20495w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f20496x, this.f20497y);
        }
    }

    public GroupShotGalleryDetailActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q = wn.g.b(iVar, new h(this, null, null));
        this.R = wn.g.b(iVar, new i(this, null, null));
    }

    public static final boolean H3(GroupShotGalleryDetailActivity groupShotGalleryDetailActivity, t8.c cVar, View view, MotionEvent motionEvent) {
        p.h(groupShotGalleryDetailActivity, "this$0");
        p.h(cVar, "$binding");
        float f10 = -Math.min(groupShotGalleryDetailActivity.T - motionEvent.getRawY(), 0.0f);
        int action = motionEvent.getAction();
        if (action == 0) {
            groupShotGalleryDetailActivity.S = groupShotGalleryDetailActivity.getWindow().getStatusBarColor();
            groupShotGalleryDetailActivity.T = motionEvent.getRawY();
            return true;
        } else if (action == 1) {
            if (Math.abs(f10) / cVar.u().getMeasuredHeight() > 0.1f) {
                groupShotGalleryDetailActivity.onBackPressed();
            } else {
                groupShotGalleryDetailActivity.T = 0.0f;
                groupShotGalleryDetailActivity.E3(cVar, 255);
                groupShotGalleryDetailActivity.getWindow().setStatusBarColor(groupShotGalleryDetailActivity.S);
                AppCompatImageView appCompatImageView = cVar.J;
                appCompatImageView.setTranslationY(0.0f);
                appCompatImageView.setScaleX(1.0f);
                appCompatImageView.setScaleY(1.0f);
            }
            return true;
        } else if (action != 2) {
            return false;
        } else {
            int min = 255 - ((int) (Math.min(Math.abs(f10) / (cVar.u().getMeasuredHeight() * 0.1f), 1.0f) * 255));
            groupShotGalleryDetailActivity.getWindow().setStatusBarColor(f3.a.k(groupShotGalleryDetailActivity.S, min));
            groupShotGalleryDetailActivity.E3(cVar, min);
            AppCompatImageView appCompatImageView2 = cVar.J;
            float max = Math.max(1.0f - (Math.abs(f10) / cVar.u().getMeasuredHeight()), 0.4f);
            appCompatImageView2.setTranslationY((appCompatImageView2.getMeasuredHeight() - (appCompatImageView2.getMeasuredHeight() * max)) / 2);
            appCompatImageView2.setScaleX(max);
            appCompatImageView2.setScaleY(max);
            return true;
        }
    }

    public final v8.g A3() {
        return (v8.g) this.O.getValue();
    }

    public final tb.c B3() {
        return (tb.c) this.R.getValue();
    }

    public final MRLogger C3() {
        return (MRLogger) this.Q.getValue();
    }

    public final String D3() {
        return (String) this.P.getValue();
    }

    public final void E3(t8.c cVar, int i10) {
        float f10 = i10 / 255.0f;
        getWindow().getDecorView().getBackground().setAlpha(i10);
        cVar.B.setAlpha(f10);
        cVar.M.setAlpha(f10);
        cVar.C.setAlpha(f10);
        cVar.N.setAlpha(f10);
        cVar.F.setAlpha(f10);
        cVar.O.setAlpha(f10);
        cVar.H.setAlpha(f10);
        cVar.P.setAlpha(f10);
    }

    public final void F3(t8.c cVar) {
        MaterialCardView materialCardView = cVar.G;
        int i10 = b1.f49836f;
        materialCardView.setCardBackgroundColor(getColor(i10));
        materialCardView.setCardElevation(0.0f);
        k.b a10 = k.a();
        p.g(materialCardView, "");
        materialCardView.setShapeAppearanceModel(a10.p(new tj.a(n.b(materialCardView, 12))).A(new o(n.b(materialCardView, 8), false)).m());
        td.a aVar = td.a.f53592a;
        AppCompatImageView appCompatImageView = cVar.J;
        String d10 = A3().d();
        p.g(appCompatImageView, "groupShotImageView");
        td.a.t(appCompatImageView, d10, 12, 3, Integer.valueOf(i10));
        if (!A3().a().isEmpty()) {
            cVar.E.h(A3().a(), de.a.b(this, 12), de.a.b(this, 8));
        }
        Transition sharedElementEnterTransition = getWindow().getSharedElementEnterTransition();
        p.g(sharedElementEnterTransition, "window.sharedElementEnterTransition");
        sharedElementEnterTransition.addListener(new d(cVar));
        startPostponedEnterTransition();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void G3(final t8.c cVar) {
        cVar.u().setOnTouchListener(new View.OnTouchListener() { // from class: v8.f
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean H3;
                H3 = GroupShotGalleryDetailActivity.H3(GroupShotGalleryDetailActivity.this, cVar, view, motionEvent);
                return H3;
            }
        });
        AppCompatImageView appCompatImageView = cVar.B;
        p.g(appCompatImageView, "binding.closeButtonView");
        g1.a(appCompatImageView, new e());
        AppCompatImageView appCompatImageView2 = cVar.N;
        p.g(appCompatImageView2, "binding.profileImageView");
        g1.a(appCompatImageView2, new f());
        RoundedButtonView roundedButtonView = cVar.P;
        p.g(roundedButtonView, "binding.watchLiveButton");
        g1.a(roundedButtonView, new g());
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, f1.activity_group_shot_gallery_detail);
        p.g(g10, "setContentView(this, R.l…roup_shot_gallery_detail)");
        t8.c cVar = (t8.c) g10;
        cVar.T(A3());
        F3(cVar);
        G3(cVar);
        MRLogger C3 = C3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GROUPSHOT_GALLERY_DETAIL);
        builder.setPageId(Referer.Broadcast.GROUPSHOT_GALLERY_DETAIL);
        builder.setTargetId(A3().getId());
        builder.setTargetType(A3().i() ? MRLog.TARGET_TYPE_LIVE : null);
        wn.k[] kVarArr = new wn.k[2];
        xm.e eVar = new xm.e();
        HashMap hashMap = new HashMap();
        hashMap.put("text", A3().c());
        LiveBasicParams e10 = A3().e();
        if (e10 != null) {
            hashMap.put("groupshot_live_id", e10.getLiveId());
            hashMap.put("groupshot_cast_id", A3().g());
        }
        v vVar = v.f59242a;
        kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar.s(hashMap));
        kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_WHERE, D3());
        builder.setPayload(s.m(kVarArr));
        C3.sendLog(builder.build());
    }
}
