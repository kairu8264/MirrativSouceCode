package com.dena.mirrativ.player.afterplay;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.player.afterplay.AfterPlayActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.Review;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.play.core.review.ReviewInfo;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import hb.b2;
import ie.f;
import jo.f0;
import kf.x;
import kq.a;
import tb.c;
import uo.q0;
import uo.r0;
import wn.v;
import xe.d;

/* loaded from: classes2.dex */
public final class AfterPlayActivity extends e.b implements f.b, d.b, ib.k, q0 {
    public static final a Z = new a(null);

    /* renamed from: a0  reason: collision with root package name */
    public static final int f22539a0 = 8;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final FragmentRunner W;
    public final wn.f X;
    public final androidx.activity.result.c<Intent> Y;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, Intent intent) {
            jo.p.h(context, "context");
            jo.p.h(str, "refererFrom");
            Intent intent2 = new Intent(context, AfterPlayActivity.class);
            intent2.putExtra("EXTRA_REFERER_FROM", str);
            intent2.putExtra("EXTRA_PLAY_DATA", intent);
            return intent2;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.AfterPlayActivity$observeStoreValues$1", f = "AfterPlayActivity.kt", l = {380}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22540w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22541x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22542y;

        /* renamed from: z  reason: collision with root package name */
        public int f22543z;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0070, B:22:0x0075, B:23:0x0079), top: B:34:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:34:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f22543z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f22542y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f22541x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f22540w
                com.dena.mirrativ.player.afterplay.AfterPlayActivity r4 = (com.dena.mirrativ.player.afterplay.AfterPlayActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L8b
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
                com.dena.mirrativ.player.afterplay.AfterPlayActivity r10 = com.dena.mirrativ.player.afterplay.AfterPlayActivity.this
                ib.d r10 = com.dena.mirrativ.player.afterplay.AfterPlayActivity.y3(r10)
                wo.x r3 = r10.i()
                com.dena.mirrativ.player.afterplay.AfterPlayActivity r10 = com.dena.mirrativ.player.afterplay.AfterPlayActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L8b
                r4 = r10
                r10 = r9
            L3d:
                r10.f22540w = r4     // Catch: java.lang.Throwable -> L8b
                r10.f22541x = r3     // Catch: java.lang.Throwable -> L8b
                r10.f22542y = r1     // Catch: java.lang.Throwable -> L8b
                r10.f22543z = r2     // Catch: java.lang.Throwable -> L8b
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L8b
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L88
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L88
                r6 = 0
                if (r10 == 0) goto L82
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L88
                wn.v r10 = (wn.v) r10     // Catch: java.lang.Throwable -> L88
                android.content.Intent r10 = r5.getIntent()     // Catch: java.lang.Throwable -> L88
                java.lang.String r7 = "EXTRA_PLAY_DATA"
                android.os.Parcelable r10 = r10.getParcelableExtra(r7)     // Catch: java.lang.Throwable -> L88
                boolean r7 = r10 instanceof android.content.Intent     // Catch: java.lang.Throwable -> L88
                if (r7 == 0) goto L73
                r6 = r10
                android.content.Intent r6 = (android.content.Intent) r6     // Catch: java.lang.Throwable -> L88
            L73:
                if (r6 != 0) goto L79
                r5.finish()     // Catch: java.lang.Throwable -> L88
                goto L7c
            L79:
                com.dena.mirrativ.player.afterplay.AfterPlayActivity.C3(r5, r6)     // Catch: java.lang.Throwable -> L88
            L7c:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L82:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L88:
                r10 = move-exception
                r3 = r4
                goto L8c
            L8b:
                r10 = move-exception
            L8c:
                throw r10     // Catch: java.lang.Throwable -> L8d
            L8d:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.afterplay.AfterPlayActivity.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.AfterPlayActivity$observeStoreValues$2", f = "AfterPlayActivity.kt", l = {380}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22544w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22545x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22546y;

        /* renamed from: z  reason: collision with root package name */
        public int f22547z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ AfterPlayActivity f22548w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f22549x;

            /* renamed from: com.dena.mirrativ.player.afterplay.AfterPlayActivity$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0197a extends FragmentManager.j {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ AfterPlayActivity f22550a;

                public C0197a(AfterPlayActivity afterPlayActivity) {
                    this.f22550a = afterPlayActivity;
                }

                @Override // androidx.fragment.app.FragmentManager.j
                public void e(FragmentManager fragmentManager, Fragment fragment) {
                    jo.p.h(fragmentManager, "fm");
                    jo.p.h(fragment, "f");
                    super.e(fragmentManager, fragment);
                    if (fragment instanceof ie.f) {
                        this.f22550a.finish();
                        this.f22550a.a3().n1(this);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AfterPlayActivity afterPlayActivity, String str) {
                super(0);
                this.f22548w = afterPlayActivity;
                this.f22549x = str;
            }

            public final void a() {
                MRLogger I3 = this.f22548w.I3();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_URGE_APP_PUSH_SETTING);
                builder.setTargetId(MRLog.TARGET_ID_IMP);
                I3.sendLog(builder.build());
                f.a aVar = ie.f.V0;
                String string = this.f22548w.getResources().getString(b2.text_enable_app_push_setting, this.f22549x);
                jo.p.g(string, "resources.getString(R.st…ble_app_push_setting, it)");
                f.a.b(aVar, string, this.f22548w.getResources().getString(b2.text_enable), this.f22548w.getResources().getString(b2.f34719f), null, false, 24, null).z3(this.f22548w.a3(), "TAG_REQUEST_TO_ENABLE_LIVE_NOTIFICATION_DIALOG");
                v vVar = v.f59242a;
                AfterPlayActivity afterPlayActivity = this.f22548w;
                afterPlayActivity.a3().X0(new C0197a(afterPlayActivity), false);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
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
                int r1 = r9.f22547z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f22546y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f22545x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f22544w
                com.dena.mirrativ.player.afterplay.AfterPlayActivity r4 = (com.dena.mirrativ.player.afterplay.AfterPlayActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L7d
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
                com.dena.mirrativ.player.afterplay.AfterPlayActivity r10 = com.dena.mirrativ.player.afterplay.AfterPlayActivity.this
                ib.d r10 = com.dena.mirrativ.player.afterplay.AfterPlayActivity.y3(r10)
                wo.x r3 = r10.k()
                com.dena.mirrativ.player.afterplay.AfterPlayActivity r10 = com.dena.mirrativ.player.afterplay.AfterPlayActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7d
                r4 = r10
                r10 = r9
            L3d:
                r10.f22544w = r4     // Catch: java.lang.Throwable -> L7d
                r10.f22545x = r3     // Catch: java.lang.Throwable -> L7d
                r10.f22546y = r1     // Catch: java.lang.Throwable -> L7d
                r10.f22547z = r2     // Catch: java.lang.Throwable -> L7d
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L7d
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L7a
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L7a
                if (r10 == 0) goto L74
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L7a
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L7a
                com.dena.mirrorman.util.FragmentRunner r6 = com.dena.mirrativ.player.afterplay.AfterPlayActivity.A3(r5)     // Catch: java.lang.Throwable -> L7a
                com.dena.mirrativ.player.afterplay.AfterPlayActivity$c$a r7 = new com.dena.mirrativ.player.afterplay.AfterPlayActivity$c$a     // Catch: java.lang.Throwable -> L7a
                r7.<init>(r5, r10)     // Catch: java.lang.Throwable -> L7a
                r6.c(r7)     // Catch: java.lang.Throwable -> L7a
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L74:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L7a:
                r10 = move-exception
                r3 = r4
                goto L7e
            L7d:
                r10 = move-exception
            L7e:
                throw r10     // Catch: java.lang.Throwable -> L7f
            L7f:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.afterplay.AfterPlayActivity.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.AfterPlayActivity$observeStoreValues$3", f = "AfterPlayActivity.kt", l = {380}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22551w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22552x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22553y;

        /* renamed from: z  reason: collision with root package name */
        public int f22554z;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
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
                int r1 = r8.f22554z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22553y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22552x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22551w
                com.dena.mirrativ.player.afterplay.AfterPlayActivity r4 = (com.dena.mirrativ.player.afterplay.AfterPlayActivity) r4
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
                com.dena.mirrativ.player.afterplay.AfterPlayActivity r9 = com.dena.mirrativ.player.afterplay.AfterPlayActivity.this
                ib.d r9 = com.dena.mirrativ.player.afterplay.AfterPlayActivity.y3(r9)
                wo.x r3 = r9.j()
                com.dena.mirrativ.player.afterplay.AfterPlayActivity r9 = com.dena.mirrativ.player.afterplay.AfterPlayActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22551w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22552x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22553y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22554z = r2     // Catch: java.lang.Throwable -> L74
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
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L71
                r5.finish()     // Catch: java.lang.Throwable -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.afterplay.AfterPlayActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.AfterPlayActivity$onSatisfied$1", f = "AfterPlayActivity.kt", l = {315, 316}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22555w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ gk.a f22556x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ AfterPlayActivity f22557y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(gk.a aVar, AfterPlayActivity afterPlayActivity, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f22556x = aVar;
            this.f22557y = afterPlayActivity;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f22556x, this.f22557y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22555w;
            try {
                try {
                } catch (Exception e10) {
                    g9.a.c(e10);
                }
                if (i10 == 0) {
                    wn.m.b(obj);
                    gk.a aVar = this.f22556x;
                    this.f22555w = 1;
                    obj = ek.a.b(aVar, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    if (i10 == 2) {
                        wn.m.b(obj);
                        this.f22557y.F3().a();
                        this.f22557y.finish();
                        return v.f59242a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                gk.a aVar2 = this.f22556x;
                AfterPlayActivity afterPlayActivity = this.f22557y;
                this.f22555w = 2;
                if (ek.a.a(aVar2, afterPlayActivity, (ReviewInfo) obj, this) == c10) {
                    return c10;
                }
                this.f22557y.F3().a();
                this.f22557y.finish();
                return v.f59242a;
            } catch (Throwable th2) {
                this.f22557y.finish();
                throw th2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<String> {
        public f() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = AfterPlayActivity.this.getIntent().getStringExtra("EXTRA_REFERER_FROM");
            if (stringExtra == null) {
                AfterPlayActivity.this.finish();
                return "";
            }
            return stringExtra;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f22559w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ AfterPlayActivity f22560x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, AfterPlayActivity afterPlayActivity) {
            super(0);
            this.f22559w = str;
            this.f22560x = afterPlayActivity;
        }

        public final void a() {
            xe.d.O0.a(this.f22559w, false).z3(this.f22560x.a3(), "SatisfactionConfirmDialog");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f22562x;

        /* loaded from: classes2.dex */
        public static final class a extends FragmentManager.j {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AfterPlayActivity f22563a;

            public a(AfterPlayActivity afterPlayActivity) {
                this.f22563a = afterPlayActivity;
            }

            @Override // androidx.fragment.app.FragmentManager.j
            public void e(FragmentManager fragmentManager, Fragment fragment) {
                jo.p.h(fragmentManager, "fm");
                jo.p.h(fragment, "f");
                super.e(fragmentManager, fragment);
                if (fragment instanceof ie.f) {
                    this.f22563a.finish();
                    this.f22563a.a3().n1(this);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.f22562x = str;
        }

        public final void a() {
            MRLogger I3 = AfterPlayActivity.this.I3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_URGE_DEVICE_PUSH_SETTING);
            builder.setTargetId(MRLog.TARGET_ID_IMP);
            I3.sendLog(builder.build());
            f.a aVar = ie.f.V0;
            String string = AfterPlayActivity.this.getResources().getString(b2.text_enable_os_push_setting, this.f22562x);
            jo.p.g(string, "resources.getString(R.st…etting, streamerUserName)");
            f.a.b(aVar, string, AfterPlayActivity.this.getResources().getString(b2.text_go_to_settings), AfterPlayActivity.this.getResources().getString(b2.f34719f), null, false, 24, null).z3(AfterPlayActivity.this.a3(), "TAG_REQUEST_TO_ENABLE_OS_NOTIFICATION_DIALOG");
            v vVar = v.f59242a;
            AfterPlayActivity afterPlayActivity = AfterPlayActivity.this;
            afterPlayActivity.a3().X0(new a(afterPlayActivity), false);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oe.a f22564w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ AfterPlayActivity f22565x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(oe.a aVar, AfterPlayActivity afterPlayActivity) {
            super(0);
            this.f22564w = aVar;
            this.f22565x = afterPlayActivity;
        }

        public final void a() {
            ib.j.W0.a(this.f22564w).z3(this.f22565x.a3(), "LiveRequestDialog");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<ib.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22566w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22567x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22568y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22566w = componentCallbacks;
            this.f22567x = aVar;
            this.f22568y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ib.a] */
        @Override // io.a
        public final ib.a invoke() {
            ComponentCallbacks componentCallbacks = this.f22566w;
            return gq.a.a(componentCallbacks).c(f0.b(ib.a.class), this.f22567x, this.f22568y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22569w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22570x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22571y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22569w = componentCallbacks;
            this.f22570x = aVar;
            this.f22571y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            ComponentCallbacks componentCallbacks = this.f22569w;
            return gq.a.a(componentCallbacks).c(f0.b(od.p.class), this.f22570x, this.f22571y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<xe.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22572w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22573x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22574y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22572w = componentCallbacks;
            this.f22573x = aVar;
            this.f22574y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [xe.a, java.lang.Object] */
        @Override // io.a
        public final xe.a invoke() {
            ComponentCallbacks componentCallbacks = this.f22572w;
            return gq.a.a(componentCallbacks).c(f0.b(xe.a.class), this.f22573x, this.f22574y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22575w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22576x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22577y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22575w = componentCallbacks;
            this.f22576x = aVar;
            this.f22577y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f22575w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f22576x, this.f22577y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22578w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22579x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22580y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22578w = componentCallbacks;
            this.f22579x = aVar;
            this.f22580y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f22578w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f22579x, this.f22580y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22581w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22582x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22583y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22581w = componentCallbacks;
            this.f22582x = aVar;
            this.f22583y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f22581w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f22582x, this.f22583y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f22584w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f22584w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f22584w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f22585w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22586x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22587y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f22588z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f22585w = aVar;
            this.f22586x = aVar2;
            this.f22587y = aVar3;
            this.f22588z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f22585w;
            vq.a aVar2 = this.f22586x;
            io.a aVar3 = this.f22587y;
            xq.a aVar4 = this.f22588z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(ib.d.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f22589w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentActivity componentActivity) {
            super(0);
            this.f22589w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f22589w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    public AfterPlayActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P = wn.g.b(iVar, new j(this, null, null));
        this.Q = new s0(f0.b(ib.d.class), new r(this), new q(new p(this), null, null, gq.a.a(this)));
        this.R = wn.g.b(iVar, new k(this, null, null));
        this.S = wn.g.b(iVar, new l(this, null, null));
        this.T = wn.g.b(iVar, new m(this, null, null));
        this.U = wn.g.b(iVar, new n(this, null, null));
        this.V = wn.g.b(iVar, new o(this, null, null));
        this.W = new FragmentRunner(this);
        this.X = wn.g.a(new f());
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: ib.c
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                AfterPlayActivity.M3(AfterPlayActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V2, "registerForActivityResul…ialog(it)\n        }\n    }");
        this.Y = V2;
    }

    public static final void M3(AfterPlayActivity afterPlayActivity, androidx.activity.result.a aVar) {
        Intent a10;
        jo.p.h(afterPlayActivity, "this$0");
        if (aVar.b() == -1 && (a10 = aVar.a()) != null) {
            afterPlayActivity.O3(a10);
        }
    }

    public final ib.a D3() {
        return (ib.a) this.P.getValue();
    }

    public final ib.d E3() {
        return (ib.d) this.Q.getValue();
    }

    public final xe.a F3() {
        return (xe.a) this.S.getValue();
    }

    public final od.p G3() {
        return (od.p) this.R.getValue();
    }

    public final tb.c H3() {
        return (tb.c) this.V.getValue();
    }

    public final MRLogger I3() {
        return (MRLogger) this.T.getValue();
    }

    public final String J3() {
        return (String) this.X.getValue();
    }

    public final x K3() {
        return (x) this.U.getValue();
    }

    public final void L3() {
        uo.l.d(this, null, null, new b(null), 3, null);
        uo.l.d(this, null, null, new c(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    public final boolean N3(Intent intent) {
        String stringExtra;
        if (!intent.getBooleanExtra("EXTRA_SHOULD_SHOW_SATISFACTION", false) || (stringExtra = intent.getStringExtra("EXTRA_LIVE_ID")) == null) {
            return false;
        }
        this.W.c(new g(stringExtra, this));
        return true;
    }

    public final void O3(Intent intent) {
        if (so.n.q("actiontype_dialog_afterplay", intent.getAction(), true)) {
            intent.setExtrasClassLoader(getClassLoader());
            if (intent.getBooleanExtra("EXTRA_PARAM_FOLLOWED_BROAD_CASTER_THIS_LIVE", false)) {
                String stringExtra = intent.getStringExtra("EXTRA_STREAMER_USER_NAME");
                if (stringExtra == null) {
                    finish();
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                if (!b3.m.d(this).a()) {
                    if (currentTimeMillis - K3().z2() > 604800) {
                        K3().C2(currentTimeMillis);
                        this.W.c(new h(stringExtra));
                        return;
                    }
                } else if (currentTimeMillis - K3().V4() > 1209600) {
                    K3().r1(currentTimeMillis);
                    ib.a D3 = D3();
                    String J3 = J3();
                    jo.p.g(J3, "referer");
                    D3.c(stringExtra, J3);
                    return;
                }
            }
            if (intent.getBooleanExtra("EXTRA_SHOULD_SHOW_LIVE_REQUEST", false)) {
                Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_LIVE_REQUEST");
                oe.a aVar = parcelableExtra instanceof oe.a ? (oe.a) parcelableExtra : null;
                if (aVar == null) {
                    finish();
                } else if (TextUtils.isEmpty(aVar.f())) {
                    FirebaseCrashlytics.getInstance().recordException(new Exception("uid for AfterPlayDialog is null"));
                    finish();
                } else {
                    this.W.c(new i(aVar, this));
                }
            } else if (N3(intent)) {
            } else {
                finish();
            }
        }
    }

    @Override // ib.k
    public void Z1() {
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_PLAY_DATA");
        Intent intent = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
        if (intent == null) {
            finish();
        } else if (N3(intent)) {
        } else {
            finish();
        }
    }

    @Override // xe.d.b
    public void a() {
        finish();
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "TAG_REQUEST_TO_ENABLE_OS_NOTIFICATION_DIALOG")) {
            MRLogger I3 = I3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_URGE_DEVICE_PUSH_SETTING);
            builder.setTargetId(MRLog.PAYLOAD_KEY_SETTING);
            I3.sendLog(builder.build());
            od.p G3 = G3();
            String J3 = J3();
            jo.p.g(J3, "referer");
            G3.y(J3);
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
            startActivity(intent);
            finish();
        } else if (jo.p.c(str, "TAG_REQUEST_TO_ENABLE_LIVE_NOTIFICATION_DIALOG")) {
            MRLogger I32 = I3();
            MRLog.Companion companion2 = MRLog.Companion;
            MRLog.Builder builder2 = new MRLog.Builder(MRLog.ACTION_TYPE_URGE_APP_PUSH_SETTING);
            builder2.setTargetId("on");
            I32.sendLog(builder2.build());
            od.p G32 = G3();
            String J32 = J3();
            jo.p.g(J32, "referer");
            G32.y(J32);
            finish();
        }
    }

    @Override // ie.f.b
    public void c(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "TAG_REQUEST_TO_ENABLE_OS_NOTIFICATION_DIALOG")) {
            MRLogger I3 = I3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_URGE_DEVICE_PUSH_SETTING);
            builder.setTargetId("close");
            I3.sendLog(builder.build());
            finish();
        } else if (jo.p.c(str, "TAG_REQUEST_TO_ENABLE_LIVE_NOTIFICATION_DIALOG")) {
            MRLogger I32 = I3();
            MRLog.Companion companion2 = MRLog.Companion;
            MRLog.Builder builder2 = new MRLog.Builder(MRLog.ACTION_TYPE_URGE_APP_PUSH_SETTING);
            builder2.setTargetId("close");
            I32.sendLog(builder2.build());
            finish();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        } else {
            finish();
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        L3();
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_PLAY_DATA");
        Intent intent = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
        if (intent == null) {
            finish();
        } else {
            O3(intent);
        }
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r0.d(this, null, 1, null);
    }

    @Override // xe.d.b
    public void q2(String str) {
        if (isFinishing()) {
            return;
        }
        if (str == null || so.n.r(str)) {
            return;
        }
        Puree.d(new Review(str, "ReviewRequire.show"));
        gk.a a10 = gk.b.a(this);
        jo.p.g(a10, "create(this)");
        uo.l.d(this, null, null, new e(a10, this, null), 3, null);
    }

    @Override // ib.k
    public void s(LiveBasicParams liveBasicParams) {
        jo.p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
        this.Y.a(c.a.f(H3(), this, liveBasicParams.getLiveId(), Referer.LiveView.FINISHED_DIALOG, liveBasicParams.getJoinedLiveThumbnailImageUrl(), liveBasicParams.getOrientationV2(), false, false, false, false, null, 960, null));
    }
}
