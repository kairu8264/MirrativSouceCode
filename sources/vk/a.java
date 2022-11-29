package vk;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class a implements e {
    @Override // vk.e
    public <T> T a(Class<T> cls) {
        xl.b<T> d10 = d(cls);
        if (d10 == null) {
            return null;
        }
        return d10.get();
    }

    @Override // vk.e
    public <T> Set<T> c(Class<T> cls) {
        return b(cls).get();
    }
}
