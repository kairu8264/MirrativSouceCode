package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes2.dex */
public class hm extends gm {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(nd.z0.prefix_text_view, 2);
    }

    public hm(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 3, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.gm
    public void T(ud.g3 g3Var) {
        this.E = g3Var;
        synchronized (this) {
            this.F |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.F;
            this.F = 0L;
        }
        ud.g3 g3Var = this.E;
        int i10 = 0;
        int i11 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str2 = null;
        Integer num = null;
        if (i11 != 0) {
            if (g3Var != null) {
                str = g3Var.a();
                num = g3Var.b();
            } else {
                str = null;
            }
            i10 = ViewDataBinding.J(num);
            str2 = str;
        }
        if (i11 != 0) {
            x3.e.c(this.D, str2);
            this.D.setTextColor(i10);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.F = 2L;
        }
        H();
    }

    public hm(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (MaterialCardView) objArr[0], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[1]);
        this.F = -1L;
        this.B.setTag(null);
        this.D.setTag(null);
        N(view);
        y();
    }
}
