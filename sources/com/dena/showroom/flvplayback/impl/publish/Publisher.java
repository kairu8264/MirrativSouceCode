package com.dena.showroom.flvplayback.impl.publish;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.dena.showroom.flvplayback.FLVPublisher;
import com.dena.showroom.flvplayback.RTMPEndpoint;
import com.dena.showroom.flvplayback.RTMPWriter;
import com.dena.showroom.flvplayback.Sample;
import com.dena.showroom.flvplayback.SampleSource;
import com.dena.showroom.flvplayback.impl.Factory;
import com.dena.showroom.flvplayback.impl.net.AsyncSocket;
import com.dena.showroom.flvplayback.impl.net.AsyncSocketDelegate;
import com.dena.showroom.flvplayback.impl.net.AsyncSocketLooper;
import com.dena.showroom.flvplayback.impl.util.BitrateCounter;
import com.dena.showroom.flvplayback.impl.util.MovingMedian;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class Publisher implements FLVPublisher, SampleSource.Sink, AsyncSocketDelegate {
    public static final /* synthetic */ boolean J = true;
    public SampleSource.Connection A;
    public SampleSource.Connection B;
    public RTMPWriter C;
    public AsyncSocket D;
    public BitrateCounter E = new BitrateCounter();
    public BitrateCounter F = new BitrateCounter();
    public BitrateCounter G = new BitrateCounter();
    public long H;
    public int I;

    /* renamed from: w  reason: collision with root package name */
    public Handler f26581w;

    /* renamed from: x  reason: collision with root package name */
    public FLVPublisher.Callback f26582x;

    /* renamed from: y  reason: collision with root package name */
    public SampleSource f26583y;

    /* renamed from: z  reason: collision with root package name */
    public SampleSource f26584z;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Publisher.this.n();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f26586w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Sample f26587x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f26588y;

        public b(int i10, Sample sample, ByteBuffer byteBuffer) {
            this.f26586w = i10;
            this.f26587x = sample;
            this.f26588y = byteBuffer;
        }

        @Override // java.lang.Runnable
        public void run() {
            Publisher.this.e(this.f26586w, this.f26587x, this.f26588y);
        }
    }

    public Publisher(RTMPEndpoint rTMPEndpoint, AsyncSocketLooper asyncSocketLooper) {
        new MovingMedian(7);
        this.C = Factory.newWriter(rTMPEndpoint);
        AsyncSocket connect = asyncSocketLooper.connect(rTMPEndpoint.getSocketAddress());
        this.D = connect;
        connect.setDelegate(this);
        this.f26581w = new Handler(asyncSocketLooper.getLooper());
        n();
        this.H = SystemClock.uptimeMillis();
    }

    public final ByteBuffer a(ByteBuffer byteBuffer) {
        ByteBuffer allocate;
        if (byteBuffer.isDirect()) {
            allocate = ByteBuffer.allocateDirect(byteBuffer.limit());
        } else {
            allocate = ByteBuffer.allocate(byteBuffer.limit());
        }
        allocate.put(byteBuffer);
        allocate.flip();
        return allocate;
    }

    public final void c() {
    }

    @Override // com.dena.showroom.flvplayback.Closeable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j(null);
    }

    public final void d(double d10) {
        SampleSource.Connection connection = this.A;
        if (connection != null) {
            connection.close();
            this.A = null;
        }
        SampleSource sampleSource = this.f26583y;
        if (sampleSource != null) {
            this.A = sampleSource.open(this, d10);
        }
    }

    public final void e(int i10, Sample sample, ByteBuffer byteBuffer) {
        this.C.enqueueSample(i10, sample, byteBuffer);
        if (i10 == 1) {
            this.G.update(sample.getSize());
        } else if (i10 != 2) {
        } else {
            this.F.update(sample.getSize());
        }
    }

    public int getEncoderBitrate() {
        return (int) (this.F.bps() + this.G.bps());
    }

    public int getNetworkBitrate() {
        return (int) this.E.bps();
    }

    public int getSendQueueSize() {
        return this.I;
    }

    public boolean isClosed() {
        return this.D == null;
    }

    public final void j(Throwable th2) {
        setAudioSource(null);
        setVideoSource(null);
        AsyncSocket asyncSocket = this.D;
        if (asyncSocket != null) {
            asyncSocket.close();
            this.D = null;
            FLVPublisher.Callback callback = this.f26582x;
            if (callback != null && th2 != null) {
                callback.onCrash(this, th2);
            }
            Log.e(Factory.TAG, "[publisher] closed", th2);
        }
        Handler handler = this.f26581w;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f26581w = null;
        }
    }

    public final void n() {
        try {
            c();
            Handler handler = this.f26581w;
            if (handler != null) {
                handler.postDelayed(new a(), 1000L);
            }
        } catch (Throwable th2) {
            if (this.f26581w != null) {
                this.f26581w.postDelayed(new a(), 1000L);
            }
            throw th2;
        }
    }

    public final void o(double d10) {
        SampleSource.Connection connection = this.B;
        if (connection != null) {
            connection.close();
            this.B = null;
        }
        SampleSource sampleSource = this.f26584z;
        if (sampleSource != null) {
            this.B = sampleSource.open(this, d10);
        }
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocketDelegate
    public void onBytesAvailable(AsyncSocket asyncSocket) {
        if (isClosed()) {
            return;
        }
        do {
            int read = asyncSocket.read(this.C.getIncomingBytes());
            if (read > 0) {
                Log.d(Factory.TAG, "[publisher] incomingBytes=" + read);
            }
        } while (p());
        c();
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocketDelegate
    public void onClosed(AsyncSocket asyncSocket, Throwable th2) {
        j(th2);
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Sink
    public void onCrash(SampleSource.Connection connection, Throwable th2) {
        if (th2 instanceof SampleSource.ReopenRequiredException) {
            if (connection == this.f26584z) {
                o(1.0d);
            }
            if (connection == this.f26583y) {
                d(1.0d);
                return;
            }
            return;
        }
        j(th2);
    }

    @Override // com.dena.showroom.flvplayback.SampleSource.Sink
    public void onSampleProduced(SampleSource.Connection connection) {
        int i10;
        if (connection == this.A) {
            i10 = 2;
        } else {
            i10 = connection == this.B ? 1 : -1;
        }
        if (i10 == -1) {
            Log.w(Factory.TAG, "Unknown sample source!");
            return;
        }
        Sample lastSample = connection.getLastSample();
        if (!J && lastSample == null) {
            throw new AssertionError();
        }
        if (lastSample.baseClock() != -1) {
            lastSample = lastSample.withTimestamp((lastSample.pts() + lastSample.baseClock()) - this.H, (lastSample.dts() + lastSample.baseClock()) - this.H);
        } else if (lastSample.isConfig()) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.H;
            lastSample = lastSample.withTimestamp(uptimeMillis, uptimeMillis);
        }
        if (this.f26581w.getLooper().getThread().getId() == Thread.currentThread().getId()) {
            e(i10, lastSample, connection.getLastSampleData());
        } else {
            this.f26581w.post(new b(i10, lastSample, a(connection.getLastSampleData())));
        }
        connection.dequeueSample();
    }

    @Override // com.dena.showroom.flvplayback.impl.net.AsyncSocketDelegate
    public void onSpaceAvailable(AsyncSocket asyncSocket) {
        if (isClosed()) {
            return;
        }
        do {
            int send = asyncSocket.send(this.C.getOutgoingBytes());
            if (send > 0) {
                this.E.update(send);
            }
        } while (p());
        this.I = (int) this.C.getQueueSize();
        c();
    }

    public final boolean p() {
        try {
            return this.C.proceed();
        } catch (Exception e10) {
            j(e10);
            return false;
        }
    }

    @Override // com.dena.showroom.flvplayback.FLVPublisher
    public void setAudioSource(SampleSource sampleSource) {
        if (isClosed()) {
            return;
        }
        this.f26583y = sampleSource;
        d(1.0d);
    }

    @Override // com.dena.showroom.flvplayback.FLVPublisher
    public void setCallback(FLVPublisher.Callback callback) {
        this.f26582x = callback;
    }

    public void setMaxBitrate(int i10) {
        AsyncSocket asyncSocket = this.D;
        if (asyncSocket != null) {
            asyncSocket.maxOutgoingBytesPerSecond = i10 / 8;
        }
    }

    @Override // com.dena.showroom.flvplayback.FLVPublisher
    public void setVideoSource(SampleSource sampleSource) {
        if (isClosed()) {
            return;
        }
        this.f26584z = sampleSource;
        o(1.0d);
    }
}
