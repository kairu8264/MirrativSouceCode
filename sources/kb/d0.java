package kb;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.player.gifting.panel.PlayerGiftPagerCell;

/* loaded from: classes2.dex */
public abstract class d0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final PlayerGiftPagerCell D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public final View G;

    public d0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, PlayerGiftPagerCell playerGiftPagerCell, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, View view2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = playerGiftPagerCell;
        this.E = appCompatImageView2;
        this.F = appCompatTextView2;
        this.G = view2;
    }
}
