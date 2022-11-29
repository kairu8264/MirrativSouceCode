package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class n5 extends m5 {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(nd.z0.Ag, 1);
        sparseIntArray.put(nd.z0.f42359w1, 2);
    }

    public n5(androidx.databinding.e eVar, View view) {
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

    public n5(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ImageButton) objArr[2], (WebView) objArr[1], (RelativeLayout) objArr[0]);
        this.E = -1L;
        this.D.setTag(null);
        N(view);
        y();
    }
}
