package s9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public class x0 extends w0 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(q9.g.F, 6);
        sparseIntArray.put(q9.g.f48829f, 7);
    }

    public x0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // s9.w0
    public void T(z9.z zVar) {
        this.E = zVar;
        synchronized (this) {
            this.K |= 1;
        }
        c(q9.a.f48787b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        int i10;
        int i11;
        boolean z10;
        int i12;
        String str2;
        synchronized (this) {
            j10 = this.K;
            this.K = 0L;
        }
        z9.z zVar = this.E;
        int i13 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i13 == 0 || zVar == null) {
            str = null;
            i10 = 0;
            i11 = 0;
            z10 = false;
            i12 = 0;
            str2 = null;
        } else {
            String c10 = zVar.c();
            int e10 = zVar.e();
            str = zVar.d();
            boolean g10 = zVar.g();
            String f10 = zVar.f();
            i12 = zVar.a();
            str2 = c10;
            str3 = f10;
            z10 = g10;
            i11 = zVar.b();
            i10 = e10;
        }
        if (i13 != 0) {
            td.c.c(this.C, 21, 1, Integer.valueOf(i12), Integer.valueOf(i10));
            this.G.setTextColor(i11);
            td.c.e(this.G, Boolean.valueOf(z10));
            x3.e.c(this.H, str3);
            this.H.setTextColor(i11);
            x3.e.c(this.I, str);
            this.I.setTextColor(i11);
            x3.e.c(this.J, str2);
            this.J.setTextColor(i11);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.K = 2L;
        }
        H();
    }

    public x0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[7], (View) objArr[1], (View) objArr[6]);
        this.K = -1L;
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[2];
        this.G = appCompatTextView;
        appCompatTextView.setTag(null);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArr[3];
        this.H = appCompatTextView2;
        appCompatTextView2.setTag(null);
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) objArr[4];
        this.I = appCompatTextView3;
        appCompatTextView3.setTag(null);
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) objArr[5];
        this.J = appCompatTextView4;
        appCompatTextView4.setTag(null);
        N(view);
        y();
    }
}
