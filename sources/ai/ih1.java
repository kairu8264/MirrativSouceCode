package ai;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ih1 extends s00 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ki1 {
    public jg1 A;
    public wk B;

    /* renamed from: w  reason: collision with root package name */
    public final WeakReference<View> f5233w;

    /* renamed from: x  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f5234x = new HashMap();

    /* renamed from: y  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f5235y = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f5236z = new HashMap();

    public ih1(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        wg.t.A();
        uk0.a(view, this);
        wg.t.A();
        uk0.b(view, this);
        this.f5233w = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.f5234x.put(key, new WeakReference<>(value));
                if (!"1098".equals(key) && !"3011".equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.f5236z.putAll(this.f5234x);
        for (Map.Entry<String, View> entry2 : hashMap2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.f5235y.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.f5236z.putAll(this.f5235y);
        this.B = new wk(view.getContext(), view);
    }

    @Override // ai.t00
    public final synchronized void S(yh.a aVar) {
        Object z02 = yh.b.z0(aVar);
        if (!(z02 instanceof jg1)) {
            uj0.f("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        jg1 jg1Var = this.A;
        if (jg1Var != null) {
            jg1Var.G(this);
        }
        jg1 jg1Var2 = (jg1) z02;
        if (jg1Var2.j()) {
            this.A = jg1Var2;
            jg1Var2.F(this);
            this.A.n(k5());
            return;
        }
        uj0.c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    @Override // ai.t00
    public final synchronized void U(yh.a aVar) {
        if (this.A != null) {
            Object z02 = yh.b.z0(aVar);
            if (!(z02 instanceof View)) {
                uj0.f("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.A.M((View) z02);
        }
    }

    @Override // ai.ki1
    public final synchronized View V(String str) {
        WeakReference<View> weakReference = this.f5236z.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // ai.t00
    public final synchronized void b() {
        jg1 jg1Var = this.A;
        if (jg1Var != null) {
            jg1Var.G(this);
            this.A = null;
        }
    }

    @Override // ai.ki1
    public final wk e() {
        return this.B;
    }

    @Override // ai.ki1
    public final synchronized Map<String, WeakReference<View>> g() {
        return this.f5236z;
    }

    @Override // ai.ki1
    public final synchronized void h1(String str, View view, boolean z10) {
        this.f5236z.put(str, new WeakReference<>(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f5234x.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // ai.ki1
    public final synchronized Map<String, WeakReference<View>> i() {
        return this.f5234x;
    }

    @Override // ai.ki1
    public final synchronized Map<String, WeakReference<View>> j() {
        return this.f5235y;
    }

    @Override // ai.ki1
    public final View k5() {
        return this.f5233w.get();
    }

    @Override // ai.ki1
    public final synchronized JSONObject l() {
        jg1 jg1Var = this.A;
        if (jg1Var != null) {
            return jg1Var.L(k5(), g(), i());
        }
        return null;
    }

    @Override // ai.ki1
    public final synchronized String n() {
        return "1007";
    }

    @Override // ai.ki1
    public final synchronized yh.a o() {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        jg1 jg1Var = this.A;
        if (jg1Var != null) {
            jg1Var.H(view, k5(), g(), i(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        jg1 jg1Var = this.A;
        if (jg1Var != null) {
            jg1Var.J(k5(), g(), i(), jg1.i(k5()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        jg1 jg1Var = this.A;
        if (jg1Var != null) {
            jg1Var.J(k5(), g(), i(), jg1.i(k5()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        jg1 jg1Var = this.A;
        if (jg1Var != null) {
            jg1Var.I(view, motionEvent, k5());
        }
        return false;
    }

    @Override // ai.ki1
    public final synchronized JSONObject p() {
        return null;
    }

    @Override // ai.ki1
    public final FrameLayout z0() {
        return null;
    }
}
