package com.dena.showroom.flvplayback.impl.net;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.dena.showroom.flvplayback.impl.Factory;
import com.dena.showroom.flvplayback.impl.ThreadingPolicy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public class AsyncSocket implements ThreadingPolicy.LooperAware {
    public long B;

    /* renamed from: w  reason: collision with root package name */
    public final AsyncSocketLooper f26560w;

    /* renamed from: x  reason: collision with root package name */
    public SocketChannel f26561x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f26562y;

    /* renamed from: z  reason: collision with root package name */
    public AsyncSocketDelegate f26563z;
    public volatile int maxOutgoingBytesPerSecond = 0;
    public volatile int maxIncomingBytesPerSecond = 0;
    public final ArrayDeque<e> A = new ArrayDeque<>();
    public Runnable C = new b();
    public Runnable D = new c();

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Throwable f26564w;

        public a(Throwable th2) {
            this.f26564w = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AsyncSocket.this.f26563z != null) {
                AsyncSocket.this.f26563z.onClosed(AsyncSocket.this, this.f26564w);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AsyncSocket.this.isClosed() || AsyncSocket.this.f26563z == null) {
                return;
            }
            AsyncSocket.this.f26563z.onSpaceAvailable(AsyncSocket.this);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AsyncSocket.this.isClosed() || AsyncSocket.this.f26563z == null) {
                return;
            }
            AsyncSocket.this.f26563z.onBytesAvailable(AsyncSocket.this);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f26568w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Runnable f26569x;

        public d(boolean z10, Runnable runnable) {
            this.f26568w = z10;
            this.f26569x = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AsyncSocket.this.isClosed() && this.f26568w) {
                return;
            }
            this.f26569x.run();
        }
    }

    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f26571a;

        /* renamed from: b  reason: collision with root package name */
        public final long f26572b;

        public e(long j10, long j11) {
            this.f26571a = j10;
            this.f26572b = j11;
        }
    }

    public AsyncSocket(AsyncSocketLooper asyncSocketLooper, SocketChannel socketChannel) {
        this.f26560w = asyncSocketLooper;
        this.f26561x = socketChannel;
        SystemClock.uptimeMillis();
        SystemClock.uptimeMillis();
    }

    public void b() {
        this.f26560w.scheduleToDispatch(this.D);
    }

    public void c(Runnable runnable, boolean z10) {
        this.f26560w.scheduleToDispatch(new d(z10, runnable));
    }

    public void close() {
        d(null);
    }

    public void d(Throwable th2) {
        if (isClosed()) {
            return;
        }
        try {
            SocketChannel socketChannel = this.f26561x;
            if (socketChannel != null) {
                socketChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f26561x = null;
        this.f26562y = true;
        if (th2 != null) {
            c(new a(th2), false);
        }
        Log.i(Factory.TAG, "[socket] closed", th2);
    }

    public void e() {
        this.f26560w.scheduleToDispatch(this.C);
    }

    @Override // com.dena.showroom.flvplayback.impl.ThreadingPolicy.LooperAware
    public Looper getLooper() {
        return this.f26560w.getLooper();
    }

    public boolean isClosed() {
        return this.f26562y;
    }

    public int read(ByteBuffer byteBuffer) {
        if (isClosed()) {
            return 0;
        }
        try {
            return this.f26561x.read(byteBuffer);
        } catch (IOException e10) {
            d(e10);
            return 0;
        }
    }

    public int send(ByteBuffer byteBuffer) {
        if (isClosed()) {
            return 0;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            if (this.maxOutgoingBytesPerSecond == 0) {
                return this.f26561x.write(byteBuffer);
            }
            while (!this.A.isEmpty()) {
                e first = this.A.getFirst();
                if (uptimeMillis - first.f26572b < 1000) {
                    break;
                }
                this.B -= first.f26571a;
                this.A.removeFirst();
            }
            int max = (int) Math.max(0L, this.maxOutgoingBytesPerSecond - this.B);
            if (max > byteBuffer.remaining()) {
                max = byteBuffer.remaining();
            }
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + max);
            int write = this.f26561x.write(byteBuffer);
            byteBuffer.limit(limit);
            long j10 = write;
            this.A.addLast(new e(j10, uptimeMillis));
            this.B += j10;
            return write;
        } catch (IOException e10) {
            d(e10);
            return 0;
        }
    }

    public void setDelegate(AsyncSocketDelegate asyncSocketDelegate) {
        this.f26563z = asyncSocketDelegate;
    }
}
