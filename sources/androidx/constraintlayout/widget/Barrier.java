package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Barrier extends b {
    public int F;
    public int G;
    public t2.a H;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.H.l1();
    }

    public int getMargin() {
        return this.H.n1();
    }

    public int getType() {
        return this.F;
    }

    @Override // androidx.constraintlayout.widget.b
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.H = new t2.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x2.d.f59531m1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == x2.d.f59612v1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == x2.d.f59603u1) {
                    this.H.q1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == x2.d.f59621w1) {
                    this.H.s1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f14810z = this.H;
        s();
    }

    @Override // androidx.constraintlayout.widget.b
    public void n(t2.e eVar, boolean z10) {
        t(eVar, this.F, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.H.q1(z10);
    }

    public void setDpMargin(int i10) {
        t2.a aVar = this.H;
        aVar.s1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.H.s1(i10);
    }

    public void setType(int i10) {
        this.F = i10;
    }

    public final void t(t2.e eVar, int i10, boolean z10) {
        this.G = i10;
        if (Build.VERSION.SDK_INT < 17) {
            int i11 = this.F;
            if (i11 == 5) {
                this.G = 0;
            } else if (i11 == 6) {
                this.G = 1;
            }
        } else if (z10) {
            int i12 = this.F;
            if (i12 == 5) {
                this.G = 1;
            } else if (i12 == 6) {
                this.G = 0;
            }
        } else {
            int i13 = this.F;
            if (i13 == 5) {
                this.G = 0;
            } else if (i13 == 6) {
                this.G = 1;
            }
        }
        if (eVar instanceof t2.a) {
            ((t2.a) eVar).r1(this.G);
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
