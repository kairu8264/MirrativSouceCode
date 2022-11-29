package s9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public class r1 extends q1 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L = null;
    public final View I;
    public long J;

    public r1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 7, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // s9.q1
    public void T(ud.q qVar) {
        this.H = qVar;
        synchronized (this) {
            this.J |= 1;
        }
        c(q9.a.f48787b);
        super.H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        String str;
        String str2;
        String str3;
        boolean z11;
        int i10;
        synchronized (this) {
            j10 = this.J;
            this.J = 0L;
        }
        ud.q qVar = this.H;
        int i11 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        int i12 = 0;
        if (i11 != 0) {
            if (qVar != null) {
                String k10 = qVar.k();
                int p10 = qVar.p();
                String c10 = qVar.c();
                i10 = p10;
                i12 = qVar.q();
                str3 = qVar.i();
                str2 = c10;
                str = k10;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                i10 = 0;
            }
            int i13 = i12 ^ 1;
            int i14 = i10;
            z11 = i12;
            i12 = i14;
            z10 = i13;
        } else {
            z10 = 0;
            str = null;
            str2 = null;
            str3 = null;
            z11 = false;
        }
        if (i11 != 0) {
            td.a.F(this.B, Integer.valueOf(i12));
            td.c.e(this.I, Boolean.valueOf(z10));
            x3.e.c(this.D, str);
            td.a.f(this.E, str3);
            x3.e.c(this.F, str2);
            this.G.setSelected(z11);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.J != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.J = 2L;
        }
        H();
    }

    public r1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[2], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[6]);
        this.J = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        View view2 = (View) objArr[5];
        this.I = view2;
        view2.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        N(view);
        y();
    }
}
