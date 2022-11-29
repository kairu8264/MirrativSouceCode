package androidx.recyclerview.widget;

import androidx.recyclerview.widget.j;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16051a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f16052b;

    /* renamed from: c  reason: collision with root package name */
    public final j.f<T> f16053c;

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: d  reason: collision with root package name */
        public static final Object f16054d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public static Executor f16055e;

        /* renamed from: a  reason: collision with root package name */
        public Executor f16056a;

        /* renamed from: b  reason: collision with root package name */
        public Executor f16057b;

        /* renamed from: c  reason: collision with root package name */
        public final j.f<T> f16058c;

        public a(j.f<T> fVar) {
            this.f16058c = fVar;
        }

        public c<T> a() {
            if (this.f16057b == null) {
                synchronized (f16054d) {
                    if (f16055e == null) {
                        f16055e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f16057b = f16055e;
            }
            return new c<>(this.f16056a, this.f16057b, this.f16058c);
        }
    }

    public c(Executor executor, Executor executor2, j.f<T> fVar) {
        this.f16051a = executor;
        this.f16052b = executor2;
        this.f16053c = fVar;
    }

    public Executor a() {
        return this.f16052b;
    }

    public j.f<T> b() {
        return this.f16053c;
    }

    public Executor c() {
        return this.f16051a;
    }
}
