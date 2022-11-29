package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
public class DefaultLoadControl implements LoadControl {
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MIN_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_MUXED_BUFFER_SIZE = 144310272;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = false;
    public static final boolean DEFAULT_RETAIN_BACK_BUFFER_FROM_KEYFRAME = false;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    public static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE = 131072000;
    private final DefaultAllocator allocator;
    private final long backBufferDurationUs;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackUs;
    private boolean isLoading;
    private final long maxBufferUs;
    private final long minBufferUs;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final boolean retainBackBufferFromKeyframe;
    private int targetBufferBytes;
    private final int targetBufferBytesOverwrite;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private DefaultAllocator allocator;
        private boolean buildCalled;
        private int minBufferMs = 50000;
        private int maxBufferMs = 50000;
        private int bufferForPlaybackMs = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        private int bufferForPlaybackAfterRebufferMs = 5000;
        private int targetBufferBytes = -1;
        private boolean prioritizeTimeOverSizeThresholds = false;
        private int backBufferDurationMs = 0;
        private boolean retainBackBufferFromKeyframe = false;

        public DefaultLoadControl build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            if (this.allocator == null) {
                this.allocator = new DefaultAllocator(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            }
            return new DefaultLoadControl(this.allocator, this.minBufferMs, this.maxBufferMs, this.bufferForPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.targetBufferBytes, this.prioritizeTimeOverSizeThresholds, this.backBufferDurationMs, this.retainBackBufferFromKeyframe);
        }

        @Deprecated
        public DefaultLoadControl createDefaultLoadControl() {
            return build();
        }

        public Builder setAllocator(DefaultAllocator defaultAllocator) {
            Assertions.checkState(!this.buildCalled);
            this.allocator = defaultAllocator;
            return this;
        }

        public Builder setBackBuffer(int i10, boolean z10) {
            Assertions.checkState(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i10, 0, "backBufferDurationMs", "0");
            this.backBufferDurationMs = i10;
            this.retainBackBufferFromKeyframe = z10;
            return this;
        }

        public Builder setBufferDurationsMs(int i10, int i11, int i12, int i13) {
            Assertions.checkState(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i12, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i10, i12, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i11, i10, "maxBufferMs", "minBufferMs");
            this.minBufferMs = i10;
            this.maxBufferMs = i11;
            this.bufferForPlaybackMs = i12;
            this.bufferForPlaybackAfterRebufferMs = i13;
            return this;
        }

        public Builder setPrioritizeTimeOverSizeThresholds(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholds = z10;
            return this;
        }

        public Builder setTargetBufferBytes(int i10) {
            Assertions.checkState(!this.buildCalled);
            this.targetBufferBytes = i10;
            return this;
        }
    }

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, C.DEFAULT_BUFFER_SEGMENT_SIZE), 50000, 50000, DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, false, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertGreaterOrEqual(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        Assertions.checkArgument(z10, str + " cannot be less than " + str2);
    }

    private static int getDefaultBufferSize(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 || i10 == 5 || i10 == 6) {
                        return 131072;
                    }
                    if (i10 == 7) {
                        return 0;
                    }
                    throw new IllegalArgumentException();
                }
                return DEFAULT_VIDEO_BUFFER_SIZE;
            }
            return 13107200;
        }
        return DEFAULT_MUXED_BUFFER_SIZE;
    }

    private void reset(boolean z10) {
        int i10 = this.targetBufferBytesOverwrite;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.targetBufferBytes = i10;
        this.isLoading = false;
        if (z10) {
            this.allocator.reset();
        }
    }

    public int calculateTargetBufferBytes(Renderer[] rendererArr, ExoTrackSelection[] exoTrackSelectionArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < rendererArr.length; i11++) {
            if (exoTrackSelectionArr[i11] != null) {
                i10 += getDefaultBufferSize(rendererArr[i11].getTrackType());
            }
        }
        return Math.max(13107200, i10);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public Allocator getAllocator() {
        return this.allocator;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public long getBackBufferDurationUs() {
        return this.backBufferDurationUs;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onPrepared() {
        reset(false);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onReleased() {
        reset(true);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onStopped() {
        reset(true);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        int i10 = this.targetBufferBytesOverwrite;
        if (i10 == -1) {
            i10 = calculateTargetBufferBytes(rendererArr, exoTrackSelectionArr);
        }
        this.targetBufferBytes = i10;
        this.allocator.setTargetBufferSize(i10);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean retainBackBufferFromKeyframe() {
        return this.retainBackBufferFromKeyframe;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldContinueLoading(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.allocator.getTotalBytesAllocated() >= this.targetBufferBytes;
        long j12 = this.minBufferUs;
        if (f10 > 1.0f) {
            j12 = Math.min(Util.getMediaDurationForPlayoutDuration(j12, f10), this.maxBufferUs);
        }
        if (j11 < Math.max(j12, 500000L)) {
            if (!this.prioritizeTimeOverSizeThresholds && z11) {
                z10 = false;
            }
            this.isLoading = z10;
            if (!z10 && j11 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.maxBufferUs || z11) {
            this.isLoading = false;
        }
        return this.isLoading;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldStartPlayback(long j10, float f10, boolean z10, long j11) {
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(j10, f10);
        long j12 = z10 ? this.bufferForPlaybackAfterRebufferUs : this.bufferForPlaybackUs;
        if (j11 != C.TIME_UNSET) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || playoutDurationForMediaDuration >= j12 || (!this.prioritizeTimeOverSizeThresholds && this.allocator.getTotalBytesAllocated() >= this.targetBufferBytes);
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        assertGreaterOrEqual(i12, 0, "bufferForPlaybackMs", "0");
        assertGreaterOrEqual(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        assertGreaterOrEqual(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i11, i10, "maxBufferMs", "minBufferMs");
        assertGreaterOrEqual(i15, 0, "backBufferDurationMs", "0");
        this.allocator = defaultAllocator;
        this.minBufferUs = C.msToUs(i10);
        this.maxBufferUs = C.msToUs(i11);
        this.bufferForPlaybackUs = C.msToUs(i12);
        this.bufferForPlaybackAfterRebufferUs = C.msToUs(i13);
        this.targetBufferBytesOverwrite = i14;
        this.targetBufferBytes = i14 == -1 ? 13107200 : i14;
        this.prioritizeTimeOverSizeThresholds = z10;
        this.backBufferDurationUs = C.msToUs(i15);
        this.retainBackBufferFromKeyframe = z11;
    }
}
