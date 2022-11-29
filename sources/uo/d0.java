package uo;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public class d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f55998b = AtomicIntegerFieldUpdater.newUpdater(d0.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f55999a;

    public d0(Throwable th2, boolean z10) {
        this.f55999a = th2;
        this._handled = z10 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return f55998b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return v0.a(this) + '[' + this.f55999a + ']';
    }

    public /* synthetic */ d0(Throwable th2, boolean z10, int i10, jo.h hVar) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }
}
