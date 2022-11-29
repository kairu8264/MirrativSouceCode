package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;

/* loaded from: classes.dex */
public class e extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public DialogInterface.OnDismissListener A0;
    public int B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public int F0;
    public boolean G0;
    public androidx.lifecycle.f0<androidx.lifecycle.u> H0;
    public Dialog I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;

    /* renamed from: x0  reason: collision with root package name */
    public Handler f15323x0;

    /* renamed from: y0  reason: collision with root package name */
    public Runnable f15324y0;

    /* renamed from: z0  reason: collision with root package name */
    public DialogInterface.OnCancelListener f15325z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            e.this.A0.onDismiss(e.this.I0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (e.this.I0 != null) {
                e eVar = e.this;
                eVar.onCancel(eVar.I0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (e.this.I0 != null) {
                e eVar = e.this;
                eVar.onDismiss(eVar.I0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements androidx.lifecycle.f0<androidx.lifecycle.u> {
        public d() {
        }

        @Override // androidx.lifecycle.f0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void d(androidx.lifecycle.u uVar) {
            if (uVar == null || !e.this.E0) {
                return;
            }
            View Q2 = e.this.Q2();
            if (Q2.getParent() == null) {
                if (e.this.I0 != null) {
                    if (FragmentManager.D0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + e.this.I0);
                    }
                    e.this.I0.setContentView(Q2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
    }

    /* renamed from: androidx.fragment.app.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0064e extends j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f15330a;

        public C0064e(j jVar) {
            this.f15330a = jVar;
        }

        @Override // androidx.fragment.app.j
        public View c(int i10) {
            if (this.f15330a.d()) {
                return this.f15330a.c(i10);
            }
            return e.this.s3(i10);
        }

        @Override // androidx.fragment.app.j
        public boolean d() {
            return this.f15330a.d() || e.this.t3();
        }
    }

    public e() {
        this.f15324y0 = new a();
        this.f15325z0 = new b();
        this.A0 = new c();
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = true;
        this.E0 = true;
        this.F0 = -1;
        this.H0 = new d();
        this.M0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        this.f15323x0 = new Handler();
        this.E0 = this.U == 0;
        if (bundle != null) {
            this.B0 = bundle.getInt("android:style", 0);
            this.C0 = bundle.getInt("android:theme", 0);
            this.D0 = bundle.getBoolean("android:cancelable", true);
            this.E0 = bundle.getBoolean("android:showsDialog", this.E0);
            this.F0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void A3(FragmentManager fragmentManager, String str) {
        this.K0 = false;
        this.L0 = true;
        z k10 = fragmentManager.k();
        k10.w(true);
        k10.d(this, str);
        k10.k();
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        Dialog dialog = this.I0;
        if (dialog != null) {
            this.J0 = true;
            dialog.setOnDismissListener(null);
            this.I0.dismiss();
            if (!this.K0) {
                onDismiss(this.I0);
            }
            this.I0 = null;
            this.M0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        if (!this.L0 && !this.K0) {
            this.K0 = true;
        }
        b1().n(this.H0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater K1(Bundle bundle) {
        LayoutInflater K1 = super.K1(bundle);
        if (this.E0 && !this.G0) {
            u3(bundle);
            if (FragmentManager.D0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.I0;
            return dialog != null ? K1.cloneInContext(dialog.getContext()) : K1;
        }
        if (FragmentManager.D0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.E0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            } else {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            }
        }
        return K1;
    }

    @Override // androidx.fragment.app.Fragment
    public void b2(Bundle bundle) {
        super.b2(bundle);
        Dialog dialog = this.I0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.B0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.C0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.D0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.E0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.F0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void c2() {
        super.c2();
        Dialog dialog = this.I0;
        if (dialog != null) {
            this.J0 = false;
            dialog.show();
            View decorView = this.I0.getWindow().getDecorView();
            w0.b(decorView, this);
            x0.b(decorView, this);
            y4.f.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void d2() {
        super.d2();
        Dialog dialog = this.I0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public j e0() {
        return new C0064e(super.e0());
    }

    @Override // androidx.fragment.app.Fragment
    public void g2(Bundle bundle) {
        Bundle bundle2;
        super.g2(bundle);
        if (this.I0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.I0.onRestoreInstanceState(bundle2);
    }

    public void m3() {
        o3(false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void n2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.n2(layoutInflater, viewGroup, bundle);
        if (this.f15130e0 != null || this.I0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.I0.onRestoreInstanceState(bundle2);
    }

    public void n3() {
        o3(true, false);
    }

    public final void o3(boolean z10, boolean z11) {
        if (this.K0) {
            return;
        }
        this.K0 = true;
        this.L0 = false;
        Dialog dialog = this.I0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.I0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f15323x0.getLooper()) {
                    onDismiss(this.I0);
                } else {
                    this.f15323x0.post(this.f15324y0);
                }
            }
        }
        this.J0 = true;
        if (this.F0 >= 0) {
            I0().S0(this.F0, 1, z10);
            this.F0 = -1;
            return;
        }
        z k10 = I0().k();
        k10.w(true);
        k10.q(this);
        if (z10) {
            k10.j();
        } else {
            k10.i();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.J0) {
            return;
        }
        if (FragmentManager.D0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        o3(true, true);
    }

    public Dialog p3() {
        return this.I0;
    }

    public int q3() {
        return this.C0;
    }

    public Dialog r3(Bundle bundle) {
        if (FragmentManager.D0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(N2(), q3());
    }

    public View s3(int i10) {
        Dialog dialog = this.I0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void t1(Bundle bundle) {
        super.t1(bundle);
    }

    public boolean t3() {
        return this.M0;
    }

    public final void u3(Bundle bundle) {
        if (this.E0 && !this.M0) {
            try {
                this.G0 = true;
                Dialog r32 = r3(bundle);
                this.I0 = r32;
                if (this.E0) {
                    y3(r32, this.B0);
                    Context q02 = q0();
                    if (q02 instanceof Activity) {
                        this.I0.setOwnerActivity((Activity) q02);
                    }
                    this.I0.setCancelable(this.D0);
                    this.I0.setOnCancelListener(this.f15325z0);
                    this.I0.setOnDismissListener(this.A0);
                    this.M0 = true;
                } else {
                    this.I0 = null;
                }
            } finally {
                this.G0 = false;
            }
        }
    }

    public final Dialog v3() {
        Dialog p32 = p3();
        if (p32 != null) {
            return p32;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void w3(boolean z10) {
        this.D0 = z10;
        Dialog dialog = this.I0;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        super.x1(context);
        b1().j(this.H0);
        if (this.L0) {
            return;
        }
        this.K0 = false;
    }

    public void x3(boolean z10) {
        this.E0 = z10;
    }

    public void y3(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void z3(FragmentManager fragmentManager, String str) {
        this.K0 = false;
        this.L0 = true;
        z k10 = fragmentManager.k();
        k10.w(true);
        k10.d(this, str);
        k10.i();
    }

    public e(int i10) {
        super(i10);
        this.f15324y0 = new a();
        this.f15325z0 = new b();
        this.A0 = new c();
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = true;
        this.E0 = true;
        this.F0 = -1;
        this.H0 = new d();
        this.M0 = false;
    }
}
