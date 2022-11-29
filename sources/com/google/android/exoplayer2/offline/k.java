package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.DownloadManager;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Comparator {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ k f26912w = new k();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareStartTimes;
        compareStartTimes = DownloadManager.InternalHandler.compareStartTimes((Download) obj, (Download) obj2);
        return compareStartTimes;
    }
}
