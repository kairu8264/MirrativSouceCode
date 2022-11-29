package com.dena.showroom.flvplayback.impl.net;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.dena.showroom.flvplayback.impl.Factory;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public class AsyncSecureSocket extends AsyncSocket {
    public Handler E;
    public final Object F;
    public final Object G;
    public SSLSocket H;
    public Semaphore I;
    public Semaphore J;
    public HandlerThread K;
    public Handler L;
    public AsyncSocketDelegate M;
    public BufferedInputStream N;
    public BufferedOutputStream O;
    public int P;
    public int Q;
    public byte[] R;
    public int S;
    public int T;
    public byte[] U;
    public boolean V;
    public boolean W;
    public boolean X;

    /* loaded from: classes3.dex */
    public class ConnectionNotEstablishedException extends Exception {
        public ConnectionNotEstablishedException(AsyncSecureSocket asyncSecureSocket) {
        }

        public ConnectionNotEstablishedException(AsyncSecureSocket asyncSecureSocket, String str) {
            super(str);
        }

        public ConnectionNotEstablishedException(AsyncSecureSocket asyncSecureSocket, String str, Throwable th2) {
            super(str, th2);
        }

        public ConnectionNotEstablishedException(AsyncSecureSocket asyncSecureSocket, Throwable th2) {
            super(th2);
        }
    }

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Throwable f26549w;

        public a(Throwable th2) {
            this.f26549w = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AsyncSecureSocket.this.M != null) {
                AsyncSecureSocket.this.M.onClosed(AsyncSecureSocket.this, this.f26549w);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ InetSocketAddress f26551w;

        public b(InetSocketAddress inetSocketAddress) {
            this.f26551w = inetSocketAddress;
        }

        @Override // java.lang.Runnable
        public void run() {
            InetAddress address;
            int port;
            try {
                try {
                    address = this.f26551w.getAddress();
                    port = this.f26551w.getPort();
                } catch (Exception e10) {
                    AsyncSecureSocket.this.d(e10);
                }
                if (address != null) {
                    AsyncSecureSocket.this.H = (SSLSocket) SSLSocketFactory.getDefault().createSocket(address, port);
                    AsyncSecureSocket.this.H.setSoTimeout(AsyncSecureSocket.this.Q);
                    AsyncSecureSocket.this.H.startHandshake();
                    AsyncSecureSocket.this.N = new BufferedInputStream(AsyncSecureSocket.this.H.getInputStream());
                    AsyncSecureSocket.this.O = new BufferedOutputStream(AsyncSecureSocket.this.H.getOutputStream());
                    AsyncSecureSocket.this.w();
                    AsyncSecureSocket.this.t();
                    AsyncSecureSocket.this.p(true);
                    AsyncSecureSocket.this.r(true);
                    return;
                }
                throw new ConnectionNotEstablishedException(AsyncSecureSocket.this, "Address not resolved");
            } finally {
                AsyncSecureSocket.this.I.release();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ byte[] f26553w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f26554x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f26555y;

        public c(byte[] bArr, int i10, int i11) {
            this.f26553w = bArr;
            this.f26554x = i10;
            this.f26555y = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    AsyncSecureSocket.this.O.write(this.f26553w, this.f26554x, this.f26555y);
                    AsyncSecureSocket.this.O.flush();
                    AsyncSecureSocket.this.r(true);
                } catch (Exception e10) {
                    AsyncSecureSocket.this.d(e10);
                }
            } finally {
                AsyncSecureSocket.this.J.release();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!AsyncSecureSocket.this.isClosed()) {
                try {
                    AsyncSecureSocket asyncSecureSocket = AsyncSecureSocket.this;
                    asyncSecureSocket.S = asyncSecureSocket.N.read(AsyncSecureSocket.this.R);
                    synchronized (AsyncSecureSocket.this.G) {
                        AsyncSecureSocket.this.G.wait(AsyncSecureSocket.this.Q);
                    }
                } catch (Exception e10) {
                    AsyncSecureSocket.this.d(e10);
                    return;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AsyncSecureSocket.this.M != null) {
                AsyncSecureSocket.this.M.onSpaceAvailable(AsyncSecureSocket.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AsyncSecureSocket.this.M != null) {
                AsyncSecureSocket.this.M.onBytesAvailable(AsyncSecureSocket.this);
            }
        }
    }

    public AsyncSecureSocket(AsyncSocketLooper asyncSocketLooper, int i10, int i11) {
        super(asyncSocketLooper, null);
        this.F = new Object();
        this.G = new Object();
        this.I = new Semaphore(1);
        this.J = new Semaphore(1);
        this.R = new byte[8192];
        this.S = 0;
        this.T = 0;
        this.U = new byte[8192];
        this.V = false;
        this.W = false;
        this.X = false;
        this.E = new Handler(asyncSocketLooper.getLooper());
        this.P = i10;
        this.Q = i11;
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocket
    public void b() {
        c(new f(), true);
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocket
    public void close() {
        d(null);
    }

    public boolean connect(InetSocketAddress inetSocketAddress) {
        try {
            this.I.acquire();
            new Thread(new b(inetSocketAddress)).start();
            return false;
        } catch (Exception e10) {
            d(e10);
            return false;
        }
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocket
    public void d(Throwable th2) {
        l(true);
        synchronized (this.G) {
            this.G.notifyAll();
        }
        this.I.release();
        this.J.release();
        BufferedInputStream bufferedInputStream = this.N;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (Exception unused) {
            }
            this.N = null;
        }
        BufferedOutputStream bufferedOutputStream = this.O;
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.close();
            } catch (Exception unused2) {
            }
            this.O = null;
        }
        SSLSocket sSLSocket = this.H;
        if (sSLSocket != null) {
            try {
                sSLSocket.close();
            } catch (Exception unused3) {
            }
            this.H = null;
        }
        HandlerThread handlerThread = this.K;
        if (handlerThread != null) {
            handlerThread.quit();
            this.K = null;
        }
        if (th2 != null) {
            c(new a(th2), false);
        }
        Log.i(Factory.TAG, "[SecureSocket] closed", th2);
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocket
    public void e() {
        c(new e(), true);
    }

    public boolean finishConnect() {
        try {
            this.I.tryAcquire(this.P, TimeUnit.MILLISECONDS);
            return s();
        } catch (Exception e10) {
            e10.printStackTrace();
            d(e10);
            return false;
        } finally {
            this.I.release();
        }
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocket, com.dena.showroom.flvplayback.impl.ThreadingPolicy.LooperAware
    public Looper getLooper() {
        return this.E.getLooper();
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocket
    public boolean isClosed() {
        boolean z10;
        synchronized (this.F) {
            z10 = this.W;
        }
        return z10;
    }

    public boolean isConnectable() {
        return (s() || isClosed()) ? false : true;
    }

    public boolean isReadable() {
        return !isClosed() && s() && this.N != null && this.S > 0;
    }

    public boolean isWritable() {
        boolean z10;
        synchronized (this.F) {
            z10 = this.X;
        }
        return z10;
    }

    public final void l(boolean z10) {
        synchronized (this.F) {
            this.W = z10;
        }
    }

    public final void m(byte[] bArr, int i10, int i11) {
        this.L.post(new c(bArr, i10, i11));
    }

    public final void p(boolean z10) {
        synchronized (this.F) {
            this.V = z10;
        }
    }

    public final void r(boolean z10) {
        synchronized (this.F) {
            this.X = z10;
        }
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocket
    public int read(ByteBuffer byteBuffer) {
        if (s() && !isClosed()) {
            try {
                if (this.S <= 0) {
                    return 0;
                }
                int min = Math.min(this.S, Math.min(byteBuffer.limit() - byteBuffer.position(), 8192));
                byteBuffer.put(this.R, this.T, min);
                int i10 = this.S - min;
                this.S = i10;
                this.T += min;
                if (i10 == 0) {
                    synchronized (this.G) {
                        this.S = 0;
                        this.T = 0;
                        this.G.notifyAll();
                    }
                }
                return min;
            } catch (Exception e10) {
                d(e10);
            }
        }
        return 0;
    }

    public final boolean s() {
        boolean z10;
        synchronized (this.F) {
            z10 = this.V;
        }
        return z10;
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocket
    public int send(ByteBuffer byteBuffer) {
        if (s() && !isClosed()) {
            r(false);
            try {
                this.J.acquire();
                int min = Math.min(byteBuffer.limit() - byteBuffer.position(), 8192);
                byteBuffer.get(this.U, 0, min);
                m(this.U, 0, min);
                return min;
            } catch (Exception e10) {
                d(e10);
            }
        }
        return 0;
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocket
    public void setDelegate(AsyncSocketDelegate asyncSocketDelegate) {
        this.M = asyncSocketDelegate;
    }

    public final void t() {
        new Thread(new d()).start();
    }

    public final void w() {
        HandlerThread handlerThread = new HandlerThread("SendThread");
        this.K = handlerThread;
        handlerThread.start();
        this.L = new Handler(this.K.getLooper());
    }
}
