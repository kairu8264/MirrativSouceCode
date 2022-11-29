package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.LiveTimeView;
import com.dena.mirrorman.customview.ProfileImageView;

/* loaded from: classes2.dex */
public abstract class ml extends ViewDataBinding {
    public final AppCompatImageView B;
    public final LiveBadgeView C;
    public final AppCompatImageView D;
    public final LiveTimeView E;
    public final AppCompatTextView F;
    public final ProfileImageView G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;

    public ml(Object obj, View view, int i10, AppCompatImageView appCompatImageView, LiveBadgeView liveBadgeView, AppCompatImageView appCompatImageView2, LiveTimeView liveTimeView, AppCompatTextView appCompatTextView, ProfileImageView profileImageView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = liveBadgeView;
        this.D = appCompatImageView2;
        this.E = liveTimeView;
        this.F = appCompatTextView;
        this.G = profileImageView;
        this.H = appCompatTextView2;
        this.I = appCompatTextView3;
    }
}
