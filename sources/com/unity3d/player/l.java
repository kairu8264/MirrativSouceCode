package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import com.unity3d.player.k;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private UnityPlayer f28564a;

    /* renamed from: c  reason: collision with root package name */
    private a f28566c;

    /* renamed from: b  reason: collision with root package name */
    private Context f28565b = null;

    /* renamed from: d  reason: collision with root package name */
    private final Semaphore f28567d = new Semaphore(0);

    /* renamed from: e  reason: collision with root package name */
    private final Lock f28568e = new ReentrantLock();

    /* renamed from: f  reason: collision with root package name */
    private k f28569f = null;

    /* renamed from: g  reason: collision with root package name */
    private int f28570g = 2;

    /* renamed from: h  reason: collision with root package name */
    private boolean f28571h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f28572i = false;

    /* renamed from: com.unity3d.player.l$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28573a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f28574b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f28575c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f28576d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f28577e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f28578f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f28579g;

        public AnonymousClass1(String str, int i10, int i11, int i12, boolean z10, long j10, long j11) {
            this.f28573a = str;
            this.f28574b = i10;
            this.f28575c = i11;
            this.f28576d = i12;
            this.f28577e = z10;
            this.f28578f = j10;
            this.f28579g = j11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (l.this.f28569f != null) {
                d.Log(5, "Video already playing");
                l.this.f28570g = 2;
                l.this.f28567d.release();
                return;
            }
            l.this.f28569f = new k(l.this.f28565b, this.f28573a, this.f28574b, this.f28575c, this.f28576d, this.f28577e, this.f28578f, this.f28579g, new k.a() { // from class: com.unity3d.player.l.1.1
                @Override // com.unity3d.player.k.a
                public final void a(int i10) {
                    l.this.f28568e.lock();
                    l.this.f28570g = i10;
                    if (i10 == 3 && l.this.f28572i) {
                        l.this.runOnUiThread(new Runnable() { // from class: com.unity3d.player.l.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                l.this.d();
                                l.this.f28564a.resume();
                            }
                        });
                    }
                    if (i10 != 0) {
                        l.this.f28567d.release();
                    }
                    l.this.f28568e.unlock();
                }
            });
            if (l.this.f28569f != null) {
                l.this.f28564a.addView(l.this.f28569f);
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public l(UnityPlayer unityPlayer) {
        this.f28564a = null;
        this.f28564a = unityPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        k kVar = this.f28569f;
        if (kVar != null) {
            this.f28564a.removeViewFromPlayer(kVar);
            this.f28572i = false;
            this.f28569f.destroyPlayer();
            this.f28569f = null;
            a aVar = this.f28566c;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final void a() {
        this.f28568e.lock();
        k kVar = this.f28569f;
        if (kVar != null) {
            if (this.f28570g == 0) {
                kVar.CancelOnPrepare();
            } else if (this.f28572i) {
                boolean a10 = kVar.a();
                this.f28571h = a10;
                if (!a10) {
                    this.f28569f.pause();
                }
            }
        }
        this.f28568e.unlock();
    }

    public final boolean a(Context context, String str, int i10, int i11, int i12, boolean z10, long j10, long j11, a aVar) {
        this.f28568e.lock();
        this.f28566c = aVar;
        this.f28565b = context;
        this.f28567d.drainPermits();
        this.f28570g = 2;
        runOnUiThread(new AnonymousClass1(str, i10, i11, i12, z10, j10, j11));
        boolean z11 = false;
        try {
            this.f28568e.unlock();
            this.f28567d.acquire();
            this.f28568e.lock();
            if (this.f28570g != 2) {
                z11 = true;
            }
        } catch (InterruptedException unused) {
        }
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.l.2
            @Override // java.lang.Runnable
            public final void run() {
                l.this.f28564a.pause();
            }
        });
        runOnUiThread((!z11 || this.f28570g == 3) ? new Runnable() { // from class: com.unity3d.player.l.4
            @Override // java.lang.Runnable
            public final void run() {
                l.this.d();
                l.this.f28564a.resume();
            }
        } : new Runnable() { // from class: com.unity3d.player.l.3
            @Override // java.lang.Runnable
            public final void run() {
                if (l.this.f28569f != null) {
                    l.this.f28564a.addViewToPlayer(l.this.f28569f, true);
                    l.this.f28572i = true;
                    l.this.f28569f.requestFocus();
                }
            }
        });
        this.f28568e.unlock();
        return z11;
    }

    public final void b() {
        this.f28568e.lock();
        k kVar = this.f28569f;
        if (kVar != null && this.f28572i && !this.f28571h) {
            kVar.start();
        }
        this.f28568e.unlock();
    }

    public final void c() {
        this.f28568e.lock();
        k kVar = this.f28569f;
        if (kVar != null) {
            kVar.updateVideoLayout();
        }
        this.f28568e.unlock();
    }

    public final void runOnUiThread(Runnable runnable) {
        Context context = this.f28565b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            d.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }
}
