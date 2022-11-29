package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ProfileImageView;

/* loaded from: classes2.dex */
public abstract class z6 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final ProfileImageView C;

    public z6(Object obj, View view, int i10, AppCompatTextView appCompatTextView, ProfileImageView profileImageView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = profileImageView;
    }
}
