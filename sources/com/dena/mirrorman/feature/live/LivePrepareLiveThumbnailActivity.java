package com.dena.mirrorman.feature.live;

import ae.s;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.feature.live.LivePrepareLiveThumbnailActivity;
import com.dena.mirrorman.net.api.Referer;
import jo.f0;
import jo.p;
import jo.q;
import kf.m;
import nd.a0;
import nd.b1;
import nd.f1;
import nd.g1;
import od.x;
import of.n;
import tb.c;
import xn.r;

/* loaded from: classes2.dex */
public final class LivePrepareLiveThumbnailActivity extends e.b {
    public static final a Y = new a(null);
    public static final int Z = 8;
    public final wn.f O;
    public final wn.f P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public s V;
    public final androidx.activity.result.c<Intent> W;
    public final androidx.activity.result.c<Intent> X;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, int i10, String str2, Uri uri) {
            p.h(context, "context");
            p.h(str, "referer");
            p.h(str2, "liveId");
            Intent intent = new Intent(context, LivePrepareLiveThumbnailActivity.class);
            intent.putExtra("BUNDLE_KEY_REFERER", str);
            intent.putExtra("extra_launch_type", i10);
            intent.putExtra("BUNDLE_KEY_LIVE_ID", str2);
            intent.putExtra("BUNDLE_KEY_IMAGE_URI", uri);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(LivePrepareLiveThumbnailActivity.this.getIntent().getParcelableExtra("BUNDLE_KEY_IMAGE_URI") != null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25843w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25844x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25845y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25843w = componentCallbacks;
            this.f25844x = aVar;
            this.f25845y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f25843w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f25844x, this.f25845y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25846w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25847x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25848y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25846w = componentCallbacks;
            this.f25847x = aVar;
            this.f25848y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final m invoke() {
            ComponentCallbacks componentCallbacks = this.f25846w;
            return gq.a.a(componentCallbacks).c(f0.b(m.class), this.f25847x, this.f25848y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25849w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25850x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25851y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25849w = componentCallbacks;
            this.f25850x = aVar;
            this.f25851y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            ComponentCallbacks componentCallbacks = this.f25849w;
            return gq.a.a(componentCallbacks).c(f0.b(od.b.class), this.f25850x, this.f25851y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25852w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25853x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25854y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25852w = componentCallbacks;
            this.f25853x = aVar;
            this.f25854y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.x] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f25852w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f25853x, this.f25854y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<nf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25855w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25856x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25857y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25855w = componentCallbacks;
            this.f25856x = aVar;
            this.f25857y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.x, java.lang.Object] */
        @Override // io.a
        public final nf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f25855w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.x.class), this.f25856x, this.f25857y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25858w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25859x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25860y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25858w = componentCallbacks;
            this.f25859x = aVar;
            this.f25860y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f25858w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f25859x, this.f25860y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<uq.a> {
        public i() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            String stringExtra = LivePrepareLiveThumbnailActivity.this.getIntent().getStringExtra("BUNDLE_KEY_REFERER");
            p.e(stringExtra);
            String stringExtra2 = LivePrepareLiveThumbnailActivity.this.getIntent().getStringExtra("BUNDLE_KEY_LIVE_ID");
            p.e(stringExtra2);
            return uq.b.b(stringExtra, Integer.valueOf(LivePrepareLiveThumbnailActivity.this.getIntent().getIntExtra("extra_launch_type", 0)), stringExtra2);
        }
    }

    public LivePrepareLiveThumbnailActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.O = wn.g.b(iVar, new c(this, null, null));
        this.P = wn.g.b(iVar, new d(this, null, null));
        this.Q = wn.g.b(iVar, new e(this, null, null));
        this.R = wn.g.b(iVar, new f(this, null, null));
        this.S = wn.g.b(iVar, new g(this, null, new i()));
        this.T = wn.g.b(iVar, new h(this, null, null));
        this.U = wn.g.a(new b());
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: ne.f
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                LivePrepareLiveThumbnailActivity.I3(LivePrepareLiveThumbnailActivity.this, (androidx.activity.result.a) obj);
            }
        });
        p.g(V2, "registerForActivityResul… finish()\n        }\n    }");
        this.W = V2;
        androidx.activity.result.c<Intent> V22 = V2(new c.c(), new androidx.activity.result.b() { // from class: ne.e
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                LivePrepareLiveThumbnailActivity.F3(LivePrepareLiveThumbnailActivity.this, (androidx.activity.result.a) obj);
            }
        });
        p.g(V22, "registerForActivityResul… finish()\n        }\n    }");
        this.X = V22;
    }

    public static final void F3(LivePrepareLiveThumbnailActivity livePrepareLiveThumbnailActivity, androidx.activity.result.a aVar) {
        Uri data;
        p.h(livePrepareLiveThumbnailActivity, "this$0");
        if (aVar.b() == -1) {
            livePrepareLiveThumbnailActivity.K3().J();
            Intent a10 = aVar.a();
            if (a10 != null && (data = a10.getData()) != null) {
                Intent c10 = c.a.c(livePrepareLiveThumbnailActivity.L3(), livePrepareLiveThumbnailActivity, data, 16.0f, 9.0f, false, 16, null);
                if (c10.resolveActivity(livePrepareLiveThumbnailActivity.getApplicationContext().getPackageManager()) != null) {
                    livePrepareLiveThumbnailActivity.W.a(c10);
                }
            }
        }
        if (livePrepareLiveThumbnailActivity.P3()) {
            livePrepareLiveThumbnailActivity.finish();
        }
    }

    public static final void H3(LivePrepareLiveThumbnailActivity livePrepareLiveThumbnailActivity, DialogInterface dialogInterface, int i10) {
        p.h(livePrepareLiveThumbnailActivity, "this$0");
        livePrepareLiveThumbnailActivity.J3().d(livePrepareLiveThumbnailActivity.O3().j(), livePrepareLiveThumbnailActivity.O3().i());
    }

    public static final void I3(LivePrepareLiveThumbnailActivity livePrepareLiveThumbnailActivity, androidx.activity.result.a aVar) {
        Uri uri;
        p.h(livePrepareLiveThumbnailActivity, "this$0");
        if (aVar.b() == -1) {
            Intent a10 = aVar.a();
            if (a10 != null && (uri = (Uri) a10.getParcelableExtra("EXTRA_CROPPED_IMAGE_SOURCE")) != null) {
                livePrepareLiveThumbnailActivity.J3().e(livePrepareLiveThumbnailActivity.P3() ? Referer.Broadcast.GROUPSHOT : Referer.BROADCAST, livePrepareLiveThumbnailActivity.O3().i(), uri);
            }
            if (livePrepareLiveThumbnailActivity.P3()) {
                if (livePrepareLiveThumbnailActivity.O3().k().f() != null) {
                    dq.c.c().l(new a0());
                }
                MRLogger N3 = livePrepareLiveThumbnailActivity.N3();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GROUPSHOT_THUMBNAIL_SET);
                builder.setTargetId(MRLog.TARGET_ID_TAP);
                builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, livePrepareLiveThumbnailActivity.M3().b())));
                N3.sendLog(builder.build());
                n.A(livePrepareLiveThumbnailActivity.getApplicationContext(), f1.text_complete_set_broadcast_thumbnail, false);
            }
        }
        if (livePrepareLiveThumbnailActivity.P3()) {
            livePrepareLiveThumbnailActivity.finish();
        }
    }

    public static final void Q3(LivePrepareLiveThumbnailActivity livePrepareLiveThumbnailActivity, Boolean bool) {
        p.h(livePrepareLiveThumbnailActivity, "this$0");
        s sVar = livePrepareLiveThumbnailActivity.V;
        if (sVar == null) {
            p.v("binding");
            sVar = null;
        }
        StatusView statusView = sVar.J;
        p.g(bool, "it");
        statusView.b(bool.booleanValue() ? StatusView.b.C0181b.f20790w : StatusView.b.c.f20791w);
    }

    public static final void R3(LivePrepareLiveThumbnailActivity livePrepareLiveThumbnailActivity, View view) {
        p.h(livePrepareLiveThumbnailActivity, "this$0");
        livePrepareLiveThumbnailActivity.finish();
    }

    public static final void S3(LivePrepareLiveThumbnailActivity livePrepareLiveThumbnailActivity, View view) {
        p.h(livePrepareLiveThumbnailActivity, "this$0");
        livePrepareLiveThumbnailActivity.V3();
    }

    public static final void T3(LivePrepareLiveThumbnailActivity livePrepareLiveThumbnailActivity, View view) {
        p.h(livePrepareLiveThumbnailActivity, "this$0");
        livePrepareLiveThumbnailActivity.G3();
    }

    public static final void U3(LivePrepareLiveThumbnailActivity livePrepareLiveThumbnailActivity, String str) {
        p.h(livePrepareLiveThumbnailActivity, "this$0");
        s sVar = livePrepareLiveThumbnailActivity.V;
        s sVar2 = null;
        if (sVar == null) {
            p.v("binding");
            sVar = null;
        }
        AppCompatImageView appCompatImageView = sVar.L;
        p.g(appCompatImageView, "binding.thumbnailImageView");
        td.a.m(appCompatImageView, str);
        s sVar3 = livePrepareLiveThumbnailActivity.V;
        if (sVar3 == null) {
            p.v("binding");
            sVar3 = null;
        }
        AppCompatTextView appCompatTextView = sVar3.I;
        p.g(appCompatTextView, "binding.notsetTitle");
        p.g(str, "it");
        appCompatTextView.setVisibility(str.length() == 0 ? 0 : 8);
        s sVar4 = livePrepareLiveThumbnailActivity.V;
        if (sVar4 == null) {
            p.v("binding");
            sVar4 = null;
        }
        AppCompatTextView appCompatTextView2 = sVar4.H;
        p.g(appCompatTextView2, "binding.notsetDescription");
        appCompatTextView2.setVisibility(str.length() == 0 ? 0 : 8);
        s sVar5 = livePrepareLiveThumbnailActivity.V;
        if (sVar5 == null) {
            p.v("binding");
        } else {
            sVar2 = sVar5;
        }
        AppCompatTextView appCompatTextView3 = sVar2.F;
        p.g(appCompatTextView3, "binding.deleteThumbnail");
        appCompatTextView3.setVisibility(str.length() > 0 ? 0 : 8);
    }

    public final void G3() {
        new a.C0045a(new j.d(this, g1.CustomNoTitleDialog)).f(f1.f41992u1).setPositiveButton(f1.D1, new DialogInterface.OnClickListener() { // from class: ne.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                LivePrepareLiveThumbnailActivity.H3(LivePrepareLiveThumbnailActivity.this, dialogInterface, i10);
            }
        }).setNegativeButton(f1.f41995w0, null).k();
    }

    public final x J3() {
        return (x) this.R.getValue();
    }

    public final od.b K3() {
        return (od.b) this.Q.getValue();
    }

    public final tb.c L3() {
        return (tb.c) this.T.getValue();
    }

    public final m M3() {
        return (m) this.P.getValue();
    }

    public final MRLogger N3() {
        return (MRLogger) this.O.getValue();
    }

    public final nf.x O3() {
        return (nf.x) this.S.getValue();
    }

    public final boolean P3() {
        return ((Boolean) this.U.getValue()).booleanValue();
    }

    public final void V3() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        if (intent.resolveActivity(getApplicationContext().getPackageManager()) != null) {
            K3().V();
            this.X.a(intent);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        if (O3().l()) {
            int h10 = O3().h();
            if (h10 != 1) {
                if (h10 == 2 && O3().k().f() != null) {
                    dq.c.c().l(new a0());
                }
            } else {
                setResult(-1, new Intent());
            }
        }
        super.finish();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, b1.activity_liveprepare_thumbnail);
        p.g(g10, "setContentView(this, R.l…ty_liveprepare_thumbnail)");
        s sVar = (s) g10;
        this.V = sVar;
        s sVar2 = null;
        if (sVar == null) {
            p.v("binding");
            sVar = null;
        }
        sVar.D.setOnClickListener(new View.OnClickListener() { // from class: ne.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LivePrepareLiveThumbnailActivity.R3(LivePrepareLiveThumbnailActivity.this, view);
            }
        });
        s sVar3 = this.V;
        if (sVar3 == null) {
            p.v("binding");
            sVar3 = null;
        }
        sVar3.L.setOnClickListener(new View.OnClickListener() { // from class: ne.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LivePrepareLiveThumbnailActivity.S3(LivePrepareLiveThumbnailActivity.this, view);
            }
        });
        s sVar4 = this.V;
        if (sVar4 == null) {
            p.v("binding");
        } else {
            sVar2 = sVar4;
        }
        sVar2.F.setOnClickListener(new View.OnClickListener() { // from class: ne.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LivePrepareLiveThumbnailActivity.T3(LivePrepareLiveThumbnailActivity.this, view);
            }
        });
        O3().k().i(this, new androidx.lifecycle.f0() { // from class: ne.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LivePrepareLiveThumbnailActivity.U3(LivePrepareLiveThumbnailActivity.this, (String) obj);
            }
        });
        O3().m().i(this, new androidx.lifecycle.f0() { // from class: ne.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LivePrepareLiveThumbnailActivity.Q3(LivePrepareLiveThumbnailActivity.this, (Boolean) obj);
            }
        });
        Uri uri = (Uri) getIntent().getParcelableExtra("BUNDLE_KEY_IMAGE_URI");
        if (uri != null) {
            Intent c10 = c.a.c(L3(), this, uri, 16.0f, 9.0f, false, 16, null);
            if (c10.resolveActivity(getApplicationContext().getPackageManager()) != null) {
                this.W.a(c10);
            }
            MRLogger N3 = N3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GROUPSHOT_THUMBNAIL_SET);
            builder.setTargetId(MRLog.TARGET_ID_IMP);
            builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, M3().b())));
            N3.sendLog(builder.build());
        }
    }
}
