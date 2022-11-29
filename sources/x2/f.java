package x2;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import t2.k;

/* loaded from: classes.dex */
public abstract class f extends androidx.constraintlayout.widget.b {
    public boolean F;
    public boolean G;

    @Override // androidx.constraintlayout.widget.b
    public void i(ConstraintLayout constraintLayout) {
        h(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.b
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f59531m1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == d.f59549o1) {
                    this.F = true;
                } else if (index == d.f59594t1) {
                    this.G = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.F || this.G) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
                for (int i10 = 0; i10 < this.f14808x; i10++) {
                    View j10 = constraintLayout.j(this.f14807w[i10]);
                    if (j10 != null) {
                        if (this.F) {
                            j10.setVisibility(visibility);
                        }
                        if (this.G && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                            j10.setTranslationZ(j10.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        g();
    }

    public void t(k kVar, int i10, int i11) {
    }
}
