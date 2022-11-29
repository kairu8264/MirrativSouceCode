package s3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CheckedTextView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f52006a;

        /* renamed from: b  reason: collision with root package name */
        public static boolean f52007b;

        public static Drawable a(CheckedTextView checkedTextView) {
            if (!f52007b) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f52006a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.i("CheckedTextViewCompat", "Failed to retrieve mCheckMarkDrawable field", e10);
                }
                f52007b = true;
            }
            Field field = f52006a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException e11) {
                    Log.i("CheckedTextViewCompat", "Failed to get check mark drawable via reflection", e11);
                    f52006a = null;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: s3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0794c {
        public static void a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        public static void b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    public static Drawable a(CheckedTextView checkedTextView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return b.a(checkedTextView);
        }
        return a.a(checkedTextView);
    }

    public static void b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0794c.a(checkedTextView, colorStateList);
        } else if (checkedTextView instanceof l) {
            ((l) checkedTextView).setSupportCheckMarkTintList(colorStateList);
        }
    }

    public static void c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0794c.b(checkedTextView, mode);
        } else if (checkedTextView instanceof l) {
            ((l) checkedTextView).setSupportCheckMarkTintMode(mode);
        }
    }
}
