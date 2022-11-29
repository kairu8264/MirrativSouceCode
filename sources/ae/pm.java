package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.MultipleUserView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes2.dex */
public class pm extends om {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final FrameLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(nd.z0.card_view, 1);
        sparseIntArray.put(nd.z0.card_background_view, 2);
        sparseIntArray.put(nd.z0.content_text_view, 3);
        sparseIntArray.put(nd.z0.f42347tg, 4);
    }

    public pm(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.G = 1L;
        }
        H();
    }

    public pm(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[2], (MaterialCardView) objArr[1], (AppCompatTextView) objArr[3], (MultipleUserView) objArr[4]);
        this.G = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.F = frameLayout;
        frameLayout.setTag(null);
        N(view);
        y();
    }
}
