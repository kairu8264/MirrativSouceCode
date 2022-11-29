package ai;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class na<T> {

    /* renamed from: a  reason: collision with root package name */
    public final v9 f7239a;

    /* renamed from: b  reason: collision with root package name */
    public final ha f7240b;

    /* renamed from: c  reason: collision with root package name */
    public final la<T> f7241c;

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArraySet<ma<T>> f7242d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<Runnable> f7243e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<Runnable> f7244f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7245g;

    public na(Looper looper, v9 v9Var, la<T> laVar) {
        this(new CopyOnWriteArraySet(), looper, v9Var, laVar);
    }

    public final na<T> a(Looper looper, la<T> laVar) {
        return new na<>(this.f7242d, looper, this.f7239a, laVar);
    }

    public final void b(T t10) {
        if (this.f7245g) {
            return;
        }
        Objects.requireNonNull(t10);
        this.f7242d.add(new ma<>(t10));
    }

    public final void c(T t10) {
        Iterator<ma<T>> it = this.f7242d.iterator();
        while (it.hasNext()) {
            ma<T> next = it.next();
            if (next.f6840a.equals(t10)) {
                next.a(this.f7241c);
                this.f7242d.remove(next);
            }
        }
    }

    public final void d(final int i10, final ka<T> kaVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f7242d);
        this.f7244f.add(new Runnable(copyOnWriteArraySet, i10, kaVar) { // from class: ai.ja

            /* renamed from: w  reason: collision with root package name */
            public final CopyOnWriteArraySet f5670w;

            /* renamed from: x  reason: collision with root package name */
            public final int f5671x;

            /* renamed from: y  reason: collision with root package name */
            public final ka f5672y;

            {
                this.f5670w = copyOnWriteArraySet;
                this.f5671x = i10;
                this.f5672y = kaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = this.f5670w;
                int i11 = this.f5671x;
                ka kaVar2 = this.f5672y;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((ma) it.next()).b(i11, kaVar2);
                }
            }
        });
    }

    public final void e() {
        if (this.f7244f.isEmpty()) {
            return;
        }
        if (!this.f7240b.G(0)) {
            ha haVar = this.f7240b;
            haVar.e0(haVar.a(0));
        }
        boolean isEmpty = this.f7243e.isEmpty();
        this.f7243e.addAll(this.f7244f);
        this.f7244f.clear();
        if (!isEmpty) {
            return;
        }
        while (!this.f7243e.isEmpty()) {
            this.f7243e.peekFirst().run();
            this.f7243e.removeFirst();
        }
    }

    public final void f() {
        Iterator<ma<T>> it = this.f7242d.iterator();
        while (it.hasNext()) {
            it.next().a(this.f7241c);
        }
        this.f7242d.clear();
        this.f7245g = true;
    }

    public final /* bridge */ /* synthetic */ boolean g(Message message) {
        Iterator<ma<T>> it = this.f7242d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f7241c);
            if (this.f7240b.G(0)) {
                return true;
            }
        }
        return true;
    }

    public na(CopyOnWriteArraySet<ma<T>> copyOnWriteArraySet, Looper looper, v9 v9Var, la<T> laVar) {
        this.f7239a = v9Var;
        this.f7242d = copyOnWriteArraySet;
        this.f7241c = laVar;
        this.f7243e = new ArrayDeque<>();
        this.f7244f = new ArrayDeque<>();
        this.f7240b = v9Var.a(looper, new Handler.Callback(this) { // from class: ai.ia

            /* renamed from: w  reason: collision with root package name */
            public final na f5146w;

            {
                this.f5146w = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                this.f5146w.g(message);
                return true;
            }
        });
    }
}
