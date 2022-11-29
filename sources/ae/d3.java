package ae;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView;

/* loaded from: classes2.dex */
public abstract class d3 extends ViewDataBinding {
    public final FrameLayout B;
    public final LottieAnimationView C;
    public final GiftGachaRare4OpenAnimationView D;
    public final FrameLayout E;

    public d3(Object obj, View view, int i10, FrameLayout frameLayout, LottieAnimationView lottieAnimationView, GiftGachaRare4OpenAnimationView giftGachaRare4OpenAnimationView, FrameLayout frameLayout2) {
        super(obj, view, i10);
        this.B = frameLayout;
        this.C = lottieAnimationView;
        this.D = giftGachaRare4OpenAnimationView;
        this.E = frameLayout2;
    }

    public static d3 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static d3 U(View view, Object obj) {
        return (d3) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_gift_gacha_open_rare);
    }
}
