package i8;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: y  reason: collision with root package name */
    public static final Queue<d> f36416y = k.f(0);

    /* renamed from: w  reason: collision with root package name */
    public InputStream f36417w;

    /* renamed from: x  reason: collision with root package name */
    public IOException f36418x;

    public static d c(InputStream inputStream) {
        d poll;
        Queue<d> queue = f36416y;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.e(inputStream);
        return poll;
    }

    public IOException a() {
        return this.f36418x;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f36417w.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f36417w.close();
    }

    public void d() {
        this.f36418x = null;
        this.f36417w = null;
        Queue<d> queue = f36416y;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public void e(InputStream inputStream) {
        this.f36417w = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f36417w.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f36417w.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f36417w.read();
        } catch (IOException e10) {
            this.f36418x = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f36417w.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f36417w.skip(j10);
        } catch (IOException e10) {
            this.f36418x = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f36417w.read(bArr);
        } catch (IOException e10) {
            this.f36418x = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f36417w.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f36418x = e10;
            throw e10;
        }
    }
}
