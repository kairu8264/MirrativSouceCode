package kb;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.player.gifting.GiftNotificationView;
import hb.w1;

/* loaded from: classes2.dex */
public class i0 extends h0 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final LinearLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(w1.item_first, 1);
        sparseIntArray.put(w1.item_second, 2);
        sparseIntArray.put(w1.item_third, 3);
    }

    public i0(androidx.databinding.e eVar, View view) {
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

    public i0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (GiftNotificationView) objArr[1], (GiftNotificationView) objArr[2], (GiftNotificationView) objArr[3]);
        this.F = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.E = linearLayout;
        linearLayout.setTag(null);
        N(view);
        y();
    }
}
