package ae;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.ShooterVictoryCountView;

/* loaded from: classes2.dex */
public class pi extends oi {

    /* renamed from: c0  reason: collision with root package name */
    public static final ViewDataBinding.i f1457c0 = null;

    /* renamed from: d0  reason: collision with root package name */
    public static final SparseIntArray f1458d0;

    /* renamed from: a0  reason: collision with root package name */
    public final View f1459a0;

    /* renamed from: b0  reason: collision with root package name */
    public long f1460b0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1458d0 = sparseIntArray;
        sparseIntArray.put(nd.z0.f42297i6, 16);
        sparseIntArray.put(nd.z0.f42293h6, 17);
        sparseIntArray.put(nd.z0.f42317m6, 18);
        sparseIntArray.put(nd.z0.f42301j6, 19);
        sparseIntArray.put(nd.z0.rank_profile_image_anchor_space, 20);
        sparseIntArray.put(nd.z0.f42286fb, 21);
        sparseIntArray.put(nd.z0.f42281eb, 22);
        sparseIntArray.put(nd.z0.score_container, 23);
        sparseIntArray.put(nd.z0.score_separator_view, 24);
    }

    public pi(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 25, f1457c0, f1458d0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.oi
    public void T(ud.x3 x3Var) {
        this.Z = x3Var;
        synchronized (this) {
            this.f1460b0 |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        Drawable drawable;
        String str3;
        String str4;
        String str5;
        Drawable drawable2;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        String str6;
        synchronized (this) {
            j10 = this.f1460b0;
            this.f1460b0 = 0L;
        }
        ud.x3 x3Var = this.Z;
        int i15 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str7 = null;
        if (i15 == 0 || x3Var == null) {
            str = null;
            str2 = null;
            drawable = null;
            str3 = null;
            str4 = null;
            str5 = null;
            drawable2 = null;
            i10 = 0;
            z10 = false;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            z11 = false;
            z12 = false;
            i14 = 0;
            z13 = false;
            z14 = false;
            z15 = false;
            str6 = null;
        } else {
            str7 = x3Var.e();
            str6 = x3Var.g();
            str2 = x3Var.a();
            drawable = x3Var.l();
            int n10 = x3Var.n();
            z10 = x3Var.x();
            i11 = x3Var.j();
            boolean z16 = x3Var.z();
            i13 = x3Var.i();
            str3 = x3Var.o();
            str4 = x3Var.m();
            str5 = x3Var.f();
            drawable2 = x3Var.t();
            z11 = x3Var.u();
            z12 = x3Var.v();
            i14 = x3Var.p();
            int k10 = x3Var.k();
            z14 = x3Var.w();
            z15 = x3Var.y();
            str = x3Var.h();
            i12 = n10;
            i10 = k10;
            z13 = z16;
        }
        if (i15 != 0) {
            td.c.e(this.f1459a0, Boolean.valueOf(z12));
            td.c.e(this.F, Boolean.valueOf(z10));
            td.a.f(this.G, str7);
            td.c.e(this.G, Boolean.valueOf(z15));
            td.a.f(this.H, str2);
            td.c.e(this.H, Boolean.valueOf(z11));
            td.a.i(this.K, str5);
            td.c.e(this.M, Boolean.valueOf(z14));
            x3.e.c(this.O, str6);
            x3.e.c(this.P, str);
            this.P.setTextColor(i13);
            td.b.h(this.P, Integer.valueOf(i11));
            x3.f.a(this.Q, drawable);
            x3.e.c(this.R, str4);
            this.S.setTextColor(i10);
            x3.e.c(this.V, str3);
            td.b.h(this.V, Integer.valueOf(i14));
            this.W.setTextColor(i12);
            td.c.e(this.X, Boolean.valueOf(z13));
            x3.f.a(this.Y, drawable2);
            td.c.e(this.Y, Boolean.valueOf(z13));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f1460b0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f1460b0 = 2L;
        }
        H();
    }

    public pi(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (Guideline) objArr[17], (Guideline) objArr[16], (Guideline) objArr[19], (Guideline) objArr[18], (RecyclerView) objArr[14], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[6], (ConstraintLayout) objArr[0], (Space) objArr[20], (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[22], (ConstraintLayout) objArr[5], (AppCompatImageView) objArr[21], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[1], (AppCompatImageView) objArr[11], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[10], (ConstraintLayout) objArr[23], (View) objArr[24], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[8], (ShooterVictoryCountView) objArr[13], (AppCompatImageView) objArr[3]);
        this.f1460b0 = -1L;
        View view2 = (View) objArr[15];
        this.f1459a0 = view2;
        view2.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.K.setTag(null);
        this.M.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        this.Y.setTag(null);
        N(view);
        y();
    }
}
