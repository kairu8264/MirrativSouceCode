package kb;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.player.gifting.panel.GiftPanelTabLayout;
import com.dena.mirrorman.widget.ViewPagerIndicator;

/* loaded from: classes2.dex */
public abstract class j0 extends ViewDataBinding {
    public final RecyclerView B;
    public final AppCompatImageView C;
    public final ViewPagerIndicator D;
    public final GiftPanelTabLayout E;

    public j0(Object obj, View view, int i10, RecyclerView recyclerView, AppCompatImageView appCompatImageView, ViewPagerIndicator viewPagerIndicator, GiftPanelTabLayout giftPanelTabLayout) {
        super(obj, view, i10);
        this.B = recyclerView;
        this.C = appCompatImageView;
        this.D = viewPagerIndicator;
        this.E = giftPanelTabLayout;
    }
}
