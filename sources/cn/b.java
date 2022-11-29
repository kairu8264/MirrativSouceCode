package cn;

import java.lang.reflect.AccessibleObject;
import zm.e;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f20008a;

    static {
        f20008a = e.c() < 9 ? new a() : new c();
    }

    public static b a() {
        return f20008a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
