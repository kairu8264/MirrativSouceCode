package i8;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    public static <T extends Collection<Y>, Y> T c(T t10) {
        if (t10.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t10;
    }

    public static <T> T d(T t10) {
        return (T) e(t10, "Argument must not be null");
    }

    public static <T> T e(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }
}
