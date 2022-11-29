package nn;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class f {
    public static <T> List<T> a(List<T> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }
}
