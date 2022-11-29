package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.unity.UnityScreenshot;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import kotlin.KotlinNothingValueException;
import kq.a;

/* loaded from: classes2.dex */
public final class b extends androidx.fragment.app.e implements uo.q0 {
    public final /* synthetic */ uo.q0 N0;
    public final AutoClearedValue O0;
    public be.c P0;
    public String Q0;
    public String R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;
    public final wn.f X0;
    public final wn.f Y0;

    /* renamed from: a1  reason: collision with root package name */
    public static final /* synthetic */ qo.h<Object>[] f17626a1 = {jo.f0.d(new jo.s(b.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogAfterShutterEmomoOnboardingBinding;", 0))};
    public static final a Z0 = new a(null);

    /* renamed from: b1  reason: collision with root package name */
    public static final int f17627b1 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a(String str, UnityScreenshot unityScreenshot, String str2, String str3, String str4, boolean z10) {
            jo.p.h(str, "referer");
            jo.p.h(unityScreenshot, "screenshot");
            jo.p.h(str2, "userId");
            jo.p.h(str3, "userName");
            jo.p.h(str4, "shareText");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putSerializable("SCREENSHOT", unityScreenshot);
            bundle.putString("EXTRA_USER_ID", str2);
            bundle.putString("EXTRA_USER_NAME", str3);
            bundle.putString("EXTRA_SHARE_TEXT", str4);
            bundle.putBoolean("EXTRA_IS_STREAMING", z10);
            bVar.V2(bundle);
            return bVar;
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.AfterShutterEmomoOnboardingDialog$onViewCreated$1", f = "AfterShutterEmomoOnboardingDialog.kt", l = {127}, m = "invokeSuspend")
    /* renamed from: be.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0120b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17628w;

        /* renamed from: be.b$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b f17630w;

            @co.f(c = "com.dena.mirrorman.dialog.AfterShutterEmomoOnboardingDialog$onViewCreated$1$1", f = "AfterShutterEmomoOnboardingDialog.kt", l = {131}, m = "emit")
            /* renamed from: be.b$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0121a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f17631w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f17632x;

                /* renamed from: z  reason: collision with root package name */
                public int f17634z;

                public C0121a(ao.d<? super C0121a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f17632x = obj;
                    this.f17634z |= Integer.MIN_VALUE;
                    return a.this.a(false, this);
                }
            }

            public a(b bVar) {
                this.f17630w = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(boolean r6, ao.d<? super wn.v> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof be.b.C0120b.a.C0121a
                    if (r0 == 0) goto L13
                    r0 = r7
                    be.b$b$a$a r0 = (be.b.C0120b.a.C0121a) r0
                    int r1 = r0.f17634z
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f17634z = r1
                    goto L18
                L13:
                    be.b$b$a$a r0 = new be.b$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f17632x
                    java.lang.Object r1 = bo.c.c()
                    int r2 = r0.f17634z
                    r3 = 0
                    r4 = 1
                    if (r2 == 0) goto L36
                    if (r2 != r4) goto L2e
                    java.lang.Object r6 = r0.f17631w
                    be.b$b$a r6 = (be.b.C0120b.a) r6
                    wn.m.b(r7)
                    goto L7b
                L2e:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L36:
                    wn.m.b(r7)
                    if (r6 == 0) goto Lac
                    be.b r6 = r5.f17630w
                    ae.o0 r6 = be.b.C3(r6)
                    androidx.constraintlayout.widget.ConstraintLayout r6 = r6.F
                    r7 = 8
                    r6.setVisibility(r7)
                    com.dena.mirrorman.clientlog.logs.Avatar$AvatarUpdateProfile r6 = new com.dena.mirrorman.clientlog.logs.Avatar$AvatarUpdateProfile
                    r6.<init>(r4)
                    com.cookpad.puree.Puree.d(r6)
                    be.b r6 = r5.f17630w
                    of.r r6 = be.b.J3(r6)
                    be.b r7 = r5.f17630w
                    android.content.Context r7 = r7.N2()
                    java.lang.String r2 = "requireContext()"
                    jo.p.g(r7, r2)
                    be.b r2 = r5.f17630w
                    java.lang.String r2 = be.b.K3(r2)
                    if (r2 != 0) goto L6f
                    java.lang.String r2 = "referer"
                    jo.p.v(r2)
                    r2 = r3
                L6f:
                    r0.f17631w = r5
                    r0.f17634z = r4
                    java.lang.Object r6 = r6.e(r7, r2, r0)
                    if (r6 != r1) goto L7a
                    return r1
                L7a:
                    r6 = r5
                L7b:
                    hf.b r7 = hf.b.f35490a
                    r7.l()
                    be.b r7 = r6.f17630w
                    r7.m3()
                    be.b r7 = r6.f17630w
                    be.c r7 = be.b.F3(r7)
                    if (r7 == 0) goto L90
                    r7.F0()
                L90:
                    be.b r6 = r6.f17630w
                    android.content.Context r6 = r6.q0()
                    if (r6 == 0) goto La1
                    com.google.firebase.analytics.FirebaseAnalytics r6 = com.google.firebase.analytics.FirebaseAnalytics.getInstance(r6)
                    java.lang.String r7 = "eeiaib"
                    r6.a(r7, r3)
                La1:
                    com.dena.mirrorman.unity.UnityManager$Companion r6 = com.dena.mirrorman.unity.UnityManager.Companion
                    com.dena.mirrorman.unity.UnityManager r6 = r6.getInstance()
                    com.dena.mirrorman.unity.CameraDolly r7 = com.dena.mirrorman.unity.CameraDolly.DEFAULT
                    r6.setCameraDolly(r7)
                Lac:
                    wn.v r6 = wn.v.f59242a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: be.b.C0120b.a.a(boolean, ao.d):java.lang.Object");
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        public C0120b(ao.d<? super C0120b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0120b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0120b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17628w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<Boolean> F0 = b.this.O3().F0();
                a aVar = new a(b.this);
                this.f17628w = 1;
                if (F0.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.dialog.AfterShutterEmomoOnboardingDialog$onViewCreated$2", f = "AfterShutterEmomoOnboardingDialog.kt", l = {144}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17635w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b f17637w;

            public a(b bVar) {
                this.f17637w = bVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f17637w.M3().F.setVisibility(8);
                if (mRError instanceof MRError.Maintenance ? true : jo.p.c(mRError, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(this.f17637w.N2(), mRError);
                } else {
                    of.n nVar = of.n.f45411a;
                    Context N2 = this.f17637w.N2();
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f17637w.U0(nd.f1.f41966c);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(N2, message, false);
                }
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17635w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> W = b.this.O3().W();
                a aVar = new a(b.this);
                this.f17635w = 1;
                if (W.a(aVar, this) == c10) {
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
    public static final class d extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f17639x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f17640y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, boolean z10) {
            super(1);
            this.f17639x = str;
            this.f17640y = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(android.view.View r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.String r1 = "it"
                r2 = r18
                jo.p.h(r2, r1)
                be.b r1 = be.b.this
                ae.o0 r1 = be.b.C3(r1)
                androidx.constraintlayout.widget.ConstraintLayout r1 = r1.F
                r2 = 0
                r1.setVisibility(r2)
                be.b r1 = be.b.this
                java.lang.String r1 = be.b.I3(r1)
                if (r1 == 0) goto L23
                int r1 = r1.length()
                if (r1 != 0) goto L24
            L23:
                r2 = 1
            L24:
                r1 = 0
                if (r2 != 0) goto L3b
                java.io.File r2 = new java.io.File
                be.b r3 = be.b.this
                java.lang.String r3 = be.b.I3(r3)
                r2.<init>(r3)
                boolean r3 = r2.exists()
                if (r3 != 0) goto L39
                goto L3b
            L39:
                r8 = r2
                goto L3c
            L3b:
                r8 = r1
            L3c:
                com.dena.mirrativ.mirrativapi.core.ApiUtil r4 = com.dena.mirrativ.mirrativapi.core.ApiUtil.INSTANCE
                be.b r2 = be.b.this
                hf.v0 r2 = be.b.L3(r2)
                java.lang.String r5 = r2.x()
                java.lang.String r6 = r0.f17639x
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                be.b r2 = be.b.this
                hf.v0 r2 = be.b.L3(r2)
                java.lang.String r12 = r2.d()
                r13 = 0
                r14 = 1
                r15 = 0
                r16 = 0
                ep.c0 r2 = r4.userProfileEditRequestBody(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                be.b r3 = be.b.this
                od.e r3 = be.b.D3(r3)
                be.b r4 = be.b.this
                java.lang.String r4 = be.b.K3(r4)
                if (r4 != 0) goto L75
                java.lang.String r4 = "referer"
                jo.p.v(r4)
                goto L76
            L75:
                r1 = r4
            L76:
                r3.e(r1, r2)
                be.b r1 = be.b.this
                com.dena.mirrorman.clientlog.logs.MRLogger r1 = be.b.H3(r1)
                com.dena.mirrorman.clientlog.logs.MRLog$Companion r2 = com.dena.mirrorman.clientlog.logs.MRLog.Companion
                boolean r2 = r0.f17640y
                be.b r3 = be.b.this
                com.dena.mirrorman.clientlog.logs.MRLog$Builder r4 = new com.dena.mirrorman.clientlog.logs.MRLog$Builder
                java.lang.String r5 = "emomo_share_screen"
                r4.<init>(r5)
                java.lang.String r5 = "ok"
                r4.setTargetId(r5)
                if (r2 == 0) goto La8
                kf.m r2 = be.b.G3(r3)
                java.lang.String r2 = r2.b()
                java.lang.String r3 = "live_id"
                wn.k r2 = wn.q.a(r3, r2)
                java.util.List r2 = xn.r.d(r2)
                r4.setPayload(r2)
            La8:
                com.dena.mirrorman.clientlog.logs.MRLog r2 = r4.build()
                r1.sendLog(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: be.b.d.a(android.view.View):void");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17641w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17642x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17643y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17641w = componentCallbacks;
            this.f17642x = aVar;
            this.f17643y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f17641w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.v0.class), this.f17642x, this.f17643y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17644w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17645x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17646y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17644w = componentCallbacks;
            this.f17645x = aVar;
            this.f17646y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f17644w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f17645x, this.f17646y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<of.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17647w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17648x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17649y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17647w = componentCallbacks;
            this.f17648x = aVar;
            this.f17649y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.r, java.lang.Object] */
        @Override // io.a
        public final of.r invoke() {
            ComponentCallbacks componentCallbacks = this.f17647w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.r.class), this.f17648x, this.f17649y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17650w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17651x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17652y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17650w = componentCallbacks;
            this.f17651x = aVar;
            this.f17652y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f17650w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f17651x, this.f17652y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<od.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17653w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17654x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17655y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17653w = componentCallbacks;
            this.f17654x = aVar;
            this.f17655y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.e] */
        @Override // io.a
        public final od.e invoke() {
            ComponentCallbacks componentCallbacks = this.f17653w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.e.class), this.f17654x, this.f17655y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f17656w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f17656w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f17656w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f17656w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17657w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f17657w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f17657w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17658w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17659x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17660y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f17661z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f17658w = aVar;
            this.f17659x = aVar2;
            this.f17660y = aVar3;
            this.f17661z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f17658w;
            vq.a aVar2 = this.f17659x;
            io.a aVar3 = this.f17660y;
            xq.a aVar4 = this.f17661z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(je.e.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17662w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f17662w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f17662w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f17663w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Fragment fragment) {
            super(0);
            this.f17663w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f17663w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17664w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar) {
            super(0);
            this.f17664w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f17664w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17665w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17666x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17667y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f17668z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f17665w = aVar;
            this.f17666x = aVar2;
            this.f17667y = aVar3;
            this.f17668z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f17665w;
            vq.a aVar2 = this.f17666x;
            io.a aVar3 = this.f17667y;
            xq.a aVar4 = this.f17668z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17669w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(io.a aVar) {
            super(0);
            this.f17669w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f17669w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public b() {
        super(nd.b1.dialog_after_shutter_emomo_onboarding);
        this.N0 = uo.r0.b();
        this.O0 = nd.a.a(this);
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.S0 = wn.g.b(iVar, new e(this, null, null));
        this.T0 = wn.g.b(iVar, new f(this, null, null));
        this.U0 = wn.g.b(iVar, new g(this, null, null));
        this.V0 = wn.g.b(iVar, new h(this, null, null));
        j jVar = new j(this);
        xq.a a10 = gq.a.a(this);
        k kVar = new k(jVar);
        this.W0 = androidx.fragment.app.e0.a(this, jo.f0.b(je.e.class), new m(kVar), new l(jVar, null, null, a10));
        this.X0 = wn.g.b(iVar, new i(this, null, null));
        n nVar = new n(this);
        xq.a a11 = gq.a.a(this);
        o oVar = new o(nVar);
        this.Y0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.f.class), new q(oVar), new p(nVar, null, null, a11));
    }

    public static final void U3(b bVar, View view) {
        jo.p.h(bVar, "this$0");
        bVar.m3();
        be.c cVar = bVar.P0;
        if (cVar != null) {
            cVar.q();
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.P0 = null;
        super.I1();
    }

    public final ae.o0 M3() {
        return (ae.o0) this.O0.b(this, f17626a1[0]);
    }

    public final od.e N3() {
        return (od.e) this.X0.getValue();
    }

    public final nf.f O3() {
        return (nf.f) this.Y0.getValue();
    }

    public final kf.m P3() {
        return (kf.m) this.T0.getValue();
    }

    public final MRLogger Q3() {
        return (MRLogger) this.V0.getValue();
    }

    public final of.r R3() {
        return (of.r) this.U0.getValue();
    }

    public final je.e S3() {
        return (je.e) this.W0.getValue();
    }

    public final hf.v0 T3() {
        return (hf.v0) this.S0.getValue();
    }

    public final void V3(ae.o0 o0Var) {
        this.O0.a(this, f17626a1[0], o0Var);
    }

    public final void W3(UnityScreenshot unityScreenshot) {
        File f10 = S3().f().f();
        if (f10 == null) {
            return;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(f10.getAbsolutePath());
        Bitmap decodeFile2 = BitmapFactory.decodeFile(unityScreenshot.getImagePath());
        int faceSize = (int) (unityScreenshot.getFaceSize() * 1.7d);
        Bitmap createBitmap = Bitmap.createBitmap(unityScreenshot.getPixelWidth(), unityScreenshot.getPixelHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (decodeFile != null) {
            Matrix matrix = new Matrix();
            matrix.postScale(unityScreenshot.getPixelWidth() / decodeFile.getWidth(), unityScreenshot.getPixelHeight() / decodeFile.getHeight());
            canvas.drawBitmap(decodeFile, matrix, null);
        }
        if (decodeFile2 != null) {
            canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, (Paint) null);
        }
        int i10 = faceSize / 2;
        int max = Math.max(0, unityScreenshot.getFacePositionCenterX() - i10);
        int max2 = Math.max(0, unityScreenshot.getFacePositionCenterY() - i10);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, max, max2, Math.min(faceSize, unityScreenshot.getPixelWidth() - max), Math.min(faceSize, unityScreenshot.getPixelHeight() - max2));
        try {
            this.R0 = N2().getCacheDir().toString() + "/profile_image.png";
            createBitmap2.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(this.R0));
        } catch (FileNotFoundException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        String string = M2().getString("EXTRA_KEY_REFERER");
        jo.p.e(string);
        this.Q0 = string;
        jo.p.e(M2().getString("EXTRA_SHARE_TEXT"));
        jo.p.e(M2().getString("EXTRA_USER_ID"));
        String string2 = M2().getString("EXTRA_USER_NAME");
        jo.p.e(string2);
        boolean z10 = M2().getBoolean("EXTRA_IS_STREAMING");
        Serializable serializable = M2().getSerializable("SCREENSHOT");
        jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.unity.UnityScreenshot");
        W3((UnityScreenshot) serializable);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        ae.o0 T = ae.o0.T(Q2());
        jo.p.g(T, "bind(requireView())");
        V3(T);
        uo.l.d(this, null, null, new C0120b(null), 3, null);
        uo.l.d(this, null, null, new c(null), 3, null);
        AppCompatButton appCompatButton = M3().C;
        jo.p.g(appCompatButton, "binding.finishShutterButton");
        yd.g1.a(appCompatButton, new d(string2, z10));
        M3().G.setOnClickListener(new View.OnClickListener() { // from class: be.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b.U3(b.this, view2);
            }
        });
        Bitmap decodeFile = BitmapFactory.decodeFile(this.R0);
        jo.p.g(decodeFile, "decodeFile(profileImagePath)");
        AppCompatImageView appCompatImageView = M3().D;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        td.a.y(appCompatImageView, decodeFile);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), 16973913);
        w3(false);
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.P0 = context instanceof be.c ? (be.c) context : null;
    }
}
