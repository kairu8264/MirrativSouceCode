package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class p7 extends o7 {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public final RelativeLayout D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(nd.z0.avatar, 1);
        sparseIntArray.put(nd.z0.f42270bg, 2);
    }

    public p7(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 3, F, G));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.E = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.E = 1L;
        }
        H();
    }

    public p7(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[2]);
        this.E = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.D = relativeLayout;
        relativeLayout.setTag(null);
        N(view);
        y();
    }
}
