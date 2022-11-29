package sm;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f52752a;

    public e() {
        this.f52752a = null;
    }

    public static <T> e<T> a() {
        return new e<>();
    }

    public static <T> e<T> b(T t10) {
        return t10 == null ? a() : e(t10);
    }

    public static <T> e<T> e(T t10) {
        return new e<>(t10);
    }

    public T c() {
        T t10 = this.f52752a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        return this.f52752a != null;
    }

    public e(T t10) {
        Objects.requireNonNull(t10, "value for optional is empty.");
        this.f52752a = t10;
    }
}
