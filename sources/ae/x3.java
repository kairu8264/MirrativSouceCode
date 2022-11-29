package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class x3 extends w3 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final FrameLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(nd.z0.f42342s6, 1);
        sparseIntArray.put(nd.z0.header_image, 2);
        sparseIntArray.put(nd.z0.Ke, 3);
        sparseIntArray.put(nd.z0.f42296i0, 4);
        sparseIntArray.put(nd.z0.body2, 5);
        sparseIntArray.put(nd.z0.button_yes, 6);
    }

    public x3(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 7, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.I != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.I = 1L;
        }
        H();
    }

    public x3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[5], (AppCompatButton) objArr[6], (RelativeLayout) objArr[1], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[3]);
        this.I = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.H = frameLayout;
        frameLayout.setTag(null);
        N(view);
        y();
    }
}
