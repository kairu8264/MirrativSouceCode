package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GiftGachaOpenResultView;

/* loaded from: classes2.dex */
public abstract class o6 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final GiftGachaOpenResultView C;
    public final View D;

    public o6(Object obj, View view, int i10, AppCompatImageView appCompatImageView, GiftGachaOpenResultView giftGachaOpenResultView, View view2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = giftGachaOpenResultView;
        this.D = view2;
    }

    public static o6 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static o6 U(View view, Object obj) {
        return (o6) ViewDataBinding.j(obj, view, nd.b1.fragment_gift_gacha_open_result);
    }
}
