package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.o;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements r {

    /* renamed from: w  reason: collision with root package name */
    public final Object f15469w;

    /* renamed from: x  reason: collision with root package name */
    public final d.a f15470x;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f15469w = obj;
        this.f15470x = d.f15525c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.r
    public void i(u uVar, o.b bVar) {
        this.f15470x.a(uVar, bVar, this.f15469w);
    }
}
