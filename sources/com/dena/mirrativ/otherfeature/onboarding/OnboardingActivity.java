package com.dena.mirrativ.otherfeature.onboarding;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.navigation.NavController;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity;
import com.dena.mirrativ.otherfeature.onboarding.emomo.TutorialEmomoActivity;
import com.dena.mirrorman.activity.MainActivity;
import com.dena.mirrorman.clientlog.logs.Launch;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.user.OnboardingLiveGame;
import gf.c0;
import java.util.Locale;
import jf.b0;
import jo.f0;
import kotlin.KotlinNothingValueException;
import kq.a;
import org.json.JSONObject;
import tb.c;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class OnboardingActivity extends e.b implements gf.t, gf.j, eb.d, eb.l, q0 {

    /* renamed from: e0  reason: collision with root package name */
    public static final a f21737e0 = new a(null);

    /* renamed from: f0  reason: collision with root package name */
    public static final int f21738f0 = 8;
    public db.a O;
    public final ao.g P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final wn.f W;
    public final wn.f X;
    public final wn.f Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f21739a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f21740b0;

    /* renamed from: c0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f21741c0;

    /* renamed from: d0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f21742d0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, OnboardingLiveGame onboardingLiveGame) {
            jo.p.h(context, "context");
            Intent intent = new Intent(context, OnboardingActivity.class);
            intent.putExtra("EXTRA_ONBOARDING_LIVE_GAME", onboardingLiveGame);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21743a;

        static {
            int[] iArr = new int[eb.m.values().length];
            iArr[eb.m.GAME.ordinal()] = 1;
            f21743a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<NavController> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final NavController invoke() {
            return androidx.navigation.b.a(OnboardingActivity.this, wa.e.J);
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity$observeStoreValues$1", f = "OnboardingActivity.kt", l = {373, 158}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f21745w;

        /* renamed from: x  reason: collision with root package name */
        public Object f21746x;

        /* renamed from: y  reason: collision with root package name */
        public Object f21747y;

        /* renamed from: z  reason: collision with root package name */
        public int f21748z;

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

        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:7:0x001a, B:26:0x009e, B:16:0x004e, B:20:0x0061, B:22:0x006a, B:12:0x0035, B:15:0x0049), top: B:35:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009c -> B:26:0x009e). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f21748z
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3a
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                java.lang.Object r1 = r10.f21747y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r10.f21746x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r10.f21745w
                com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity r5 = (com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity) r5
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lb9
                r11 = r5
                r5 = r10
                goto L9e
            L21:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L29:
                java.lang.Object r1 = r10.f21747y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r10.f21746x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r10.f21745w
                com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity r5 = (com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity) r5
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lb9
                r6 = r10
                goto L61
            L3a:
                wn.m.b(r11)
                com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity r11 = com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.this
                nf.o r11 = com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.C3(r11)
                wo.x r4 = r11.B()
                com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity r11 = com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.this
                wo.k r1 = r4.iterator()     // Catch: java.lang.Throwable -> Lb9
                r5 = r10
            L4e:
                r5.f21745w = r11     // Catch: java.lang.Throwable -> Lb9
                r5.f21746x = r4     // Catch: java.lang.Throwable -> Lb9
                r5.f21747y = r1     // Catch: java.lang.Throwable -> Lb9
                r5.f21748z = r3     // Catch: java.lang.Throwable -> Lb9
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> Lb9
                if (r6 != r0) goto L5d
                return r0
            L5d:
                r9 = r5
                r5 = r11
                r11 = r6
                r6 = r9
            L61:
                r7 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Lb9
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lb9
                if (r11 == 0) goto Lb3
                java.lang.Object r11 = r1.next()     // Catch: java.lang.Throwable -> Lb9
                wn.v r11 = (wn.v) r11     // Catch: java.lang.Throwable -> Lb9
                eb.e r11 = com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.F3(r5)     // Catch: java.lang.Throwable -> Lb9
                r11.k()     // Catch: java.lang.Throwable -> Lb9
                db.a r11 = r5.L3()     // Catch: java.lang.Throwable -> Lb9
                androidx.constraintlayout.widget.ConstraintLayout r11 = r11.B     // Catch: java.lang.Throwable -> Lb9
                r7 = 0
                r11.setVisibility(r7)     // Catch: java.lang.Throwable -> Lb9
                android.content.res.Resources r11 = r5.getResources()     // Catch: java.lang.Throwable -> Lb9
                r7 = 17694721(0x10e0001, float:2.6081284E-38)
                int r11 = r11.getInteger(r7)     // Catch: java.lang.Throwable -> Lb9
                long r7 = (long) r11     // Catch: java.lang.Throwable -> Lb9
                r6.f21745w = r5     // Catch: java.lang.Throwable -> Lb9
                r6.f21746x = r4     // Catch: java.lang.Throwable -> Lb9
                r6.f21747y = r1     // Catch: java.lang.Throwable -> Lb9
                r6.f21748z = r2     // Catch: java.lang.Throwable -> Lb9
                java.lang.Object r11 = uo.b1.a(r7, r6)     // Catch: java.lang.Throwable -> Lb9
                if (r11 != r0) goto L9c
                return r0
            L9c:
                r11 = r5
                r5 = r6
            L9e:
                androidx.navigation.NavController r6 = com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.E3(r11)     // Catch: java.lang.Throwable -> Lb9
                int r7 = wa.e.to_chooseMyProfileFragment     // Catch: java.lang.Throwable -> Lb9
                r6.m(r7)     // Catch: java.lang.Throwable -> Lb9
                db.a r6 = r11.L3()     // Catch: java.lang.Throwable -> Lb9
                androidx.constraintlayout.widget.ConstraintLayout r6 = r6.B     // Catch: java.lang.Throwable -> Lb9
                r7 = 8
                r6.setVisibility(r7)     // Catch: java.lang.Throwable -> Lb9
                goto L4e
            Lb3:
                wo.n.a(r4, r7)
                wn.v r11 = wn.v.f59242a
                return r11
            Lb9:
                r11 = move-exception
                throw r11     // Catch: java.lang.Throwable -> Lbb
            Lbb:
                r0 = move-exception
                wo.n.a(r4, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity$observeStoreValues$2", f = "OnboardingActivity.kt", l = {373, 168}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f21749w;

        /* renamed from: x  reason: collision with root package name */
        public Object f21750x;

        /* renamed from: y  reason: collision with root package name */
        public Object f21751y;

        /* renamed from: z  reason: collision with root package name */
        public int f21752z;

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

        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:7:0x001a, B:26:0x009e, B:16:0x004e, B:20:0x0061, B:22:0x006a, B:12:0x0035, B:15:0x0049), top: B:35:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009c -> B:26:0x009e). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f21752z
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3a
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                java.lang.Object r1 = r10.f21751y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r10.f21750x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r10.f21749w
                com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity r5 = (com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity) r5
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lb9
                r11 = r5
                r5 = r10
                goto L9e
            L21:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L29:
                java.lang.Object r1 = r10.f21751y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r10.f21750x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r10.f21749w
                com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity r5 = (com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity) r5
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lb9
                r6 = r10
                goto L61
            L3a:
                wn.m.b(r11)
                com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity r11 = com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.this
                nf.o r11 = com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.C3(r11)
                wo.x r4 = r11.A()
                com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity r11 = com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.this
                wo.k r1 = r4.iterator()     // Catch: java.lang.Throwable -> Lb9
                r5 = r10
            L4e:
                r5.f21749w = r11     // Catch: java.lang.Throwable -> Lb9
                r5.f21750x = r4     // Catch: java.lang.Throwable -> Lb9
                r5.f21751y = r1     // Catch: java.lang.Throwable -> Lb9
                r5.f21752z = r3     // Catch: java.lang.Throwable -> Lb9
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> Lb9
                if (r6 != r0) goto L5d
                return r0
            L5d:
                r9 = r5
                r5 = r11
                r11 = r6
                r6 = r9
            L61:
                r7 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Lb9
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lb9
                if (r11 == 0) goto Lb3
                java.lang.Object r11 = r1.next()     // Catch: java.lang.Throwable -> Lb9
                wn.v r11 = (wn.v) r11     // Catch: java.lang.Throwable -> Lb9
                eb.e r11 = com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.F3(r5)     // Catch: java.lang.Throwable -> Lb9
                r11.k()     // Catch: java.lang.Throwable -> Lb9
                db.a r11 = r5.L3()     // Catch: java.lang.Throwable -> Lb9
                androidx.constraintlayout.widget.ConstraintLayout r11 = r11.B     // Catch: java.lang.Throwable -> Lb9
                r7 = 0
                r11.setVisibility(r7)     // Catch: java.lang.Throwable -> Lb9
                android.content.res.Resources r11 = r5.getResources()     // Catch: java.lang.Throwable -> Lb9
                r7 = 17694721(0x10e0001, float:2.6081284E-38)
                int r11 = r11.getInteger(r7)     // Catch: java.lang.Throwable -> Lb9
                long r7 = (long) r11     // Catch: java.lang.Throwable -> Lb9
                r6.f21749w = r5     // Catch: java.lang.Throwable -> Lb9
                r6.f21750x = r4     // Catch: java.lang.Throwable -> Lb9
                r6.f21751y = r1     // Catch: java.lang.Throwable -> Lb9
                r6.f21752z = r2     // Catch: java.lang.Throwable -> Lb9
                java.lang.Object r11 = uo.b1.a(r7, r6)     // Catch: java.lang.Throwable -> Lb9
                if (r11 != r0) goto L9c
                return r0
            L9c:
                r11 = r5
                r5 = r6
            L9e:
                androidx.navigation.NavController r6 = com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.E3(r11)     // Catch: java.lang.Throwable -> Lb9
                int r7 = wa.e.to_chooseMyProfileFragment     // Catch: java.lang.Throwable -> Lb9
                r6.m(r7)     // Catch: java.lang.Throwable -> Lb9
                db.a r6 = r11.L3()     // Catch: java.lang.Throwable -> Lb9
                androidx.constraintlayout.widget.ConstraintLayout r6 = r6.B     // Catch: java.lang.Throwable -> Lb9
                r7 = 8
                r6.setVisibility(r7)     // Catch: java.lang.Throwable -> Lb9
                goto L4e
            Lb3:
                wo.n.a(r4, r7)
                wn.v r11 = wn.v.f59242a
                return r11
            Lb9:
                r11 = move-exception
                throw r11     // Catch: java.lang.Throwable -> Lbb
            Lbb:
                r0 = move-exception
                wo.n.a(r4, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity$observeStoreValues$3", f = "OnboardingActivity.kt", l = {373, 176}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f21753w;

        /* renamed from: x  reason: collision with root package name */
        public Object f21754x;

        /* renamed from: y  reason: collision with root package name */
        public Object f21755y;

        /* renamed from: z  reason: collision with root package name */
        public Object f21756z;

        /* loaded from: classes2.dex */
        public static final class a extends FragmentManager.j {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ OnboardingActivity f21757a;

            public a(OnboardingActivity onboardingActivity) {
                this.f21757a = onboardingActivity;
            }

            @Override // androidx.fragment.app.FragmentManager.j
            public void e(FragmentManager fragmentManager, Fragment fragment) {
                jo.p.h(fragmentManager, "fm");
                jo.p.h(fragment, "f");
                if (fragment instanceof c0) {
                    this.f21757a.N3().m();
                    this.f21757a.a3().n1(this);
                }
            }
        }

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

        /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x00dc, TRY_LEAVE, TryCatch #1 {all -> 0x00dc, blocks: (B:7:0x001f, B:16:0x0057, B:20:0x006e, B:22:0x0076, B:12:0x003c, B:15:0x0052), top: B:47:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00af A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:26:0x00a9, B:31:0x00b3, B:33:0x00b7, B:34:0x00c5, B:29:0x00af), top: B:45:0x00a9 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:26:0x00a9, B:31:0x00b3, B:33:0x00b7, B:34:0x00c5, B:29:0x00af), top: B:45:0x00a9 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a4 -> B:45:0x00a9). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity$observeStoreValues$4", f = "OnboardingActivity.kt", l = {373}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f21758w;

        /* renamed from: x  reason: collision with root package name */
        public Object f21759x;

        /* renamed from: y  reason: collision with root package name */
        public Object f21760y;

        /* renamed from: z  reason: collision with root package name */
        public int f21761z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x009c, TryCatch #1 {all -> 0x009c, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0066, B:22:0x006a, B:24:0x006e, B:25:0x0074, B:27:0x0079, B:28:0x0085), top: B:41:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
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
                int r1 = r9.f21761z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f21760y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f21759x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f21758w
                com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity r4 = (com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L9f
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
                com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity r10 = com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.this
                nf.o r10 = com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.C3(r10)
                wo.x r3 = r10.D()
                com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity r10 = com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L9f
                r4 = r10
                r10 = r9
            L3d:
                r10.f21758w = r4     // Catch: java.lang.Throwable -> L9f
                r10.f21759x = r3     // Catch: java.lang.Throwable -> L9f
                r10.f21760y = r1     // Catch: java.lang.Throwable -> L9f
                r10.f21761z = r2     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L9f
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9c
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9c
                if (r10 == 0) goto L96
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L9c
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> L9c
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> L9c
                if (r6 == 0) goto L6a
                of.n.z(r5)     // Catch: java.lang.Throwable -> L9c
                goto L90
            L6a:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Maintenance     // Catch: java.lang.Throwable -> L9c
                if (r6 == 0) goto L74
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> L9c
                r6.l(r5, r10)     // Catch: java.lang.Throwable -> L9c
                goto L90
            L74:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> L9c
                r7 = 0
                if (r6 == 0) goto L85
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> L9c
                com.dena.mirrativ.mirrativapi.core.MRError$Failure r10 = (com.dena.mirrativ.mirrativapi.core.MRError.Failure) r10     // Catch: java.lang.Throwable -> L9c
                java.lang.String r10 = r10.getErrorMessage()     // Catch: java.lang.Throwable -> L9c
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> L9c
                goto L90
            L85:
                of.n r10 = of.n.f45411a     // Catch: java.lang.Throwable -> L9c
                int r6 = wa.j.f58548e     // Catch: java.lang.Throwable -> L9c
                java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L9c
                r10.B(r5, r6, r7)     // Catch: java.lang.Throwable -> L9c
            L90:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L96:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L9c:
                r10 = move-exception
                r3 = r4
                goto La0
            L9f:
                r10 = move-exception
            La0:
                throw r10     // Catch: java.lang.Throwable -> La1
            La1:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity$observeStoreValues$5", f = "OnboardingActivity.kt", l = {215}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21762w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<LiveGameStartResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ OnboardingActivity f21764w;

            public a(OnboardingActivity onboardingActivity) {
                this.f21764w = onboardingActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(LiveGameStartResponse liveGameStartResponse, ao.d<? super wn.v> dVar) {
                if (this.f21764w.V3().a(liveGameStartResponse.getLaunchUrl()) instanceof b0.l) {
                    OnboardingActivity onboardingActivity = this.f21764w;
                    Intent Q = onboardingActivity.P3().Q(this.f21764w, null, liveGameStartResponse.getPlayId());
                    Q.addFlags(67108864);
                    onboardingActivity.startActivity(Q);
                } else {
                    OnboardingActivity onboardingActivity2 = this.f21764w;
                    tb.c P3 = onboardingActivity2.P3();
                    Context applicationContext = this.f21764w.getApplicationContext();
                    jo.p.g(applicationContext, "applicationContext");
                    Intent u10 = P3.u(applicationContext, Referer.TUTORIAL, liveGameStartResponse.getLiveGameId(), liveGameStartResponse.getLaunchUrl(), liveGameStartResponse.getPlayId(), liveGameStartResponse.isLandscape(), null);
                    u10.addFlags(67108864);
                    onboardingActivity2.startActivity(u10);
                }
                this.f21764w.finish();
                return wn.v.f59242a;
            }
        }

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

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21762w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<LiveGameStartResponse> l10 = OnboardingActivity.this.T3().l();
                a aVar = new a(OnboardingActivity.this);
                this.f21762w = 1;
                if (l10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity$observeStoreValues$6", f = "OnboardingActivity.kt", l = {249}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21765w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ OnboardingActivity f21767w;

            public a(OnboardingActivity onboardingActivity) {
                this.f21767w = onboardingActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                this.f21767w.f21742d0.a(c.a.f(this.f21767w.P3(), this.f21767w, str, Referer.TUTORIAL, null, null, false, false, false, true, null, 760, null));
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
            int i10 = this.f21765w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<String> k10 = OnboardingActivity.this.T3().k();
                a aVar = new a(OnboardingActivity.this);
                this.f21765w = 1;
                if (k10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity$observeStoreValues$7", f = "OnboardingActivity.kt", l = {261}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21768w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ OnboardingActivity f21770w;

            public a(OnboardingActivity onboardingActivity) {
                this.f21770w = onboardingActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                Intent a10;
                OnboardingActivity onboardingActivity = this.f21770w;
                a10 = MainActivity.f25195m0.a(onboardingActivity, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? 0L : 0L, (r17 & 8) != 0 ? 0 : 0, (r17 & 16) != 0 ? false : false, (r17 & 32) == 0 ? null : null, (r17 & 64) == 0 ? false : false);
                a10.setFlags(268435456);
                onboardingActivity.startActivity(a10);
                this.f21770w.finish();
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
            int i10 = this.f21768w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> i11 = OnboardingActivity.this.T3().i();
                a aVar = new a(OnboardingActivity.this);
                this.f21768w = 1;
                if (i11.a(aVar, this) == c10) {
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
    public static final class k extends jo.q implements io.a<uq.a> {
        public k() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(OnboardingActivity.this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<OnboardingLiveGame> {
        public l() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final OnboardingLiveGame invoke() {
            return (OnboardingLiveGame) OnboardingActivity.this.getIntent().getParcelableExtra("EXTRA_ONBOARDING_LIVE_GAME");
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21773w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21774x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21775y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21773w = componentCallbacks;
            this.f21774x = aVar;
            this.f21775y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            ComponentCallbacks componentCallbacks = this.f21773w;
            return gq.a.a(componentCallbacks).c(f0.b(od.p.class), this.f21774x, this.f21775y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21776w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21777x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21778y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21776w = componentCallbacks;
            this.f21777x = aVar;
            this.f21778y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f21776w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.o.class), this.f21777x, this.f21778y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21779w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21780x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21781y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21779w = componentCallbacks;
            this.f21780x = aVar;
            this.f21781y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f21779w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.k.class), this.f21780x, this.f21781y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<of.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21782w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21783x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21784y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21782w = componentCallbacks;
            this.f21783x = aVar;
            this.f21784y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.r, java.lang.Object] */
        @Override // io.a
        public final of.r invoke() {
            ComponentCallbacks componentCallbacks = this.f21782w;
            return gq.a.a(componentCallbacks).c(f0.b(of.r.class), this.f21783x, this.f21784y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21785w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21786x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21787y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21785w = componentCallbacks;
            this.f21786x = aVar;
            this.f21787y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f21785w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f21786x, this.f21787y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21788w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21789x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21790y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21788w = componentCallbacks;
            this.f21789x = aVar;
            this.f21790y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f21788w;
            return gq.a.a(componentCallbacks).c(f0.b(of.k.class), this.f21789x, this.f21790y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21791w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21792x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21793y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21791w = componentCallbacks;
            this.f21792x = aVar;
            this.f21793y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f21791w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f21792x, this.f21793y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21794w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentActivity componentActivity) {
            super(0);
            this.f21794w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21794w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21795w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21796x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21797y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21798z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21795w = aVar;
            this.f21796x = aVar2;
            this.f21797y = aVar3;
            this.f21798z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21795w;
            vq.a aVar2 = this.f21796x;
            io.a aVar3 = this.f21797y;
            xq.a aVar4 = this.f21798z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(eb.e.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21799w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentActivity componentActivity) {
            super(0);
            this.f21799w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21799w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21800w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentActivity componentActivity) {
            super(0);
            this.f21800w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21800w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21801w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21802x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21803y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21804z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21801w = aVar;
            this.f21802x = aVar2;
            this.f21803y = aVar3;
            this.f21804z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21801w;
            vq.a aVar2 = this.f21802x;
            io.a aVar3 = this.f21803y;
            xq.a aVar4 = this.f21804z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(eb.k.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21805w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentActivity componentActivity) {
            super(0);
            this.f21805w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21805w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    public OnboardingActivity() {
        uo.b0 b10;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.P = c10.plus(b10);
        this.Q = wn.g.a(new l());
        this.R = wn.g.a(new c());
        this.S = new s0(f0.b(eb.e.class), new v(this), new u(new t(this), null, new k(), gq.a.a(this)));
        this.T = new s0(f0.b(eb.k.class), new y(this), new x(new w(this), null, null, gq.a.a(this)));
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.U = wn.g.b(iVar, new m(this, null, null));
        this.V = wn.g.b(iVar, new n(this, null, null));
        this.W = wn.g.b(iVar, new o(this, null, null));
        this.X = wn.g.b(iVar, new p(this, null, null));
        this.Y = wn.g.b(iVar, new q(this, null, null));
        this.f21739a0 = wn.g.b(iVar, new r(this, null, null));
        this.f21740b0 = wn.g.b(iVar, new s(this, null, null));
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: eb.h
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                OnboardingActivity.b4(OnboardingActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V2, "registerForActivityResul… finish()\n        }\n    }");
        this.f21741c0 = V2;
        androidx.activity.result.c<Intent> V22 = V2(new c.c(), new androidx.activity.result.b() { // from class: eb.g
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                OnboardingActivity.Z3(OnboardingActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V22, "registerForActivityResul… )\n        finish()\n    }");
        this.f21742d0 = V22;
    }

    public static final void X3(OnboardingActivity onboardingActivity, nl.b bVar) {
        jo.p.h(onboardingActivity, "this$0");
        if (bVar != null) {
            Uri a10 = bVar.a();
            Puree.d(new Launch.DynamicLinksInstall(String.valueOf(a10)));
            onboardingActivity.S3().l(String.valueOf(a10));
        }
    }

    public static final void Y3(Exception exc) {
        jo.p.h(exc, "it");
        g9.a.h(exc);
    }

    public static final void Z3(OnboardingActivity onboardingActivity, androidx.activity.result.a aVar) {
        Intent a10;
        jo.p.h(onboardingActivity, "this$0");
        a10 = MainActivity.f25195m0.a(onboardingActivity, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? 0L : 0L, (r17 & 8) != 0 ? 0 : 0, (r17 & 16) != 0 ? false : false, (r17 & 32) == 0 ? null : null, (r17 & 64) == 0 ? false : false);
        a10.setFlags(268435456);
        onboardingActivity.startActivity(a10);
        onboardingActivity.finish();
    }

    public static final void b4(OnboardingActivity onboardingActivity, androidx.activity.result.a aVar) {
        Intent a10;
        jo.p.h(onboardingActivity, "this$0");
        if (aVar.b() != -1 || aVar.a() == null) {
            return;
        }
        a10 = MainActivity.f25195m0.a(onboardingActivity, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? 0L : 0L, (r17 & 8) != 0 ? 0 : 0, (r17 & 16) != 0 ? false : false, (r17 & 32) == 0 ? null : null, (r17 & 64) == 0 ? false : false);
        a10.setFlags(268435456);
        onboardingActivity.startActivity(a10);
        onboardingActivity.finish();
    }

    public final db.a L3() {
        db.a aVar = this.O;
        if (aVar != null) {
            return aVar;
        }
        jo.p.v("binding");
        return null;
    }

    public final nf.k M3() {
        return (nf.k) this.W.getValue();
    }

    public final od.p N3() {
        return (od.p) this.U.getValue();
    }

    public final nf.o O3() {
        return (nf.o) this.V.getValue();
    }

    public final tb.c P3() {
        return (tb.c) this.f21740b0.getValue();
    }

    public final MRLogger Q3() {
        return (MRLogger) this.Y.getValue();
    }

    public final NavController R3() {
        return (NavController) this.R.getValue();
    }

    public final eb.e S3() {
        return (eb.e) this.S.getValue();
    }

    public final eb.k T3() {
        return (eb.k) this.T.getValue();
    }

    public final of.r U3() {
        return (of.r) this.X.getValue();
    }

    public final of.k V3() {
        return (of.k) this.f21739a0.getValue();
    }

    public final void W3() {
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
    }

    @Override // gf.j
    public void Z() {
        if (!this.Z && T3().j().f() != eb.m.VIEW) {
            R3().m(wa.e.to_makeEmomoOnboardingFragment);
        } else {
            S3().j();
        }
    }

    public final void a4(db.a aVar) {
        jo.p.h(aVar, "<set-?>");
        this.O = aVar;
    }

    @Override // eb.d
    public void b0() {
        this.f21741c0.a(TutorialEmomoActivity.f21813m0.a(this, false, true, false));
        MRLogger Q3 = Q3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TUTORIAL_AVATAR_CREATE_TAP);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_skip", 0);
        wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString());
        Q3.sendLog(builder.build());
    }

    @Override // eb.l
    public void d2(eb.m mVar) {
        Intent a10;
        jo.p.h(mVar, "onboardingSurveyItem");
        MRLogger Q3 = Q3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TUTORIAL_SURVEY);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", mVar.ordinal());
        String lowerCase = mVar.name().toLowerCase(Locale.ROOT);
        jo.p.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        jSONObject.put("type", lowerCase);
        wn.v vVar = wn.v.f59242a;
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString())));
        Q3.sendLog(builder.build());
        S3().m(mVar);
        if (b.f21743a[mVar.ordinal()] == 1) {
            a10 = MainActivity.f25195m0.a(this, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? 0L : 0L, (r17 & 8) != 0 ? 0 : 0, (r17 & 16) != 0 ? false : false, (r17 & 32) == 0 ? null : null, (r17 & 64) == 0);
            startActivities(new Intent[]{a10, P3().D(this)});
            Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_ONBOARDING_LIVE_GAME");
            OnboardingLiveGame onboardingLiveGame = parcelableExtra instanceof OnboardingLiveGame ? (OnboardingLiveGame) parcelableExtra : null;
            if (onboardingLiveGame == null) {
                finish();
                return;
            } else {
                S3().o(onboardingLiveGame.getId(), onboardingLiveGame.getAppId());
                return;
            }
        }
        R3().m(wa.e.to_chooseMyAppsFragment);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.P;
    }

    @Override // gf.j
    public void m1() {
        MRLogger Q3 = Q3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TUTORIAL_MYAPP_REG);
        builder.setTargetId("skip");
        Q3.sendLog(builder.build());
        Z();
    }

    @Override // gf.t
    public void o0() {
        if (M3().o()) {
            R3().m(wa.e.onboardingSurveyFragment);
        } else {
            R3().m(wa.e.chooseMyAppsFragment);
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        of.n.A(this, wa.j.text_cannot_use_back_on_this_screen, false);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, wa.f.activity_onboarding);
        jo.p.g(g10, "setContentView(this, R.layout.activity_onboarding)");
        a4((db.a) g10);
        Bundle bundle2 = new Bundle();
        bundle2.putString("EXTRA_REFERER", Referer.TUTORIAL);
        bundle2.putBoolean("EXTRA_SHOW_MENU_ITEMS", false);
        R3().z(wa.h.onboarding_navigation_graph, bundle2);
        S3().n(0);
        W3();
        nl.a.b().a(getIntent()).g(this, new vi.e() { // from class: eb.j
            @Override // vi.e
            public final void onSuccess(Object obj) {
                OnboardingActivity.X3(OnboardingActivity.this, (nl.b) obj);
            }
        }).d(this, eb.i.f30372a);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r0.d(this, null, 1, null);
    }

    @Override // eb.d
    public void u2() {
        Intent a10;
        a10 = MainActivity.f25195m0.a(this, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? 0L : 0L, (r17 & 8) != 0 ? 0 : 0, (r17 & 16) != 0 ? false : false, (r17 & 32) == 0 ? null : null, (r17 & 64) == 0 ? false : false);
        a10.setFlags(268435456);
        startActivity(a10);
        MRLogger Q3 = Q3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TUTORIAL_AVATAR_CREATE_TAP);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_skip", 1);
        wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString());
        Q3.sendLog(builder.build());
        finish();
    }

    @Override // gf.t
    public void w1() {
        MRLogger Q3 = Q3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_DEMOGRAPHIC);
        builder.setTargetType("reg_cancel");
        Q3.sendLog(builder.build());
        o0();
    }
}
