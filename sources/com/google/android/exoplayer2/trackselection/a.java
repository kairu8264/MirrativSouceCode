package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ a f26991w = new a();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$new$0;
        lambda$new$0 = BaseTrackSelection.lambda$new$0((Format) obj, (Format) obj2);
        return lambda$new$0;
    }
}
