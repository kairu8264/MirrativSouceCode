package b4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import b4.a;
import f3.l;
import java.nio.ByteBuffer;
import l3.f;

/* loaded from: classes.dex */
public class e extends a.c {

    /* renamed from: i  reason: collision with root package name */
    public static final a f16949i = new a();

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
    public static class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16950a;

        /* renamed from: b  reason: collision with root package name */
        public final l3.d f16951b;

        /* renamed from: c  reason: collision with root package name */
        public final a f16952c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f16953d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public Handler f16954e;

        /* renamed from: f  reason: collision with root package name */
        public HandlerThread f16955f;

        /* renamed from: g  reason: collision with root package name */
        public a.g f16956g;

        /* renamed from: h  reason: collision with root package name */
        public ContentObserver f16957h;

        /* renamed from: i  reason: collision with root package name */
        public Runnable f16958i;

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a.g f16959w;

            public a(a.g gVar) {
                this.f16959w = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                bVar.f16956g = this.f16959w;
                bVar.c();
            }
        }

        public b(Context context, l3.d dVar, a aVar) {
            n3.h.h(context, "Context cannot be null");
            n3.h.h(dVar, "FontRequest cannot be null");
            this.f16950a = context.getApplicationContext();
            this.f16951b = dVar;
            this.f16952c = aVar;
        }

        @Override // b4.a.f
        public void a(a.g gVar) {
            n3.h.h(gVar, "LoaderCallback cannot be null");
            synchronized (this.f16953d) {
                if (this.f16954e == null) {
                    HandlerThread handlerThread = new HandlerThread("emojiCompat", 10);
                    this.f16955f = handlerThread;
                    handlerThread.start();
                    this.f16954e = new Handler(this.f16955f.getLooper());
                }
                this.f16954e.post(new a(gVar));
            }
        }

        public final void b() {
            this.f16956g = null;
            ContentObserver contentObserver = this.f16957h;
            if (contentObserver != null) {
                this.f16952c.c(this.f16950a, contentObserver);
                this.f16957h = null;
            }
            synchronized (this.f16953d) {
                this.f16954e.removeCallbacks(this.f16958i);
                HandlerThread handlerThread = this.f16955f;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                this.f16954e = null;
                this.f16955f = null;
            }
        }

        public void c() {
            if (this.f16956g == null) {
                return;
            }
            try {
                f.b d10 = d();
                int b10 = d10.b();
                if (b10 == 2) {
                    synchronized (this.f16953d) {
                    }
                }
                if (b10 == 0) {
                    Typeface a10 = this.f16952c.a(this.f16950a, d10);
                    ByteBuffer f10 = l.f(this.f16950a, null, d10.d());
                    if (f10 != null) {
                        this.f16956g.b(g.b(a10, f10));
                        b();
                        return;
                    }
                    throw new RuntimeException("Unable to open file.");
                }
                throw new RuntimeException("fetchFonts result is not OK. (" + b10 + ")");
            } catch (Throwable th2) {
                this.f16956g.a(th2);
                b();
            }
        }

        public final f.b d() {
            try {
                f.a b10 = this.f16952c.b(this.f16950a, this.f16951b);
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
    }

    public e(Context context, l3.d dVar) {
        super(new b(context, dVar, f16949i));
    }
}
