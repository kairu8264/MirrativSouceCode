package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class nc extends mc {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q = null;
    public final ConstraintLayout K;
    public final View L;
    public final LottieAnimationView M;
    public final AppCompatImageView N;
    public long O;

    public nc(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, P, Q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.mc
    public void T(ud.s sVar) {
        this.J = sVar;
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
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        int i12;
        synchronized (this) {
            j10 = this.O;
            this.O = 0L;
        }
        ud.s sVar = this.J;
        int i13 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str4 = null;
        int i14 = 0;
        if (i13 == 0 || sVar == null) {
            str = null;
            str2 = null;
            str3 = null;
            z10 = false;
            z11 = false;
            i10 = 0;
            z12 = false;
            i11 = 0;
            i12 = 0;
        } else {
            boolean j11 = sVar.j();
            int h10 = sVar.h();
            String a10 = sVar.a();
            z11 = sVar.l();
            i10 = sVar.c();
            z12 = sVar.k();
            str2 = sVar.e();
            int b10 = sVar.b();
            str3 = sVar.g();
            i12 = sVar.i();
            str = sVar.d();
            i11 = h10;
            str4 = a10;
            z10 = j11;
            i14 = b10;
        }
        if (i13 != 0) {
            td.a.F(this.B, Integer.valueOf(i14));
            td.c.e(this.L, Boolean.valueOf(z10));
            td.c.e(this.M, Boolean.valueOf(z10));
            td.a.f(this.N, str4);
            td.a.i(this.C, str2);
            this.D.setRoundedButtonViewBackgroundColor(i10);
            this.D.setTitle(str);
            td.c.e(this.D, Boolean.valueOf(z12));
            this.E.setVisibility(i12);
            this.F.setVisibility(i12);
            td.c.e(this.G, Boolean.valueOf(z11));
            x3.e.c(this.H, str3);
            x3.d.a(this.I, i11);
            this.I.setVisibility(i12);
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

    public nc(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[1], (RoundedButtonView) objArr[10], (AppCompatImageView) objArr[11], (AppCompatImageView) objArr[8], (RoundedButtonView) objArr[7], (AppCompatTextView) objArr[6], (SeekBar) objArr[9]);
        this.O = -1L;
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        View view2 = (View) objArr[2];
        this.L = view2;
        view2.setTag(null);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) objArr[3];
        this.M = lottieAnimationView;
        lottieAnimationView.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArr[4];
        this.N = appCompatImageView;
        appCompatImageView.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        N(view);
        y();
    }
}
