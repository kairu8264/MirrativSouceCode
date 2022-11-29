package com.dena.mirrativ.streaming.liveprepare;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import be.m3;
import be.q3;
import com.dena.mirrativ.streaming.liveprepare.LivePermissionActivity;
import com.dena.mirrorman.util.FragmentRunner;
import hf.m0;
import ie.i;
import ie.j;
import java.util.Map;
import jc.c;
import jo.f0;
import jo.p;
import jo.q;
import kf.t;
import nd.w0;
import vb.n;
import wn.i;
import wn.v;
import xb.r;

/* loaded from: classes2.dex */
public final class LivePermissionActivity extends e.b implements m3.b, q3.b, n, j {
    public static final a V = new a(null);
    public static final int W = 8;
    public final wn.f O;
    public final wn.f P;
    public final wn.f Q;
    public FragmentManager.j R;
    public final FragmentRunner S;
    public final LivePermissionActivity$onResumeLifecycleObserver$1 T;
    public final androidx.activity.result.c<String[]> U;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context) {
            p.h(context, "context");
            return new Intent(context, LivePermissionActivity.class);
        }

        public final boolean b(androidx.activity.result.a aVar) {
            p.h(aVar, "result");
            return aVar.b() == 100;
        }

        public final boolean c(androidx.activity.result.a aVar) {
            p.h(aVar, "result");
            return aVar.b() == -1;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends FragmentManager.j {
        public b() {
        }

        @Override // androidx.fragment.app.FragmentManager.j
        public void e(FragmentManager fragmentManager, Fragment fragment) {
            p.h(fragmentManager, "fm");
            p.h(fragment, "f");
            if (fragment instanceof m3) {
                LivePermissionActivity.this.a3().n1(this);
                LivePermissionActivity.this.finish();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends FragmentManager.j {
        public c() {
        }

        @Override // androidx.fragment.app.FragmentManager.j
        public void e(FragmentManager fragmentManager, Fragment fragment) {
            p.h(fragmentManager, "fm");
            p.h(fragment, "f");
            if (fragment instanceof q3) {
                LivePermissionActivity.this.a3().n1(this);
                LivePermissionActivity.this.B3();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<v> {
        public d() {
            super(0);
        }

        public final void a() {
            q3.O0.c().z3(LivePermissionActivity.this.a3(), "RuntimePermissionSettingDialog");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends FragmentManager.j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23726a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LivePermissionActivity f23727b;

        public e(String str, LivePermissionActivity livePermissionActivity) {
            this.f23726a = str;
            this.f23727b = livePermissionActivity;
        }

        @Override // androidx.fragment.app.FragmentManager.j
        public void e(FragmentManager fragmentManager, Fragment fragment) {
            p.h(fragmentManager, "fragmentManager");
            p.h(fragment, "fragment");
            super.e(fragmentManager, fragment);
            if (p.c(fragment.W0(), this.f23726a)) {
                this.f23727b.a3().n1(this);
                this.f23727b.D3();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<m0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23728w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23729x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23730y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23728w = componentCallbacks;
            this.f23729x = aVar;
            this.f23730y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hf.m0] */
        @Override // io.a
        public final m0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23728w;
            return gq.a.a(componentCallbacks).c(f0.b(m0.class), this.f23729x, this.f23730y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23731w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23732x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23733y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23731w = componentCallbacks;
            this.f23732x = aVar;
            this.f23733y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final t invoke() {
            ComponentCallbacks componentCallbacks = this.f23731w;
            return gq.a.a(componentCallbacks).c(f0.b(t.class), this.f23732x, this.f23733y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23734w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23735x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23736y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23734w = componentCallbacks;
            this.f23735x = aVar;
            this.f23736y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f23734w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f23735x, this.f23736y);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.dena.mirrativ.streaming.liveprepare.LivePermissionActivity$onResumeLifecycleObserver$1] */
    public LivePermissionActivity() {
        i iVar = i.SYNCHRONIZED;
        this.O = wn.g.b(iVar, new f(this, null, null));
        this.P = wn.g.b(iVar, new g(this, null, null));
        this.Q = wn.g.b(iVar, new h(this, null, null));
        this.S = new FragmentRunner(this);
        this.T = new androidx.lifecycle.h() { // from class: com.dena.mirrativ.streaming.liveprepare.LivePermissionActivity$onResumeLifecycleObserver$1
            @Override // androidx.lifecycle.h, androidx.lifecycle.m
            public void c(u uVar) {
                FragmentManager.j jVar;
                p.h(uVar, "owner");
                super.c(uVar);
                if (q3.O0.b(LivePermissionActivity.this)) {
                    jVar = LivePermissionActivity.this.R;
                    if (jVar != null) {
                        LivePermissionActivity.this.a3().n1(jVar);
                    }
                    Fragment e02 = LivePermissionActivity.this.a3().e0("RuntimePermissionSettingDialog");
                    e eVar = e02 instanceof e ? (e) e02 : null;
                    if (eVar != null) {
                        eVar.m3();
                    }
                    LivePermissionActivity.this.B3();
                }
            }
        };
        androidx.activity.result.c<String[]> V2 = V2(new c.b(), new androidx.activity.result.b() { // from class: jc.e
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                LivePermissionActivity.I3(LivePermissionActivity.this, (Map) obj);
            }
        });
        p.g(V2, "registerForActivityResul…        }\n        }\n    }");
        this.U = V2;
    }

    public static final void I3(LivePermissionActivity livePermissionActivity, Map map) {
        boolean z10;
        p.h(livePermissionActivity, "this$0");
        p.g(map, "results");
        boolean z11 = true;
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            FragmentManager.j jVar = livePermissionActivity.R;
            if (jVar != null) {
                livePermissionActivity.a3().n1(jVar);
            }
            Fragment e02 = livePermissionActivity.a3().e0("RuntimePermissionSettingDialog");
            androidx.fragment.app.e eVar = e02 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e02 : null;
            if (eVar != null) {
                eVar.m3();
            }
            livePermissionActivity.B3();
            return;
        }
        String[] a10 = q3.O0.a();
        int length = a10.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z11 = false;
                break;
            }
            String str = a10[i10];
            if (c3.a.a(livePermissionActivity, str) == -1 && !b3.a.s(livePermissionActivity, str)) {
                break;
            }
            i10++;
        }
        if (z11) {
            of.n.A(livePermissionActivity, r.Y1, false);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", livePermissionActivity.getPackageName(), null));
            intent.addFlags(268435456);
            livePermissionActivity.startActivity(intent);
            livePermissionActivity.g().c(livePermissionActivity.T);
            livePermissionActivity.g().a(livePermissionActivity.T);
        }
    }

    public final void B3() {
        if (!m3.O0.b(this)) {
            H3();
        } else if (!q3.O0.b(this)) {
            J3();
        } else if (C3()) {
            K3();
        } else {
            D3();
        }
    }

    public final boolean C3() {
        if (G3().b0() == -1) {
            G3().E3(System.currentTimeMillis());
            return true;
        } else if (G3().b0() == 0) {
            if ((System.currentTimeMillis() - G3().v4()) / 3600000 >= 72 || G3().v4() == 0) {
                G3().E3(System.currentTimeMillis());
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void D3() {
        setResult(-1);
        finish();
    }

    @Override // be.q3.b
    public void E1() {
        F3().a();
        this.U.a(q3.O0.a());
    }

    public final tb.c E3() {
        return (tb.c) this.Q.getValue();
    }

    public final m0 F3() {
        return (m0) this.O.getValue();
    }

    public final t G3() {
        return (t) this.P.getValue();
    }

    public final void H3() {
        final b bVar = new b();
        a3().X0(bVar, false);
        g().a(new androidx.lifecycle.h() { // from class: com.dena.mirrativ.streaming.liveprepare.LivePermissionActivity$requestOverlayPermission$1
            @Override // androidx.lifecycle.h, androidx.lifecycle.m
            public void c(u uVar) {
                p.h(uVar, "owner");
                super.c(uVar);
                m3.a aVar = m3.O0;
                if (aVar.b(LivePermissionActivity.this)) {
                    LivePermissionActivity.this.a3().n1(bVar);
                    Fragment e02 = LivePermissionActivity.this.a3().e0(aVar.a());
                    e eVar = e02 instanceof e ? (e) e02 : null;
                    if (eVar != null) {
                        eVar.m3();
                    }
                    LivePermissionActivity.this.g().c(this);
                    LivePermissionActivity.this.B3();
                }
            }
        });
        m3.a aVar = m3.O0;
        aVar.c().z3(a3(), aVar.a());
    }

    public final void J3() {
        c cVar = new c();
        this.R = cVar;
        a3().X0(cVar, false);
        this.S.c(new d());
    }

    public final void K3() {
        String str;
        ie.i a10;
        if (Build.VERSION.SDK_INT < 28) {
            if (G3().b0() == 0) {
                str = "SimpleYesOrNoDialog";
                i.a aVar = ie.i.U0;
                String string = getString(r.text_recommend_confirm_access_notification_android8);
                p.g(string, "getString(R.string.text_…ss_notification_android8)");
                String string2 = getString(r.text_set_on);
                p.g(string2, "getString(R.string.text_set_on)");
                a10 = aVar.a(string, (r16 & 2) != 0 ? null : null, (r16 & 4) != 0 ? w0.f42236l : 0, string2, (r16 & 16) != 0 ? w0.f42242u0 : 0, (r16 & 32) != 0 ? null : getString(r.H));
                a10.z3(a3(), "SimpleYesOrNoDialog");
            } else {
                str = "ConfirmAccessSettingNotificationDialog";
                c.a aVar2 = jc.c.T0;
                String string3 = getString(r.text_confirm_access_notificaiton_android8);
                p.g(string3, "getString(R.string.text_…ss_notificaiton_android8)");
                String string4 = getString(r.text_confirm_access_notificaiton_android8_description);
                p.g(string4, "getString(R.string.text_…ton_android8_description)");
                String string5 = getString(r.text_permit);
                p.g(string5, "getString(R.string.text_permit)");
                aVar2.a(string3, string4, string5).z3(a3(), "ConfirmAccessSettingNotificationDialog");
            }
        } else {
            tb.c E3 = E3();
            String string6 = getString(r.text_confirm_access_notification);
            p.g(string6, "getString(R.string.text_…firm_access_notification)");
            tb.a h10 = E3.h(string6, true, G3().b0());
            String b10 = h10.b();
            h10.a().z3(a3(), b10);
            str = b10;
        }
        a3().X0(new e(str, this), false);
    }

    @Override // ie.j
    public void L1(String str) {
        p.h(str, "tag");
        setResult(100);
        finish();
    }

    @Override // be.m3.b
    public void Q1() {
        of.n.A(this, r.Y1, false);
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName()));
        intent.addFlags(268435456);
        startActivity(intent);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // ie.j
    public void k(String str) {
        j.a.a(this, str);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        B3();
    }

    @Override // vb.n
    public void w0() {
        D3();
    }
}
