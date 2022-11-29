package com.dena.mirrorman.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameAppRankingResponse;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameDetailResponse;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.activity.MainActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.feature.app.AppPageActivity;
import com.dena.mirrorman.feature.authentication.AppAuthenticationActivity;
import com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity;
import hf.d0;
import hf.v0;
import ie.j;
import java.io.Serializable;
import jf.b0;
import jo.f0;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.f1;
import nd.g1;
import nd.i1;
import nd.r0;
import p.d;
import tb.c;
import uo.q0;

/* loaded from: classes2.dex */
public final class HandleUrlSchemeActivity extends e.b implements ie.j, pe.c, q0 {

    /* renamed from: b0  reason: collision with root package name */
    public static final a f25127b0 = new a(null);

    /* renamed from: c0  reason: collision with root package name */
    public static final int f25128c0 = 8;
    public final ao.g O;
    public final wn.f P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final wn.f W;
    public final wn.f X;
    public final boolean Y;
    public final androidx.activity.result.c<Intent> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f25129a0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, b0 b0Var) {
            jo.p.h(context, "context");
            jo.p.h(str, "referer");
            jo.p.h(b0Var, "MRUrlScheme");
            Intent intent = new Intent(context, HandleUrlSchemeActivity.class);
            intent.putExtra("BUNDLE_KEY_REFERER", str);
            intent.putExtra("BUNDLE_KEY_MIRRATIV_URL_SCHEME", b0Var);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends FragmentManager.j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tb.a f25130a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ HandleUrlSchemeActivity f25131b;

        public b(tb.a aVar, HandleUrlSchemeActivity handleUrlSchemeActivity) {
            this.f25130a = aVar;
            this.f25131b = handleUrlSchemeActivity;
        }

        @Override // androidx.fragment.app.FragmentManager.j
        public void e(FragmentManager fragmentManager, Fragment fragment) {
            jo.p.h(fragmentManager, "fm");
            jo.p.h(fragment, "f");
            super.e(fragmentManager, fragment);
            if (jo.p.c(fragment.W0(), this.f25130a.b())) {
                this.f25131b.a3().n1(this);
                this.f25131b.finish();
            }
        }
    }

    @co.f(c = "com.dena.mirrorman.activity.HandleUrlSchemeActivity$observeStoreValues$10", f = "HandleUrlSchemeActivity.kt", l = {310}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25132w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<LiveGameAppRankingResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ HandleUrlSchemeActivity f25134w;

            public a(HandleUrlSchemeActivity handleUrlSchemeActivity) {
                this.f25134w = handleUrlSchemeActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(LiveGameAppRankingResponse liveGameAppRankingResponse, ao.d<? super wn.v> dVar) {
                if (liveGameAppRankingResponse.getUrl().length() == 0) {
                    of.n.A(this.f25134w, f1.text_live_game_app_ranking_not_exist, false);
                } else {
                    HandleUrlSchemeActivity handleUrlSchemeActivity = this.f25134w;
                    handleUrlSchemeActivity.startActivity(WebViewActivity.a.b(WebViewActivity.X, handleUrlSchemeActivity, liveGameAppRankingResponse.getUrl(), false, false, 12, null));
                }
                this.f25134w.finish();
                return wn.v.f59242a;
            }
        }

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25132w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<LiveGameAppRankingResponse> z10 = HandleUrlSchemeActivity.this.O3().z();
                a aVar = new a(HandleUrlSchemeActivity.this);
                this.f25132w = 1;
                if (z10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrorman.activity.HandleUrlSchemeActivity$observeStoreValues$1", f = "HandleUrlSchemeActivity.kt", l = {632}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f25135w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25136x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25137y;

        /* renamed from: z  reason: collision with root package name */
        public int f25138z;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f25138z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f25137y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f25136x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f25135w
                com.dena.mirrorman.activity.HandleUrlSchemeActivity r4 = (com.dena.mirrorman.activity.HandleUrlSchemeActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrorman.activity.HandleUrlSchemeActivity r9 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.this
                nf.q r9 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.F3(r9)
                wo.x r3 = r9.x()
                com.dena.mirrorman.activity.HandleUrlSchemeActivity r9 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f25135w = r4     // Catch: java.lang.Throwable -> L74
                r9.f25136x = r3     // Catch: java.lang.Throwable -> L74
                r9.f25137y = r1     // Catch: java.lang.Throwable -> L74
                r9.f25138z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                jf.b0 r9 = (jf.b0) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrorman.activity.HandleUrlSchemeActivity.G3(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.activity.HandleUrlSchemeActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.activity.HandleUrlSchemeActivity$observeStoreValues$2", f = "HandleUrlSchemeActivity.kt", l = {632}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f25139w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25140x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25141y;

        /* renamed from: z  reason: collision with root package name */
        public int f25142z;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f25142z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f25141y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f25140x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f25139w
                com.dena.mirrorman.activity.HandleUrlSchemeActivity r4 = (com.dena.mirrorman.activity.HandleUrlSchemeActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> La3
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrorman.activity.HandleUrlSchemeActivity r10 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.this
                nf.q r10 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.F3(r10)
                wo.x r3 = r10.s()
                com.dena.mirrorman.activity.HandleUrlSchemeActivity r10 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La3
                r4 = r10
                r10 = r9
            L3d:
                r10.f25139w = r4     // Catch: java.lang.Throwable -> La3
                r10.f25140x = r3     // Catch: java.lang.Throwable -> La3
                r10.f25141y = r1     // Catch: java.lang.Throwable -> La3
                r10.f25142z = r2     // Catch: java.lang.Throwable -> La3
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> La3
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La0
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La0
                if (r10 == 0) goto L9a
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> La0
                com.dena.mirrorman.net.api.response.CampaignShareInfoResponse r10 = (com.dena.mirrorman.net.api.response.CampaignShareInfoResponse) r10     // Catch: java.lang.Throwable -> La0
                android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Throwable -> La0
                java.lang.String r7 = "android.intent.action.SEND"
                r6.<init>(r7)     // Catch: java.lang.Throwable -> La0
                java.lang.String r7 = "text/plain"
                android.content.Intent r6 = r6.setType(r7)     // Catch: java.lang.Throwable -> La0
                java.lang.String r7 = "android.intent.extra.TEXT"
                java.lang.String r10 = r10.getText()     // Catch: java.lang.Throwable -> La0
                android.content.Intent r10 = r6.putExtra(r7, r10)     // Catch: java.lang.Throwable -> La0
                java.lang.String r6 = "Intent(Intent.ACTION_SEN…tent.EXTRA_TEXT, it.text)"
                jo.p.g(r10, r6)     // Catch: java.lang.Throwable -> La0
                int r6 = nd.f1.f41999y1     // Catch: java.lang.Throwable -> La0
                java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> La0
                android.content.Intent r10 = android.content.Intent.createChooser(r10, r6)     // Catch: java.lang.Throwable -> La0
                r6 = 268435456(0x10000000, float:2.5243549E-29)
                android.content.Intent r10 = r10.addFlags(r6)     // Catch: java.lang.Throwable -> La0
                r5.startActivity(r10)     // Catch: java.lang.Throwable -> La0
                r5.finish()     // Catch: java.lang.Throwable -> La0
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L9a:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            La0:
                r10 = move-exception
                r3 = r4
                goto La4
            La3:
                r10 = move-exception
            La4:
                throw r10     // Catch: java.lang.Throwable -> La5
            La5:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.activity.HandleUrlSchemeActivity.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.activity.HandleUrlSchemeActivity$observeStoreValues$3", f = "HandleUrlSchemeActivity.kt", l = {632}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f25143w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25144x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25145y;

        /* renamed from: z  reason: collision with root package name */
        public int f25146z;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:12|(4:17|18|19|(1:21)(5:23|8|9|10|(2:33|34)(0)))|25|26|27|28|29|18|19|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
            r7 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
            of.n.f45411a.B(r6, r6.getString(nd.f1.f41968f), false);
            g9.a.c(r7);
            r6.finish();
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[Catch: all -> 0x00ed, TryCatch #3 {all -> 0x00ed, blocks: (B:17:0x0056, B:19:0x005e, B:21:0x006a, B:24:0x0075, B:25:0x007f, B:27:0x00b4, B:31:0x00ca, B:30:0x00b9), top: B:48:0x0056, inners: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:16:0x0055). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.activity.HandleUrlSchemeActivity.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.activity.HandleUrlSchemeActivity$observeStoreValues$4", f = "HandleUrlSchemeActivity.kt", l = {632}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f25147w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25148x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25149y;

        /* renamed from: z  reason: collision with root package name */
        public int f25150z;

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:6:0x0019, B:15:0x0050, B:17:0x0059, B:19:0x0067, B:12:0x0041, B:20:0x0093, B:22:0x009a, B:23:0x00b0, B:11:0x0037), top: B:33:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:15:0x0050). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r1 = r22
                java.lang.Object r0 = bo.c.c()
                int r2 = r1.f25150z
                r3 = 1
                if (r2 == 0) goto L28
                if (r2 != r3) goto L20
                java.lang.Object r2 = r1.f25149y
                wo.k r2 = (wo.k) r2
                java.lang.Object r4 = r1.f25148x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r1.f25147w
                com.dena.mirrorman.activity.HandleUrlSchemeActivity r5 = (com.dena.mirrorman.activity.HandleUrlSchemeActivity) r5
                wn.m.b(r23)     // Catch: java.lang.Throwable -> Lcc
                r7 = r23
                r6 = r1
                goto L50
            L20:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L28:
                wn.m.b(r23)
                com.dena.mirrorman.activity.HandleUrlSchemeActivity r2 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.this
                nf.q r2 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.F3(r2)
                wo.x r4 = r2.v()
                com.dena.mirrorman.activity.HandleUrlSchemeActivity r2 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.this
                wo.k r5 = r4.iterator()     // Catch: java.lang.Throwable -> Lcc
                r6 = r1
                r21 = r5
                r5 = r2
                r2 = r21
            L41:
                r6.f25147w = r5     // Catch: java.lang.Throwable -> Lcc
                r6.f25148x = r4     // Catch: java.lang.Throwable -> Lcc
                r6.f25149y = r2     // Catch: java.lang.Throwable -> Lcc
                r6.f25150z = r3     // Catch: java.lang.Throwable -> Lcc
                java.lang.Object r7 = r2.a(r6)     // Catch: java.lang.Throwable -> Lcc
                if (r7 != r0) goto L50
                return r0
            L50:
                r8 = 0
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lcc
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Lcc
                if (r7 == 0) goto Lc6
                java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> Lcc
                com.dena.mirrorman.net.api.response.live.LiveDetailResponse r7 = (com.dena.mirrorman.net.api.response.live.LiveDetailResponse) r7     // Catch: java.lang.Throwable -> Lcc
                boolean r8 = r7.isLive()     // Catch: java.lang.Throwable -> Lcc
                r15 = 335544320(0x14000000, float:6.4623485E-27)
                if (r8 == 0) goto L93
                tb.c r8 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.B3(r5)     // Catch: java.lang.Throwable -> Lcc
                java.lang.String r10 = r7.getLiveId()     // Catch: java.lang.Throwable -> Lcc
                java.lang.String r11 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.D3(r5)     // Catch: java.lang.Throwable -> Lcc
                r12 = 0
                r13 = 0
                r14 = 0
                r7 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 960(0x3c0, float:1.345E-42)
                r20 = 0
                r9 = r5
                r3 = r15
                r15 = r7
                android.content.Intent r7 = tb.c.a.f(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> Lcc
                r7.addFlags(r3)     // Catch: java.lang.Throwable -> Lcc
                androidx.activity.result.c r3 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.C3(r5)     // Catch: java.lang.Throwable -> Lcc
                r3.a(r7)     // Catch: java.lang.Throwable -> Lcc
                goto Lc3
            L93:
                r3 = r15
                boolean r8 = r7.isArchive()     // Catch: java.lang.Throwable -> Lcc
                if (r8 == 0) goto Lb0
                tb.c r8 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.B3(r5)     // Catch: java.lang.Throwable -> Lcc
                java.lang.String r7 = r7.getLiveId()     // Catch: java.lang.Throwable -> Lcc
                android.content.Intent r7 = r8.w0(r5, r7)     // Catch: java.lang.Throwable -> Lcc
                r7.addFlags(r3)     // Catch: java.lang.Throwable -> Lcc
                r5.startActivity(r7)     // Catch: java.lang.Throwable -> Lcc
                r5.finish()     // Catch: java.lang.Throwable -> Lcc
                goto Lc3
            Lb0:
                yd.t1$a r3 = yd.t1.f61795x     // Catch: java.lang.Throwable -> Lcc
                int r7 = nd.f1.error_broadcast_is_already_finished     // Catch: java.lang.Throwable -> Lcc
                java.lang.String r7 = r5.getString(r7)     // Catch: java.lang.Throwable -> Lcc
                java.lang.String r8 = "getString(R.string.error…cast_is_already_finished)"
                jo.p.g(r7, r8)     // Catch: java.lang.Throwable -> Lcc
                r3.a(r5, r7)     // Catch: java.lang.Throwable -> Lcc
                r5.finish()     // Catch: java.lang.Throwable -> Lcc
            Lc3:
                r3 = 1
                goto L41
            Lc6:
                wo.n.a(r4, r8)
                wn.v r0 = wn.v.f59242a
                return r0
            Lcc:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch: java.lang.Throwable -> Lcf
            Lcf:
                r0 = move-exception
                r3 = r0
                wo.n.a(r4, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.activity.HandleUrlSchemeActivity.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.activity.HandleUrlSchemeActivity$observeStoreValues$5", f = "HandleUrlSchemeActivity.kt", l = {632}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f25151w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25152x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25153y;

        /* renamed from: z  reason: collision with root package name */
        public int f25154z;

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:17:0x0054, B:19:0x005c, B:22:0x0065, B:27:0x0073, B:40:0x009b, B:28:0x0079, B:36:0x0089, B:37:0x0094, B:39:0x0098, B:34:0x0085, B:31:0x007f, B:25:0x006b), top: B:51:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f25154z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f25153y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f25152x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f25151w
                com.dena.mirrorman.activity.HandleUrlSchemeActivity r4 = (com.dena.mirrorman.activity.HandleUrlSchemeActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> Lad
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrorman.activity.HandleUrlSchemeActivity r10 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.this
                nf.q r10 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.F3(r10)
                wo.x r3 = r10.u()
                com.dena.mirrorman.activity.HandleUrlSchemeActivity r10 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lad
                r4 = r10
                r10 = r9
            L3d:
                r10.f25151w = r4     // Catch: java.lang.Throwable -> Lad
                r10.f25152x = r3     // Catch: java.lang.Throwable -> Lad
                r10.f25153y = r1     // Catch: java.lang.Throwable -> Lad
                r10.f25154z = r2     // Catch: java.lang.Throwable -> Lad
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> Lad
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Laa
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Laa
                if (r10 == 0) goto La4
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> Laa
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> Laa
                if (r10 != 0) goto L65
                goto L9e
            L65:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> Laa
                if (r6 == 0) goto L6b
                r6 = r2
                goto L71
            L6b:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> Laa
                boolean r6 = jo.p.c(r10, r6)     // Catch: java.lang.Throwable -> Laa
            L71:
                if (r6 == 0) goto L79
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Laa
                r6.l(r5, r10)     // Catch: java.lang.Throwable -> Laa
                goto L9b
            L79:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> Laa
                if (r6 == 0) goto L7f
                r6 = r2
                goto L81
            L7f:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> Laa
            L81:
                if (r6 == 0) goto L85
                r6 = r2
                goto L87
            L85:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Banned     // Catch: java.lang.Throwable -> Laa
            L87:
                if (r6 == 0) goto L94
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Laa
                java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> Laa
                r7 = 0
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> Laa
                goto L9b
            L94:
                boolean r10 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> Laa
                if (r10 == 0) goto L9b
                of.n.z(r5)     // Catch: java.lang.Throwable -> Laa
            L9b:
                r5.finish()     // Catch: java.lang.Throwable -> Laa
            L9e:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            La4:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            Laa:
                r10 = move-exception
                r3 = r4
                goto Lae
            Lad:
                r10 = move-exception
            Lae:
                throw r10     // Catch: java.lang.Throwable -> Laf
            Laf:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.activity.HandleUrlSchemeActivity.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.activity.HandleUrlSchemeActivity$observeStoreValues$6", f = "HandleUrlSchemeActivity.kt", l = {244}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25155w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<ub.a> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ HandleUrlSchemeActivity f25157w;

            public a(HandleUrlSchemeActivity handleUrlSchemeActivity) {
                this.f25157w = handleUrlSchemeActivity;
            }

            public static final void g(HandleUrlSchemeActivity handleUrlSchemeActivity, DialogInterface dialogInterface, int i10) {
                jo.p.h(handleUrlSchemeActivity, "this$0");
                handleUrlSchemeActivity.finish();
            }

            @Override // xo.d
            /* renamed from: d */
            public final Object emit(ub.a aVar, ao.d<? super wn.v> dVar) {
                if (aVar == null) {
                    AlertDialog.Builder message = new AlertDialog.Builder(this.f25157w, g1.f42008g).setMessage(f1.text_contract_dialog_expired_message);
                    int i10 = f1.C3;
                    final HandleUrlSchemeActivity handleUrlSchemeActivity = this.f25157w;
                    message.setPositiveButton(i10, new DialogInterface.OnClickListener() { // from class: qd.f
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            HandleUrlSchemeActivity.i.a.g(HandleUrlSchemeActivity.this, dialogInterface, i11);
                        }
                    }).setCancelable(false).create().show();
                } else {
                    HandleUrlSchemeActivity handleUrlSchemeActivity2 = this.f25157w;
                    handleUrlSchemeActivity2.startActivity(handleUrlSchemeActivity2.J3().A(this.f25157w, aVar));
                    this.f25157w.finish();
                }
                return wn.v.f59242a;
            }
        }

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25155w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<ub.a> t10 = HandleUrlSchemeActivity.this.O3().t();
                a aVar = new a(HandleUrlSchemeActivity.this);
                this.f25155w = 1;
                if (t10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.activity.HandleUrlSchemeActivity$observeStoreValues$7", f = "HandleUrlSchemeActivity.kt", l = {259}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25158w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ HandleUrlSchemeActivity f25160w;

            public a(HandleUrlSchemeActivity handleUrlSchemeActivity) {
                this.f25160w = handleUrlSchemeActivity;
            }

            public static final void g(HandleUrlSchemeActivity handleUrlSchemeActivity, DialogInterface dialogInterface, int i10) {
                jo.p.h(handleUrlSchemeActivity, "this$0");
                handleUrlSchemeActivity.finish();
            }

            @Override // xo.d
            /* renamed from: d */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                if (str == null) {
                    AlertDialog.Builder message = new AlertDialog.Builder(this.f25160w, g1.f42008g).setMessage(f1.text_contract_dialog_expired_message);
                    int i10 = f1.C3;
                    final HandleUrlSchemeActivity handleUrlSchemeActivity = this.f25160w;
                    message.setPositiveButton(i10, new DialogInterface.OnClickListener() { // from class: qd.g
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            HandleUrlSchemeActivity.j.a.g(HandleUrlSchemeActivity.this, dialogInterface, i11);
                        }
                    }).setCancelable(false).create().show();
                } else {
                    HandleUrlSchemeActivity handleUrlSchemeActivity2 = this.f25160w;
                    handleUrlSchemeActivity2.startActivity(handleUrlSchemeActivity2.J3().G(this.f25160w, str));
                    this.f25160w.finish();
                }
                return wn.v.f59242a;
            }
        }

        public j(ao.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25158w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<String> y10 = HandleUrlSchemeActivity.this.O3().y();
                a aVar = new a(HandleUrlSchemeActivity.this);
                this.f25158w = 1;
                if (y10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrorman.activity.HandleUrlSchemeActivity$observeStoreValues$8", f = "HandleUrlSchemeActivity.kt", l = {274}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25161w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ HandleUrlSchemeActivity f25163w;

            public a(HandleUrlSchemeActivity handleUrlSchemeActivity) {
                this.f25163w = handleUrlSchemeActivity;
            }

            public static final void h(HandleUrlSchemeActivity handleUrlSchemeActivity, DialogInterface dialogInterface, int i10) {
                jo.p.h(handleUrlSchemeActivity, "this$0");
                handleUrlSchemeActivity.finish();
            }

            public static final void i(HandleUrlSchemeActivity handleUrlSchemeActivity, DialogInterface dialogInterface, int i10) {
                jo.p.h(handleUrlSchemeActivity, "this$0");
                handleUrlSchemeActivity.finish();
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return g(bool.booleanValue(), dVar);
            }

            public final Object g(boolean z10, ao.d<? super wn.v> dVar) {
                if (this.f25163w.N3().a().d()) {
                    AlertDialog.Builder message = new AlertDialog.Builder(this.f25163w).setMessage(f1.f41986q3);
                    int i10 = f1.C3;
                    final HandleUrlSchemeActivity handleUrlSchemeActivity = this.f25163w;
                    message.setPositiveButton(i10, new DialogInterface.OnClickListener() { // from class: qd.i
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            HandleUrlSchemeActivity.k.a.h(HandleUrlSchemeActivity.this, dialogInterface, i11);
                        }
                    }).setCancelable(false).create().show();
                    return wn.v.f59242a;
                }
                if (z10) {
                    HandleUrlSchemeActivity handleUrlSchemeActivity2 = this.f25163w;
                    handleUrlSchemeActivity2.startActivity(handleUrlSchemeActivity2.J3().n0(this.f25163w));
                    this.f25163w.finish();
                } else {
                    AlertDialog.Builder message2 = new AlertDialog.Builder(this.f25163w, g1.f42008g).setMessage(f1.text_menu_open_cash_bonus_history_alert_message_register_identification_and_bank_account);
                    int i11 = f1.C3;
                    final HandleUrlSchemeActivity handleUrlSchemeActivity3 = this.f25163w;
                    message2.setPositiveButton(i11, new DialogInterface.OnClickListener() { // from class: qd.h
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i12) {
                            HandleUrlSchemeActivity.k.a.i(HandleUrlSchemeActivity.this, dialogInterface, i12);
                        }
                    }).setCancelable(false).create().show();
                }
                return wn.v.f59242a;
            }
        }

        public k(ao.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25161w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<Boolean> A = HandleUrlSchemeActivity.this.O3().A();
                a aVar = new a(HandleUrlSchemeActivity.this);
                this.f25161w = 1;
                if (A.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrorman.activity.HandleUrlSchemeActivity$observeStoreValues$9", f = "HandleUrlSchemeActivity.kt", l = {298}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25164w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<LiveGameDetailResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ HandleUrlSchemeActivity f25166w;

            public a(HandleUrlSchemeActivity handleUrlSchemeActivity) {
                this.f25166w = handleUrlSchemeActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(LiveGameDetailResponse liveGameDetailResponse, ao.d<? super wn.v> dVar) {
                HandleUrlSchemeActivity handleUrlSchemeActivity = this.f25166w;
                handleUrlSchemeActivity.startActivity(handleUrlSchemeActivity.J3().r(this.f25166w, liveGameDetailResponse.getGame(), this.f25166w.N3().a().c()));
                this.f25166w.finish();
                return wn.v.f59242a;
            }
        }

        public l(ao.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25164w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<LiveGameDetailResponse> w10 = HandleUrlSchemeActivity.this.O3().w();
                a aVar = new a(HandleUrlSchemeActivity.this);
                this.f25164w = 1;
                if (w10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<String> {
        public m() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = HandleUrlSchemeActivity.this.getIntent().getStringExtra("BUNDLE_KEY_REFERER");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<od.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25168w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25169x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25170y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25168w = componentCallbacks;
            this.f25169x = aVar;
            this.f25170y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.r] */
        @Override // io.a
        public final od.r invoke() {
            ComponentCallbacks componentCallbacks = this.f25168w;
            return gq.a.a(componentCallbacks).c(f0.b(od.r.class), this.f25169x, this.f25170y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25171w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25172x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25173y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25171w = componentCallbacks;
            this.f25172x = aVar;
            this.f25173y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f25171w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.k.class), this.f25172x, this.f25173y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25174w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25175x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25176y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25174w = componentCallbacks;
            this.f25175x = aVar;
            this.f25176y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f25174w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f25175x, this.f25176y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25177w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25178x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25179y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25177w = componentCallbacks;
            this.f25178x = aVar;
            this.f25179y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f25177w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f25178x, this.f25179y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25180w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25181x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25182y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25180w = componentCallbacks;
            this.f25181x = aVar;
            this.f25182y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25180w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f25181x, this.f25182y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25183w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25184x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25185y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25183w = componentCallbacks;
            this.f25184x = aVar;
            this.f25185y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25183w;
            return gq.a.a(componentCallbacks).c(f0.b(d0.class), this.f25184x, this.f25185y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25186w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25187x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25188y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25186w = componentCallbacks;
            this.f25187x = aVar;
            this.f25188y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f25186w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f25187x, this.f25188y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25189w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentActivity componentActivity) {
            super(0);
            this.f25189w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f25189w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f25190w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25191x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25192y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f25193z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f25190w = aVar;
            this.f25191x = aVar2;
            this.f25192y = aVar3;
            this.f25193z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f25190w;
            vq.a aVar2 = this.f25191x;
            io.a aVar3 = this.f25192y;
            xq.a aVar4 = this.f25193z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(nf.q.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25194w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentActivity componentActivity) {
            super(0);
            this.f25194w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f25194w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00d3, code lost:
        if (r0.c() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HandleUrlSchemeActivity() {
        /*
            r8 = this;
            java.lang.Class<kf.i> r0 = kf.i.class
            r8.<init>()
            uo.o2 r1 = uo.g1.c()
            r2 = 0
            r3 = 1
            uo.b0 r4 = uo.g2.b(r2, r3, r2)
            ao.g r1 = r1.plus(r4)
            r8.O = r1
            wn.i r1 = wn.i.SYNCHRONIZED
            com.dena.mirrorman.activity.HandleUrlSchemeActivity$n r4 = new com.dena.mirrorman.activity.HandleUrlSchemeActivity$n
            r4.<init>(r8, r2, r2)
            wn.f r4 = wn.g.b(r1, r4)
            r8.P = r4
            com.dena.mirrorman.activity.HandleUrlSchemeActivity$u r4 = new com.dena.mirrorman.activity.HandleUrlSchemeActivity$u
            r4.<init>(r8)
            xq.a r5 = gq.a.a(r8)
            com.dena.mirrorman.activity.HandleUrlSchemeActivity$v r6 = new com.dena.mirrorman.activity.HandleUrlSchemeActivity$v
            r6.<init>(r4, r2, r2, r5)
            androidx.lifecycle.s0 r4 = new androidx.lifecycle.s0
            java.lang.Class<nf.q> r5 = nf.q.class
            qo.b r5 = jo.f0.b(r5)
            com.dena.mirrorman.activity.HandleUrlSchemeActivity$w r7 = new com.dena.mirrorman.activity.HandleUrlSchemeActivity$w
            r7.<init>(r8)
            r4.<init>(r5, r7, r6)
            r8.Q = r4
            com.dena.mirrorman.activity.HandleUrlSchemeActivity$o r4 = new com.dena.mirrorman.activity.HandleUrlSchemeActivity$o
            r4.<init>(r8, r2, r2)
            wn.f r4 = wn.g.b(r1, r4)
            r8.R = r4
            com.dena.mirrorman.activity.HandleUrlSchemeActivity$p r4 = new com.dena.mirrorman.activity.HandleUrlSchemeActivity$p
            r4.<init>(r8, r2, r2)
            wn.f r4 = wn.g.b(r1, r4)
            r8.S = r4
            com.dena.mirrorman.activity.HandleUrlSchemeActivity$q r4 = new com.dena.mirrorman.activity.HandleUrlSchemeActivity$q
            r4.<init>(r8, r2, r2)
            wn.f r4 = wn.g.b(r1, r4)
            r8.T = r4
            com.dena.mirrorman.activity.HandleUrlSchemeActivity$r r4 = new com.dena.mirrorman.activity.HandleUrlSchemeActivity$r
            r4.<init>(r8, r2, r2)
            wn.f r4 = wn.g.b(r1, r4)
            r8.U = r4
            com.dena.mirrorman.activity.HandleUrlSchemeActivity$s r4 = new com.dena.mirrorman.activity.HandleUrlSchemeActivity$s
            r4.<init>(r8, r2, r2)
            wn.f r4 = wn.g.b(r1, r4)
            r8.V = r4
            com.dena.mirrorman.activity.HandleUrlSchemeActivity$t r4 = new com.dena.mirrorman.activity.HandleUrlSchemeActivity$t
            r4.<init>(r8, r2, r2)
            wn.f r1 = wn.g.b(r1, r4)
            r8.W = r1
            com.dena.mirrorman.activity.HandleUrlSchemeActivity$m r1 = new com.dena.mirrorman.activity.HandleUrlSchemeActivity$m
            r1.<init>()
            wn.f r1 = wn.g.a(r1)
            r8.X = r1
            nq.a r1 = gq.b.a(r8)
            wq.c r1 = r1.e()
            xq.a r1 = r1.b()
            qo.b r4 = jo.f0.b(r0)
            java.lang.Object r1 = r1.c(r4, r2, r2)
            kf.i r1 = (kf.i) r1
            int r1 = r1.I()
            if (r1 != r3) goto Ld6
            nq.a r1 = gq.b.a(r8)
            wq.c r1 = r1.e()
            xq.a r1 = r1.b()
            qo.b r0 = jo.f0.b(r0)
            java.lang.Object r0 = r1.c(r0, r2, r2)
            kf.i r0 = (kf.i) r0
            int r0 = r0.x5()
            if (r0 != r3) goto Ld6
            of.d r0 = of.d.f45388a
            boolean r1 = r0.d()
            if (r1 != 0) goto Ld6
            boolean r0 = r0.c()
            if (r0 != 0) goto Ld6
            goto Ld7
        Ld6:
            r3 = 0
        Ld7:
            r8.Y = r3
            c.c r0 = new c.c
            r0.<init>()
            qd.e r1 = new qd.e
            r1.<init>()
            androidx.activity.result.c r0 = r8.V2(r0, r1)
            java.lang.String r1 = "registerForActivityResul…a)\n        finish()\n    }"
            jo.p.g(r0, r1)
            r8.Z = r0
            c.c r0 = new c.c
            r0.<init>()
            qd.d r2 = new qd.d
            r2.<init>()
            androidx.activity.result.c r0 = r8.V2(r0, r2)
            jo.p.g(r0, r1)
            r8.f25129a0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.activity.HandleUrlSchemeActivity.<init>():void");
    }

    public static final void R3(HandleUrlSchemeActivity handleUrlSchemeActivity, DialogInterface dialogInterface, int i10) {
        jo.p.h(handleUrlSchemeActivity, "this$0");
        handleUrlSchemeActivity.finish();
    }

    public static final void S3(HandleUrlSchemeActivity handleUrlSchemeActivity, DialogInterface dialogInterface, int i10) {
        jo.p.h(handleUrlSchemeActivity, "this$0");
        handleUrlSchemeActivity.finish();
    }

    public static final void V3(HandleUrlSchemeActivity handleUrlSchemeActivity, androidx.activity.result.a aVar) {
        jo.p.h(handleUrlSchemeActivity, "this$0");
        if (aVar.b() != -1) {
            handleUrlSchemeActivity.finish();
            return;
        }
        handleUrlSchemeActivity.setResult(aVar.b(), aVar.a());
        handleUrlSchemeActivity.finish();
    }

    public static final void W3(HandleUrlSchemeActivity handleUrlSchemeActivity, androidx.activity.result.a aVar) {
        jo.p.h(handleUrlSchemeActivity, "this$0");
        if (aVar.b() == -1 || aVar.b() == 0) {
            handleUrlSchemeActivity.setResult(aVar.b(), aVar.a());
            handleUrlSchemeActivity.finish();
        }
    }

    public final od.r H3() {
        return (od.r) this.P.getValue();
    }

    public final nf.k I3() {
        return (nf.k) this.R.getValue();
    }

    public final tb.c J3() {
        return (tb.c) this.W.getValue();
    }

    public final d0 K3() {
        return (d0) this.V.getValue();
    }

    @Override // ie.j
    public void L1(String str) {
        jo.p.h(str, "tag");
        finish();
    }

    public final MRLogger L3() {
        return (MRLogger) this.S.getValue();
    }

    public final String M3() {
        return (String) this.X.getValue();
    }

    public final i1 N3() {
        return (i1) this.T.getValue();
    }

    public final nf.q O3() {
        return (nf.q) this.Q.getValue();
    }

    public final v0 P3() {
        return (v0) this.U.getValue();
    }

    public final void Q3(b0 b0Var) {
        Intent e10;
        String c10;
        Intent a10;
        if (b0Var instanceof b0.v) {
            H3().i(M3(), ((b0.v) b0Var).b());
        } else if (b0Var instanceof b0.a) {
            startActivity(AppPageActivity.f25660c0.b(this, ((b0.a) b0Var).b(), true, M3(), null));
            finish();
        } else if (b0Var instanceof b0.i0) {
            b0.i0 i0Var = (b0.i0) b0Var;
            if (!i0Var.c()) {
                v0 P3 = P3();
                FragmentManager a32 = a3();
                jo.p.g(a32, "supportFragmentManager");
                if (!v0.c(P3, a32, M3(), false, 4, null)) {
                    return;
                }
                if (P3().i(i0Var.b())) {
                    startActivity(J3().z0(this));
                } else {
                    startActivity(J3().s(this, i0Var.b(), M3()));
                }
            }
            finish();
        } else {
            r2 = null;
            Integer num = null;
            if (b0Var instanceof b0.d) {
                startActivity(J3().t(this, ((b0.d) b0Var).b(), null));
                finish();
            } else if (b0Var instanceof b0.C0526b0) {
                startActivity(c.a.g(J3(), this, ((b0.C0526b0) b0Var).b(), 2, null, 8, null));
                finish();
            } else if (b0Var instanceof b0.u) {
                startActivity(c.a.g(J3(), this, ((b0.u) b0Var).b(), 3, null, 8, null));
                finish();
            } else if (b0Var instanceof b0.c0) {
                startActivity(WebViewActivity.a.b(WebViewActivity.X, this, ((b0.c0) b0Var).b(), false, false, 12, null));
                finish();
            } else {
                int i10 = 0;
                if (b0Var instanceof b0.f0) {
                    b0.f0 f0Var = (b0.f0) b0Var;
                    startActivity(J3().r0(this, 0, f0Var.c(), f0Var.b()));
                    finish();
                } else if (b0Var instanceof b0.p) {
                    startActivity(J3().f(this));
                    finish();
                } else if (b0Var instanceof b0.g) {
                    b0.g gVar = (b0.g) b0Var;
                    fe.e eVar = new fe.e(gVar.c(), gVar.e(), null, null, null, null, null, 124, null);
                    if (gVar.f() != null) {
                        eVar.j(gVar.f());
                    }
                    if (gVar.g() != null) {
                        eVar.k(gVar.g());
                    }
                    if (gVar.d() != null) {
                        eVar.i(gVar.d());
                    }
                    if (gVar.h() != null) {
                        eVar.l(gVar.h());
                    }
                    if (gVar.b() != null) {
                        eVar.h(gVar.b());
                    }
                    Intent a11 = AppAuthenticationActivity.T.a(this, eVar);
                    a11.addFlags(335544320);
                    startActivity(a11);
                    finish();
                } else if (b0Var instanceof b0.k0) {
                    b0.k0 k0Var = (b0.k0) b0Var;
                    if (k0Var.b()) {
                        p.d a12 = new d.a().a();
                        jo.p.g(a12, "Builder().build()");
                        a12.f45629a.setFlags(536870912);
                        try {
                            a12.a(this, Uri.parse(((b0.k0) b0Var).c()));
                        } catch (Throwable th2) {
                            g9.a.c(th2);
                            startActivity(WebViewActivity.a.b(WebViewActivity.X, this, k0Var.c(), false, false, 12, null));
                        }
                        wn.v vVar = wn.v.f59242a;
                    } else {
                        startActivity(WebViewActivity.a.b(WebViewActivity.X, this, k0Var.c(), false, false, 12, null));
                    }
                    finish();
                } else if (b0Var instanceof b0.b) {
                    if (!N3().a().d() && P3().l()) {
                        if (of.n.f45411a.m(this)) {
                            of.n.A(this, f1.Z4, true);
                        } else {
                            startActivity(J3().v(this, ((b0.b) b0Var).b(), null));
                        }
                    } else {
                        String b10 = ((b0.b) b0Var).b();
                        if (b10 != null) {
                            startActivity(AppPageActivity.f25660c0.b(this, b10, true, M3(), null));
                            wn.v vVar2 = wn.v.f59242a;
                        }
                    }
                    finish();
                } else if (b0Var instanceof b0.k) {
                    H3().h(M3(), ((b0.k) b0Var).b());
                } else if (b0Var instanceof b0.r) {
                    tb.c J3 = J3();
                    b0.r rVar = (b0.r) b0Var;
                    if (!TextUtils.isEmpty(rVar.c()) && TextUtils.isDigitsOnly(rVar.c())) {
                        i10 = Integer.parseInt(rVar.c());
                    }
                    if (!TextUtils.isEmpty(rVar.b()) && TextUtils.isDigitsOnly(rVar.b())) {
                        num = Integer.valueOf(Integer.parseInt(rVar.b()));
                    }
                    startActivity(J3.E(this, i10, num, M3()));
                    finish();
                } else if (b0Var instanceof b0.h0) {
                    MRLogger L3 = L3();
                    MRLog.Companion companion = MRLog.Companion;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SHOOTER_ICON_TAP);
                    wn.v vVar3 = wn.v.f59242a;
                    L3.sendLog(builder.build());
                    b0.h0 h0Var = (b0.h0) b0Var;
                    startActivity(J3().J(this, h0Var.c(), h0Var.b(), M3()));
                    finish();
                } else if (b0Var instanceof b0.n) {
                    tb.c J32 = J3();
                    b0.n nVar = (b0.n) b0Var;
                    if (!TextUtils.isEmpty(nVar.b()) && TextUtils.isDigitsOnly(nVar.b())) {
                        i10 = Integer.parseInt(nVar.b());
                    }
                    startActivity(J32.B0(this, i10, M3()));
                    finish();
                } else if (b0Var instanceof b0.g0) {
                    H3().f(((b0.g0) b0Var).b());
                } else if (b0Var instanceof b0.d0) {
                    a10 = MainActivity.f25195m0.a(this, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? 0L : 0L, (r17 & 8) != 0 ? 0 : 0, (r17 & 16) != 0 ? false : false, (r17 & 32) == 0 ? MainActivity.a.EnumC0218a.Notice : null, (r17 & 64) == 0 ? false : false);
                    a10.addFlags(268468224);
                    startActivity(a10);
                    finish();
                } else if (b0Var instanceof b0.f) {
                    if (N3().a().d()) {
                        new AlertDialog.Builder(this).setMessage(f1.f41986q3).setPositiveButton(f1.C3, new DialogInterface.OnClickListener() { // from class: qd.b
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                HandleUrlSchemeActivity.R3(HandleUrlSchemeActivity.this, dialogInterface, i11);
                            }
                        }).setCancelable(false).create().show();
                        return;
                    }
                    startActivity(J3().C0(this));
                    finish();
                } else if (b0Var instanceof b0.h) {
                    H3().l(M3());
                } else if (b0Var instanceof b0.j) {
                    if (N3().a().d()) {
                        new AlertDialog.Builder(this).setMessage(f1.f41986q3).setPositiveButton(f1.C3, new DialogInterface.OnClickListener() { // from class: qd.c
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                HandleUrlSchemeActivity.S3(HandleUrlSchemeActivity.this, dialogInterface, i11);
                            }
                        }).setCancelable(false).create().show();
                        return;
                    }
                    startActivity(J3().C0(this));
                    finish();
                } else if (b0Var instanceof b0.i) {
                    H3().g(M3());
                } else if (b0Var instanceof b0.o) {
                    if (!this.Y) {
                        finish();
                    }
                    b0.o oVar = (b0.o) b0Var;
                    Integer valueOf = (!oVar.b() || (c10 = oVar.c()) == null) ? null : Integer.valueOf(Integer.parseInt(c10));
                    if (N3().a().c()) {
                        e10 = J3().o(this, valueOf);
                    } else {
                        e10 = c.a.e(J3(), this, valueOf, false, false, 12, null);
                    }
                    e10.addFlags(335544320);
                    startActivity(e10);
                    finish();
                } else if (b0Var instanceof b0.s) {
                    startActivity(GiftboxGachaActivity.U.a(this, M3(), ((b0.s) b0Var).b()));
                    finish();
                } else if (b0Var instanceof b0.l0) {
                    g9.a aVar = g9.a.f32826a;
                    aVar.b("custom scheme DEFAULT unexpected url " + ((b0.l0) b0Var).b(), new Object[0]);
                    finish();
                } else if (b0Var instanceof b0.q) {
                    Intent a13 = GiftCodeSelectionActivity.V.a(this, ((b0.q) b0Var).b());
                    a13.addFlags(67108864);
                    wn.v vVar4 = wn.v.f59242a;
                    startActivity(a13);
                    finish();
                } else if (b0Var instanceof b0.a0) {
                    startActivity(J3().g0(this, ((b0.a0) b0Var).b(), 5, M3()));
                    finish();
                } else if (b0Var instanceof b0.c) {
                    tb.a y10 = J3().y(M3(), ((b0.c) b0Var).b());
                    y10.a().A3(a3(), y10.b());
                    a3().X0(new b(y10, this), false);
                } else if (b0Var instanceof b0.e) {
                    MRLogger L32 = L3();
                    MRLog.Companion companion2 = MRLog.Companion;
                    MRLog.Builder builder2 = new MRLog.Builder(MRLog.ACTION_TYPE_OFFER_WALL_BUTTON_TAP);
                    builder2.setPageId(M3());
                    builder2.setPayload(xn.r.d(wn.q.a("url", I3().m())));
                    wn.v vVar5 = wn.v.f59242a;
                    L32.sendLog(builder2.build());
                    new d.a().a().a(this, Uri.parse(I3().m()));
                    finish();
                } else if (b0Var instanceof b0.e0) {
                    this.f25129a0.a(J3().y0(this));
                } else if (b0Var instanceof b0.t) {
                    b0.t tVar = (b0.t) b0Var;
                    startActivity(J3().M(this, true, tVar.b(), tVar.c()));
                    finish();
                } else if (b0Var instanceof b0.z) {
                    startActivity(J3().D(this));
                    finish();
                } else if (b0Var instanceof b0.m) {
                    b0.m mVar = (b0.m) b0Var;
                    startActivity(J3().N(this, M3(), mVar.b(), mVar.c()));
                    finish();
                } else if (b0Var instanceof b0.y) {
                    H3().k(M3(), ((b0.y) b0Var).b());
                } else if (b0Var instanceof b0.x) {
                    startActivity(J3().m0(this));
                    finish();
                } else if (b0Var instanceof b0.w) {
                    H3().j(M3(), ((b0.w) b0Var).b(), N3().a().c() ? K3().c() : null);
                } else {
                    finish();
                }
            }
        }
    }

    public final boolean T3(Activity activity, String[] strArr, int[] iArr) {
        boolean z10;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            if (iArr[i10] == -1) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            int length2 = strArr.length;
            for (int i11 = 0; i11 < length2; i11++) {
                String str = strArr[i11];
                if (iArr[i11] == -1 && !b3.a.s(activity, str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void U3() {
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
        uo.l.d(this, null, null, new l(null), 3, null);
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O;
    }

    @Override // ie.j
    public void k(String str) {
        j.a.a(this, str);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        U3();
        Serializable serializableExtra = getIntent().getSerializableExtra("BUNDLE_KEY_MIRRATIV_URL_SCHEME");
        b0 b0Var = serializableExtra instanceof b0 ? (b0) serializableExtra : null;
        if (b0Var != null) {
            Q3(b0Var);
            r0.f42205a.b().a(b0Var.a());
            return;
        }
        finish();
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        uo.r0.d(this, null, 1, null);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        jo.p.h(strArr, "permissions");
        jo.p.h(iArr, "grantResults");
        if (i10 == 200 && T3(this, strArr, iArr)) {
            of.n.A(getApplicationContext(), f1.F3, false);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", getPackageName(), null));
            intent.addFlags(268435456);
            startActivity(intent);
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
        finish();
    }

    @Override // pe.c
    public void y() {
        finish();
    }
}
