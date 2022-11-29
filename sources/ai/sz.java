package ai;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class sz {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<rz> f10029a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f10030b = new AtomicBoolean();

    public static rz a() {
        return f10029a.get();
    }

    public static void b(rz rzVar) {
        f10029a.set(rzVar);
    }
}
