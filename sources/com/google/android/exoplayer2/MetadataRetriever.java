package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import nk.c;

/* loaded from: classes3.dex */
public final class MetadataRetriever {

    /* loaded from: classes3.dex */
    public static final class MetadataRetrieverInternal {
        private static final int MESSAGE_CHECK_FOR_FAILURE = 1;
        private static final int MESSAGE_CONTINUE_LOADING = 2;
        private static final int MESSAGE_PREPARE_SOURCE = 0;
        private static final int MESSAGE_RELEASE = 3;
        private final MediaSourceFactory mediaSourceFactory;
        private final HandlerWrapper mediaSourceHandler;
        private final HandlerThread mediaSourceThread;
        private final nk.d<TrackGroupArray> trackGroupsFuture;

        /* loaded from: classes3.dex */
        public final class MediaSourceHandlerCallback implements Handler.Callback {
            private static final int ERROR_POLL_INTERVAL_MS = 100;
            private MediaPeriod mediaPeriod;
            private MediaSource mediaSource;
            private final MediaSourceCaller mediaSourceCaller = new MediaSourceCaller();

            /* loaded from: classes3.dex */
            public final class MediaSourceCaller implements MediaSource.MediaSourceCaller {
                private boolean mediaPeriodCreated;
                private final MediaPeriodCallback mediaPeriodCallback = new MediaPeriodCallback();
                private final Allocator allocator = new DefaultAllocator(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);

                /* loaded from: classes3.dex */
                public final class MediaPeriodCallback implements MediaPeriod.Callback {
                    private MediaPeriodCallback() {
                    }

                    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
                    public void onPrepared(MediaPeriod mediaPeriod) {
                        MetadataRetrieverInternal.this.trackGroupsFuture.A(mediaPeriod.getTrackGroups());
                        MetadataRetrieverInternal.this.mediaSourceHandler.obtainMessage(3).sendToTarget();
                    }

                    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
                    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
                        MetadataRetrieverInternal.this.mediaSourceHandler.obtainMessage(2).sendToTarget();
                    }
                }

                public MediaSourceCaller() {
                }

                @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
                public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
                    if (this.mediaPeriodCreated) {
                        return;
                    }
                    this.mediaPeriodCreated = true;
                    MediaSourceHandlerCallback.this.mediaPeriod = mediaSource.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0)), this.allocator, 0L);
                    MediaSourceHandlerCallback.this.mediaPeriod.prepare(this.mediaPeriodCallback, 0L);
                }
            }

            public MediaSourceHandlerCallback() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i10 = message.what;
                if (i10 == 0) {
                    MediaSource createMediaSource = MetadataRetrieverInternal.this.mediaSourceFactory.createMediaSource((MediaItem) message.obj);
                    this.mediaSource = createMediaSource;
                    createMediaSource.prepareSource(this.mediaSourceCaller, null);
                    MetadataRetrieverInternal.this.mediaSourceHandler.sendEmptyMessage(1);
                    return true;
                } else if (i10 == 1) {
                    try {
                        MediaPeriod mediaPeriod = this.mediaPeriod;
                        if (mediaPeriod == null) {
                            ((MediaSource) Assertions.checkNotNull(this.mediaSource)).maybeThrowSourceInfoRefreshError();
                        } else {
                            mediaPeriod.maybeThrowPrepareError();
                        }
                        MetadataRetrieverInternal.this.mediaSourceHandler.sendEmptyMessageDelayed(1, 100);
                    } catch (Exception e10) {
                        MetadataRetrieverInternal.this.trackGroupsFuture.B(e10);
                        MetadataRetrieverInternal.this.mediaSourceHandler.obtainMessage(3).sendToTarget();
                    }
                    return true;
                } else if (i10 == 2) {
                    ((MediaPeriod) Assertions.checkNotNull(this.mediaPeriod)).continueLoading(0L);
                    return true;
                } else if (i10 != 3) {
                    return false;
                } else {
                    if (this.mediaPeriod != null) {
                        ((MediaSource) Assertions.checkNotNull(this.mediaSource)).releasePeriod(this.mediaPeriod);
                    }
                    ((MediaSource) Assertions.checkNotNull(this.mediaSource)).releaseSource(this.mediaSourceCaller);
                    MetadataRetrieverInternal.this.mediaSourceHandler.removeCallbacksAndMessages(null);
                    MetadataRetrieverInternal.this.mediaSourceThread.quit();
                    return true;
                }
            }
        }

        public MetadataRetrieverInternal(MediaSourceFactory mediaSourceFactory, Clock clock) {
            this.mediaSourceFactory = mediaSourceFactory;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
            this.mediaSourceThread = handlerThread;
            handlerThread.start();
            this.mediaSourceHandler = clock.createHandler(handlerThread.getLooper(), new MediaSourceHandlerCallback());
            this.trackGroupsFuture = nk.d.D();
        }

        public c<TrackGroupArray> retrieveMetadata(MediaItem mediaItem) {
            this.mediaSourceHandler.obtainMessage(0, mediaItem).sendToTarget();
            return this.trackGroupsFuture;
        }
    }

    private MetadataRetriever() {
    }

    public static c<TrackGroupArray> retrieveMetadata(Context context, MediaItem mediaItem) {
        return retrieveMetadata(context, mediaItem, Clock.DEFAULT);
    }

    public static c<TrackGroupArray> retrieveMetadata(MediaSourceFactory mediaSourceFactory, MediaItem mediaItem) {
        return retrieveMetadata(mediaSourceFactory, mediaItem, Clock.DEFAULT);
    }

    public static c<TrackGroupArray> retrieveMetadata(Context context, MediaItem mediaItem, Clock clock) {
        return retrieveMetadata(new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory().setMp4ExtractorFlags(6)), mediaItem, clock);
    }

    private static c<TrackGroupArray> retrieveMetadata(MediaSourceFactory mediaSourceFactory, MediaItem mediaItem, Clock clock) {
        return new MetadataRetrieverInternal(mediaSourceFactory, clock).retrieveMetadata(mediaItem);
    }
}
