package androidx.test.internal.util;

import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.internal.platform.ThreadChecker;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Checks {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadChecker f16454a;

    static {
        List a10 = ServiceLoaderWrapper.a(ThreadChecker.class);
        if (a10.isEmpty()) {
            f16454a = new ThreadChecker() { // from class: androidx.test.internal.util.Checks.1
            };
        } else if (a10.size() == 1) {
            f16454a = (ThreadChecker) a10.get(0);
        } else {
            throw new IllegalStateException(String.format("Found more than one %s implementations.", ThreadChecker.class.getName()));
        }
    }

    public static <T> T a(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }
}
