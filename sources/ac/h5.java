package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;

/* loaded from: classes2.dex */
public abstract class h5 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final View E;
    public final AppCompatTextView F;
    public GiftItem G;

    public h5(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, View view2, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = appCompatImageView3;
        this.E = view2;
        this.F = appCompatTextView;
    }

    public abstract void T(GiftItem giftItem);
}
