package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ProfileImageView;

/* loaded from: classes2.dex */
public abstract class gf extends ViewDataBinding {
    public final ProfileImageView B;
    public final AppCompatTextView C;

    public gf(Object obj, View view, int i10, ProfileImageView profileImageView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = profileImageView;
        this.C = appCompatTextView;
    }
}
