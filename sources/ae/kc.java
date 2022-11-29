package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.widget.AutoLinkTextView;

/* loaded from: classes2.dex */
public abstract class kc extends ViewDataBinding {
    public final AutoLinkTextView B;
    public final ProfileImageView C;
    public final AppCompatTextView D;

    public kc(Object obj, View view, int i10, AutoLinkTextView autoLinkTextView, ProfileImageView profileImageView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = autoLinkTextView;
        this.C = profileImageView;
        this.D = appCompatTextView;
    }
}
