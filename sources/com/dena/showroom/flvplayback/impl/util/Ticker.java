package com.dena.showroom.flvplayback.impl.util;

/* loaded from: classes3.dex */
public class Ticker extends Thread {

    /* renamed from: w  reason: collision with root package name */
    public int f26629w;

    /* renamed from: x  reason: collision with root package name */
    public Runnable f26630x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f26631y;

    /* renamed from: z  reason: collision with root package name */
    public final Object f26632z;

    public Ticker(int i10, Runnable runnable) {
        super("Ticker");
        this.f26632z = new Object();
        this.f26629w = i10;
        this.f26630x = runnable;
    }

    public void quit() {
        this.f26631y = true;
        synchronized (this.f26632z) {
            this.f26632z.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!this.f26631y) {
            this.f26630x.run();
            synchronized (this.f26632z) {
                try {
                    this.f26632z.wait(this.f26629w);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Override // java.lang.Thread
    public void start() {
        this.f26631y = false;
        super.start();
    }
}
