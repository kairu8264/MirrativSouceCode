package ve;

import ae.ub;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.f;
import com.dena.mirrorman.net.api.response.GiftResultItem;
import jo.h;
import jo.p;
import nd.b1;

/* loaded from: classes2.dex */
public final class c extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final ub f57306w;

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void setGift(GiftResultItem giftResultItem) {
        p.h(giftResultItem, "giftItem");
        ImageView imageView = this.f57306w.C;
        p.g(imageView, "binding.giftImage");
        td.a.f(imageView, giftResultItem.getSmallImageUrl());
        if (giftResultItem.getCount() > 99) {
            this.f57306w.B.setText("99+");
        } else {
            this.f57306w.B.setText(String.valueOf(giftResultItem.getCount()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f57306w = (ub) f.e(LayoutInflater.from(context), b1.view_gift_result_item, this, true);
    }
}
