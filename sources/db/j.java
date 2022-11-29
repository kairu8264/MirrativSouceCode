package db;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class j extends i {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(wa.e.f58537l, 6);
        sparseIntArray.put(wa.e.f58536j0, 7);
        sparseIntArray.put(wa.e.f58543y, 8);
        sparseIntArray.put(wa.e.f58544z, 9);
        sparseIntArray.put(wa.e.f58539m, 10);
    }

    public j(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // db.i
    public void V(ya.h0 h0Var) {
        this.L = h0Var;
        synchronized (this) {
            this.N |= 1;
        }
        c(wa.a.f58500a);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        synchronized (this) {
            j10 = this.N;
            this.N = 0L;
        }
        ya.h0 h0Var = this.L;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str6 = null;
        if (i10 == 0 || h0Var == null) {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        } else {
            String g10 = h0Var.g();
            str = h0Var.d();
            String a10 = h0Var.a();
            str4 = h0Var.e();
            str5 = h0Var.c();
            str3 = h0Var.b();
            str2 = g10;
            str6 = a10;
        }
        if (i10 != 0) {
            td.a.f(this.D, str6);
            this.G.setHint(str);
            x3.e.c(this.G, str2);
            x3.e.c(this.H, str4);
            x3.e.c(this.I, str3);
            x3.e.c(this.K, str5);
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

    public j(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[10], (AppCompatImageView) objArr[3], (View) objArr[8], (View) objArr[9], (EditText) objArr[1], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[5]);
        this.N = -1L;
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.K.setTag(null);
        N(view);
        y();
    }
}
