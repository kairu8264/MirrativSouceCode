package ai;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class u30 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10588a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10589b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f10590c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f10591d = new AtomicBoolean(false);

    public final synchronized void a(boolean z10) {
        this.f10588a = z10;
        this.f10591d.set(true);
    }

    public final synchronized void b(boolean z10, float f10) {
        this.f10589b = z10;
        this.f10590c = f10;
    }

    public final synchronized boolean c(boolean z10) {
        if (this.f10591d.get()) {
            return this.f10588a;
        }
        return z10;
    }

    public final synchronized boolean d() {
        return this.f10589b;
    }

    public final synchronized float e() {
        return this.f10590c;
    }
}
