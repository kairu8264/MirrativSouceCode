package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GroupShotBackgroundSettingItemView;

/* loaded from: classes2.dex */
public abstract class p6 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final GroupShotBackgroundSettingItemView C;

    public p6(Object obj, View view, int i10, AppCompatImageView appCompatImageView, GroupShotBackgroundSettingItemView groupShotBackgroundSettingItemView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = groupShotBackgroundSettingItemView;
    }
}
