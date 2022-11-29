package ae;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public class li extends ki {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final ConstraintLayout N;
    public final View O;
    public final View P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(nd.z0.profile_image_container, 12);
        sparseIntArray.put(nd.z0.space_view, 13);
    }

    public li(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 14, R, S));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.ki
    public void T(ud.p3 p3Var) {
        this.M = p3Var;
        synchronized (this) {
            this.Q |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Drawable drawable;
        String str;
        String str2;
        synchronized (this) {
            j10 = this.Q;
            this.Q = 0L;
        }
        ud.p3 p3Var = this.M;
        int i10 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        boolean z14 = false;
        if (i10 == 0 || p3Var == null) {
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            drawable = null;
            str = null;
            str2 = null;
        } else {
            Drawable b10 = p3Var.b();
            boolean h10 = p3Var.h();
            boolean e10 = p3Var.e();
            z12 = p3Var.f();
            str = p3Var.c();
            str2 = p3Var.a();
            z13 = p3Var.i();
            z10 = p3Var.g();
            drawable = b10;
            z14 = e10;
            z11 = h10;
        }
        if (i10 != 0) {
            td.c.e(this.B, Boolean.valueOf(z14));
            td.c.e(this.C, Boolean.valueOf(z14));
            td.c.e(this.D, Boolean.valueOf(z10));
            td.c.e(this.F, Boolean.valueOf(z12));
            td.a.i(this.G, str2);
            td.c.e(this.G, Boolean.valueOf(z10));
            x3.f.a(this.H, drawable);
            td.c.e(this.I, Boolean.valueOf(z11));
            x3.e.c(this.J, str);
            td.c.e(this.K, Boolean.valueOf(z13));
        }
        if ((j10 & 2) != 0) {
            td.c.c(this.O, 4, null, null, null);
            td.c.c(this.P, 4, 1, Integer.valueOf(ViewDataBinding.t(this.P, nd.w0.T0)), null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Q = 2L;
        }
        H();
    }

    public li(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (LottieAnimationView) objArr[5], (View) objArr[4], (View) objArr[2], (ConstraintLayout) objArr[12], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[10], (ConstraintLayout) objArr[7], (AppCompatTextView) objArr[11], (AppCompatImageView) objArr[6], (Space) objArr[13]);
        this.Q = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.N = constraintLayout;
        constraintLayout.setTag(null);
        View view2 = (View) objArr[8];
        this.O = view2;
        view2.setTag(null);
        View view3 = (View) objArr[9];
        this.P = view3;
        view3.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        N(view);
        y();
    }
}
