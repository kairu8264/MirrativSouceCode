package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserModel;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class rl0 extends FrameLayout implements jl0 {
    public final gm0 A;
    public final long B;
    public final kl0 C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public long H;
    public long I;
    public String J;
    public String[] K;
    public Bitmap L;
    public final ImageView M;
    public boolean N;

    /* renamed from: w  reason: collision with root package name */
    public final em0 f9491w;

    /* renamed from: x  reason: collision with root package name */
    public final FrameLayout f9492x;

    /* renamed from: y  reason: collision with root package name */
    public final View f9493y;

    /* renamed from: z  reason: collision with root package name */
    public final ey f9494z;

    public rl0(Context context, em0 em0Var, int i10, boolean z10, ey eyVar, dm0 dm0Var) {
        super(context);
        kl0 il0Var;
        this.f9491w = em0Var;
        this.f9494z = eyVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9492x = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        rh.p.i(em0Var.i());
        ll0 ll0Var = em0Var.i().f58693a;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            fm0 fm0Var = new fm0(context, em0Var.m(), em0Var.k(), eyVar, em0Var.h());
            if (i10 == 2) {
                il0Var = new vm0(context, fm0Var, em0Var, z10, ll0.a(em0Var), dm0Var);
            } else {
                il0Var = new il0(context, em0Var, z10, ll0.a(em0Var), dm0Var, new fm0(context, em0Var.m(), em0Var.k(), eyVar, em0Var.h()));
            }
        } else {
            il0Var = null;
        }
        this.C = il0Var;
        View view = new View(context);
        this.f9493y = view;
        view.setBackgroundColor(0);
        if (il0Var != null) {
            frameLayout.addView(il0Var, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) ft.c().c(ox.A)).booleanValue()) {
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(view);
            }
            if (((Boolean) ft.c().c(ox.f8124x)).booleanValue()) {
                l();
            }
        }
        this.M = new ImageView(context);
        this.B = ((Long) ft.c().c(ox.C)).longValue();
        boolean booleanValue = ((Boolean) ft.c().c(ox.f8140z)).booleanValue();
        this.G = booleanValue;
        if (eyVar != null) {
            eyVar.d("spinner_used", true != booleanValue ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        this.A = new gm0(this);
        if (il0Var != null) {
            il0Var.i(this);
        }
        if (il0Var == null) {
            f("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public final void A(int i10) {
        kl0 kl0Var = this.C;
        if (kl0Var == null) {
            return;
        }
        kl0Var.q(i10);
    }

    public final void B() {
        kl0 kl0Var = this.C;
        if (kl0Var == null) {
            return;
        }
        kl0Var.f6275x.a(true);
        kl0Var.m();
    }

    public final void C() {
        kl0 kl0Var = this.C;
        if (kl0Var == null) {
            return;
        }
        kl0Var.f6275x.a(false);
        kl0Var.m();
    }

    public final void D(float f10) {
        kl0 kl0Var = this.C;
        if (kl0Var == null) {
            return;
        }
        kl0Var.f6275x.b(f10);
        kl0Var.m();
    }

    public final void E(int i10) {
        this.C.A(i10);
    }

    public final void F(int i10) {
        this.C.B(i10);
    }

    public final void G(int i10) {
        this.C.C(i10);
    }

    public final void H(int i10) {
        this.C.f(i10);
    }

    @Override // ai.jl0
    public final void a(String str, String str2) {
        r("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // ai.jl0
    public final void b() {
        if (this.f9491w.g() != null && !this.E) {
            boolean z10 = (this.f9491w.g().getWindow().getAttributes().flags & 128) != 0;
            this.F = z10;
            if (!z10) {
                this.f9491w.g().getWindow().addFlags(128);
                this.E = true;
            }
        }
        this.D = true;
    }

    @Override // ai.jl0
    public final void c() {
        r("ended", new String[0]);
        s();
    }

    @Override // ai.jl0
    public final void d() {
        r("pause", new String[0]);
        s();
        this.D = false;
    }

    @Override // ai.jl0
    public final void e() {
        if (this.N && this.L != null && !q()) {
            this.M.setImageBitmap(this.L);
            this.M.invalidate();
            this.f9492x.addView(this.M, new FrameLayout.LayoutParams(-1, -1));
            this.f9492x.bringChildToFront(this.M);
        }
        this.A.a();
        this.I = this.H;
        yg.d2.f61866i.post(new pl0(this));
    }

    @Override // ai.jl0
    public final void f(String str, String str2) {
        r(MRLog.PAYLOAD_KEY_ERROR, "what", str, "extra", str2);
    }

    public final void finalize() throws Throwable {
        try {
            this.A.a();
            kl0 kl0Var = this.C;
            if (kl0Var != null) {
                hk0.f4882e.execute(ml0.a(kl0Var));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // ai.jl0
    public final void g(int i10, int i11) {
        if (this.G) {
            gx<Integer> gxVar = ox.B;
            int max = Math.max(i10 / ((Integer) ft.c().c(gxVar)).intValue(), 1);
            int max2 = Math.max(i11 / ((Integer) ft.c().c(gxVar)).intValue(), 1);
            Bitmap bitmap = this.L;
            if (bitmap != null && bitmap.getWidth() == max && this.L.getHeight() == max2) {
                return;
            }
            this.L = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.N = false;
        }
    }

    @Override // ai.jl0
    public final void h() {
        if (this.D && q()) {
            this.f9492x.removeView(this.M);
        }
        if (this.L == null) {
            return;
        }
        long elapsedRealtime = wg.t.k().elapsedRealtime();
        if (this.C.getBitmap(this.L) != null) {
            this.N = true;
        }
        long elapsedRealtime2 = wg.t.k().elapsedRealtime() - elapsedRealtime;
        if (yg.p1.m()) {
            StringBuilder sb2 = new StringBuilder(46);
            sb2.append("Spinner frame grab took ");
            sb2.append(elapsedRealtime2);
            sb2.append("ms");
            yg.p1.k(sb2.toString());
        }
        if (elapsedRealtime2 > this.B) {
            uj0.f("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.G = false;
            this.L = null;
            ey eyVar = this.f9494z;
            if (eyVar != null) {
                eyVar.d("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    @Override // ai.jl0
    public final void i() {
        this.f9493y.setVisibility(4);
    }

    public final void j(int i10) {
        this.C.g(i10);
    }

    @TargetApi(14)
    public final void k(MotionEvent motionEvent) {
        kl0 kl0Var = this.C;
        if (kl0Var == null) {
            return;
        }
        kl0Var.dispatchTouchEvent(motionEvent);
    }

    @TargetApi(14)
    public final void l() {
        kl0 kl0Var = this.C;
        if (kl0Var == null) {
            return;
        }
        TextView textView = new TextView(kl0Var.getContext());
        String valueOf = String.valueOf(this.C.h());
        textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f9492x.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f9492x.bringChildToFront(textView);
    }

    public final void m() {
        this.A.a();
        kl0 kl0Var = this.C;
        if (kl0Var != null) {
            kl0Var.k();
        }
        s();
    }

    public final void n() {
        kl0 kl0Var = this.C;
        if (kl0Var == null) {
            return;
        }
        long p10 = kl0Var.p();
        if (this.H == p10 || p10 <= 0) {
            return;
        }
        float f10 = ((float) p10) / 1000.0f;
        if (((Boolean) ft.c().c(ox.f8030l1)).booleanValue()) {
            r("timeupdate", ActivityChooserModel.ATTRIBUTE_TIME, String.valueOf(f10), "totalBytes", String.valueOf(this.C.w()), "qoeCachedBytes", String.valueOf(this.C.v()), "qoeLoadedBytes", String.valueOf(this.C.u()), "droppedFrames", String.valueOf(this.C.y()), "reportTime", String.valueOf(wg.t.k().currentTimeMillis()));
        } else {
            r("timeupdate", ActivityChooserModel.ATTRIBUTE_TIME, String.valueOf(f10));
        }
        this.H = p10;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.A.b();
        } else {
            this.A.a();
            this.I = this.H;
        }
        yg.d2.f61866i.post(new Runnable(this, z10) { // from class: ai.nl0

            /* renamed from: w  reason: collision with root package name */
            public final rl0 f7379w;

            /* renamed from: x  reason: collision with root package name */
            public final boolean f7380x;

            {
                this.f7379w = this;
                this.f7380x = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7379w.p(this.f7380x);
            }
        });
    }

    @Override // android.view.View, ai.jl0
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.A.b();
            z10 = true;
        } else {
            this.A.a();
            this.I = this.H;
            z10 = false;
        }
        yg.d2.f61866i.post(new ql0(this, z10));
    }

    public final /* synthetic */ void p(boolean z10) {
        r("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    public final boolean q() {
        return this.M.getParent() != null;
    }

    public final void r(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f9491w.j0("onVideoEvent", hashMap);
    }

    public final void s() {
        if (this.f9491w.g() == null || !this.E || this.F) {
            return;
        }
        this.f9491w.g().getWindow().clearFlags(128);
        this.E = false;
    }

    public final void t(int i10) {
        if (((Boolean) ft.c().c(ox.A)).booleanValue()) {
            this.f9492x.setBackgroundColor(i10);
            this.f9493y.setBackgroundColor(i10);
        }
    }

    public final void u(int i10, int i11, int i12, int i13) {
        if (yg.p1.m()) {
            StringBuilder sb2 = new StringBuilder(75);
            sb2.append("Set video bounds to x:");
            sb2.append(i10);
            sb2.append(";y:");
            sb2.append(i11);
            sb2.append(";w:");
            sb2.append(i12);
            sb2.append(";h:");
            sb2.append(i13);
            yg.p1.k(sb2.toString());
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.f9492x.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void v(String str, String[] strArr) {
        this.J = str;
        this.K = strArr;
    }

    public final void w(float f10, float f11) {
        kl0 kl0Var = this.C;
        if (kl0Var != null) {
            kl0Var.r(f10, f11);
        }
    }

    public final void x() {
        if (this.C == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.J)) {
            this.C.z(this.J, this.K);
        } else {
            r("no_src", new String[0]);
        }
    }

    public final void y() {
        kl0 kl0Var = this.C;
        if (kl0Var == null) {
            return;
        }
        kl0Var.n();
    }

    public final void z() {
        kl0 kl0Var = this.C;
        if (kl0Var == null) {
            return;
        }
        kl0Var.l();
    }

    @Override // ai.jl0
    public final void zza() {
        this.A.b();
        yg.d2.f61866i.post(new ol0(this));
    }

    @Override // ai.jl0
    public final void zzb() {
        kl0 kl0Var = this.C;
        if (kl0Var != null && this.I == 0) {
            r("canplaythrough", "duration", String.valueOf(kl0Var.o() / 1000.0f), "videoWidth", String.valueOf(this.C.s()), "videoHeight", String.valueOf(this.C.t()));
        }
    }
}
