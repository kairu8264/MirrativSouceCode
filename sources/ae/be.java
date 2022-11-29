package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Switch;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class be extends ae {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final RelativeLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(nd.z0.I6, 1);
        sparseIntArray.put(nd.z0.M, 2);
        sparseIntArray.put(nd.z0.f42287fg, 3);
        sparseIntArray.put(nd.z0.f42320n3, 4);
        sparseIntArray.put(nd.z0.f42289ge, 5);
    }

    public be(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, I, J));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.H = 0L;
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
            this.H = 1L;
        }
        H();
    }

    public be(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[1], (Switch) objArr[5], (AppCompatTextView) objArr[3]);
        this.H = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.G = relativeLayout;
        relativeLayout.setTag(null);
        N(view);
        y();
    }
}
