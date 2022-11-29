package ae;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.feature.player.gifting.GiftParticleView;

/* loaded from: classes2.dex */
public abstract class h3 extends ViewDataBinding {
    public final GiftParticleView B;

    public h3(Object obj, View view, int i10, GiftParticleView giftParticleView) {
        super(obj, view, i10);
        this.B = giftParticleView;
    }

    public static h3 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static h3 U(View view, Object obj) {
        return (h3) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_gift_particle_view);
    }
}
