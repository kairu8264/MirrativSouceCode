package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.TopToastMessageView;

/* loaded from: classes2.dex */
public class j1 extends i1 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public final RelativeLayout C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(xb.o.toast_view, 1);
    }

    public j1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 2, E, F));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.D = 0L;
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
            this.D = 1L;
        }
        H();
    }

    public j1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (TopToastMessageView) objArr[1]);
        this.D = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.C = relativeLayout;
        relativeLayout.setTag(null);
        N(view);
        y();
    }
}
