package com.google.android.play.core.review;

import com.google.android.play.core.tasks.zzj;
import hk.a;
import java.util.Locale;

/* loaded from: classes3.dex */
public class ReviewException extends zzj {

    /* renamed from: w  reason: collision with root package name */
    public final int f27926w;

    public ReviewException(int i10) {
        super(String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i10), a.a(i10)));
        this.f27926w = i10;
    }
}
