package com.dena.showroom.flvplayback.impl.net;

import android.os.Looper;
import android.util.Log;
import com.dena.showroom.flvplayback.impl.Factory;
import java.io.IOException;
import java.net.InetSocketAddress;

/* loaded from: classes3.dex */
public class AsyncSecureSocketLooper extends AsyncSocketLooper {
    public static final int DEFAULT_CONNECT_TIMEOUT = 5000;
    public static final int DEFAULT_SO_TIMEOUT = 0;
    public AsyncSecureSocket E;
    public int F;
    public int G;

    public AsyncSecureSocketLooper(Looper looper) {
        this(looper, 5000, 0);
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocketLooper, com.dena.showroom.flvplayback.Closeable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.E.close();
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocketLooper
    public AsyncSocket connect(InetSocketAddress inetSocketAddress) {
        AsyncSecureSocket asyncSecureSocket = new AsyncSecureSocket(this, this.F, this.G);
        this.E = asyncSecureSocket;
        try {
            asyncSecureSocket.connect(inetSocketAddress);
        } catch (IOException e10) {
            this.E.d(e10);
        }
        return this.E;
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocketLooper
    public void d() {
        try {
            AsyncSecureSocket asyncSecureSocket = this.E;
            if (asyncSecureSocket == null || asyncSecureSocket.isClosed()) {
                return;
            }
            if (this.E.isConnectable()) {
                if (this.E.finishConnect()) {
                    Log.i(Factory.TAG, "[SecureSocket] connected.");
                    return;
                } else {
                    this.E.d(new IOException("Failed to finish connecting!"));
                    return;
                }
            }
            if (this.E.isReadable()) {
                this.E.b();
            }
            if (this.E.isWritable()) {
                this.E.e();
            }
        } catch (Exception e10) {
            Log.e(Factory.TAG, "[SecureSocket] Failed to dispatch i/o events.", e10);
        }
    }

    public AsyncSecureSocketLooper(Looper looper, int i10, int i11) {
        super(looper);
        this.F = i10;
        this.G = i11;
    }
}
