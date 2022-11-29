package nj;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class m extends ImageButton {

    /* renamed from: w  reason: collision with root package name */
    public int f43669w;

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f43669w = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f43669w;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }

    public m(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43669w = getVisibility();
    }
}
