package wh;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import rh.p;

/* loaded from: classes3.dex */
public class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f58757a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f58758b = Executors.defaultThreadFactory();

    public a(String str) {
        p.j(str, "Name must not be null");
        this.f58757a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f58758b.newThread(new b(runnable, 0));
        newThread.setName(this.f58757a);
        return newThread;
    }
}
