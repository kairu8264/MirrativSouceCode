package yd;

import ae.mb;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class z extends ConstraintLayout {
    public final mb U;

    public /* synthetic */ z(Context context, AttributeSet attributeSet, int i10, int i11, jo.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void setBackground(int i10) {
        this.U.B.setBackgroundResource(i10);
    }

    public final void setProfileImage(Bitmap bitmap) {
        if (bitmap != null) {
            this.U.C.setVisibility(0);
            this.U.C.setImageBitmap(bitmap);
            this.U.D.setGravity(16);
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.g(this.U.B);
            cVar.A(this.U.D.getId(), 6, de.n.b(this, 8));
            cVar.c(this.U.B);
            return;
        }
        this.U.C.setVisibility(8);
        this.U.D.setGravity(17);
        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
        cVar2.g(this.U.B);
        cVar2.A(this.U.D.getId(), 6, de.n.b(this, 16));
        cVar2.c(this.U.B);
    }

    public final void setUserName(String str) {
        jo.p.h(str, "userName");
        this.U.D.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jo.p.h(context, "context");
        mb mbVar = (mb) androidx.databinding.f.e(LayoutInflater.from(getContext()), nd.b1.view_gift_item_nameplate, this, true);
        this.U = mbVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nd.h1.f42022b1, 0, 0);
            mbVar.B.setBackgroundResource(obtainStyledAttributes.getResourceId(nd.h1.f42028c1, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
