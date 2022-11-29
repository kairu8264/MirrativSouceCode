package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.webvtt.WebvttCueParser;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ a f26989w = new a();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        lambda$static$0 = WebvttCueParser.Element.lambda$static$0((WebvttCueParser.Element) obj, (WebvttCueParser.Element) obj2);
        return lambda$static$0;
    }
}
