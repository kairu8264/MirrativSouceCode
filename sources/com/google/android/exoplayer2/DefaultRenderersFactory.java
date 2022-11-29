package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.MediaCodecAudioRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final String TAG = "DefaultRenderersFactory";
    private long allowedVideoJoiningTimeMs;
    private final Context context;
    private boolean enableAsyncQueueing;
    private boolean enableAudioTrackPlaybackParams;
    private boolean enableDecoderFallback;
    private boolean enableFloatOutput;
    private boolean enableOffload;
    private boolean enableSynchronizeCodecInteractionsWithQueueing;
    private int extensionRendererMode;
    private boolean forceAsyncQueueingSynchronizationWorkaround;
    private MediaCodecSelector mediaCodecSelector;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.context = context;
        this.extensionRendererMode = 0;
        this.allowedVideoJoiningTimeMs = DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.mediaCodecSelector = MediaCodecSelector.DEFAULT;
    }

    public void buildAudioRenderers(Context context, int i10, MediaCodecSelector mediaCodecSelector, boolean z10, AudioSink audioSink, Handler handler, AudioRendererEventListener audioRendererEventListener, ArrayList<Renderer> arrayList) {
        int i11;
        int i12;
        MediaCodecAudioRenderer mediaCodecAudioRenderer = new MediaCodecAudioRenderer(context, mediaCodecSelector, z10, handler, audioRendererEventListener, audioSink);
        mediaCodecAudioRenderer.experimentalSetAsynchronousBufferQueueingEnabled(this.enableAsyncQueueing);
        mediaCodecAudioRenderer.experimentalSetForceAsyncQueueingSynchronizationWorkaround(this.forceAsyncQueueingSynchronizationWorkaround);
        mediaCodecAudioRenderer.experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(this.enableSynchronizeCodecInteractionsWithQueueing);
        arrayList.add(mediaCodecAudioRenderer);
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (Renderer) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                    Log.i(TAG, "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                    try {
                        i12 = i11 + 1;
                        arrayList.add(i11, (Renderer) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        Log.i(TAG, "Loaded LibflacAudioRenderer.");
                        arrayList.add(i12, (Renderer) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating FLAC extension", e10);
                    }
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                i12 = i11 + 1;
            } catch (ClassNotFoundException unused3) {
            }
            try {
                try {
                    arrayList.add(i11, (Renderer) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                    Log.i(TAG, "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused4) {
                    i11 = i12;
                    i12 = i11;
                    arrayList.add(i12, (Renderer) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                    Log.i(TAG, "Loaded FfmpegAudioRenderer.");
                }
                arrayList.add(i12, (Renderer) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                Log.i(TAG, "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating Opus extension", e12);
        }
    }

    public AudioSink buildAudioSink(Context context, boolean z10, boolean z11, boolean z12) {
        return new DefaultAudioSink(AudioCapabilities.getCapabilities(context), new DefaultAudioSink.DefaultAudioProcessorChain(new AudioProcessor[0]), z10, z11, z12);
    }

    public void buildCameraMotionRenderers(Context context, int i10, ArrayList<Renderer> arrayList) {
        arrayList.add(new CameraMotionRenderer());
    }

    public void buildMetadataRenderers(Context context, MetadataOutput metadataOutput, Looper looper, int i10, ArrayList<Renderer> arrayList) {
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
    }

    public void buildMiscellaneousRenderers(Context context, Handler handler, int i10, ArrayList<Renderer> arrayList) {
    }

    public void buildTextRenderers(Context context, TextOutput textOutput, Looper looper, int i10, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    public void buildVideoRenderers(Context context, int i10, MediaCodecSelector mediaCodecSelector, boolean z10, Handler handler, VideoRendererEventListener videoRendererEventListener, long j10, ArrayList<Renderer> arrayList) {
        int i11;
        MediaCodecVideoRenderer mediaCodecVideoRenderer = new MediaCodecVideoRenderer(context, mediaCodecSelector, j10, z10, handler, videoRendererEventListener, 50);
        mediaCodecVideoRenderer.experimentalSetAsynchronousBufferQueueingEnabled(this.enableAsyncQueueing);
        mediaCodecVideoRenderer.experimentalSetForceAsyncQueueingSynchronizationWorkaround(this.forceAsyncQueueingSynchronizationWorkaround);
        mediaCodecVideoRenderer.experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(this.enableSynchronizeCodecInteractionsWithQueueing);
        arrayList.add(mediaCodecVideoRenderer);
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (Renderer) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, videoRendererEventListener, 50));
                    Log.i(TAG, "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                    arrayList.add(i11, (Renderer) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, videoRendererEventListener, 50));
                    Log.i(TAG, "Loaded Libgav1VideoRenderer.");
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                arrayList.add(i11, (Renderer) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, videoRendererEventListener, 50));
                Log.i(TAG, "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating AV1 extension", e10);
            }
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating VP9 extension", e11);
        }
    }

    @Override // com.google.android.exoplayer2.RenderersFactory
    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        ArrayList<Renderer> arrayList = new ArrayList<>();
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs, arrayList);
        AudioSink buildAudioSink = buildAudioSink(this.context, this.enableFloatOutput, this.enableAudioTrackPlaybackParams, this.enableOffload);
        if (buildAudioSink != null) {
            buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, buildAudioSink, handler, audioRendererEventListener, arrayList);
        }
        buildTextRenderers(this.context, textOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildMiscellaneousRenderers(this.context, handler, this.extensionRendererMode, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    public DefaultRenderersFactory experimentalSetAsynchronousBufferQueueingEnabled(boolean z10) {
        this.enableAsyncQueueing = z10;
        return this;
    }

    public DefaultRenderersFactory experimentalSetForceAsyncQueueingSynchronizationWorkaround(boolean z10) {
        this.forceAsyncQueueingSynchronizationWorkaround = z10;
        return this;
    }

    public DefaultRenderersFactory experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean z10) {
        this.enableSynchronizeCodecInteractionsWithQueueing = z10;
        return this;
    }

    public DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long j10) {
        this.allowedVideoJoiningTimeMs = j10;
        return this;
    }

    public DefaultRenderersFactory setEnableAudioFloatOutput(boolean z10) {
        this.enableFloatOutput = z10;
        return this;
    }

    public DefaultRenderersFactory setEnableAudioOffload(boolean z10) {
        this.enableOffload = z10;
        return this;
    }

    public DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean z10) {
        this.enableAudioTrackPlaybackParams = z10;
        return this;
    }

    public DefaultRenderersFactory setEnableDecoderFallback(boolean z10) {
        this.enableDecoderFallback = z10;
        return this;
    }

    public DefaultRenderersFactory setExtensionRendererMode(int i10) {
        this.extensionRendererMode = i10;
        return this;
    }

    public DefaultRenderersFactory setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
        this.mediaCodecSelector = mediaCodecSelector;
        return this;
    }

    @Deprecated
    public DefaultRenderersFactory(Context context, int i10) {
        this(context, i10, DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    @Deprecated
    public DefaultRenderersFactory(Context context, int i10, long j10) {
        this.context = context;
        this.extensionRendererMode = i10;
        this.allowedVideoJoiningTimeMs = j10;
        this.mediaCodecSelector = MediaCodecSelector.DEFAULT;
    }
}
