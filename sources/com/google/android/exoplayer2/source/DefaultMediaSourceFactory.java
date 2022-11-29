package com.google.android.exoplayer2.source;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.SingleSampleMediaSource;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private static final String TAG = "DefaultMediaSourceFactory";
    private AdsLoader.AdViewProvider adViewProvider;
    private AdsLoaderProvider adsLoaderProvider;
    private final DataSource.Factory dataSourceFactory;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final SparseArray<MediaSourceFactory> mediaSourceFactories;
    private final int[] supportedTypes;

    /* loaded from: classes3.dex */
    public interface AdsLoaderProvider {
        AdsLoader getAdsLoader(MediaItem.AdsConfiguration adsConfiguration);
    }

    public DefaultMediaSourceFactory(Context context) {
        this(new DefaultDataSourceFactory(context));
    }

    private static SparseArray<MediaSourceFactory> loadDelegates(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
        SparseArray<MediaSourceFactory> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (MediaSourceFactory) Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(MediaSourceFactory.class).getConstructor(DataSource.Factory.class).newInstance(factory));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (MediaSourceFactory) Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(MediaSourceFactory.class).getConstructor(DataSource.Factory.class).newInstance(factory));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (MediaSourceFactory) HlsMediaSource.Factory.class.asSubclass(MediaSourceFactory.class).getConstructor(DataSource.Factory.class).newInstance(factory));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new ProgressiveMediaSource.Factory(factory, extractorsFactory));
        return sparseArray;
    }

    private static MediaSource maybeClipMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        MediaItem.ClippingProperties clippingProperties = mediaItem.clippingProperties;
        long j10 = clippingProperties.startPositionMs;
        if (j10 == 0 && clippingProperties.endPositionMs == Long.MIN_VALUE && !clippingProperties.relativeToDefaultPosition) {
            return mediaSource;
        }
        long msToUs = C.msToUs(j10);
        long msToUs2 = C.msToUs(mediaItem.clippingProperties.endPositionMs);
        MediaItem.ClippingProperties clippingProperties2 = mediaItem.clippingProperties;
        return new ClippingMediaSource(mediaSource, msToUs, msToUs2, !clippingProperties2.startsAtKeyFrame, clippingProperties2.relativeToLiveWindow, clippingProperties2.relativeToDefaultPosition);
    }

    private MediaSource maybeWrapWithAdsMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        Assertions.checkNotNull(mediaItem.playbackProperties);
        MediaItem.AdsConfiguration adsConfiguration = mediaItem.playbackProperties.adsConfiguration;
        if (adsConfiguration == null) {
            return mediaSource;
        }
        AdsLoaderProvider adsLoaderProvider = this.adsLoaderProvider;
        AdsLoader.AdViewProvider adViewProvider = this.adViewProvider;
        if (adsLoaderProvider != null && adViewProvider != null) {
            AdsLoader adsLoader = adsLoaderProvider.getAdsLoader(adsConfiguration);
            if (adsLoader == null) {
                Log.w(TAG, "Playing media without ads, as no AdsLoader was provided.");
                return mediaSource;
            }
            DataSpec dataSpec = new DataSpec(adsConfiguration.adTagUri);
            Object obj = adsConfiguration.adsId;
            return new AdsMediaSource(mediaSource, dataSpec, obj != null ? obj : Pair.create(mediaItem.mediaId, adsConfiguration.adTagUri), this, adsLoader, adViewProvider);
        }
        Log.w(TAG, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        return mediaSource;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public MediaSource createMediaSource(MediaItem mediaItem) {
        Assertions.checkNotNull(mediaItem.playbackProperties);
        MediaItem.PlaybackProperties playbackProperties = mediaItem.playbackProperties;
        int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(playbackProperties.uri, playbackProperties.mimeType);
        MediaSourceFactory mediaSourceFactory = this.mediaSourceFactories.get(inferContentTypeForUriAndMimeType);
        Assertions.checkNotNull(mediaSourceFactory, "No suitable media source factory found for content type: " + inferContentTypeForUriAndMimeType);
        MediaItem.LiveConfiguration liveConfiguration = mediaItem.liveConfiguration;
        if ((liveConfiguration.targetOffsetMs == C.TIME_UNSET && this.liveTargetOffsetMs != C.TIME_UNSET) || ((liveConfiguration.minPlaybackSpeed == -3.4028235E38f && this.liveMinSpeed != -3.4028235E38f) || ((liveConfiguration.maxPlaybackSpeed == -3.4028235E38f && this.liveMaxSpeed != -3.4028235E38f) || ((liveConfiguration.minOffsetMs == C.TIME_UNSET && this.liveMinOffsetMs != C.TIME_UNSET) || (liveConfiguration.maxOffsetMs == C.TIME_UNSET && this.liveMaxOffsetMs != C.TIME_UNSET))))) {
            MediaItem.Builder buildUpon = mediaItem.buildUpon();
            long j10 = mediaItem.liveConfiguration.targetOffsetMs;
            if (j10 == C.TIME_UNSET) {
                j10 = this.liveTargetOffsetMs;
            }
            MediaItem.Builder liveTargetOffsetMs = buildUpon.setLiveTargetOffsetMs(j10);
            float f10 = mediaItem.liveConfiguration.minPlaybackSpeed;
            if (f10 == -3.4028235E38f) {
                f10 = this.liveMinSpeed;
            }
            MediaItem.Builder liveMinPlaybackSpeed = liveTargetOffsetMs.setLiveMinPlaybackSpeed(f10);
            float f11 = mediaItem.liveConfiguration.maxPlaybackSpeed;
            if (f11 == -3.4028235E38f) {
                f11 = this.liveMaxSpeed;
            }
            MediaItem.Builder liveMaxPlaybackSpeed = liveMinPlaybackSpeed.setLiveMaxPlaybackSpeed(f11);
            long j11 = mediaItem.liveConfiguration.minOffsetMs;
            if (j11 == C.TIME_UNSET) {
                j11 = this.liveMinOffsetMs;
            }
            MediaItem.Builder liveMinOffsetMs = liveMaxPlaybackSpeed.setLiveMinOffsetMs(j11);
            long j12 = mediaItem.liveConfiguration.maxOffsetMs;
            if (j12 == C.TIME_UNSET) {
                j12 = this.liveMaxOffsetMs;
            }
            mediaItem = liveMinOffsetMs.setLiveMaxOffsetMs(j12).build();
        }
        MediaSource createMediaSource = mediaSourceFactory.createMediaSource(mediaItem);
        List<MediaItem.Subtitle> list = ((MediaItem.PlaybackProperties) Util.castNonNull(mediaItem.playbackProperties)).subtitles;
        if (!list.isEmpty()) {
            MediaSource[] mediaSourceArr = new MediaSource[list.size() + 1];
            int i10 = 0;
            mediaSourceArr[0] = createMediaSource;
            SingleSampleMediaSource.Factory loadErrorHandlingPolicy = new SingleSampleMediaSource.Factory(this.dataSourceFactory).setLoadErrorHandlingPolicy(this.loadErrorHandlingPolicy);
            while (i10 < list.size()) {
                int i11 = i10 + 1;
                mediaSourceArr[i11] = loadErrorHandlingPolicy.createMediaSource(list.get(i10), C.TIME_UNSET);
                i10 = i11;
            }
            createMediaSource = new MergingMediaSource(mediaSourceArr);
        }
        return maybeWrapWithAdsMediaSource(mediaItem, maybeClipMediaSource(mediaItem, createMediaSource));
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public int[] getSupportedTypes() {
        int[] iArr = this.supportedTypes;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public DefaultMediaSourceFactory setAdViewProvider(AdsLoader.AdViewProvider adViewProvider) {
        this.adViewProvider = adViewProvider;
        return this;
    }

    public DefaultMediaSourceFactory setAdsLoaderProvider(AdsLoaderProvider adsLoaderProvider) {
        this.adsLoaderProvider = adsLoaderProvider;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxOffsetMs(long j10) {
        this.liveMaxOffsetMs = j10;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxSpeed(float f10) {
        this.liveMaxSpeed = f10;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinOffsetMs(long j10) {
        this.liveMinOffsetMs = j10;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinSpeed(float f10) {
        this.liveMinSpeed = f10;
        return this;
    }

    public DefaultMediaSourceFactory setLiveTargetOffsetMs(long j10) {
        this.liveTargetOffsetMs = j10;
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    @Deprecated
    public /* bridge */ /* synthetic */ MediaSourceFactory setStreamKeys(List list) {
        return setStreamKeys((List<StreamKey>) list);
    }

    public DefaultMediaSourceFactory(Context context, ExtractorsFactory extractorsFactory) {
        this(new DefaultDataSourceFactory(context), extractorsFactory);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setDrmHttpDataSourceFactory(HttpDataSource.Factory factory) {
        for (int i10 = 0; i10 < this.mediaSourceFactories.size(); i10++) {
            this.mediaSourceFactories.valueAt(i10).setDrmHttpDataSourceFactory(factory);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setDrmSessionManager(DrmSessionManager drmSessionManager) {
        for (int i10 = 0; i10 < this.mediaSourceFactories.size(); i10++) {
            this.mediaSourceFactories.valueAt(i10).setDrmSessionManager(drmSessionManager);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        for (int i10 = 0; i10 < this.mediaSourceFactories.size(); i10++) {
            this.mediaSourceFactories.valueAt(i10).setDrmSessionManagerProvider(drmSessionManagerProvider);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setDrmUserAgent(String str) {
        for (int i10 = 0; i10 < this.mediaSourceFactories.size(); i10++) {
            this.mediaSourceFactories.valueAt(i10).setDrmUserAgent(str);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        for (int i10 = 0; i10 < this.mediaSourceFactories.size(); i10++) {
            this.mediaSourceFactories.valueAt(i10).setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    @Deprecated
    public DefaultMediaSourceFactory setStreamKeys(List<StreamKey> list) {
        for (int i10 = 0; i10 < this.mediaSourceFactories.size(); i10++) {
            this.mediaSourceFactories.valueAt(i10).setStreamKeys(list);
        }
        return this;
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory) {
        this(factory, new DefaultExtractorsFactory());
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
        this.dataSourceFactory = factory;
        SparseArray<MediaSourceFactory> loadDelegates = loadDelegates(factory, extractorsFactory);
        this.mediaSourceFactories = loadDelegates;
        this.supportedTypes = new int[loadDelegates.size()];
        for (int i10 = 0; i10 < this.mediaSourceFactories.size(); i10++) {
            this.supportedTypes[i10] = this.mediaSourceFactories.keyAt(i10);
        }
        this.liveTargetOffsetMs = C.TIME_UNSET;
        this.liveMinOffsetMs = C.TIME_UNSET;
        this.liveMaxOffsetMs = C.TIME_UNSET;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
    }
}
