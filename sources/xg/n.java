package xg;

import ai.cq0;
import ai.dr0;
import ai.fr0;
import ai.ft;
import ai.ir0;
import ai.my1;
import ai.ow2;
import ai.ox;
import ai.pc0;
import ai.q20;
import ai.qn;
import ai.rp0;
import ai.s20;
import ai.uj0;
import ai.zb0;
import ai.zj0;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.C;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Collections;
import yg.d2;

/* loaded from: classes3.dex */
public class n extends pc0 implements b0 {
    public static final int Q = Color.argb(0, 0, 0, 0);
    public s A;
    public FrameLayout C;
    public WebChromeClient.CustomViewCallback D;
    public i G;
    public Runnable J;
    public boolean K;
    public boolean L;

    /* renamed from: w  reason: collision with root package name */
    public final Activity f60278w;

    /* renamed from: x  reason: collision with root package name */
    public AdOverlayInfoParcel f60279x;

    /* renamed from: y  reason: collision with root package name */
    public rp0 f60280y;

    /* renamed from: z  reason: collision with root package name */
    public j f60281z;
    public boolean B = false;
    public boolean E = false;
    public boolean F = false;
    public boolean H = false;
    public int P = 1;
    public final Object I = new Object();
    public boolean M = false;
    public boolean N = false;
    public boolean O = true;

    public n(Activity activity) {
        this.f60278w = activity;
    }

    public static final void W5(yh.a aVar, View view) {
        if (aVar == null || view == null) {
            return;
        }
        wg.t.s().s(aVar, view);
    }

    public final void C() {
        this.G.removeView(this.A);
        g5(true);
    }

    public final void K() {
        this.G.f60270x = true;
    }

    public final void M() {
        synchronized (this.I) {
            this.K = true;
            Runnable runnable = this.J;
            if (runnable != null) {
                ow2 ow2Var = d2.f61866i;
                ow2Var.removeCallbacks(runnable);
                ow2Var.post(this.J);
            }
        }
    }

