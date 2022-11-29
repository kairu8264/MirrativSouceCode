package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class a2 extends z1 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final FrameLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(nd.z0.A8, 1);
        sparseIntArray.put(nd.z0.ok_button_view, 2);
        sparseIntArray.put(nd.z0.cancel_button_view, 3);
    }

    public a2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 4, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.F = 0L;
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
            this.F = 1L;
        }
        H();
    }

    public a2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RoundedButtonView) objArr[3], (TextView) objArr[1], (RoundedButtonView) objArr[2]);
        this.F = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.E = frameLayout;
        frameLayout.setTag(null);
        N(view);
        y();
    }
}
