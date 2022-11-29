package com.dena.mirrativ.app;

import a6.o;
import a6.p;
import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.j0;
import b4.a;
import com.dena.mirrativ.R;
import com.dena.mirrativ.mirrativapi.core.MRErrorInterceptor;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrativ.mirrativapi.core.ServerConfigImpl;
import com.dena.mirrativ.mirrativapi.emomo.EmomoApi;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameApi;
import com.dena.mirrativ.mirrativapi.otherfeatures.OtherFeaturesApi;
import com.dena.mirrativ.mirrativapi.user.UserApi;
import com.dena.mirrorman.AppLifecycleObserver;
import com.dena.mirrorman.clientlog.logs.LiveCatalogVisibleLogger;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.NoticeCampaignVisibleLogger;
import com.dena.mirrorman.clientlog.logs.NotificationLog;
import com.dena.mirrorman.database.MirrorDatabase;
import com.dena.mirrorman.net.CookieRepository;
import com.dena.mirrorman.net.MRCookieJar;
import com.dena.mirrorman.net.retrofit.MRClientLogRequest;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.unity.MRUnityPlayer;
import com.dena.mirrorman.unity.MRUnityPlayerImpl;
import com.dena.mirrorman.unity.UnityActionCreator;
import com.dena.mirrorman.unity.UnityCommandDispatcher;
import com.dena.mirrorman.unity.UnityCommandDispatcherImpl;
import com.dena.mirrorman.unity.UnityReceiver;
import com.dena.mirrorman.unity.UnityStore;
import com.google.android.exoplayer2.database.ExoDatabaseProvider;
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.mirrativ.unityavatar.UnityPlayerToAndroid;
import com.unity3d.player.UnityPlayer;
import ep.b0;
import ep.d0;
import ep.o;
import ep.w;
import ep.z;
import er.t;
import hb.g1;
import hf.c0;
import in.s;
import io.l;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jo.f0;
import jo.p;
import jo.q;
import kf.r;
import nd.q0;
import nd.r0;
import nd.u0;
import r8.j;
import rc.a2;
import so.n;
import wn.i;
import wn.k;
import wn.v;
import wq.c;
import x5.b;
import x5.e;
import xb.e0;
import xn.a0;
import xn.s;

/* loaded from: classes.dex */
public class MirrativApplication extends Application {
    public final tq.a A;
    public final List<tq.a> B;

    /* renamed from: w  reason: collision with root package name */
    public final wn.f f20171w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f20172x;

    /* renamed from: y  reason: collision with root package name */
    public ServerConfig f20173y;

    /* renamed from: z  reason: collision with root package name */
    public final tq.a f20174z;

    /* loaded from: classes.dex */
    public static final class a implements w {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f20175a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ServerConfig f20176b;

        public a(c0 c0Var, ServerConfig serverConfig) {
            this.f20175a = c0Var;
            this.f20176b = serverConfig;
        }

