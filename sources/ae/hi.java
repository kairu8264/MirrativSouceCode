package ae;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GaugeView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.customview.ShooterVictoryCountView;

/* loaded from: classes2.dex */
public class hi extends gi {
    public static final ViewDataBinding.i X = null;
    public static final SparseIntArray Y;
    public final ConstraintLayout U;
    public final AppCompatImageView V;
    public long W;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(nd.z0.profile_image_bottom_anchor_view, 16);
        sparseIntArray.put(nd.z0.score_container, 17);
        sparseIntArray.put(nd.z0.next_reward_container_view, 18);
        sparseIntArray.put(nd.z0.invite_button_view, 19);
    }

    public hi(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 20, X, Y));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.gi
    public void T(ud.l3 l3Var) {
        this.T = l3Var;
        synchronized (this) {
            this.W |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        boolean z11;
        int i10;
        String str;
        String str2;
        Drawable drawable;
        String str3;
        String str4;
        Drawable drawable2;
        String str5;
        float f10;
        int i11;
        boolean z12;
        synchronized (this) {
            j10 = this.W;
            this.W = 0L;
        }
        ud.l3 l3Var = this.T;
        int i12 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z13 = false;
        if (i12 == 0 || l3Var == null) {
            z10 = false;
            z11 = false;
            i10 = 0;
            str = null;
            str2 = null;
            drawable = null;
            str3 = null;
            str4 = null;
            drawable2 = null;
            str5 = null;
            f10 = 0.0f;
            i11 = 0;
            z12 = false;
        } else {
            boolean u10 = l3Var.u();
            String a10 = l3Var.a();
            Drawable m10 = l3Var.m();
            z12 = l3Var.c();
            z11 = l3Var.v();
            str2 = l3Var.b();
            String n10 = l3Var.n();
            str3 = l3Var.l();
            float g10 = l3Var.g();
            drawable2 = l3Var.s();
            boolean t10 = l3Var.t();
            str5 = l3Var.p();
            i10 = l3Var.i();
            i11 = l3Var.k();
            z10 = u10;
            z13 = t10;
            f10 = g10;
            str4 = n10;
            drawable = m10;
            str = a10;
        }
        if (i12 != 0) {
            td.a.f(this.B, str2);
            td.c.e(this.B, Boolean.valueOf(z13));
            td.c.e(this.D, Boolean.valueOf(z12));
            td.c.e(this.E, Boolean.valueOf(z10));
            td.a.f(this.V, str);
            this.F.setVisibility(i10);
            this.H.setVisibility(i11);
            this.I.setVisibility(i10);
            this.J.setGaugeViewProgress(f10);
            this.J.setVisibility(i11);
            this.K.setVisibility(i11);
            td.a.i(this.M, str3);
            x3.f.a(this.N, drawable);
            x3.e.c(this.O, str4);
            x3.e.c(this.Q, str5);
            td.c.e(this.R, Boolean.valueOf(z11));
            x3.f.a(this.S, drawable2);
            td.c.e(this.S, Boolean.valueOf(z11));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.W != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.W = 2L;
        }
        H();
    }

    public hi(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[5], (RoundedButtonView) objArr[19], (View) objArr[15], (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[10], (ConstraintLayout) objArr[18], (AppCompatImageView) objArr[12], (AppCompatTextView) objArr[11], (GaugeView) objArr[13], (AppCompatTextView) objArr[14], (View) objArr[16], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[8], (ConstraintLayout) objArr[17], (AppCompatTextView) objArr[6], (ShooterVictoryCountView) objArr[9], (AppCompatImageView) objArr[2]);
        this.W = -1L;
        this.B.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.U = constraintLayout;
        constraintLayout.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArr[3];
        this.V = appCompatImageView;
        appCompatImageView.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        N(view);
        y();
    }
}
