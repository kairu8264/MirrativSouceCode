package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public class t3 extends r3 {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(nd.z0.f42373z1, 5);
        sparseIntArray.put(nd.z0.f42271cb, 6);
        sparseIntArray.put(nd.z0.Re, 7);
        sparseIntArray.put(nd.z0.Se, 8);
        sparseIntArray.put(nd.z0.f42267bb, 9);
        sparseIntArray.put(nd.z0.f42335r3, 10);
        sparseIntArray.put(nd.z0.f42351u3, 11);
    }

    public t3(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, P, Q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.r3
    public void V(ud.f1 f1Var) {
        this.N = f1Var;
        synchronized (this) {
            this.O |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j10 = this.O;
            this.O = 0L;
        }
        ud.f1 f1Var = this.N;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str4 = null;
        if (i10 == 0 || f1Var == null) {
            str = null;
            str2 = null;
            str3 = null;
        } else {
            String d10 = f1Var.d();
            String f10 = f1Var.f();
            str2 = f1Var.e();
            str = d10;
            str4 = f1Var.c();
            str3 = f10;
        }
        if (i10 != 0) {
            x3.e.c(this.D, str4);
            x3.e.c(this.E, str);
            x3.e.c(this.G, str2);
            td.a.q(this.H, str3, 0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.O != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.O = 2L;
        }
        H();
    }

    public t3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[5], (LinearLayoutCompat) objArr[10], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[2], (AppCompatImageView) objArr[1], (Space) objArr[9], (LottieAnimationView) objArr[6], (ConstraintLayout) objArr[0], (Space) objArr[7], (LottieAnimationView) objArr[8]);
        this.O = -1L;
        this.D.setTag(null);
        this.E.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.K.setTag(null);
        N(view);
        y();
    }
}
