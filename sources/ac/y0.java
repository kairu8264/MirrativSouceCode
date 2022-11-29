package ac;

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
public abstract class y0 extends ViewDataBinding {
    public final GroupShotBackgroundSettingView B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final GroupShotMemberSettingView E;
    public final ConstraintLayout F;
    public final StatusView G;
    public final AppCompatTextView H;
    public final Space I;

    public y0(Object obj, View view, int i10, GroupShotBackgroundSettingView groupShotBackgroundSettingView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, GroupShotMemberSettingView groupShotMemberSettingView, ConstraintLayout constraintLayout, StatusView statusView, AppCompatTextView appCompatTextView, Space space) {
        super(obj, view, i10);
        this.B = groupShotBackgroundSettingView;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = groupShotMemberSettingView;
        this.F = constraintLayout;
        this.G = statusView;
        this.H = appCompatTextView;
        this.I = space;
    }
}
