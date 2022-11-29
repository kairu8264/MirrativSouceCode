package ai;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class oj3 {

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f7833a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer[] f7834b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer[] f7835c;

    public /* synthetic */ oj3(MediaCodec mediaCodec, Surface surface, qi3 qi3Var) {
        this.f7833a = mediaCodec;
        if (sb.f9778a < 21) {
            this.f7834b = mediaCodec.getInputBuffers();
            this.f7835c = mediaCodec.getOutputBuffers();
        }
    }

    public final int a() {
        return this.f7833a.dequeueInputBuffer(0L);
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f7833a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (sb.f9778a < 21) {
                    this.f7835c = this.f7833a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public final MediaFormat c() {
        return this.f7833a.getOutputFormat();
    }

    public final ByteBuffer d(int i10) {
        if (sb.f9778a >= 21) {
            return this.f7833a.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) sb.I(this.f7834b))[i10];
    }

    public final ByteBuffer e(int i10) {
        if (sb.f9778a >= 21) {
            return this.f7833a.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) sb.I(this.f7835c))[i10];
    }

    public final void f(int i10, int i11, int i12, long j10, int i13) {
        this.f7833a.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    public final void g(int i10, int i11, a1 a1Var, long j10, int i12) {
        this.f7833a.queueSecureInputBuffer(i10, 0, a1Var.b(), j10, 0);
    }

    public final void h(int i10, boolean z10) {
        this.f7833a.releaseOutputBuffer(i10, z10);
    }

    public final void i(int i10, long j10) {
        this.f7833a.releaseOutputBuffer(i10, j10);
    }

    public final void j() {
        this.f7833a.flush();
    }

    public final void k() {
        this.f7834b = null;
        this.f7835c = null;
        this.f7833a.release();
    }

    public final void l(Surface surface) {
        this.f7833a.setOutputSurface(surface);
    }

    public final void m(Bundle bundle) {
        this.f7833a.setParameters(bundle);
    }

    public final void n(int i10) {
        this.f7833a.setVideoScalingMode(i10);
    }
}
