package com.google.android.exoplayer2.offline;

import android.util.SparseArray;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.hls.offline.HlsDownloader;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class DefaultDownloaderFactory implements DownloaderFactory {
    private static final SparseArray<Constructor<? extends Downloader>> CONSTRUCTORS = createDownloaderConstructors();
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final Executor executor;

    @Deprecated
    public DefaultDownloaderFactory(CacheDataSource.Factory factory) {
        this(factory, a.f26900w);
    }

    private static SparseArray<Constructor<? extends Downloader>> createDownloaderConstructors() {
        SparseArray<Constructor<? extends Downloader>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, getDownloaderConstructor(Class.forName("com.google.android.exoplayer2.source.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, getDownloaderConstructor(HlsDownloader.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, getDownloaderConstructor(Class.forName("com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    private static Constructor<? extends Downloader> getDownloaderConstructor(Class<?> cls) {
        try {
            return cls.asSubclass(Downloader.class).getConstructor(MediaItem.class, CacheDataSource.Factory.class, Executor.class);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("Downloader constructor missing", e10);
        }
    }

    @Override // com.google.android.exoplayer2.offline.DownloaderFactory
    public Downloader createDownloader(DownloadRequest downloadRequest) {
        int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(downloadRequest.uri, downloadRequest.mimeType);
        if (inferContentTypeForUriAndMimeType == 0 || inferContentTypeForUriAndMimeType == 1 || inferContentTypeForUriAndMimeType == 2) {
            return createDownloader(downloadRequest, inferContentTypeForUriAndMimeType);
        }
        if (inferContentTypeForUriAndMimeType == 3) {
            return new ProgressiveDownloader(new MediaItem.Builder().setUri(downloadRequest.uri).setCustomCacheKey(downloadRequest.customCacheKey).build(), this.cacheDataSourceFactory, this.executor);
        }
        throw new IllegalArgumentException("Unsupported type: " + inferContentTypeForUriAndMimeType);
    }

    public DefaultDownloaderFactory(CacheDataSource.Factory factory, Executor executor) {
        this.cacheDataSourceFactory = (CacheDataSource.Factory) Assertions.checkNotNull(factory);
        this.executor = (Executor) Assertions.checkNotNull(executor);
    }

    private Downloader createDownloader(DownloadRequest downloadRequest, int i10) {
        Constructor<? extends Downloader> constructor = CONSTRUCTORS.get(i10);
        if (constructor != null) {
            try {
                return constructor.newInstance(new MediaItem.Builder().setUri(downloadRequest.uri).setStreamKeys(downloadRequest.streamKeys).setCustomCacheKey(downloadRequest.customCacheKey).setDrmKeySetId(downloadRequest.keySetId).build(), this.cacheDataSourceFactory, this.executor);
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to instantiate downloader for content type " + i10);
            }
        }
        throw new IllegalStateException("Module missing for content type " + i10);
    }
}
