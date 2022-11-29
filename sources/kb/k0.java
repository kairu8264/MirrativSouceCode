package kb;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout;
import com.dena.mirrorman.widget.ViewPagerIndicator;
import hb.w1;

/* loaded from: classes2.dex */
public class k0 extends j0 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(w1.gift_panel_recycler_view, 1);
        sparseIntArray.put(w1.pagerIndicator, 2);
        sparseIntArray.put(w1.live_game_help_image_view, 3);
        sparseIntArray.put(w1.f35025s3, 4);
    }

    public k0(androidx.databinding.e eVar, View view) {
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

    public k0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RecyclerView) objArr[1], (AppCompatImageView) objArr[3], (ViewPagerIndicator) objArr[2], (GiftPanelTabLayout) objArr[4]);
        this.G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
