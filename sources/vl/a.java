package vl;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f57481a = new a();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread h10;
        h10 = d.h(runnable);
        return h10;
    }
}
