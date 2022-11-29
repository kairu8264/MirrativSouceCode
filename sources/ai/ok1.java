package ai;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class ok1 extends p50 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, vz {

    /* renamed from: w  reason: collision with root package name */
    public View f7838w;

    /* renamed from: x  reason: collision with root package name */
    public pv f7839x;

    /* renamed from: y  reason: collision with root package name */
    public jg1 f7840y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7841z = false;
    public boolean A = false;

    public ok1(jg1 jg1Var, og1 og1Var) {
        this.f7838w = og1Var.h();
        this.f7839x = og1Var.e0();
        this.f7840y = jg1Var;
        if (og1Var.r() != null) {
            og1Var.r().q0(this);
        }
    }

    public static final void R5(u50 u50Var, int i10) {
        try {
            u50Var.E(i10);
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ai.r50
    public final void L(yh.a aVar) throws RemoteException {
        rh.p.d("#008 Must be called on the main UI thread.");
        W0(aVar, new nk1(this));
    }

    @Override // ai.r50
    public final void W0(yh.a aVar, u50 u50Var) throws RemoteException {
        String str;
        rh.p.d("#008 Must be called on the main UI thread.");
        if (this.f7841z) {
            uj0.c("Instream ad can not be shown after destroy().");
            R5(u50Var, 2);
            return;
        }
        View view = this.f7838w;
        if (view != null && this.f7839x != null) {
            if (this.A) {
                uj0.c("Instream ad should not be used again.");
                R5(u50Var, 1);
                return;
            }
            this.A = true;
            f();
            ((ViewGroup) yh.b.z0(aVar)).addView(this.f7838w, new ViewGroup.LayoutParams(-1, -1));
            wg.t.A();
            uk0.a(this.f7838w, this);
            wg.t.A();
            uk0.b(this.f7838w, this);
            e();
            try {
                u50Var.c();
                return;
            } catch (RemoteException e10) {
                uj0.i("#007 Could not call remote method.", e10);
                return;
            }
        }
        String str2 = view == null ? "can not get video view." : "can not get video controller.";
        if (str2.length() != 0) {
            str = "Instream internal error: ".concat(str2);
        } else {
            str = new String("Instream internal error: ");
        }
        uj0.c(str);
        R5(u50Var, 0);
    }

    @Override // ai.r50
    public final j00 a() {
        rh.p.d("#008 Must be called on the main UI thread.");
        if (this.f7841z) {
            uj0.c("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        jg1 jg1Var = this.f7840y;
        if (jg1Var == null || jg1Var.p() == null) {
            return null;
        }
        return this.f7840y.p().a();
    }

    @Override // ai.r50
    public final void b() throws RemoteException {
        rh.p.d("#008 Must be called on the main UI thread.");
        f();
        jg1 jg1Var = this.f7840y;
        if (jg1Var != null) {
            jg1Var.b();
        }
        this.f7840y = null;
        this.f7838w = null;
        this.f7839x = null;
        this.f7841z = true;
    }

    public final void e() {
        View view;
        jg1 jg1Var = this.f7840y;
        if (jg1Var == null || (view = this.f7838w) == null) {
            return;
        }
        jg1Var.J(view, Collections.emptyMap(), Collections.emptyMap(), jg1.i(this.f7838w));
    }

    public final void f() {
        View view = this.f7838w;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f7838w);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        e();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        e();
    }

    @Override // ai.vz
    public final void zza() {
        yg.d2.f61866i.post(new Runnable(this) { // from class: ai.mk1

            /* renamed from: w  reason: collision with root package name */
            public final ok1 f6963w;

            {
                this.f6963w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.f6963w.b();
                } catch (RemoteException e10) {
                    uj0.i("#007 Could not call remote method.", e10);
                }
            }
        });
    }

    @Override // ai.r50
    public final pv zzb() throws RemoteException {
        rh.p.d("#008 Must be called on the main UI thread.");
        if (this.f7841z) {
            uj0.c("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.f7839x;
    }
}
