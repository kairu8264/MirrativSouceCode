package hi;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class x7 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Callable<? extends j>> f36068a = new HashMap();

    public final void a(String str, Callable<? extends j> callable) {
        this.f36068a.put(str, callable);
    }
}
