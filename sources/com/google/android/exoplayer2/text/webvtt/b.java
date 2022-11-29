package com.google.android.exoplayer2.text.webvtt;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ b f26990w = new b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$getCues$0;
        lambda$getCues$0 = WebvttSubtitle.lambda$getCues$0((WebvttCueInfo) obj, (WebvttCueInfo) obj2);
        return lambda$getCues$0;
    }
}
