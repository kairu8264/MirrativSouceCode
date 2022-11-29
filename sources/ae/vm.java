package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.TriangleView;

/* loaded from: classes2.dex */
public class vm extends um {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final ConstraintLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(nd.z0.f42302jd, 3);
        sparseIntArray.put(nd.z0.f42316m0, 4);
        sparseIntArray.put(nd.z0.L, 5);
        sparseIntArray.put(nd.z0.consuming_holiday_text_view, 6);
        sparseIntArray.put(nd.z0.holiday_toast_text1_text_view, 7);
        sparseIntArray.put(nd.z0.holiday_toast_text2_text_view, 8);
        sparseIntArray.put(nd.z0.E3, 9);
        sparseIntArray.put(nd.z0.f42354v7, 10);
        sparseIntArray.put(nd.z0.triangle_bottom_view, 11);
        sparseIntArray.put(nd.z0.triangle_bottom_inner_view, 12);
    }

    public vm(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 13, Q, R));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.um
    public void T(ud.b4 b4Var) {
        this.N = b4Var;
        synchronized (this) {
            this.P |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.P;
            this.P = 0L;
        }
        ud.b4 b4Var = this.N;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str2 = null;
        if (i10 == 0 || b4Var == null) {
            str = null;
        } else {
            str2 = b4Var.a();
            str = b4Var.c();
        }
        if (i10 != 0) {
            x3.e.c(this.F, str2);
            x3.e.c(this.J, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.P != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.P = 2L;
        }
        H();
    }

    public vm(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[5], (View) objArr[4], (AppCompatTextView) objArr[6], (View) objArr[9], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[8], (LinearLayout) objArr[10], (AppCompatTextView) objArr[1], (View) objArr[3], (TriangleView) objArr[12], (TriangleView) objArr[11]);
        this.P = -1L;
        this.F.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        this.J.setTag(null);
        N(view);
        y();
    }
}
