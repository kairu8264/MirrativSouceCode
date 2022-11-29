package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;

/* loaded from: classes3.dex */
public interface TrackSelection {
    Format getFormat(int i10);

    int getIndexInTrackGroup(int i10);

    TrackGroup getTrackGroup();

    int indexOf(int i10);

    int indexOf(Format format);

    int length();
}
