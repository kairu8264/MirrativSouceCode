package com.google.android.exoplayer2.metadata.mp4;

import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ a f26895w = new a();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        lambda$static$0 = SlowMotionData.Segment.lambda$static$0((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
        return lambda$static$0;
    }
}
