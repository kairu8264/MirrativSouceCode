package rp;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class i0 {

    /* renamed from: d  reason: collision with root package name */
    public static final b f51700d = new b(null);

    /* renamed from: e  reason: collision with root package name */
    public static final i0 f51701e = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f51702a;

    /* renamed from: b  reason: collision with root package name */
    public long f51703b;

    /* renamed from: c  reason: collision with root package name */
    public long f51704c;

    /* loaded from: classes4.dex */
    public static final class a extends i0 {
        @Override // rp.i0
        public i0 d(long j10) {
            return this;
        }

        @Override // rp.i0
        public void f() {
        }

        @Override // rp.i0
        public i0 g(long j10, TimeUnit timeUnit) {
            jo.p.h(timeUnit, "unit");
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public i0 a() {
        this.f51702a = false;
        return this;
    }

    public i0 b() {
        this.f51704c = 0L;
        return this;
    }

    public long c() {
        if (this.f51702a) {
            return this.f51703b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public i0 d(long j10) {
        this.f51702a = true;
        this.f51703b = j10;
        return this;
    }

    public boolean e() {
        return this.f51702a;
    }

    public void f() throws IOException {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f51702a && this.f51703b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public i0 g(long j10, TimeUnit timeUnit) {
        jo.p.h(timeUnit, "unit");
        if (j10 >= 0) {
            this.f51704c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(jo.p.o("timeout < 0: ", Long.valueOf(j10)).toString());
    }

    public long h() {
        return this.f51704c;
    }
}
