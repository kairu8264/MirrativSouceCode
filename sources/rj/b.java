package rj;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f51549a;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f51550b;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f51551c;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f51552d;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f51553e;

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f51554f;

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f51555g;

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f51556h;

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f51557i;

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f51558j;

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f51559k;

    /* renamed from: l  reason: collision with root package name */
    public static final String f51560l;

    static {
        f51549a = Build.VERSION.SDK_INT >= 21;
        f51550b = new int[]{16842919};
        f51551c = new int[]{16843623, 16842908};
        f51552d = new int[]{16842908};
        f51553e = new int[]{16843623};
        f51554f = new int[]{16842913, 16842919};
        f51555g = new int[]{16842913, 16843623, 16842908};
        f51556h = new int[]{16842913, 16842908};
        f51557i = new int[]{16842913, 16843623};
        f51558j = new int[]{16842913};
        f51559k = new int[]{16842910, 16842919};
        f51560l = b.class.getSimpleName();
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f51549a) {
            return new ColorStateList(new int[][]{f51558j, StateSet.NOTHING}, new int[]{c(colorStateList, f51554f), c(colorStateList, f51550b)});
        }
        int[] iArr = f51554f;
        int[] iArr2 = f51555g;
        int[] iArr3 = f51556h;
        int[] iArr4 = f51557i;
        int[] iArr5 = f51550b;
        int[] iArr6 = f51551c;
        int[] iArr7 = f51552d;
        int[] iArr8 = f51553e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f51558j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    public static int b(int i10) {
        return f3.a.k(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    public static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f51549a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22 && i10 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f51559k, 0)) != 0) {
                Log.w(f51560l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean e(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
