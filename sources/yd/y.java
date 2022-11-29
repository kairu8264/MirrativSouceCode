package yd;

import ae.kb;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class y extends ConstraintLayout {
    public final kb U;

    public /* synthetic */ y(Context context, AttributeSet attributeSet, int i10, int i11, jo.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void setGiftImage(Bitmap bitmap) {
        if (bitmap != null) {
            this.U.C.setVisibility(0);
            this.U.C.setImageBitmap(bitmap);
            return;
        }
        this.U.C.setVisibility(8);
    }

    public final void setMessage(String str) {
        jo.p.h(str, "message");
        this.U.D.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jo.p.h(context, "context");
        this.U = (kb) androidx.databinding.f.e(LayoutInflater.from(getContext()), nd.b1.view_gift_item_image, this, true);
    }
}
