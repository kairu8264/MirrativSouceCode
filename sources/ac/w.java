package ac;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class w extends ViewDataBinding {
    public final AppCompatButton B;
    public final AppCompatButton C;
    public final ImageView D;
    public final CardView E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;

    public w(Object obj, View view, int i10, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, ImageView imageView, CardView cardView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatButton;
        this.C = appCompatButton2;
        this.D = imageView;
        this.E = cardView;
        this.F = appCompatTextView;
        this.G = appCompatTextView2;
    }

    public static w T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static w U(View view, Object obj) {
        return (w) ViewDataBinding.j(obj, view, xb.p.dialog_fragment_confirm_access_setting_notification);
    }
}
