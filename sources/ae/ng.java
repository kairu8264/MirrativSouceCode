package ae;

import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.LiveTimeView;
import com.dena.mirrorman.customview.MultipleUserView;

/* loaded from: classes2.dex */
public class ng extends mg {

    /* renamed from: b0  reason: collision with root package name */
    public static final ViewDataBinding.i f1438b0 = null;

    /* renamed from: c0  reason: collision with root package name */
    public static final SparseIntArray f1439c0;
    public final ConstraintLayout Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f1440a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1439c0 = sparseIntArray;
        sparseIntArray.put(nd.z0.space_preview_image, 19);
        sparseIntArray.put(nd.z0.collab_live_image_view, 20);
        sparseIntArray.put(nd.z0.collab_text_view, 21);
        sparseIntArray.put(nd.z0.M7, 22);
        sparseIntArray.put(nd.z0.gifter_view, 23);
    }

    public ng(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 24, f1438b0, f1439c0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.mg
    public void T(ud.a2 a2Var) {
        this.Y = a2Var;
        synchronized (this) {
            this.f1440a0 |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        int i12;
        boolean z15;
        boolean z16;
        int i13;
        String str;
        String str2;
        SpannableString spannableString;
        String str3;
        String str4;
        String str5;
        String str6;
        synchronized (this) {
            j10 = this.f1440a0;
            this.f1440a0 = 0L;
        }
        ud.a2 a2Var = this.Y;
        int i14 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z17 = false;
        if (i14 == 0 || a2Var == null) {
            z10 = false;
            i10 = 0;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            i11 = 0;
            i12 = 0;
            z15 = false;
            z16 = false;
            i13 = 0;
            str = null;
            str2 = null;
            spannableString = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        } else {
            boolean r10 = a2Var.r();
            str2 = a2Var.k();
            i10 = a2Var.c();
            z11 = a2Var.s();
            spannableString = a2Var.g();
            str3 = a2Var.i();
            str4 = a2Var.l();
            str5 = a2Var.a();
            z12 = a2Var.w();
            z13 = a2Var.u();
            z14 = a2Var.t();
            i11 = a2Var.m();
            boolean q10 = a2Var.q();
            i12 = a2Var.h();
            z15 = a2Var.x();
            z16 = a2Var.v();
            String e10 = a2Var.e();
            i13 = a2Var.o();
            str6 = a2Var.j();
            z10 = r10;
            z17 = q10;
            str = e10;
        }
        if (i14 != 0) {
            td.a.d(this.B, str5);
            td.c.e(this.C, Boolean.valueOf(z17));
            td.c.e(this.F, Boolean.valueOf(z10));
            AppCompatImageView appCompatImageView = this.H;
            Boolean bool = Boolean.TRUE;
            td.a.r(appCompatImageView, str6, 4, null, bool, null, null, null);
            td.b.a(this.I, Integer.valueOf(i10));
            td.c.e(this.J, Boolean.valueOf(z14));
            td.c.e(this.K, Boolean.valueOf(z13));
            x3.e.c(this.L, str);
            td.c.e(this.N, Boolean.valueOf(z16));
            td.b.g(this.O, Integer.valueOf(i12));
            td.b.f(this.O, spannableString);
            td.c.e(this.P, Boolean.valueOf(z12));
            td.c.e(this.Q, Boolean.valueOf(z15));
            td.a.h(this.R, str3);
            td.a.v(this.S, str2);
            td.a.r(this.T, str4, 4, null, null, null, null, bool);
            td.c.e(this.V, Boolean.valueOf(z11));
            td.c.e(this.W, Boolean.valueOf(z11));
            td.b.d(this.W, Integer.valueOf(i11), null);
            td.b.l(this.X, Integer.valueOf(i13));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f1440a0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f1440a0 = 2L;
        }
        H();
    }

    public ng(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[8], (AppCompatImageView) objArr[20], (AppCompatTextView) objArr[21], (View) objArr[10], (MultipleUserView) objArr[23], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[14], (Barrier) objArr[22], (LiveTimeView) objArr[9], (AppCompatTextView) objArr[11], (AppCompatImageView) objArr[13], (AppCompatImageView) objArr[18], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[3], (Space) objArr[19], (AppCompatImageView) objArr[16], (AppCompatTextView) objArr[17], (AppCompatTextView) objArr[15]);
        this.f1440a0 = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Z = constraintLayout;
        constraintLayout.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        this.T.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        N(view);
        y();
    }
}
