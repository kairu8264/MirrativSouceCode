package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.streaming.groupshot.GroupShotBackgroundSettingView;
import com.dena.mirrorman.customview.GroupShotMemberSettingView;

/* loaded from: classes2.dex */
public class z0 extends y0 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xb.o.J9, 1);
        sparseIntArray.put(xb.o.setting_container, 2);
        sparseIntArray.put(xb.o.f60024q1, 3);
        sparseIntArray.put(xb.o.G9, 4);
        sparseIntArray.put(xb.o.member_setting_view, 5);
        sparseIntArray.put(xb.o.background_setting_view, 6);
        sparseIntArray.put(xb.o.Q8, 7);
        sparseIntArray.put(xb.o.group_shot_settings_image_view, 8);
    }

    public z0(androidx.databinding.e eVar, View view) {
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

    public z0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (GroupShotBackgroundSettingView) objArr[6], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[8], (GroupShotMemberSettingView) objArr[5], (ConstraintLayout) objArr[2], (StatusView) objArr[7], (AppCompatTextView) objArr[4], (Space) objArr[1]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
