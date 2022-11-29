package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.d;
import androidx.emoji2.text.i;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import l3.f;

/* loaded from: classes.dex */
public class i extends d.c {

    /* renamed from: j  reason: collision with root package name */
    public static final a f15100j = new a();

    /* loaded from: classes.dex */
    public static class a {
        public Typeface a(Context context, f.b bVar) throws PackageManager.NameNotFoundException {
            return l3.f.a(context, null, new f.b[]{bVar});
        }

        public f.a b(Context context, l3.d dVar) throws PackageManager.NameNotFoundException {
            return l3.f.b(context, null, dVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f15101a;

        /* renamed from: b  reason: collision with root package name */
        public final l3.d f15102b;

        /* renamed from: c  reason: collision with root package name */
        public final a f15103c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f15104d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public Handler f15105e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f15106f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f15107g;

        /* renamed from: h  reason: collision with root package name */
        public d.h f15108h;

        /* renamed from: i  reason: collision with root package name */
        public ContentObserver f15109i;

        /* renamed from: j  reason: collision with root package name */
        public Runnable f15110j;

        public b(Context context, l3.d dVar, a aVar) {
            n3.h.h(context, "Context cannot be null");
            n3.h.h(dVar, "FontRequest cannot be null");
            this.f15101a = context.getApplicationContext();
            this.f15102b = dVar;
            this.f15103c = aVar;
        }

        @Override // androidx.emoji2.text.d.g
        public void a(d.h hVar) {
            n3.h.h(hVar, "LoaderCallback cannot be null");
            synchronized (this.f15104d) {
                this.f15108h = hVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.f15104d) {
                this.f15108h = null;
                ContentObserver contentObserver = this.f15109i;
                if (contentObserver != null) {
                    this.f15103c.c(this.f15101a, contentObserver);
                    this.f15109i = null;
                }
                Handler handler = this.f15105e;
                if (handler != null) {
                    handler.removeCallbacks(this.f15110j);
                }
                this.f15105e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f15107g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f15106f = null;
                this.f15107g = null;
            }
        }

        public void c() {
            synchronized (this.f15104d) {
                if (this.f15108h == null) {
                    return;
                }
                try {
                    f.b e10 = e();
                    int b10 = e10.b();
                    if (b10 == 2) {
                        synchronized (this.f15104d) {
                        }
                    }
                    if (b10 == 0) {
                        k3.j.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface a10 = this.f15103c.a(this.f15101a, e10);
                        ByteBuffer f10 = f3.l.f(this.f15101a, null, e10.d());
                        if (f10 != null && a10 != null) {
                            l b11 = l.b(a10, f10);
                            k3.j.b();
                            synchronized (this.f15104d) {
                                d.h hVar = this.f15108h;
                                if (hVar != null) {
                                    hVar.b(b11);
                                }
                            }
                            b();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + b10 + ")");
                } catch (Throwable th2) {
                    synchronized (this.f15104d) {
                        d.h hVar2 = this.f15108h;
                        if (hVar2 != null) {
                            hVar2.a(th2);
                        }
                        b();
                    }
                }
            }
        }

        public void d() {
            synchronized (this.f15104d) {
                if (this.f15108h == null) {
                    return;
                }
                if (this.f15106f == null) {
                    ThreadPoolExecutor b10 = androidx.emoji2.text.b.b("emojiCompat");
                    this.f15107g = b10;
                    this.f15106f = b10;
                }
                this.f15106f.execute(new Runnable() { // from class: androidx.emoji2.text.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.this.c();
                    }
                });
            }
        }

        public final f.b e() {
            try {
                f.a b10 = this.f15103c.b(this.f15101a, this.f15102b);
                if (b10.c() == 0) {
                    f.b[] b11 = b10.b();
                    if (b11 != null && b11.length != 0) {
                        return b11[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b10.c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        public void f(Executor executor) {
            synchronized (this.f15104d) {
                this.f15106f = executor;
            }
        }
    }

    public i(Context context, l3.d dVar) {
        super(new b(context, dVar, f15100j));
    }

    public i c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
