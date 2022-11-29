package um;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    public static volatile d f55984b;

    /* renamed from: a  reason: collision with root package name */
    public final Set<f> f55985a = new HashSet();

    public static d a() {
        d dVar = f55984b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f55984b;
                if (dVar == null) {
                    dVar = new d();
                    f55984b = dVar;
                }
            }
        }
        return dVar;
    }

    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f55985a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f55985a);
        }
        return unmodifiableSet;
    }
}
