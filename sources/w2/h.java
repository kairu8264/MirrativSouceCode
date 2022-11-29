package w2;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import w2.j;

/* loaded from: classes.dex */
public class h extends androidx.constraintlayout.widget.b implements j.d {
    public boolean F;
    public boolean G;
    public float H;
    public View[] I;

    @Override // w2.j.d
    public void a(j jVar, int i10) {
    }

    @Override // w2.j.d
    public void b(j jVar, int i10, int i11, float f10) {
    }

    @Override // w2.j.d
    public void c(j jVar, int i10, int i11) {
    }

    public float getProgress() {
        return this.H;
    }

    @Override // androidx.constraintlayout.widget.b
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x2.d.f59644y6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == x2.d.A6) {
                    this.F = obtainStyledAttributes.getBoolean(index, this.F);
                } else if (index == x2.d.f59653z6) {
                    this.G = obtainStyledAttributes.getBoolean(index, this.G);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.H = f10;
        int i10 = 0;
        if (this.f14808x > 0) {
            this.I = l((ConstraintLayout) getParent());
            while (i10 < this.f14808x) {
                x(this.I[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof h)) {
                x(childAt, f10);
            }
            i10++;
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return this.G;
    }

    public boolean v() {
        return this.F;
    }

    public void w(Canvas canvas) {
    }

    public void x(View view, float f10) {
    }
}
