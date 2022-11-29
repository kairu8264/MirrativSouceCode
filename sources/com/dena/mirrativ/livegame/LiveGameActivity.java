package com.dena.mirrativ.livegame;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.z;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import da.j;
import io.l;
import ja.m;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import uo.q0;
import wn.f;
import wn.g;
import wn.i;
import wn.v;
import yd.g1;

/* loaded from: classes.dex */
public final class LiveGameActivity extends e.b implements q0 {
    public static final a R = new a(null);
    public static final int S = 8;
    public final /* synthetic */ j O = new j();
    public final f P = g.b(i.SYNCHRONIZED, new c(this, null, null));
    public ka.a Q;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context) {
            p.h(context, "context");
            return new Intent(context, LiveGameActivity.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            LiveGameActivity.this.finish();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21437w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21438x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21439y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21437w = componentCallbacks;
            this.f21438x = aVar;
            this.f21439y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f21437w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f21438x, this.f21439y);
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MRLogger x32 = x3();
        MRLog.Companion companion = MRLog.Companion;
        x32.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_GAME_LISTING_IMP).build());
        ViewDataBinding g10 = androidx.databinding.f.g(this, m.activity_live_game);
        p.g(g10, "setContentView(this, R.layout.activity_live_game)");
        this.Q = (ka.a) g10;
        z k10 = a3().k();
        ka.a aVar = this.Q;
        ka.a aVar2 = null;
        if (aVar == null) {
            p.v("binding");
            aVar = null;
        }
        k10.r(aVar.C.getId(), ja.c.I0.a(false)).i();
        ka.a aVar3 = this.Q;
        if (aVar3 == null) {
            p.v("binding");
        } else {
            aVar2 = aVar3;
        }
        AppCompatImageView appCompatImageView = aVar2.B;
        p.g(appCompatImageView, "binding.closeButtonImageView");
        g1.a(appCompatImageView, new b());
    }

    public final MRLogger x3() {
        return (MRLogger) this.P.getValue();
    }
}
