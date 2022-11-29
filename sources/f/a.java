package f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ResourceManagerInternal;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {
    public static ColorStateList a(Context context, int i10) {
        return c3.a.e(context, i10);
    }

    public static Drawable b(Context context, int i10) {
        return ResourceManagerInternal.get().getDrawable(context, i10);
    }
}
