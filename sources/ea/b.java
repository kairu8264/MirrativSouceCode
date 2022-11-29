package ea;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import da.f;

/* loaded from: classes.dex */
public class b extends a {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public final FrameLayout C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(f.f29337a, 1);
    }

    public b(e eVar, View view) {
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

    public b(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[1]);
        this.D = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.C = frameLayout;
        frameLayout.setTag(null);
        N(view);
        y();
    }
}
