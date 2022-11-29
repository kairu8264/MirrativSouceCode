package com.dena.showroom.flvplayback.impl.net;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.dena.showroom.flvplayback.Closeable;
import com.dena.showroom.flvplayback.impl.Factory;
import com.dena.showroom.flvplayback.impl.ThreadingPolicy;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.channels.UnresolvedAddressException;

/* loaded from: classes3.dex */
public class AsyncSocketLooper implements Closeable, ThreadingPolicy.LooperAware {
    public static final /* synthetic */ boolean D = true;
    public int A;
    public long B;
    public Runnable C;

    /* renamed from: w  reason: collision with root package name */
    public final Handler f26573w;

    /* renamed from: x  reason: collision with root package name */
    public Selector f26574x;

    /* renamed from: y  reason: collision with root package name */
    public int f26575y;

    /* renamed from: z  reason: collision with root package name */
    public long f26576z;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AsyncSocketLooper.this.d();
            } finally {
                AsyncSocketLooper.this.a();
            }
        }
    }

    public AsyncSocketLooper(Looper looper) {
        this(looper, 0, 0);
    }

    public void a() {
        try {
            this.f26573w.postDelayed(this.C, 30L);
        } catch (IllegalStateException e10) {
            Log.w(Factory.TAG, "", e10);
        }
    }

    public Selector c() {
        if (D || Looper.myLooper() == this.f26573w.getLooper()) {
            if (this.f26574x == null) {
                try {
                    this.f26574x = Selector.open();
                } catch (IOException e10) {
                    Log.e(Factory.TAG, "[selector] failed to initialize a `nio.Selector` object.", e10);
                    throw new IllegalStateException(e10);
                }
            }
            return this.f26574x;
        }
        throw new AssertionError();
    }

    @Override // com.dena.showroom.flvplayback.Closeable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26573w.removeCallbacksAndMessages(null);
        try {
            Selector selector = this.f26574x;
            if (selector != null) {
                selector.close();
            }
        } catch (IOException e10) {
            Log.i(Factory.TAG, "[selector] `nio.Selector#close()` throws an exception, ignored.", e10);
        }
    }

    public AsyncSocket connect(InetSocketAddress inetSocketAddress) {
        try {
            SocketChannel open = SocketChannel.open();
            AsyncSocket asyncSocket = new AsyncSocket(this, open);
            open.configureBlocking(false);
            open.register(c(), 0, asyncSocket).interestOps(open.connect(inetSocketAddress) ? 5 : 8);
            this.f26576z = SystemClock.uptimeMillis();
            this.B = SystemClock.uptimeMillis();
            return asyncSocket;
        } catch (IOException e10) {
            e = e10;
            AsyncSocket asyncSocket2 = new AsyncSocket(this, null);
            asyncSocket2.d(e);
            return asyncSocket2;
        } catch (UnresolvedAddressException e11) {
            e = e11;
            AsyncSocket asyncSocket22 = new AsyncSocket(this, null);
            asyncSocket22.d(e);
            return asyncSocket22;
        } catch (Exception e12) {
            AsyncSocket asyncSocket3 = new AsyncSocket(this, null);
            asyncSocket3.d(e12);
            return asyncSocket3;
        }
    }

    public void d() {
        Selector c10 = c();
        try {
            if (c10.selectNow() == 0) {
                return;
            }
            for (SelectionKey selectionKey : c10.selectedKeys()) {
                AsyncSocket asyncSocket = (AsyncSocket) selectionKey.attachment();
                if (asyncSocket.isClosed()) {
                    selectionKey.cancel();
                } else if (selectionKey.isConnectable()) {
                    if (((SocketChannel) selectionKey.channel()).finishConnect()) {
                        Log.i(Factory.TAG, "[selector] connected.");
                        selectionKey.interestOps(5);
                        this.B = SystemClock.uptimeMillis();
                    } else {
                        asyncSocket.d(new IOException("Failed to finish connecting!"));
                        if (this.f26575y > 0 && SystemClock.uptimeMillis() - this.f26576z > this.f26575y) {
                            throw new IOException("Connection timeout: couldn't connect in " + this.f26575y + "[ms]");
                        }
                    }
                } else {
                    if (selectionKey.isReadable()) {
                        asyncSocket.b();
                        this.B = SystemClock.uptimeMillis();
                    } else if (this.A > 0 && SystemClock.uptimeMillis() - this.B > this.A) {
                        asyncSocket.d(new IOException("Read timeout: didn't recv data in " + this.A));
                    }
                    if (selectionKey.isWritable()) {
                        asyncSocket.e();
                    }
                }
            }
            c10.selectedKeys().clear();
        } catch (IOException e10) {
            Log.e(Factory.TAG, "[selector] Failed to dispatch i/o events.", e10);
        } catch (Exception e11) {
            Log.e(Factory.TAG, "[selector] Unknown exception.", e11);
        }
    }

    @Override // com.dena.showroom.flvplayback.impl.ThreadingPolicy.LooperAware
    public Looper getLooper() {
        return this.f26573w.getLooper();
    }

    public void scheduleToDispatch(Runnable runnable) {
        this.f26573w.post(runnable);
    }

    public AsyncSocketLooper(Looper looper, int i10, int i11) {
        this.C = new a();
        this.f26575y = i10;
        this.A = i11;
        this.f26573w = new Handler(looper);
        try {
            this.f26574x = Selector.open();
            a();
        } catch (IOException e10) {
            Log.e(Factory.TAG, "[selector] failed to initialize a `nio.Selector` object.", e10);
            throw new IllegalStateException(e10);
        }
    }
}
