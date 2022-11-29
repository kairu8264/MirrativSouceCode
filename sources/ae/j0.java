package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public class j0 extends i0 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nd.z0.Ue, 1);
        sparseIntArray.put(nd.z0.A1, 2);
        sparseIntArray.put(nd.z0.f42313le, 3);
        sparseIntArray.put(nd.z0.f42325ng, 4);
        sparseIntArray.put(nd.z0.group_shot_tutorial_background_view, 5);
        sparseIntArray.put(nd.z0.group_shot_tutorial_image_view, 6);
        sparseIntArray.put(nd.z0.group_shot_tutorial_close_image_view, 7);
        sparseIntArray.put(nd.z0.group_shot_floating_action_button, 8);
    }

    public j0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 9, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.K = 1L;
        }
        H();
    }

    public j0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[0], (FloatingActionButton) objArr[8], (View) objArr[5], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[6], (TabLayout) objArr[3], (AppCompatTextView) objArr[1], (ViewPager) objArr[4]);
        this.K = -1L;
        this.C.setTag(null);
        N(view);
        y();
    }
}
