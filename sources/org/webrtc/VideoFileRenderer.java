package org.webrtc;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.C;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

/* loaded from: classes4.dex */
public class VideoFileRenderer implements VideoSink {
    private static final String TAG = "VideoFileRenderer";
    private EglBase eglBase;
    private final HandlerThread fileThread;
    private final Handler fileThreadHandler;
    private int frameCount;
    private final int outputFileHeight;
    private final String outputFileName;
    private final int outputFileWidth;
    private final ByteBuffer outputFrameBuffer;
    private final int outputFrameSize;
    private final HandlerThread renderThread;
    private final Handler renderThreadHandler;
    private final FileOutputStream videoOutFile;
    private YuvConverter yuvConverter;

    public VideoFileRenderer(String str, int i10, int i11, final EglBase.Context context) throws IOException {
        if (i10 % 2 != 1 && i11 % 2 != 1) {
            this.outputFileName = str;
            this.outputFileWidth = i10;
            this.outputFileHeight = i11;
            int i12 = ((i10 * i11) * 3) / 2;
            this.outputFrameSize = i12;
            this.outputFrameBuffer = ByteBuffer.allocateDirect(i12);
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            this.videoOutFile = fileOutputStream;
            fileOutputStream.write(("YUV4MPEG2 C420 W" + i10 + " H" + i11 + " Ip F30:1 A1:1\n").getBytes(Charset.forName(C.ASCII_NAME)));
            HandlerThread handlerThread = new HandlerThread("VideoFileRendererRenderThread");
            this.renderThread = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.renderThreadHandler = handler;
            HandlerThread handlerThread2 = new HandlerThread("VideoFileRendererFileThread");
            this.fileThread = handlerThread2;
            handlerThread2.start();
            this.fileThreadHandler = new Handler(handlerThread2.getLooper());
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: org.webrtc.VideoFileRenderer.1
                @Override // java.lang.Runnable
                public void run() {
                    VideoFileRenderer.this.eglBase = EglBase.create(context, EglBase.CONFIG_PIXEL_BUFFER);
                    VideoFileRenderer.this.eglBase.createDummyPbufferSurface();
                    VideoFileRenderer.this.eglBase.makeCurrent();
                    VideoFileRenderer.this.yuvConverter = new YuvConverter();
                }
            });
            return;
        }
        throw new IllegalArgumentException("Does not support uneven width or height");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2(CountDownLatch countDownLatch) {
        this.yuvConverter.release();
        this.eglBase.release();
        this.renderThread.quit();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$3() {
        try {
            this.videoOutFile.close();
            Logging.d(TAG, "Video written to disk as " + this.outputFileName + ". The number of frames is " + this.frameCount + " and the dimensions of the frames are " + this.outputFileWidth + "x" + this.outputFileHeight + TopicConstant.SEPARATOR);
            this.fileThread.quit();
        } catch (IOException e10) {
            throw new RuntimeException("Error closing output file", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderFrameOnRenderThread$1(VideoFrame.I420Buffer i420Buffer, VideoFrame videoFrame) {
        YuvHelper.I420Rotate(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), this.outputFrameBuffer, i420Buffer.getWidth(), i420Buffer.getHeight(), videoFrame.getRotation());
        i420Buffer.release();
        try {
            this.videoOutFile.write("FRAME\n".getBytes(Charset.forName(C.ASCII_NAME)));
            this.videoOutFile.write(this.outputFrameBuffer.array(), this.outputFrameBuffer.arrayOffset(), this.outputFrameSize);
            this.frameCount++;
        } catch (IOException e10) {
            throw new RuntimeException("Error writing video to disk", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: renderFrameOnRenderThread */
    public void lambda$onFrame$0(final VideoFrame videoFrame) {
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        int i10 = videoFrame.getRotation() % 180 == 0 ? this.outputFileWidth : this.outputFileHeight;
        int i11 = videoFrame.getRotation() % 180 == 0 ? this.outputFileHeight : this.outputFileWidth;
        float width = buffer.getWidth() / buffer.getHeight();
        float f10 = i10 / i11;
        int width2 = buffer.getWidth();
        int height = buffer.getHeight();
        if (f10 > width) {
            height = (int) (height * (width / f10));
        } else {
            width2 = (int) (width2 * (f10 / width));
        }
        VideoFrame.Buffer cropAndScale = buffer.cropAndScale((buffer.getWidth() - width2) / 2, (buffer.getHeight() - height) / 2, width2, height, i10, i11);
        videoFrame.release();
        final VideoFrame.I420Buffer i420 = cropAndScale.toI420();
        cropAndScale.release();
        this.fileThreadHandler.post(new Runnable() { // from class: org.webrtc.e0
            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.this.lambda$renderFrameOnRenderThread$1(i420, videoFrame);
            }
        });
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(final VideoFrame videoFrame) {
        videoFrame.retain();
        this.renderThreadHandler.post(new Runnable() { // from class: org.webrtc.f0
            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.this.lambda$onFrame$0(videoFrame);
            }
        });
    }

    public void release() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.renderThreadHandler.post(new Runnable() { // from class: org.webrtc.d0
            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.this.lambda$release$2(countDownLatch);
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        this.fileThreadHandler.post(new Runnable() { // from class: org.webrtc.c0
            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.this.lambda$release$3();
            }
        });
        try {
            this.fileThread.join();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            Logging.e(TAG, "Interrupted while waiting for the write to disk to complete.", e10);
        }
    }
}
