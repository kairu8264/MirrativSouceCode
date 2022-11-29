package qj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.TintTypedArray;

/* loaded from: classes3.dex */
public class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int color;
        int resourceId;
        ColorStateList a10;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a10 = f.a.a(context, resourceId)) == null) {
            if (Build.VERSION.SDK_INT <= 15 && (color = typedArray.getColor(i10, -1)) != -1) {
                return ColorStateList.valueOf(color);
            }
            return typedArray.getColorStateList(i10);
        }
        return a10;
    }

    public static ColorStateList b(Context context, TintTypedArray tintTypedArray, int i10) {
        int color;
        int resourceId;
        ColorStateList a10;
        if (!tintTypedArray.hasValue(i10) || (resourceId = tintTypedArray.getResourceId(i10, 0)) == 0 || (a10 = f.a.a(context, resourceId)) == null) {
            if (Build.VERSION.SDK_INT <= 15 && (color = tintTypedArray.getColor(i10, -1)) != -1) {
                return ColorStateList.valueOf(color);
            }
            return tintTypedArray.getColorStateList(i10);
        }
        return a10;
    }

    public static int c(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i10, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i11);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i10, i11);
    }

    public static Drawable d(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable b10;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (b10 = f.a.b(context, resourceId)) == null) ? typedArray.getDrawable(i10) : b10;
    }

    public static int e(TypedArray typedArray, int i10, int i11) {
        return typedArray.hasValue(i10) ? i10 : i11;
    }

    public static d f(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static boolean g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
