package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.trackselection.TrackSelector;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements TrackSelector.InvalidationListener {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ d f26903w = new d();

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public final void onTrackSelectionsInvalidated() {
        DownloadHelper.lambda$new$2();
    }
}
