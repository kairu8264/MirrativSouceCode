package ej;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import s3.d;
import wi.b;
import wi.k;

/* loaded from: classes3.dex */
public class a extends AppCompatCheckBox {

    /* renamed from: y  reason: collision with root package name */
    public static final int f30626y = k.f58924u;

    /* renamed from: z  reason: collision with root package name */
    public static final int[][] f30627z = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: w  reason: collision with root package name */
    public ColorStateList f30628w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f30629x;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f58769f);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f30628w == null) {
            int[][] iArr = f30627z;
            int[] iArr2 = new int[iArr.length];
            int c10 = hj.a.c(this, b.f58773j);
            int c11 = hj.a.c(this, b.f58778o);
            int c12 = hj.a.c(this, b.f58775l);
            iArr2[0] = hj.a.g(c11, c10, 1.0f);
            iArr2[1] = hj.a.g(c11, c12, 0.54f);
            iArr2[2] = hj.a.g(c11, c12, 0.38f);
            iArr2[3] = hj.a.g(c11, c12, 0.38f);
            this.f30628w = new ColorStateList(iArr, iArr2);
        }
        return this.f30628w;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30629x && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f30629x = z10;
        if (z10) {
            d.c(this, getMaterialThemeColorsTintList());
        } else {
            d.c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = ej.a.f30626y
            android.content.Context r8 = yj.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = wi.l.V3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = nj.j.h(r0, r1, r2, r3, r4, r5)
            int r10 = wi.l.W3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = qj.c.a(r8, r9, r10)
            s3.d.c(r7, r8)
        L28:
            int r8 = wi.l.X3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f30629x = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ej.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