        @Override // ep.w
        public final d0 intercept(w.a aVar) {
            p.h(aVar, "chain");
            b0 j10 = aVar.j();
            String vVar = aVar.j().j().toString();
            b0.a h10 = j10.h();
            for (Map.Entry<String, String> entry : this.f20175a.a().entrySet()) {
                h10.a(entry.getKey(), entry.getValue());
            }
            if (n.C(vVar, this.f20176b.getServerURL(), false, 2, null) || n.C(vVar, this.f20176b.getClogServerURL(), false, 2, null)) {
                String basicAuthUser = this.f20176b.getBasicAuthUser();
                String basicAuthPassword = this.f20176b.getBasicAuthPassword();
                if (!TextUtils.isEmpty(basicAuthUser) && !TextUtils.isEmpty(basicAuthPassword)) {
                    h10 = h10.d("Authorization", o.b(basicAuthUser, basicAuthPassword, null, 4, null));
                }
            }
            return aVar.a(h10.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a.d {
        @Override // b4.a.d
        public void a(Throwable th2) {
            g9.a aVar = g9.a.f32826a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("EmojiCompat initialization failed ");
            sb2.append(th2 != null ? th2.getMessage() : null);
            aVar.b(sb2.toString(), new Object[0]);
        }

        @Override // b4.a.d
        public void b() {
            g9.a.g("EmojiCompat initialized");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<tq.a, wn.v> {

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.p<xq.a, uq.a, od.t0> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f20178w = new a();

            public a() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.t0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new od.t0((String) aVar2.b(0, jo.f0.b(String.class)), (String) aVar2.b(1, jo.f0.b(String.class)), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (Context) aVar.c(jo.f0.b(Context.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null), (hf.w) aVar.c(jo.f0.b(hf.w.class), null, null), (UserApi) aVar.c(jo.f0.b(UserApi.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class a0 extends jo.q implements io.p<xq.a, uq.a, ib.e0> {

            /* renamed from: w  reason: collision with root package name */
            public static final a0 f20179w = new a0();

            public a0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final ib.e0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new ib.e0((oe.a) aVar2.b(0, jo.f0.b(oe.a.class)), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class a1 extends jo.q implements io.p<xq.a, uq.a, UnityActionCreator> {

            /* renamed from: w  reason: collision with root package name */
            public static final a1 f20180w = new a1();

            public a1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final UnityActionCreator invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new UnityActionCreator((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (UnityCommandDispatcher) aVar.c(jo.f0.b(UnityCommandDispatcher.class), null, null), (hf.c0) aVar.c(jo.f0.b(hf.c0.class), null, null), (ServerConfig) aVar.c(jo.f0.b(ServerConfig.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class a2 extends jo.q implements io.p<xq.a, uq.a, nf.p> {

            /* renamed from: w  reason: collision with root package name */
            public static final a2 f20181w = new a2();

            public a2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.p invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.p((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class a3 extends jo.q implements io.p<xq.a, uq.a, hf.r> {

            /* renamed from: w  reason: collision with root package name */
            public static final a3 f20182w = new a3();

            public a3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.r invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.r((kf.i) aVar.c(jo.f0.b(kf.i.class), null, null), (od.j) aVar.c(jo.f0.b(od.j.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class a4 extends jo.q implements io.p<xq.a, uq.a, hf.a0> {

            /* renamed from: w  reason: collision with root package name */
            public static final a4 f20183w = new a4();

            public a4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.a0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.b0((MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (hf.w0) aVar.c(jo.f0.b(hf.w0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class a5 extends jo.q implements io.p<xq.a, uq.a, od.b> {

            /* renamed from: w  reason: collision with root package name */
            public static final a5 f20184w = new a5();

            public a5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.b invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new od.b((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (kf.t) aVar.c(jo.f0.b(kf.t.class), null, null), (hf.d0) aVar.c(jo.f0.b(hf.d0.class), null, null), (hf.m0) aVar.c(jo.f0.b(hf.m0.class), null, null), (hf.s) aVar.c(jo.f0.b(hf.s.class), null, null), (kf.p) aVar.c(jo.f0.b(kf.p.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class a6 extends jo.q implements io.p<xq.a, uq.a, MRClientLogRequest> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20185w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a6(MirrativApplication mirrativApplication) {
                super(2);
                this.f20185w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final MRClientLogRequest invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return (MRClientLogRequest) this.f20185w.k(((ServerConfig) aVar.c(jo.f0.b(ServerConfig.class), null, null)).getClogServerURL(), (ep.z) aVar.c(jo.f0.b(ep.z.class), null, null), MRClientLogRequest.class);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.p<xq.a, uq.a, od.z> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20186w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MirrativApplication mirrativApplication) {
                super(2);
                this.f20186w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final od.z invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new od.z(this.f20186w, (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (nd.i1) aVar.c(jo.f0.b(nd.i1.class), null, null), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null), (hf.r) aVar.c(jo.f0.b(hf.r.class), null, null), (ef.a) aVar.c(jo.f0.b(ef.a.class), null, null), (hf.d0) aVar.c(jo.f0.b(hf.d0.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null), (nf.o) aVar.c(jo.f0.b(nf.o.class), null, null), (hf.a0) aVar.c(jo.f0.b(hf.a0.class), null, null), (hf.m0) aVar.c(jo.f0.b(hf.m0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class b0 extends jo.q implements io.p<xq.a, uq.a, ib.d> {

            /* renamed from: w  reason: collision with root package name */
            public static final b0 f20187w = new b0();

            public b0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final ib.d invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new ib.d((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class b1 extends jo.q implements io.p<xq.a, uq.a, UnityStore> {

            /* renamed from: w  reason: collision with root package name */
            public static final b1 f20188w = new b1();

            public b1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final UnityStore invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return UnityStore.Companion.getInstance((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class b2 extends jo.q implements io.p<xq.a, uq.a, od.g> {

            /* renamed from: w  reason: collision with root package name */
            public static final b2 f20189w = new b2();

            public b2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.g invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.g((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class b3 extends jo.q implements io.p<xq.a, uq.a, Context> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20190w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b3(MirrativApplication mirrativApplication) {
                super(2);
                this.f20190w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final Context invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return this.f20190w.getApplicationContext();
            }
        }

        /* loaded from: classes.dex */
        public static final class b4 extends jo.q implements io.p<xq.a, uq.a, hf.s> {

            /* renamed from: w  reason: collision with root package name */
            public static final b4 f20191w = new b4();

            public b4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.s invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.t((nf.k) aVar.c(jo.f0.b(nf.k.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class b5 extends jo.q implements io.p<xq.a, uq.a, nf.c> {

            /* renamed from: w  reason: collision with root package name */
            public static final b5 f20192w = new b5();

            public b5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.c invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return nf.c.f42441g1.a((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (hf.s) aVar.c(jo.f0.b(hf.s.class), null, null));
            }
        }

        /* renamed from: com.dena.mirrativ.app.MirrativApplication$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0177c extends jo.q implements io.p<xq.a, uq.a, nf.y> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0177c f20193w = new C0177c();

            public C0177c() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.y invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.y((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class c0 extends jo.q implements io.p<xq.a, uq.a, nf.l> {

            /* renamed from: w  reason: collision with root package name */
            public static final c0 f20194w = new c0();

            public c0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.l invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.l((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class c1 extends jo.q implements io.p<xq.a, uq.a, xe.a> {

            /* renamed from: w  reason: collision with root package name */
            public static final c1 f20195w = new c1();

            public c1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final xe.a invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new xe.a((kf.v) aVar.c(jo.f0.b(kf.v.class), null, null), (kf.a) aVar.c(jo.f0.b(kf.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class c2 extends jo.q implements io.p<xq.a, uq.a, nf.g> {

            /* renamed from: w  reason: collision with root package name */
            public static final c2 f20196w = new c2();

            public c2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.g invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.g((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class c3 extends jo.q implements io.p<xq.a, uq.a, ef.a> {

            /* renamed from: w  reason: collision with root package name */
            public static final c3 f20197w = new c3();

            public c3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final ef.a invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new ef.a((kf.v) aVar.c(jo.f0.b(kf.v.class), null, null), (nd.i1) aVar.c(jo.f0.b(nd.i1.class), null, null), (Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class c4 extends jo.q implements io.p<xq.a, uq.a, nf.o> {

            /* renamed from: w  reason: collision with root package name */
            public static final c4 f20198w = new c4();

            public c4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.o invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return nf.o.f43084q0.a((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (jf.d0) aVar.c(jo.f0.b(jf.d0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class c5 extends jo.q implements io.p<xq.a, uq.a, of.k> {

            /* renamed from: w  reason: collision with root package name */
            public static final c5 f20199w = new c5();

            public c5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final of.k invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new of.l((ServerConfig) aVar.c(jo.f0.b(ServerConfig.class), null, null), (Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends jo.q implements io.p<xq.a, uq.a, od.t> {

            /* renamed from: w  reason: collision with root package name */
            public static final d f20200w = new d();

            public d() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.t invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new od.t((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class d0 extends jo.q implements io.p<xq.a, uq.a, lc.e> {

            /* renamed from: w  reason: collision with root package name */
            public static final d0 f20201w = new d0();

            public d0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final lc.e invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new lc.e((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class d1 extends jo.q implements io.p<xq.a, uq.a, UnityCommandDispatcher> {

            /* renamed from: w  reason: collision with root package name */
            public static final d1 f20202w = new d1();

            public d1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final UnityCommandDispatcher invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return UnityCommandDispatcherImpl.Companion.getInstance();
            }
        }

        /* loaded from: classes.dex */
        public static final class d2 extends jo.q implements io.p<xq.a, uq.a, od.s> {

            /* renamed from: w  reason: collision with root package name */
            public static final d2 f20203w = new d2();

            public d2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.s invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.s((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (UserApi) aVar.c(jo.f0.b(UserApi.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class d3 extends jo.q implements io.p<xq.a, uq.a, kf.c> {

            /* renamed from: w  reason: collision with root package name */
            public static final d3 f20204w = new d3();

            public d3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final kf.c invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new kf.d((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class d4 extends jo.q implements io.p<xq.a, uq.a, kf.v> {

            /* renamed from: w  reason: collision with root package name */
            public static final d4 f20205w = new d4();

            public d4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final kf.v invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new kf.w((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class d5 extends jo.q implements io.p<xq.a, uq.a, hf.l> {

            /* renamed from: w  reason: collision with root package name */
            public static final d5 f20206w = new d5();

            public d5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.l invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.m((Context) aVar.c(jo.f0.b(Context.class), null, null), (hf.m0) aVar.c(jo.f0.b(hf.m0.class), null, null), (ze.w) aVar.c(jo.f0.b(ze.w.class), null, null), (hf.r) aVar.c(jo.f0.b(hf.r.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends jo.q implements io.p<xq.a, uq.a, nf.s> {

            /* renamed from: w  reason: collision with root package name */
            public static final e f20207w = new e();

            public e() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.s invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.s((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class e0 extends jo.q implements io.p<xq.a, uq.a, lc.m> {

            /* renamed from: w  reason: collision with root package name */
            public static final e0 f20208w = new e0();

            public e0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final lc.m invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new lc.m((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class e1 extends jo.q implements io.p<xq.a, uq.a, od.l0> {

            /* renamed from: w  reason: collision with root package name */
            public static final e1 f20209w = new e1();

            public e1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.l0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.l0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class e2 extends jo.q implements io.p<xq.a, uq.a, nf.r> {

            /* renamed from: w  reason: collision with root package name */
            public static final e2 f20210w = new e2();

            public e2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.r invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new nf.r((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (nf.y) aVar.c(jo.f0.b(nf.y.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class e3 extends jo.q implements io.p<xq.a, uq.a, CookieRepository> {

            /* renamed from: w  reason: collision with root package name */
            public static final e3 f20211w = new e3();

            public e3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final CookieRepository invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new CookieRepository((kf.c) aVar.c(jo.f0.b(kf.c.class), null, null), (ServerConfig) aVar.c(jo.f0.b(ServerConfig.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class e4 extends jo.q implements io.p<xq.a, uq.a, kf.p> {

            /* renamed from: w  reason: collision with root package name */
            public static final e4 f20212w = new e4();

            public e4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final kf.p invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new kf.q((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class e5 extends jo.q implements io.p<xq.a, uq.a, UserApi> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20213w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e5(MirrativApplication mirrativApplication) {
                super(2);
                this.f20213w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final UserApi invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return (UserApi) this.f20213w.k(((ServerConfig) aVar.c(jo.f0.b(ServerConfig.class), null, null)).getServerURL(), (ep.z) aVar.c(jo.f0.b(ep.z.class), null, null), UserApi.class);
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends jo.q implements io.p<xq.a, uq.a, rc.u> {

            /* renamed from: w  reason: collision with root package name */
            public static final f f20214w = new f();

            public f() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final rc.u invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new rc.u((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class f0 extends jo.q implements io.p<xq.a, uq.a, od.x> {

            /* renamed from: w  reason: collision with root package name */
            public static final f0 f20215w = new f0();

            public f0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.x invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.x((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class f1 extends jo.q implements io.p<xq.a, uq.a, nf.f0> {

            /* renamed from: w  reason: collision with root package name */
            public static final f1 f20216w = new f1();

            public f1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.f0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.f0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class f2 extends jo.q implements io.p<xq.a, uq.a, od.h> {

            /* renamed from: w  reason: collision with root package name */
            public static final f2 f20217w = new f2();

            public f2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.h invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.h((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (UserApi) aVar.c(jo.f0.b(UserApi.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class f3 extends jo.q implements io.p<xq.a, uq.a, MRCookieJar> {

            /* renamed from: w  reason: collision with root package name */
            public static final f3 f20218w = new f3();

            public f3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final MRCookieJar invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new MRCookieJar((CookieRepository) aVar.c(jo.f0.b(CookieRepository.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class f4 extends jo.q implements io.p<xq.a, uq.a, hf.q> {

            /* renamed from: w  reason: collision with root package name */
            public static final f4 f20219w = new f4();

            public f4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.q invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.q((kf.g) aVar.c(jo.f0.b(kf.g.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class f5 extends jo.q implements io.p<xq.a, uq.a, nf.i0> {

            /* renamed from: w  reason: collision with root package name */
            public static final f5 f20220w = new f5();

            public f5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.i0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new nf.i0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class g extends jo.q implements io.p<xq.a, uq.a, rc.t> {

            /* renamed from: w  reason: collision with root package name */
            public static final g f20221w = new g();

            public g() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final rc.t invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new rc.t((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (kf.t) aVar.c(jo.f0.b(kf.t.class), null, null), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null), (hf.o0) aVar.c(jo.f0.b(hf.o0.class), null, null), (hf.a0) aVar.c(jo.f0.b(hf.a0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class g0 extends jo.q implements io.p<xq.a, uq.a, kf.t> {

            /* renamed from: w  reason: collision with root package name */
            public static final g0 f20222w = new g0();

            public g0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final kf.t invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new kf.u((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class g1 extends jo.q implements io.p<xq.a, uq.a, od.k0> {

            /* renamed from: w  reason: collision with root package name */
            public static final g1 f20223w = new g1();

            public g1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.k0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.k0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class g2 extends jo.q implements io.p<xq.a, uq.a, nf.i> {

            /* renamed from: w  reason: collision with root package name */
            public static final g2 f20224w = new g2();

            public g2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.i invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new nf.i((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class g3 extends jo.q implements io.p<xq.a, uq.a, hf.c0> {

            /* renamed from: w  reason: collision with root package name */
            public static final g3 f20225w = new g3();

            public g3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.c0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.c0((Context) aVar.c(jo.f0.b(Context.class), null, null), (hf.e0) aVar.c(jo.f0.b(hf.e0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class g4 extends jo.q implements io.p<xq.a, uq.a, hf.p> {

            /* renamed from: w  reason: collision with root package name */
            public static final g4 f20226w = new g4();

            public g4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.p invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.p((kf.g) aVar.c(jo.f0.b(kf.g.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class g5 extends jo.q implements io.p<xq.a, uq.a, od.a0> {

            /* renamed from: w  reason: collision with root package name */
            public static final g5 f20227w = new g5();

            public g5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.a0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.a0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (hf.h0) aVar.c(jo.f0.b(hf.h0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class h extends jo.q implements io.p<xq.a, uq.a, od.w> {

            /* renamed from: w  reason: collision with root package name */
            public static final h f20228w = new h();

            public h() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.w invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.w((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (hf.l) aVar.c(jo.f0.b(hf.l.class), null, null), (hf.d0) aVar.c(jo.f0.b(hf.d0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class h0 extends jo.q implements io.p<xq.a, uq.a, nf.x> {

            /* renamed from: w  reason: collision with root package name */
            public static final h0 f20229w = new h0();

            public h0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.x invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                Object c10 = aVar.c(jo.f0.b(kf.x.class), null, null);
                jo.p.f(c10, "null cannot be cast to non-null type com.dena.mirrorman.pref.UserPreference");
                return new nf.x((String) aVar2.b(0, jo.f0.b(String.class)), ((Number) aVar2.b(1, jo.f0.b(Integer.class))).intValue(), (String) aVar2.b(2, jo.f0.b(String.class)), ((kf.x) c10).H3(), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class h1 extends jo.q implements io.p<xq.a, uq.a, nf.e0> {

            /* renamed from: w  reason: collision with root package name */
            public static final h1 f20230w = new h1();

            public h1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.e0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.e0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class h2 extends jo.q implements io.p<xq.a, uq.a, od.u0> {

            /* renamed from: w  reason: collision with root package name */
            public static final h2 f20231w = new h2();

            public h2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.u0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.u0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class h3 extends jo.q implements io.p<xq.a, uq.a, ep.z> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20232w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h3(MirrativApplication mirrativApplication) {
                super(2);
                this.f20232w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final ep.z invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return this.f20232w.j((tb.c) aVar.c(jo.f0.b(tb.c.class), null, null), (MRCookieJar) aVar.c(jo.f0.b(MRCookieJar.class), null, null), (hf.c0) aVar.c(jo.f0.b(hf.c0.class), null, null), (ServerConfig) aVar.c(jo.f0.b(ServerConfig.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class h4 extends jo.q implements io.p<xq.a, uq.a, hf.u> {

            /* renamed from: w  reason: collision with root package name */
            public static final h4 f20233w = new h4();

            public h4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.u invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.v((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class h5 extends jo.q implements io.p<xq.a, uq.a, od.e0> {

            /* renamed from: w  reason: collision with root package name */
            public static final h5 f20234w = new h5();

            public h5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.e0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.e0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (kf.p) aVar.c(jo.f0.b(kf.p.class), null, null), (hf.h0) aVar.c(jo.f0.b(hf.h0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class i extends jo.q implements io.p<xq.a, uq.a, nf.v> {

            /* renamed from: w  reason: collision with root package name */
            public static final i f20235w = new i();

            public i() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.v invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.v((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class i0 extends jo.q implements io.p<xq.a, uq.a, od.m> {

            /* renamed from: w  reason: collision with root package name */
            public static final i0 f20236w = new i0();

            public i0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.m invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new od.m((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class i1 extends jo.q implements io.p<xq.a, uq.a, od.j0> {

            /* renamed from: w  reason: collision with root package name */
            public static final i1 f20237w = new i1();

            public i1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.j0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.j0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class i2 extends jo.q implements io.p<xq.a, uq.a, nf.q0> {

            /* renamed from: w  reason: collision with root package name */
            public static final i2 f20238w = new i2();

            public i2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.q0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.q0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class i3 extends jo.q implements io.p<xq.a, uq.a, SimpleCache> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20239w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i3(MirrativApplication mirrativApplication) {
                super(2);
                this.f20239w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final SimpleCache invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return this.f20239w.l();
            }
        }

        /* loaded from: classes.dex */
        public static final class i4 extends jo.q implements io.p<xq.a, uq.a, OtherFeaturesApi> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20240w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i4(MirrativApplication mirrativApplication) {
                super(2);
                this.f20240w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final OtherFeaturesApi invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return (OtherFeaturesApi) this.f20240w.k(((ServerConfig) aVar.c(jo.f0.b(ServerConfig.class), null, null)).getServerURL(), (ep.z) aVar.c(jo.f0.b(ep.z.class), null, null), OtherFeaturesApi.class);
            }
        }

        /* loaded from: classes.dex */
        public static final class i5 extends jo.q implements io.p<xq.a, uq.a, od.f0> {

            /* renamed from: w  reason: collision with root package name */
            public static final i5 f20241w = new i5();

            public i5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.f0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.f0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (kf.p) aVar.c(jo.f0.b(kf.p.class), null, null), (hf.h0) aVar.c(jo.f0.b(hf.h0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class j extends jo.q implements io.p<xq.a, uq.a, ud.i> {

            /* renamed from: w  reason: collision with root package name */
            public static final j f20242w = new j();

            public j() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final ud.i invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new ud.i();
            }
        }

        /* loaded from: classes.dex */
        public static final class j0 extends jo.q implements io.p<xq.a, uq.a, nf.n> {

            /* renamed from: w  reason: collision with root package name */
            public static final j0 f20243w = new j0();

            public j0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.n invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new nf.n((String) aVar2.b(0, jo.f0.b(String.class)), (String) aVar2.b(1, jo.f0.b(String.class)), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class j1 extends jo.q implements io.p<xq.a, uq.a, nf.d0> {

            /* renamed from: w  reason: collision with root package name */
            public static final j1 f20244w = new j1();

            public j1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.d0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.d0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class j2 extends jo.q implements io.p<xq.a, uq.a, kf.g> {

            /* renamed from: w  reason: collision with root package name */
            public static final j2 f20245w = new j2();

            public j2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final kf.g invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new kf.h((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class j3 extends jo.q implements io.p<xq.a, uq.a, x5.e> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20246w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j3(MirrativApplication mirrativApplication) {
                super(2);
                this.f20246w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final x5.e invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return this.f20246w.i((ep.z) aVar.c(jo.f0.b(ep.z.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class j4 extends jo.q implements io.p<xq.a, uq.a, hf.w> {

            /* renamed from: w  reason: collision with root package name */
            public static final j4 f20247w = new j4();

            public j4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.w invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.x((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class j5 extends jo.q implements io.p<xq.a, uq.a, od.c0> {

            /* renamed from: w  reason: collision with root package name */
            public static final j5 f20248w = new j5();

            public j5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.c0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new od.c0((jf.g0) aVar2.b(0, jo.f0.b(jf.g0.class)), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (kf.p) aVar.c(jo.f0.b(kf.p.class), null, null), (hf.h0) aVar.c(jo.f0.b(hf.h0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class k extends jo.q implements io.p<xq.a, uq.a, MRRequest> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20249w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(MirrativApplication mirrativApplication) {
                super(2);
                this.f20249w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final MRRequest invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return (MRRequest) this.f20249w.k(((ServerConfig) aVar.c(jo.f0.b(ServerConfig.class), null, null)).getServerURL(), (ep.z) aVar.c(jo.f0.b(ep.z.class), null, null), MRRequest.class);
            }
        }

        /* loaded from: classes.dex */
        public static final class k0 extends jo.q implements io.p<xq.a, uq.a, nf.j> {

            /* renamed from: w  reason: collision with root package name */
            public static final k0 f20250w = new k0();

            public k0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.j invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new nf.j((String) aVar2.b(0, jo.f0.b(String.class)), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class k1 extends jo.q implements io.p<xq.a, uq.a, od.m0> {

            /* renamed from: w  reason: collision with root package name */
            public static final k1 f20251w = new k1();

            public k1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.m0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.m0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class k2 extends jo.q implements io.p<xq.a, uq.a, od.i0> {

            /* renamed from: w  reason: collision with root package name */
            public static final k2 f20252w = new k2();

            public k2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.i0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.i0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (UserApi) aVar.c(jo.f0.b(UserApi.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class k3 extends jo.q implements io.p<xq.a, uq.a, of.r> {

            /* renamed from: w  reason: collision with root package name */
            public static final k3 f20253w = new k3();

            public k3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final of.r invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new of.r((hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null), (hf.r) aVar.c(jo.f0.b(hf.r.class), null, null), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (hf.a0) aVar.c(jo.f0.b(hf.a0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class k4 extends jo.q implements io.p<xq.a, uq.a, hf.k0> {

            /* renamed from: w  reason: collision with root package name */
            public static final k4 f20254w = new k4();

            public k4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.k0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.l0((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class k5 extends jo.q implements io.p<xq.a, uq.a, od.d0> {

            /* renamed from: w  reason: collision with root package name */
            public static final k5 f20255w = new k5();

            public k5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.d0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.d0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (kf.p) aVar.c(jo.f0.b(kf.p.class), null, null), (hf.h0) aVar.c(jo.f0.b(hf.h0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class l extends jo.q implements io.p<xq.a, uq.a, nf.a> {

            /* renamed from: w  reason: collision with root package name */
            public static final l f20256w = new l();

            public l() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.a invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new nf.a((String) aVar2.b(0, jo.f0.b(String.class)), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class l0 extends jo.q implements io.p<xq.a, uq.a, od.i> {

            /* renamed from: w  reason: collision with root package name */
            public static final l0 f20257w = new l0();

            public l0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.i invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new od.i((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class l1 extends jo.q implements io.p<xq.a, uq.a, nf.g0> {

            /* renamed from: w  reason: collision with root package name */
            public static final l1 f20258w = new l1();

            public l1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.g0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.g0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class l2 extends jo.q implements io.p<xq.a, uq.a, nf.c0> {

            /* renamed from: w  reason: collision with root package name */
            public static final l2 f20259w = new l2();

            public l2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.c0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.c0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (Resources) aVar.c(jo.f0.b(Resources.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class l3 extends jo.q implements io.p<xq.a, uq.a, hf.m0> {

            /* renamed from: w  reason: collision with root package name */
            public static final l3 f20260w = new l3();

            public l3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.m0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.m0((kf.t) aVar.c(jo.f0.b(kf.t.class), null, null), (hf.r) aVar.c(jo.f0.b(hf.r.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class l4 extends jo.q implements io.p<xq.a, uq.a, hf.f> {

            /* renamed from: w  reason: collision with root package name */
            public static final l4 f20261w = new l4();

            public l4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.f invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.g((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class l5 extends jo.q implements io.p<xq.a, uq.a, gd.c> {

            /* renamed from: w  reason: collision with root package name */
            public static final l5 f20262w = new l5();

            public l5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final gd.c invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new gd.c((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (UserApi) aVar.c(jo.f0.b(UserApi.class), null, null), (OtherFeaturesApi) aVar.c(jo.f0.b(OtherFeaturesApi.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class m extends jo.q implements io.p<xq.a, uq.a, ud.j> {

            /* renamed from: w  reason: collision with root package name */
            public static final m f20263w = new m();

            public m() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final ud.j invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new ud.j();
            }
        }

        /* loaded from: classes.dex */
        public static final class m0 extends jo.q implements io.p<xq.a, uq.a, nf.u> {

            /* renamed from: w  reason: collision with root package name */
            public static final m0 f20264w = new m0();

            public m0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.u invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new nf.u((jf.x) aVar2.b(0, jo.f0.b(jf.x.class)), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (Resources) aVar.c(jo.f0.b(Resources.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class m1 extends jo.q implements io.p<xq.a, uq.a, fc.a> {

            /* renamed from: w  reason: collision with root package name */
            public static final m1 f20265w = new m1();

            public m1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final fc.a invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new fc.a((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (hf.c) aVar.c(jo.f0.b(hf.c.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class m2 extends jo.q implements io.p<xq.a, uq.a, od.u> {

            /* renamed from: w  reason: collision with root package name */
            public static final m2 f20266w = new m2();

            public m2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.u invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.u((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class m3 extends jo.q implements io.p<xq.a, uq.a, Resources> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20267w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m3(MirrativApplication mirrativApplication) {
                super(2);
                this.f20267w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final Resources invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return this.f20267w.getResources();
            }
        }

        /* loaded from: classes.dex */
        public static final class m4 extends jo.q implements io.p<xq.a, uq.a, hf.y> {

            /* renamed from: w  reason: collision with root package name */
            public static final m4 f20268w = new m4();

            public m4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.y invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.z((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class m5 extends jo.q implements io.p<xq.a, uq.a, gb.a> {

            /* renamed from: w  reason: collision with root package name */
            public static final m5 f20269w = new m5();

            public m5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final gb.a invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new gb.a((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class n extends jo.q implements io.p<xq.a, uq.a, gd.g> {

            /* renamed from: w  reason: collision with root package name */
            public static final n f20270w = new n();

            public n() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final gd.g invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new gd.g((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (Resources) aVar.c(jo.f0.b(Resources.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class n0 extends jo.q implements io.p<xq.a, uq.a, nf.h0> {

            /* renamed from: w  reason: collision with root package name */
            public static final n0 f20271w = new n0();

            public n0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.h0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.h0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class n1 extends jo.q implements io.p<xq.a, uq.a, kf.i> {

            /* renamed from: w  reason: collision with root package name */
            public static final n1 f20272w = new n1();

            public n1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final kf.i invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new kf.j((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class n2 extends jo.q implements io.p<xq.a, uq.a, nf.t> {

            /* renamed from: w  reason: collision with root package name */
            public static final n2 f20273w = new n2();

            public n2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.t invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.t((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class n3 extends jo.q implements io.p<xq.a, uq.a, ze.w> {

            /* renamed from: w  reason: collision with root package name */
            public static final n3 f20274w = new n3();

            public n3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final ze.w invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new ze.w((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class n4 extends jo.q implements io.p<xq.a, uq.a, nf.w> {

            /* renamed from: w  reason: collision with root package name */
            public static final n4 f20275w = new n4();

            public n4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.w invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new nf.w((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (kf.t) aVar.c(jo.f0.b(kf.t.class), null, null), (hf.r) aVar.c(jo.f0.b(hf.r.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class n5 extends jo.q implements io.p<xq.a, uq.a, od.b0> {

            /* renamed from: w  reason: collision with root package name */
            public static final n5 f20276w = new n5();

            public n5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.b0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.b0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (hf.h0) aVar.c(jo.f0.b(hf.h0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class o extends jo.q implements io.p<xq.a, uq.a, gb.g> {

            /* renamed from: w  reason: collision with root package name */
            public static final o f20277w = new o();

            public o() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final gb.g invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new gb.g((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class o0 extends jo.q implements io.p<xq.a, uq.a, od.n0> {

            /* renamed from: w  reason: collision with root package name */
            public static final o0 f20278w = new o0();

            public o0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.n0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.n0((MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (kf.m) aVar.c(jo.f0.b(kf.m.class), null, null), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (hf.k0) aVar.c(jo.f0.b(hf.k0.class), null, null), (hf.y) aVar.c(jo.f0.b(hf.y.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class o1 extends jo.q implements io.p<xq.a, uq.a, fc.f> {

            /* renamed from: w  reason: collision with root package name */
            public static final o1 f20279w = new o1();

            public o1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final fc.f invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new fc.f((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class o2 extends jo.q implements io.p<xq.a, uq.a, kf.e> {

            /* renamed from: w  reason: collision with root package name */
            public static final o2 f20280w = new o2();

            public o2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final kf.e invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new kf.f((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class o3 extends jo.q implements io.p<xq.a, uq.a, hf.e> {

            /* renamed from: w  reason: collision with root package name */
            public static final o3 f20281w = new o3();

            public o3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.e invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.e((hf.j) aVar.c(jo.f0.b(hf.j.class), null, null), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class o4 extends jo.q implements io.p<xq.a, uq.a, nd.j1> {

            /* renamed from: w  reason: collision with root package name */
            public static final o4 f20282w = new o4();

            public o4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nd.j1 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new nd.j1((hf.r) aVar.c(jo.f0.b(hf.r.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null), (MRLogger) aVar.c(jo.f0.b(MRLogger.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class o5 extends jo.q implements io.p<xq.a, uq.a, od.l> {

            /* renamed from: w  reason: collision with root package name */
            public static final o5 f20283w = new o5();

            public o5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.l invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.l((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class p extends jo.q implements io.p<xq.a, uq.a, nf.m> {

            /* renamed from: w  reason: collision with root package name */
            public static final p f20284w = new p();

            public p() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.m invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.m((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class p0 extends jo.q implements io.p<xq.a, uq.a, je.e> {

            /* renamed from: w  reason: collision with root package name */
            public static final p0 f20285w = new p0();

            public p0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final je.e invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new je.e();
            }
        }

        /* loaded from: classes.dex */
        public static final class p1 extends jo.q implements io.p<xq.a, uq.a, od.r0> {

            /* renamed from: w  reason: collision with root package name */
            public static final p1 f20286w = new p1();

            public p1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.r0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.r0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (hf.k0) aVar.c(jo.f0.b(hf.k0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class p2 extends jo.q implements io.p<xq.a, uq.a, hf.v0> {

            /* renamed from: w  reason: collision with root package name */
            public static final p2 f20287w = new p2();

            public p2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.v0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.v0((kf.x) aVar.c(jo.f0.b(kf.x.class), null, null), (kf.t) aVar.c(jo.f0.b(kf.t.class), null, null), (kf.p) aVar.c(jo.f0.b(kf.p.class), null, null), (MirrorDatabase) aVar.c(jo.f0.b(MirrorDatabase.class), null, null), (hf.f) aVar.c(jo.f0.b(hf.f.class), null, null), (hf.h0) aVar.c(jo.f0.b(hf.h0.class), null, null), (od.s0) aVar.c(jo.f0.b(od.s0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class p3 extends jo.q implements io.p<xq.a, uq.a, hf.d0> {

            /* renamed from: w  reason: collision with root package name */
            public static final p3 f20288w = new p3();

            public p3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.d0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.d0((kf.m) aVar.c(jo.f0.b(kf.m.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class p4 extends jo.q implements io.p<xq.a, uq.a, nf.k> {

            /* renamed from: w  reason: collision with root package name */
            public static final p4 f20289w = new p4();

            public p4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.k invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return nf.k.U.a((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (kf.i) aVar.c(jo.f0.b(kf.i.class), null, null), (Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class p5 extends jo.q implements io.p<xq.a, uq.a, LiveGameApi> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20290w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p5(MirrativApplication mirrativApplication) {
                super(2);
                this.f20290w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final LiveGameApi invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return (LiveGameApi) this.f20290w.k(((ServerConfig) aVar.c(jo.f0.b(ServerConfig.class), null, null)).getServerURL(), (ep.z) aVar.c(jo.f0.b(ep.z.class), null, null), LiveGameApi.class);
            }
        }

        /* loaded from: classes.dex */
        public static final class q extends jo.q implements io.p<xq.a, uq.a, nf.f> {

            /* renamed from: w  reason: collision with root package name */
            public static final q f20291w = new q();

            public q() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.f invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.f((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (Resources) aVar.c(jo.f0.b(Resources.class), null, null), (kf.v) aVar.c(jo.f0.b(kf.v.class), null, null), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null), (hf.h) aVar.c(jo.f0.b(hf.h.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class q0 extends jo.q implements io.p<xq.a, uq.a, od.s0> {

            /* renamed from: w  reason: collision with root package name */
            public static final q0 f20292w = new q0();

            public q0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.s0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.s0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class q1 extends jo.q implements io.p<xq.a, uq.a, nf.n0> {

            /* renamed from: w  reason: collision with root package name */
            public static final q1 f20293w = new q1();

            public q1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.n0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.n0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class q2 extends jo.q implements io.p<xq.a, uq.a, tb.c> {

            /* renamed from: w  reason: collision with root package name */
            public static final q2 f20294w = new q2();

            public q2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final tb.c invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new p8.a((ServerConfig) aVar.c(jo.f0.b(ServerConfig.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class q3 extends jo.q implements io.p<xq.a, uq.a, MirrorDatabase> {

            /* renamed from: w  reason: collision with root package name */
            public static final q3 f20295w = new q3();

            public q3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final MirrorDatabase invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return MirrorDatabase.f25633o.a((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class q4 extends jo.q implements io.p<xq.a, uq.a, nf.p0> {

            /* renamed from: w  reason: collision with root package name */
            public static final q4 f20296w = new q4();

            public q4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.p0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return nf.p0.A.a((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class q5 extends jo.q implements io.p<xq.a, uq.a, od.r> {

            /* renamed from: w  reason: collision with root package name */
            public static final q5 f20297w = new q5();

            public q5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.r invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.r((MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (UserApi) aVar.c(jo.f0.b(UserApi.class), null, null), (LiveGameApi) aVar.c(jo.f0.b(LiveGameApi.class), null, null), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class r extends jo.q implements io.p<xq.a, uq.a, od.e> {

            /* renamed from: w  reason: collision with root package name */
            public static final r f20298w = new r();

            public r() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.e invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.e((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class r0 extends jo.q implements io.p<xq.a, uq.a, kf.a> {

            /* renamed from: w  reason: collision with root package name */
            public static final r0 f20299w = new r0();

            public r0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final kf.a invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new kf.b((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class r1 extends jo.q implements io.p<xq.a, uq.a, od.q0> {

            /* renamed from: w  reason: collision with root package name */
            public static final r1 f20300w = new r1();

            public r1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.q0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.q0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (hf.k0) aVar.c(jo.f0.b(hf.k0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class r2 extends jo.q implements io.p<xq.a, uq.a, hf.o0> {

            /* renamed from: w  reason: collision with root package name */
            public static final r2 f20301w = new r2();

            public r2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.o0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.o0((MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null), (of.r) aVar.c(jo.f0.b(of.r.class), null, null), (kf.t) aVar.c(jo.f0.b(kf.t.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class r3 extends jo.q implements io.p<xq.a, uq.a, MRLogger> {

            /* renamed from: w  reason: collision with root package name */
            public static final r3 f20302w = new r3();

            public r3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final MRLogger invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new MRLogger();
            }
        }

        /* loaded from: classes.dex */
        public static final class r4 extends jo.q implements io.p<xq.a, uq.a, hf.u0> {

            /* renamed from: w  reason: collision with root package name */
            public static final r4 f20303w = new r4();

            public r4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.u0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.u0((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class r5 extends jo.q implements io.p<xq.a, uq.a, od.h0> {

            /* renamed from: w  reason: collision with root package name */
            public static final r5 f20304w = new r5();

            /* loaded from: classes.dex */
            public static final class a extends jo.q implements io.a<uq.a> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ Activity f20305w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Activity activity) {
                    super(0);
                    this.f20305w = activity;
                }

                @Override // io.a
                /* renamed from: a */
                public final uq.a invoke() {
                    return uq.b.b(this.f20305w);
                }
            }

            public r5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.h0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new od.h0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (hf.s0) aVar.c(jo.f0.b(hf.s0.class), null, new a((Activity) aVar2.b(0, jo.f0.b(Activity.class)))), (kf.v) aVar.c(jo.f0.b(kf.v.class), null, null), (MRLogger) aVar.c(jo.f0.b(MRLogger.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null), (hf.r) aVar.c(jo.f0.b(hf.r.class), null, null), (hf.a0) aVar.c(jo.f0.b(hf.a0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class s extends jo.q implements io.p<xq.a, uq.a, od.c> {

            /* renamed from: w  reason: collision with root package name */
            public static final s f20306w = new s();

            public s() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.c invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.c((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class s0 extends jo.q implements io.p<xq.a, uq.a, hf.h<ud.p>> {

            /* renamed from: w  reason: collision with root package name */
            public static final s0 f20307w = new s0();

            public s0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.h<ud.p> invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.i();
            }
        }

        /* loaded from: classes.dex */
        public static final class s1 extends jo.q implements io.p<xq.a, uq.a, nf.m0> {

            /* renamed from: w  reason: collision with root package name */
            public static final s1 f20308w = new s1();

            public s1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.m0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.m0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class s2 extends jo.q implements io.p<xq.a, uq.a, hf.d> {

            /* renamed from: w  reason: collision with root package name */
            public static final s2 f20309w = new s2();

            public s2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.d invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.d((hf.c) aVar.c(jo.f0.b(hf.c.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class s3 extends jo.q implements io.p<xq.a, uq.a, LiveCatalogVisibleLogger> {

            /* renamed from: w  reason: collision with root package name */
            public static final s3 f20310w = new s3();

            public s3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final LiveCatalogVisibleLogger invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new LiveCatalogVisibleLogger((kf.x) aVar.c(jo.f0.b(kf.x.class), null, null), (MRLogger) aVar.c(jo.f0.b(MRLogger.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class s4 extends jo.q implements io.p<xq.a, uq.a, nf.j0> {

            /* renamed from: w  reason: collision with root package name */
            public static final s4 f20311w = new s4();

            public s4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.j0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return nf.j0.D.a((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (kf.v) aVar.c(jo.f0.b(kf.v.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class s5 extends jo.q implements io.p<xq.a, uq.a, nf.b0> {

            /* renamed from: w  reason: collision with root package name */
            public static final s5 f20312w = new s5();

            public s5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.b0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.b0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class t extends jo.q implements io.p<xq.a, uq.a, nf.d> {

            /* renamed from: w  reason: collision with root package name */
            public static final t f20313w = new t();

            public t() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.d invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.d((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class t0 extends jo.q implements io.p<xq.a, uq.a, nf.a0> {

            /* renamed from: w  reason: collision with root package name */
            public static final t0 f20314w = new t0();

            public t0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.a0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.a0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class t1 extends jo.q implements io.p<xq.a, uq.a, od.o0> {

            /* renamed from: w  reason: collision with root package name */
            public static final t1 f20315w = new t1();

            public t1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.o0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.o0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class t2 extends jo.q implements io.p<xq.a, uq.a, hf.c> {

            /* renamed from: w  reason: collision with root package name */
            public static final t2 f20316w = new t2();

            public t2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.c invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.c((Context) aVar.c(jo.f0.b(Context.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (jf.d0) aVar.c(jo.f0.b(jf.d0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class t3 extends jo.q implements io.p<xq.a, uq.a, NoticeCampaignVisibleLogger> {

            /* renamed from: w  reason: collision with root package name */
            public static final t3 f20317w = new t3();

            public t3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final NoticeCampaignVisibleLogger invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new NoticeCampaignVisibleLogger((MRLogger) aVar.c(jo.f0.b(MRLogger.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class t4 extends jo.q implements io.p<xq.a, uq.a, EmomoApi> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20318w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public t4(MirrativApplication mirrativApplication) {
                super(2);
                this.f20318w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final EmomoApi invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return (EmomoApi) this.f20318w.k(((ServerConfig) aVar.c(jo.f0.b(ServerConfig.class), null, null)).getServerURL(), (ep.z) aVar.c(jo.f0.b(ep.z.class), null, null), EmomoApi.class);
            }
        }

        /* loaded from: classes.dex */
        public static final class t5 extends jo.q implements io.p<xq.a, uq.a, ib.a> {

            /* renamed from: w  reason: collision with root package name */
            public static final t5 f20319w = new t5();

            public t5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final ib.a invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new ib.a((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class u extends jo.q implements io.p<xq.a, uq.a, od.d> {

            /* renamed from: w  reason: collision with root package name */
            public static final u f20320w = new u();

            public u() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.d invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.d((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class u0 extends jo.q implements io.p<xq.a, uq.a, od.g0> {

            /* renamed from: w  reason: collision with root package name */
            public static final u0 f20321w = new u0();

            public u0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.g0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.g0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (MRLogger) aVar.c(jo.f0.b(MRLogger.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class u1 extends jo.q implements io.p<xq.a, uq.a, nf.k0> {

            /* renamed from: w  reason: collision with root package name */
            public static final u1 f20322w = new u1();

            public u1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.k0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.k0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class u2 extends jo.q implements io.p<xq.a, uq.a, jf.d0> {

            /* renamed from: w  reason: collision with root package name */
            public static final u2 f20323w = new u2();

            public u2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final jf.d0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new jf.d0();
            }
        }

        /* loaded from: classes.dex */
        public static final class u3 extends jo.q implements io.p<xq.a, uq.a, q8.a> {

            /* renamed from: w  reason: collision with root package name */
            public static final u3 f20324w = new u3();

            public u3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final q8.a invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new q8.a();
            }
        }

        /* loaded from: classes.dex */
        public static final class u4 extends jo.q implements io.p<xq.a, uq.a, od.v> {

            /* renamed from: w  reason: collision with root package name */
            public static final u4 f20325w = new u4();

            public u4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.v invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new od.v((jf.x) aVar2.b(0, jo.f0.b(jf.x.class)), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class u5 extends jo.q implements io.p<xq.a, uq.a, od.k> {

            /* renamed from: w  reason: collision with root package name */
            public static final u5 f20326w = new u5();

            public u5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.k invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new od.k((String) aVar2.b(0, jo.f0.b(String.class)), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class v extends jo.q implements io.p<xq.a, uq.a, kf.x> {

            /* renamed from: w  reason: collision with root package name */
            public static final v f20327w = new v();

            public v() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final kf.x invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new kf.y((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class v0 extends jo.q implements io.p<xq.a, uq.a, od.f> {

            /* renamed from: w  reason: collision with root package name */
            public static final v0 f20328w = new v0();

            public v0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.f invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.f((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class v1 extends jo.q implements io.p<xq.a, uq.a, od.p0> {

            /* renamed from: w  reason: collision with root package name */
            public static final v1 f20329w = new v1();

            public v1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.p0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.p0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class v2 extends jo.q implements io.p<xq.a, uq.a, nd.i1> {

            /* renamed from: w  reason: collision with root package name */
            public static final v2 f20330w = new v2();

            public v2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nd.i1 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new nd.i1(null, false, null, null, null, null, null, 127, null);
            }
        }

        /* loaded from: classes.dex */
        public static final class v3 extends jo.q implements io.p<xq.a, uq.a, od.p> {

            /* renamed from: w  reason: collision with root package name */
            public static final v3 f20331w = new v3();

            public v3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.p invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.p((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (hf.h0) aVar.c(jo.f0.b(hf.h0.class), null, null), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null), (Context) aVar.c(jo.f0.b(Context.class), null, null), (MRLogger) aVar.c(jo.f0.b(MRLogger.class), null, null), (hf.w0) aVar.c(jo.f0.b(hf.w0.class), null, null), (kf.p) aVar.c(jo.f0.b(kf.p.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class v4 extends jo.q implements io.p<xq.a, uq.a, hf.j0> {

            /* renamed from: w  reason: collision with root package name */
            public static final v4 f20332w = new v4();

            public v4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.j0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new hf.j0();
            }
        }

        /* loaded from: classes.dex */
        public static final class v5 extends jo.q implements io.p<xq.a, uq.a, od.j> {

            /* renamed from: w  reason: collision with root package name */
            public static final v5 f20333w = new v5();

            public v5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.j invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.j((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (kf.i) aVar.c(jo.f0.b(kf.i.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class w extends jo.q implements io.p<xq.a, uq.a, nf.e> {

            /* renamed from: w  reason: collision with root package name */
            public static final w f20334w = new w();

            public w() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.e invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.e((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class w0 extends jo.q implements io.p<xq.a, uq.a, hf.j> {

            /* renamed from: w  reason: collision with root package name */
            public static final w0 f20335w = new w0();

            public w0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.j invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new hf.k();
            }
        }

        /* loaded from: classes.dex */
        public static final class w1 extends jo.q implements io.p<xq.a, uq.a, nf.l0> {

            /* renamed from: w  reason: collision with root package name */
            public static final w1 f20336w = new w1();

            public w1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.l0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.l0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class w2 extends jo.q implements io.p<xq.a, uq.a, NotificationLog> {

            /* renamed from: w  reason: collision with root package name */
            public static final w2 f20337w = new w2();

            public w2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final NotificationLog invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new NotificationLog();
            }
        }

        /* loaded from: classes.dex */
        public static final class w3 extends jo.q implements io.p<xq.a, uq.a, hf.h0> {

            /* renamed from: w  reason: collision with root package name */
            public static final w3 f20338w = new w3();

            public w3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.h0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.i0((MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (hf.s) aVar.c(jo.f0.b(hf.s.class), null, null), (kf.p) aVar.c(jo.f0.b(kf.p.class), null, null), (hf.f0) aVar.c(jo.f0.b(hf.f0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class w4 extends jo.q implements io.p<xq.a, uq.a, od.a> {

            /* renamed from: w  reason: collision with root package name */
            public static final w4 f20339w = new w4();

            public w4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.a invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.a((MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class w5 extends jo.q implements io.p<xq.a, uq.a, nf.z> {

            /* renamed from: w  reason: collision with root package name */
            public static final w5 f20340w = new w5();

            public w5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.z invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new nf.z((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (hf.s) aVar.c(jo.f0.b(hf.s.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class x extends jo.q implements io.p<xq.a, uq.a, nf.q> {

            /* renamed from: w  reason: collision with root package name */
            public static final x f20341w = new x();

            public x() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.q invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new nf.q((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class x0 extends jo.q implements io.p<xq.a, uq.a, nf.h> {

            /* renamed from: w  reason: collision with root package name */
            public static final x0 f20342w = new x0();

            public x0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.h invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return nf.h.K.a((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class x1 extends jo.q implements io.p<xq.a, uq.a, hc.z0> {

            /* renamed from: w  reason: collision with root package name */
            public static final x1 f20343w = new x1();

            public x1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hc.z0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new hc.z0((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class x2 extends jo.q implements io.p<xq.a, uq.a, hf.e0> {

            /* renamed from: w  reason: collision with root package name */
            public static final x2 f20344w = new x2();

            public x2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.e0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.e0((Context) aVar.c(jo.f0.b(Context.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class x3 extends jo.q implements io.p<xq.a, uq.a, ServerConfig> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20345w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public x3(MirrativApplication mirrativApplication) {
                super(2);
                this.f20345w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final ServerConfig invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                ServerConfig serverConfig = this.f20345w.f20173y;
                if (serverConfig == null) {
                    jo.p.v("serverConfig");
                    return null;
                }
                return serverConfig;
            }
        }

        /* loaded from: classes.dex */
        public static final class x4 extends jo.q implements io.p<xq.a, uq.a, nf.b> {

            /* renamed from: w  reason: collision with root package name */
            public static final x4 f20346w = new x4();

            public x4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.b invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new nf.b((String) aVar2.b(0, jo.f0.b(String.class)), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class x5 extends jo.q implements io.p<xq.a, uq.a, kf.k> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MirrativApplication f20347w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public x5(MirrativApplication mirrativApplication) {
                super(2);
                this.f20347w = mirrativApplication;
            }

            @Override // io.p
            /* renamed from: a */
            public final kf.k invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                Object systemService = this.f20347w.getApplicationContext().getSystemService("notification");
                jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                return new kf.l((NotificationManager) systemService);
            }
        }

        /* loaded from: classes.dex */
        public static final class y extends jo.q implements io.p<xq.a, uq.a, ud.v4> {

            /* renamed from: w  reason: collision with root package name */
            public static final y f20348w = new y();

            public y() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final ud.v4 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new ud.v4();
            }
        }

        /* loaded from: classes.dex */
        public static final class y0 extends jo.q implements io.p<xq.a, uq.a, zb.d> {

            /* renamed from: w  reason: collision with root package name */
            public static final y0 f20349w = new y0();

            public y0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final zb.d invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new zb.d((MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class y1 extends jo.q implements io.p<xq.a, uq.a, kf.m> {

            /* renamed from: w  reason: collision with root package name */
            public static final y1 f20350w = new y1();

            public y1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final kf.m invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new kf.n((Context) aVar.c(jo.f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class y2 extends jo.q implements io.p<xq.a, uq.a, UnityReceiver> {

            /* renamed from: w  reason: collision with root package name */
            public static final y2 f20351w = new y2();

            public y2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final UnityReceiver invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                UnityReceiver unityReceiver = new UnityReceiver((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (hf.n) aVar.c(jo.f0.b(hf.n.class), null, null));
                UnityPlayerToAndroid.receiver = unityReceiver;
                return unityReceiver;
            }
        }

        /* loaded from: classes.dex */
        public static final class y3 extends jo.q implements io.p<xq.a, uq.a, hf.f0> {

            /* renamed from: w  reason: collision with root package name */
            public static final y3 f20352w = new y3();

            public y3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.f0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.g0((hf.s) aVar.c(jo.f0.b(hf.s.class), null, null), (nf.k) aVar.c(jo.f0.b(nf.k.class), null, null), 0L, null, 12, null);
            }
        }

        /* loaded from: classes.dex */
        public static final class y4 extends jo.q implements io.p<xq.a, uq.a, hf.q0> {

            /* renamed from: w  reason: collision with root package name */
            public static final y4 f20353w = new y4();

            public y4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.q0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new hf.r0((Activity) aVar2.b(0, jo.f0.b(Activity.class)));
            }
        }

        /* loaded from: classes.dex */
        public static final class y5 extends jo.q implements io.p<xq.a, uq.a, kf.r> {

            /* renamed from: w  reason: collision with root package name */
            public static final y5 f20354w = new y5();

            public y5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final kf.r invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new kf.s((kf.t) aVar.c(jo.f0.b(kf.t.class), null, null), (kf.k) aVar.c(jo.f0.b(kf.k.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class z extends jo.q implements io.p<xq.a, uq.a, ib.e> {

            /* renamed from: w  reason: collision with root package name */
            public static final z f20355w = new z();

            public z() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final ib.e invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new ib.e((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class z0 extends jo.q implements io.p<xq.a, uq.a, zb.k> {

            /* renamed from: w  reason: collision with root package name */
            public static final z0 f20356w = new z0();

            public z0() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final zb.k invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new zb.k((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class z1 extends jo.q implements io.p<xq.a, uq.a, od.q> {

            /* renamed from: w  reason: collision with root package name */
            public static final z1 f20357w = new z1();

            public z1() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final od.q invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new od.q((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class z2 extends jo.q implements io.p<xq.a, uq.a, hf.n> {

            /* renamed from: w  reason: collision with root package name */
            public static final z2 f20358w = new z2();

            public z2() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.n invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.o();
            }
        }

        /* loaded from: classes.dex */
        public static final class z3 extends jo.q implements io.p<xq.a, uq.a, hf.w0> {

            /* renamed from: w  reason: collision with root package name */
            public static final z3 f20359w = new z3();

            public z3() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.w0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new hf.x0((hf.s) aVar.c(jo.f0.b(hf.s.class), null, null), (nf.k) aVar.c(jo.f0.b(nf.k.class), null, null), 0L, null, 12, null);
            }
        }

        /* loaded from: classes.dex */
        public static final class z4 extends jo.q implements io.p<xq.a, uq.a, hf.s0> {

            /* renamed from: w  reason: collision with root package name */
            public static final z4 f20360w = new z4();

            /* loaded from: classes.dex */
            public static final class a extends jo.q implements io.a<uq.a> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ Activity f20361w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Activity activity) {
                    super(0);
                    this.f20361w = activity;
                }

                @Override // io.a
                /* renamed from: a */
                public final uq.a invoke() {
                    return uq.b.b(this.f20361w);
                }
            }

            public z4() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hf.s0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new hf.t0((MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null), (hf.q0) aVar.c(jo.f0.b(hf.q0.class), null, new a((Activity) aVar2.b(0, jo.f0.b(Activity.class)))));
            }
        }

        /* loaded from: classes.dex */
        public static final class z5 extends jo.q implements io.p<xq.a, uq.a, nf.o0> {

            /* renamed from: w  reason: collision with root package name */
            public static final z5 f20362w = new z5();

            public z5() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final nf.o0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                return new nf.o0((String) aVar2.b(0, jo.f0.b(String.class)), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (Resources) aVar.c(jo.f0.b(Resources.class), null, null));
            }
        }

        public c() {
            super(1);
        }

        public final void a(tq.a aVar) {
            jo.p.h(aVar, "$this$module");
            q2 q2Var = q2.f20294w;
            qq.d dVar = qq.d.Singleton;
            c.a aVar2 = wq.c.f59298e;
            qq.a aVar3 = new qq.a(aVar2.a(), jo.f0.b(tb.c.class), null, q2Var, dVar, xn.s.k());
            String a10 = qq.b.a(aVar3.b(), null, aVar2.a());
            rq.d<?> dVar2 = new rq.d<>(aVar3);
            tq.a.f(aVar, a10, dVar2, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar2);
            }
            new wn.k(aVar, dVar2);
            b3 b3Var = new b3(MirrativApplication.this);
            qq.a aVar4 = new qq.a(aVar2.a(), jo.f0.b(Context.class), null, b3Var, dVar, xn.s.k());
            String a11 = qq.b.a(aVar4.b(), null, aVar2.a());
            rq.d<?> dVar3 = new rq.d<>(aVar4);
            tq.a.f(aVar, a11, dVar3, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar3);
            }
            new wn.k(aVar, dVar3);
            m3 m3Var = new m3(MirrativApplication.this);
            qq.a aVar5 = new qq.a(aVar2.a(), jo.f0.b(Resources.class), null, m3Var, dVar, xn.s.k());
            String a12 = qq.b.a(aVar5.b(), null, aVar2.a());
            rq.d<?> dVar4 = new rq.d<>(aVar5);
            tq.a.f(aVar, a12, dVar4, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar4);
            }
            new wn.k(aVar, dVar4);
            x3 x3Var = new x3(MirrativApplication.this);
            qq.a aVar6 = new qq.a(aVar2.a(), jo.f0.b(ServerConfig.class), null, x3Var, dVar, xn.s.k());
            String a13 = qq.b.a(aVar6.b(), null, aVar2.a());
            rq.d<?> dVar5 = new rq.d<>(aVar6);
            tq.a.f(aVar, a13, dVar5, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar5);
            }
            new wn.k(aVar, dVar5);
            i4 i4Var = new i4(MirrativApplication.this);
            vq.c a14 = aVar2.a();
            qq.d dVar6 = qq.d.Factory;
            qq.a aVar7 = new qq.a(a14, jo.f0.b(OtherFeaturesApi.class), null, i4Var, dVar6, xn.s.k());
            String a15 = qq.b.a(aVar7.b(), null, a14);
            rq.a aVar8 = new rq.a(aVar7);
            tq.a.f(aVar, a15, aVar8, false, 4, null);
            new wn.k(aVar, aVar8);
            t4 t4Var = new t4(MirrativApplication.this);
            vq.c a16 = aVar2.a();
            qq.a aVar9 = new qq.a(a16, jo.f0.b(EmomoApi.class), null, t4Var, dVar6, xn.s.k());
            String a17 = qq.b.a(aVar9.b(), null, a16);
            rq.a aVar10 = new rq.a(aVar9);
            tq.a.f(aVar, a17, aVar10, false, 4, null);
            new wn.k(aVar, aVar10);
            e5 e5Var = new e5(MirrativApplication.this);
            vq.c a18 = aVar2.a();
            qq.a aVar11 = new qq.a(a18, jo.f0.b(UserApi.class), null, e5Var, dVar6, xn.s.k());
            String a19 = qq.b.a(aVar11.b(), null, a18);
            rq.a aVar12 = new rq.a(aVar11);
            tq.a.f(aVar, a19, aVar12, false, 4, null);
            new wn.k(aVar, aVar12);
            p5 p5Var = new p5(MirrativApplication.this);
            vq.c a20 = aVar2.a();
            qq.a aVar13 = new qq.a(a20, jo.f0.b(LiveGameApi.class), null, p5Var, dVar6, xn.s.k());
            String a21 = qq.b.a(aVar13.b(), null, a20);
            rq.a aVar14 = new rq.a(aVar13);
            tq.a.f(aVar, a21, aVar14, false, 4, null);
            new wn.k(aVar, aVar14);
            a6 a6Var = new a6(MirrativApplication.this);
            vq.c a22 = aVar2.a();
            qq.a aVar15 = new qq.a(a22, jo.f0.b(MRClientLogRequest.class), null, a6Var, dVar6, xn.s.k());
            String a23 = qq.b.a(aVar15.b(), null, a22);
            rq.a aVar16 = new rq.a(aVar15);
            tq.a.f(aVar, a23, aVar16, false, 4, null);
            new wn.k(aVar, aVar16);
            k kVar = new k(MirrativApplication.this);
            vq.c a24 = aVar2.a();
            qq.a aVar17 = new qq.a(a24, jo.f0.b(MRRequest.class), null, kVar, dVar6, xn.s.k());
            String a25 = qq.b.a(aVar17.b(), null, a24);
            rq.a aVar18 = new rq.a(aVar17);
            tq.a.f(aVar, a25, aVar18, false, 4, null);
            new wn.k(aVar, aVar18);
            v vVar = v.f20327w;
            qq.a aVar19 = new qq.a(aVar2.a(), jo.f0.b(kf.x.class), null, vVar, dVar, xn.s.k());
            String a26 = qq.b.a(aVar19.b(), null, aVar2.a());
            rq.d<?> dVar7 = new rq.d<>(aVar19);
            tq.a.f(aVar, a26, dVar7, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar7);
            }
            new wn.k(aVar, dVar7);
            g0 g0Var = g0.f20222w;
            qq.a aVar20 = new qq.a(aVar2.a(), jo.f0.b(kf.t.class), null, g0Var, dVar, xn.s.k());
            String a27 = qq.b.a(aVar20.b(), null, aVar2.a());
            rq.d<?> dVar8 = new rq.d<>(aVar20);
            tq.a.f(aVar, a27, dVar8, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar8);
            }
            new wn.k(aVar, dVar8);
            r0 r0Var = r0.f20299w;
            qq.a aVar21 = new qq.a(aVar2.a(), jo.f0.b(kf.a.class), null, r0Var, dVar, xn.s.k());
            String a28 = qq.b.a(aVar21.b(), null, aVar2.a());
            rq.d<?> dVar9 = new rq.d<>(aVar21);
            tq.a.f(aVar, a28, dVar9, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar9);
            }
            new wn.k(aVar, dVar9);
            c1 c1Var = c1.f20195w;
            qq.a aVar22 = new qq.a(aVar2.a(), jo.f0.b(xe.a.class), null, c1Var, dVar, xn.s.k());
            String a29 = qq.b.a(aVar22.b(), null, aVar2.a());
            rq.d<?> dVar10 = new rq.d<>(aVar22);
            tq.a.f(aVar, a29, dVar10, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar10);
            }
            new wn.k(aVar, dVar10);
            n1 n1Var = n1.f20272w;
            qq.a aVar23 = new qq.a(aVar2.a(), jo.f0.b(kf.i.class), null, n1Var, dVar, xn.s.k());
            String a30 = qq.b.a(aVar23.b(), null, aVar2.a());
            rq.d<?> dVar11 = new rq.d<>(aVar23);
            tq.a.f(aVar, a30, dVar11, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar11);
            }
            new wn.k(aVar, dVar11);
            y1 y1Var = y1.f20350w;
            qq.a aVar24 = new qq.a(aVar2.a(), jo.f0.b(kf.m.class), null, y1Var, dVar, xn.s.k());
            String a31 = qq.b.a(aVar24.b(), null, aVar2.a());
            rq.d<?> dVar12 = new rq.d<>(aVar24);
            tq.a.f(aVar, a31, dVar12, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar12);
            }
            new wn.k(aVar, dVar12);
            j2 j2Var = j2.f20245w;
            qq.a aVar25 = new qq.a(aVar2.a(), jo.f0.b(kf.g.class), null, j2Var, dVar, xn.s.k());
            String a32 = qq.b.a(aVar25.b(), null, aVar2.a());
            rq.d<?> dVar13 = new rq.d<>(aVar25);
            tq.a.f(aVar, a32, dVar13, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar13);
            }
            new wn.k(aVar, dVar13);
            o2 o2Var = o2.f20280w;
            qq.a aVar26 = new qq.a(aVar2.a(), jo.f0.b(kf.e.class), null, o2Var, dVar, xn.s.k());
            String a33 = qq.b.a(aVar26.b(), null, aVar2.a());
            rq.d<?> dVar14 = new rq.d<>(aVar26);
            tq.a.f(aVar, a33, dVar14, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar14);
            }
            new wn.k(aVar, dVar14);
            p2 p2Var = p2.f20287w;
            qq.a aVar27 = new qq.a(aVar2.a(), jo.f0.b(hf.v0.class), null, p2Var, dVar, xn.s.k());
            String a34 = qq.b.a(aVar27.b(), null, aVar2.a());
            rq.d<?> dVar15 = new rq.d<>(aVar27);
            tq.a.f(aVar, a34, dVar15, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar15);
            }
            new wn.k(aVar, dVar15);
            r2 r2Var = r2.f20301w;
            qq.a aVar28 = new qq.a(aVar2.a(), jo.f0.b(hf.o0.class), null, r2Var, dVar, xn.s.k());
            String a35 = qq.b.a(aVar28.b(), null, aVar2.a());
            rq.d<?> dVar16 = new rq.d<>(aVar28);
            tq.a.f(aVar, a35, dVar16, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar16);
            }
            new wn.k(aVar, dVar16);
            s2 s2Var = s2.f20309w;
            qq.a aVar29 = new qq.a(aVar2.a(), jo.f0.b(hf.d.class), null, s2Var, dVar, xn.s.k());
            String a36 = qq.b.a(aVar29.b(), null, aVar2.a());
            rq.d<?> dVar17 = new rq.d<>(aVar29);
            tq.a.f(aVar, a36, dVar17, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar17);
            }
            new wn.k(aVar, dVar17);
            t2 t2Var = t2.f20316w;
            qq.a aVar30 = new qq.a(aVar2.a(), jo.f0.b(hf.c.class), null, t2Var, dVar, xn.s.k());
            String a37 = qq.b.a(aVar30.b(), null, aVar2.a());
            rq.d<?> dVar18 = new rq.d<>(aVar30);
            tq.a.f(aVar, a37, dVar18, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar18);
            }
            new wn.k(aVar, dVar18);
            u2 u2Var = u2.f20323w;
            qq.a aVar31 = new qq.a(aVar2.a(), jo.f0.b(jf.d0.class), null, u2Var, dVar, xn.s.k());
            String a38 = qq.b.a(aVar31.b(), null, aVar2.a());
            rq.d<?> dVar19 = new rq.d<>(aVar31);
            tq.a.f(aVar, a38, dVar19, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar19);
            }
            new wn.k(aVar, dVar19);
            v2 v2Var = v2.f20330w;
            qq.a aVar32 = new qq.a(aVar2.a(), jo.f0.b(nd.i1.class), null, v2Var, dVar, xn.s.k());
            String a39 = qq.b.a(aVar32.b(), null, aVar2.a());
            rq.d<?> dVar20 = new rq.d<>(aVar32);
            tq.a.f(aVar, a39, dVar20, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar20);
            }
            new wn.k(aVar, dVar20);
            w2 w2Var = w2.f20337w;
            qq.a aVar33 = new qq.a(aVar2.a(), jo.f0.b(NotificationLog.class), null, w2Var, dVar, xn.s.k());
            String a40 = qq.b.a(aVar33.b(), null, aVar2.a());
            rq.d<?> dVar21 = new rq.d<>(aVar33);
            tq.a.f(aVar, a40, dVar21, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar21);
            }
            new wn.k(aVar, dVar21);
            x2 x2Var = x2.f20344w;
            qq.a aVar34 = new qq.a(aVar2.a(), jo.f0.b(hf.e0.class), null, x2Var, dVar, xn.s.k());
            String a41 = qq.b.a(aVar34.b(), null, aVar2.a());
            rq.d<?> dVar22 = new rq.d<>(aVar34);
            tq.a.f(aVar, a41, dVar22, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar22);
            }
            new wn.k(aVar, dVar22);
            y2 y2Var = y2.f20351w;
            qq.a aVar35 = new qq.a(aVar2.a(), jo.f0.b(UnityReceiver.class), null, y2Var, dVar, xn.s.k());
            String a42 = qq.b.a(aVar35.b(), null, aVar2.a());
            rq.d<?> dVar23 = new rq.d<>(aVar35);
            tq.a.f(aVar, a42, dVar23, false, 4, null);
            aVar.b().add(dVar23);
            new wn.k(aVar, dVar23);
            z2 z2Var = z2.f20358w;
            qq.a aVar36 = new qq.a(aVar2.a(), jo.f0.b(hf.n.class), null, z2Var, dVar, xn.s.k());
            String a43 = qq.b.a(aVar36.b(), null, aVar2.a());
            rq.d<?> dVar24 = new rq.d<>(aVar36);
            tq.a.f(aVar, a43, dVar24, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar24);
            }
            new wn.k(aVar, dVar24);
            a3 a3Var = a3.f20182w;
            qq.a aVar37 = new qq.a(aVar2.a(), jo.f0.b(hf.r.class), null, a3Var, dVar, xn.s.k());
            String a44 = qq.b.a(aVar37.b(), null, aVar2.a());
            rq.d<?> dVar25 = new rq.d<>(aVar37);
            tq.a.f(aVar, a44, dVar25, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar25);
            }
            new wn.k(aVar, dVar25);
            c3 c3Var = c3.f20197w;
            qq.a aVar38 = new qq.a(aVar2.a(), jo.f0.b(ef.a.class), null, c3Var, dVar, xn.s.k());
            String a45 = qq.b.a(aVar38.b(), null, aVar2.a());
            rq.d<?> dVar26 = new rq.d<>(aVar38);
            tq.a.f(aVar, a45, dVar26, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar26);
            }
            new wn.k(aVar, dVar26);
            d3 d3Var = d3.f20204w;
            qq.a aVar39 = new qq.a(aVar2.a(), jo.f0.b(kf.c.class), null, d3Var, dVar, xn.s.k());
            String a46 = qq.b.a(aVar39.b(), null, aVar2.a());
            rq.d<?> dVar27 = new rq.d<>(aVar39);
            tq.a.f(aVar, a46, dVar27, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar27);
            }
            new wn.k(aVar, dVar27);
            e3 e3Var = e3.f20211w;
            qq.a aVar40 = new qq.a(aVar2.a(), jo.f0.b(CookieRepository.class), null, e3Var, dVar, xn.s.k());
            String a47 = qq.b.a(aVar40.b(), null, aVar2.a());
            rq.d<?> dVar28 = new rq.d<>(aVar40);
            tq.a.f(aVar, a47, dVar28, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar28);
            }
            new wn.k(aVar, dVar28);
            f3 f3Var = f3.f20218w;
            qq.a aVar41 = new qq.a(aVar2.a(), jo.f0.b(MRCookieJar.class), null, f3Var, dVar, xn.s.k());
            String a48 = qq.b.a(aVar41.b(), null, aVar2.a());
            rq.d<?> dVar29 = new rq.d<>(aVar41);
            tq.a.f(aVar, a48, dVar29, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar29);
            }
            new wn.k(aVar, dVar29);
            g3 g3Var = g3.f20225w;
            qq.a aVar42 = new qq.a(aVar2.a(), jo.f0.b(hf.c0.class), null, g3Var, dVar, xn.s.k());
            String a49 = qq.b.a(aVar42.b(), null, aVar2.a());
            rq.d<?> dVar30 = new rq.d<>(aVar42);
            tq.a.f(aVar, a49, dVar30, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar30);
            }
            new wn.k(aVar, dVar30);
            h3 h3Var = new h3(MirrativApplication.this);
            qq.a aVar43 = new qq.a(aVar2.a(), jo.f0.b(ep.z.class), null, h3Var, dVar, xn.s.k());
            String a50 = qq.b.a(aVar43.b(), null, aVar2.a());
            rq.d<?> dVar31 = new rq.d<>(aVar43);
            tq.a.f(aVar, a50, dVar31, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar31);
            }
            new wn.k(aVar, dVar31);
            i3 i3Var = new i3(MirrativApplication.this);
            qq.a aVar44 = new qq.a(aVar2.a(), jo.f0.b(SimpleCache.class), null, i3Var, dVar, xn.s.k());
            String a51 = qq.b.a(aVar44.b(), null, aVar2.a());
            rq.d<?> dVar32 = new rq.d<>(aVar44);
            tq.a.f(aVar, a51, dVar32, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar32);
            }
            new wn.k(aVar, dVar32);
            j3 j3Var = new j3(MirrativApplication.this);
            qq.a aVar45 = new qq.a(aVar2.a(), jo.f0.b(x5.e.class), null, j3Var, dVar, xn.s.k());
            String a52 = qq.b.a(aVar45.b(), null, aVar2.a());
            rq.d<?> dVar33 = new rq.d<>(aVar45);
            tq.a.f(aVar, a52, dVar33, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar33);
            }
            new wn.k(aVar, dVar33);
            k3 k3Var = k3.f20253w;
            qq.a aVar46 = new qq.a(aVar2.a(), jo.f0.b(of.r.class), null, k3Var, dVar, xn.s.k());
            String a53 = qq.b.a(aVar46.b(), null, aVar2.a());
            rq.d<?> dVar34 = new rq.d<>(aVar46);
            tq.a.f(aVar, a53, dVar34, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar34);
            }
            new wn.k(aVar, dVar34);
            l3 l3Var = l3.f20260w;
            qq.a aVar47 = new qq.a(aVar2.a(), jo.f0.b(hf.m0.class), null, l3Var, dVar, xn.s.k());
            String a54 = qq.b.a(aVar47.b(), null, aVar2.a());
            rq.d<?> dVar35 = new rq.d<>(aVar47);
            tq.a.f(aVar, a54, dVar35, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar35);
            }
            new wn.k(aVar, dVar35);
            n3 n3Var = n3.f20274w;
            qq.a aVar48 = new qq.a(aVar2.a(), jo.f0.b(ze.w.class), null, n3Var, dVar, xn.s.k());
            String a55 = qq.b.a(aVar48.b(), null, aVar2.a());
            rq.d<?> dVar36 = new rq.d<>(aVar48);
            tq.a.f(aVar, a55, dVar36, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar36);
            }
            new wn.k(aVar, dVar36);
            o3 o3Var = o3.f20281w;
            qq.a aVar49 = new qq.a(aVar2.a(), jo.f0.b(hf.e.class), null, o3Var, dVar, xn.s.k());
            String a56 = qq.b.a(aVar49.b(), null, aVar2.a());
            rq.d<?> dVar37 = new rq.d<>(aVar49);
            tq.a.f(aVar, a56, dVar37, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar37);
            }
            new wn.k(aVar, dVar37);
            p3 p3Var = p3.f20288w;
            qq.a aVar50 = new qq.a(aVar2.a(), jo.f0.b(hf.d0.class), null, p3Var, dVar, xn.s.k());
            String a57 = qq.b.a(aVar50.b(), null, aVar2.a());
            rq.d<?> dVar38 = new rq.d<>(aVar50);
            tq.a.f(aVar, a57, dVar38, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar38);
            }
            new wn.k(aVar, dVar38);
            q3 q3Var = q3.f20295w;
            qq.a aVar51 = new qq.a(aVar2.a(), jo.f0.b(MirrorDatabase.class), null, q3Var, dVar, xn.s.k());
            String a58 = qq.b.a(aVar51.b(), null, aVar2.a());
            rq.d<?> dVar39 = new rq.d<>(aVar51);
            tq.a.f(aVar, a58, dVar39, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar39);
            }
            new wn.k(aVar, dVar39);
            r3 r3Var = r3.f20302w;
            qq.a aVar52 = new qq.a(aVar2.a(), jo.f0.b(MRLogger.class), null, r3Var, dVar, xn.s.k());
            String a59 = qq.b.a(aVar52.b(), null, aVar2.a());
            rq.d<?> dVar40 = new rq.d<>(aVar52);
            tq.a.f(aVar, a59, dVar40, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar40);
            }
            new wn.k(aVar, dVar40);
            s3 s3Var = s3.f20310w;
            qq.a aVar53 = new qq.a(aVar2.a(), jo.f0.b(LiveCatalogVisibleLogger.class), null, s3Var, dVar, xn.s.k());
            String a60 = qq.b.a(aVar53.b(), null, aVar2.a());
            rq.d<?> dVar41 = new rq.d<>(aVar53);
            tq.a.f(aVar, a60, dVar41, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar41);
            }
            new wn.k(aVar, dVar41);
            t3 t3Var = t3.f20317w;
            vq.c a61 = aVar2.a();
            qq.a aVar54 = new qq.a(a61, jo.f0.b(NoticeCampaignVisibleLogger.class), null, t3Var, dVar6, xn.s.k());
            String a62 = qq.b.a(aVar54.b(), null, a61);
            rq.a aVar55 = new rq.a(aVar54);
            tq.a.f(aVar, a62, aVar55, false, 4, null);
            new wn.k(aVar, aVar55);
            u3 u3Var = u3.f20324w;
            qq.a aVar56 = new qq.a(aVar2.a(), jo.f0.b(q8.a.class), null, u3Var, dVar, xn.s.k());
            String a63 = qq.b.a(aVar56.b(), null, aVar2.a());
            rq.d<?> dVar42 = new rq.d<>(aVar56);
            tq.a.f(aVar, a63, dVar42, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar42);
            }
            new wn.k(aVar, dVar42);
            v3 v3Var = v3.f20331w;
            vq.c a64 = aVar2.a();
            qq.a aVar57 = new qq.a(a64, jo.f0.b(od.p.class), null, v3Var, dVar6, xn.s.k());
            String a65 = qq.b.a(aVar57.b(), null, a64);
            rq.a aVar58 = new rq.a(aVar57);
            tq.a.f(aVar, a65, aVar58, false, 4, null);
            new wn.k(aVar, aVar58);
            w3 w3Var = w3.f20338w;
            qq.a aVar59 = new qq.a(aVar2.a(), jo.f0.b(hf.h0.class), null, w3Var, dVar, xn.s.k());
            String a66 = qq.b.a(aVar59.b(), null, aVar2.a());
            rq.d<?> dVar43 = new rq.d<>(aVar59);
            tq.a.f(aVar, a66, dVar43, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar43);
            }
            new wn.k(aVar, dVar43);
            y3 y3Var = y3.f20352w;
            qq.a aVar60 = new qq.a(aVar2.a(), jo.f0.b(hf.f0.class), null, y3Var, dVar, xn.s.k());
            String a67 = qq.b.a(aVar60.b(), null, aVar2.a());
            rq.d<?> dVar44 = new rq.d<>(aVar60);
            tq.a.f(aVar, a67, dVar44, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar44);
            }
            new wn.k(aVar, dVar44);
            z3 z3Var = z3.f20359w;
            qq.a aVar61 = new qq.a(aVar2.a(), jo.f0.b(hf.w0.class), null, z3Var, dVar, xn.s.k());
            String a68 = qq.b.a(aVar61.b(), null, aVar2.a());
            rq.d<?> dVar45 = new rq.d<>(aVar61);
            tq.a.f(aVar, a68, dVar45, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar45);
            }
            new wn.k(aVar, dVar45);
            a4 a4Var = a4.f20183w;
            qq.a aVar62 = new qq.a(aVar2.a(), jo.f0.b(hf.a0.class), null, a4Var, dVar, xn.s.k());
            String a69 = qq.b.a(aVar62.b(), null, aVar2.a());
            rq.d<?> dVar46 = new rq.d<>(aVar62);
            tq.a.f(aVar, a69, dVar46, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar46);
            }
            new wn.k(aVar, dVar46);
            b4 b4Var = b4.f20191w;
            qq.a aVar63 = new qq.a(aVar2.a(), jo.f0.b(hf.s.class), null, b4Var, dVar, xn.s.k());
            String a70 = qq.b.a(aVar63.b(), null, aVar2.a());
            rq.d<?> dVar47 = new rq.d<>(aVar63);
            tq.a.f(aVar, a70, dVar47, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar47);
            }
            new wn.k(aVar, dVar47);
            c4 c4Var = c4.f20198w;
            qq.a aVar64 = new qq.a(aVar2.a(), jo.f0.b(nf.o.class), null, c4Var, dVar, xn.s.k());
            String a71 = qq.b.a(aVar64.b(), null, aVar2.a());
            rq.d<?> dVar48 = new rq.d<>(aVar64);
            tq.a.f(aVar, a71, dVar48, false, 4, null);
            aVar.b().add(dVar48);
            new wn.k(aVar, dVar48);
            d4 d4Var = d4.f20205w;
            qq.a aVar65 = new qq.a(aVar2.a(), jo.f0.b(kf.v.class), null, d4Var, dVar, xn.s.k());
            String a72 = qq.b.a(aVar65.b(), null, aVar2.a());
            rq.d<?> dVar49 = new rq.d<>(aVar65);
            tq.a.f(aVar, a72, dVar49, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar49);
            }
            new wn.k(aVar, dVar49);
            e4 e4Var = e4.f20212w;
            qq.a aVar66 = new qq.a(aVar2.a(), jo.f0.b(kf.p.class), null, e4Var, dVar, xn.s.k());
            String a73 = qq.b.a(aVar66.b(), null, aVar2.a());
            rq.d<?> dVar50 = new rq.d<>(aVar66);
            tq.a.f(aVar, a73, dVar50, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar50);
            }
            new wn.k(aVar, dVar50);
            f4 f4Var = f4.f20219w;
            qq.a aVar67 = new qq.a(aVar2.a(), jo.f0.b(hf.q.class), null, f4Var, dVar, xn.s.k());
            String a74 = qq.b.a(aVar67.b(), null, aVar2.a());
            rq.d<?> dVar51 = new rq.d<>(aVar67);
            tq.a.f(aVar, a74, dVar51, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar51);
            }
            new wn.k(aVar, dVar51);
            g4 g4Var = g4.f20226w;
            qq.a aVar68 = new qq.a(aVar2.a(), jo.f0.b(hf.p.class), null, g4Var, dVar, xn.s.k());
            String a75 = qq.b.a(aVar68.b(), null, aVar2.a());
            rq.d<?> dVar52 = new rq.d<>(aVar68);
            tq.a.f(aVar, a75, dVar52, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar52);
            }
            new wn.k(aVar, dVar52);
            h4 h4Var = h4.f20233w;
            qq.a aVar69 = new qq.a(aVar2.a(), jo.f0.b(hf.u.class), null, h4Var, dVar, xn.s.k());
            String a76 = qq.b.a(aVar69.b(), null, aVar2.a());
            rq.d<?> dVar53 = new rq.d<>(aVar69);
            tq.a.f(aVar, a76, dVar53, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar53);
            }
            new wn.k(aVar, dVar53);
            j4 j4Var = j4.f20247w;
            qq.a aVar70 = new qq.a(aVar2.a(), jo.f0.b(hf.w.class), null, j4Var, dVar, xn.s.k());
            String a77 = qq.b.a(aVar70.b(), null, aVar2.a());
            rq.d<?> dVar54 = new rq.d<>(aVar70);
            tq.a.f(aVar, a77, dVar54, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar54);
            }
            new wn.k(aVar, dVar54);
            k4 k4Var = k4.f20254w;
            qq.a aVar71 = new qq.a(aVar2.a(), jo.f0.b(hf.k0.class), null, k4Var, dVar, xn.s.k());
            String a78 = qq.b.a(aVar71.b(), null, aVar2.a());
            rq.d<?> dVar55 = new rq.d<>(aVar71);
            tq.a.f(aVar, a78, dVar55, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar55);
            }
            new wn.k(aVar, dVar55);
            l4 l4Var = l4.f20261w;
            qq.a aVar72 = new qq.a(aVar2.a(), jo.f0.b(hf.f.class), null, l4Var, dVar, xn.s.k());
            String a79 = qq.b.a(aVar72.b(), null, aVar2.a());
            rq.d<?> dVar56 = new rq.d<>(aVar72);
            tq.a.f(aVar, a79, dVar56, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar56);
            }
            new wn.k(aVar, dVar56);
            m4 m4Var = m4.f20268w;
            qq.d dVar57 = qq.d.Singleton;
            c.a aVar73 = wq.c.f59298e;
            qq.a aVar74 = new qq.a(aVar73.a(), jo.f0.b(hf.y.class), null, m4Var, dVar57, xn.s.k());
            String a80 = qq.b.a(aVar74.b(), null, aVar73.a());
            rq.d<?> dVar58 = new rq.d<>(aVar74);
            tq.a.f(aVar, a80, dVar58, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar58);
            }
            new wn.k(aVar, dVar58);
            n4 n4Var = n4.f20275w;
            qq.a aVar75 = new qq.a(aVar73.a(), jo.f0.b(nf.w.class), null, n4Var, dVar57, xn.s.k());
            String a81 = qq.b.a(aVar75.b(), null, aVar73.a());
            rq.d<?> dVar59 = new rq.d<>(aVar75);
            tq.a.f(aVar, a81, dVar59, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar59);
            }
            new wn.k(aVar, dVar59);
            o4 o4Var = o4.f20282w;
            qq.a aVar76 = new qq.a(aVar73.a(), jo.f0.b(nd.j1.class), null, o4Var, dVar57, xn.s.k());
            String a82 = qq.b.a(aVar76.b(), null, aVar73.a());
            rq.d<?> dVar60 = new rq.d<>(aVar76);
            tq.a.f(aVar, a82, dVar60, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar60);
            }
            new wn.k(aVar, dVar60);
            p4 p4Var = p4.f20289w;
            qq.a aVar77 = new qq.a(aVar73.a(), jo.f0.b(nf.k.class), null, p4Var, dVar57, xn.s.k());
            String a83 = qq.b.a(aVar77.b(), null, aVar73.a());
            rq.d<?> dVar61 = new rq.d<>(aVar77);
            tq.a.f(aVar, a83, dVar61, false, 4, null);
            aVar.b().add(dVar61);
            new wn.k(aVar, dVar61);
            q4 q4Var = q4.f20296w;
            qq.a aVar78 = new qq.a(aVar73.a(), jo.f0.b(nf.p0.class), null, q4Var, dVar57, xn.s.k());
            String a84 = qq.b.a(aVar78.b(), null, aVar73.a());
            rq.d<?> dVar62 = new rq.d<>(aVar78);
            tq.a.f(aVar, a84, dVar62, false, 4, null);
            aVar.b().add(dVar62);
            new wn.k(aVar, dVar62);
            r4 r4Var = r4.f20303w;
            qq.a aVar79 = new qq.a(aVar73.a(), jo.f0.b(hf.u0.class), null, r4Var, dVar57, xn.s.k());
            String a85 = qq.b.a(aVar79.b(), null, aVar73.a());
            rq.d<?> dVar63 = new rq.d<>(aVar79);
            tq.a.f(aVar, a85, dVar63, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar63);
            }
            new wn.k(aVar, dVar63);
            s4 s4Var = s4.f20311w;
            qq.a aVar80 = new qq.a(aVar73.a(), jo.f0.b(nf.j0.class), null, s4Var, dVar57, xn.s.k());
            String a86 = qq.b.a(aVar80.b(), null, aVar73.a());
            rq.d<?> dVar64 = new rq.d<>(aVar80);
            tq.a.f(aVar, a86, dVar64, false, 4, null);
            aVar.b().add(dVar64);
            new wn.k(aVar, dVar64);
            u4 u4Var = u4.f20325w;
            vq.c a87 = aVar73.a();
            qq.d dVar65 = qq.d.Factory;
            qq.a aVar81 = new qq.a(a87, jo.f0.b(od.v.class), null, u4Var, dVar65, xn.s.k());
            String a88 = qq.b.a(aVar81.b(), null, a87);
            rq.a aVar82 = new rq.a(aVar81);
            tq.a.f(aVar, a88, aVar82, false, 4, null);
            new wn.k(aVar, aVar82);
            v4 v4Var = v4.f20332w;
            vq.c a89 = aVar73.a();
            qq.a aVar83 = new qq.a(a89, jo.f0.b(hf.j0.class), null, v4Var, dVar65, xn.s.k());
            String a90 = qq.b.a(aVar83.b(), null, a89);
            rq.a aVar84 = new rq.a(aVar83);
            tq.a.f(aVar, a90, aVar84, false, 4, null);
            new wn.k(aVar, aVar84);
            w4 w4Var = w4.f20339w;
            vq.c a91 = aVar73.a();
            qq.a aVar85 = new qq.a(a91, jo.f0.b(od.a.class), null, w4Var, dVar65, xn.s.k());
            String a92 = qq.b.a(aVar85.b(), null, a91);
            rq.a aVar86 = new rq.a(aVar85);
            tq.a.f(aVar, a92, aVar86, false, 4, null);
            new wn.k(aVar, aVar86);
            x4 x4Var = x4.f20346w;
            vq.c a93 = aVar73.a();
            qq.a aVar87 = new qq.a(a93, jo.f0.b(nf.b.class), null, x4Var, dVar65, xn.s.k());
            String a94 = qq.b.a(aVar87.b(), null, a93);
            rq.a aVar88 = new rq.a(aVar87);
            tq.a.f(aVar, a94, aVar88, false, 4, null);
            new wn.k(aVar, aVar88);
            y4 y4Var = y4.f20353w;
            vq.c a95 = aVar73.a();
            qq.a aVar89 = new qq.a(a95, jo.f0.b(hf.q0.class), null, y4Var, dVar65, xn.s.k());
            String a96 = qq.b.a(aVar89.b(), null, a95);
            rq.a aVar90 = new rq.a(aVar89);
            tq.a.f(aVar, a96, aVar90, false, 4, null);
            new wn.k(aVar, aVar90);
            z4 z4Var = z4.f20360w;
            vq.c a97 = aVar73.a();
            qq.a aVar91 = new qq.a(a97, jo.f0.b(hf.s0.class), null, z4Var, dVar65, xn.s.k());
            String a98 = qq.b.a(aVar91.b(), null, a97);
            rq.a aVar92 = new rq.a(aVar91);
            tq.a.f(aVar, a98, aVar92, false, 4, null);
            new wn.k(aVar, aVar92);
            a5 a5Var = a5.f20184w;
            qq.a aVar93 = new qq.a(aVar73.a(), jo.f0.b(od.b.class), null, a5Var, dVar57, xn.s.k());
            String a99 = qq.b.a(aVar93.b(), null, aVar73.a());
            rq.d<?> dVar66 = new rq.d<>(aVar93);
            tq.a.f(aVar, a99, dVar66, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar66);
            }
            new wn.k(aVar, dVar66);
            b5 b5Var = b5.f20192w;
            qq.a aVar94 = new qq.a(aVar73.a(), jo.f0.b(nf.c.class), null, b5Var, dVar57, xn.s.k());
            String a100 = qq.b.a(aVar94.b(), null, aVar73.a());
            rq.d<?> dVar67 = new rq.d<>(aVar94);
            tq.a.f(aVar, a100, dVar67, false, 4, null);
            aVar.b().add(dVar67);
            new wn.k(aVar, dVar67);
            c5 c5Var = c5.f20199w;
            qq.a aVar95 = new qq.a(aVar73.a(), jo.f0.b(of.k.class), null, c5Var, dVar57, xn.s.k());
            String a101 = qq.b.a(aVar95.b(), null, aVar73.a());
            rq.d<?> dVar68 = new rq.d<>(aVar95);
            tq.a.f(aVar, a101, dVar68, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar68);
            }
            new wn.k(aVar, dVar68);
            d5 d5Var = d5.f20206w;
            qq.a aVar96 = new qq.a(aVar73.a(), jo.f0.b(hf.l.class), null, d5Var, dVar57, xn.s.k());
            String a102 = qq.b.a(aVar96.b(), null, aVar73.a());
            rq.d<?> dVar69 = new rq.d<>(aVar96);
            tq.a.f(aVar, a102, dVar69, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar69);
            }
            new wn.k(aVar, dVar69);
            f5 f5Var = f5.f20220w;
            vq.c a103 = aVar73.a();
            qq.a aVar97 = new qq.a(a103, jo.f0.b(nf.i0.class), null, f5Var, dVar65, xn.s.k());
            String a104 = qq.b.a(aVar97.b(), null, a103);
            rq.a aVar98 = new rq.a(aVar97);
            tq.a.f(aVar, a104, aVar98, false, 4, null);
            new wn.k(aVar, aVar98);
            g5 g5Var = g5.f20227w;
            vq.c a105 = aVar73.a();
            qq.a aVar99 = new qq.a(a105, jo.f0.b(od.a0.class), null, g5Var, dVar65, xn.s.k());
            String a106 = qq.b.a(aVar99.b(), null, a105);
            rq.a aVar100 = new rq.a(aVar99);
            tq.a.f(aVar, a106, aVar100, false, 4, null);
            new wn.k(aVar, aVar100);
            h5 h5Var = h5.f20234w;
            vq.c a107 = aVar73.a();
            qq.a aVar101 = new qq.a(a107, jo.f0.b(od.e0.class), null, h5Var, dVar65, xn.s.k());
            String a108 = qq.b.a(aVar101.b(), null, a107);
            rq.a aVar102 = new rq.a(aVar101);
            tq.a.f(aVar, a108, aVar102, false, 4, null);
            new wn.k(aVar, aVar102);
            i5 i5Var = i5.f20241w;
            vq.c a109 = aVar73.a();
            qq.a aVar103 = new qq.a(a109, jo.f0.b(od.f0.class), null, i5Var, dVar65, xn.s.k());
            String a110 = qq.b.a(aVar103.b(), null, a109);
            rq.a aVar104 = new rq.a(aVar103);
            tq.a.f(aVar, a110, aVar104, false, 4, null);
            new wn.k(aVar, aVar104);
            j5 j5Var = j5.f20248w;
            vq.c a111 = aVar73.a();
            qq.a aVar105 = new qq.a(a111, jo.f0.b(od.c0.class), null, j5Var, dVar65, xn.s.k());
            String a112 = qq.b.a(aVar105.b(), null, a111);
            rq.a aVar106 = new rq.a(aVar105);
            tq.a.f(aVar, a112, aVar106, false, 4, null);
            new wn.k(aVar, aVar106);
            k5 k5Var = k5.f20255w;
            vq.c a113 = aVar73.a();
            qq.a aVar107 = new qq.a(a113, jo.f0.b(od.d0.class), null, k5Var, dVar65, xn.s.k());
            String a114 = qq.b.a(aVar107.b(), null, a113);
            rq.a aVar108 = new rq.a(aVar107);
            tq.a.f(aVar, a114, aVar108, false, 4, null);
            new wn.k(aVar, aVar108);
            l5 l5Var = l5.f20262w;
            vq.c a115 = aVar73.a();
            qq.a aVar109 = new qq.a(a115, jo.f0.b(gd.c.class), null, l5Var, dVar65, xn.s.k());
            String a116 = qq.b.a(aVar109.b(), null, a115);
            rq.a aVar110 = new rq.a(aVar109);
            tq.a.f(aVar, a116, aVar110, false, 4, null);
            new wn.k(aVar, aVar110);
            m5 m5Var = m5.f20269w;
            vq.c a117 = aVar73.a();
            qq.a aVar111 = new qq.a(a117, jo.f0.b(gb.a.class), null, m5Var, dVar65, xn.s.k());
            String a118 = qq.b.a(aVar111.b(), null, a117);
            rq.a aVar112 = new rq.a(aVar111);
            tq.a.f(aVar, a118, aVar112, false, 4, null);
            new wn.k(aVar, aVar112);
            n5 n5Var = n5.f20276w;
            vq.c a119 = aVar73.a();
            qq.a aVar113 = new qq.a(a119, jo.f0.b(od.b0.class), null, n5Var, dVar65, xn.s.k());
            String a120 = qq.b.a(aVar113.b(), null, a119);
            rq.a aVar114 = new rq.a(aVar113);
            tq.a.f(aVar, a120, aVar114, false, 4, null);
            new wn.k(aVar, aVar114);
            o5 o5Var = o5.f20283w;
            vq.c a121 = aVar73.a();
            qq.a aVar115 = new qq.a(a121, jo.f0.b(od.l.class), null, o5Var, dVar65, xn.s.k());
            String a122 = qq.b.a(aVar115.b(), null, a121);
            rq.a aVar116 = new rq.a(aVar115);
            tq.a.f(aVar, a122, aVar116, false, 4, null);
            new wn.k(aVar, aVar116);
            q5 q5Var = q5.f20297w;
            vq.c a123 = aVar73.a();
            qq.a aVar117 = new qq.a(a123, jo.f0.b(od.r.class), null, q5Var, dVar65, xn.s.k());
            String a124 = qq.b.a(aVar117.b(), null, a123);
            rq.a aVar118 = new rq.a(aVar117);
            tq.a.f(aVar, a124, aVar118, false, 4, null);
            new wn.k(aVar, aVar118);
            r5 r5Var = r5.f20304w;
            vq.c a125 = aVar73.a();
            qq.a aVar119 = new qq.a(a125, jo.f0.b(od.h0.class), null, r5Var, dVar65, xn.s.k());
            String a126 = qq.b.a(aVar119.b(), null, a125);
            rq.a aVar120 = new rq.a(aVar119);
            tq.a.f(aVar, a126, aVar120, false, 4, null);
            new wn.k(aVar, aVar120);
            s5 s5Var = s5.f20312w;
            vq.c a127 = aVar73.a();
            qq.a aVar121 = new qq.a(a127, jo.f0.b(nf.b0.class), null, s5Var, dVar65, xn.s.k());
            String a128 = qq.b.a(aVar121.b(), null, a127);
            rq.a aVar122 = new rq.a(aVar121);
            tq.a.f(aVar, a128, aVar122, false, 4, null);
            new wn.k(aVar, aVar122);
            t5 t5Var = t5.f20319w;
            vq.c a129 = aVar73.a();
            qq.a aVar123 = new qq.a(a129, jo.f0.b(ib.a.class), null, t5Var, dVar65, xn.s.k());
            String a130 = qq.b.a(aVar123.b(), null, a129);
            rq.a aVar124 = new rq.a(aVar123);
            tq.a.f(aVar, a130, aVar124, false, 4, null);
            new wn.k(aVar, aVar124);
            u5 u5Var = u5.f20326w;
            vq.c a131 = aVar73.a();
            qq.a aVar125 = new qq.a(a131, jo.f0.b(od.k.class), null, u5Var, dVar65, xn.s.k());
            String a132 = qq.b.a(aVar125.b(), null, a131);
            rq.a aVar126 = new rq.a(aVar125);
            tq.a.f(aVar, a132, aVar126, false, 4, null);
            new wn.k(aVar, aVar126);
            v5 v5Var = v5.f20333w;
            vq.c a133 = aVar73.a();
            qq.a aVar127 = new qq.a(a133, jo.f0.b(od.j.class), null, v5Var, dVar65, xn.s.k());
            String a134 = qq.b.a(aVar127.b(), null, a133);
            rq.a aVar128 = new rq.a(aVar127);
            tq.a.f(aVar, a134, aVar128, false, 4, null);
            new wn.k(aVar, aVar128);
            w5 w5Var = w5.f20340w;
            qq.a aVar129 = new qq.a(aVar73.a(), jo.f0.b(nf.z.class), null, w5Var, dVar57, xn.s.k());
            String a135 = qq.b.a(aVar129.b(), null, aVar73.a());
            rq.d<?> dVar70 = new rq.d<>(aVar129);
            tq.a.f(aVar, a135, dVar70, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar70);
            }
            new wn.k(aVar, dVar70);
            x5 x5Var = new x5(MirrativApplication.this);
            qq.a aVar130 = new qq.a(aVar73.a(), jo.f0.b(kf.k.class), null, x5Var, dVar57, xn.s.k());
            String a136 = qq.b.a(aVar130.b(), null, aVar73.a());
            rq.d<?> dVar71 = new rq.d<>(aVar130);
            tq.a.f(aVar, a136, dVar71, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar71);
            }
            new wn.k(aVar, dVar71);
            y5 y5Var = y5.f20354w;
            qq.a aVar131 = new qq.a(aVar73.a(), jo.f0.b(kf.r.class), null, y5Var, dVar57, xn.s.k());
            String a137 = qq.b.a(aVar131.b(), null, aVar73.a());
            rq.d<?> dVar72 = new rq.d<>(aVar131);
            tq.a.f(aVar, a137, dVar72, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar72);
            }
            new wn.k(aVar, dVar72);
            z5 z5Var = z5.f20362w;
            vq.c a138 = aVar73.a();
            qq.a aVar132 = new qq.a(a138, jo.f0.b(nf.o0.class), null, z5Var, dVar65, xn.s.k());
            String a139 = qq.b.a(aVar132.b(), null, a138);
            rq.a aVar133 = new rq.a(aVar132);
            tq.a.f(aVar, a139, aVar133, false, 4, null);
            new wn.k(aVar, aVar133);
            a aVar134 = a.f20178w;
            vq.c a140 = aVar73.a();
            qq.a aVar135 = new qq.a(a140, jo.f0.b(od.t0.class), null, aVar134, dVar65, xn.s.k());
            String a141 = qq.b.a(aVar135.b(), null, a140);
            rq.a aVar136 = new rq.a(aVar135);
            tq.a.f(aVar, a141, aVar136, false, 4, null);
            new wn.k(aVar, aVar136);
            b bVar = new b(MirrativApplication.this);
            vq.c a142 = aVar73.a();
            qq.a aVar137 = new qq.a(a142, jo.f0.b(od.z.class), null, bVar, dVar65, xn.s.k());
            String a143 = qq.b.a(aVar137.b(), null, a142);
            rq.a aVar138 = new rq.a(aVar137);
            tq.a.f(aVar, a143, aVar138, false, 4, null);
            new wn.k(aVar, aVar138);
            C0177c c0177c = C0177c.f20193w;
            vq.c a144 = aVar73.a();
            qq.a aVar139 = new qq.a(a144, jo.f0.b(nf.y.class), null, c0177c, dVar65, xn.s.k());
            String a145 = qq.b.a(aVar139.b(), null, a144);
            rq.a aVar140 = new rq.a(aVar139);
            tq.a.f(aVar, a145, aVar140, false, 4, null);
            new wn.k(aVar, aVar140);
            d dVar73 = d.f20200w;
            vq.c a146 = aVar73.a();
            qq.a aVar141 = new qq.a(a146, jo.f0.b(od.t.class), null, dVar73, dVar65, xn.s.k());
            String a147 = qq.b.a(aVar141.b(), null, a146);
            rq.a aVar142 = new rq.a(aVar141);
            tq.a.f(aVar, a147, aVar142, false, 4, null);
            new wn.k(aVar, aVar142);
            e eVar = e.f20207w;
            vq.c a148 = aVar73.a();
            qq.a aVar143 = new qq.a(a148, jo.f0.b(nf.s.class), null, eVar, dVar65, xn.s.k());
            String a149 = qq.b.a(aVar143.b(), null, a148);
            rq.a aVar144 = new rq.a(aVar143);
            tq.a.f(aVar, a149, aVar144, false, 4, null);
            new wn.k(aVar, aVar144);
            f fVar = f.f20214w;
            vq.c a150 = aVar73.a();
            qq.a aVar145 = new qq.a(a150, jo.f0.b(rc.u.class), null, fVar, dVar65, xn.s.k());
            String a151 = qq.b.a(aVar145.b(), null, a150);
            rq.a aVar146 = new rq.a(aVar145);
            tq.a.f(aVar, a151, aVar146, false, 4, null);
            new wn.k(aVar, aVar146);
            g gVar = g.f20221w;
            vq.c a152 = aVar73.a();
            qq.a aVar147 = new qq.a(a152, jo.f0.b(rc.t.class), null, gVar, dVar65, xn.s.k());
            String a153 = qq.b.a(aVar147.b(), null, a152);
            rq.a aVar148 = new rq.a(aVar147);
            tq.a.f(aVar, a153, aVar148, false, 4, null);
            new wn.k(aVar, aVar148);
            h hVar = h.f20228w;
            vq.c a154 = aVar73.a();
            qq.a aVar149 = new qq.a(a154, jo.f0.b(od.w.class), null, hVar, dVar65, xn.s.k());
            String a155 = qq.b.a(aVar149.b(), null, a154);
            rq.a aVar150 = new rq.a(aVar149);
            tq.a.f(aVar, a155, aVar150, false, 4, null);
            new wn.k(aVar, aVar150);
            i iVar = i.f20235w;
            vq.c a156 = aVar73.a();
            qq.a aVar151 = new qq.a(a156, jo.f0.b(nf.v.class), null, iVar, dVar65, xn.s.k());
            String a157 = qq.b.a(aVar151.b(), null, a156);
            rq.a aVar152 = new rq.a(aVar151);
            tq.a.f(aVar, a157, aVar152, false, 4, null);
            new wn.k(aVar, aVar152);
            j jVar = j.f20242w;
            vq.c a158 = aVar73.a();
            qq.a aVar153 = new qq.a(a158, jo.f0.b(ud.i.class), null, jVar, dVar65, xn.s.k());
            String a159 = qq.b.a(aVar153.b(), null, a158);
            rq.a aVar154 = new rq.a(aVar153);
            tq.a.f(aVar, a159, aVar154, false, 4, null);
            new wn.k(aVar, aVar154);
            l lVar = l.f20256w;
            vq.c a160 = aVar73.a();
            qq.a aVar155 = new qq.a(a160, jo.f0.b(nf.a.class), null, lVar, dVar65, xn.s.k());
            String a161 = qq.b.a(aVar155.b(), null, a160);
            rq.a aVar156 = new rq.a(aVar155);
            tq.a.f(aVar, a161, aVar156, false, 4, null);
            new wn.k(aVar, aVar156);
            m mVar = m.f20263w;
            vq.c a162 = aVar73.a();
            qq.a aVar157 = new qq.a(a162, jo.f0.b(ud.j.class), null, mVar, dVar65, xn.s.k());
            String a163 = qq.b.a(aVar157.b(), null, a162);
            rq.a aVar158 = new rq.a(aVar157);
            tq.a.f(aVar, a163, aVar158, false, 4, null);
            new wn.k(aVar, aVar158);
            n nVar = n.f20270w;
            vq.c a164 = aVar73.a();
            qq.a aVar159 = new qq.a(a164, jo.f0.b(gd.g.class), null, nVar, dVar65, xn.s.k());
            String a165 = qq.b.a(aVar159.b(), null, a164);
            rq.a aVar160 = new rq.a(aVar159);
            tq.a.f(aVar, a165, aVar160, false, 4, null);
            new wn.k(aVar, aVar160);
            o oVar = o.f20277w;
            vq.c a166 = aVar73.a();
            qq.a aVar161 = new qq.a(a166, jo.f0.b(gb.g.class), null, oVar, dVar65, xn.s.k());
            String a167 = qq.b.a(aVar161.b(), null, a166);
            rq.a aVar162 = new rq.a(aVar161);
            tq.a.f(aVar, a167, aVar162, false, 4, null);
            new wn.k(aVar, aVar162);
            p pVar = p.f20284w;
            vq.c a168 = aVar73.a();
            qq.a aVar163 = new qq.a(a168, jo.f0.b(nf.m.class), null, pVar, dVar65, xn.s.k());
            String a169 = qq.b.a(aVar163.b(), null, a168);
            rq.a aVar164 = new rq.a(aVar163);
            tq.a.f(aVar, a169, aVar164, false, 4, null);
            new wn.k(aVar, aVar164);
            q qVar = q.f20291w;
            vq.c a170 = aVar73.a();
            qq.a aVar165 = new qq.a(a170, jo.f0.b(nf.f.class), null, qVar, dVar65, xn.s.k());
            String a171 = qq.b.a(aVar165.b(), null, a170);
            rq.a aVar166 = new rq.a(aVar165);
            tq.a.f(aVar, a171, aVar166, false, 4, null);
            new wn.k(aVar, aVar166);
            r rVar = r.f20298w;
            c.a aVar167 = wq.c.f59298e;
            vq.c a172 = aVar167.a();
            qq.a aVar168 = new qq.a(a172, jo.f0.b(od.e.class), null, rVar, dVar65, xn.s.k());
            String a173 = qq.b.a(aVar168.b(), null, a172);
            rq.a aVar169 = new rq.a(aVar168);
            tq.a.f(aVar, a173, aVar169, false, 4, null);
            new wn.k(aVar, aVar169);
            s sVar = s.f20306w;
            vq.c a174 = aVar167.a();
            qq.a aVar170 = new qq.a(a174, jo.f0.b(od.c.class), null, sVar, dVar65, xn.s.k());
            String a175 = qq.b.a(aVar170.b(), null, a174);
            rq.a aVar171 = new rq.a(aVar170);
            tq.a.f(aVar, a175, aVar171, false, 4, null);
            new wn.k(aVar, aVar171);
            t tVar = t.f20313w;
            vq.c a176 = aVar167.a();
            qq.a aVar172 = new qq.a(a176, jo.f0.b(nf.d.class), null, tVar, dVar65, xn.s.k());
            String a177 = qq.b.a(aVar172.b(), null, a176);
            rq.a aVar173 = new rq.a(aVar172);
            tq.a.f(aVar, a177, aVar173, false, 4, null);
            new wn.k(aVar, aVar173);
            u uVar = u.f20320w;
            vq.c a178 = aVar167.a();
            qq.a aVar174 = new qq.a(a178, jo.f0.b(od.d.class), null, uVar, dVar65, xn.s.k());
            String a179 = qq.b.a(aVar174.b(), null, a178);
            rq.a aVar175 = new rq.a(aVar174);
            tq.a.f(aVar, a179, aVar175, false, 4, null);
            new wn.k(aVar, aVar175);
            w wVar = w.f20334w;
            vq.c a180 = aVar167.a();
            qq.a aVar176 = new qq.a(a180, jo.f0.b(nf.e.class), null, wVar, dVar65, xn.s.k());
            String a181 = qq.b.a(aVar176.b(), null, a180);
            rq.a aVar177 = new rq.a(aVar176);
            tq.a.f(aVar, a181, aVar177, false, 4, null);
            new wn.k(aVar, aVar177);
            x xVar = x.f20341w;
            vq.c a182 = aVar167.a();
            qq.a aVar178 = new qq.a(a182, jo.f0.b(nf.q.class), null, xVar, dVar65, xn.s.k());
            String a183 = qq.b.a(aVar178.b(), null, a182);
            rq.a aVar179 = new rq.a(aVar178);
            tq.a.f(aVar, a183, aVar179, false, 4, null);
            new wn.k(aVar, aVar179);
            y yVar = y.f20348w;
            vq.c a184 = aVar167.a();
            qq.a aVar180 = new qq.a(a184, jo.f0.b(ud.v4.class), null, yVar, dVar65, xn.s.k());
            String a185 = qq.b.a(aVar180.b(), null, a184);
            rq.a aVar181 = new rq.a(aVar180);
            tq.a.f(aVar, a185, aVar181, false, 4, null);
            new wn.k(aVar, aVar181);
            z zVar = z.f20355w;
            vq.c a186 = aVar167.a();
            qq.d dVar74 = qq.d.Factory;
            qq.a aVar182 = new qq.a(a186, jo.f0.b(ib.e.class), null, zVar, dVar74, xn.s.k());
            String a187 = qq.b.a(aVar182.b(), null, a186);
            rq.a aVar183 = new rq.a(aVar182);
            tq.a.f(aVar, a187, aVar183, false, 4, null);
            new wn.k(aVar, aVar183);
            a0 a0Var = a0.f20179w;
            vq.c a188 = aVar167.a();
            qq.a aVar184 = new qq.a(a188, jo.f0.b(ib.e0.class), null, a0Var, dVar74, xn.s.k());
            String a189 = qq.b.a(aVar184.b(), null, a188);
            rq.a aVar185 = new rq.a(aVar184);
            tq.a.f(aVar, a189, aVar185, false, 4, null);
            new wn.k(aVar, aVar185);
            b0 b0Var = b0.f20187w;
            vq.c a190 = aVar167.a();
            qq.a aVar186 = new qq.a(a190, jo.f0.b(ib.d.class), null, b0Var, dVar74, xn.s.k());
            String a191 = qq.b.a(aVar186.b(), null, a190);
            rq.a aVar187 = new rq.a(aVar186);
            tq.a.f(aVar, a191, aVar187, false, 4, null);
            new wn.k(aVar, aVar187);
            c0 c0Var = c0.f20194w;
            vq.c a192 = aVar167.a();
            qq.a aVar188 = new qq.a(a192, jo.f0.b(nf.l.class), null, c0Var, dVar74, xn.s.k());
            String a193 = qq.b.a(aVar188.b(), null, a192);
            rq.a aVar189 = new rq.a(aVar188);
            tq.a.f(aVar, a193, aVar189, false, 4, null);
            new wn.k(aVar, aVar189);
            d0 d0Var = d0.f20201w;
            vq.c a194 = aVar167.a();
            qq.a aVar190 = new qq.a(a194, jo.f0.b(lc.e.class), null, d0Var, dVar74, xn.s.k());
            String a195 = qq.b.a(aVar190.b(), null, a194);
            rq.a aVar191 = new rq.a(aVar190);
            tq.a.f(aVar, a195, aVar191, false, 4, null);
            new wn.k(aVar, aVar191);
            e0 e0Var = e0.f20208w;
            vq.c a196 = aVar167.a();
            qq.a aVar192 = new qq.a(a196, jo.f0.b(lc.m.class), null, e0Var, dVar74, xn.s.k());
            String a197 = qq.b.a(aVar192.b(), null, a196);
            rq.a aVar193 = new rq.a(aVar192);
            tq.a.f(aVar, a197, aVar193, false, 4, null);
            new wn.k(aVar, aVar193);
            f0 f0Var = f0.f20215w;
            vq.c a198 = aVar167.a();
            qq.a aVar194 = new qq.a(a198, jo.f0.b(od.x.class), null, f0Var, dVar74, xn.s.k());
            String a199 = qq.b.a(aVar194.b(), null, a198);
            rq.a aVar195 = new rq.a(aVar194);
            tq.a.f(aVar, a199, aVar195, false, 4, null);
            new wn.k(aVar, aVar195);
            h0 h0Var = h0.f20229w;
            vq.c a200 = aVar167.a();
            qq.a aVar196 = new qq.a(a200, jo.f0.b(nf.x.class), null, h0Var, dVar74, xn.s.k());
            String a201 = qq.b.a(aVar196.b(), null, a200);
            rq.a aVar197 = new rq.a(aVar196);
            tq.a.f(aVar, a201, aVar197, false, 4, null);
            new wn.k(aVar, aVar197);
            i0 i0Var = i0.f20236w;
            vq.c a202 = aVar167.a();
            qq.a aVar198 = new qq.a(a202, jo.f0.b(od.m.class), null, i0Var, dVar74, xn.s.k());
            String a203 = qq.b.a(aVar198.b(), null, a202);
            rq.a aVar199 = new rq.a(aVar198);
            tq.a.f(aVar, a203, aVar199, false, 4, null);
            new wn.k(aVar, aVar199);
            j0 j0Var = j0.f20243w;
            vq.c a204 = aVar167.a();
            qq.a aVar200 = new qq.a(a204, jo.f0.b(nf.n.class), null, j0Var, dVar74, xn.s.k());
            String a205 = qq.b.a(aVar200.b(), null, a204);
            rq.a aVar201 = new rq.a(aVar200);
            tq.a.f(aVar, a205, aVar201, false, 4, null);
            new wn.k(aVar, aVar201);
            k0 k0Var = k0.f20250w;
            vq.c a206 = aVar167.a();
            qq.a aVar202 = new qq.a(a206, jo.f0.b(nf.j.class), null, k0Var, dVar74, xn.s.k());
            String a207 = qq.b.a(aVar202.b(), null, a206);
            rq.a aVar203 = new rq.a(aVar202);
            tq.a.f(aVar, a207, aVar203, false, 4, null);
            new wn.k(aVar, aVar203);
            l0 l0Var = l0.f20257w;
            vq.c a208 = aVar167.a();
            qq.a aVar204 = new qq.a(a208, jo.f0.b(od.i.class), null, l0Var, dVar74, xn.s.k());
            String a209 = qq.b.a(aVar204.b(), null, a208);
            rq.a aVar205 = new rq.a(aVar204);
            tq.a.f(aVar, a209, aVar205, false, 4, null);
            new wn.k(aVar, aVar205);
            m0 m0Var = m0.f20264w;
            vq.c a210 = aVar167.a();
            qq.a aVar206 = new qq.a(a210, jo.f0.b(nf.u.class), null, m0Var, dVar74, xn.s.k());
            String a211 = qq.b.a(aVar206.b(), null, a210);
            rq.a aVar207 = new rq.a(aVar206);
            tq.a.f(aVar, a211, aVar207, false, 4, null);
            new wn.k(aVar, aVar207);
            n0 n0Var = n0.f20271w;
            vq.c a212 = aVar167.a();
            qq.a aVar208 = new qq.a(a212, jo.f0.b(nf.h0.class), null, n0Var, dVar74, xn.s.k());
            String a213 = qq.b.a(aVar208.b(), null, a212);
            rq.a aVar209 = new rq.a(aVar208);
            tq.a.f(aVar, a213, aVar209, false, 4, null);
            new wn.k(aVar, aVar209);
            o0 o0Var = o0.f20278w;
            vq.c a214 = aVar167.a();
            qq.a aVar210 = new qq.a(a214, jo.f0.b(od.n0.class), null, o0Var, dVar74, xn.s.k());
            String a215 = qq.b.a(aVar210.b(), null, a214);
            rq.a aVar211 = new rq.a(aVar210);
            tq.a.f(aVar, a215, aVar211, false, 4, null);
            new wn.k(aVar, aVar211);
            p0 p0Var = p0.f20285w;
            vq.c a216 = aVar167.a();
            qq.a aVar212 = new qq.a(a216, jo.f0.b(je.e.class), null, p0Var, dVar74, xn.s.k());
            String a217 = qq.b.a(aVar212.b(), null, a216);
            rq.a aVar213 = new rq.a(aVar212);
            tq.a.f(aVar, a217, aVar213, false, 4, null);
            new wn.k(aVar, aVar213);
            q0 q0Var = q0.f20292w;
            vq.c a218 = aVar167.a();
            qq.a aVar214 = new qq.a(a218, jo.f0.b(od.s0.class), null, q0Var, dVar74, xn.s.k());
            String a219 = qq.b.a(aVar214.b(), null, a218);
            rq.a aVar215 = new rq.a(aVar214);
            tq.a.f(aVar, a219, aVar215, false, 4, null);
            new wn.k(aVar, aVar215);
            s0 s0Var = s0.f20307w;
            qq.d dVar75 = qq.d.Singleton;
            qq.a aVar216 = new qq.a(aVar167.a(), jo.f0.b(hf.h.class), null, s0Var, dVar75, xn.s.k());
            String a220 = qq.b.a(aVar216.b(), null, aVar167.a());
            rq.d<?> dVar76 = new rq.d<>(aVar216);
            tq.a.f(aVar, a220, dVar76, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar76);
            }
            new wn.k(aVar, dVar76);
            t0 t0Var = t0.f20314w;
            vq.c a221 = aVar167.a();
            qq.a aVar217 = new qq.a(a221, jo.f0.b(nf.a0.class), null, t0Var, dVar74, xn.s.k());
            String a222 = qq.b.a(aVar217.b(), null, a221);
            rq.a aVar218 = new rq.a(aVar217);
            tq.a.f(aVar, a222, aVar218, false, 4, null);
            new wn.k(aVar, aVar218);
            u0 u0Var = u0.f20321w;
            vq.c a223 = aVar167.a();
            qq.a aVar219 = new qq.a(a223, jo.f0.b(od.g0.class), null, u0Var, dVar74, xn.s.k());
            String a224 = qq.b.a(aVar219.b(), null, a223);
            rq.a aVar220 = new rq.a(aVar219);
            tq.a.f(aVar, a224, aVar220, false, 4, null);
            new wn.k(aVar, aVar220);
            v0 v0Var = v0.f20328w;
            vq.c a225 = aVar167.a();
            qq.a aVar221 = new qq.a(a225, jo.f0.b(od.f.class), null, v0Var, dVar74, xn.s.k());
            String a226 = qq.b.a(aVar221.b(), null, a225);
            rq.a aVar222 = new rq.a(aVar221);
            tq.a.f(aVar, a226, aVar222, false, 4, null);
            new wn.k(aVar, aVar222);
            w0 w0Var = w0.f20335w;
            vq.c a227 = aVar167.a();
            qq.a aVar223 = new qq.a(a227, jo.f0.b(hf.j.class), null, w0Var, dVar74, xn.s.k());
            String a228 = qq.b.a(aVar223.b(), null, a227);
            rq.a aVar224 = new rq.a(aVar223);
            tq.a.f(aVar, a228, aVar224, false, 4, null);
            new wn.k(aVar, aVar224);
            x0 x0Var = x0.f20342w;
            qq.a aVar225 = new qq.a(aVar167.a(), jo.f0.b(nf.h.class), null, x0Var, dVar75, xn.s.k());
            String a229 = qq.b.a(aVar225.b(), null, aVar167.a());
            rq.d<?> dVar77 = new rq.d<>(aVar225);
            tq.a.f(aVar, a229, dVar77, false, 4, null);
            aVar.b().add(dVar77);
            new wn.k(aVar, dVar77);
            y0 y0Var = y0.f20349w;
            vq.c a230 = aVar167.a();
            qq.a aVar226 = new qq.a(a230, jo.f0.b(zb.d.class), null, y0Var, dVar74, xn.s.k());
            String a231 = qq.b.a(aVar226.b(), null, a230);
            rq.a aVar227 = new rq.a(aVar226);
            tq.a.f(aVar, a231, aVar227, false, 4, null);
            new wn.k(aVar, aVar227);
            z0 z0Var = z0.f20356w;
            vq.c a232 = aVar167.a();
            qq.a aVar228 = new qq.a(a232, jo.f0.b(zb.k.class), null, z0Var, dVar74, xn.s.k());
            String a233 = qq.b.a(aVar228.b(), null, a232);
            rq.a aVar229 = new rq.a(aVar228);
            tq.a.f(aVar, a233, aVar229, false, 4, null);
            new wn.k(aVar, aVar229);
            a1 a1Var = a1.f20180w;
            vq.c a234 = aVar167.a();
            qq.a aVar230 = new qq.a(a234, jo.f0.b(UnityActionCreator.class), null, a1Var, dVar74, xn.s.k());
            String a235 = qq.b.a(aVar230.b(), null, a234);
            rq.a aVar231 = new rq.a(aVar230);
            tq.a.f(aVar, a235, aVar231, false, 4, null);
            new wn.k(aVar, aVar231);
            b1 b1Var = b1.f20188w;
            qq.a aVar232 = new qq.a(aVar167.a(), jo.f0.b(UnityStore.class), null, b1Var, dVar75, xn.s.k());
            String a236 = qq.b.a(aVar232.b(), null, aVar167.a());
            rq.d<?> dVar78 = new rq.d<>(aVar232);
            tq.a.f(aVar, a236, dVar78, false, 4, null);
            aVar.b().add(dVar78);
            new wn.k(aVar, dVar78);
            d1 d1Var = d1.f20202w;
            qq.a aVar233 = new qq.a(aVar167.a(), jo.f0.b(UnityCommandDispatcher.class), null, d1Var, dVar75, xn.s.k());
            String a237 = qq.b.a(aVar233.b(), null, aVar167.a());
            rq.d<?> dVar79 = new rq.d<>(aVar233);
            tq.a.f(aVar, a237, dVar79, false, 4, null);
            aVar.b().add(dVar79);
            new wn.k(aVar, dVar79);
            e1 e1Var = e1.f20209w;
            vq.c a238 = aVar167.a();
            qq.a aVar234 = new qq.a(a238, jo.f0.b(od.l0.class), null, e1Var, dVar74, xn.s.k());
            String a239 = qq.b.a(aVar234.b(), null, a238);
            rq.a aVar235 = new rq.a(aVar234);
            tq.a.f(aVar, a239, aVar235, false, 4, null);
            new wn.k(aVar, aVar235);
            f1 f1Var = f1.f20216w;
            vq.c a240 = aVar167.a();
            qq.a aVar236 = new qq.a(a240, jo.f0.b(nf.f0.class), null, f1Var, dVar74, xn.s.k());
            String a241 = qq.b.a(aVar236.b(), null, a240);
            rq.a aVar237 = new rq.a(aVar236);
            tq.a.f(aVar, a241, aVar237, false, 4, null);
            new wn.k(aVar, aVar237);
            g1 g1Var = g1.f20223w;
            vq.c a242 = aVar167.a();
            qq.a aVar238 = new qq.a(a242, jo.f0.b(od.k0.class), null, g1Var, dVar74, xn.s.k());
            String a243 = qq.b.a(aVar238.b(), null, a242);
            rq.a aVar239 = new rq.a(aVar238);
            tq.a.f(aVar, a243, aVar239, false, 4, null);
            new wn.k(aVar, aVar239);
            h1 h1Var = h1.f20230w;
            vq.c a244 = aVar167.a();
            qq.a aVar240 = new qq.a(a244, jo.f0.b(nf.e0.class), null, h1Var, dVar74, xn.s.k());
            String a245 = qq.b.a(aVar240.b(), null, a244);
            rq.a aVar241 = new rq.a(aVar240);
            tq.a.f(aVar, a245, aVar241, false, 4, null);
            new wn.k(aVar, aVar241);
            i1 i1Var = i1.f20237w;
            vq.c a246 = aVar167.a();
            qq.a aVar242 = new qq.a(a246, jo.f0.b(od.j0.class), null, i1Var, dVar74, xn.s.k());
            String a247 = qq.b.a(aVar242.b(), null, a246);
            rq.a aVar243 = new rq.a(aVar242);
            tq.a.f(aVar, a247, aVar243, false, 4, null);
            new wn.k(aVar, aVar243);
            j1 j1Var = j1.f20244w;
            vq.c a248 = aVar167.a();
            qq.a aVar244 = new qq.a(a248, jo.f0.b(nf.d0.class), null, j1Var, dVar74, xn.s.k());
            String a249 = qq.b.a(aVar244.b(), null, a248);
            rq.a aVar245 = new rq.a(aVar244);
            tq.a.f(aVar, a249, aVar245, false, 4, null);
            new wn.k(aVar, aVar245);
            k1 k1Var = k1.f20251w;
            vq.c a250 = aVar167.a();
            qq.a aVar246 = new qq.a(a250, jo.f0.b(od.m0.class), null, k1Var, dVar74, xn.s.k());
            String a251 = qq.b.a(aVar246.b(), null, a250);
            rq.a aVar247 = new rq.a(aVar246);
            tq.a.f(aVar, a251, aVar247, false, 4, null);
            new wn.k(aVar, aVar247);
            l1 l1Var = l1.f20258w;
            vq.c a252 = aVar167.a();
            qq.a aVar248 = new qq.a(a252, jo.f0.b(nf.g0.class), null, l1Var, dVar74, xn.s.k());
            String a253 = qq.b.a(aVar248.b(), null, a252);
            rq.a aVar249 = new rq.a(aVar248);
            tq.a.f(aVar, a253, aVar249, false, 4, null);
            new wn.k(aVar, aVar249);
            m1 m1Var = m1.f20265w;
            vq.c a254 = aVar167.a();
            qq.a aVar250 = new qq.a(a254, jo.f0.b(fc.a.class), null, m1Var, dVar74, xn.s.k());
            String a255 = qq.b.a(aVar250.b(), null, a254);
            rq.a aVar251 = new rq.a(aVar250);
            tq.a.f(aVar, a255, aVar251, false, 4, null);
            new wn.k(aVar, aVar251);
            o1 o1Var = o1.f20279w;
            vq.c a256 = aVar167.a();
            qq.a aVar252 = new qq.a(a256, jo.f0.b(fc.f.class), null, o1Var, dVar74, xn.s.k());
            String a257 = qq.b.a(aVar252.b(), null, a256);
            rq.a aVar253 = new rq.a(aVar252);
            tq.a.f(aVar, a257, aVar253, false, 4, null);
            new wn.k(aVar, aVar253);
            p1 p1Var = p1.f20286w;
            vq.c a258 = aVar167.a();
            qq.a aVar254 = new qq.a(a258, jo.f0.b(od.r0.class), null, p1Var, dVar74, xn.s.k());
            String a259 = qq.b.a(aVar254.b(), null, a258);
            rq.a aVar255 = new rq.a(aVar254);
            tq.a.f(aVar, a259, aVar255, false, 4, null);
            new wn.k(aVar, aVar255);
            q1 q1Var = q1.f20293w;
            vq.c a260 = aVar167.a();
            qq.a aVar256 = new qq.a(a260, jo.f0.b(nf.n0.class), null, q1Var, dVar74, xn.s.k());
            String a261 = qq.b.a(aVar256.b(), null, a260);
            rq.a aVar257 = new rq.a(aVar256);
            tq.a.f(aVar, a261, aVar257, false, 4, null);
            new wn.k(aVar, aVar257);
            r1 r1Var = r1.f20300w;
            vq.c a262 = aVar167.a();
            qq.a aVar258 = new qq.a(a262, jo.f0.b(od.q0.class), null, r1Var, dVar74, xn.s.k());
            String a263 = qq.b.a(aVar258.b(), null, a262);
            rq.a aVar259 = new rq.a(aVar258);
            tq.a.f(aVar, a263, aVar259, false, 4, null);
            new wn.k(aVar, aVar259);
            s1 s1Var = s1.f20308w;
            vq.c a264 = aVar167.a();
            qq.a aVar260 = new qq.a(a264, jo.f0.b(nf.m0.class), null, s1Var, dVar74, xn.s.k());
            String a265 = qq.b.a(aVar260.b(), null, a264);
            rq.a aVar261 = new rq.a(aVar260);
            tq.a.f(aVar, a265, aVar261, false, 4, null);
            new wn.k(aVar, aVar261);
            t1 t1Var = t1.f20315w;
            vq.c a266 = aVar167.a();
            qq.a aVar262 = new qq.a(a266, jo.f0.b(od.o0.class), null, t1Var, dVar74, xn.s.k());
            String a267 = qq.b.a(aVar262.b(), null, a266);
            rq.a aVar263 = new rq.a(aVar262);
            tq.a.f(aVar, a267, aVar263, false, 4, null);
            new wn.k(aVar, aVar263);
            u1 u1Var = u1.f20322w;
            c.a aVar264 = wq.c.f59298e;
            vq.c a268 = aVar264.a();
            qq.a aVar265 = new qq.a(a268, jo.f0.b(nf.k0.class), null, u1Var, dVar74, xn.s.k());
            String a269 = qq.b.a(aVar265.b(), null, a268);
            rq.a aVar266 = new rq.a(aVar265);
            tq.a.f(aVar, a269, aVar266, false, 4, null);
            new wn.k(aVar, aVar266);
            v1 v1Var = v1.f20329w;
            vq.c a270 = aVar264.a();
            qq.a aVar267 = new qq.a(a270, jo.f0.b(od.p0.class), null, v1Var, dVar74, xn.s.k());
            String a271 = qq.b.a(aVar267.b(), null, a270);
            rq.a aVar268 = new rq.a(aVar267);
            tq.a.f(aVar, a271, aVar268, false, 4, null);
            new wn.k(aVar, aVar268);
            w1 w1Var = w1.f20336w;
            vq.c a272 = aVar264.a();
            qq.a aVar269 = new qq.a(a272, jo.f0.b(nf.l0.class), null, w1Var, dVar74, xn.s.k());
            String a273 = qq.b.a(aVar269.b(), null, a272);
            rq.a aVar270 = new rq.a(aVar269);
            tq.a.f(aVar, a273, aVar270, false, 4, null);
            new wn.k(aVar, aVar270);
            x1 x1Var = x1.f20343w;
            vq.c a274 = aVar264.a();
            qq.a aVar271 = new qq.a(a274, jo.f0.b(hc.z0.class), null, x1Var, dVar74, xn.s.k());
            String a275 = qq.b.a(aVar271.b(), null, a274);
            rq.a aVar272 = new rq.a(aVar271);
            tq.a.f(aVar, a275, aVar272, false, 4, null);
            new wn.k(aVar, aVar272);
            z1 z1Var = z1.f20357w;
            vq.c a276 = aVar264.a();
            qq.a aVar273 = new qq.a(a276, jo.f0.b(od.q.class), null, z1Var, dVar74, xn.s.k());
            String a277 = qq.b.a(aVar273.b(), null, a276);
            rq.a aVar274 = new rq.a(aVar273);
            tq.a.f(aVar, a277, aVar274, false, 4, null);
            new wn.k(aVar, aVar274);
            a2 a2Var = a2.f20181w;
            vq.c a278 = aVar264.a();
            qq.a aVar275 = new qq.a(a278, jo.f0.b(nf.p.class), null, a2Var, dVar74, xn.s.k());
            String a279 = qq.b.a(aVar275.b(), null, a278);
            rq.a aVar276 = new rq.a(aVar275);
            tq.a.f(aVar, a279, aVar276, false, 4, null);
            new wn.k(aVar, aVar276);
            b2 b2Var = b2.f20189w;
            vq.c a280 = aVar264.a();
            qq.a aVar277 = new qq.a(a280, jo.f0.b(od.g.class), null, b2Var, dVar74, xn.s.k());
            String a281 = qq.b.a(aVar277.b(), null, a280);
            rq.a aVar278 = new rq.a(aVar277);
            tq.a.f(aVar, a281, aVar278, false, 4, null);
            new wn.k(aVar, aVar278);
            c2 c2Var = c2.f20196w;
            vq.c a282 = aVar264.a();
            qq.d dVar80 = qq.d.Factory;
            qq.a aVar279 = new qq.a(a282, jo.f0.b(nf.g.class), null, c2Var, dVar80, xn.s.k());
            String a283 = qq.b.a(aVar279.b(), null, a282);
            rq.a aVar280 = new rq.a(aVar279);
            tq.a.f(aVar, a283, aVar280, false, 4, null);
            new wn.k(aVar, aVar280);
            d2 d2Var = d2.f20203w;
            vq.c a284 = aVar264.a();
            qq.a aVar281 = new qq.a(a284, jo.f0.b(od.s.class), null, d2Var, dVar80, xn.s.k());
            String a285 = qq.b.a(aVar281.b(), null, a284);
            rq.a aVar282 = new rq.a(aVar281);
            tq.a.f(aVar, a285, aVar282, false, 4, null);
            new wn.k(aVar, aVar282);
            e2 e2Var = e2.f20210w;
            qq.a aVar283 = new qq.a(aVar264.a(), jo.f0.b(nf.r.class), null, e2Var, dVar75, xn.s.k());
            String a286 = qq.b.a(aVar283.b(), null, aVar264.a());
            rq.d<?> dVar81 = new rq.d<>(aVar283);
            tq.a.f(aVar, a286, dVar81, false, 4, null);
            aVar.b().add(dVar81);
            new wn.k(aVar, dVar81);
            f2 f2Var = f2.f20217w;
            vq.c a287 = aVar264.a();
            qq.a aVar284 = new qq.a(a287, jo.f0.b(od.h.class), null, f2Var, dVar80, xn.s.k());
            String a288 = qq.b.a(aVar284.b(), null, a287);
            rq.a aVar285 = new rq.a(aVar284);
            tq.a.f(aVar, a288, aVar285, false, 4, null);
            new wn.k(aVar, aVar285);
            g2 g2Var = g2.f20224w;
            qq.a aVar286 = new qq.a(aVar264.a(), jo.f0.b(nf.i.class), null, g2Var, dVar75, xn.s.k());
            String a289 = qq.b.a(aVar286.b(), null, aVar264.a());
            rq.d<?> dVar82 = new rq.d<>(aVar286);
            tq.a.f(aVar, a289, dVar82, false, 4, null);
            aVar.b().add(dVar82);
            new wn.k(aVar, dVar82);
            h2 h2Var = h2.f20231w;
            vq.c a290 = aVar264.a();
            qq.a aVar287 = new qq.a(a290, jo.f0.b(od.u0.class), null, h2Var, dVar80, xn.s.k());
            String a291 = qq.b.a(aVar287.b(), null, a290);
            rq.a aVar288 = new rq.a(aVar287);
            tq.a.f(aVar, a291, aVar288, false, 4, null);
            new wn.k(aVar, aVar288);
            i2 i2Var = i2.f20238w;
            vq.c a292 = aVar264.a();
            qq.a aVar289 = new qq.a(a292, jo.f0.b(nf.q0.class), null, i2Var, dVar80, xn.s.k());
            String a293 = qq.b.a(aVar289.b(), null, a292);
            rq.a aVar290 = new rq.a(aVar289);
            tq.a.f(aVar, a293, aVar290, false, 4, null);
            new wn.k(aVar, aVar290);
            k2 k2Var = k2.f20252w;
            vq.c a294 = aVar264.a();
            qq.a aVar291 = new qq.a(a294, jo.f0.b(od.i0.class), null, k2Var, dVar80, xn.s.k());
            String a295 = qq.b.a(aVar291.b(), null, a294);
            rq.a aVar292 = new rq.a(aVar291);
            tq.a.f(aVar, a295, aVar292, false, 4, null);
            new wn.k(aVar, aVar292);
            l2 l2Var = l2.f20259w;
            vq.c a296 = aVar264.a();
            qq.a aVar293 = new qq.a(a296, jo.f0.b(nf.c0.class), null, l2Var, dVar80, xn.s.k());
            String a297 = qq.b.a(aVar293.b(), null, a296);
            rq.a aVar294 = new rq.a(aVar293);
            tq.a.f(aVar, a297, aVar294, false, 4, null);
            new wn.k(aVar, aVar294);
            m2 m2Var = m2.f20266w;
            vq.c a298 = aVar264.a();
            qq.a aVar295 = new qq.a(a298, jo.f0.b(od.u.class), null, m2Var, dVar80, xn.s.k());
            String a299 = qq.b.a(aVar295.b(), null, a298);
            rq.a aVar296 = new rq.a(aVar295);
            tq.a.f(aVar, a299, aVar296, false, 4, null);
            new wn.k(aVar, aVar296);
            n2 n2Var = n2.f20273w;
            vq.c a300 = aVar264.a();
            qq.a aVar297 = new qq.a(a300, jo.f0.b(nf.t.class), null, n2Var, dVar80, xn.s.k());
            String a301 = qq.b.a(aVar297.b(), null, a300);
            rq.a aVar298 = new rq.a(aVar297);
            tq.a.f(aVar, a301, aVar298, false, 4, null);
            new wn.k(aVar, aVar298);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(tq.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements l<nq.b, v> {
        public d() {
            super(1);
        }

        public final void a(nq.b bVar) {
            p.h(bVar, "$this$startKoin");
            bVar.e(a0.o0(s.m(MirrativApplication.this.f20174z, MirrativApplication.this.A), MirrativApplication.this.B));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(nq.b bVar) {
            a(bVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<ef.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20364w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20365x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20366y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20364w = componentCallbacks;
            this.f20365x = aVar;
            this.f20366y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ef.a] */
        @Override // io.a
        public final ef.a invoke() {
            ComponentCallbacks componentCallbacks = this.f20364w;
            return gq.a.a(componentCallbacks).c(f0.b(ef.a.class), this.f20365x, this.f20366y);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20367w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20368x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20369y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20367w = componentCallbacks;
            this.f20368x = aVar;
            this.f20369y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kf.r] */
        @Override // io.a
        public final r invoke() {
            ComponentCallbacks componentCallbacks = this.f20367w;
            return gq.a.a(componentCallbacks).c(f0.b(r.class), this.f20368x, this.f20369y);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements l<tq.a, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final g f20370w = new g();

        /* loaded from: classes.dex */
        public static final class a extends q implements io.p<xq.a, uq.a, UnityPlayer> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f20371w = new a();

            public a() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final UnityPlayer invoke(xq.a aVar, uq.a aVar2) {
                p.h(aVar, "$this$single");
                p.h(aVar2, "it");
                return new UnityPlayer((Context) aVar.c(f0.b(Context.class), null, null));
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends q implements io.p<xq.a, uq.a, MRUnityPlayer> {

            /* renamed from: w  reason: collision with root package name */
            public static final b f20372w = new b();

            public b() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final MRUnityPlayer invoke(xq.a aVar, uq.a aVar2) {
                p.h(aVar, "$this$single");
                p.h(aVar2, "it");
                return new MRUnityPlayerImpl((UnityPlayer) aVar.c(f0.b(UnityPlayer.class), null, null));
            }
        }

        public g() {
            super(1);
        }

        public final void a(tq.a aVar) {
            p.h(aVar, "$this$module");
            a aVar2 = a.f20371w;
            qq.d dVar = qq.d.Singleton;
            c.a aVar3 = wq.c.f59298e;
            qq.a aVar4 = new qq.a(aVar3.a(), f0.b(UnityPlayer.class), null, aVar2, dVar, s.k());
            String a10 = qq.b.a(aVar4.b(), null, aVar3.a());
            rq.d<?> dVar2 = new rq.d<>(aVar4);
            tq.a.f(aVar, a10, dVar2, false, 4, null);
            aVar.b().add(dVar2);
            new k(aVar, dVar2);
            b bVar = b.f20372w;
            qq.a aVar5 = new qq.a(aVar3.a(), f0.b(MRUnityPlayer.class), null, bVar, dVar, s.k());
            String a11 = qq.b.a(aVar5.b(), null, aVar3.a());
            rq.d<?> dVar3 = new rq.d<>(aVar5);
            tq.a.f(aVar, a11, dVar3, false, 4, null);
            aVar.b().add(dVar3);
            new k(aVar, dVar3);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(tq.a aVar) {
            a(aVar);
            return v.f59242a;
        }
    }

    public MirrativApplication() {
        i iVar = i.SYNCHRONIZED;
        this.f20171w = wn.g.b(iVar, new e(this, null, null));
        this.f20172x = wn.g.b(iVar, new f(this, null, null));
        this.f20174z = zq.b.b(false, new c(), 1, null);
        this.A = zq.b.b(false, g.f20370w, 1, null);
        this.B = s.m(da.a.a(), j.a(), d9.a.a(), q9.b.a(), qa.k.a(), wa.b.a(), g1.a(), e0.a(), a2.a(), ja.d.a());
    }

    public final x5.e i(z zVar) {
        Context applicationContext = getApplicationContext();
        p.g(applicationContext, "applicationContext");
        e.a g10 = new e.a(applicationContext).g(zVar);
        b.a aVar = new b.a();
        if (Build.VERSION.SDK_INT >= 28) {
            aVar.a(new p.a(false, 1, null));
        } else {
            aVar.a(new o.b(false, 1, null));
        }
        return g10.d(aVar.e()).f(true).b();
    }

    public final z j(tb.c cVar, MRCookieJar mRCookieJar, c0 c0Var, ServerConfig serverConfig) {
        z.a f10 = new z.a().f(mRCookieJar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        z.a a10 = f10.e(20L, timeUnit).K(20L, timeUnit).a(new a(c0Var, serverConfig));
        Context applicationContext = getApplicationContext();
        jo.p.g(applicationContext, "applicationContext");
        z.a b10 = a10.b(new MRErrorInterceptor(applicationContext, cVar, new g9.c()));
        q0 b11 = r0.f42205a.b();
        Context applicationContext2 = getApplicationContext();
        jo.p.g(applicationContext2, "applicationContext");
        b11.c(b10, applicationContext2);
        return b10.c();
    }

    public final <T> T k(String str, z zVar, Class<T> cls) {
        return (T) new t.b().d(str).b(fr.a.g(new xm.f().e(xm.c.LOWER_CASE_WITH_UNDERSCORES).b())).a(gn.a.f33681a.a()).g(zVar).e().b(cls);
    }

    public final SimpleCache l() {
        return new SimpleCache(new File(getCacheDir(), "video"), new LeastRecentlyUsedCacheEvictor(52428800L), new ExoDatabaseProvider(this));
    }

    public final r m() {
        return (r) this.f20172x.getValue();
    }

    public final ef.a n() {
        return (ef.a) this.f20171w.getValue();
    }

    public final void o() {
        b4.a.f(new b4.e(getApplicationContext(), new l3.d("com.google.android.gms.fonts", "com.google.android.gms", "Noto Color Emoji Compat", (int) R.array.com_google_android_gms_fonts_certs)).b(true).a(new b()));
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        jo.p.g(applicationContext, "applicationContext");
        ServerConfigImpl serverConfigImpl = new ServerConfigImpl(applicationContext);
        this.f20173y = serverConfigImpl;
        q();
        u0.a aVar = u0.f42221a;
        Context applicationContext2 = getApplicationContext();
        jo.p.g(applicationContext2, "applicationContext");
        aVar.c(applicationContext2);
        p(serverConfigImpl);
        vd.c.f57301a.b(this);
        of.n.f45411a.w(this);
        hf.b.f35490a.e(this);
        r0.f42205a.b().b(this);
        x5.a.c((x5.e) gq.a.a(this).c(f0.b(x5.e.class), null, null));
        pk.c.n(this);
        j0.i().g().a(new AppLifecycleObserver());
        n().d();
        m().d();
        o();
    }

    public final void p(ServerConfig serverConfig) {
        in.o.i(new s.b(this).b(new in.q(serverConfig.getTwitterConsumerKey(), serverConfig.getTwitterConsumerSecrets())).a());
    }

    public final void q() {
        pq.a.a(new d());
    }
}
