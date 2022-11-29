package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class b4 extends a4 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.topImageView, 1);
        sparseIntArray.put(nd.z0.relativeLayoutInner, 2);
        sparseIntArray.put(nd.z0.linearLayout, 3);
        sparseIntArray.put(nd.z0.optionButton1, 4);
        sparseIntArray.put(nd.z0.optionButton2, 5);
        sparseIntArray.put(nd.z0.titleTextView, 6);
        sparseIntArray.put(nd.z0.bodyTextView, 7);
    }

    public b4(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.J != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.J = 1L;
        }
        H();
    }

    public b4(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[7], (LinearLayout) objArr[3], (RoundedButtonView) objArr[4], (RoundedButtonView) objArr[5], (RelativeLayout) objArr[0], (RelativeLayout) objArr[2], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[1]);
        this.J = -1L;
        this.F.setTag(null);
        N(view);
        y();
    }
}
