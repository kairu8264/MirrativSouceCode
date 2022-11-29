package ae;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ShooterVictoryCountView;

/* loaded from: classes2.dex */
public class nm extends mm {

    /* renamed from: a0  reason: collision with root package name */
    public static final ViewDataBinding.i f1441a0 = null;

    /* renamed from: b0  reason: collision with root package name */
    public static final SparseIntArray f1442b0;
    public final ConstraintLayout X;
    public final AppCompatImageView Y;
    public long Z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1442b0 = sparseIntArray;
        sparseIntArray.put(nd.z0.user_info_container, 16);
        sparseIntArray.put(nd.z0.Ka, 17);
        sparseIntArray.put(nd.z0.score_info_container, 18);
        sparseIntArray.put(nd.z0.total_score_point_container, 19);
        sparseIntArray.put(nd.z0.total_score_unit_text_view, 20);
        sparseIntArray.put(nd.z0.score_space, 21);
        sparseIntArray.put(nd.z0.rating_point_container, 22);
    }

    public nm(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 23, f1441a0, f1442b0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.mm
    public void T(ud.n3 n3Var) {
        this.W = n3Var;
        synchronized (this) {
            this.Z |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        long j11;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        SpannableString spannableString;
        Drawable drawable;
        String str;
        String str2;
        String str3;
        String str4;
        Drawable drawable2;
        SpannableString spannableString2;
        String str5;
        String str6;
        synchronized (this) {
            j10 = this.Z;
            this.Z = 0L;
        }
        ud.n3 n3Var = this.W;
        int i12 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        if (i12 == 0 || n3Var == null) {
            j11 = j10;
            i10 = 0;
            i11 = 0;
            z10 = false;
            z11 = false;
            spannableString = null;
            drawable = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            drawable2 = null;
            spannableString2 = null;
            str5 = null;
            str6 = null;
        } else {
            str2 = n3Var.b();
            str4 = n3Var.e();
            drawable2 = n3Var.g();
            i11 = n3Var.j();
            z10 = n3Var.q();
            spannableString2 = n3Var.h();
            str5 = n3Var.l();
            str6 = n3Var.i();
            String d10 = n3Var.d();
            z11 = n3Var.c();
            Drawable p10 = n3Var.p();
            String a10 = n3Var.a();
            SpannableString k10 = n3Var.k();
            i10 = n3Var.f();
            str3 = d10;
            drawable = p10;
            str = a10;
            spannableString = k10;
            j11 = j10;
        }
        if (i12 != 0) {
            td.a.f(this.Y, str);
            td.a.i(this.C, str3);
            td.a.f(this.D, str2);
            td.c.e(this.D, Boolean.valueOf(z11));
            x3.e.c(this.E, str4);
            x3.f.a(this.F, drawable2);
            x3.e.c(this.H, str6);
            x3.e.c(this.I, spannableString2);
            this.K.setTextColor(i10);
            x3.e.c(this.P, spannableString);
            x3.e.c(this.Q, str5);
            this.R.setTextColor(i11);
            td.c.e(this.U, Boolean.valueOf(z10));
            x3.f.a(this.V, drawable);
            td.c.e(this.V, Boolean.valueOf(z10));
        }
        if ((j11 & 2) != 0) {
            ConstraintLayout constraintLayout = this.J;
            ConstraintLayout constraintLayout2 = this.J;
            int i13 = nd.w0.T0;
            td.c.c(constraintLayout, 8, 1, Integer.valueOf(ViewDataBinding.t(constraintLayout2, i13)), null);
            td.c.c(this.N, 8, 1, Integer.valueOf(ViewDataBinding.t(this.N, i13)), null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Z = 2L;
        }
        H();
    }

    public nm(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[17], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[5], (AppCompatImageView) objArr[13], (ConstraintLayout) objArr[22], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[15], (ConstraintLayout) objArr[11], (AppCompatTextView) objArr[12], (ConstraintLayout) objArr[18], (Space) objArr[21], (ConstraintLayout) objArr[7], (ConstraintLayout) objArr[19], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[20], (ConstraintLayout) objArr[16], (ShooterVictoryCountView) objArr[6], (AppCompatImageView) objArr[2]);
        this.Z = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.X = constraintLayout;
        constraintLayout.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArr[3];
        this.Y = appCompatImageView;
        appCompatImageView.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.N.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.U.setTag(null);
        this.V.setTag(null);
        N(view);
        y();
    }
}
