package com.mirrativ.llstream;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import jo.p;

/* loaded from: classes4.dex */
public final class NamedThreadFactory implements ThreadFactory {
    private final String prefix;
    private final AtomicInteger threadNumber;

    public NamedThreadFactory(String str) {
        p.h(str, "prefix");
        this.prefix = str;
        this.threadNumber = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str;
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        int andIncrement = this.threadNumber.getAndIncrement();
        if (andIncrement > 1) {
            str = this.prefix + '-' + andIncrement;
        } else {
            str = this.prefix;
        }
        newThread.setName(str);
        p.g(newThread, "defaultThreadFactory().n…x\n            }\n        }");
        return newThread;
    }
}
