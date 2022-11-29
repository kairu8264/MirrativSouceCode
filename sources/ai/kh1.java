package ai;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kh1 extends o00 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ki1 {
    public static final zz2<String> J = zz2.u("2011", "1009", "3010");
    public final t43 A;
    public View B;
    public jg1 D;
    public wk E;
    public j00 G;
    public boolean H;

    /* renamed from: w  reason: collision with root package name */
    public final String f6236w;

    /* renamed from: y  reason: collision with root package name */
    public FrameLayout f6238y;

    /* renamed from: z  reason: collision with root package name */
    public FrameLayout f6239z;

    /* renamed from: x  reason: collision with root package name */
    public Map<String, WeakReference<View>> f6237x = new HashMap();
    public yh.a F = null;
    public boolean I = false;
    public final int C = 213806000;

    public kh1(FrameLayout frameLayout, FrameLayout frameLayout2, int i10) {
        this.f6238y = frameLayout;
        this.f6239z = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.f6236w = str;
        wg.t.A();
        uk0.a(frameLayout, this);
        wg.t.A();
        uk0.b(frameLayout, this);
        this.A = hk0.f4882e;
        this.E = new wk(this.f6238y.getContext(), this.f6238y);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // ai.p00
    public final synchronized yh.a A(String str) {
        return yh.b.h1(V(str));
    }

    @Override // ai.p00
    public final void G1(yh.a aVar) {
        onTouch(this.f6238y, (MotionEvent) yh.b.z0(aVar));
    }

    @Override // ai.p00
    public final synchronized void L2(String str, yh.a aVar) {
        h1(str, (View) yh.b.z0(aVar), true);
    }

    @Override // ai.p00
    public final synchronized void P(yh.a aVar) {
        this.D.M((View) yh.b.z0(aVar));
    }

    public final synchronized void R5(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.f6239z.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.f6239z.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e10) {
                    uj0.g("Encountered invalid base64 watermark.", e10);
                }
            }
        }
        this.f6239z.addView(frameLayout);
    }

    @Override // ai.p00
    public final synchronized void U(yh.a aVar) {
        if (this.I) {
            return;
        }
        Object z02 = yh.b.z0(aVar);
        if (!(z02 instanceof jg1)) {
            uj0.f("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        jg1 jg1Var = this.D;
        if (jg1Var != null) {
            jg1Var.G(this);
        }
        q();
        jg1 jg1Var2 = (jg1) z02;
        this.D = jg1Var2;
        jg1Var2.F(this);
        this.D.n(this.f6238y);
        this.D.o(this.f6239z);
        if (this.H) {
            this.D.p().b(this.G);
        }
        if (!((Boolean) ft.c().c(ox.f8079r2)).booleanValue() || TextUtils.isEmpty(this.D.k())) {
            return;
        }
        R5(this.D.k());
    }

    @Override // ai.ki1
    public final synchronized View V(String str) {
        if (this.I) {
            return null;
        }
        WeakReference<View> weakReference = this.f6237x.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // ai.p00
    public final synchronized void b3(j00 j00Var) {
        if (this.I) {
            return;
        }
        this.H = true;
        this.G = j00Var;
        jg1 jg1Var = this.D;
        if (jg1Var != null) {
            jg1Var.p().b(j00Var);
        }
    }

    @Override // ai.p00
    public final synchronized void c() {
        if (this.I) {
            return;
        }
        jg1 jg1Var = this.D;
        if (jg1Var != null) {
            jg1Var.G(this);
            this.D = null;
        }
        this.f6237x.clear();
        this.f6238y.removeAllViews();
        this.f6239z.removeAllViews();
        this.f6237x = null;
        this.f6238y = null;
        this.f6239z = null;
        this.B = null;
        this.E = null;
        this.I = true;
    }

    @Override // ai.ki1
    public final wk e() {
        return this.E;
    }

    @Override // ai.ki1
    public final synchronized Map<String, WeakReference<View>> g() {
        return this.f6237x;
    }

    @Override // ai.ki1
    public final synchronized void h1(String str, View view, boolean z10) {
        if (this.I) {
            return;
        }
        if (view == null) {
            this.f6237x.remove(str);
            return;
        }
        this.f6237x.put(str, new WeakReference<>(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            if (yg.c1.a(this.C)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // ai.ki1
    public final synchronized Map<String, WeakReference<View>> i() {
        return this.f6237x;
    }

    @Override // ai.ki1
    public final synchronized Map<String, WeakReference<View>> j() {
        return null;
    }

    @Override // ai.ki1
    public final /* bridge */ /* synthetic */ View k5() {
        return this.f6238y;
    }

    @Override // ai.ki1
    public final synchronized JSONObject l() {
        jg1 jg1Var = this.D;
        if (jg1Var != null) {
            return jg1Var.L(this.f6238y, g(), i());
        }
        return null;
    }

    @Override // ai.ki1
    public final synchronized String n() {
        return this.f6236w;
    }

    @Override // ai.ki1
    public final yh.a o() {
        return this.F;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        jg1 jg1Var = this.D;
        if (jg1Var != null) {
            jg1Var.O();
            this.D.H(view, this.f6238y, g(), i(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        jg1 jg1Var = this.D;
        if (jg1Var != null) {
            jg1Var.J(this.f6238y, g(), i(), jg1.i(this.f6238y));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        jg1 jg1Var = this.D;
        if (jg1Var != null) {
            jg1Var.J(this.f6238y, g(), i(), jg1.i(this.f6238y));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        jg1 jg1Var = this.D;
        if (jg1Var != null) {
            jg1Var.I(view, motionEvent, this.f6238y);
        }
        return false;
    }

    @Override // ai.ki1
    public final synchronized JSONObject p() {
        jg1 jg1Var = this.D;
        if (jg1Var != null) {
            return jg1Var.K(this.f6238y, g(), i());
        }
        return null;
    }

    public final synchronized void q() {
        this.A.execute(new Runnable(this) { // from class: ai.jh1

            /* renamed from: w  reason: collision with root package name */
            public final kh1 f5796w;

            {
                this.f5796w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5796w.w();
            }
        });
    }

    @Override // ai.p00
    public final synchronized void u0(yh.a aVar, int i10) {
    }

    public final /* synthetic */ void w() {
        if (this.B == null) {
            View view = new View(this.f6238y.getContext());
            this.B = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f6238y != this.B.getParent()) {
            this.f6238y.addView(this.B);
        }
    }

    @Override // ai.p00
    public final synchronized void y1(yh.a aVar) {
        if (this.I) {
            return;
        }
        this.F = aVar;
    }

    @Override // ai.ki1
    public final FrameLayout z0() {
        return this.f6239z;
    }
}
