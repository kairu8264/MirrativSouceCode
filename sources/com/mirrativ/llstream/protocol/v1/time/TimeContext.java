package com.mirrativ.llstream.protocol.v1.time;

import java.util.concurrent.atomic.AtomicLong;
import jo.h;
import jo.p;

/* loaded from: classes4.dex */
public final class TimeContext {
    public static final Companion Companion = new Companion(null);
    private static final TimeContext shared = new TimeContext();
    private AtomicLong counter = new AtomicLong(0);

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final TimeContext getShared() {
            return TimeContext.shared;
        }
    }

    public final AtomicLong getCounter() {
        return this.counter;
    }

    public final long incrementAndGet() {
        return this.counter.addAndGet(1L);
    }

    public final void setCounter(AtomicLong atomicLong) {
        p.h(atomicLong, "<set-?>");
        this.counter = atomicLong;
    }
}
