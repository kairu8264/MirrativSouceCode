package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class s5 extends r5 {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final ConstraintLayout M;
    public final AppCompatTextView N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(xb.o.inner_container, 9);
        sparseIntArray.put(xb.o.no_thumbnail_image_view, 10);
        sparseIntArray.put(xb.o.no_thumbnail_text_view, 11);
    }

    public s5(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, P, Q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ac.r5
    public void T(lc.b bVar) {
        this.L = bVar;
        synchronized (this) {
            this.O |= 1;
        }
        c(xb.b.f59841d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        synchronized (this) {
            j10 = this.O;
            this.O = 0L;
        }
        lc.b bVar = this.L;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        if (i10 == 0 || bVar == null) {
            z10 = false;
            z11 = false;
            z12 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        } else {
            str = bVar.a();
            str2 = bVar.f();
            str3 = bVar.e();
            str4 = bVar.c();
            str5 = bVar.d();
            z11 = bVar.j();
            z12 = bVar.h();
            z10 = bVar.i();
        }
        if (i10 != 0) {
            td.a.d(this.B, str);
            x3.e.c(this.C, str4);
            td.c.e(this.N, Boolean.valueOf(z11));
            x3.e.c(this.E, str5);
            td.c.e(this.F, Boolean.valueOf(z10));
            td.c.e(this.I, Boolean.valueOf(z12));
            td.a.G(this.J, str3, null, null);
            x3.e.c(this.K, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.O != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.O = 2L;
        }
        H();
    }

    public s5(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[8], (View) objArr[9], (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[2], (AppCompatImageView) objArr[10], (AppCompatTextView) objArr[11], (ConstraintLayout) objArr[4], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[5]);
        this.O = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[7];
        this.N = appCompatTextView;
        appCompatTextView.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        N(view);
        y();
    }
}
