package com.unity3d.player;

/* loaded from: classes4.dex */
final class j {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28530a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f28531b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28532c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28533d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28534e = false;

    public static void a() {
        f28530a = true;
    }

    public static void b() {
        f28530a = false;
    }

    public static boolean c() {
        return f28530a;
    }

    public final void a(boolean z10) {
        this.f28531b = z10;
    }

    public final void b(boolean z10) {
        this.f28533d = z10;
    }

    public final void c(boolean z10) {
        this.f28534e = z10;
    }

    public final void d(boolean z10) {
        this.f28532c = z10;
    }

    public final boolean d() {
        return this.f28533d;
    }

    public final boolean e() {
        return this.f28534e;
    }

    public final boolean e(boolean z10) {
        if (f28530a) {
            return ((!z10 && !this.f28531b) || this.f28533d || this.f28532c) ? false : true;
        }
        return false;
    }

    public final boolean f() {
        return this.f28532c;
    }

    public final String toString() {
        return super.toString();
    }
}
