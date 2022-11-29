package cp;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f28597a = AtomicLongFieldUpdater.newUpdater(f.class, "number");
    private volatile /* synthetic */ long number = 1;

    public final long a() {
        return f28597a.incrementAndGet(this);
    }
}
