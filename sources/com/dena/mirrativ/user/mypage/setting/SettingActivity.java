package com.dena.mirrativ.user.mypage.setting;

import ae.w;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrativ.user.common.ProfileUserListActivity;
import com.dena.mirrativ.user.mypage.setting.SettingActivity;
import com.dena.mirrorman.activity.MainActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.Social;
import com.dena.mirrorman.net.retrofit.MRRequest;
import gf.c0;
import hf.m0;
import hf.o0;
import hf.v0;
import ie.f;
import java.util.ArrayList;
import java.util.List;
import jo.f0;
import kf.x;
import kq.a;
import ld.g0;
import ld.h0;
import nd.i1;
import p.d;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class SettingActivity extends e.b implements CompoundButton.OnCheckedChangeListener, f.b, q0 {

    /* renamed from: g0  reason: collision with root package name */
    public static final a f24773g0 = new a(null);

    /* renamed from: h0  reason: collision with root package name */
    public static final int f24774h0 = 8;
    public final /* synthetic */ q0 O = r0.b();
    public final wn.f P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final wn.f W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f24775a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f24776b0;

    /* renamed from: c0  reason: collision with root package name */
    public w f24777c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f24778d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f24779e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f24780f0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context) {
            jo.p.h(context, "context");
            return new Intent(context, SettingActivity.class);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingActivity$doLogout$1", f = "SettingActivity.kt", l = {407, 412}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24781w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f24782x;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f24782x = obj;
            return bVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            q0 q0Var;
            Object postUserLogout;
            q0 q0Var2;
            Intent a10;
            Object c10 = bo.c.c();
            int i10 = this.f24781w;
            boolean z10 = true;
            try {
            } catch (Throwable th2) {
                try {
                    MRError error = MRErrorKt.convertMRException(th2).getError();
                    if (!(error instanceof MRError.Maintenance)) {
                        z10 = jo.p.c(error, MRError.ForceUpdate.INSTANCE);
                    }
                    if (z10) {
                        of.n.f45411a.l(SettingActivity.this, error);
                    } else {
                        of.n nVar = of.n.f45411a;
                        SettingActivity settingActivity = SettingActivity.this;
                        String message = error.getMessage();
                        if (message == null) {
                            message = SettingActivity.this.getString(nc.i.f41875e);
                            jo.p.g(message, "getString(R.string.error_access)");
                        }
                        nVar.B(settingActivity, message, false);
                    }
                } catch (Throwable th3) {
                    SettingActivity.this.e4();
                    throw th3;
                }
            }
            if (i10 == 0) {
                wn.m.b(obj);
                q0Var = (q0) this.f24782x;
                MRRequest m42 = SettingActivity.this.m4();
                this.f24782x = q0Var;
                this.f24781w = 1;
                postUserLogout = m42.postUserLogout(Referer.SETTINGS, this);
                if (postUserLogout == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    q0Var2 = (q0) this.f24782x;
                    wn.m.b(obj);
                    String T4 = SettingActivity.this.t4().T4();
                    String simpleName = q0Var2.getClass().getSimpleName();
                    jo.p.g(simpleName, "javaClass.simpleName");
                    g9.a.j(T4, Referer.SETTINGS, simpleName, "");
                    SettingActivity settingActivity2 = SettingActivity.this;
                    a10 = MainActivity.f25195m0.a(settingActivity2, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? 0L : 0L, (r17 & 8) != 0 ? 0 : 0, (r17 & 16) != 0 ? false : false, (r17 & 32) == 0 ? MainActivity.a.EnumC0218a.MyPage : null, (r17 & 64) == 0 ? false : false);
                    a10.addFlags(268468224);
                    settingActivity2.startActivity(a10);
                    SettingActivity.this.finish();
                    SettingActivity.this.e4();
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                q0Var = (q0) this.f24782x;
                wn.m.b(obj);
                postUserLogout = obj;
            }
            StatusResponse statusResponse = (StatusResponse) postUserLogout;
            SettingActivity.this.i4().k();
            SettingActivity.this.s4().q();
            SettingActivity.this.r4().k();
            of.r l42 = SettingActivity.this.l4();
            SettingActivity settingActivity3 = SettingActivity.this;
            this.f24782x = q0Var;
            this.f24781w = 2;
            if (l42.e(settingActivity3, Referer.SETTINGS, this) == c10) {
                return c10;
            }
            q0Var2 = q0Var;
            String T42 = SettingActivity.this.t4().T4();
            String simpleName2 = q0Var2.getClass().getSimpleName();
            jo.p.g(simpleName2, "javaClass.simpleName");
            g9.a.j(T42, Referer.SETTINGS, simpleName2, "");
            SettingActivity settingActivity22 = SettingActivity.this;
            a10 = MainActivity.f25195m0.a(settingActivity22, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? 0L : 0L, (r17 & 8) != 0 ? 0 : 0, (r17 & 16) != 0 ? false : false, (r17 & 32) == 0 ? MainActivity.a.EnumC0218a.MyPage : null, (r17 & 64) == 0 ? false : false);
            a10.addFlags(268468224);
            settingActivity22.startActivity(a10);
            SettingActivity.this.finish();
            SettingActivity.this.e4();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingActivity$observeStoreValues$1", f = "SettingActivity.kt", l = {646}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24784w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24785x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24786y;

        /* renamed from: z  reason: collision with root package name */
        public int f24787z;

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
                int r1 = r8.f24787z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f24786y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f24785x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f24784w
                com.dena.mirrativ.user.mypage.setting.SettingActivity r4 = (com.dena.mirrativ.user.mypage.setting.SettingActivity) r4
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
                com.dena.mirrativ.user.mypage.setting.SettingActivity r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this
                ld.i1 r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.U3(r9)
                wo.x r3 = r9.x()
                com.dena.mirrativ.user.mypage.setting.SettingActivity r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f24784w = r4     // Catch: java.lang.Throwable -> L74
                r9.f24785x = r3     // Catch: java.lang.Throwable -> L74
                r9.f24786y = r1     // Catch: java.lang.Throwable -> L74
                r9.f24787z = r2     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.user.mypage.setting.SettingActivity.Q3(r5)     // Catch: java.lang.Throwable -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.setting.SettingActivity.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingActivity$observeStoreValues$2", f = "SettingActivity.kt", l = {646}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24788w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24789x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24790y;

        /* renamed from: z  reason: collision with root package name */
        public int f24791z;

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
                int r1 = r8.f24791z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f24790y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f24789x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f24788w
                com.dena.mirrativ.user.mypage.setting.SettingActivity r4 = (com.dena.mirrativ.user.mypage.setting.SettingActivity) r4
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
                com.dena.mirrativ.user.mypage.setting.SettingActivity r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this
                ld.i1 r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.U3(r9)
                wo.x r3 = r9.y()
                com.dena.mirrativ.user.mypage.setting.SettingActivity r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f24788w = r4     // Catch: java.lang.Throwable -> L74
                r9.f24789x = r3     // Catch: java.lang.Throwable -> L74
                r9.f24790y = r1     // Catch: java.lang.Throwable -> L74
                r9.f24791z = r2     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.user.mypage.setting.SettingActivity.Q3(r5)     // Catch: java.lang.Throwable -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.setting.SettingActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingActivity$observeStoreValues$3", f = "SettingActivity.kt", l = {646}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24792w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24793x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24794y;

        /* renamed from: z  reason: collision with root package name */
        public int f24795z;

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
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x009f, TryCatch #2 {all -> 0x009f, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:29:0x008d, B:25:0x0076, B:27:0x007e, B:28:0x0089, B:22:0x0068), top: B:44:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
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
                int r1 = r9.f24795z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f24794y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f24793x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f24792w
                com.dena.mirrativ.user.mypage.setting.SettingActivity r4 = (com.dena.mirrativ.user.mypage.setting.SettingActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> La2
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
                com.dena.mirrativ.user.mypage.setting.SettingActivity r10 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this
                ld.i1 r10 = com.dena.mirrativ.user.mypage.setting.SettingActivity.U3(r10)
                wo.x r3 = r10.q()
                com.dena.mirrativ.user.mypage.setting.SettingActivity r10 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La2
                r4 = r10
                r10 = r9
            L3d:
                r10.f24792w = r4     // Catch: java.lang.Throwable -> La2
                r10.f24793x = r3     // Catch: java.lang.Throwable -> La2
                r10.f24794y = r1     // Catch: java.lang.Throwable -> La2
                r10.f24795z = r2     // Catch: java.lang.Throwable -> La2
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> La2
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9f
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9f
                if (r10 == 0) goto L99
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L9f
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> L9f
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> L9f
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> L9f
                boolean r6 = jo.p.c(r10, r6)     // Catch: java.lang.Throwable -> L9f
            L6e:
                if (r6 == 0) goto L76
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> L9f
                r6.l(r5, r10)     // Catch: java.lang.Throwable -> L9f
                goto L8d
            L76:
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> L9f
                java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L9f
                if (r10 != 0) goto L89
                int r10 = nc.i.f41875e     // Catch: java.lang.Throwable -> L9f
                java.lang.String r10 = r5.getString(r10)     // Catch: java.lang.Throwable -> L9f
                java.lang.String r7 = "getString(R.string.error_access)"
                jo.p.g(r10, r7)     // Catch: java.lang.Throwable -> L9f
            L89:
                r7 = 0
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> L9f
            L8d:
                com.dena.mirrativ.user.mypage.setting.SettingActivity.Z3(r5)     // Catch: java.lang.Throwable -> L9f
                com.dena.mirrativ.user.mypage.setting.SettingActivity.Q3(r5)     // Catch: java.lang.Throwable -> L9f
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L99:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L9f:
                r10 = move-exception
                r3 = r4
                goto La3
            La2:
                r10 = move-exception
            La3:
                throw r10     // Catch: java.lang.Throwable -> La4
            La4:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.setting.SettingActivity.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<ld.t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24796w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24797x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24798y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24796w = componentCallbacks;
            this.f24797x = aVar;
            this.f24798y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ld.t] */
        @Override // io.a
        public final ld.t invoke() {
            ComponentCallbacks componentCallbacks = this.f24796w;
            return gq.a.a(componentCallbacks).c(f0.b(ld.t.class), this.f24797x, this.f24798y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24799w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24800x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24801y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24799w = componentCallbacks;
            this.f24800x = aVar;
            this.f24801y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f24799w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f24800x, this.f24801y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24802w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24803x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24804y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24802w = componentCallbacks;
            this.f24803x = aVar;
            this.f24804y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            ComponentCallbacks componentCallbacks = this.f24802w;
            return gq.a.a(componentCallbacks).c(f0.b(od.p.class), this.f24803x, this.f24804y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24805w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24806x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24807y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24805w = componentCallbacks;
            this.f24806x = aVar;
            this.f24807y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f24805w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f24806x, this.f24807y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24808w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24809x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24810y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24808w = componentCallbacks;
            this.f24809x = aVar;
            this.f24810y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f24808w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f24809x, this.f24810y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<o0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24811w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24812x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24813y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24811w = componentCallbacks;
            this.f24812x = aVar;
            this.f24813y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.o0, java.lang.Object] */
        @Override // io.a
        public final o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24811w;
            return gq.a.a(componentCallbacks).c(f0.b(o0.class), this.f24812x, this.f24813y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24814w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24815x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24816y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24814w = componentCallbacks;
            this.f24815x = aVar;
            this.f24816y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24814w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f24815x, this.f24816y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<of.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24817w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24818x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24819y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24817w = componentCallbacks;
            this.f24818x = aVar;
            this.f24819y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.r, java.lang.Object] */
        @Override // io.a
        public final of.r invoke() {
            ComponentCallbacks componentCallbacks = this.f24817w;
            return gq.a.a(componentCallbacks).c(f0.b(of.r.class), this.f24818x, this.f24819y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<m0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24820w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24821x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24822y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24820w = componentCallbacks;
            this.f24821x = aVar;
            this.f24822y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hf.m0] */
        @Override // io.a
        public final m0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24820w;
            return gq.a.a(componentCallbacks).c(f0.b(m0.class), this.f24821x, this.f24822y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<kf.t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24823w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24824x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24825y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24823w = componentCallbacks;
            this.f24824x = aVar;
            this.f24825y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final kf.t invoke() {
            ComponentCallbacks componentCallbacks = this.f24823w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.t.class), this.f24824x, this.f24825y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24826w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24827x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24828y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24826w = componentCallbacks;
            this.f24827x = aVar;
            this.f24828y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f24826w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f24827x, this.f24828y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<kf.i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24829w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24830x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24831y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24829w = componentCallbacks;
            this.f24830x = aVar;
            this.f24831y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.i, java.lang.Object] */
        @Override // io.a
        public final kf.i invoke() {
            ComponentCallbacks componentCallbacks = this.f24829w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.i.class), this.f24830x, this.f24831y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24832w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentActivity componentActivity) {
            super(0);
            this.f24832w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f24832w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24833w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24834x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24835y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24836z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24833w = aVar;
            this.f24834x = aVar2;
            this.f24835y = aVar3;
            this.f24836z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24833w;
            vq.a aVar2 = this.f24834x;
            io.a aVar3 = this.f24835y;
            xq.a aVar4 = this.f24836z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(ld.i1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24837w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentActivity componentActivity) {
            super(0);
            this.f24837w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f24837w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingActivity$twitter$1", f = "SettingActivity.kt", l = {311}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24838w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f24840y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, ao.d<? super u> dVar) {
            super(2, dVar);
            this.f24840y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u(this.f24840y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24838w;
            if (i10 == 0) {
                wn.m.b(obj);
                SettingActivity.this.Q4();
                o0 r42 = SettingActivity.this.r4();
                SettingActivity settingActivity = SettingActivity.this;
                FragmentManager a32 = settingActivity.a3();
                jo.p.g(a32, "supportFragmentManager");
                String str = this.f24840y;
                this.f24838w = 1;
                obj = r42.j(settingActivity, a32, str, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            wn.p pVar = (wn.p) obj;
            o0.b bVar = (o0.b) pVar.a();
            Social.SocialAccount socialAccount = (Social.SocialAccount) pVar.b();
            in.x xVar = (in.x) pVar.c();
            SettingActivity.this.e4();
            if (bVar == o0.b.Success) {
                jo.p.e(socialAccount);
                Integer isFollowOfficialTwitter = socialAccount.isFollowOfficialTwitter();
                if (isFollowOfficialTwitter != null && isFollowOfficialTwitter.intValue() == 0) {
                    c0.a aVar = c0.Q0;
                    String str2 = this.f24840y;
                    jo.p.e(xVar);
                    String c11 = xVar.c();
                    jo.p.g(c11, "twitterSession!!.userName");
                    aVar.a(str2, c11).z3(SettingActivity.this.a3(), "FollowOfficialTwitterAccountDialog");
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingActivity$yesCustomYesNoDialog$3", f = "SettingActivity.kt", l = {607, 609, 610}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24841w;

        public v(ao.d<? super v> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f24841w
                r2 = 3
                r3 = 2
                r4 = 0
                java.lang.String r5 = "settings"
                r6 = 1
                if (r1 == 0) goto L2a
                if (r1 == r6) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L28
                goto L6f
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L28
                goto L5e
            L24:
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L28
                goto L3c
            L28:
                r9 = move-exception
                goto L75
            L2a:
                wn.m.b(r9)
                com.dena.mirrativ.user.mypage.setting.SettingActivity r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this     // Catch: java.lang.Throwable -> L28
                com.dena.mirrorman.net.retrofit.MRRequest r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.T3(r9)     // Catch: java.lang.Throwable -> L28
                r8.f24841w = r6     // Catch: java.lang.Throwable -> L28
                java.lang.Object r9 = r9.twitterDisconnectRequest(r5, r8)     // Catch: java.lang.Throwable -> L28
                if (r9 != r0) goto L3c
                return r0
            L3c:
                com.dena.mirrativ.mirrativapi.core.StatusResponse r9 = (com.dena.mirrativ.mirrativapi.core.StatusResponse) r9     // Catch: java.lang.Throwable -> L28
                com.dena.mirrativ.user.mypage.setting.SettingActivity r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this     // Catch: java.lang.Throwable -> L28
                hf.o0 r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.V3(r9)     // Catch: java.lang.Throwable -> L28
                r9.k()     // Catch: java.lang.Throwable -> L28
                com.dena.mirrativ.user.mypage.setting.SettingActivity r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this     // Catch: java.lang.Throwable -> L28
                com.dena.mirrorman.net.retrofit.MRRequest r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.T3(r9)     // Catch: java.lang.Throwable -> L28
                java.lang.Integer r1 = co.b.d(r4)     // Catch: java.lang.Throwable -> L28
                java.lang.Integer r7 = co.b.d(r4)     // Catch: java.lang.Throwable -> L28
                r8.f24841w = r3     // Catch: java.lang.Throwable -> L28
                java.lang.Object r9 = r9.postUserBroadcastSettings(r5, r1, r7, r8)     // Catch: java.lang.Throwable -> L28
                if (r9 != r0) goto L5e
                return r0
            L5e:
                com.dena.mirrativ.user.mypage.setting.SettingActivity r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this     // Catch: java.lang.Throwable -> L28
                of.r r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.S3(r9)     // Catch: java.lang.Throwable -> L28
                com.dena.mirrativ.user.mypage.setting.SettingActivity r1 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this     // Catch: java.lang.Throwable -> L28
                r8.f24841w = r2     // Catch: java.lang.Throwable -> L28
                java.lang.Object r9 = r9.e(r1, r5, r8)     // Catch: java.lang.Throwable -> L28
                if (r9 != r0) goto L6f
                return r0
            L6f:
                com.dena.mirrativ.user.mypage.setting.SettingActivity r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this
                com.dena.mirrativ.user.mypage.setting.SettingActivity.Q3(r9)
                goto Lad
            L75:
                com.dena.mirrativ.mirrativapi.core.MRException r9 = com.dena.mirrativ.mirrativapi.core.MRErrorKt.convertMRException(r9)     // Catch: java.lang.Throwable -> Lb0
                com.dena.mirrativ.mirrativapi.core.MRError r9 = r9.getError()     // Catch: java.lang.Throwable -> Lb0
                boolean r0 = r9 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Maintenance     // Catch: java.lang.Throwable -> Lb0
                if (r0 == 0) goto L82
                goto L88
            L82:
                com.dena.mirrativ.mirrativapi.core.MRError$ForceUpdate r0 = com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate.INSTANCE     // Catch: java.lang.Throwable -> Lb0
                boolean r6 = jo.p.c(r9, r0)     // Catch: java.lang.Throwable -> Lb0
            L88:
                if (r6 == 0) goto L92
                of.n r0 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb0
                com.dena.mirrativ.user.mypage.setting.SettingActivity r1 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this     // Catch: java.lang.Throwable -> Lb0
                r0.l(r1, r9)     // Catch: java.lang.Throwable -> Lb0
                goto L6f
            L92:
                of.n r0 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb0
                com.dena.mirrativ.user.mypage.setting.SettingActivity r1 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this     // Catch: java.lang.Throwable -> Lb0
                java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> Lb0
                if (r9 != 0) goto La9
                com.dena.mirrativ.user.mypage.setting.SettingActivity r9 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this     // Catch: java.lang.Throwable -> Lb0
                int r2 = nc.i.f41875e     // Catch: java.lang.Throwable -> Lb0
                java.lang.String r9 = r9.getString(r2)     // Catch: java.lang.Throwable -> Lb0
                java.lang.String r2 = "getString(R.string.error_access)"
                jo.p.g(r9, r2)     // Catch: java.lang.Throwable -> Lb0
            La9:
                r0.B(r1, r9, r4)     // Catch: java.lang.Throwable -> Lb0
                goto L6f
            Lad:
                wn.v r9 = wn.v.f59242a
                return r9
            Lb0:
                r9 = move-exception
                com.dena.mirrativ.user.mypage.setting.SettingActivity r0 = com.dena.mirrativ.user.mypage.setting.SettingActivity.this
                com.dena.mirrativ.user.mypage.setting.SettingActivity.Q3(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.setting.SettingActivity.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SettingActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P = wn.g.b(iVar, new i(this, null, null));
        this.Q = wn.g.b(iVar, new j(this, null, null));
        this.R = wn.g.b(iVar, new k(this, null, null));
        this.S = wn.g.b(iVar, new l(this, null, null));
        this.T = wn.g.b(iVar, new m(this, null, null));
        this.U = wn.g.b(iVar, new n(this, null, null));
        this.V = wn.g.b(iVar, new o(this, null, null));
        this.W = wn.g.b(iVar, new p(this, null, null));
        this.X = wn.g.b(iVar, new q(this, null, null));
        this.Y = wn.g.b(iVar, new f(this, null, null));
        this.Z = new s0(f0.b(ld.i1.class), new t(this), new s(new r(this), null, null, gq.a.a(this)));
        this.f24775a0 = wn.g.b(iVar, new g(this, null, null));
        this.f24776b0 = wn.g.b(iVar, new h(this, null, null));
        this.f24778d0 = true;
    }

    public static final void A4(SettingActivity settingActivity, wn.v vVar) {
        jo.p.h(settingActivity, "this$0");
        if (vVar == null) {
            return;
        }
        settingActivity.V4();
    }

    public static final void C4(SettingActivity settingActivity, CharSequence[] charSequenceArr, DialogInterface dialogInterface, int i10) {
        jo.p.h(settingActivity, "this$0");
        jo.p.h(charSequenceArr, "$choiceList");
        settingActivity.k4().p(settingActivity, charSequenceArr, i10);
        dialogInterface.dismiss();
    }

    public static final void D4(SettingActivity settingActivity, DialogInterface dialogInterface) {
        jo.p.h(settingActivity, "this$0");
        w wVar = settingActivity.f24777c0;
        if (wVar == null) {
            jo.p.v("binding");
            wVar = null;
        }
        wVar.U.setText(settingActivity.k4().g(settingActivity));
    }

    public static final void E4(SettingActivity settingActivity, View view) {
        jo.p.h(settingActivity, "this$0");
        settingActivity.R4();
    }

    public static final void F4(SettingActivity settingActivity, View view) {
        jo.p.h(settingActivity, "this$0");
        settingActivity.w4();
    }

    public static final void G4(SettingActivity settingActivity, View view) {
        jo.p.h(settingActivity, "this$0");
        settingActivity.Y4();
    }

    public static final void H4(SettingActivity settingActivity, View view) {
        jo.p.h(settingActivity, "this$0");
        settingActivity.B4();
    }

    public static final void I4(SettingActivity settingActivity, View view) {
        jo.p.h(settingActivity, "this$0");
        settingActivity.N4();
    }

    public static final void J4(SettingActivity settingActivity, View view) {
        jo.p.h(settingActivity, "this$0");
        settingActivity.P4();
    }

    public static final void K4(SettingActivity settingActivity, View view) {
        jo.p.h(settingActivity, "this$0");
        settingActivity.O4();
    }

    public static final void L4(SettingActivity settingActivity, View view) {
        jo.p.h(settingActivity, "this$0");
        settingActivity.g4();
    }

    public static final void M4(SettingActivity settingActivity) {
        jo.p.h(settingActivity, "this$0");
        if (settingActivity.isFinishing()) {
            return;
        }
        settingActivity.e4();
        settingActivity.V4();
    }

    public static final void W4(SettingActivity settingActivity, View view) {
        jo.p.h(settingActivity, "this$0");
        if (!settingActivity.q4().a().h()) {
            of.n.A(settingActivity, nc.i.error_quality_setting, false);
        } else if (settingActivity.t4().a1()) {
            f.a aVar = ie.f.V0;
            String string = settingActivity.getString(nc.i.text_dialog_pass_code_reset);
            jo.p.g(string, "getString(R.string.text_dialog_pass_code_reset)");
            f.a.b(aVar, string, settingActivity.getString(nc.i.text_btn_pass_code_reset), settingActivity.getString(nc.i.B), null, false, 24, null).z3(settingActivity.a3(), "DIALOG_TAG_CODE_RESET");
        } else {
            ld.r.S0.a().z3(settingActivity.a3(), "HandoverCodeDialog");
        }
    }

    public static final void X4(SettingActivity settingActivity, View view) {
        jo.p.h(settingActivity, "this$0");
        settingActivity.w4();
    }

    public static final void b4(SettingActivity settingActivity, DialogInterface dialogInterface, int i10) {
        jo.p.h(settingActivity, "this$0");
        settingActivity.f4();
    }

    public static final void c4(DialogInterface dialogInterface, int i10) {
    }

    public static final void v4(SettingActivity settingActivity, View view) {
        jo.p.h(settingActivity, "this$0");
        settingActivity.finish();
    }

    public static final void x4(SettingActivity settingActivity, DialogInterface dialogInterface, int i10) {
        jo.p.h(settingActivity, "this$0");
        if (settingActivity.s4().m()) {
            settingActivity.f4();
        } else {
            settingActivity.a4();
        }
    }

    public static final void y4(DialogInterface dialogInterface, int i10) {
    }

    public final void B4() {
        if (!q4().a().h()) {
            of.n.A(this, nc.i.error_quality_setting, false);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, nc.j.f41902e);
        builder.setTitle(nc.i.text_quality_setting);
        String string = getString(nc.i.f41873c3);
        jo.p.g(string, "getString(R.string.text_high_quality_mode)");
        String string2 = getString(nc.i.A4);
        jo.p.g(string2, "getString(R.string.text_normal_quality_mode)");
        String string3 = getString(nc.i.f41899z3);
        jo.p.g(string3, "getString(R.string.text_low_quality_mode)");
        final CharSequence[] charSequenceArr = {string, string2, string3};
        builder.setSingleChoiceItems(charSequenceArr, k4().f(this, charSequenceArr), new DialogInterface.OnClickListener() { // from class: ld.f0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SettingActivity.C4(SettingActivity.this, charSequenceArr, dialogInterface, i10);
            }
        });
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        create.show();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ld.i0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SettingActivity.D4(SettingActivity.this, dialogInterface);
            }
        });
    }

    public final void N4() {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW_DOWNLOADS");
            startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            g9.a.c(e10);
        }
    }

    public final void O4() {
        String a10 = new ld.s().a(s4().x(), t4().t4());
        p.d a11 = new d.a().a();
        jo.p.g(a11, "builder.build()");
        a11.a(this, Uri.parse(a10));
    }

    public final void P4() {
        v0 s42 = s4();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (v0.c(s42, a32, "settingsfollowing", false, 4, null)) {
            startActivity(ProfileUserListActivity.f24079g0.b(this, s4().x(), 4));
        }
    }

    public final void Q4() {
        List<Fragment> p02 = a3().p0();
        jo.p.g(p02, "supportFragmentManager.fragments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : p02) {
            if (obj instanceof sd.b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            sd.b.O0.a(false).z3(a3(), "ProgressDialogFragment");
        }
    }

    public final void R4() {
        if (s4().p()) {
            this.f24780f0 = false;
            d4();
            return;
        }
        this.f24780f0 = true;
        v0 s42 = s4();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (v0.c(s42, a32, "settings.link_twitter", false, 4, null)) {
            uo.l.d(this, null, null, new u("settings.link_twitter", null), 3, null);
        }
    }

    public final void S4() {
        w wVar = this.f24777c0;
        w wVar2 = null;
        if (wVar == null) {
            jo.p.v("binding");
            wVar = null;
        }
        wVar.D.setVisibility(0);
        w wVar3 = this.f24777c0;
        if (wVar3 == null) {
            jo.p.v("binding");
            wVar3 = null;
        }
        wVar3.E.setVisibility(0);
        w wVar4 = this.f24777c0;
        if (wVar4 == null) {
            jo.p.v("binding");
            wVar4 = null;
        }
        wVar4.F.setVisibility(0);
        w wVar5 = this.f24777c0;
        if (wVar5 == null) {
            jo.p.v("binding");
            wVar5 = null;
        }
        wVar5.G.setVisibility(0);
        w wVar6 = this.f24777c0;
        if (wVar6 == null) {
            jo.p.v("binding");
            wVar6 = null;
        }
        wVar6.Q.setVisibility(0);
        if (of.n.f45411a.o(this)) {
            w wVar7 = this.f24777c0;
            if (wVar7 == null) {
                jo.p.v("binding");
            } else {
                wVar2 = wVar7;
            }
            wVar2.R.setVisibility(0);
            return;
        }
        w wVar8 = this.f24777c0;
        if (wVar8 == null) {
            jo.p.v("binding");
        } else {
            wVar2 = wVar8;
        }
        wVar2.R.setVisibility(8);
    }

    public final void T4(boolean z10) {
        Q4();
        n4().r(z10);
    }

    public final void U4(boolean z10) {
        Q4();
        n4().s(z10);
    }

    public final void V4() {
        int i10;
        w wVar = null;
        if (s4().p()) {
            w wVar2 = this.f24777c0;
            if (wVar2 == null) {
                jo.p.v("binding");
                wVar2 = null;
            }
            wVar2.Z.setText(t4().W4());
            w wVar3 = this.f24777c0;
            if (wVar3 == null) {
                jo.p.v("binding");
                wVar3 = null;
            }
            wVar3.Z.setVisibility(0);
            w wVar4 = this.f24777c0;
            if (wVar4 == null) {
                jo.p.v("binding");
                wVar4 = null;
            }
            wVar4.H.setVisibility(0);
            w wVar5 = this.f24777c0;
            if (wVar5 == null) {
                jo.p.v("binding");
                wVar5 = null;
            }
            wVar5.O.setVisibility(8);
        } else {
            w wVar6 = this.f24777c0;
            if (wVar6 == null) {
                jo.p.v("binding");
                wVar6 = null;
            }
            wVar6.Z.setVisibility(8);
            w wVar7 = this.f24777c0;
            if (wVar7 == null) {
                jo.p.v("binding");
                wVar7 = null;
            }
            wVar7.H.setVisibility(8);
            w wVar8 = this.f24777c0;
            if (wVar8 == null) {
                jo.p.v("binding");
                wVar8 = null;
            }
            wVar8.O.setVisibility(0);
        }
        S4();
        w wVar9 = this.f24777c0;
        if (wVar9 == null) {
            jo.p.v("binding");
            wVar9 = null;
        }
        wVar9.U.setText(k4().g(this));
        w wVar10 = this.f24777c0;
        if (wVar10 == null) {
            jo.p.v("binding");
            wVar10 = null;
        }
        wVar10.W.setChecked(t4().S());
        w wVar11 = this.f24777c0;
        if (wVar11 == null) {
            jo.p.v("binding");
            wVar11 = null;
        }
        wVar11.J.setChecked(k4().c());
        w wVar12 = this.f24777c0;
        if (wVar12 == null) {
            jo.p.v("binding");
            wVar12 = null;
        }
        wVar12.V.setChecked(t4().H0());
        if (h4().j5()) {
            w wVar13 = this.f24777c0;
            if (wVar13 == null) {
                jo.p.v("binding");
                wVar13 = null;
            }
            wVar13.M.setVisibility(0);
            w wVar14 = this.f24777c0;
            if (wVar14 == null) {
                jo.p.v("binding");
                wVar14 = null;
            }
            wVar14.N.setOnClickListener(new View.OnClickListener() { // from class: ld.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingActivity.W4(SettingActivity.this, view);
                }
            });
            if (t4().a1()) {
                i10 = nc.i.text_pass_code_configured_label;
            } else {
                i10 = nc.i.text_btn_pass_code;
            }
            w wVar15 = this.f24777c0;
            if (wVar15 == null) {
                jo.p.v("binding");
                wVar15 = null;
            }
            wVar15.N.setText(getString(i10));
        } else {
            w wVar16 = this.f24777c0;
            if (wVar16 == null) {
                jo.p.v("binding");
                wVar16 = null;
            }
            wVar16.M.setVisibility(8);
        }
        w wVar17 = this.f24777c0;
        if (wVar17 == null) {
            jo.p.v("binding");
        } else {
            wVar = wVar17;
        }
        wVar.P.setOnClickListener(new View.OnClickListener() { // from class: ld.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.X4(SettingActivity.this, view);
            }
        });
    }

    public final void Y4() {
        if (q4().a().d()) {
            of.n.A(this, nc.i.text_user_withdraw_error_streaming, false);
        } else if (s4().m()) {
            of.n.A(this, nc.i.text_user_withdraw_error_disconnect_twitter, false);
        } else {
            startActivity(UserWithdrawActivity.T.a(this));
        }
    }

    public final void a4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(nc.i.text_logout_warning);
        builder.setCancelable(false);
        builder.setPositiveButton(nc.i.E4, new DialogInterface.OnClickListener() { // from class: ld.u
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SettingActivity.b4(SettingActivity.this, dialogInterface, i10);
            }
        });
        builder.setNegativeButton(nc.i.B, h0.f40001w);
        builder.create().show();
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        switch (str.hashCode()) {
            case -1426845844:
                if (str.equals("DIALOG_TAG_DISCONNECT_TWITTER")) {
                    Q4();
                    uo.l.d(this, null, null, new v(null), 3, null);
                    return;
                }
                return;
            case -384429394:
                if (str.equals("TAG_REQUEST_TO_ENABLE_OS_NOTIFICATION_DIALOG")) {
                    MRLogger j42 = j4();
                    MRLog.Companion companion = MRLog.Companion;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_URGE_DEVICE_PUSH_SETTING);
                    builder.setTargetId(MRLog.PAYLOAD_KEY_SETTING);
                    j42.sendLog(builder.build());
                    i4().y(Referer.SETTINGS);
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
                    startActivity(intent);
                    finish();
                    return;
                }
                return;
            case 97062425:
                if (!str.equals("DIALOG_TAG_CODE_RESET")) {
                    return;
                }
                break;
            case 690746998:
                if (str.equals("TAG_REQUEST_TO_ENABLE_LIVE_NOTIFICATION_DIALOG")) {
                    MRLogger j43 = j4();
                    MRLog.Companion companion2 = MRLog.Companion;
                    MRLog.Builder builder2 = new MRLog.Builder(MRLog.ACTION_TYPE_URGE_APP_PUSH_SETTING);
                    builder2.setTargetId("on");
                    j43.sendLog(builder2.build());
                    i4().y(Referer.SETTINGS);
                    finish();
                    return;
                }
                return;
            case 1275667071:
                if (!str.equals("DIALOG_TAG_HANDOVER")) {
                    return;
                }
                break;
            case 1616842054:
                if (str.equals("DIALOG_TAG_LOGOUT")) {
                    f4();
                    return;
                }
                return;
            default:
                return;
        }
        ld.r.S0.a().z3(a3(), "HandoverCodeDialog");
    }

    @Override // ie.f.b
    public void c(String str) {
        f.b.a.a(this, str);
    }

    public final void d4() {
        f.a aVar = ie.f.V0;
        String string = getString(nc.i.text_confirmation_cancel_cooperation);
        jo.p.g(string, "getString(R.string.text_…ation_cancel_cooperation)");
        f.a.b(aVar, string, getString(nc.i.E4), getString(nc.i.B), null, false, 24, null).z3(a3(), "DIALOG_TAG_DISCONNECT_TWITTER");
    }

    public final void e4() {
        List<Fragment> p02 = a3().p0();
        jo.p.g(p02, "supportFragmentManager.fragments");
        ArrayList<sd.b> arrayList = new ArrayList();
        for (Object obj : p02) {
            if (obj instanceof sd.b) {
                arrayList.add(obj);
            }
        }
        for (sd.b bVar : arrayList) {
            bVar.n3();
        }
    }

    public final void f4() {
        Q4();
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    public final void g4() {
        o4().i0(true);
        of.n.A(this, nc.i.text_emomo_cache_clear_message, true);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final kf.i h4() {
        return (kf.i) this.X.getValue();
    }

    public final od.p i4() {
        return (od.p) this.f24776b0.getValue();
    }

    public final MRLogger j4() {
        return (MRLogger) this.f24775a0.getValue();
    }

    public final m0 k4() {
        return (m0) this.U.getValue();
    }

    public final of.r l4() {
        return (of.r) this.T.getValue();
    }

    public final MRRequest m4() {
        return (MRRequest) this.P.getValue();
    }

    public final ld.t n4() {
        return (ld.t) this.Y.getValue();
    }

    public final kf.t o4() {
        return (kf.t) this.V.getValue();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f24779e0 = true;
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        jo.p.h(compoundButton, "buttonView");
        if (isFinishing()) {
            return;
        }
        int id2 = compoundButton.getId();
        if (id2 == nc.e.f41825h6) {
            if (t4().H0() != z10) {
                T4(z10);
            }
        } else if (id2 == nc.e.f41829i6) {
            if (t4().S() != z10) {
                U4(z10);
            }
        } else if (id2 == nc.e.R1) {
            o4().k2(z10);
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, nc.f.f41863p);
        jo.p.g(g10, "setContentView(this, R.layout.activity_setting)");
        w wVar = (w) g10;
        this.f24777c0 = wVar;
        w wVar2 = null;
        if (wVar == null) {
            jo.p.v("binding");
            wVar = null;
        }
        wVar.Y.setOnClickListener(new View.OnClickListener() { // from class: ld.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.E4(SettingActivity.this, view);
            }
        });
        w wVar3 = this.f24777c0;
        if (wVar3 == null) {
            jo.p.v("binding");
            wVar3 = null;
        }
        wVar3.P.setOnClickListener(new View.OnClickListener() { // from class: ld.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.F4(SettingActivity.this, view);
            }
        });
        w wVar4 = this.f24777c0;
        if (wVar4 == null) {
            jo.p.v("binding");
            wVar4 = null;
        }
        wVar4.f1506a0.setOnClickListener(new View.OnClickListener() { // from class: ld.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.G4(SettingActivity.this, view);
            }
        });
        w wVar5 = this.f24777c0;
        if (wVar5 == null) {
            jo.p.v("binding");
            wVar5 = null;
        }
        wVar5.T.setOnClickListener(new View.OnClickListener() { // from class: ld.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.H4(SettingActivity.this, view);
            }
        });
        w wVar6 = this.f24777c0;
        if (wVar6 == null) {
            jo.p.v("binding");
            wVar6 = null;
        }
        wVar6.Q.setOnClickListener(new View.OnClickListener() { // from class: ld.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.I4(SettingActivity.this, view);
            }
        });
        w wVar7 = this.f24777c0;
        if (wVar7 == null) {
            jo.p.v("binding");
            wVar7 = null;
        }
        wVar7.C.setOnClickListener(new View.OnClickListener() { // from class: ld.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.J4(SettingActivity.this, view);
            }
        });
        w wVar8 = this.f24777c0;
        if (wVar8 == null) {
            jo.p.v("binding");
            wVar8 = null;
        }
        wVar8.R.setOnClickListener(new View.OnClickListener() { // from class: ld.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.K4(SettingActivity.this, view);
            }
        });
        w wVar9 = this.f24777c0;
        if (wVar9 == null) {
            jo.p.v("binding");
            wVar9 = null;
        }
        wVar9.L.setOnClickListener(new View.OnClickListener() { // from class: ld.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.L4(SettingActivity.this, view);
            }
        });
        if (bundle != null) {
            this.f24778d0 = bundle.getBoolean("STATE_KEY_INITIAL_SYNC_DONE", true);
        }
        w wVar10 = this.f24777c0;
        if (wVar10 == null) {
            jo.p.v("binding");
        } else {
            wVar2 = wVar10;
        }
        wVar2.J.setEnabled(Build.VERSION.SDK_INT >= 29);
        u4();
        z4();
        MRLogger j42 = j4();
        MRLog.Companion companion = MRLog.Companion;
        j42.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_ACCOUNT_IMP).build());
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }

    @dq.l
    public final void onEvent(nd.h0 h0Var) {
        jo.p.h(h0Var, "event");
        if (isFinishing()) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: ld.d0
            @Override // java.lang.Runnable
            public final void run() {
                SettingActivity.M4(SettingActivity.this);
            }
        });
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        dq.c.c().r(this);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    public void onResume() {
        super.onResume();
        dq.c.c().p(this);
        if (!this.f24779e0) {
            V4();
        }
        this.f24779e0 = false;
    }

    public final ld.i1 p4() {
        return (ld.i1) this.Z.getValue();
    }

    public final i1 q4() {
        return (i1) this.Q.getValue();
    }

    public final o0 r4() {
        return (o0) this.R.getValue();
    }

    public final v0 s4() {
        return (v0) this.S.getValue();
    }

    public final x t4() {
        return (x) this.W.getValue();
    }

    public final void u4() {
        w wVar = this.f24777c0;
        w wVar2 = null;
        if (wVar == null) {
            jo.p.v("binding");
            wVar = null;
        }
        Toolbar toolbar = wVar.X.B;
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ld.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.v4(SettingActivity.this, view);
            }
        });
        toolbar.setNavigationIcon(nc.d.f41815v);
        TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
        if (textView == null) {
            return;
        }
        jo.p.g(textView, "findViewById<TextView>(R….toolbar_title) ?: return");
        toolbar.setBackgroundResource(nc.h.f41869c);
        textView.setVisibility(0);
        textView.setText(toolbar.getResources().getString(nc.i.text_various_settings));
        w wVar3 = this.f24777c0;
        if (wVar3 == null) {
            jo.p.v("binding");
            wVar3 = null;
        }
        wVar3.V.setOnCheckedChangeListener(this);
        w wVar4 = this.f24777c0;
        if (wVar4 == null) {
            jo.p.v("binding");
            wVar4 = null;
        }
        wVar4.W.setOnCheckedChangeListener(this);
        w wVar5 = this.f24777c0;
        if (wVar5 == null) {
            jo.p.v("binding");
        } else {
            wVar2 = wVar5;
        }
        wVar2.J.setOnCheckedChangeListener(this);
        S4();
    }

    public final void w4() {
        if (!q4().a().h()) {
            of.n.A(this, nc.i.text_error_logout, false);
        } else if (h4().j5()) {
            if (t4().a1()) {
                f.a aVar = ie.f.V0;
                String string = getString(nc.i.text_dialog_pass_code_logout_configured);
                String string2 = getString(nc.i.text_dialog_pass_code_logout_configured_detail);
                String string3 = getString(nc.i.text_logout);
                String string4 = getString(nc.i.B);
                jo.p.g(string, "getString(R.string.text_…s_code_logout_configured)");
                aVar.a(string, string3, string4, string2, false).z3(a3(), "DIALOG_TAG_LOGOUT");
                return;
            }
            f.a aVar2 = ie.f.V0;
            String string5 = getString(nc.i.text_dialog_pass_code_logout_not_config);
            jo.p.g(string5, "getString(R.string.text_…s_code_logout_not_config)");
            f.a.b(aVar2, string5, getString(nc.i.text_btn_pass_code_config), getString(nc.i.B), null, false, 24, null).z3(a3(), "DIALOG_TAG_HANDOVER");
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(nc.i.text_logout);
            builder.setCancelable(false);
            builder.setPositiveButton(nc.i.E4, new DialogInterface.OnClickListener() { // from class: ld.e0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    SettingActivity.x4(SettingActivity.this, dialogInterface, i10);
                }
            });
            builder.setNegativeButton(nc.i.B, g0.f39982w);
            builder.create().show();
        }
    }

    public final void z4() {
        uo.l.d(this, null, null, new c(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        p4().w().i(this, new androidx.lifecycle.f0() { // from class: ld.c0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                SettingActivity.A4(SettingActivity.this, (wn.v) obj);
            }
        });
    }
}
