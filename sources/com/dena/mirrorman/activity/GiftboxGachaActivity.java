package com.dena.mirrorman.activity;

import ae.k;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import be.e5;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.detail.GiftboxGachaTargetDetail;
import com.dena.mirrorman.net.api.response.GiftboxGachaExecuteResponse;
import com.dena.mirrorman.net.api.response.GiftboxGachaResult;
import da.j;
import gf.i0;
import gf.k0;
import ia.a;
import jo.f0;
import jo.p;
import jo.q;
import kq.a;
import nd.b1;
import nd.z0;
import nf.n;
import od.e0;
import od.m;
import uo.q0;
import uo.r0;
import xn.s;

/* loaded from: classes2.dex */
public final class GiftboxGachaActivity extends e.b implements qd.a, e5, q0 {
    public static final a U = new a(null);
    public static final int V = 8;
    public final /* synthetic */ j O = new j();
    public k P;
    public n Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, String str2) {
            p.h(context, "context");
            p.h(str, "referer");
            p.h(str2, "userGiftboxGachaId");
            Intent intent = new Intent(context, GiftboxGachaActivity.class);
            intent.putExtra("BUNDLE_KEY_REFERER", str);
            intent.putExtra("BUNDLE_KEY_USER_GIFTBOX_GACHA_ID", str2);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25109w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f25109w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f25109w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f25110w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25111x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25112y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f25113z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f25110w = aVar;
            this.f25111x = aVar2;
            this.f25112y = aVar3;
            this.f25113z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f25110w;
            vq.a aVar2 = this.f25111x;
            io.a aVar3 = this.f25112y;
            xq.a aVar4 = this.f25113z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(n.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25114w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f25114w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f25114w.U();
            p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<uq.a> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            String stringExtra = GiftboxGachaActivity.this.getIntent().getStringExtra("BUNDLE_KEY_REFERER");
            p.e(stringExtra);
            String stringExtra2 = GiftboxGachaActivity.this.getIntent().getStringExtra("BUNDLE_KEY_USER_GIFTBOX_GACHA_ID");
            p.e(stringExtra2);
            return uq.b.b(stringExtra, stringExtra2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements ia.a {

        /* loaded from: classes2.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ GiftboxGachaActivity f25117a;

            public a(GiftboxGachaActivity giftboxGachaActivity) {
                this.f25117a = giftboxGachaActivity;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                k kVar = this.f25117a.P;
                k kVar2 = null;
                if (kVar == null) {
                    p.v("binding");
                    kVar = null;
                }
                kVar.C.setVisibility(8);
                k kVar3 = this.f25117a.P;
                if (kVar3 == null) {
                    p.v("binding");
                } else {
                    kVar2 = kVar3;
                }
                kVar2.C.clearAnimation();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                a.C0469a.b(this, animation);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                a.C0469a.c(this, animation);
            }
        }

        public f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            GiftboxGachaActivity.this.a3().k().r(z0.f42350u2, k0.G0.a()).i();
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(800L);
            alphaAnimation.setInterpolator(new AccelerateInterpolator());
            alphaAnimation.setAnimationListener(new a(GiftboxGachaActivity.this));
            k kVar = GiftboxGachaActivity.this.P;
            if (kVar == null) {
                p.v("binding");
                kVar = null;
            }
            kVar.C.startAnimation(alphaAnimation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.C0469a.c(this, animation);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25118w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25119x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25120y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25118w = componentCallbacks;
            this.f25119x = aVar;
            this.f25120y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.m, java.lang.Object] */
        @Override // io.a
        public final m invoke() {
            ComponentCallbacks componentCallbacks = this.f25118w;
            return gq.a.a(componentCallbacks).c(f0.b(m.class), this.f25119x, this.f25120y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<e0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25121w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25122x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25123y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25121w = componentCallbacks;
            this.f25122x = aVar;
            this.f25123y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.e0] */
        @Override // io.a
        public final e0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25121w;
            return gq.a.a(componentCallbacks).c(f0.b(e0.class), this.f25122x, this.f25123y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25124w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25125x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25126y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25124w = componentCallbacks;
            this.f25125x = aVar;
            this.f25126y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f25124w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f25125x, this.f25126y);
        }
    }

    public GiftboxGachaActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.R = wn.g.b(iVar, new g(this, null, null));
        this.S = wn.g.b(iVar, new h(this, null, null));
        this.T = wn.g.b(iVar, new i(this, null, null));
    }

    public final e0 A3() {
        return (e0) this.S.getValue();
    }

    @Override // be.e5
    public void f(String str) {
        GiftboxGachaResult result;
        p.h(str, "text");
        m y32 = y3();
        n nVar = this.Q;
        n nVar2 = null;
        if (nVar == null) {
            p.v("store");
            nVar = null;
        }
        y32.j(nVar.r(), str);
        n nVar3 = this.Q;
        if (nVar3 == null) {
            p.v("store");
            nVar3 = null;
        }
        GiftboxGachaExecuteResponse o10 = nVar3.o();
        if (o10 == null || (result = o10.getResult()) == null) {
            return;
        }
        MRLogger z32 = z3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GIFT_BOX_GACHA_TWEET_DONE);
        n nVar4 = this.Q;
        if (nVar4 == null) {
            p.v("store");
        } else {
            nVar2 = nVar4;
        }
        builder.setTargetId(nVar2.t());
        builder.setPayload(s.m(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new GiftboxGachaTargetDetail(result.getGiftboxItemId(), result.getGiftboxGachaItemName()).toJson()), wn.q.a("text", str)));
        z32.sendLog(builder.build());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // qd.a
    public void h0() {
        k kVar = this.P;
        k kVar2 = null;
        if (kVar == null) {
            p.v("binding");
            kVar = null;
        }
        kVar.C.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setAnimationListener(new f());
        k kVar3 = this.P;
        if (kVar3 == null) {
            p.v("binding");
        } else {
            kVar2 = kVar3;
        }
        kVar2.C.startAnimation(alphaAnimation);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, b1.activity_giftbox_gacha);
        p.g(g10, "setContentView(this, R.l…t.activity_giftbox_gacha)");
        this.P = (k) g10;
        this.Q = (n) ((androidx.lifecycle.q0) new s0(f0.b(n.class), new d(this), new c(new b(this), null, new e(), gq.a.a(this))).getValue());
        a3().k().r(z0.f42350u2, i0.D0.a()).i();
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        A3().f();
        r0.d(this, null, 1, null);
        super.onDestroy();
    }

    public final m y3() {
        return (m) this.R.getValue();
    }

    public final MRLogger z3() {
        return (MRLogger) this.T.getValue();
    }
}
