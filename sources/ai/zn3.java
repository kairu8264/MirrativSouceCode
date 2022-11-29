package ai;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class zn3 {
    public static <T> T a(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static <T> T b(T t10) {
        Objects.requireNonNull(t10, "Cannot return null from a non-@Nullable @Provides method");
        return t10;
    }

    public static <T> void c(T t10, Class<T> cls) {
        if (t10 == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
