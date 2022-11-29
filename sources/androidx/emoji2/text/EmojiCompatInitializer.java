package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b5.b<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends d.c {
        public a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f15036a;

        /* loaded from: classes.dex */
        public class a extends d.h {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d.h f15037a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ThreadPoolExecutor f15038b;

            public a(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f15037a = hVar;
                this.f15038b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.d.h
            public void a(Throwable th2) {
                try {
                    this.f15037a.a(th2);
                } finally {
                    this.f15038b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.d.h
            public void b(l lVar) {
                try {
                    this.f15037a.b(lVar);
                } finally {
                    this.f15038b.shutdown();
                }
            }
        }

        public b(Context context) {
            this.f15036a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.d.g
        public void a(final d.h hVar) {
            final ThreadPoolExecutor b10 = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            b10.execute(new Runnable() { // from class: androidx.emoji2.text.e
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.d(hVar, b10);
                }
            });
        }

        /* renamed from: c */
        public void d(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                i a10 = androidx.emoji2.text.c.a(this.f15036a);
                if (a10 != null) {
                    a10.c(threadPoolExecutor);
                    a10.a().a(new a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th2) {
                hVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                k3.j.a("EmojiCompat.EmojiCompatInitializer.run");
                if (d.h()) {
                    d.b().k();
                }
            } finally {
                k3.j.b();
            }
        }
    }

    @Override // b5.b
    public List<Class<? extends b5.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // b5.b
    /* renamed from: c */
    public Boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            d.g(new a(context));
            d(context);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public void d(Context context) {
        final o g10 = ((u) b5.a.e(context).f(ProcessLifecycleInitializer.class)).g();
        g10.a(new androidx.lifecycle.h() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.h, androidx.lifecycle.m
            public void c(u uVar) {
                EmojiCompatInitializer.this.e();
                g10.c(this);
            }
        });
    }

    public void e() {
        androidx.emoji2.text.b.d().postDelayed(new c(), 500L);
    }
}
