package kb;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.player.gifting.GiftComboView;

/* loaded from: classes2.dex */
public abstract class f0 extends ViewDataBinding {
    public final View B;
    public final GiftComboView C;
    public final ImageView D;
    public final AppCompatTextView E;
    public final View F;
    public final AppCompatImageView G;
    public final AppCompatTextView H;

    public f0(Object obj, View view, int i10, View view2, GiftComboView giftComboView, ImageView imageView, AppCompatTextView appCompatTextView, View view3, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = view2;
        this.C = giftComboView;
        this.D = imageView;
        this.E = appCompatTextView;
        this.F = view3;
        this.G = appCompatImageView;
        this.H = appCompatTextView2;
    }
}
