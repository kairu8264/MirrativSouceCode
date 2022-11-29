package com.dena.showroom.flvplayback.impl.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class Loopers {

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Runnable f26616w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f26617x;

        public a(Runnable runnable, CountDownLatch countDownLatch) {
            this.f26616w = runnable;
            this.f26617x = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26616w.run();
            this.f26617x.countDown();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayBlockingQueue f26618w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Callable f26619x;

        public b(ArrayBlockingQueue arrayBlockingQueue, Callable callable) {
            this.f26618w = arrayBlockingQueue;
            this.f26619x = callable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f26618w.offer(new c(this.f26619x.call()));
            } catch (Exception unused) {
                this.f26618w.offer(new c(null));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f26620a;

        public c(T t10) {
            this.f26620a = t10;
        }
    }

    public static void assertMain() {
        assertMyLooper(Looper.getMainLooper());
    }

    public static void assertMyLooper(Looper looper) {
        if (looper != null) {
            if (!looper.equals(Looper.myLooper())) {
                throw new AssertionError("Looper invariant violation!");
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void asyncIfTrue(Handler handler, Runnable runnable, boolean z10) {
        if (z10) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void postAndWait(Handler handler, Runnable runnable) {
        if (handler != null && Looper.myLooper() != handler.getLooper()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.postAtFrontOfQueue(new a(runnable, countDownLatch));
            if (countDownLatch.getCount() > 0) {
                try {
                    countDownLatch.await(3L, TimeUnit.SECONDS);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
            return;
        }
        runnable.run();
    }

    public static <T> T waitFor(Handler handler, Callable<T> callable) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        handler.post(new b(arrayBlockingQueue, callable));
        try {
            return ((c) arrayBlockingQueue.take()).f26620a;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
