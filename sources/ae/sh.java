package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.widget.AutoLinkTextView;

/* loaded from: classes2.dex */
public abstract class sh extends ViewDataBinding {
    public final AppCompatTextView B;
    public final View C;
    public final AutoLinkTextView D;
    public final ProfileImageView E;
    public final AppCompatTextView F;

    public sh(Object obj, View view, int i10, AppCompatTextView appCompatTextView, View view2, AutoLinkTextView autoLinkTextView, ProfileImageView profileImageView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = view2;
        this.D = autoLinkTextView;
        this.E = profileImageView;
        this.F = appCompatTextView2;
    }
}
