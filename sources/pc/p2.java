package pc;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class p2 extends o2 {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(nc.e.full_name_title, 6);
        sparseIntArray.put(nc.e.full_name_kana_title, 7);
        sparseIntArray.put(nc.e.birthday_title, 8);
        sparseIntArray.put(nc.e.postal_code_title, 9);
        sparseIntArray.put(nc.e.address_title, 10);
    }

    public p2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // pc.o2
    public void T(ad.u0 u0Var) {
        this.L = u0Var;
        synchronized (this) {
            this.N |= 1;
        }
        c(nc.a.f41788b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            j10 = this.N;
            this.N = 0L;
        }
        ad.u0 u0Var = this.L;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str5 = null;
        if (i10 == 0 || u0Var == null) {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        } else {
            String d10 = u0Var.d();
            String g10 = u0Var.g();
            String k10 = u0Var.k();
            String b10 = u0Var.b();
            str3 = u0Var.h();
            str = d10;
            str5 = b10;
            str4 = k10;
            str2 = g10;
        }
        if (i10 != 0) {
            x3.e.c(this.B, str5);
            x3.e.c(this.D, str);
            x3.e.c(this.F, str2);
            x3.e.c(this.G, str3);
            x3.e.c(this.J, str4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.N != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.N = 2L;
        }
        H();
    }

    public p2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[9]);
        this.N = -1L;
        this.B.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        this.J.setTag(null);
        N(view);
        y();
    }
}
