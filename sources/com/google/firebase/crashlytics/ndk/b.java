package com.google.firebase.crashlytics.ndk;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f27957a = new b();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean g10;
        g10 = JniNativeApi.g(file, str);
        return g10;
    }
}
