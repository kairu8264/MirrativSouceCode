package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class t8 extends s8 {

    /* renamed from: a0  reason: collision with root package name */
    public static final ViewDataBinding.i f1504a0 = null;

    /* renamed from: b0  reason: collision with root package name */
    public static final SparseIntArray f1505b0;
    public final ConstraintLayout T;
    public final ConstraintLayout U;
    public final ConstraintLayout V;
    public final ConstraintLayout W;
    public final ConstraintLayout X;
    public final ConstraintLayout Y;
    public long Z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1505b0 = sparseIntArray;
        sparseIntArray.put(nd.z0.memorial_header1_text_view, 15);
        sparseIntArray.put(nd.z0.memorial_header2_text_view, 16);
        sparseIntArray.put(nd.z0.birthday_popup_prev_main_text_view, 17);
        sparseIntArray.put(nd.z0.birthday_popup_prev_sub_text_view, 18);
        sparseIntArray.put(nd.z0.birthday_popup_on_main_text_view, 19);
        sparseIntArray.put(nd.z0.birthday_popup_on_sub_text_view, 20);
        sparseIntArray.put(nd.z0.birthday_popup_next_main_text_view, 21);
        sparseIntArray.put(nd.z0.birthday_popup_next_sub_text_view, 22);
    }

    public t8(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 23, f1504a0, f1505b0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.s8
    public void T(ud.k kVar) {
        this.S = kVar;
        synchronized (this) {
            this.Z |= 1;
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
        boolean z14;
        synchronized (this) {
            j10 = this.Z;
            this.Z = 0L;
        }
        String str = null;
        ud.k kVar = this.S;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z15 = false;
        if (i10 == 0 || kVar == null) {
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
        } else {
            boolean g10 = kVar.g();
            boolean c10 = kVar.c();
            str = kVar.a();
            z11 = kVar.f();
            z13 = kVar.d();
            z14 = kVar.e();
            z12 = kVar.b();
            z10 = g10;
            z15 = c10;
        }
        if (i10 != 0) {
            td.c.e(this.B, Boolean.valueOf(z15));
            td.c.e(this.C, Boolean.valueOf(z12));
            td.c.e(this.F, Boolean.valueOf(z13));
            td.c.e(this.I, Boolean.valueOf(z11));
            td.c.e(this.L, Boolean.valueOf(z15));
            td.c.e(this.U, Boolean.valueOf(z11));
            td.c.e(this.V, Boolean.valueOf(z13));
            td.c.e(this.W, Boolean.valueOf(z12));
            td.c.e(this.X, Boolean.valueOf(z10));
            td.c.e(this.Y, Boolean.valueOf(z14));
            x3.e.c(this.O, str);
            x3.e.c(this.P, str);
            td.c.e(this.Q, Boolean.valueOf(z10));
            td.c.e(this.R, Boolean.valueOf(z14));
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

    public t8(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[13], (AppCompatTextView) objArr[21], (AppCompatTextView) objArr[22], (AppCompatImageView) objArr[11], (AppCompatTextView) objArr[19], (AppCompatTextView) objArr[20], (AppCompatImageView) objArr[9], (AppCompatTextView) objArr[17], (AppCompatTextView) objArr[18], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[15], (AppCompatTextView) objArr[16], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[4]);
        this.Z = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.F.setTag(null);
        this.I.setTag(null);
        this.L.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.T = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[10];
        this.U = constraintLayout2;
        constraintLayout2.setTag(null);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) objArr[12];
        this.V = constraintLayout3;
        constraintLayout3.setTag(null);
        ConstraintLayout constraintLayout4 = (ConstraintLayout) objArr[14];
        this.W = constraintLayout4;
        constraintLayout4.setTag(null);
        ConstraintLayout constraintLayout5 = (ConstraintLayout) objArr[2];
        this.X = constraintLayout5;
        constraintLayout5.setTag(null);
        ConstraintLayout constraintLayout6 = (ConstraintLayout) objArr[5];
        this.Y = constraintLayout6;
        constraintLayout6.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        N(view);
        y();
    }
}
