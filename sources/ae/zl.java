package ae;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class zl extends yl {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F = null;
    public long D;

    public zl(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 1, E, F));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.yl
    public void T(ud.e3 e3Var) {
        this.C = e3Var;
        synchronized (this) {
            this.D |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.D;
            this.D = 0L;
        }
        ud.e3 e3Var = this.C;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        Drawable drawable = null;
        if (i10 == 0 || e3Var == null) {
            str = null;
        } else {
            str = e3Var.b();
            drawable = e3Var.a();
        }
        if (i10 != 0) {
            x3.f.a(this.B, drawable);
            x3.e.c(this.B, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.D != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.D = 2L;
        }
        H();
    }

    public zl(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[0]);
        this.D = -1L;
        this.B.setTag(null);
        N(view);
        y();
    }
}
