package t8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.FollowButtonView;

/* loaded from: classes.dex */
public class z0 extends y0 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final CardView G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(r8.e1.f49877o, 1);
        sparseIntArray.put(r8.e1.f49867h0, 2);
        sparseIntArray.put(r8.e1.f49868i0, 3);
        sparseIntArray.put(r8.e1.f49886v2, 4);
        sparseIntArray.put(r8.e1.f49888w2, 5);
    }

    public z0(androidx.databinding.e eVar, View view) {
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

    public z0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[1], (FollowButtonView) objArr[2], (AppCompatTextView) objArr[3], (LinearLayout) objArr[4], (AppCompatTextView) objArr[5]);
        this.H = -1L;
        CardView cardView = (CardView) objArr[0];
        this.G = cardView;
        cardView.setTag(null);
        N(view);
        y();
    }
}
