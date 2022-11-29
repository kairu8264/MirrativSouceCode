package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.YellRankIconView;
import ud.x1;

/* loaded from: classes2.dex */
public class fg extends eg {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(nd.z0.Lg, 4);
    }

    public fg(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, I, J));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.eg
    public void T(x1.e eVar) {
        this.G = eVar;
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
        synchronized (this) {
            j10 = this.H;
            this.H = 0L;
        }
        boolean z10 = false;
        x1.e eVar = this.G;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i10 == 0 || eVar == null) {
            str = null;
            str2 = null;
        } else {
            String d10 = eVar.d();
            str = eVar.b();
            String a10 = eVar.a();
            z10 = eVar.g();
            str2 = d10;
            str3 = a10;
        }
        if (i10 != 0) {
            td.a.f(this.C, str3);
            td.c.e(this.C, Boolean.valueOf(z10));
            td.a.i(this.D, str);
            x3.e.c(this.E, str2);
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

    public fg(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[3], (YellRankIconView) objArr[4]);
        this.H = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        N(view);
        y();
    }
}
