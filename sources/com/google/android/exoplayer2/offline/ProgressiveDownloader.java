package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ProgressiveDownloader implements Downloader {
    private final CacheWriter cacheWriter;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private volatile RunnableFutureTask<Void, IOException> downloadRunnable;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final PriorityTaskManager priorityTaskManager;
    private Downloader.ProgressListener progressListener;

    @Deprecated
    public ProgressiveDownloader(Uri uri, String str, CacheDataSource.Factory factory) {
        this(uri, str, factory, a.f26900w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgress(long j10, long j11, long j12) {
        Downloader.ProgressListener progressListener = this.progressListener;
        if (progressListener == null) {
            return;
        }
        progressListener.onProgress(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (((float) j11) * 100.0f) / ((float) j10));
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
        this.isCanceled = true;
        RunnableFutureTask<Void, IOException> runnableFutureTask = this.downloadRunnable;
        if (runnableFutureTask != null) {
            runnableFutureTask.cancel(true);
        }
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void download(Downloader.ProgressListener progressListener) throws IOException, InterruptedException {
        this.progressListener = progressListener;
        this.downloadRunnable = new RunnableFutureTask<Void, IOException>() { // from class: com.google.android.exoplayer2.offline.ProgressiveDownloader.1
            @Override // com.google.android.exoplayer2.util.RunnableFutureTask
            public void cancelWork() {
                ProgressiveDownloader.this.cacheWriter.cancel();
            }

            @Override // com.google.android.exoplayer2.util.RunnableFutureTask
            public Void doWork() throws IOException {
                ProgressiveDownloader.this.cacheWriter.cache();
                return null;
            }
        };
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-1000);
        }
        boolean z10 = false;
        while (!z10) {
            try {
                if (this.isCanceled) {
                    break;
                }
                PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.proceed(-1000);
                }
                this.executor.execute(this.downloadRunnable);
                try {
                    this.downloadRunnable.get();
                    z10 = true;
                } catch (ExecutionException e10) {
                    Throwable th2 = (Throwable) Assertions.checkNotNull(e10.getCause());
                    if (!(th2 instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (!(th2 instanceof IOException)) {
                            Util.sneakyThrow(th2);
                        } else {
                            throw ((IOException) th2);
                        }
                    }
                }
            } finally {
                this.downloadRunnable.blockUntilFinished();
                PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.remove(-1000);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void remove() {
        this.dataSource.getCache().removeResource(this.dataSource.getCacheKeyFactory().buildCacheKey(this.dataSpec));
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, a.f26900w);
    }

    @Deprecated
    public ProgressiveDownloader(Uri uri, String str, CacheDataSource.Factory factory, Executor executor) {
        this(new MediaItem.Builder().setUri(uri).setCustomCacheKey(str).build(), factory, executor);
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this.executor = (Executor) Assertions.checkNotNull(executor);
        Assertions.checkNotNull(mediaItem.playbackProperties);
        DataSpec build = new DataSpec.Builder().setUri(mediaItem.playbackProperties.uri).setKey(mediaItem.playbackProperties.customCacheKey).setFlags(4).build();
        this.dataSpec = build;
        CacheDataSource createDataSourceForDownloading = factory.createDataSourceForDownloading();
        this.dataSource = createDataSourceForDownloading;
        this.cacheWriter = new CacheWriter(createDataSourceForDownloading, build, false, null, new CacheWriter.ProgressListener() { // from class: com.google.android.exoplayer2.offline.n
            @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
            public final void onProgress(long j10, long j11, long j12) {
                ProgressiveDownloader.this.onProgress(j10, j11, j12);
            }
        });
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
    }
}
