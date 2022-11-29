package androidx.emoji2.text;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class d {

    /* renamed from: n  reason: collision with root package name */
    public static final Object f15042n = new Object();

    /* renamed from: o  reason: collision with root package name */
    public static final Object f15043o = new Object();

    /* renamed from: p  reason: collision with root package name */
    public static volatile d f15044p;

    /* renamed from: b  reason: collision with root package name */
    public final Set<e> f15046b;

    /* renamed from: e  reason: collision with root package name */
    public final b f15049e;

    /* renamed from: f  reason: collision with root package name */
    public final g f15050f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f15051g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f15052h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f15053i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f15054j;

    /* renamed from: k  reason: collision with root package name */
    public final int f15055k;

    /* renamed from: l  reason: collision with root package name */
    public final int f15056l;

    /* renamed from: m  reason: collision with root package name */
    public final InterfaceC0062d f15057m;

    /* renamed from: a  reason: collision with root package name */
    public final ReadWriteLock f15045a = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    public volatile int f15047c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f15048d = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile androidx.emoji2.text.g f15058b;

        /* renamed from: c  reason: collision with root package name */
        public volatile l f15059c;

        /* renamed from: androidx.emoji2.text.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0061a extends h {
            public C0061a() {
            }

            @Override // androidx.emoji2.text.d.h
            public void a(Throwable th2) {
                a.this.f15061a.m(th2);
            }

            @Override // androidx.emoji2.text.d.h
            public void b(l lVar) {
                a.this.d(lVar);
            }
        }

        public a(d dVar) {
            super(dVar);
        }

        @Override // androidx.emoji2.text.d.b
        public void a() {
            try {
                this.f15061a.f15050f.a(new C0061a());
            } catch (Throwable th2) {
                this.f15061a.m(th2);
            }
        }

        @Override // androidx.emoji2.text.d.b
        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f15058b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.d.b
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f15059c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f15061a.f15051g);
        }

        public void d(l lVar) {
            if (lVar == null) {
                this.f15061a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f15059c = lVar;
            l lVar2 = this.f15059c;
            i iVar = new i();
            InterfaceC0062d interfaceC0062d = this.f15061a.f15057m;
            d dVar = this.f15061a;
            this.f15058b = new androidx.emoji2.text.g(lVar2, iVar, interfaceC0062d, dVar.f15052h, dVar.f15053i);
            this.f15061a.n();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final d f15061a;

        public b(d dVar) {
            this.f15061a = dVar;
        }

        public void a() {
            this.f15061a.n();
        }

        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return charSequence;
        }

        public void c(EditorInfo editorInfo) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f15062a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f15063b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15064c;

        /* renamed from: d  reason: collision with root package name */
        public int[] f15065d;

        /* renamed from: e  reason: collision with root package name */
        public Set<e> f15066e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f15067f;

        /* renamed from: g  reason: collision with root package name */
        public int f15068g = -16711936;

        /* renamed from: h  reason: collision with root package name */
        public int f15069h = 0;

        /* renamed from: i  reason: collision with root package name */
        public InterfaceC0062d f15070i = new g.b();

        public c(g gVar) {
            n3.h.h(gVar, "metadataLoader cannot be null.");
            this.f15062a = gVar;
        }

        public final g a() {
            return this.f15062a;
        }

        public c b(int i10) {
            this.f15069h = i10;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0062d {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void onFailed(Throwable th2) {
        }

        public void onInitialized() {
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final List<e> f15071w;

        /* renamed from: x  reason: collision with root package name */
        public final Throwable f15072x;

        /* renamed from: y  reason: collision with root package name */
        public final int f15073y;

        public f(e eVar, int i10) {
            this(Arrays.asList((e) n3.h.h(eVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f15071w.size();
            int i10 = 0;
            if (this.f15073y != 1) {
                while (i10 < size) {
                    this.f15071w.get(i10).onFailed(this.f15072x);
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                this.f15071w.get(i10).onInitialized();
                i10++;
            }
        }

        public f(Collection<e> collection, int i10) {
            this(collection, i10, null);
        }

        public f(Collection<e> collection, int i10, Throwable th2) {
            n3.h.h(collection, "initCallbacks cannot be null");
            this.f15071w = new ArrayList(collection);
            this.f15073y = i10;
            this.f15072x = th2;
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th2);

        public abstract void b(l lVar);
    }

    /* loaded from: classes.dex */
    public static class i {
        public androidx.emoji2.text.h a(androidx.emoji2.text.f fVar) {
            return new n(fVar);
        }
    }

    public d(c cVar) {
        this.f15051g = cVar.f15063b;
        this.f15052h = cVar.f15064c;
        this.f15053i = cVar.f15065d;
        this.f15054j = cVar.f15067f;
        this.f15055k = cVar.f15068g;
        this.f15050f = cVar.f15062a;
        this.f15056l = cVar.f15069h;
        this.f15057m = cVar.f15070i;
        s.b bVar = new s.b();
        this.f15046b = bVar;
        Set<e> set = cVar.f15066e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f15066e);
        }
        this.f15049e = Build.VERSION.SDK_INT < 19 ? new b(this) : new a(this);
        l();
    }

    public static d b() {
        d dVar;
        synchronized (f15042n) {
            dVar = f15044p;
            n3.h.i(dVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return dVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            return androidx.emoji2.text.g.c(inputConnection, editable, i10, i11, z10);
        }
        return false;
    }

    public static boolean f(Editable editable, int i10, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return androidx.emoji2.text.g.d(editable, i10, keyEvent);
        }
        return false;
    }

    public static d g(c cVar) {
        d dVar = f15044p;
        if (dVar == null) {
            synchronized (f15042n) {
                dVar = f15044p;
                if (dVar == null) {
                    dVar = new d(cVar);
                    f15044p = dVar;
                }
            }
        }
        return dVar;
    }

    public static boolean h() {
        return f15044p != null;
    }

    public int c() {
        return this.f15055k;
    }

    public int d() {
        this.f15045a.readLock().lock();
        try {
            return this.f15047c;
        } finally {
            this.f15045a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f15054j;
    }

    public final boolean j() {
        return d() == 1;
    }

    public void k() {
        n3.h.i(this.f15056l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.f15045a.writeLock().lock();
        try {
            if (this.f15047c == 0) {
                return;
            }
            this.f15047c = 0;
            this.f15045a.writeLock().unlock();
            this.f15049e.a();
        } finally {
            this.f15045a.writeLock().unlock();
        }
    }

    public final void l() {
        this.f15045a.writeLock().lock();
        try {
            if (this.f15056l == 0) {
                this.f15047c = 0;
            }
            this.f15045a.writeLock().unlock();
            if (d() == 0) {
                this.f15049e.a();
            }
        } catch (Throwable th2) {
            this.f15045a.writeLock().unlock();
            throw th2;
        }
    }

    public void m(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f15045a.writeLock().lock();
        try {
            this.f15047c = 2;
            arrayList.addAll(this.f15046b);
            this.f15046b.clear();
            this.f15045a.writeLock().unlock();
            this.f15048d.post(new f(arrayList, this.f15047c, th2));
        } catch (Throwable th3) {
            this.f15045a.writeLock().unlock();
            throw th3;
        }
    }

    public void n() {
        ArrayList arrayList = new ArrayList();
        this.f15045a.writeLock().lock();
        try {
            this.f15047c = 1;
            arrayList.addAll(this.f15046b);
            this.f15046b.clear();
            this.f15045a.writeLock().unlock();
            this.f15048d.post(new f(arrayList, this.f15047c));
        } catch (Throwable th2) {
            this.f15045a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i10, int i11) {
        return q(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11, int i12) {
        return r(charSequence, i10, i11, i12, 0);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        n3.h.i(j(), "Not initialized yet");
        n3.h.e(i10, "start cannot be negative");
        n3.h.e(i11, "end cannot be negative");
        n3.h.e(i12, "maxEmojiCount cannot be negative");
        n3.h.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        n3.h.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        n3.h.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f15051g : false;
        } else {
            z10 = true;
        }
        return this.f15049e.b(charSequence, i10, i11, i12, z10);
    }

    public void s(e eVar) {
        n3.h.h(eVar, "initCallback cannot be null");
        this.f15045a.writeLock().lock();
        try {
            if (this.f15047c != 1 && this.f15047c != 2) {
                this.f15046b.add(eVar);
            }
            this.f15048d.post(new f(eVar, this.f15047c));
        } finally {
            this.f15045a.writeLock().unlock();
        }
    }

    public void t(e eVar) {
        n3.h.h(eVar, "initCallback cannot be null");
        this.f15045a.writeLock().lock();
        try {
            this.f15046b.remove(eVar);
        } finally {
            this.f15045a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f15049e.c(editorInfo);
    }
}
