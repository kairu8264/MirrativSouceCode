package vk;

import xl.a;

/* loaded from: classes.dex */
public class y<T> implements xl.b<T>, xl.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final a.InterfaceC1009a<Object> f57477c = w.f57475a;

    /* renamed from: d  reason: collision with root package name */
    public static final xl.b<Object> f57478d = x.f57476a;

    /* renamed from: a  reason: collision with root package name */
    public a.InterfaceC1009a<T> f57479a;

    /* renamed from: b  reason: collision with root package name */
    public volatile xl.b<T> f57480b;

    public y(a.InterfaceC1009a<T> interfaceC1009a, xl.b<T> bVar) {
        this.f57479a = interfaceC1009a;
        this.f57480b = bVar;
    }

    public static <T> y<T> e() {
        return new y<>(f57477c, f57478d);
    }

    public static /* synthetic */ void f(xl.b bVar) {
    }

    public static /* synthetic */ Object g() {
        return null;
    }

    public static /* synthetic */ void h(a.InterfaceC1009a interfaceC1009a, a.InterfaceC1009a interfaceC1009a2, xl.b bVar) {
        interfaceC1009a.a(bVar);
        interfaceC1009a2.a(bVar);
    }

    public static <T> y<T> i(xl.b<T> bVar) {
        return new y<>(null, bVar);
    }

    @Override // xl.a
    public void a(final a.InterfaceC1009a<T> interfaceC1009a) {
        xl.b<T> bVar;
        xl.b<T> bVar2 = this.f57480b;
        xl.b<Object> bVar3 = f57478d;
        if (bVar2 != bVar3) {
            interfaceC1009a.a(bVar2);
            return;
        }
        xl.b<T> bVar4 = null;
        synchronized (this) {
            bVar = this.f57480b;
            if (bVar != bVar3) {
                bVar4 = bVar;
            } else {
                final a.InterfaceC1009a<T> interfaceC1009a2 = this.f57479a;
                this.f57479a = new a.InterfaceC1009a() { // from class: vk.v
                    @Override // xl.a.InterfaceC1009a
                    public final void a(xl.b bVar5) {
                        y.h(a.InterfaceC1009a.this, interfaceC1009a, bVar5);
                    }
                };
            }
        }
        if (bVar4 != null) {
            interfaceC1009a.a(bVar);
        }
    }

    @Override // xl.b
    public T get() {
        return this.f57480b.get();
    }

    public void j(xl.b<T> bVar) {
        a.InterfaceC1009a<T> interfaceC1009a;
        if (this.f57480b == f57478d) {
            synchronized (this) {
                interfaceC1009a = this.f57479a;
                this.f57479a = null;
                this.f57480b = bVar;
            }
            interfaceC1009a.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
