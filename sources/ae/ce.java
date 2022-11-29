package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.RoundedMultipleImagesView;

/* loaded from: classes2.dex */
public abstract class ce extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final RoundedMultipleImagesView D;
    public final AppCompatTextView E;

    public ce(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, RoundedMultipleImagesView roundedMultipleImagesView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = roundedMultipleImagesView;
        this.E = appCompatTextView2;
    }

    public static ce T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static ce U(View view, Object obj) {
        return (ce) ViewDataBinding.j(obj, view, nd.b1.view_holder_friend_only_stream_user);
    }
}
