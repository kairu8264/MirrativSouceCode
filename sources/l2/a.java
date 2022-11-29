package l2;

import ro.g;
import ro.n;

/* loaded from: classes.dex */
public interface a<T> {
    g<T> a();

    default int getCount() {
        return n.g(a());
    }
}
