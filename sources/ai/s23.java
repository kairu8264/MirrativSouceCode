package ai;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class s23 extends m23 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<z23, Thread> f9685a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<z23, z23> f9686b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<a33, z23> f9687c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<a33, p23> f9688d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<a33, Object> f9689e;

    public s23(AtomicReferenceFieldUpdater<z23, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<z23, z23> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a33, z23> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a33, p23> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a33, Object> atomicReferenceFieldUpdater5) {
        super(null);
        this.f9685a = atomicReferenceFieldUpdater;
        this.f9686b = atomicReferenceFieldUpdater2;
        this.f9687c = atomicReferenceFieldUpdater3;
        this.f9688d = atomicReferenceFieldUpdater4;
        this.f9689e = atomicReferenceFieldUpdater5;
    }

    @Override // ai.m23
    public final void a(z23 z23Var, Thread thread) {
        this.f9685a.lazySet(z23Var, thread);
    }

    @Override // ai.m23
    public final void b(z23 z23Var, z23 z23Var2) {
        this.f9686b.lazySet(z23Var, z23Var2);
    }

    @Override // ai.m23
    public final boolean c(a33<?> a33Var, z23 z23Var, z23 z23Var2) {
        return r23.a(this.f9687c, a33Var, z23Var, z23Var2);
    }

    @Override // ai.m23
    public final boolean d(a33<?> a33Var, p23 p23Var, p23 p23Var2) {
        return r23.a(this.f9688d, a33Var, p23Var, p23Var2);
    }

    @Override // ai.m23
    public final boolean e(a33<?> a33Var, Object obj, Object obj2) {
        return r23.a(this.f9689e, a33Var, obj, obj2);
    }
}
