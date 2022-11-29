package com.google.android.exoplayer2.offline;

import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ActionFileUpgradeUtil {

    /* loaded from: classes3.dex */
    public interface DownloadIdProvider {
        String getId(DownloadRequest downloadRequest);
    }

    private ActionFileUpgradeUtil() {
    }

    public static void mergeRequest(DownloadRequest downloadRequest, DefaultDownloadIndex defaultDownloadIndex, boolean z10, long j10) throws IOException {
        Download download;
        Download download2 = defaultDownloadIndex.getDownload(downloadRequest.f26898id);
        if (download2 != null) {
            download = DownloadManager.mergeRequest(download2, downloadRequest, download2.stopReason, j10);
        } else {
            download = new Download(downloadRequest, z10 ? 3 : 0, j10, j10, -1L, 0, 0);
        }
        defaultDownloadIndex.putDownload(download);
    }

    public static void upgradeAndDelete(File file, DownloadIdProvider downloadIdProvider, DefaultDownloadIndex defaultDownloadIndex, boolean z10, boolean z11) throws IOException {
        DownloadRequest[] load;
        ActionFile actionFile = new ActionFile(file);
        if (actionFile.exists()) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                for (DownloadRequest downloadRequest : actionFile.load()) {
                    if (downloadIdProvider != null) {
                        downloadRequest = downloadRequest.copyWithId(downloadIdProvider.getId(downloadRequest));
                    }
                    mergeRequest(downloadRequest, defaultDownloadIndex, z11, currentTimeMillis);
                }
                actionFile.delete();
            } catch (Throwable th2) {
                if (z10) {
                    actionFile.delete();
                }
                throw th2;
            }
        }
    }
}
