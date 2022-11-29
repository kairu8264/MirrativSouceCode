package s9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes.dex */
public class d1 extends c1 {
    public static final ViewDataBinding.i W = null;
    public static final SparseIntArray X;
    public long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(q9.g.mark_container, 13);
        sparseIntArray.put(q9.g.mark_left_margin_view, 14);
        sparseIntArray.put(q9.g.mark_right_margin_view, 15);
        sparseIntArray.put(q9.g.mark_top_margin_view, 16);
        sparseIntArray.put(q9.g.mark_bottom_margin_view, 17);
        sparseIntArray.put(q9.g.bottom_barrier, 18);
    }

    public d1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 19, W, X));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // s9.c1
    public void T(ud.q qVar) {
        this.U = qVar;
        synchronized (this) {
            this.V |= 1;
        }
        c(q9.a.f48788c);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i13;
        boolean z15;
        int i14;
        String str3;
        int i15;
        boolean z16;
        synchronized (this) {
            j10 = this.V;
            this.V = 0L;
        }
        ud.q qVar = this.U;
        int i16 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str4 = null;
        boolean z17 = false;
        int i17 = 0;
        if (i16 != 0) {
            if (qVar != null) {
                int r10 = qVar.r();
                i17 = qVar.t();
                String i18 = qVar.i();
                i11 = qVar.p();
                str3 = qVar.k();
                z10 = qVar.A();
                i12 = qVar.o();
                str2 = qVar.c();
                z11 = qVar.x();
                z12 = qVar.z();
                z13 = qVar.f();
                z14 = qVar.E();
                i13 = qVar.s();
                z15 = qVar.D();
                z16 = qVar.C();
                i15 = r10;
                str4 = i18;
            } else {
                str3 = null;
                str2 = null;
                i15 = 0;
                z16 = false;
                i11 = 0;
                z10 = false;
                i12 = 0;
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
                i13 = 0;
                z15 = false;
            }
            i14 = i15;
            str = str4;
            str4 = str3;
            boolean z18 = z16;
            i10 = c3.a.d(u().getContext(), i17);
            z17 = z18;
        } else {
            str = null;
            str2 = null;
            i10 = 0;
            i11 = 0;
            z10 = false;
            i12 = 0;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            i13 = 0;
            z15 = false;
            i14 = 0;
        }
        if (i16 != 0) {
            td.c.e(this.C, Boolean.valueOf(z17));
            td.a.F(this.D, Integer.valueOf(i11));
            td.c.e(this.F, Boolean.valueOf(z12));
            td.c.e(this.L, Boolean.valueOf(z13));
            td.c.e(this.M, Boolean.valueOf(z15));
            td.c.a(this.N, Integer.valueOf(i12));
            td.c.e(this.N, Boolean.valueOf(z11));
            x3.e.c(this.O, str4);
            this.O.setTextColor(i10);
            td.c.e(this.O, Boolean.valueOf(z10));
            td.a.D(this.P, str);
            x3.e.c(this.Q, str2);
            td.c.a(this.R, Integer.valueOf(i13));
            td.a.F(this.S, Integer.valueOf(i14));
            td.c.e(this.T, Boolean.valueOf(z14));
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

    public d1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (Barrier) objArr[18], (Space) objArr[10], (AppCompatImageView) objArr[7], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[12], (View) objArr[17], (ConstraintLayout) objArr[13], (View) objArr[14], (View) objArr[15], (View) objArr[16], (View) objArr[4], (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[6], (AppCompatTextView) objArr[11], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[8], (View) objArr[2], (AppCompatImageView) objArr[3], (RoundedButtonView) objArr[9]);
        this.V = -1L;
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        this.T.setTag(null);
        N(view);
        y();
    }
}
