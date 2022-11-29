package ac;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.customview.YellRankIconView;

/* loaded from: classes2.dex */
public abstract class n5 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final RoundedButtonView C;
    public final TextView D;
    public final ProfileImageView E;
    public final AppCompatTextView F;
    public final YellRankIconView G;
    public zb.b H;

    public n5(Object obj, View view, int i10, AppCompatImageView appCompatImageView, RoundedButtonView roundedButtonView, TextView textView, ProfileImageView profileImageView, AppCompatTextView appCompatTextView, YellRankIconView yellRankIconView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = roundedButtonView;
        this.D = textView;
        this.E = profileImageView;
        this.F = appCompatTextView;
        this.G = yellRankIconView;
    }

    public abstract void T(zb.b bVar);
}
