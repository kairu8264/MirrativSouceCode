package b4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class a {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f16897m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static volatile a f16898n;

    /* renamed from: b  reason: collision with root package name */
    public final Set<d> f16900b;

    /* renamed from: e  reason: collision with root package name */
    public final b f16903e;

    /* renamed from: f  reason: collision with root package name */
    public final f f16904f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f16905g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f16906h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f16907i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f16908j;

    /* renamed from: k  reason: collision with root package name */
    public final int f16909k;

    /* renamed from: l  reason: collision with root package name */
    public final int f16910l;

    /* renamed from: a  reason: collision with root package name */
    public final ReadWriteLock f16899a = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    public int f16901c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f16902d = new Handler(Looper.getMainLooper());

    /* renamed from: b4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0098a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile b4.c f16911b;

        /* renamed from: c  reason: collision with root package name */
        public volatile b4.g f16912c;

        /* renamed from: b4.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0099a extends g {
            public C0099a() {
            }

            @Override // b4.a.g
            public void a(Throwable th2) {
                C0098a.this.f16914a.j(th2);
            }

            @Override // b4.a.g
            public void b(b4.g gVar) {
                C0098a.this.d(gVar);
            }
        }

        public C0098a(a aVar) {
            super(aVar);
        }

        @Override // b4.a.b
        public void a() {
            try {
                this.f16914a.f16904f.a(new C0099a());
            } catch (Throwable th2) {
                this.f16914a.j(th2);
            }
        }

        @Override // b4.a.b
        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f16911b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // b4.a.b
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f16912c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f16914a.f16905g);
        }

        public void d(b4.g gVar) {
            if (gVar == null) {
                this.f16914a.j(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f16912c = gVar;
            b4.g gVar2 = this.f16912c;
            h hVar = new h();
            a aVar = this.f16914a;
            this.f16911b = new b4.c(gVar2, hVar, aVar.f16906h, aVar.f16907i);
            this.f16914a.k();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final a f16914a;

        public b(a aVar) {
            this.f16914a = aVar;
        }

        public void a() {
            this.f16914a.k();
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
        public final f f16915a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f16916b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f16917c;

        /* renamed from: d  reason: collision with root package name */
        public int[] f16918d;

        /* renamed from: e  reason: collision with root package name */
        public Set<d> f16919e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16920f;

        /* renamed from: g  reason: collision with root package name */
        public int f16921g = -16711936;

        /* renamed from: h  reason: collision with root package name */
        public int f16922h = 0;

        public c(f fVar) {
            n3.h.h(fVar, "metadataLoader cannot be null.");
            this.f16915a = fVar;
        }

        public c a(d dVar) {
            n3.h.h(dVar, "initCallback cannot be null");
            if (this.f16919e == null) {
                this.f16919e = new s.b();
            }
            this.f16919e.add(dVar);
            return this;
        }

        public c b(boolean z10) {
            this.f16916b = z10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public void a(Throwable th2) {
        }

        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final List<d> f16923w;

        /* renamed from: x  reason: collision with root package name */
        public final Throwable f16924x;

        /* renamed from: y  reason: collision with root package name */
        public final int f16925y;

        public e(d dVar, int i10) {
            this(Arrays.asList((d) n3.h.h(dVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f16923w.size();
            int i10 = 0;
            if (this.f16925y != 1) {
                while (i10 < size) {
                    this.f16923w.get(i10).a(this.f16924x);
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                this.f16923w.get(i10).b();
                i10++;
            }
        }

        public e(Collection<d> collection, int i10) {
            this(collection, i10, null);
        }

        public e(Collection<d> collection, int i10, Throwable th2) {
            n3.h.h(collection, "initCallbacks cannot be null");
            this.f16923w = new ArrayList(collection);
            this.f16925y = i10;
            this.f16924x = th2;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(g gVar);
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public abstract void a(Throwable th2);

        public abstract void b(b4.g gVar);
    }

    /* loaded from: classes.dex */
    public static class h {
        public b4.d a(b4.b bVar) {
            return new b4.h(bVar);
        }
    }

    public a(c cVar) {
        this.f16905g = cVar.f16916b;
        this.f16906h = cVar.f16917c;
        this.f16907i = cVar.f16918d;
        this.f16908j = cVar.f16920f;
        this.f16909k = cVar.f16921g;
        this.f16904f = cVar.f16915a;
        this.f16910l = cVar.f16922h;
        s.b bVar = new s.b();
        this.f16900b = bVar;
        Set<d> set = cVar.f16919e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f16919e);
        }
        this.f16903e = Build.VERSION.SDK_INT < 19 ? new b(this) : new C0098a(this);
        i();
    }

    public static a a() {
        a aVar;
        synchronized (f16897m) {
            n3.h.i(f16898n != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            aVar = f16898n;
        }
        return aVar;
    }

    public static boolean d(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            return b4.c.c(inputConnection, editable, i10, i11, z10);
        }
        return false;
    }

    public static boolean e(Editable editable, int i10, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return b4.c.d(editable, i10, keyEvent);
        }
        return false;
    }

    public static a f(c cVar) {
        if (f16898n == null) {
            synchronized (f16897m) {
                if (f16898n == null) {
                    f16898n = new a(cVar);
                }
            }
        }
        return f16898n;
    }

    public int b() {
        return this.f16909k;
    }

    public int c() {
        this.f16899a.readLock().lock();
        try {
            return this.f16901c;
        } finally {
            this.f16899a.readLock().unlock();
        }
    }

    public boolean g() {
        return this.f16908j;
    }

    public final boolean h() {
        return c() == 1;
    }

    public final void i() {
        this.f16899a.writeLock().lock();
        try {
            if (this.f16910l == 0) {
                this.f16901c = 0;
            }
            this.f16899a.writeLock().unlock();
            if (c() == 0) {
                this.f16903e.a();
            }
        } catch (Throwable th2) {
            this.f16899a.writeLock().unlock();
            throw th2;
        }
    }

    public void j(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f16899a.writeLock().lock();
        try {
            this.f16901c = 2;
            arrayList.addAll(this.f16900b);
            this.f16900b.clear();
            this.f16899a.writeLock().unlock();
            this.f16902d.post(new e(arrayList, this.f16901c, th2));
        } catch (Throwable th3) {
            this.f16899a.writeLock().unlock();
            throw th3;
        }
    }

    public void k() {
        ArrayList arrayList = new ArrayList();
        this.f16899a.writeLock().lock();
        try {
            this.f16901c = 1;
            arrayList.addAll(this.f16900b);
            this.f16900b.clear();
            this.f16899a.writeLock().unlock();
            this.f16902d.post(new e(arrayList, this.f16901c));
        } catch (Throwable th2) {
            this.f16899a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence l(CharSequence charSequence) {
        return m(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence m(CharSequence charSequence, int i10, int i11) {
        return n(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence n(CharSequence charSequence, int i10, int i11, int i12) {
        return o(charSequence, i10, i11, i12, 0);
    }

    public CharSequence o(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        n3.h.i(h(), "Not initialized yet");
        n3.h.e(i10, "start cannot be negative");
        n3.h.e(i11, "end cannot be negative");
        n3.h.e(i12, "maxEmojiCount cannot be negative");
        n3.h.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return charSequence;
        }
        n3.h.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        n3.h.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f16905g : false;
        } else {
            z10 = true;
        }
        return this.f16903e.b(charSequence, i10, i11, i12, z10);
    }

    public void p(d dVar) {
        n3.h.h(dVar, "initCallback cannot be null");
        this.f16899a.writeLock().lock();
        try {
            int i10 = this.f16901c;
            if (i10 != 1 && i10 != 2) {
                this.f16900b.add(dVar);
            }
            this.f16902d.post(new e(dVar, i10));
        } finally {
            this.f16899a.writeLock().unlock();
        }
    }

    public void q(EditorInfo editorInfo) {
        if (!h() || editorInfo == null || editorInfo.extras == null) {
            return;
        }
        this.f16903e.c(editorInfo);
    }
}
