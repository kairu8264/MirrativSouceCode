package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.feature.main.ReportDialogView;

/* loaded from: classes2.dex */
public class a2 extends z1 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(xb.o.report_view, 1);
    }

    public a2(androidx.databinding.e eVar, View view) {
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

    public a2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ReportDialogView) objArr[1], (RelativeLayout) objArr[0]);
        this.D = -1L;
        this.C.setTag(null);
        N(view);
        y();
    }
}
