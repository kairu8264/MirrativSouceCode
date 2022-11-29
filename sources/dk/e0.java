package dk;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class e0 {
    public static <T> T a(T t10) {
        Objects.requireNonNull(t10, "Cannot return null from a non-@Nullable @Provides method");
        return t10;
    }

    public static <T> void b(T t10, Class<T> cls) {
        if (t10 == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