    public final void S5() {
        rp0 rp0Var;
        q qVar;
        if (this.N) {
            return;
        }
        this.N = true;
        rp0 rp0Var2 = this.f60280y;
        if (rp0Var2 != null) {
            this.G.removeView(rp0Var2.G());
            j jVar = this.f60281z;
            if (jVar != null) {
                this.f60280y.h0(jVar.f60274d);
                this.f60280y.t0(false);
                ViewGroup viewGroup = this.f60281z.f60273c;
                View G = this.f60280y.G();
                j jVar2 = this.f60281z;
                viewGroup.addView(G, jVar2.f60271a, jVar2.f60272b);
                this.f60281z = null;
            } else if (this.f60278w.getApplicationContext() != null) {
                this.f60280y.h0(this.f60278w.getApplicationContext());
            }
            this.f60280y = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f60279x;
        if (adOverlayInfoParcel != null && (qVar = adOverlayInfoParcel.f27152y) != null) {
            qVar.D5(this.P);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f60279x;
        if (adOverlayInfoParcel2 == null || (rp0Var = adOverlayInfoParcel2.f27153z) == null) {
            return;
        }
        W5(rp0Var.o0(), this.f60279x.f27153z.G());
    }

    public final void T5() {
        if (this.H) {
            this.H = false;
            U5();
        }
    }

    public final void U5() {
        this.f60280y.W();
    }

    public final void V5(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        wg.j jVar;
        wg.j jVar2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f60279x;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = (adOverlayInfoParcel2 == null || (jVar2 = adOverlayInfoParcel2.K) == null || !jVar2.f58714x) ? false : true;
        boolean o10 = wg.t.f().o(this.f60278w, configuration);
        if ((this.F && !z12) || o10) {
            z10 = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (adOverlayInfoParcel = this.f60279x) != null && (jVar = adOverlayInfoParcel.K) != null && jVar.C) {
            z11 = true;
        }
        Window window = this.f60278w.getWindow();
        if (((Boolean) ft.c().c(ox.M0)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            window.getDecorView().setSystemUiVisibility(z10 ? z11 ? 5894 : 5380 : 256);
        } else if (z10) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (Build.VERSION.SDK_INT < 19 || !z11) {
                return;
            }
            window.getDecorView().setSystemUiVisibility(4098);
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }

    public final void X5(boolean z10, boolean z11) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        wg.j jVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        wg.j jVar2;
        boolean z12 = true;
        boolean z13 = ((Boolean) ft.c().c(ox.J0)).booleanValue() && (adOverlayInfoParcel2 = this.f60279x) != null && (jVar2 = adOverlayInfoParcel2.K) != null && jVar2.D;
        boolean z14 = ((Boolean) ft.c().c(ox.K0)).booleanValue() && (adOverlayInfoParcel = this.f60279x) != null && (jVar = adOverlayInfoParcel.K) != null && jVar.E;
        if (z10 && z11 && z13 && !z14) {
            new zb0(this.f60280y, "useCustomClose").b("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        s sVar = this.A;
        if (sVar != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            sVar.a(z12);
        }
    }

    public final void Y5(boolean z10) {
        if (z10) {
            this.G.setBackgroundColor(0);
        } else {
            this.G.setBackgroundColor(-16777216);
        }
    }

    public final void Z5(int i10) {
        if (this.f60278w.getApplicationInfo().targetSdkVersion >= ((Integer) ft.c().c(ox.f8041m4)).intValue()) {
            if (this.f60278w.getApplicationInfo().targetSdkVersion <= ((Integer) ft.c().c(ox.f8049n4)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) ft.c().c(ox.f8057o4)).intValue()) {
                    if (i11 <= ((Integer) ft.c().c(ox.f8065p4)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f60278w.setRequestedOrientation(i10);
        } catch (Throwable th2) {
            wg.t.h().l(th2, "AdOverlay.setRequestedOrientation");
        }
    }

    @Override // ai.qc0
    public final void a() {
        q qVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f60279x;
        if (adOverlayInfoParcel == null || (qVar = adOverlayInfoParcel.f27152y) == null) {
            return;
        }
        qVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[Catch: h -> 0x00f5, TryCatch #0 {h -> 0x00f5, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:45:0x0094, B:47:0x009a, B:48:0x009d, B:55:0x00cc, B:57:0x00d0, B:58:0x00d7, B:59:0x00d8, B:61:0x00dc, B:63:0x00e9, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:70:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9 A[Catch: h -> 0x00f5, TryCatch #0 {h -> 0x00f5, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:45:0x0094, B:47:0x009a, B:48:0x009d, B:55:0x00cc, B:57:0x00d0, B:58:0x00d7, B:59:0x00d8, B:61:0x00dc, B:63:0x00e9, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:70:0x0017 }] */
    @Override // ai.qc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a0(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.n.a0(android.os.Bundle):void");
    }

    public final void a6(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f60278w);
        this.C = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.C.addView(view, -1, -1);
        this.f60278w.setContentView(this.C);
        this.L = true;
        this.D = customViewCallback;
        this.B = true;
    }

    public final void b() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f60279x;
        if (adOverlayInfoParcel != null && this.B) {
            Z5(adOverlayInfoParcel.F);
        }
        if (this.C != null) {
            this.f60278w.setContentView(this.G);
            this.L = true;
            this.C.removeAllViews();
            this.C = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.D;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.D = null;
        }
        this.B = false;
    }

    public final void b6(boolean z10) throws h {
        if (!this.L) {
            this.f60278w.requestWindowFeature(1);
        }
        Window window = this.f60278w.getWindow();
        if (window != null) {
            rp0 rp0Var = this.f60279x.f27153z;
            fr0 i02 = rp0Var != null ? rp0Var.i0() : null;
            boolean z11 = i02 != null && i02.d();
            this.H = false;
            if (z11) {
                int i10 = this.f60279x.F;
                if (i10 == 6) {
                    r4 = this.f60278w.getResources().getConfiguration().orientation == 1;
                    this.H = r4;
                } else if (i10 == 7) {
                    r4 = this.f60278w.getResources().getConfiguration().orientation == 2;
                    this.H = r4;
                }
            }
            StringBuilder sb2 = new StringBuilder(46);
            sb2.append("Delay onShow to next orientation change: ");
            sb2.append(r4);
            uj0.a(sb2.toString());
            Z5(this.f60279x.F);
            window.setFlags(16777216, 16777216);
            uj0.a("Hardware acceleration on the AdActivity window enabled.");
            if (!this.F) {
                this.G.setBackgroundColor(-16777216);
            } else {
                this.G.setBackgroundColor(Q);
            }
            this.f60278w.setContentView(this.G);
            this.L = true;
            if (z10) {
                try {
                    wg.t.e();
                    Activity activity = this.f60278w;
                    rp0 rp0Var2 = this.f60279x.f27153z;
                    ir0 q10 = rp0Var2 != null ? rp0Var2.q() : null;
                    rp0 rp0Var3 = this.f60279x.f27153z;
                    String H = rp0Var3 != null ? rp0Var3.H() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.f60279x;
                    zj0 zj0Var = adOverlayInfoParcel.I;
                    rp0 rp0Var4 = adOverlayInfoParcel.f27153z;
                    rp0 a10 = cq0.a(activity, q10, H, true, z11, null, null, zj0Var, null, null, rp0Var4 != null ? rp0Var4.i() : null, qn.a(), null, null);
                    this.f60280y = a10;
                    fr0 i03 = a10.i0();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.f60279x;
                    q20 q20Var = adOverlayInfoParcel2.L;
                    s20 s20Var = adOverlayInfoParcel2.A;
                    x xVar = adOverlayInfoParcel2.E;
                    rp0 rp0Var5 = adOverlayInfoParcel2.f27153z;
                    i03.L0(null, q20Var, null, s20Var, xVar, true, null, rp0Var5 != null ? rp0Var5.i0().b() : null, null, null, null, null, null, null, null, null);
                    this.f60280y.i0().b1(new dr0(this) { // from class: xg.f

                        /* renamed from: w  reason: collision with root package name */
                        public final n f60267w;

                        {
                            this.f60267w = this;
                        }

                        @Override // ai.dr0
                        public final void b(boolean z12) {
                            rp0 rp0Var6 = this.f60267w.f60280y;
                            if (rp0Var6 != null) {
                                rp0Var6.W();
                            }
                        }
                    });
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.f60279x;
                    String str = adOverlayInfoParcel3.H;
                    if (str != null) {
                        this.f60280y.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel3.D;
                        if (str2 != null) {
                            this.f60280y.loadDataWithBaseURL(adOverlayInfoParcel3.B, str2, "text/html", C.UTF8_NAME, null);
                        } else {
                            throw new h("No URL or HTML to display in ad overlay.");
                        }
                    }
                    rp0 rp0Var6 = this.f60279x.f27153z;
                    if (rp0Var6 != null) {
                        rp0Var6.X0(this);
                    }
                } catch (Exception e10) {
                    uj0.d("Error obtaining webview.", e10);
                    throw new h("Could not obtain webview for the overlay.");
                }
            } else {
                rp0 rp0Var7 = this.f60279x.f27153z;
                this.f60280y = rp0Var7;
                rp0Var7.h0(this.f60278w);
            }
            this.f60280y.a0(this);
            rp0 rp0Var8 = this.f60279x.f27153z;
            if (rp0Var8 != null) {
                W5(rp0Var8.o0(), this.G);
            }
            if (this.f60279x.G != 5) {
                ViewParent parent = this.f60280y.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.f60280y.G());
                }
                if (this.F) {
                    this.f60280y.V();
                }
                this.G.addView(this.f60280y.G(), -1, -1);
            }
            if (!z10 && !this.H) {
                U5();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f60279x;
            if (adOverlayInfoParcel4.G != 5) {
                g5(z11);
                if (this.f60280y.P0()) {
                    X5(z11, true);
                    return;
                }
                return;
            }
            my1.S5(this.f60278w, this, adOverlayInfoParcel4.Q, adOverlayInfoParcel4.N, adOverlayInfoParcel4.O, adOverlayInfoParcel4.P, adOverlayInfoParcel4.M, adOverlayInfoParcel4.R);
            return;
        }
        throw new h("Invalid activity, no window available.");
    }

    @Override // ai.qc0
    public final void c() {
        this.P = 1;
    }

    public final void c6() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        q qVar;
        if (!this.f60278w.isFinishing() || this.M) {
            return;
        }
        this.M = true;
        rp0 rp0Var = this.f60280y;
        if (rp0Var != null) {
            rp0Var.J0(this.P - 1);
            synchronized (this.I) {
                if (!this.K && this.f60280y.V0()) {
                    if (((Boolean) ft.c().c(ox.f8016j3)).booleanValue() && !this.N && (adOverlayInfoParcel = this.f60279x) != null && (qVar = adOverlayInfoParcel.f27152y) != null) {
                        qVar.d();
                    }
                    Runnable runnable = new Runnable(this) { // from class: xg.g

                        /* renamed from: w  reason: collision with root package name */
                        public final n f60268w;

                        {
                            this.f60268w = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f60268w.S5();
                        }
                    };
                    this.J = runnable;
                    d2.f61866i.postDelayed(runnable, ((Long) ft.c().c(ox.I0)).longValue());
                    return;
                }
            }
        }
        S5();
    }

    @Override // xg.b0
    public final void d() {
        this.P = 2;
        this.f60278w.finish();
    }

    @Override // ai.qc0
    public final boolean f() {
        this.P = 1;
        if (this.f60280y == null) {
            return true;
        }
        if (((Boolean) ft.c().c(ox.f8067p6)).booleanValue() && this.f60280y.canGoBack()) {
            this.f60280y.goBack();
            return false;
        }
        boolean u02 = this.f60280y.u0();
        if (!u02) {
            this.f60280y.j0("onbackblocked", Collections.emptyMap());
        }
        return u02;
    }

    @Override // ai.qc0
    public final void g() {
        if (((Boolean) ft.c().c(ox.f8032l3)).booleanValue()) {
            rp0 rp0Var = this.f60280y;
            if (rp0Var != null && !rp0Var.c0()) {
                this.f60280y.onResume();
            } else {
                uj0.f("The webview does not exist. Ignoring action.");
            }
        }
    }

    public final void g5(boolean z10) {
        int intValue = ((Integer) ft.c().c(ox.f8048n3)).intValue();
        boolean z11 = ((Boolean) ft.c().c(ox.L0)).booleanValue() || z10;
        r rVar = new r();
        rVar.f60285d = 50;
        rVar.f60282a = true != z11 ? 0 : intValue;
        rVar.f60283b = true != z11 ? intValue : 0;
        rVar.f60284c = intValue;
        this.A = new s(this.f60278w, rVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        X5(z10, this.f60279x.C);
        this.G.addView(this.A, layoutParams);
    }

    @Override // ai.qc0
    public final void h() {
    }

    @Override // ai.qc0
    public final void h0(yh.a aVar) {
        V5((Configuration) yh.b.z0(aVar));
    }

    @Override // ai.qc0
    public final void i() {
        q qVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f60279x;
        if (adOverlayInfoParcel != null && (qVar = adOverlayInfoParcel.f27152y) != null) {
            qVar.B4();
        }
        V5(this.f60278w.getResources().getConfiguration());
        if (((Boolean) ft.c().c(ox.f8032l3)).booleanValue()) {
            return;
        }
        rp0 rp0Var = this.f60280y;
        if (rp0Var != null && !rp0Var.c0()) {
            this.f60280y.onResume();
        } else {
            uj0.f("The webview does not exist. Ignoring action.");
        }
    }

    @Override // ai.qc0
    public final void j() {
        q qVar;
        b();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f60279x;
        if (adOverlayInfoParcel != null && (qVar = adOverlayInfoParcel.f27152y) != null) {
            qVar.f4();
        }
        if (!((Boolean) ft.c().c(ox.f8032l3)).booleanValue() && this.f60280y != null && (!this.f60278w.isFinishing() || this.f60281z == null)) {
            this.f60280y.onPause();
        }
        c6();
    }

    @Override // ai.qc0
    public final void l() {
        rp0 rp0Var = this.f60280y;
        if (rp0Var != null) {
            try {
                this.G.removeView(rp0Var.G());
            } catch (NullPointerException unused) {
            }
        }
        c6();
    }

    @Override // ai.qc0
    public final void l0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.E);
    }

    @Override // ai.qc0
    public final void p() {
        if (((Boolean) ft.c().c(ox.f8032l3)).booleanValue() && this.f60280y != null && (!this.f60278w.isFinishing() || this.f60281z == null)) {
            this.f60280y.onPause();
        }
        c6();
    }

    @Override // ai.qc0
    public final void p1(int i10, int i11, Intent intent) {
    }

    @Override // ai.qc0
    public final void q() {
        this.L = true;
    }

    public final void zzb() {
        this.P = 3;
        this.f60278w.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f60279x;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.G != 5) {
            return;
        }
        this.f60278w.overridePendingTransition(0, 0);
    }
}
