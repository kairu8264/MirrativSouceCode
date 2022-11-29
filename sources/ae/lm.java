package ae;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ShooterVictoryCountView;

/* loaded from: classes2.dex */
public class lm extends km {
    public static final ViewDataBinding.i W = null;
    public static final SparseIntArray X;
    public final ConstraintLayout S;
    public final AppCompatTextView T;
    public final AppCompatImageView U;
    public long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(nd.z0.Ka, 14);
        sparseIntArray.put(nd.z0.score_container, 15);
        sparseIntArray.put(nd.z0.score_separator_view, 16);
        sparseIntArray.put(nd.z0.header_separator_view, 17);
        sparseIntArray.put(nd.z0.Sa, 18);
    }

    public lm(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 19, W, X));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.km
    public void T(ud.m3 m3Var) {
        this.R = m3Var;
        synchronized (this) {
            this.V |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        String str;
        String str2;
        Drawable drawable;
        String str3;
        String str4;
        String str5;
        Drawable drawable2;
        String str6;
        synchronized (this) {
            j10 = this.V;
            this.V = 0L;
        }
        ud.m3 m3Var = this.R;
        int i12 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        int i13 = 0;
        SpannableString spannableString = null;
        if (i12 == 0 || m3Var == null) {
            i10 = 0;
            z10 = false;
            z11 = false;
            i11 = 0;
            z12 = false;
            str = null;
            str2 = null;
            drawable = null;
            str3 = null;
            str4 = null;
            str5 = null;
            drawable2 = null;
            str6 = null;
        } else {
            String b10 = m3Var.b();
            String e10 = m3Var.e();
            int f10 = m3Var.f();
            drawable = m3Var.i();
            i10 = m3Var.k();
            z10 = m3Var.r();
            str3 = m3Var.l();
            str4 = m3Var.j();
            str5 = m3Var.d();
            z11 = m3Var.c();
            drawable2 = m3Var.p();
            str6 = m3Var.a();
            i11 = m3Var.h();
            z12 = m3Var.q();
            spannableString = m3Var.g();
            str = b10;
            str2 = e10;
            i13 = f10;
        }
        if (i12 != 0) {
            x3.e.c(this.T, spannableString);
            this.T.setTextColor(i13);
            td.a.f(this.U, str6);
            td.a.i(this.D, str5);
            td.a.f(this.E, str);
            td.c.e(this.E, Boolean.valueOf(z11));
            x3.e.c(this.F, str2);
            td.c.e(this.H, Boolean.valueOf(z12));
            x3.f.a(this.I, drawable);
            x3.e.c(this.J, str4);
            this.K.setTextColor(i11);
            x3.e.c(this.N, str3);
            this.O.setTextColor(i10);
            td.c.e(this.P, Boolean.valueOf(z10));
            x3.f.a(this.Q, drawable2);
            td.c.e(this.Q, Boolean.valueOf(z10));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.V != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.V = 2L;
        }
        H();
    }

    public lm(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[17], (ConstraintLayout) objArr[14], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[5], (ConstraintLayout) objArr[18], (AppCompatTextView) objArr[12], (AppCompatImageView) objArr[9], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[8], (ConstraintLayout) objArr[15], (View) objArr[16], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[6], (ShooterVictoryCountView) objArr[11], (AppCompatImageView) objArr[2]);
        this.V = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.S = constraintLayout;
        constraintLayout.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[13];
        this.T = appCompatTextView;
        appCompatTextView.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArr[3];
        this.U = appCompatImageView;
        appCompatImageView.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        N(view);
        y();
    }
}
