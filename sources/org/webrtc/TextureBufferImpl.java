package org.webrtc;

import android.graphics.Matrix;
import android.os.Handler;
import java.util.concurrent.Callable;
import org.webrtc.VideoFrame;

/* loaded from: classes4.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;

    /* renamed from: id  reason: collision with root package name */
    private final int f45557id;
    private final RefCountDelegate refCountDelegate;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final YuvConverter yuvConverter;

    public TextureBufferImpl(int i10, int i11, VideoFrame.TextureBuffer.Type type, int i12, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this.unscaledWidth = i10;
        this.unscaledHeight = i11;
        this.width = i10;
        this.height = i11;
        this.type = type;
        this.f45557id = i12;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$0() throws Exception {
        return this.yuvConverter.convert(this);
    }

    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i10, int i11) {
        return applyTransformMatrix(matrix, i10, i11, i10, i11);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        Matrix matrix = new Matrix();
        int i16 = this.height;
        matrix.preTranslate(i10 / this.width, (i16 - (i11 + i13)) / i16);
        matrix.preScale(i12 / this.width, i13 / this.height);
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i12) / this.width), Math.round((this.unscaledHeight * i13) / this.height), i14, i15);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.f45557id;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: org.webrtc.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                VideoFrame.I420Buffer lambda$toI420$0;
                lambda$toI420$0 = TextureBufferImpl.this.lambda$toI420$0();
                return lambda$toI420$0;
            }
        });
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i10, int i11, int i12, int i13) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i10, i11, i12, i13, this.type, this.f45557id, matrix2, this.toI420Handler, this.yuvConverter, new Runnable() { // from class: org.webrtc.y
            @Override // java.lang.Runnable
            public final void run() {
                TextureBufferImpl.this.release();
            }
        });
    }

    private TextureBufferImpl(int i10, int i11, int i12, int i13, VideoFrame.TextureBuffer.Type type, int i14, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this.unscaledWidth = i10;
        this.unscaledHeight = i11;
        this.width = i12;
        this.height = i13;
        this.type = type;
        this.f45557id = i14;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
