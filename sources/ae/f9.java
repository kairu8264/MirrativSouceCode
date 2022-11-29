package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class f9 extends e9 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J = null;
    public long H;

    public f9(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, I, J));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.e9
    public void T(ud.w wVar) {
        this.G = wVar;
        synchronized (this) {
            this.H |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j10 = this.H;
            this.H = 0L;
        }
        boolean z10 = false;
        ud.w wVar = this.G;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str4 = null;
        if (i10 == 0 || wVar == null) {
            str = null;
            str2 = null;
            str3 = null;
        } else {
            z10 = wVar.c();
            String a10 = wVar.a();
            String e10 = wVar.e();
            String b10 = wVar.b();
            str3 = wVar.d();
            str = a10;
            str4 = b10;
            str2 = e10;
        }
        if (i10 != 0) {
            x3.e.c(this.C, str4);
            x3.e.c(this.D, str);
            td.c.e(this.D, Boolean.valueOf(z10));
            td.a.f(this.E, str3);
            x3.e.c(this.F, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.H = 2L;
        }
        H();
    }

    public f9(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[2]);
        this.H = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        N(view);
        y();
    }
}
