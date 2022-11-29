package pc;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.ClosetGestureView;

/* loaded from: classes2.dex */
public abstract class c2 extends ViewDataBinding {
    public final FrameLayout B;
    public final AppCompatImageView C;
    public final ClosetGestureView D;

    public c2(Object obj, View view, int i10, FrameLayout frameLayout, AppCompatImageView appCompatImageView, ClosetGestureView closetGestureView) {
        super(obj, view, i10);
        this.B = frameLayout;
        this.C = appCompatImageView;
        this.D = closetGestureView;
    }

    public static c2 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static c2 U(View view, Object obj) {
        return (c2) ViewDataBinding.j(obj, view, nc.f.fragment_emomo_full_screen_user_view);
    }
}
